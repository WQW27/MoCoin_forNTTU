package tw.edu.nttu.apps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class outlay extends AppCompatActivity {

    private Button num_3_bt;
    private Button num_4_bt;
    private Button num_5_bt;
    private Button num_6_bt;
    private Button num_7_bt;
    private Button num_8_bt;
    private Button num_9_bt;
    private Button num_0_bt;
    private Button plus_bt;     //按鈕加
    private Button minus_bt;    //按鈕減
    private Button times_bt;    //按鈕乘
    private Button divied_bt;   //按鈕除
    private Button dot_bt;      //小數點
    private Button equals_bt;   //等於
    private Button write_bt;    //計入
    private Button clear_bt;    //清除內容
    private TextView inputmoney_tx; //金額
    private boolean firstinput = true;  //判定是否第一次輸入
    private boolean contiOperate = false; //判定是否為連續加減乘除
    private int lastmoney; //儲存最後一次計算的金額
    private char lastOperate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_outlay);
        setupView();

    }
    private void setupView(){
        Button num_1_bt = (Button) findViewById(R.id.num_1_bt);
        Button num_2_bt = (Button) findViewById(R.id.num_2_bt);
        num_3_bt=(Button) findViewById(R.id.num_3_bt);
        num_4_bt=(Button) findViewById(R.id.num_4_bt);
        num_5_bt=(Button) findViewById(R.id.num_5_bt);
        num_6_bt=(Button) findViewById(R.id.num_6_bt);
        num_7_bt=(Button) findViewById(R.id.num_7_bt);
        num_8_bt=(Button) findViewById(R.id.num_8_bt);
        num_9_bt=(Button) findViewById(R.id.num_9_bt);
        num_0_bt=(Button) findViewById(R.id.num_0_bt);
        plus_bt=(Button) findViewById(R.id.plus_bt);
        minus_bt=(Button) findViewById(R.id.minus_bt);
        times_bt=(Button) findViewById(R.id.times_bt);
        divied_bt=(Button) findViewById(R.id.divied_bt);
        dot_bt=(Button) findViewById(R.id.dot_bt);
        equals_bt=(Button) findViewById(R.id.equals_bt);
        write_bt=(Button) findViewById(R.id.write_bt);
        clear_bt=(Button) findViewById(R.id.clear_bt);

        inputmoney_tx=(TextView) findViewById(R.id.inputmoney_tx);

        num_1_bt.setOnClickListener(num_1_click);
        num_2_bt.setOnClickListener(num_2_click);

        plus_bt.setOnClickListener(plus_click);

        clear_bt.setOnClickListener(clear_click);


    }
    //計算機元件內容
    //1號鍵
    Button.OnClickListener num_1_click = new Button.OnClickListener(){
        @Override
        public void onClick(View v) {
            if (firstinput)
                inputmoney_tx.setText("1");
            else
                if (inputmoney_tx.getText() == "0"){
                    inputmoney_tx.setText("1");
                }
                else {
                inputmoney_tx.setText(inputmoney_tx.getText()+"1");
                }
            firstinput = false;
        }
    };
    //2號鍵
    Button.OnClickListener num_2_click = new Button.OnClickListener(){
        @Override
        public void onClick(View v) {
            if (firstinput)
                inputmoney_tx.setText("2");
            else
            if (inputmoney_tx.getText() == "0"){
                inputmoney_tx.setText("2");
            }
            else {
                inputmoney_tx.setText(inputmoney_tx.getText()+"2");
            }
            firstinput = false;
        }
    };
    Button.OnClickListener plus_click = new Button.OnClickListener(){
        @Override
        public void onClick(View v) {
            if(firstinput) {
                inputmoney_tx.setText("輸入金額");
            }
            else{
                if (contiOperate){
                    int temp_money = 0;
                    switch (lastOperate){
                        case '+':
                            temp_money = lastmoney + Integer.parseInt(inputmoney_tx.getText().toString());
                            break;
                        //case '-':

                        //case '*':

                        //case '/':

                        default:
                            break;
                    }
                    lastmoney = temp_money;
                    inputmoney_tx.setText(String.valueOf(temp_money));
                    contiOperate = false;
                }
                else {
                    contiOperate = true;
                    firstinput = false;
                    lastOperate = '+';
                    lastmoney = Integer.parseInt(inputmoney_tx.getText().toString());
                    inputmoney_tx.setText("0");
                }
            }
        }
    };
    //清除鍵
    Button.OnClickListener clear_click = new Button.OnClickListener(){
        @Override
        public void onClick(View v) {
            if (firstinput)
                inputmoney_tx.setText("輸入金額");
            else
                inputmoney_tx.setText("輸入金額");
                contiOperate = false;
                lastmoney = 0;
            firstinput = true;
        }
    };


}
