package forjest.lmntrx.com.lefo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class Reciever extends Activity {

    Context CON;

    MediaPlayer mPlayer2;

    Boolean played = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            setContentView(R.layout.activity_reciever);
        }catch (Exception e){
            setContentView(R.layout.oom);
        }
        CON = this;
        played = getIntent().getBooleanExtra("PLAYED", false);
        if (!played)
            play();
    }

    public void next(View v) {
        Intent intent = new Intent(CON, wish1.class);
        startActivity(intent);
        this.finish();
    }

    public void play() {
        mPlayer2 = MediaPlayer.create(this, R.raw.speak);
        try {
            mPlayer2.start();
        }catch (Exception e){
            Log.e("Null Pointer","Audio cannot be played");
        }

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (!played)
            mPlayer2.stop();
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (!played)
            mPlayer2.stop();
    }
}
