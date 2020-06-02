package com.example.basicphrases2;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class MainActivity extends Activity implements OnClickListener {
    /**
     * Called when the activity is first created.
     */
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(this);
        findViewById(R.id.button2).setOnClickListener(this);
        findViewById(R.id.button3).setOnClickListener(this);
        findViewById(R.id.button4).setOnClickListener(this);
        findViewById(R.id.button5).setOnClickListener(this);
        findViewById(R.id.button6).setOnClickListener(this);
        findViewById(R.id.button7).setOnClickListener(this);
        findViewById(R.id.button8).setOnClickListener(this);
    }

    public void onClick(View v) {

        // TODO Auto-generated method stub
        int rawid = 0;
        switch (v.getId()) {
            case R.id.button:
                rawid = R.raw.doyouspeakenglish;
                break;
            case R.id.button2:
                rawid = R.raw.goodevening;
                break;
            case R.id.button3:
                rawid = R.raw.hello;
                break;
            case R.id.button4:
                rawid = R.raw.howareyou;
                break;
            case R.id.button5:
                rawid = R.raw.ilivein;
                break;
            case R.id.button6:
                rawid = R.raw.mynameis;
                break;
            case R.id.button7:
                rawid = R.raw.please;
                break;
            case R.id.button8:
                rawid = R.raw.welcome;
                break;

            default:return;    //do nothing if none of our buttons;
        }

        mp = MediaPlayer.create(this, rawid);
        mp.start();
        while (mp.isPlaying()) {
            // do nothing
        }
        ;
        mp.release();
    }
}
