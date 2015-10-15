package com.lenboxs.lenny.theebookfinder;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Leonard EN Botha 209075627 on 2015/09/04.
 */
public class TermsAndConditions extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.termsandconditionslayout);
    }

    public void goback(View view) {

        Intent goback1 = new Intent(this,HomeAct.class);
        final int result = 1;
        startActivity(goback1);
        finish();
    }
}
