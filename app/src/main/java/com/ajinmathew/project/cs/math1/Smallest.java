package com.ajinmathew.project.cs.math1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Smallest extends AppCompatActivity {
Button btnSmallest;
EditText Smalltxt1,Smalltxt2,Smalltxt3;
TextView txtResult;
float n1,n2,n3,res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_smallest );
        btnSmallest=(Button)findViewById( R.id.smallestbtn );
        Smalltxt1=(EditText)findViewById( R.id.reltxtnum1 );
        Smalltxt2=(EditText)findViewById( R.id.reltxtnum2 );
        Smalltxt3=(EditText)findViewById( R.id.reltxtnum3 );
        txtResult=(TextView)findViewById( R.id.smallestnumberop );
        btnSmallest.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1=Float.parseFloat( Smalltxt1.getText().toString() );
                n2=Float.parseFloat( Smalltxt2.getText().toString() );
                n3=Float.parseFloat( Smalltxt3.getText().toString() );
                if((n1>n2)&&(n3>n2)){
                    res=n2;
                }else if((n2>n1)&&(n3>n1)){
                    res=n1;
                }else
                    res=n3;
                txtResult.setText( String.valueOf( res ) );
            }
        } );


    }
}
