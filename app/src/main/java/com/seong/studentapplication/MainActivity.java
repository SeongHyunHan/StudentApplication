package com.seong.studentapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnGetCode;
    private EditText edtPhoneNumber;

    private View.OnClickListener getAuth = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Log.i("Auth", "Button Clicked");
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        btnGetCode = new Button(this);
        edtPhoneNumber = findViewById(R.id.edtPhoneNumber);

        btnGetCode.setOnClickListener(getAuth);
        setContentView(R.layout.activity_main);
    }
}
