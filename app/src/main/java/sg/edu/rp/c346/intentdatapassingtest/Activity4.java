package sg.edu.rp.c346.intentdatapassingtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity4 extends AppCompatActivity {
    TextView tvAnswer2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
        tvAnswer2 = findViewById(R.id.textView5);
        Intent intentReceived = getIntent();
        double value = intentReceived.getDoubleExtra("value", '.');
        tvAnswer2.setText("Double value received is: "+ value);


    }
}

