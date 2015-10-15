package com.lenboxs.lenny.theebookfinder;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gotohome(View view) {

        Intent goHome = new Intent(this,HomeAct.class);
        final int result = 1;
        startActivity(goHome);
    }
}
