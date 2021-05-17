package com.example.beautyzone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        private String userName = "user@123";
        private String password = "pass123";
        private int attemptLeft = 5;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                    super.onCreate(savedInstanceState);
                    setContentView(R.layout.activity_main);

                    Button btnLogin = findViewById(R.id.btn_login);
                    Button btnCancel = findViewById(R.id.btn_cancel);
                    TextView txtResult = findViewById(R.id.text_result);
            final EditText editUser = findViewById(R.id.edit_user_name);
            final EditText editPswd = findViewById(R.id.edit_pswd);

                    btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    String enterUserName = editUser.getText().toString();
                    String enterPassword = editPswd.getText().toString();

                    if(attemptLeft > 0){

                    if(enterUserName.equals(userName) && enterPassword.equals(password)){
                    txtResult.setText("Login Successful");
                    }else {
                    txtResult.setText("Login Error - Attempt Left : " + attemptLeft);
                    attemptLeft = attemptLeft - 1;
                    }
                    }
                    else{
                    txtResult.setText("Try again later");
                    }



        }
        });
    }
}