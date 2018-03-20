package com.projects.siva.menubar;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class video extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);


        VideoView videoview = (VideoView) findViewById(R.id.video) ;

        //setting media controller

        MediaController mediacontroller = new MediaController(this);
        mediacontroller.setAnchorView(videoview);

        //set the uri of the video

        Uri uri = Uri.parse("https://r5---sn-cvh7knes.googlevideo.com/videoplayback?ratebypass=yes&ipbits=0&sparams=clen,dur,ei,expire,gir,id,initcwndbps,ip,ipbits,ipbypass,itag,lmt,mime,mip,mm,mn,ms,mv,pl,ratebypass,requiressl,source&expire=1520644481&mime=video/mp4&gir=yes&c=WEB&ei=Id2iWp2-AeiD8gSn4o2IDQ&pl=26&clen=349528317&signature=056092360DF7DDD9FBF9A1AC78D6AEB87FD12241.640188FACB34B3BD031B12278AE6936A40C7DE22&key=cms1&fvip=5&id=o-AAYIqNl4ZFkEpadKJhwcM0kNn6n4jUE2h6ygNVHuoPzw&dur=4547.256&source=youtube&ip=209.205.200.210&requiressl=yes&lmt=1394876152336612&itag=18&quality=medium&type=video%2Fmp4%3B+codecs%3D%22avc1.42001E%2C+mp4a.40.2%22&title=(Hdvidz.in)_Dance-Ke-Superstars---Episode-7&redirect_counter=1&rm=sn-ab5yz76&req_id=7771b2752d69a3ee&cms_redirect=yes&ipbypass=yes&mip=210.212.97.178&mm=31&mn=sn-cvh7knes&ms=au&mt=1520622750&mv=m");

        //setting the media player

        videoview.setMediaController(mediacontroller);
        videoview.setVideoURI(uri);
        videoview.start();
    }
}
