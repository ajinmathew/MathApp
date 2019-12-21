package com.ajinmathew.project.cs.math1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Largest extends AppCompatActivity {
Button btnLargest;
EditText txtNum1,txtNum2,txtNum3,txtNum4;
float num1,num2,num3,res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_largest );
        btnLargest=(Button)findViewById( R.id.find );
        txtNum1=(EditText)findViewById( R.id.num1 );
        txtNum2=(EditText)findViewById( R.id.num2 );
        txtNum3=(EditText)findViewById( R.id.num3 );
        txtNum4=(EditText)findViewById( R.id.largest );

        btnLargest.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1=Float.parseFloat( txtNum1.getText().toString() );
                num2=Float.parseFloat( txtNum2.getText().toString() );
                num3=Float.parseFloat( txtNum3.getText().toString() );

                if((num1<num3)&&(num2<num3)){
                    res=num3;
                }else if((num1<num2)&&(num3<num2)){
                    res=num2;
                }else{
                    res=num1;
                }

                txtNum4.setText( String.valueOf( res ) );

            }
        } );
    }
}
