package marciniak.remigiusz.strzykawkagertruda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddResults extends AppCompatActivity {
    Button buttonBackToMenu1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_results);

        buttonBackToMenu1 = (Button)findViewById(R.id.buttonBackToMenu1);
        buttonBackToMenu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backToMenu1();
            }
        });
    }
    public void backToMenu1()
    {
        Intent intent = new Intent(this,Menu.class);
        startActivity(intent);
    }
}
