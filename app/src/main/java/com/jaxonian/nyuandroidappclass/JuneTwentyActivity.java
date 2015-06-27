package com.jaxonian.nyuandroidappclass;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class JuneTwentyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_june_twenty);

        Button button = (Button)findViewById(R.id.button1);

               /*
        MyOnClickListener myOnClickListener = new MyOnClickListener();
        button.setOnClickListener(myOnClickListener);
        */

// INSTEAD OF CREATING A MyOnClickListener myOnClickListener
//  WE MAKE A  ViewOnClickListener

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button = (Button)v;	//downcast
                button.setText("The onClick Method has Context.");
                Toast.makeText(JuneTwentyActivity.this, "We Got Context.", Toast.LENGTH_LONG).show();
            }
        };

        button.setOnClickListener(onClickListener);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_june_twenty, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void juneTwenty(View view) {

        Intent intent = new Intent(this, JuneTwentyActivity.class);

        startActivity(intent);
    }
}
