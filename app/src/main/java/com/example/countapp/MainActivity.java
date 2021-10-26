package com.example.countapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button incrementButton;
    private Button decrementButton;
    private Button Reset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUI();
        incrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String newTest=Integer.toString((Integer.parseInt(textView.getText().toString()))+1);
                textView.setText(newTest);

            }
        });
        decrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Integer.parseInt(textView.getText().toString() )!=0)
                {
                    String newTest = Integer.toString((Integer.parseInt(textView.getText().toString())) - 1);
                    textView.setText(newTest);
                }
            }
        });

    }
    public void resetTextView(View view){
        textView.setText("0");
    }
    private void setUI()
    {
        textView=findViewById(R.id.TextView);
        incrementButton=findViewById(R.id.increment);
        decrementButton=findViewById(R.id.decrement);
        Reset=findViewById(R.id.reset);
    }

}