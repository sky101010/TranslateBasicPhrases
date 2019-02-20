package com.example.lenore.basicphrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


//Challenge:  combine these 8 buttons into a single method rather than having a separate method for each button
//      then have a way to play whichever sound relates to the button that the user tapped on.
public class MainActivity extends AppCompatActivity {


    MediaPlayer phrase;

    public void playPhrase(View view){
        Button buttonPressed = (Button) view;


        phrase = MediaPlayer.create(this,
                getResources().getIdentifier(
                        buttonPressed.getTag().toString(),
                        "raw", getPackageName()));

        phrase.start();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
