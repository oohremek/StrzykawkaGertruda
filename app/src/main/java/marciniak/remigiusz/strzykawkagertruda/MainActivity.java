package marciniak.remigiusz.strzykawkagertruda;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view)
    {
        Log.i("info", "pomocy");
        ImageView imageViewStrzykawkaGertruda = (ImageView) findViewById(R.id.imageViewStrzykawkaGertruda);
        ImageView imageViewStrzykawkaGertrudaSloneczko = (ImageView) findViewById(R.id.imageViewStrzykawkaGertrudaSloneczko);

        imageViewStrzykawkaGertruda.animate().scaleX(0.75f).scaleY(0.75f).rotation(3600f).setDuration(1000);
        imageViewStrzykawkaGertrudaSloneczko.animate().scaleX(0.75f).scaleY(0.75f).rotation(3600f).setDuration(1000);

        //zmiana kata z jeden na drugi plynna
//        if(imageViewStrzykawkaGertruda.getRotation() == 180 || imageViewStrzykawkaGertrudaSloneczko.getRotation() == 180)
//        {
//            imageViewStrzykawkaGertruda.animate().rotation(-180f).setDuration(1000);
//            imageViewStrzykawkaGertrudaSloneczko.animate().rotation(-180f).setDuration(1000);
//            Log.i("info", "pomocy1");
//        }
//        else{
//            imageViewStrzykawkaGertruda.animate().rotation(3600f).setDuration(1000);
//            imageViewStrzykawkaGertrudaSloneczko.animate().rotation(3600f).setDuration(1000);
//            Log.i("info", "pomocy2");
//        }
//
//        imageViewStrzykawkaGertruda.animate().rotation(180f).setDuration(1000);
//        imageViewStrzykawkaGertrudaSloneczko.animate().rotation(180f).setDuration(1000);


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
    public void logInClicked(View view){

        EditText putEmailEditText = (EditText) findViewById(R.id.putEmailEditText);
        EditText putPasswordEditText = (EditText) findViewById(R.id.putPasswordEditText);

        /// if else zeby przy zalogowaniu pokazywalo sie zalogowano
        Log.i("Username", putEmailEditText.getText().toString());
     //   Log.i("password", putPasswordEditText.getText().toString());

        Toast.makeText(MainActivity.this,"Zalogowano!",Toast.LENGTH_SHORT).show();
    }

    public void fade(View view) {
       Log.i("Strzykawka clicked", "strzykawka kliknieta" );
       ImageView imageViewStrzykawkaGertruda = (ImageView) findViewById(R.id.imageViewStrzykawkaGertruda);
       ImageView imageViewStrzykawkaGertrudaSloneczko = (ImageView) findViewById(R.id.imageViewStrzykawkaGertrudaSloneczko);
       imageViewStrzykawkaGertruda.animate().alpha(0f).setDuration(1000);
       imageViewStrzykawkaGertrudaSloneczko.animate().alpha(1f).setDuration(3000);



    }

//    public void fadeSloneczko(View view) {
//        Log.i("Strzykawka clicked", "strzykawka kliknieta" );
//        ImageView imageViewStrzykawkaGertruda = (ImageView) findViewById(R.id.imageViewStrzykawkaGertruda);
//        ImageView imageViewStrzykawkaGertrudaSloneczko = (ImageView) findViewById(R.id.imageViewStrzykawkaGertrudaSloneczko);
//
//        imageViewStrzykawkaGertrudaSloneczko.animate().alpha(0f).setDuration(1000);
//        imageViewStrzykawkaGertruda.animate().alpha(1f).setDuration(3000);
//
//    }

    public void buttonInfo(View view){
        Log.i("info","button info");

        ImageView imageViewStrzykawkaGertruda = (ImageView) findViewById(R.id.imageViewStrzykawkaGertruda);
        ImageView imageViewStrzykawkaGertrudaSloneczko = (ImageView) findViewById(R.id.imageViewStrzykawkaGertrudaSloneczko);
        imageViewStrzykawkaGertrudaSloneczko.animate().alpha(0f).setDuration(1000);
        imageViewStrzykawkaGertruda.animate().alpha(1f).setDuration(3000);

        /// jak zrobic zeby byla zmiana pomiedzy dwoma zdjeciami, (while?)
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageViewStrzykawkaGertrudaSloneczko = (ImageView) findViewById(R.id.imageViewStrzykawkaGertrudaSloneczko);


    }


}
