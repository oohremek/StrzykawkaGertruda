package marciniak.remigiusz.strzykawkagertruda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {
    Button buttonBackToMain;
    Button buttonAddResults;
    Button buttonLoadResults;
    Button buttonVisualize;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        buttonBackToMain = (Button) findViewById(R.id.buttonBackToMain);
        buttonBackToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });

        buttonAddResults = (Button) findViewById(R.id.buttonAddResults);
        buttonAddResults.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GoToAddResults();
            }
        });

        buttonLoadResults = (Button) findViewById(R.id.buttonLoadResults);
        buttonLoadResults.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GoToLoadResults();
            }
        });

        buttonVisualize = (Button) findViewById(R.id.buttonVisualize);
        buttonVisualize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GoToVisualize();
            }
        });
    }

    public void openMainActivity(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    public void GoToAddResults(){
        Intent intent = new Intent(this,AddResults.class);
        startActivity(intent);
    }
    public void GoToLoadResults(){
        Intent intent = new Intent(this,LoadResults.class);
        startActivity(intent);
    }
    public void GoToVisualize(){
        Intent intent = new Intent(this,Visualize.class);
        startActivity(intent);
    }
}
