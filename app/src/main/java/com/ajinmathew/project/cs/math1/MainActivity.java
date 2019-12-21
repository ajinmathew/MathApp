package com.ajinmathew.project.cs.math1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btnLargest,btnSmallest,btnOddEven;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        btnLargest=(Button)findViewById( R.id.largest );
        btnSmallest=(Button)findViewById( R.id.smallest );
        btnOddEven=(Button)findViewById( R.id.oddoreven );
        btnLargest.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent( getApplicationContext(),Largest.class ) );
            }
        } );
        btnSmallest.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent( getApplicationContext(),Smallest.class ) );
            }
        } );
        btnOddEven.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent( getApplicationContext(),OddorEven.class ) );
            }
        } );
    }
}
