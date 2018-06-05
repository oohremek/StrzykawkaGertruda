package marciniak.remigiusz.strzykawkagertruda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Visualize extends AppCompatActivity {
    Button buttonBackToMenu3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visualize);

        buttonBackToMenu3 = (Button)findViewById(R.id.buttonBackToMenu3);
        buttonBackToMenu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backToMenu3();
            }
        });
    }
    public void backToMenu3()
    {
        Intent intent = new Intent(this,Menu.class);
        startActivity(intent);
    }
}
