package marciniak.remigiusz.strzykawkagertruda;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import android.media.MediaPlayer;

public class MainActivity extends AppCompatActivity {

    //zasieg zmiennych globalny
    private MediaPlayer mPlayerPomoc;
    private MediaPlayer mPlayerCoTo;
    private ImageView imageViewStrzykawkaGertruda;
    private ImageView imageViewStrzykawkaGertrudaSloneczko;
    private EditText putEmailEditText;
    private EditText putPasswordEditText;
    private MediaPlayer mPlayerWitam;
    private Button buttonSettings;
    private Button buttonLogIn;



    public void buttonInfo(View view){
        Log.i("info","button info");

        mPlayerCoTo.start();





        imageViewStrzykawkaGertrudaSloneczko.animate().alpha(0f).setDuration(1000);
        imageViewStrzykawkaGertruda.animate().alpha(1f).setDuration(3000);


        /// jak zrobic zeby byla zmiana pomiedzy dwoma zdjeciami, (while?)
    }


    public void clickFunction(View view)
    {
        Log.i("info", "pomocy");

        mPlayerPomoc.start();



        imageViewStrzykawkaGertruda.animate().scaleX(0.75f).scaleY(0.75f).rotation(3600f).setDuration(1000);
        imageViewStrzykawkaGertrudaSloneczko.animate().scaleX(0.75f).scaleY(0.75f).rotation(3600f).setDuration(1000);

        //zmiana kata z jeden na drugi plynna


        //czemu nie ma tak plynego przejscia
//        for(int i = 0; i<10; i++){
//            Log.i("info", "petla start" + i);
//            imageViewStrzykawkaGertruda.animate().alpha(0f).setDuration(1000*i);
//            imageViewStrzykawkaGertrudaSloneczko.animate().alpha(1f).setDuration(3000*i);
//            imageViewStrzykawkaGertruda.animate().alpha(1f).setDuration(4000*i);
//            imageViewStrzykawkaGertrudaSloneczko.animate().alpha(0f).setDuration(7000*i);
//            Log.i("info", "petla koniec" + i);
//        }

    }
//    public void logInClicked(View view){
//        /// if else zeby przy zalogowaniu pokazywalo sie zalogowano
//        Log.i("Username", putEmailEditText.getText().toString());
//     //   Log.i("password", putPasswordEditText.getText().toString());
//        Toast.makeText(MainActivity.this,"Zalogowano!",Toast.LENGTH_SHORT).show();
//
//
//    }

    public void fade(View view) {
       Log.i("Strzykawka clicked", "strzykawka kliknieta" );

       imageViewStrzykawkaGertruda.animate().alpha(0f).setDuration(1000);
       imageViewStrzykawkaGertrudaSloneczko.animate().alpha(1f).setDuration(3000);

    }

//    public void fadeSloneczko(View view) {
//        Log.i("Strzykawka clicked", "strzykawka kliknieta" );

//
//        imageViewStrzykawkaGertrudaSloneczko.animate().alpha(0f).setDuration(1000);
//        imageViewStrzykawkaGertruda.animate().alpha(1f).setDuration(3000);
//
//    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inicjalizacja zmiennych


        mPlayerCoTo = MediaPlayer.create(this, R.raw.strzykawkacotojest);
        mPlayerPomoc = MediaPlayer.create(this, R.raw.strzykawkapomoc);

        imageViewStrzykawkaGertruda = (ImageView) findViewById(R.id.imageViewStrzykawkaGertruda);
        imageViewStrzykawkaGertrudaSloneczko = (ImageView) findViewById(R.id.imageViewStrzykawkaGertrudaSloneczko);

        putEmailEditText = (EditText) findViewById(R.id.putEmailEditText);
        putPasswordEditText = (EditText) findViewById(R.id.putPasswordEditText);

        mPlayerWitam = MediaPlayer.create(this, R.raw.strzykawkagertruda);

        //akcja
        mPlayerWitam.start();
        //

        buttonSettings = (Button) findViewById(R.id.buttonSettings);

        buttonSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivitySettings();
            }
        });

        buttonLogIn = (Button)findViewById(R.id.buttonLogin);

        buttonLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityMenu();
            }
        });
    }

    public void openActivitySettings(){

        Intent intent = new Intent(this,Settings.class);
        startActivity(intent);
    }

    public void openActivityMenu(){
        Log.i("Username", putEmailEditText.getText().toString());
        Toast.makeText(MainActivity.this,"Zalogowano!",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,Menu.class);
        startActivity(intent);

    }

}
