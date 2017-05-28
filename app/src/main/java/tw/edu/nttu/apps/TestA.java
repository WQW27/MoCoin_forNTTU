package tw.edu.nttu.apps;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.DatePicker;
import android.view.View;
import android.widget.TimePicker;


import java.util.Calendar;


public class TestA extends AppCompatActivity {
    Button bt07, bt08;

    String s1 = "";
    String s2 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_test);
        setupView();
    }

    private void setupView() {
        bt07 = (Button) findViewById(R.id.bt07);
        bt08 = (Button) findViewById(R.id.bt08);

        bt07.setOnClickListener(bt07Click);
        bt08.setOnClickListener(bt08Click);
    }

    Button.OnClickListener bt07Click = new Button.OnClickListener() {
        @RequiresApi(api = Build.VERSION_CODES.N)
        @Override
        public void onClick(View v) {
            Calendar now=Calendar.getInstance();
            DatePickerDialog datePic=new DatePickerDialog(
                    TestA.this,
                    datePicListener,
                    now.get(Calendar.YEAR),
                    now.get(Calendar.MONTH),
                    now.get(Calendar.DAY_OF_MONTH)
            );
            datePic.setTitle("選擇日期");
            datePic.setMessage("請選擇日期");
            datePic.setIcon(android.R.drawable.ic_dialog_info);
            datePic.setCancelable(false);
            datePic.show();
        }
    };
    Button.OnClickListener bt08Click= new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            Calendar now=Calendar.getInstance();
            TimePickerDialog timePic =new TimePickerDialog(
                    TestA.this,
                    timePicListener,
                    now.get(Calendar.HOUR_OF_DAY),
                    now.get(Calendar.MINUTE),
                    true
            );
            timePic.setTitle("選擇時間");
            timePic.setMessage("請選擇時間");
            timePic.setIcon(android.R.drawable.ic_dialog_info);
            timePic.setCancelable(false);
            timePic.show();
        }
    };
    DatePickerDialog.OnDateSetListener datePicListener= new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
            s1 = year + "年" +
                    (month) + "月" + dayOfMonth + "日";
            bt07.setText(s1);
            bt08Click.onClick(view);
        }
    };
    TimePickerDialog.OnTimeSetListener timePicListener=new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                s2=hourOfDay+"點"+minute+"分";
                bt08.setText(s2);
            }
    };
}

