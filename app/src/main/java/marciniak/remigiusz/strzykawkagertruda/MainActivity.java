package marciniak.remigiusz.strzykawkagertruda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonLogin = (Button)findViewById(R.id.buttonLogin);
        buttonLogin.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {
            }
        });


    }

    public void buttonSettingsClickHandler(View view) {

    }


    class buttonLoginClass implements View.OnClickListener
    {

        @Override
        public void onClick(View v) {

        }
    }
}
