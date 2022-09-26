package com.example.calculitor;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.time.Instant;

public class MainActivity extends AppCompatActivity {
EditText e1,e2;
TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1=findViewById(R.id.tv1);
        e1 = findViewById(R.id.num1);
        e2 = findViewById(R.id.num2);
        Button btn = findViewById(R.id.btn1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e1.getText().toString().equals("")||e2.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Please insert numbers", Toast.LENGTH_SHORT).show();
                }else {
                    Intent instant = new Intent(MainActivity.this,Activity_2.class);
                    int n1= Integer.parseInt(e1.getText().toString());
                    int n2= Integer.parseInt(e2.getText().toString());
                    instant.putExtra("num1",n1);
                    instant.putExtra("num2",n2);
                    startActivityForResult(instant,1);
                }
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==1){
            if(resultCode==RESULT_OK){
                int result1 =data.getIntExtra("result",0);
                tv1.setText(""+result1);
            }else{

            }
        }


    }
}
