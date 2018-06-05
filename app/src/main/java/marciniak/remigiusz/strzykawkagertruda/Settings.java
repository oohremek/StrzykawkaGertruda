package marciniak.remigiusz.strzykawkagertruda;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.media.AudioManager;

import java.util.Timer;
import java.util.TimerTask;

import static marciniak.remigiusz.strzykawkagertruda.R.raw.strzykawkapomoc;

public class Settings extends AppCompatActivity {

    private Button buttonBack;
    SeekBar seekBarSound;
    SeekBar seekBarScrubber;
    AudioManager audioManager;
    Button buttonTestuj;
    MediaPlayer mplayerTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        mplayerTest = MediaPlayer.create(this, strzykawkapomoc);

        buttonTestuj = (Button)findViewById(R.id.buttonTest);

        audioManager = (AudioManager)getSystemService(Context.AUDIO_SERVICE);

        int maxVolume = audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        int currentVolume = audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);

        seekBarScrubber = (SeekBar) findViewById(R.id.seekBarScrubber);

        seekBarSound = (SeekBar)findViewById(R.id.seekBarSound);

        seekBarSound.setMax(maxVolume);
        seekBarSound.setProgress(currentVolume);

        seekBarScrubber.setMax(mplayerTest.getDuration());

        new Timer().scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                seekBarScrubber.setProgress(mplayerTest.getCurrentPosition());
            }
        },0,100);

        seekBarScrubber.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Log.i("SeekBarScrubber value", Integer.toString(progress));
                mplayerTest.seekTo(progress);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        seekBarSound.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {

            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Log.i("SeekBar value", Integer.toString(progress));

                audioManager.setStreamVolume(AudioManager.STREAM_MUSIC,progress,0);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        buttonTestuj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickButtonTest();
            }
        });

        buttonBack = (Button) findViewById(R.id.buttonBack);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });
    }

    public void openMainActivity(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }

    public void onClickButtonTest()
    {
        Log.i("infobuttonTest", "is working");
        mplayerTest.start();
    }
}
