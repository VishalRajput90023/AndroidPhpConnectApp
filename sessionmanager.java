package com.androidthinkx.thinkx2;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import java.util.HashMap;


public class sessionmanager extends MainActivity {
    Context _context;

   String login = login_name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_session);
        Intent intent = new Intent(getApplicationContext(), useractivity.class);
        startActivity(intent);

    }

    public sessionmanager(Context context){
        this._context = context;
        SharedPreferences pref = context.getSharedPreferences("Mypref", 0);
        SharedPreferences.Editor editor = pref.edit();
        editor.putString("username",login);
        editor.commit();
    }
    public String getUserDetails(){
        SharedPreferences pref = _context.getSharedPreferences("Mypref", 0);
        HashMap<String,String> user = new HashMap<String, String>();
        String s = user.put(login, pref.getString("username",login_name));
        return s;
    }

}
