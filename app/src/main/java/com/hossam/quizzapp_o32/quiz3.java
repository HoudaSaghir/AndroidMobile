package com.hossam.quizzapp_o32;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class quiz3 extends AppCompatActivity {

    RadioGroup Radiogroup;
    RadioButton btnext,btnnext;
    Button suiv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz3);

        Radiogroup = (RadioGroup) findViewById(R.id.Radiogroup);
        btnext = (RadioButton)findViewById(R.id.btnext);
        btnnext = (RadioButton) findViewById(R.id.btnnext);
        suiv = (Button) findViewById(R.id.suiv);

        suiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(quiz3.this,quiz4.class));
            }
    });
    }
}