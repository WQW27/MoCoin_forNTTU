package tw.edu.nttu.apps;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class ExpenditureA extends AppCompatActivity {
    ListView lv03;
    TextView tv05;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_expenditure);
        setupView();
    }

    private void setupView() {
        lv03 =(ListView)findViewById(R.id.lv03);
        tv05 =(TextView)findViewById(R.id.tv05);
//The arrayAdatper is the controller in our
//model-view-controller relationship. (controller)
        String[] str01 = new String[]{"餐飲", "生活用品", "水費", "電費", "房租", "通訊費","交通費","娛樂","社交費","其他支出"};
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_spinner_item,
                str01
        );

        lv03.setAdapter(arrayAdapter);
        lv03.setOnItemClickListener(lv01Click);
    }

    AdapterView.OnItemClickListener lv01Click = new AdapterView.OnItemClickListener(){

        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
            TextView lv02= (TextView) view;
            tv05.setText(lv02.getText().toString());
            Toast.makeText(getApplicationContext(), "clicked", Toast.LENGTH_LONG).show();
        }
    };

    //Remainder of the class listing omitted for brevity
}




