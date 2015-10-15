package com.lenboxs.lenny.theebookfinder;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Leonard EN Botha 209075627 on 2015/09/04.
 */
public class LinksAct extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linkslayout);
    }

    public void goback(View view) {
        Intent goback1 = new Intent(this,HomeAct.class);
        final int result = 1;
        startActivity(goback1);
        finish();
    }

    public void gotofreebookspot(View view) {

        TextView textView2 =(TextView)findViewById(R.id.textView2);
        textView2.setClickable(true);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        String text = "<a href='http://www.freebookspot.es/'> FreeBookSpot </a>";
        textView2.setText(Html.fromHtml(text));
    }

    public void gotofreeebooks(View view) {
        TextView textView3 =(TextView)findViewById(R.id.textView3);
        textView3.setClickable(true);
        textView3.setMovementMethod(LinkMovementMethod.getInstance());
        String text = "<a href='http://www.free-ebooks.net/'> Free-eBooks </a>";
        textView3.setText(Html.fromHtml(text));
    }

    public void gotomanybooks(View view) {

        TextView textView4 =(TextView)findViewById(R.id.textView4);
        textView4.setClickable(true);
        textView4.setMovementMethod(LinkMovementMethod.getInstance());
        String text = "<a href='http://manybooks.net/'> ManyBooks </a>";
        textView4.setText(Html.fromHtml(text));
    }

    public void gotogetfreebooks(View view) {

        TextView textView5 =(TextView)findViewById(R.id.textView5);
        textView5.setClickable(true);
        textView5.setMovementMethod(LinkMovementMethod.getInstance());
        String text = "<a href=' http://www.getfreeebooks.com/'> GetFreeBooks </a>";
        textView5.setText(Html.fromHtml(text));
    }

    public void gotofreecomputerbooks(View view) {

        TextView textView6 =(TextView)findViewById(R.id.textView6);
        textView6.setClickable(true);
        textView6.setMovementMethod(LinkMovementMethod.getInstance());
        String text = "<a href='http://freecomputerbooks.com/'> FreeComputerBooks </a>";
        textView6.setText(Html.fromHtml(text));
    }

    public void gotofreetechbooks(View view) {

        TextView textView7 =(TextView)findViewById(R.id.textView7);
        textView7.setClickable(true);
        textView7.setMovementMethod(LinkMovementMethod.getInstance());
        String text = "<a href='http://www.freetechbooks.com/'> FreeTechBooks </a>";
        textView7.setText(Html.fromHtml(text));
    }

    public void gotogoogleplaybooks(View view) {

        TextView textView8 =(TextView)findViewById(R.id.textView8);
        textView8.setClickable(true);
        textView8.setMovementMethod(LinkMovementMethod.getInstance());
        String text = "<a href='https://play.google.com/store/books'> Google Play Books  </a>";
        textView8.setText(Html.fromHtml(text));
    }

    public void gotoeCampus(View view) {

        TextView textView9 =(TextView)findViewById(R.id.textView9);
        textView9.setClickable(true);
        textView9.setMovementMethod(LinkMovementMethod.getInstance());
        String text = "<a href='http://www.ecampus.com/'> eCampus </a>";
        textView9.setText(Html.fromHtml(text));
    }

    public void gotoglobusz(View view) {

        TextView textView10 =(TextView)findViewById(R.id.textView10);
        textView10.setClickable(true);
        textView10.setMovementMethod(LinkMovementMethod.getInstance());
        String text = "<a href='http://ww38.globusz.com/'> Globusz  </a>";
        textView10.setText(Html.fromHtml(text));
    }

    public void gotoscribd(View view) {

        TextView textView11 =(TextView)findViewById(R.id.textView11);
        textView11.setClickable(true);
        textView11.setMovementMethod(LinkMovementMethod.getInstance());
        String text = "<a href='https://www.scribd.com/'> Scribd</a>";
        textView11.setText(Html.fromHtml(text));
    }
}
