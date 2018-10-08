package com.example.administrator.court;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView score_a;
    TextView score_b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        score_a=(TextView)findViewById(R.id.score_a);
        score_b=(TextView)findViewById(R.id.score_b);
    }
    public void onClick_3_point_a(View view){
        String str =score_a.getText().toString();
        int score= Integer.parseInt(str);
        score_a.setText(String.valueOf(score+3));
    }
    public void onClick_2_point_a(View view){
        String str =score_a.getText().toString();
        int score= Integer.parseInt(str);
        score_a.setText(String.valueOf(score+2));
    }
    public void onClick_3_point_b(View view){
        String str =score_b.getText().toString();
        int score= Integer.parseInt(str);
        score_b.setText(String.valueOf(score+3));
    }
    public void onClick_2_point_b(View view){
        String str =score_b.getText().toString();
        int score= Integer.parseInt(str);
        score_b.setText(String.valueOf(score+2));
    }
    public void onClick_reset(View view){
        String str =score_a.getText().toString();
        int score= Integer.parseInt(str);
        score_a.setText(String.valueOf(0));
        score_b.setText(String.valueOf(0));
    }
}