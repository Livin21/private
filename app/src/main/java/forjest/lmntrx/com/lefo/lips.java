package forjest.lmntrx.com.lefo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class lips extends Activity {

    Context CON;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            setContentView(R.layout.activity_lips);
        }catch (Exception e){
            setContentView(R.layout.oom);
        }
        CON=this;
    }

    public void next4(View v){
        Intent intent=new Intent(CON,wish3.class);
        startActivity(intent);
        this.finish();
    }
}
