package forjest.lmntrx.com.lefo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class Reciever extends Activity {

    Context CON;

    MediaPlayer mPlayer2;

    Boolean played = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reciever);
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
        mPlayer2.start();

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
