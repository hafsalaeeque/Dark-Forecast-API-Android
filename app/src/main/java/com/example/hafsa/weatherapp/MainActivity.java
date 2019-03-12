package com.example.hafsa.weatherapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {
        Intent i;
        switch(v.getId()){
            case R.id.new_york:
                Toast.makeText(MainActivity.this,"You clicked", Toast.LENGTH_LONG).show();
                i = new Intent(MainActivity.this, MainAction.class);
                i.putExtra("CityName","New York");
                startActivity(i);

                break;
            case R.id.london:
                Toast.makeText(MainActivity.this,"You clicked", Toast.LENGTH_LONG).show();
                i = new Intent(MainActivity.this, MainAction.class);
                i.putExtra("CityName","London");
                startActivity(i);
                break;
            case R.id.paris:
                Toast.makeText(MainActivity.this,"You clicked", Toast.LENGTH_LONG).show();
                i = new Intent(MainActivity.this, MainAction.class);
                i.putExtra("CityName","Paris");
                startActivity(i);
                break;
            case R.id.tokyo:
                Toast.makeText(MainActivity.this,"You clicked", Toast.LENGTH_LONG).show();
                i = new Intent(MainActivity.this, MainAction.class);
                i.putExtra("CityName","Tokyo");
                startActivity(i);
                break;
            case R.id.los_angeles:
                Toast.makeText(MainActivity.this,"You clicked", Toast.LENGTH_LONG).show();
                i = new Intent(MainActivity.this, MainAction.class);
                i.putExtra("CityName","Los Angeles");
                startActivity(i);
                break;

            default:
                break;
        }

    }



}
