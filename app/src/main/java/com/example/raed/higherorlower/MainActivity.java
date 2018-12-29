package com.example.raed.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
        int randNumber ;

    public void  makeToadt (String string) {
        Toast.makeText(MainActivity.this, string , Toast.LENGTH_SHORT).show();
    }
    public void guess (View view) {
        EditText guessEditText = (EditText) findViewById(R.id.etxt1);

        int guessNumber = Integer.parseInt(guessEditText.getText().toString());
        if (guessNumber > randNumber) {
            makeToadt("Lower !");
        } else if (guessNumber < randNumber) {
            makeToadt("Higher !");
        } else {
            makeToadt("That's Right ! , Try Again");
            Random rand = new Random();
            randNumber = rand.nextInt(20) + 1 ;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand = new Random();
        randNumber = rand.nextInt(20) + 1;
    }
}
