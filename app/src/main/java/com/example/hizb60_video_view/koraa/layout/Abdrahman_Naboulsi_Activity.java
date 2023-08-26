package com.example.hizb60_video_view.koraa.layout;

import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import com.example.hizb60_video_view.R;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

import java.io.IOException;
import java.util.ArrayList;

public class Abdrahman_Naboulsi_Activity extends AppCompatActivity {
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
     videoView = findViewById(R.id.list_video);
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



adapter =  new ArrayAdapter(this, android.R.layout.simple_list_item_1,videolist);
listView.setAdapter(adapter);

listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long ID)  {
        switch (position){
            case 0:

                videoView.setVideoPath("https://scontent.fcmn5-1.fna.fbcdn.net/v/t42.1790-2/10000000_697810824755686_6068125651121498628_n.mp4?_nc_cat=110&ccb=1-7&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_ohc=p9hA7jzhMTIAX_0eCqR&_nc_rml=0&_nc_ht=scontent.fcmn5-1.fna&oh=00_AfCDKwn6otO2B367Sfl9kSPggN4ZIaaR-KaUw7qU25Hekw&oe=64E8D65A");
                videoView.start();
                break;
            case 1:
                videoView.setVideoPath("https://scontent.fcmn5-2.fna.fbcdn.net/v/t42.1790-2/10000000_123214350321307_3199937243933019211_n.mp4?_nc_cat=108&ccb=1-7&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_ohc=nHzr_hTcWpQAX9JKcZj&_nc_oc=AQlva0Mccebs7gMnUvGfF8oW4rRiFFkEMIyPhJdMXiD34y75H-VSiiZqbDlXDWSoUUY&_nc_rml=0&_nc_ht=scontent.fcmn5-2.fna&oh=00_AfAfrERN1snzdeuuCBrZYaEZpod_XMSL3iHW4hKxL86OqA&oe=64E99368");
                videoView.start();
                break;
            case 2:
                videoView.setVideoPath("https://video.fcmn1-1.fna.fbcdn.net/v/t42.1790-2/10000000_1084556692281699_376571346242911654_n.mp4?_nc_cat=101&ccb=1-5&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeHtgQqGkgKkr2R2gcq9awSqsGVexQ-oDM-wZV7FD6gMz1kJE3pyC1fTZ0RflbuAnjotIt5GFHjjwMlVeX__xknx&_nc_ohc=ko1EUBRiBgQAX-vfpH0&_nc_rml=0&_nc_ht=video.fcmn1-1.fna&oh=00_AT8ShesW0ovXbww2LWhLpgAZOV_wSe5hw_vNeYBq1lzC9w&oe=6267F6D9");
                videoView.start();
                break;
            case 3:
                videoView.setVideoPath("https://scontent.fcmn5-2.fna.fbcdn.net/v/t42.1790-2/10000000_727370801731190_6772211788475810934_n.mp4?_nc_cat=101&ccb=1-7&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_ohc=YUeJd5dwctgAX-SQHNi&_nc_rml=0&_nc_ht=scontent.fcmn5-2.fna&oh=00_AfCzVb-jpbOdfeDSm_G-FNazBDDVgz1fp_eSPw9OyyGqHA&oe=64EA4533");
                videoView.start();
                break;
            case 4:
                videoView.setVideoPath("https://scontent.fcmn5-1.fna.fbcdn.net/v/t42.1790-2/10000000_174322338275166_4062898458727356669_n.mp4?_nc_cat=105&ccb=1-7&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_ohc=6lX7M7rGA3MAX_x0C0r&_nc_rml=0&_nc_ht=scontent.fcmn5-1.fna&oh=00_AfAxQ5XixM3b0SsJoC4ITMzr6q_AZ20p0dNxyimphmD30Q&oe=64E98321");
                videoView.start();
                break;
            case  5:
                videoView.setVideoPath("https://scontent.fcmn5-1.fna.fbcdn.net/v/t42.1790-2/10000000_721491878876602_104233525280957764_n.mp4?_nc_cat=109&ccb=1-7&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_ohc=qPtGK9-rij0AX-qAflg&_nc_rml=0&_nc_ht=scontent.fcmn5-1.fna&oh=00_AfCZGRlhg7DH2MdYNZbgLDzOSudS-OWw1YJTtZCPJ3bPng&oe=64E939D1");
                videoView.start();
                break;
            case 6:
                videoView.setVideoPath("https://scontent.fcmn5-1.fna.fbcdn.net/v/t42.1790-2/10000000_5530719180293486_7124297263564269020_n.mp4?_nc_cat=109&ccb=1-7&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_ohc=Ewycb0LHpkoAX-1O2JC&_nc_rml=0&_nc_ht=scontent.fcmn5-1.fna&oh=00_AfDwRzIVb5jdA8fkPBU4eg4XtWsuyFsF8fl6GfjU1GuoLg&oe=64EA352B");
                videoView.start();
                break;
            case 7:
                videoView.setVideoPath("https://scontent.fcmn5-2.fna.fbcdn.net/v/t42.1790-2/10000000_1416413385454268_6672909561431467404_n.mp4?_nc_cat=107&ccb=1-7&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_ohc=swnKpT_i57sAX8xJB6I&_nc_rml=0&_nc_ht=scontent.fcmn5-2.fna&oh=00_AfB7OK5Xt-M0JHDxduBnEsujtzEl78pEecK_wnHYGm2Pdw&oe=64E97095");
                videoView.start();
                break;
            case 8:
                videoView.setVideoPath("https://scontent.fcmn5-1.fna.fbcdn.net/v/t42.1790-2/10000000_2599587800176075_6214738508770470201_n.mp4?_nc_cat=110&ccb=1-7&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_ohc=ptyQuSuRF54AX-3rWN0&_nc_rml=0&_nc_ht=scontent.fcmn5-1.fna&oh=00_AfBkRuXpW7U9xMX9goCzsOeS7R_r4UF-mKTD-dSTzXiJzQ&oe=64EA9222");
                videoView.start();
                break;
            case 9:
                videoView.setVideoPath("https://scontent.fcmn5-1.fna.fbcdn.net/v/t42.1790-2/10000000_987391831916436_349082026379950307_n.mp4?_nc_cat=111&ccb=1-7&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_ohc=EG62-PEYsBcAX_SVwLu&_nc_rml=0&_nc_ht=scontent.fcmn5-1.fna&oh=00_AfBUwhkYsv2DJ7BjPt0UYpmCPFA4oNcBpwESzB65uHE69A&oe=64EA0E4F");
                videoView.start();
                break;
            case 10:
                videoView.setVideoPath("https://scontent.fcmn5-1.fna.fbcdn.net/v/t42.1790-2/10000000_1352867315195541_8226889280948505157_n.mp4?_nc_cat=111&ccb=1-7&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_ohc=_Hd9AkwPa9AAX-ESIMG&tn=MIJHvljkGZpQzQvF&_nc_rml=0&_nc_ht=scontent.fcmn5-1.fna&oh=00_AfBCZpUinGjAYaHMGPZ9z6S5z664cZeu8jm3m53X7Q-oww&oe=64E90356");
                videoView.start();
                break;
            case 11:
                videoView.setVideoPath("https://scontent.fcmn5-1.fna.fbcdn.net/v/t42.1790-2/10000000_387782772456938_4463660871511342731_n.mp4?_nc_cat=111&ccb=1-7&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeGqMFvdcmusyykFpRlSn8a9-7IpZmFcKYD7silmYVwpgK91Rkkr37xzugYW3ARF-Pq4NY3Q21GdvC2kaQdataWb&_nc_ohc=Rb42JJ-MSXcAX_2bX6p&_nc_rml=0&_nc_ht=scontent.fcmn5-1.fna&oh=00_AfBW0mKuXVuZxcI3Cfc9KU71kKnp_d9WacFnV0XWRLse4w&oe=64EBB70A");
                videoView.start();
                break;
            case 12:
                videoView.setVideoPath("https://scontent.fcmn5-2.fna.fbcdn.net/v/t42.1790-2/10000000_1450032275336975_1782960958382349993_n.mp4?_nc_cat=104&ccb=1-7&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeEIxP8eo3qGMzceqzPFLu0OD4-G2u13JWcPj4ba7XclZ1znKukXByFoZ65-ryKoLmYb7pv7Uo_IohRYmCIyCCpw&_nc_ohc=jpLnc2NnUGwAX-PnLOQ&_nc_rml=0&_nc_ht=scontent.fcmn5-2.fna&oh=00_AfCYgGitnFTLqS9dnV6_C8SdGEZQ2Uw87mRThtYr1o2VRQ&oe=64EC2B32");
                videoView.start();
                break;
            case 13:
                videoView.setVideoPath("https://scontent.fcmn5-1.fna.fbcdn.net/v/t42.1790-2/10000000_331395938652729_6233060762346319155_n.mp4?_nc_cat=106&ccb=1-7&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeEGM5S4T-1BFXCPW0l2V4GzJWrf-hEgqIUlat_6ESCohTbQmFhNKScTEBB_m3xZhL64V6CVUYLJ8k8qG5wZStF_&_nc_ohc=txRjOffck0QAX-Gp8g5&_nc_rml=0&_nc_ht=scontent.fcmn5-1.fna&oh=00_AfC2UkVaXJPDUyXIUoVS-JzmHWfD86awyPokNwOgyeDm-w&oe=64EC8C8F");
                videoView.start();
                break;
            case 14:
                videoView.setVideoPath("https://scontent.fcmn5-1.fna.fbcdn.net/v/t42.1790-2/10000000_1879863095525042_7425675396319879325_n.mp4?_nc_cat=105&ccb=1-7&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeE3XLswq_iYTP_tNg7OR3CJlC8sh8nQsUSULyyHydCxRCJumMDhJEkZguc94kPfQ_NhsLciqy2iaRRK6JKRzDTc&_nc_ohc=8cD5ewEG53IAX9ViUn6&_nc_rml=0&_nc_ht=scontent.fcmn5-1.fna&oh=00_AfBKLpM279Rsm8tdjCLcvbCXX-80LpVaPKSPqrV2T26-Aw&oe=64ECE189");
                videoView.start();
                break;
            case 15:
                videoView.setVideoPath("https://scontent.fcmn5-2.fna.fbcdn.net/v/t42.1790-2/10000000_269099744988556_6305359946860798647_n.mp4?_nc_cat=101&ccb=1-7&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeG71ROeySfaiiS2fUy1ikoqp2xxmj0FhXOnbHGaPQWFc1fKabZD6GLgvZzzXjsh0pZP9yxyEPtKpS-LdjWA3T0D&_nc_ohc=biPZgoTIrn8AX9zbYIg&_nc_rml=0&_nc_ht=scontent.fcmn5-2.fna&oh=00_AfBc9fO0ol1fUYIUp1RZtSkiGSluap-Pq2quke2cYQI56w&oe=64EB190B");
                videoView.start();
                break;
            case 16:
                videoView.setVideoPath("https://scontent.fcmn5-1.fna.fbcdn.net/v/t42.1790-2/10000000_1402199240160900_4144514038472562710_n.mp4?_nc_cat=109&ccb=1-7&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeF59P13zk0dg4ADLGkFAMG6Nbo4HKDiKZU1ujgcoOIplaoRwf9xEA9aAH_ankYFEd2LV3WpC0RWKnmhiIu7qjMu&_nc_ohc=12Qupcz1ZwwAX8Ajtsb&_nc_rml=0&_nc_ht=scontent.fcmn5-1.fna&oh=00_AfDd7yAw7LLvrMjHCJs_s33io7M76HXaBEQRvrGOn9lixQ&oe=64EC0E84");
                videoView.start();
                break;
            case 17:
                videoView.setVideoPath("https://scontent.fcmn5-1.fna.fbcdn.net/v/t42.1790-2/10000000_1205675666552859_6161042985814940359_n.mp4?_nc_cat=102&ccb=1-7&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeFzQBMeOIxPN3AbM93qq4w-j77Q9gdtbuiPvtD2B21u6BucjXSxahXiNhG5qxdBRPFAu9SAtKyYl1tXXTZQ6S_4&_nc_ohc=Gw14V2HXVxEAX_C2uim&_nc_rml=0&_nc_ht=scontent.fcmn5-1.fna&oh=00_AfCHVM6y_EmE6XclVaLKisJBfoDNPkMrUSYmxKqwYNMRtg&oe=64ECA63D");
                videoView.start();
                break;
            case 18:
                videoView.setVideoPath("https://scontent.fcmn5-1.fna.fbcdn.net/v/t42.1790-2/10000000_637437927215527_7894578556253209174_n.mp4?_nc_cat=109&ccb=1-7&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeHSuA3_IhVxDo140V_T5vnq0B265VSmz5zQHbrlVKbPnFy8PsFGuScY3NNGodRFB7fkN39DKolyrpkCCWX5-NXJ&_nc_ohc=UFdEzfcCs90AX9iPZ_f&_nc_rml=0&_nc_ht=scontent.fcmn5-1.fna&oh=00_AfBP_ILbYIiYfsY4vk_dxA8lE-cNbcRLtipbAH5yshuEXg&oe=64EBABC1");
                videoView.start();
                break;
            case 19:
                videoView.setVideoPath("https://scontent.fcmn5-2.fna.fbcdn.net/v/t42.1790-2/10000000_517243212783407_1573709645631231530_n.mp4?_nc_cat=101&ccb=1-7&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeFFdtqBRHFsgCCDJDYEvBFDxNG4cD-qTfvE0bhwP6pN-4zA_uDtNw5DM-6wJFwcokMAPoucI6oZ_FtC-13NiQYj&_nc_ohc=0Kg7rkoC_jMAX8wlC-q&_nc_rml=0&_nc_ht=scontent.fcmn5-2.fna&oh=00_AfDes-aDP9R2wqpde3PvhUlVz8eH3cTwmPQTbPxfYiESHw&oe=64EC9233");
                videoView.start();
                break;
            case 20:
                videoView.setVideoPath("https://scontent.fcmn5-2.fna.fbcdn.net/v/t42.1790-2/10000000_999518454126954_1462855216883257432_n.mp4?_nc_cat=100&ccb=1-7&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeFV6RoO-Fic6xua1g5kx4barKQdUahc1EOspB1RqFzUQ2J2ndw-QWF1BvYhT8KVDAuOL5MVAor5UIAjNQ68YZ5b&_nc_ohc=l2ZyW_fAkS8AX_7hw9R&_nc_rml=0&_nc_ht=scontent.fcmn5-2.fna&oh=00_AfB6ADFSSO58kQQQzSvro2aHx40M-jhbkvP70aE9O3wxfA&oe=64EC8447");
                videoView.start();
                break;
            case 21:
                videoView.setVideoPath("https://scontent.fcmn5-2.fna.fbcdn.net/v/t42.1790-2/10000000_382287916417064_8791775867962069235_n.mp4?_nc_cat=107&ccb=1-7&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeEfc_KAodcgpI0pdfGjAl8SSueUWZ996tJK55RZn33q0jMK0zKJVu7pPgN-mMcZE0byYvmltm9nZDxSQOAoMgng&_nc_ohc=eBGq5srJ-MsAX98XUNm&_nc_rml=0&_nc_ht=scontent.fcmn5-2.fna&oh=00_AfC2s7Zo4GPESzWBOTTmM5jHPkZwQuo_7K2hMl4H1ozVuQ&oe=64EB4B96");
                videoView.start();
                break;
            case 22:
                videoView.setVideoPath("https://scontent.fcmn5-2.fna.fbcdn.net/v/t42.1790-2/10000000_2840190752976961_7781001245656571284_n.mp4?_nc_cat=108&ccb=1-7&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeHt2Bzeg6wJKDgl35m5JqUjNStSn0eFalw1K1KfR4VqXCj0KONEzGvVwONRC0oKgNW-aX6modsvlIQtz50_kMmN&_nc_ohc=VZYmNsbsBIkAX8X0DIj&_nc_rml=0&_nc_ht=scontent.fcmn5-2.fna&oh=00_AfCMJpPW7LUlzNxP9_A5cWtigpYnYj74KtP4tooCS2_6hQ&oe=64EC512D");
                videoView.start();
                break;
            case 23:
                videoView.setVideoPath("https://scontent.fcmn5-2.fna.fbcdn.net/v/t42.1790-2/10000000_2966753660279225_4219789516152676508_n.mp4?_nc_cat=100&ccb=1-7&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeGlrB4ltglL-ZolUiQFkG_VJ-1nJkLPnIwn7WcmQs-cjNE1apdg98WGj6RniX5yWDiPK2Km8T7r2_rzEUhx3HVO&_nc_ohc=7kanKEXk3JwAX9_lFrd&_nc_rml=0&_nc_ht=scontent.fcmn5-2.fna&oh=00_AfBWb4_iLlA1FbsU2yKDkFolusl2jPyQa-eb7ON99KDJuw&oe=64EBB0FD");
                videoView.start();
                break;
            case 24:
                videoView.setVideoPath("https://scontent.fcmn5-1.fna.fbcdn.net/v/t42.1790-2/10000000_834624893832847_844211716660817342_n.mp4?_nc_cat=105&ccb=1-7&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeFNamDncUUVlp5vFJ-_qrxw2SCyhhxqky_ZILKGHGqTLy3AdBMJ7FEJQjjWPdLTPwJjzvdIw-9RgMWvormsubdg&_nc_ohc=QBQ-vPvASjsAX8p51W0&_nc_rml=0&_nc_ht=scontent.fcmn5-1.fna&oh=00_AfDBStzxdatHYQdc6KCrLAMH92SYHMLWipTOew-Edc4cFA&oe=64EB493A");
                videoView.start();
                break;
            case 25:
                videoView.setVideoPath("https://scontent.fcmn5-2.fna.fbcdn.net/v/t42.1790-2/10000000_3011960212357728_3608824207420117490_n.mp4?_nc_cat=103&ccb=1-7&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeGZGhHCaXMVIPqBPNrK4QeFPMuWcNMEUFM8y5Zw0wRQUxziZXnt5OmL-LgyZdV2A23oiqot01bjWUG8QTL8e6Ep&_nc_ohc=KykiuN3nS2AAX8uzE56&_nc_rml=0&_nc_ht=scontent.fcmn5-2.fna&oh=00_AfBO7DWjJ-Afy6bVdF5obhzd0Kfoi8uj5cB9imx_H01mjg&oe=64EBC4F4");
                videoView.start();
                break;
            case 26:
                videoView.setVideoPath("https://scontent.fcmn5-2.fna.fbcdn.net/v/t42.1790-2/10000000_331598265022389_7975577000944259787_n.mp4?_nc_cat=108&ccb=1-7&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeG4pE0S-HkygsOkcr3F4l_Z-8GnVn7G-Rn7wadWfsb5GWdhtvvS1vrSSZjAWWjlbuH8sph8D6FAINS065EaXy7b&_nc_ohc=J3nFJaiutK8AX9P7kO4&_nc_rml=0&_nc_ht=scontent.fcmn5-2.fna&oh=00_AfCUzY0YhGzaqpOd7ia0d6YGuNO6ucOJQXAdrvjNC6BNfg&oe=64EC001E");
                videoView.start();
                break;
            case 27:
                videoView.setVideoPath("https://scontent.fcmn5-2.fna.fbcdn.net/v/t42.1790-2/10000000_4276639272394878_3984749259354515637_n.mp4?_nc_cat=103&ccb=1-7&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeHXBSUYZGnZisrgHJwFb90SjOz1DPutIFWM7PUM-60gVY1M6Yrt8CkjuVezU10xAZTeuE5mps5x5m73gxOALf2-&_nc_ohc=BmYna37hOc4AX9j_oqn&_nc_rml=0&_nc_ht=scontent.fcmn5-2.fna&oh=00_AfBiEBxy9Ea_WUM1i2btoW17HFyDKx1qibCZurUmXYRFKw&oe=64EB3AC4");
                videoView.start();
                break;
            case 28:
                videoView.setVideoPath("https://scontent.fcmn5-1.fna.fbcdn.net/v/t42.1790-2/10000000_823775184898115_397686184600981191_n.mp4?_nc_cat=111&ccb=1-7&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeEcsuHCPpalZHMFP1iq0lWUCGO4PEAJoNoIY7g8QAmg2vdF9mSWp55-esq2uTtU3Q-M7SVW7bI_APwhWN8SKhiI&_nc_ohc=68Ke7PLNyZoAX_pxwER&tn=MIJHvljkGZpQzQvF&_nc_rml=0&_nc_ht=scontent.fcmn5-1.fna&oh=00_AfC6nCRpWfF1yrjbEKiBm1Jvj1KYvnH0lMAPBKyxpQ8CRA&oe=64EC39B5");
                videoView.start();
                break;
            case 29:
                videoView.setVideoPath("https://scontent.fcmn5-2.fna.fbcdn.net/v/t42.1790-2/10000000_546059296559645_1287841243664600724_n.mp4?_nc_cat=100&ccb=1-7&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeHMeVcwxHfbKkFerh2Z6JoK6YH_sxVQm4Dpgf-zFVCbgClfYBFLRoO3FsHQgp3M5OHITnx_pZ_FU4nyXRcD7xDj&_nc_ohc=6hojkbLhjJgAX873lFX&_nc_rml=0&_nc_ht=scontent.fcmn5-2.fna&oh=00_AfB21nlRaqkqv136swUVVh9KuwWD2GrUrHxCDFYB39hDEQ&oe=64ECBE5D");
                videoView.start();
                break;
            case 30:
                videoView.setVideoPath("https://scontent.fcmn5-2.fna.fbcdn.net/v/t42.1790-2/10000000_116428810626268_218973954015542243_n.mp4?_nc_cat=104&ccb=1-7&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeGfqvxGU2yP5L7dE04yuyismVBwE-AIv1iZUHAT4Ai_WHxdYVoUpHFA32uS-fivwtluc4f08tAKNS5PQI1u8AeP&_nc_ohc=4-bDcOZLsUsAX_-7Qyg&_nc_rml=0&_nc_ht=scontent.fcmn5-2.fna&oh=00_AfDV-9kKyW3SSUxsBRiDM1of9FRhJ6cDKDjDLFRYlsoV5g&oe=64EB9C8A");
                videoView.start();
                break;
            case 31:
                videoView.setVideoPath("https://scontent.fcmn5-2.fna.fbcdn.net/v/t42.1790-2/10000000_222733319662673_2197202245392914641_n.mp4?_nc_cat=101&ccb=1-7&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeHKWRsxwutPNJKD4ZK2U2JwojQneE1nHQyiNCd4TWcdDOKMa8FQzHYOlxb5rQOH5OPmcjrStgSVAVPQpe_GrvzW&_nc_ohc=ktt6OK1NDj4AX8u9F63&_nc_rml=0&_nc_ht=scontent.fcmn5-2.fna&oh=00_AfDPtk0Jx1XWcL4Q7-xGQSPZpKkS9rNzQuIOXxrSzkjmiw&oe=64EC6AD1");
                videoView.start();
                break;
            case 32:
                videoView.setVideoPath("https://scontent.fcmn5-2.fna.fbcdn.net/v/t42.1790-2/10000000_2369301269879949_8520881040244181453_n.mp4?_nc_cat=100&ccb=1-7&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeEDy_nf5USR2Vc4lZKQ53sbIF0g6lDZ2m0gXSDqUNnabVnSNktYG-JUSglVmiCu8_uAHZavcuQKq_De5UA7Nn5E&_nc_ohc=3wxlOTafmhQAX_sV8d-&_nc_rml=0&_nc_ht=scontent.fcmn5-2.fna&oh=00_AfABCiUWHJyFMb708Oyd-SLFfNygT-nwD-DVreGLOd5tkg&oe=64ECD1FE");
                videoView.start();
                break;
            case 33:
                videoView.setVideoPath("https://scontent.fcmn5-2.fna.fbcdn.net/v/t42.1790-2/10000000_427442978505939_8814780889844019849_n.mp4?_nc_cat=104&ccb=1-7&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeHz6vshWLstwQhf8697iomO9eWVh0i_p-n15ZWHSL-n6UfcaJbi1AsjKZsd8M_viQ2AETMQYdgGZ7uXe6lJObfk&_nc_ohc=QuyiiPR9UZIAX-4MnsU&_nc_oc=AQkXSdPs1hw9aGdBPVDcgibIL3ayYLR7b1YOu4ZWyP2YaFDT6t-UCbSN6_8wShfCmAA&_nc_rml=0&_nc_ht=scontent.fcmn5-2.fna&oh=00_AfDEha9bUYsPdPuwhPbIMXvnaEm6D-lDMMh7PaERswpQ7g&oe=64EBB3AD");
                videoView.start();
                break;
            case 34:
                videoView.setVideoPath("https://scontent.fcmn5-2.fna.fbcdn.net/v/t42.1790-2/10000000_1472804533116838_2579560654229722355_n.mp4?_nc_cat=107&ccb=1-7&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeF-U6hqHlm9pNfzra1LG9Tb5sMcWVHQENzmwxxZUdAQ3PXMX_2oz6V4bfLp8V86Bo61Q81YZ5M9sScMwXq-0fpT&_nc_ohc=GyqZYjRTThYAX_iBQXH&_nc_rml=0&_nc_ht=scontent.fcmn5-2.fna&oh=00_AfCn9RBLNFFTYALf0HHA9LG3wbPd7sg3Hju4eX6441nggw&oe=64EB4250");
                videoView.start();
                break;
            case 35:
                videoView.setVideoPath("https://scontent.fcmn5-1.fna.fbcdn.net/v/t42.1790-2/10000000_601281357648672_7976599680002857390_n.mp4?_nc_cat=105&ccb=1-7&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeEncThNWNUs9YujBo1ibIbEB7nHOxmUp8kHucc7GZSnyeQzvgNpLfBuw7BHXJ6HG4ZpBfBPrZFe8fJ9bWDeTZ-z&_nc_ohc=1KsBkbx5214AX-c2xl-&_nc_rml=0&_nc_ht=scontent.fcmn5-1.fna&oh=00_AfAaZLYW1ugQqkyDLrXtrkKz6i3Jw_rH1Fk80nqsvGF2Ow&oe=64EBF58D");
                videoView.start();
                break;
            case 36:
                videoView.setVideoPath("https://scontent.fcmn5-1.fna.fbcdn.net/v/t42.1790-2/10000000_224997226403069_1538637660205783164_n.mp4?_nc_cat=105&ccb=1-7&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeEpGnynSnyBPxaLRBO5-tloP5Lzdfw1Sgw_kvN1_DVKDOa1tCIOUaMgUAZ_p2ieGYvkHzhjeRNkeJ6ZazR17JcU&_nc_ohc=3pIM16qL3CQAX_iAftI&_nc_rml=0&_nc_ht=scontent.fcmn5-1.fna&oh=00_AfCJPzN9MI9LGWaHUq5CRrn2rCU9HMcIJomkU1kbll_SdA&oe=64ECDBD3");
                videoView.start();
                break;
            case 37:
                videoView.setVideoPath("https://scontent.fcmn5-2.fna.fbcdn.net/v/t42.1790-2/10000000_2800098060288161_2808279823549741683_n.mp4?_nc_cat=108&ccb=1-7&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeGNMA9X1ipq-BKeOVQ4gAQUBNRNKEEcacIE1E0oQRxpwojBorWRPmkP414IGMu52J9-uchyQY6Z8wmcpc5e0oba&_nc_ohc=SZLtHLcAW10AX-P7fUx&_nc_rml=0&_nc_ht=scontent.fcmn5-2.fna&oh=00_AfD7JA9xNTxZon9ZEFB5RZtRDVuuMqg4WRiv-nfHdaRW7Q&oe=64EBCA8C");
                videoView.start();
                break;
            case 38:
                videoView.setVideoPath("https://scontent.fcmn5-1.fna.fbcdn.net/v/t42.1790-2/10000000_880473959331613_6057264547173736690_n.mp4?_nc_cat=111&ccb=1-7&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeE85GugragecOutWWdj2uW527TJ5_tBGe3btMnn-0EZ7UAsG2trBh2AFZuzpylKjIIBk77DhyIrb8pgzeW_1Qp8&_nc_ohc=Z4Gh_4j2B8wAX8vI16Y&tn=MIJHvljkGZpQzQvF&_nc_rml=0&_nc_ht=scontent.fcmn5-1.fna&oh=00_AfAasMYLtG7Y9whAni0jLLxo6GpRCmQGMBw8g3bfdW2Pzw&oe=64EBC192");
                videoView.start();
                break;
            case 39:
                videoView.setVideoPath("https://scontent.fcmn5-2.fna.fbcdn.net/v/t42.1790-2/10000000_997026167560536_9155968793148061700_n.mp4?_nc_cat=107&ccb=1-7&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeHu7HC9qZu0frq0oKU7klhI5icjj6lFaEzmJyOPqUVoTKNh2vK-OhTkf9PKwg22tJTYEA2ir_1HcIb262H01lrG&_nc_ohc=B6k0mE67aI8AX-j1Nyy&tn=MIJHvljkGZpQzQvF&_nc_rml=0&_nc_ht=scontent.fcmn5-2.fna&oh=00_AfBEJHya3XsvgGZQhKVHLJgS6ouegikDx9CEE7fI8qifOQ&oe=64EC1AA5");
                videoView.start();
                break;
            case 40:
                videoView.setVideoPath("https://scontent.fcmn5-2.fna.fbcdn.net/v/t42.1790-2/10000000_570192810981725_1937811098855409892_n.mp4?_nc_cat=104&ccb=1-7&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeGRk4nubxiSJOUoC05lSBcnLZOlNI6dI6Qtk6U0jp0jpNgg59fMqRwPDuT7oIXC56NBtGE9bYYVC_d6oWLail6C&_nc_ohc=mhURATd8oWIAX_-5ZYL&_nc_rml=0&_nc_ht=scontent.fcmn5-2.fna&oh=00_AfBKmVeqam2JkiuKAYWBwx9y9Zxfm-c88-IHTad44htGkA&oe=64EC1D2B");
                videoView.start();
                break;
            case 41:
                videoView.setVideoPath("https://scontent.fcmn5-1.fna.fbcdn.net/v/t42.1790-2/10000000_142423798150962_7065926914178748797_n.mp4?_nc_cat=109&ccb=1-7&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeGYA-RX180wiEvV05-JVUAqlYSaY67qWUmVhJpjrupZSbhQgSefW0iXkS5wMIWBpdwR6adJe8NjGXv143LNrpz6&_nc_ohc=Tzy65G2sgwIAX-Pg1r3&_nc_rml=0&_nc_ht=scontent.fcmn5-1.fna&oh=00_AfCG8q81pvDa4s6n2FjlXWGVrd_M6-yPYxbxJdJ2FHXSmw&oe=64EC1791");
                videoView.start();
                break;
            case 42:
                videoView.setVideoPath("https://scontent.fcmn5-2.fna.fbcdn.net/v/t42.1790-2/10000000_3156914051244992_8470557005034332034_n.mp4?_nc_cat=104&ccb=1-7&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeEgjD0JFpoZjtEcdTF25W6dszt_sLDpvqCzO3-wsOm-oMR704DVefVmELOy4IEicHZh_vpL32Df5Opne5lEuPhb&_nc_ohc=6fMUg7ak6ykAX-BOfsg&_nc_rml=0&_nc_ht=scontent.fcmn5-2.fna&oh=00_AfD4eAil54KoIE_fkGDIXLvMdjFfBQ0Ey4zOtHhBdgz2fg&oe=64ECD39B");
                videoView.start();
                break;
            case 43:
                videoView.setVideoPath("https://scontent.fcmn5-1.fna.fbcdn.net/v/t42.1790-2/10000000_2209111672563273_695334824714649633_n.mp4?_nc_cat=106&ccb=1-7&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeH8vOlEYEgWaOZ3y4jg1kofB0Tms__BV8MHROaz_8FXw64DMSbIRJpdN1Uf_plQSmJIQtWzaVA-u76M_fSxsgQG&_nc_ohc=xM1hKw0x1BQAX8YNxoF&_nc_rml=0&_nc_ht=scontent.fcmn5-1.fna&oh=00_AfDEIneitWO3Z8OkIGURQwEuyUkJyK1q9z2fjuwnf1PfuQ&oe=64EB5C85");
                videoView.start();
                break;
            case 44:
                videoView.setVideoPath("https://scontent.fcmn5-1.fna.fbcdn.net/v/t42.1790-2/10000000_436979317877099_5701783137211703257_n.mp4?_nc_cat=110&ccb=1-7&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeEXuS0gTQkS4ORLe6FFlOCynhUiMZOlUx2eFSIxk6VTHfI2An6_kv3WMTfro6F41MiNjYvlnFHlg85gEx0MdbTD&_nc_ohc=OWlT0Fo-DakAX_JAyYp&_nc_rml=0&_nc_ht=scontent.fcmn5-1.fna&oh=00_AfAY9Eaa9pjTPQ2c6yhu6zUxRm_otneXcf9Ek_MVrsgX1w&oe=64ECB1D4");
                videoView.start();
                break;
            case 45:
                videoView.setVideoPath("https://scontent.fcmn5-1.fna.fbcdn.net/v/t42.1790-2/10000000_1234703483641804_1092864420742432149_n.mp4?_nc_cat=110&ccb=1-7&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeHAAXBfzVICnbQ57MeqAUnfE6sKJbiyWAMTqwoluLJYA7vU94eQnERUzkNENYvj_XrcSQ_-yUOS5Dj5jGm9eiz_&_nc_ohc=04bOYKrES58AX_3TjuU&_nc_rml=0&_nc_ht=scontent.fcmn5-1.fna&oh=00_AfDpZUbrVmBeec_m_wbM25RKGZuJjDzh5mjIB6eYXoP-0A&oe=64EB90CA");
                videoView.start();
                break;
            case 46:
                videoView.setVideoPath("https://scontent.fcmn5-2.fna.fbcdn.net/v/t42.1790-2/10000000_900481517323115_1449428374509290895_n.mp4?_nc_cat=101&ccb=1-7&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeGQmfQ7vr4mMD1Qlg-92aFD3IabgfOIMtjchpuB84gy2ACL7YKJGUs0UWw8ryon8CI9_B52VWDa2VjU-X4Fvp2b&_nc_ohc=50sOi4VFaRkAX8iBqNn&_nc_rml=0&_nc_ht=scontent.fcmn5-2.fna&oh=00_AfB4tSLo1mEww22l7mg4Tt2i0B_ByvbycMV5UXUkFnt-1g&oe=64EB7AFA");
                videoView.start();
                break;
            case 47:
                videoView.setVideoPath("https://scontent.fcmn5-1.fna.fbcdn.net/v/t42.1790-2/10000000_343934887528223_2174872257157921711_n.mp4?_nc_cat=110&ccb=1-7&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeH-0IcvB5veVdD5cN_pakg3CyfziSaz6BELJ_OJJrPoEU_oJdsBOPda4I_j6tdWk8WBVCKyWDZar4xOrfbwkSGC&_nc_ohc=Pjn2vkx7y2cAX8Ogc-C&_nc_rml=0&_nc_ht=scontent.fcmn5-1.fna&oh=00_AfB2ehWy1kjbRQ9uuojpu6uqUOlFkE9FEvWC3lukvPWi-Q&oe=64EB34AB");
                videoView.start();
                break;
            case 48:
                videoView.setVideoPath("https://scontent.fcmn5-1.fna.fbcdn.net/v/t42.1790-2/10000000_271701158302522_5291029844318817821_n.mp4?_nc_cat=105&ccb=1-7&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeEsYQ-yavjYoLLikBVmpPWdR4gxVdOKUKhHiDFV04pQqJqbe0D_ViP1FunuDD6UbtoRNmty0P1s8_8AvZ3lsIFM&_nc_ohc=VsOUzGmzF3UAX_76GiI&_nc_rml=0&_nc_ht=scontent.fcmn5-1.fna&oh=00_AfBD2XoCNAgS06jf7pSYAAPywnjnQNNjZDWtk7ZcD9UBBQ&oe=64EB49CB");
                videoView.start();
                break;
            case 49:
                videoView.setVideoPath("https://scontent.fcmn5-2.fna.fbcdn.net/v/t42.1790-2/10000000_912159916101257_7515333440309235428_n.mp4?_nc_cat=108&ccb=1-7&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeE4nkBv5JyJSc72NmUvgjYXaQQmpdw6eeBpBCal3Dp54H1mgycBgas1soeaInMz2MI9WYED4uVpOXLKYZqpZDsP&_nc_ohc=NYWD0s9r99MAX_VMWdb&tn=MIJHvljkGZpQzQvF&_nc_rml=0&_nc_ht=scontent.fcmn5-2.fna&oh=00_AfA4_Vm-pf5zvr_kOoBW0Tq5YjO0L0ITG2OiZT4LM4I68Q&oe=64EBDF40");
                videoView.start();
                break;
            case 50:
                videoView.setVideoPath("https://scontent.fcmn5-1.fna.fbcdn.net/v/t42.1790-2/10000000_325713342513004_1677411657017200899_n.mp4?_nc_cat=109&ccb=1-7&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeFio4S0g2a3MWW1XJkdCnSsJ8OaV0AxFr4nw5pXQDEWvnjkgF59r-1kgZKHtuqWyFZMul9zjjCD3A9TLrEZk6dt&_nc_ohc=QW2pi2tyd8MAX_N6SUG&_nc_rml=0&_nc_ht=scontent.fcmn5-1.fna&oh=00_AfCk2UgkDq4vAPtxZ4BI_Z16vjQSq0G-ouPLNST6hX_dDA&oe=64EBE646");
                videoView.start();
                break;
            case 51:
                videoView.setVideoPath("https://scontent.fcmn5-2.fna.fbcdn.net/v/t42.1790-2/10000000_342814477198616_4368722303529301335_n.mp4?_nc_cat=103&ccb=1-7&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeEMFHdbc6J0D_gs6eUMgyHOMv4Q0oZv8msy_hDShm_ya3QbZ291CsEI-TM08nP7X7qCC528XPaHJGBmG0dnyseL&_nc_ohc=Cikk9kLT2KMAX8B4Rkc&tn=MIJHvljkGZpQzQvF&_nc_rml=0&_nc_ht=scontent.fcmn5-2.fna&oh=00_AfDNXkENEhBLM8snJAVH5uBjngWlV08r0dcSDfrwuwsWmw&oe=64EC5F1F");
                videoView.start();
                break;
            case 52:
                videoView.setVideoPath("https://scontent.fcmn5-2.fna.fbcdn.net/v/t42.1790-2/10000000_301120362031773_3077810812408313581_n.mp4?_nc_cat=104&ccb=1-7&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeFyctPkhEYf7G-rAP5ukm5EFTFBuw__Q3YVMUG7D_9DdreoeOq2JFkEmLM0y8jmrsLbyf07WXOTyuDumOsd5Zyi&_nc_ohc=U6lsnVx3S48AX-e88a_&_nc_rml=0&_nc_ht=scontent.fcmn5-2.fna&oh=00_AfC-ShVRpfEmHC-Aldhjv_q1XXWJNRVEYVkMyaml_3BUQQ&oe=64ED14A4");
                videoView.start();
                break;
            case 53:
                videoView.setVideoPath("https://scontent.fcmn5-1.fna.fbcdn.net/v/t42.1790-2/10000000_767177180765427_269887052993060689_n.mp4?_nc_cat=105&ccb=1-7&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeFLlT4UGVE2Xm8gSNQhPZ-7p1Z8sHWSxtKnVnywdZLG0uN3h8G7TmYUS-A0zcxcgRXsCMoF0lRFlFBiQpOGqMMa&_nc_ohc=fGp-AEDH0EkAX_lhV7g&_nc_rml=0&_nc_ht=scontent.fcmn5-1.fna&oh=00_AfD8_YjtpWOB7D6MGK26McgZsUzD1h-yQBlKR1BGEFN8Eg&oe=64EC0F48");
                videoView.start();
                break;
            case 54:
                videoView.setVideoPath("https://scontent.fcmn5-1.fna.fbcdn.net/v/t42.1790-2/10000000_1254366191733988_5904210239324351222_n.mp4?_nc_cat=110&ccb=1-7&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeGp35SAbGzDslKgboKx2C6U3jhmJlmKhz7eOGYmWYqHPuq-K_rO4aJXNWyLEJN2wEtWt4R9mm3BZtWcjMD54y2C&_nc_ohc=O4NCsfVbBoIAX__zoGQ&tn=MIJHvljkGZpQzQvF&_nc_rml=0&_nc_ht=scontent.fcmn5-1.fna&oh=00_AfCJ0rMV1KyHp3_RtOJoT4Gyszq-x4BK7V-_Bmg9Y0PG5g&oe=64EBE16A");
                videoView.start();
                break;
            case 55:
                videoView.setVideoPath("https://scontent.fcmn5-1.fna.fbcdn.net/v/t42.1790-2/10000000_2947295002190180_9033988368552742945_n.mp4?_nc_cat=106&ccb=1-7&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeG6GHbs9WqSUIig3_ky5wn7ZoZ4sH64fs9mhniwfrh-z3H8jHJNcuWifOdnuoeAYD-H4osUKnCjO_Ws-d-wd4CW&_nc_ohc=SEbkq67NtYwAX83tApo&_nc_rml=0&_nc_ht=scontent.fcmn5-1.fna&oh=00_AfA6nqQ_JAS75Y8cCHZu8NWfKzLFwHH3OeltT0eQ-x12bg&oe=64EBF2FE");
                videoView.start();
                break;
            case 56:
                videoView.setVideoPath("https://scontent.fcmn5-2.fna.fbcdn.net/v/t42.1790-2/10000000_929950217934716_8853364963098975779_n.mp4?_nc_cat=108&ccb=1-7&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeG_JKiVgbexuDWhTO7phWVXBo3Bpft7fOEGjcGl-3t84TC4cjjYDuGx-pJPbXvAoTNtzWMXYrgSXamEF9v_R03m&_nc_ohc=QQ7bu7YT_XQAX_wH8zc&_nc_rml=0&_nc_ht=scontent.fcmn5-2.fna&oh=00_AfBSkqpIF4sFnntuQoNBrv3MF0daBgSGW5Vpt7JlBrPwfA&oe=64ECA070");
                videoView.start();
                break;
            case 57:
                videoView.setVideoPath("https://scontent.fcmn5-2.fna.fbcdn.net/v/t42.1790-2/10000000_119075433953774_6588508932407866431_n.mp4?_nc_cat=107&ccb=1-7&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeF3FraiobOd3CuLpUvTCKbDyOmhgGy7M87I6aGAbLszzvJJuDZ6aJoLCTVnl8ldUx-rsCbo1vEaCJD7l7DQu5JX&_nc_ohc=OfE7cTilf9QAX90xMry&_nc_rml=0&_nc_ht=scontent.fcmn5-2.fna&oh=00_AfDmoU0LViezDdFyxiXxzeDoMtbFj4ZVAp8wnEC73bxEqA&oe=64EB279F");
                videoView.start();
                break;
            case 58:
                videoView.setVideoPath("https://scontent.fcmn5-1.fna.fbcdn.net/v/t42.1790-2/10000000_236879328499680_3417201699496109783_n.mp4?_nc_cat=106&ccb=1-7&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_eui2=AeHOiWsO_lhb2j8zenoIzHENE6id9cfeyqkTqJ31x97KqbrvvBI-sD5S3hdoh6Aaxqfv3mF4BR7lqByC73joSAgE&_nc_ohc=_mheZiaSZ9AAX8WEMeX&_nc_rml=0&_nc_ht=scontent.fcmn5-1.fna&oh=00_AfCU-pbbxF6EIfN1602agfgFFS9a_5ZBi3eo2b4UQ96cfw&oe=64EB4753");
                videoView.start();
                break;
            case 59:
                videoView.setVideoPath("https://scontent.fcmn5-1.fna.fbcdn.net/v/t42.1790-2/10000000_719176672666641_1884602984697054828_n.mp4?_nc_cat=109&ccb=1-7&_nc_sid=985c63&efg=eyJ2ZW5jb2RlX3RhZyI6InN2ZV9zZCJ9&_nc_ohc=aW-HgIh7U3gAX--gnSN&tn=MIJHvljkGZpQzQvF&_nc_rml=0&_nc_ht=scontent.fcmn5-1.fna&oh=00_AfDLlcemCxDyMN_C_hGN2YElLrkRX55K34xWMjsm8NbcFg&oe=64EBFB6E");
                videoView.start();
                break;

        }
videoView.setMediaController(new MediaController(Abdrahman_Naboulsi_Activity.this));
videoView.requestFocus();
       /* RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams)videoView.getLayoutParams();
        layoutParams.addRule(RelativeLayout.ALIGN_PARENT_LEFT,0);
        layoutParams.addRule(RelativeLayout.CENTER_IN_PARENT,0);
        videoView.setLayoutParams(layoutParams);*/
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