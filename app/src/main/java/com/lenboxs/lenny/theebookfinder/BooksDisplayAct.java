package com.lenboxs.lenny.theebookfinder;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.pdf.PdfRenderer;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.File;

/**
 * Created by Lenny on 2015-09-27.
 */
public class BooksDisplayAct extends Activity {

    private ImageView imageView2;
    private int currentPage = 0;
    private Button next, previous;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.booksdisplay);



        next = (Button) findViewById(R.id.next);
        previous = (Button) findViewById(R.id.previous);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentPage++;
                render();
            }
        });
        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                currentPage--;
                render();
            }
        });

        render();
    }



private void render(){

    Bundle getdata = getIntent().getExtras();
    File file = getdata.getParcelable("file");

    try{

        imageView2 = (ImageView) findViewById(R.id.image);
        int REQ_WIDTH = imageView2.getWidth();
        int REQ_HEIGHT = imageView2.getHeight();

        Bitmap bitmap = Bitmap.createBitmap(REQ_WIDTH, REQ_HEIGHT, Bitmap.Config.ARGB_4444);
        PdfRenderer renderer = new PdfRenderer(ParcelFileDescriptor.open(file, ParcelFileDescriptor.MODE_READ_ONLY));

        if(currentPage < 0){
            currentPage = 0;
        }else if(currentPage > renderer.getPageCount()){
            currentPage = renderer.getPageCount() - 1;
        }

        Matrix m = imageView2.getImageMatrix();
        Rect rect = new Rect(0,0,REQ_WIDTH,REQ_HEIGHT);
        renderer.openPage(currentPage).render(bitmap,rect,m,PdfRenderer.Page.RENDER_MODE_FOR_DISPLAY);
        imageView2.setImageMatrix(m);
        imageView2.setImageBitmap(bitmap);
        imageView2.invalidate();

    } catch (Exception e){
        e.printStackTrace();
    }

}
}