package com.example.hizb60_video_view.koraa.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.hizb60_video_view.R;


import java.util.ArrayList;

public class Kiraa_jamaaia_Activity extends AppCompatActivity {
    private VideoView videoView;
    private ListView listView;
    private MediaPlayer mediaPlayer;
    ArrayList<String> videolist;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.desplay_data);
        listView = findViewById(R.id.list_view);
        videoView =findViewById(R.id.list_video);
        releasemedia();
        videolist= new ArrayList<>();
        videolist.add("الحزب  الأول");
        videolist.add("الحزب الثاني");
        videolist.add("الحزب الثالث");
        videolist.add("الحزب الرابع");
        videolist.add("الحزب الخامس");
        videolist.add("الحزب السادس");
        videolist.add("الحزب السابع");
        videolist.add("الحزب الثامن");
        videolist.add("الحزب التاسع");
        videolist.add("الحزب العاشر");
        videolist.add("الحزب الحادي عشر");
        videolist.add("الحزب الثاني عشر");
        videolist.add("الحزب الثالث عشر");
        videolist.add("الحزب الرابع عشر");
        videolist.add("الحزب الخامس عشر");
        videolist.add("الحزب السادس عشر");
        videolist.add("الحزب السابع عشر");
        videolist.add("الحزب الثامن عشر");
        videolist.add("الحزب التاسع عشر");
        videolist.add("الحزب العشرون");
        videolist.add("الحزب الحادي وعشرون");
        videolist.add("الحزب الثاني وعشرون");
        videolist.add("الحزب الثالث وعشرون");
        videolist.add("الحزب الرابع وعشرون");
        videolist.add("الحزب الخامس وعشرون");
        videolist.add("الحزب السادس وعشرون");
        videolist.add("الحزب السابع وعشرون");
        videolist.add("الحزب الثامن وعشرون");
        videolist.add("الحزب التاسع وعشرون");
        videolist.add("الحزب الثلاثون");
        videolist.add("الحزب الحادي وثلاثون");
        videolist.add("الحزب الثاني والثلاثون");
        videolist.add("الحزب الثالث والثلاثون");
        videolist.add("الحزب الرابع والثلاثون");
        videolist.add("الحزب الخامس والثلاثون");
        videolist.add("الحزب السادس والثلاثون");
        videolist.add("الحزب السابع والثلاثون");
        videolist.add("الحزب الثامن والثلاثون");
        videolist.add("الحزب التاسع والثلاثون");
        videolist.add("الحزب الاربعين");
        videolist.add("الحزب الحادي واربعون");
        videolist.add("الحزب  الثاني واربعون");
        videolist.add("الحزب الثالث واربعون");
        videolist.add("الحزب الرابع واربعون");
        videolist.add("الحزب الخامس واربعون");
        videolist.add("الحزب السادس واربعون");
        videolist.add("الحزب السابع واربعون");
        videolist.add("الحزب الثامن واربعون");
        videolist.add("الحزب  التاسع واربعون");
        videolist.add("الحزب الخمسين");
        videolist.add("الحزب الحادي وخمسون");
        videolist.add("الحزب الثاني وخمسون");
        videolist.add("الحزب الثالث وخمسون");
        videolist.add("الحزب الرابع وخمسون");
        videolist.add("الحزب الخامس وخمسون");
        videolist.add("الحزب السادس وخمسون");
        videolist.add("الحزب السابع وخمسون");
        videolist.add("الحزب الثامن وخمسون");
        videolist.add("الحزب التاسع وخمسون");
        videolist.add("الحزب الستون");

        adapter =  new ArrayAdapter(this, android.R.layout.simple_list_item_1,videolist);
        listView.setAdapter(adapter);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long ID) {
                switch (position){
                    case 0:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 1:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 2:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 3:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 4:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case  5:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 6:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 7:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 8:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 9:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 10:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 11:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 12:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 13:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 14:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 15:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 16:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 17:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 18:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 19:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 20:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 21:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 22:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 23:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 24:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 25:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 26:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 27:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 28:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 29:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 30:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 31:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 32:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 33:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 34:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 35:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 36:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 37:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 38:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 39:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 40:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 41:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 42:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 43:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 44:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 45:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 46:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 47:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 48:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 49:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 50:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 51:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 52:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 53:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 54:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 55:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 56:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 57:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 58:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;
                    case 59:
                        videoView.setVideoPath("");
                        videoView.start();
                        break;

                }


                videoView.setMediaController(new MediaController(Kiraa_jamaaia_Activity.this));
                videoView.requestFocus();
                videoView.start();
            }
        });

    }

    private void releasemedia(){
        if(mediaPlayer != null){
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        videoView.pause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        videoView.start();
    }

    @Override
    protected void onStop() {
        super.onStop();
        releasemedia();
    }
}