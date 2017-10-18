package com.androidthinkx.thinkx2;

import android.app.Activity;
import android.os.Bundle;

import android.view.View;
import android.widget.EditText;

public class registerdata extends Activity {
    EditText ET_USER,ET_PASS;
    String user_name,user_pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        ET_USER= (EditText) findViewById(R.id.usernameq);
        ET_PASS = (EditText) findViewById(R.id.passwordq);
    }

    public void registerin(View view)
    {
        user_name = ET_USER.getText().toString();
        user_pass =ET_PASS.getText().toString();
        String method = "register";
        backgroundtask bgtask = new backgroundtask(this);
        bgtask.execute(method,user_name,user_pass);
        finish();
    }
}

