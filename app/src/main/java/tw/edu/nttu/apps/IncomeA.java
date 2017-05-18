package tw.edu.nttu.apps;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class IncomeA extends AppCompatActivity {
    ListView lv01;
    TextView tv06,tv07;
    Button bt04,bt05;

    String s0="您所選擇的日期是 ";
    String s1="";
    String s2="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_income);
        setupView();
    }

    private void setupView() {
        lv01 =(ListView)findViewById(R.id.lv01);
        tv06 =(TextView)findViewById(R.id.tv06);

        bt04 = (Button) findViewById(R.id.bt04);
        bt05 = (Button) findViewById(R.id.bt05);
        tv07 = (TextView) findViewById(R.id.tv07);
//        bt04.setOnClickListener(bt04Click);
//        bt05.setOnClickListener(bt05Click);
        Button.OnClickListener bt04Click =new Button.OnClickListener() {

            @Override
            public void onClick(View v) {
//                  Calendar now = Calendar.getInstance();
//                DatePickerDialog datePic = new DatePickerDialog(
//                       DatePicker.this,
//                        datePicListener,
//                        now.get(Calendar.YEAR),
//                        now.get(Calendar.MONTH)+1,
//                        now.get(Calendar.DAY_OF_MONTH)
//                );


            }
       };

//The arrayAdatper is the controller in our
//model-view-controller relationship. (controller)
        String[] str01 = new String[]{"生活費", "零用錢", "預收帳款", "薪資", "投資報酬", "其他收入"};
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_item,
                str01
        );

        lv01.setAdapter(arrayAdapter);
        lv01.setOnItemClickListener(lv01Click);
    }

    AdapterView.OnItemClickListener lv01Click = new AdapterView.OnItemClickListener(){

        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            TextView lv02= (TextView) view;
            tv06.setText(lv02.getText().toString());
            Toast.makeText(getApplicationContext(), "clicked", Toast.LENGTH_LONG).show();
        }
    };

    //Remainder of the class listing omitted for brevity
}