package com.seong.studentapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Get Code Activity";

    // Declare Variables
    private Button btnGetCode;
    private EditText edtPhoneNumber;
    private String phoneNumber;

    // Declare FirebaseAuth
    private FirebaseAuth fAuth;

    // Event Listeners
    private View.OnClickListener getAuth = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            Log.i(TAG, "GetCode Button Clicked");

            sendCode(view);

            //
            Intent intent = new Intent(MainActivity.this, VerifyActivity.class);
            startActivity(intent);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Bind Variables
        btnGetCode = findViewById(R.id.btnGetAuth);
        edtPhoneNumber = findViewById(R.id.edtPhoneNumber);

        // Bind Event Listeners
        btnGetCode.setOnClickListener(getAuth);

        // Initialize the Firebase Auth instance
        fAuth = FirebaseAuth.getInstance();
    }

    @Override
    protected void onStart() {
        super.onStart();

        // Check currentUser
        FirebaseUser currentUser = fAuth.getCurrentUser();

        // If currentUser exist
        if(currentUser != null){
            // Send to Home Activity
        }
    }

    private void sendCode(View view){
        phoneNumber = edtPhoneNumber.getText().toString();
        
    }
}
