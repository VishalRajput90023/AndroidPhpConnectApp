package com.androidthinkx.thinkx2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText ET_NAME,ET_PASS;
    String login_name,login_pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ET_NAME = (EditText) findViewById(R.id.username);
        ET_PASS = (EditText) findViewById(R.id.password);
    }
    public void registered(View view)
    {
        startActivity(new Intent(this,registerdata.class));
    }

    public void loggedin(View view)
    {
        login_name = ET_NAME.getText().toString();
        login_pass = ET_PASS.getText().toString();
        String method = "login";
        backgroundtask bgtask = new backgroundtask(this);
        bgtask.execute(method,login_name,login_pass);
        backgroundtask task = new backgroundtask(this);

    }

}
