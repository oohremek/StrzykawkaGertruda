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
        Log.i("info", "button clicked");
    }
    public void logInClicked(View view){

        EditText putEmailEditText = (EditText) findViewById(R.id.putEmailEditText);
        EditText putPasswordEditText = (EditText) findViewById(R.id.putPasswordEditText);

        Log.i("Username", putEmailEditText.getText().toString());
        Log.i("password", putPasswordEditText.getText().toString());

        Toast.makeText(MainActivity.this,"Zalogowano!",Toast.LENGTH_SHORT).show();
    }

    public void buttonInfo(View view){
        Log.i("info","button info");

        ImageView  imageViewStrzykawkaGertruda = (ImageView) findViewById(R.id.imageViewStrzykawkaGertruda);
        imageViewStrzykawkaGertruda.setImageResource(R.drawable.strzykawkagertrudasloneczko);

        /// jak zrobic zeby byla zmiana pomiedzy dwoma zdjeciami, (while?)
        if( imageViewStrzykawkaGertruda == (ImageView) findViewById(R.id.imageViewStrzykawkaGertruda))
        {
            imageViewStrzykawkaGertruda.setImageResource(R.drawable.strzykawkagertrudasloneczko);

        }
        else
        {
            imageViewStrzykawkaGertruda.setImageResource(R.drawable.strzykawkagertruda);
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


}
