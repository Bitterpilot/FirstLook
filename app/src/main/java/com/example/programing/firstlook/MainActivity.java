package com.example.programing.firstlook;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import widget
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //set a variable to make calling easier
    //   V  remember to prefer private calls
    private Button hiButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_layout);
        //identify object                  ID is in the top of the properties panel in the
        //                                 V     layout.xml
        hiButton = (Button) findViewById(R.id.hiButton);
        //alter object
        hiButton.setText("hello button"); // Bad Practice - if we were to use the same name else where we would have to remember to go there and change those as well
        hiButton.setTextColor(Color.BLUE);

    }
}
