package tw.edu.nttu.apps;

import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.widget.TimePicker;

import java.util.Date;

public class expenditure extends AppCompatActivity {
    private Date mDate = new Date();

    private Date getDate(){
        return mDate;
    }
    final Date today = new Date();
    TimePickerDialog.OnTimeSetListener listener = new TimePickerDialog.OnTimeSetListener() {
        @Override
        public void onTimeSet(TimePicker timePicker, int i, int i1) {

        }
//        @Override
//        private void setDate(Date date) {
//            mDate = new Date();
//        public void onTimeSet(TimePicker timePicker, int hour, int minute) {
//            Date alarm = new Date(today.getYear(), today.getMonth(), today.getDate(), hour,
//                    minute);
//            scheduleReminder(alarm.getTime(),reminder.getContent());
//        }
    };

}



