package tw.edu.nttu.apps;

import android.content.Intent;
import android.icu.util.Calendar;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;




public class Interface extends AppCompatActivity {

    Button to_outlay; //支出按鈕

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_interface);
        setupView();

    }
    //元件切換
    private void setupView(){
        to_outlay=(Button) findViewById(R.id.to_outlay_bt);
        to_outlay.setOnClickListener(to_outlay_bt_Click);
    }
    //to_outlay按鈕運作
    Button.OnClickListener to_outlay_bt_Click = new Button.OnClickListener(){
        @Override
        public void onClick(View v) {
            Intent i01 = new Intent(getApplicationContext(),outlay.class);
            startActivity(i01);
        }

    };

}
