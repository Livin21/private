package forjest.lmntrx.com.lefo;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends Activity {

    String PACKAGE;

    BroadcastReceiver br;

    PendingIntent pi;

    AlarmManager am;

    Date today, startDate,alarmTime;

    public static Context CON;

    Activity CUR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        CON = this;
        CUR = this;


        Calendar calendar = Calendar.getInstance();
        today = calendar.getTime();

        startDate = new Date(today.getYear(), 10, 20, 23, 50, 0);
        alarmTime=new Date(today.getYear(), 10, 21, 0, 0, 0);


        this.getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED |
                        WindowManager.LayoutParams.FLAG_TURN_SCREEN_ON, 0);

        PACKAGE = this.getPackageName();

        if ((startDate.getTime() - today.getTime()) > 0) {
            Toast.makeText(CON, "App Crashed", Toast.LENGTH_LONG).show();
            this.finish();
        }
        else if((startDate.getTime() - today.getTime()) < 0 && (alarmTime.getTime() - today.getTime()) > 0) {
            setContentView(R.layout.activity_main);
            setup();
          }
        else{
            Intent intent = new Intent(CON, Reciever.class);
            intent.putExtra("PLAYED",true);
            startActivity(intent);
            CUR.finish();
        }


    }

    private void setup() {
        br = new BroadcastReceiver() {
            @Override
            public void onReceive(Context c, Intent i) {

                Intent intent = new Intent(CON, AchayanCalling.class);
                startActivity(intent);

                CUR.finish();

            }
        };
        registerReceiver(br, new IntentFilter(PACKAGE));
        pi = PendingIntent.getBroadcast(this, 0, new Intent(PACKAGE), PendingIntent.FLAG_UPDATE_CURRENT);
        am = (AlarmManager) (this.getSystemService(Context.ALARM_SERVICE));

        am.set(AlarmManager.ELAPSED_REALTIME_WAKEUP, SystemClock.elapsedRealtime()+(alarmTime.getTime()-today.getTime()), pi);
        }

    @Override
    protected void onDestroy() {
        //am.cancel(pi);
        //unregisterReceiver(br);
        super.onDestroy();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
