package tw.edu.nttu.apps;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainProfile extends AppCompatActivity {
    SQLiteDatabase db01;
    myDbHelper dbHelper01;
    String databaseTable="t05note";
    EditText et01;
    TextView tv01;
    Button bt0;

    TextView tv0;

    Date date;
    SimpleDateFormat week;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_main);
        setupView();

        showDate();
        //System.out.println(dateFormat.format(date));
    }

    private void setupView() {
        // TODO Auto-generated method stub
        et01=(EditText)findViewById(R.id.et01);
        tv01=(TextView)findViewById(R.id.tv01);
        bt0=(Button)findViewById(R.id.bt0);

        dbHelper01=new myDbHelper(this,databaseTable,null,1);
        db01=dbHelper01.getWritableDatabase();
    }

    public void showDate() {
        tv0 = (TextView) findViewById(R.id.tv0);

        date = new Date();
//        week = new SimpleDateFormat("yyyy年MM月dd日 星期EE");
        week = new SimpleDateFormat("EE");
        String EE = week.format(date);
        Log.d("WEEK", EE.toString());

        SimpleDateFormat dateFormat =
                new SimpleDateFormat("yyyy年MM月dd日 星期");
        //        , java.util.Locale.TW


               String s01 =  new String("");
//        AtomicReference<String> s01 = new AtomicReference<>(new String(""));
        Log.d("WEEK", String.valueOf(EE));
        if (EE.equals("Mon")) {
            s01="一";
        }
        if (EE.equals("Tue")) {
            s01="二";
        }
        if (EE.equals("Wed")) {
            s01="三";
        }
        if (EE.equals("Thu")) {
            s01="四";
        }
        if (EE.equals("Fri")) {
            s01="五";
        }
        if (EE.equals("Sat")) {
            s01="六";
        }
        if (EE.equals("Sun")) {
            s01="日";
        }

        Log.d("WEEK", s01.toString());

        tv0.setText(dateFormat.format(date) + s01.toString());
    }

//    private class SimpleDateFormat {
//        public SimpleDateFormat(String ee) {
//        public SimpleDateFormat() {
//        }

    //       public String format(Date date) {
 //           public String format() {
//            return null;
 //       }
//    }
}
