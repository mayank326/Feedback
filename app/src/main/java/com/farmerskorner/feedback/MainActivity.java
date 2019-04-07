package com.farmerskorner.feedback;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RatingBar ratingBar;
    float Value;
    TextView ratedValue;
    EditText feedbackMessage;
    String Message;
    Button submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratingBar=findViewById(R.id.ratingBar);
        ratedValue=findViewById(R.id.rateValue);
        feedbackMessage=findViewById(R.id.feedbackMessage);
        submit=findViewById(R.id.submit);


        Message=feedbackMessage.getText().toString();

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                Value=ratingBar.getRating();
                ratedValue.setText(String.valueOf(Value));
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i1=new Intent(MainActivity.this,knowCandidate.class);
                startActivity(i1);
            }
        });



    }
}
