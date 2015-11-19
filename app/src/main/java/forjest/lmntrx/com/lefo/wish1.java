package forjest.lmntrx.com.lefo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class wish1 extends Activity {

    Context CON;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wish1);
        CON=this;
    }

    public void next2(View v){
        Intent intent=new Intent(CON,wish2.class);
        startActivity(intent);
        this.finish();
    }


}
