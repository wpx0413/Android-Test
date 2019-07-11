package com.example.binarycnversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText ed1=findViewById(R.id.ed1);
        final EditText ed2=findViewById(R.id.ed2);
        Button bt1=findViewById(R.id.bt1);
        bt1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String input=ed1.getText().toString();
                int i=Integer.parseInt(input);
                String result = Integer.toBinaryString(i);
                ed2.setText(result);
            }
        });
    }
}
