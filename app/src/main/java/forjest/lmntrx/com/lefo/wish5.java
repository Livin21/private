package forjest.lmntrx.com.lefo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class wish5 extends Activity {

    Context CON;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            setContentView(R.layout.activity_wish5);
        }catch (Exception e){
            setContentView(R.layout.oom);
        }
        CON=this;

    }

    public void next6(View v){
        Intent intent=new Intent(CON,wish6.class);
        startActivity(intent);
        this.finish();
    }

}
