package forjest.lmntrx.com.lefo;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class wish6 extends Activity {

    Context CON;
    MediaPlayer mediaPlayer;
    Boolean played=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wish6);
        CON=this;
    }

    public void last(View v){
        if (!played)
            play();
    }

    public void play(){
        mediaPlayer= MediaPlayer.create(this, R.raw.kiss);
        mediaPlayer.start();
        played=true;

    }

    public void exit(View v){
        System.exit(0);
    }

    @Override
    protected void onPause() {
        super.onPause();
        mediaPlayer.stop();
        played=false;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mediaPlayer.stop();
        played=false;
    }
}
