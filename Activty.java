package com.example.calculitor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Button add =findViewById(R.id.add);
        Button sub =findViewById(R.id.sub);
        TextView tv3 =findViewById(R.id.textView3);
        Intent intent = getIntent();
        final int n1 = intent.getIntExtra("num1",0);
        final int n2 = intent.getIntExtra("num2",0);
        tv3.setText(n1+","+n2);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int res = n1+n2;
                Intent result =new Intent();
                result.putExtra("res",res);
                setResult(RESULT_OK,result);
                finish();
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = intent.getIntExtra("num1",0);
                int n2 = intent.getIntExtra("num2",0);
                int res = n1-n2;
                Intent result =new Intent();
                result.putExtra("res",res);
                setResult(RESULT_OK,result);
                finish();
            }
        });

    }
}
