package com.hossam.quizzapp_o32;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    //Set 1 : Declaration
    EditText etLogin, etPassword;
    Button etButton ,bCam;
    TextView etRegister;
    private FirebaseAuth fAuth;
    ImageView image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Set 2 : Recuperation des Id
        etLogin = (EditText) findViewById(R.id.etLogin);
        etPassword = (EditText) findViewById(R.id.etPassword);
        etButton = (Button) findViewById(R.id.etButton);
        etRegister = (TextView) findViewById(R.id.etRegister);
       bCam = (Button) findViewById(R.id.bcamera);
        image = (ImageView) findViewById(R.id.img);

        //Set 3 : Association des listeners
      etButton.setOnClickListener(new View.OnClickListener() {
          @Override
         public void onClick(View view) {
              startActivity(new Intent(MainActivity.this,Quiz1.class));
          }
      });






        etRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Set 4 : Treatment
                startActivity(new Intent(MainActivity.this,RegisterActivity.class));
            }
        });



        bCam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, 0);
            }
        });


    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);
        Bitmap btmp = (Bitmap) data.getExtras().get("data");
        image.setImageBitmap(btmp);
    }

    }
