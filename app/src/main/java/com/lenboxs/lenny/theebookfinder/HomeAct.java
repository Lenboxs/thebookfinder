package com.lenboxs.lenny.theebookfinder;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Leonard EN Botha 209075627 on 2015/09/04.
 */
public class HomeAct extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.homelayout);

    }

    public void goToBooks(View view) {
        Intent goBooks = new Intent(this, BooksAct.class);

        startActivity(goBooks);
    }

    public void gotTolinks(View view) {
        Intent goLinks = new Intent(this,LinksAct.class);

        startActivity(goLinks);
    }

    public void gotoTaCs(View view) {
        Intent goTandC = new Intent(this,TermsAndConditions.class);

        startActivity(goTandC);
    }

    public void exit(View view) {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        finish();

    }
}
