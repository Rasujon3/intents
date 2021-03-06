package com.sujon.intents;

import android.content.Intent;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public String intentVariableName = "MY_STRING_FIRST";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onMyButtonClick(View view){
//        Toast.makeText(this,"Button click",Toast.LENGTH_SHORT).show();
//        Intent intent = new Intent(MainActivity.this,MainActivity2.class);
//        intent.putExtra(intentVariableName,"WELCOME_TO_SECOND_ACTIVITY");
//        startActivity(intent);
        Intent myBroadcastIntent = new Intent();
        myBroadcastIntent.setAction("com.sujon.intents.same");
        myBroadcastIntent.setFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
        sendBroadcast(myBroadcastIntent);
    }

}