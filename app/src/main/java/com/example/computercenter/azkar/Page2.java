package com.example.computercenter.azkar;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Page2 extends AppCompatActivity {
    Button btn,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);
        btn=(Button)findViewById(R.id.btn);
        btn2=(Button)findViewById(R.id.btn_share);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String appPackgename=getPackageName();
                try{
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id="+appPackgename)));
                }
                catch (android.content.ActivityNotFoundException e){

                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/apps/details?id="+appPackgename)));

                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("text/plain");
                i.putExtra(Intent.EXTRA_SUBJECT,"تطبيق اذكار");
                i.putExtra(Intent.EXTRA_TEXT,"تطبيق اذكار متنوعه\n https://play.google.com/store?hl=en");
                startActivity(Intent.createChooser(i,"اختر التطبيق"));
            }
        });
    }
}
