package tw.edu.nttu.apps;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.Date;


public class Interface extends AppCompatActivity {

    TextView tv0;

    Date date;
    SimpleDateFormat week;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_interface);

        tv0= (TextView) findViewById(R.id.tv0);
        showDate();
        //System.out.println(dateFormat.format(date));
    }

    public void showDate() {
        date = new Date();
        week =new SimpleDateFormat("EE");
        //Log.d("WEEK", String.valueOf(week));

        String EE = week.format(date);
        String s01 =  new String("");
        //Log.d("WEEK", String.valueOf(EE));
        if(EE.equals("Mon")){
            s01="一";
        }
        if(EE.equals("Tue")){
            s01="二";
        }
        if(EE.equals("Wed")){
            s01="三";
        }
        if(EE.equals("Thu")){
            s01="四";
        }
        if(EE.equals("Fri")){
            s01="五";
        }
        if(EE.equals("Sat")){
            s01="六";
        }
        if(EE.equals("Sun")){
            s01="日";
        }

        SimpleDateFormat dateFormat =
                new SimpleDateFormat("yyyy年MM月dd日 星期");

        //Log.d("WEEK", s01.toString());
        tv0.setText(dateFormat.format(date) + s01.toString());
    }

    private class SimpleDateFormat {
        public SimpleDateFormat(String ee) {

        }

        public String format(Date date) {
            return null;
        }
    }

    private class N {
    }
}
