package forjest.lmntrx.com.lefo;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class wish6 extends Activity {

    Context CON;
    MediaPlayer mediaPlayer;
    Boolean played=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            setContentView(R.layout.activity_wish6);
        }catch (Exception e){
            setContentView(R.layout.oom);
        }
        CON=this;
    }

    public void last(View v){
        if (!played)
            play();
    }

    public void play(){
        try{
            mediaPlayer= MediaPlayer.create(this, R.raw.kiss);
            mediaPlayer.start();
        }catch (Exception e){
            Toast.makeText(CON,"Audio cannot be played",Toast.LENGTH_LONG).show();
            Log.e("Null Pointer", "Audio cannot be played");
        }
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
