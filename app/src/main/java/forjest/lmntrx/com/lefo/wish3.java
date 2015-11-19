package forjest.lmntrx.com.lefo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class wish3 extends Activity {

    Context CON;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wish3);
        CON=this;
    }

    public void eyes(View v){
        Intent intent=new Intent(CON,eyes.class);
        startActivity(intent);
        this.finish();
    }

    public void lips(View v){
        Intent intent=new Intent(CON,lips.class);
        startActivity(intent);
        this.finish();
    }

    public void next4(View v){
        Intent intent=new Intent(CON,wish4.class);
        startActivity(intent);
        this.finish();
    }
}
