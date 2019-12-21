package com.ajinmathew.project.cs.math1;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class OddorEven extends AppCompatActivity {
Button btnOddEven;
TextView txtRes;
EditText edNum;
int num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_oddor_even );
        btnOddEven=(Button)findViewById( R.id.oddeven );
        txtRes=(TextView)findViewById( R.id.output );
        edNum=(EditText)findViewById( R.id.number );
        btnOddEven.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num=Integer.parseInt( edNum.getText().toString() );
                if(num%2==0){

                    txtRes.setText( "Even Number" );
                }else {

                    txtRes.setText( "Odd Number" );
                }
            }
        } );
    }
}
