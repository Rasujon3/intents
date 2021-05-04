package com.sujon.intents;

import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    TextView myTextView;
    String first_string;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        myTextView = findViewById(R.id.first_text_view);
        first_string = getIntent().getStringExtra("MY_STRING_FIRST");
        myTextView.setText(first_string);
    }
}