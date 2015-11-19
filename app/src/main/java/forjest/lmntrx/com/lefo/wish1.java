package forjest.lmntrx.com.lefo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class wish1 extends Activity {

    Context CON;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        CON=this;

        try {
            setContentView(R.layout.activity_wish1);
        }catch (Exception e){
            setContentView(R.layout.oom);
        }
    }

    public void next2(View v){
        Intent intent=new Intent(CON,wish2.class);
        startActivity(intent);
        this.finish();
    }

    public void OK(View v){
        System.exit(0);
    }


}
