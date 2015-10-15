package com.lenboxs.lenny.theebookfinder;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Leonard EN Botha 209075627 on 2015/09/04.
 */
public class BooksAct extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bookslayout);

        final int pos = 0;
        File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath());

        String[] fileNames = file.list();
        File[] files = file.listFiles();

        final List<String> pdfFiles = new ArrayList<>();
        final List<File> pdffiles2 = new ArrayList<>();
        if (fileNames == null)
        {
            setContentView(R.layout.nodata);
            final TextView textViewA = (TextView) findViewById(R.id.textView13);

        } else
            {


                        for (String fileName : fileNames) {

                            if (fileName.endsWith(".pdf"))
                                pdfFiles.add(fileName);

                        }
                for (File pfile : files) {

                    if (pfile.getName().endsWith(".pdf"))
                        pdffiles2.add(pfile);

                }

                        final ListAdapter pdfadapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,pdfFiles);
                        ListView listView = (ListView) findViewById(R.id.listView);
                        listView.setAdapter(pdfadapter);
                        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                            @Override
                            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                                String pdfpicked = "u picked " + String.valueOf(adapterView.getItemAtPosition(position));
                                Toast.makeText(BooksAct.this, pdfpicked, Toast.LENGTH_SHORT).show();

                                Intent sendfile = new Intent(BooksAct.this,BooksDisplayAct.class);
                                final int result = 1;
                                sendfile.putExtra("file", pdffiles2.get(position));

                                startActivity(sendfile);
                            }
                        });
            }
    }


    public void goback(View view) {
        Intent goback1 = new Intent(this,HomeAct.class);
        final int result = 1;
        startActivity(goback1);
        finish();
    }

    public void gobackhome(View view) {
        Intent goback1 = new Intent(this,HomeAct.class);
        final int result = 1;
        startActivity(goback1);
        finish();
    }
}
