package tw.edu.nttu.apps;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import java.util.Date;

public class MainProfile extends AppCompatActivity {

    TextView tv0;

    Date date;
    SimpleDateFormat week;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_main);

        tv0= (TextView) findViewById(R.id.tv0);
        showDate();
        //System.out.println(dateFormat.format(date));
    }

    public void showDate() {
        date = new Date();
        week = new SimpleDateFormat("yyyy/MM/dd EEE HH:mm:ss");

        String EEE = week.format(date);
        Log.d("WEEK", EEE.toString());

//
//        String s01 =  new String("");
//        //Log.d("WEEK", String.valueOf(EEE));
//        if(EEE.equals("Mon")){
//            s01="一";
//        }
//        if(EEE.equals("Tue")){
//            s01="二";
//        }
//        if(EEE.equals("Wed")){
//            s01="三";
//        }
//        if(EEE.equals("Thu")){
//            s01="四";
//        }
//        if(EEE.equals("Fri")){
//            s01="五";
//        }
//        if(EEE.equals("Sat")){
//            s01="六";
//        }
//        if(EEE.equals("Sun")){
//            s01="日";
//        }

        SimpleDateFormat dateFormat =
                new SimpleDateFormat("yyyy年MM月dd日 星期EEE, java.util.Locale.TW");

        //Log.d("WEEK", s01.toString());
//        tv0.setText(dateFormat.format(date) + s01.toString());
    }

    private class SimpleDateFormat {
        public SimpleDateFormat(String ee) {

        }

        public String format(Date date) {
            return null;
        }
    }
}
