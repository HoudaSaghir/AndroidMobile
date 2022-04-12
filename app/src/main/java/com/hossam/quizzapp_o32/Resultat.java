package com.hossam.quizzapp_o32;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class Resultat extends Activity {
    Button bLogout, bTry;
    ProgressBar progressBar;
    TextView tvScore;
    int score;
    Button map;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultat);
        tvScore = (TextView) findViewById(R.id.tvScore);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        bLogout = (Button) findViewById(R.id.bLogout);
        bTry = (Button) findViewById(R.id.bTry);
        map = (Button) findViewById(R.id.map);
        Intent intent = getIntent();
        score = intent.getIntExtra("score", 0);
        progressBar.setProgress(100 * score / 5);
        tvScore.setText(100 * score / 5 + " %");
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Resultat.this, maps.class);
                startActivity(intent);
            }
        });
        //Toast.makeText(getApplicationContext(),score+"",Toast.LENGTH_SHORT).show();
        bLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Merci de votre Participation !", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
        bTry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Resultat.this, Quiz1.class));
            }
        });


    }}