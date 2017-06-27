package com.example.mureung.myapplication;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {   super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editID = (EditText)findViewById(R.id.edit_id);
        editID.setText("setTest");
        editID.setTextColor(0xFFFF0000);


        View.OnClickListener listener = new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                switch(v.getId()){
                    case R.id.button:
                        Log.e("312","222");
                        break;
                    }
            }
        };

        Button button=(Button)findViewById(R.id.button);
        button.setOnClickListener(listener);
    }

}
