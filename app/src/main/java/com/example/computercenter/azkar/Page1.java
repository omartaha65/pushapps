package com.example.computercenter.azkar;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Page1 extends AppCompatActivity {
    Button btn_play,btn_play1,btn_play2,btn_pause,btn_pause1,btn_pause2,btn_zoomin,btn_zoomin1,btn_zoomin2,btn_zoomout,btn_zoomout1,btn_zoomout2;
    TextView txt,txt1,txt2;
    MediaPlayer mp1,mp2,mp3;
    int ss1=15;
    int ss2=15;
    int ss3=15;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);
        btn_play=(Button)findViewById(R.id.play);
        btn_play1=(Button)findViewById(R.id.play1);
        btn_play2=(Button)findViewById(R.id.play2);
        btn_pause=(Button)findViewById(R.id.pause);
        btn_pause1=(Button)findViewById(R.id.pause1);
        btn_pause2=(Button)findViewById(R.id.pause2);
        btn_zoomin=(Button)findViewById(R.id.zoom_in);
        btn_zoomin1=(Button)findViewById(R.id.zoom_in1);
        btn_zoomin2=(Button)findViewById(R.id.zoom_in2);
        btn_zoomout=(Button)findViewById(R.id.zoom_out);
        btn_zoomout1=(Button)findViewById(R.id.zoom_out1);
        btn_zoomout2=(Button)findViewById(R.id.zoom_out2);
        txt=(TextView)findViewById(R.id.text11);
        txt1=(TextView)findViewById(R.id.text22);
        txt2=(TextView)findViewById(R.id.text33);
        mp1=MediaPlayer.create(this,R.raw.athkar_09);
        mp2=MediaPlayer.create(this,R.raw.athkar_10);
        mp3=MediaPlayer.create(this,R.raw.athkar_23);



        btn_play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            mp1.start();
            }
        });
        btn_play1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            mp2.start();
            }
        });
        btn_play2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        mp3.start();
            }
        });
        btn_pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           mp1.pause();
            }
        });
        btn_pause1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp2.pause();
            }
        });
        btn_pause2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp3.pause();
            }
        });
        btn_zoomin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ss1<40){
                ss1++;
                }else{
                    Toast.makeText(Page1.this, "عفوا هذا اكبر حجم للنص ", Toast.LENGTH_SHORT).show();
                }txt.setTextSize(ss1);
            }
        });

        btn_zoomin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ss2<40){
                    ss2++;
                }else{
                    Toast.makeText(Page1.this, "عفوا هذا اكبر حجم للنص ", Toast.LENGTH_SHORT).show();
                }txt1.setTextSize(ss2);
            }
        });

        btn_zoomin2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ss3<40){
                    ss3++;
                }else{
                    Toast.makeText(Page1.this, "عفوا هذا اكبر حجم للنص ", Toast.LENGTH_SHORT).show();
                }txt2.setTextSize(ss3);
            }
        });
        btn_zoomout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ss1>10){
                    ss1--;
                }else{
                    Toast.makeText(Page1.this, "عفوا هذا اصغر حجم للنص ", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn_zoomout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ss2>10){
                    ss2--;
                }else{
                    Toast.makeText(Page1.this, "عفوا هذا اصغر حجم للنص ", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn_zoomout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ss3>10){
                    ss3--;
                }else{
                    Toast.makeText(Page1.this, "عفوا هذا اصغر حجم للنص ", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
