package sg.edu.rp.c346.intentdatapassingtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Button btnPassInteger;
    Button buttonPassChar;
    TextView TvShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPassInteger = findViewById(R.id.buttonPassInteger);
        buttonPassChar=findViewById(R.id.buttonPassChar);
        TvShow=findViewById(R.id.textView4);
        //Event handling Step 3
        btnPassInteger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), secondActivity.class);

                intent.putExtra("value", 1);
                startActivity(intent);
            }
        });


        buttonPassChar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), ThirdActivity.class);

                intent.putExtra("value", 'a');
                startActivity(intent);
            }
        });

        TvShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), Activity4.class);

                intent.putExtra("value", 99.99);
                startActivity(intent);
            }
        });


    }
}


