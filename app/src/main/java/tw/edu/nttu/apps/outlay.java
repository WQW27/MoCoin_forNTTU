package tw.edu.nttu.apps;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class outlay extends AppCompatActivity {

    private TextView inputmoney_tx; //金額
    private boolean firstinput = true;  //判定是否第一次輸入
    private boolean contiOperate = false; //判定是否為連續加減乘除
    private int lastmoney; //儲存最後一次計算的金額
    private int result = 0; //等於鍵時用到的
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
        Button num_3_bt=(Button) findViewById(R.id.num_3_bt);
        Button num_4_bt=(Button) findViewById(R.id.num_4_bt);
        Button num_5_bt=(Button) findViewById(R.id.num_5_bt);
        Button num_6_bt=(Button) findViewById(R.id.num_6_bt);
        Button num_7_bt=(Button) findViewById(R.id.num_7_bt);
        Button num_8_bt=(Button) findViewById(R.id.num_8_bt);
        Button num_9_bt=(Button) findViewById(R.id.num_9_bt);
        Button num_0_bt=(Button) findViewById(R.id.num_0_bt);
        Button plus_bt = (Button) findViewById(R.id.plus_bt);
        Button minus_bt = (Button) findViewById(R.id.minus_bt);
        Button times_bt = (Button) findViewById(R.id.times_bt);
        Button divied_bt = (Button) findViewById(R.id.divied_bt);
        Button back_bt = (Button) findViewById(R.id.back_bt);
        Button equals_bt = (Button) findViewById(R.id.equals_bt);
        Button clear_bt = (Button) findViewById(R.id.clear_bt);
        Button write_bt = (Button) findViewById(R.id.write_bt);

        inputmoney_tx=(TextView) findViewById(R.id.inputmoney_tx);

        num_1_bt.setOnClickListener(num_1_click);
        num_2_bt.setOnClickListener(num_2_click);
        num_3_bt.setOnClickListener(num_3_click);
        num_4_bt.setOnClickListener(num_4_click);
        num_5_bt.setOnClickListener(num_5_click);
        num_6_bt.setOnClickListener(num_6_click);
        num_7_bt.setOnClickListener(num_7_click);
        num_8_bt.setOnClickListener(num_8_click);
        num_9_bt.setOnClickListener(num_9_click);
        num_0_bt.setOnClickListener(num_0_click);

        plus_bt.setOnClickListener(plus_click);
        minus_bt.setOnClickListener(minus_click);
        times_bt.setOnClickListener(times_click);
        divied_bt.setOnClickListener(divied_click);
        back_bt.setOnClickListener(back_click);
        clear_bt.setOnClickListener(clear_click);
        equals_bt.setOnClickListener(equals_click);


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
    //3號鍵
    Button.OnClickListener num_3_click = new Button.OnClickListener(){
        @Override
        public void onClick(View v) {
            if (firstinput)
                inputmoney_tx.setText("3");
            else
            if (inputmoney_tx.getText() == "0"){
                inputmoney_tx.setText("3");
            }
            else {
                inputmoney_tx.setText(inputmoney_tx.getText()+"3");
            }
            firstinput = false;
        }
    };
    //4號鍵
    Button.OnClickListener num_4_click = new Button.OnClickListener(){
        @Override
        public void onClick(View v) {
            if (firstinput)
                inputmoney_tx.setText("4");
            else
            if (inputmoney_tx.getText() == "0"){
                inputmoney_tx.setText("4");
            }
            else {
                inputmoney_tx.setText(inputmoney_tx.getText()+"4");
            }
            firstinput = false;
        }
    };
    //5號鍵
    Button.OnClickListener num_5_click = new Button.OnClickListener(){
        @Override
        public void onClick(View v) {
            if (firstinput)
                inputmoney_tx.setText("5");
            else
            if (inputmoney_tx.getText() == "0"){
                inputmoney_tx.setText("5");
            }
            else {
                inputmoney_tx.setText(inputmoney_tx.getText()+"5");
            }
            firstinput = false;
        }
    };
    //6號鍵
    Button.OnClickListener num_6_click = new Button.OnClickListener(){
        @Override
        public void onClick(View v) {
            if (firstinput)
                inputmoney_tx.setText("6");
            else
            if (inputmoney_tx.getText() == "0"){
                inputmoney_tx.setText("6");
            }
            else {
                inputmoney_tx.setText(inputmoney_tx.getText()+"6");
            }
            firstinput = false;
        }
    };
    //7號鍵
    Button.OnClickListener num_7_click = new Button.OnClickListener(){
        @Override
        public void onClick(View v) {
            if (firstinput)
                inputmoney_tx.setText("7");
            else
            if (inputmoney_tx.getText() == "0"){
                inputmoney_tx.setText("7");
            }
            else {
                inputmoney_tx.setText(inputmoney_tx.getText()+"7");
            }
            firstinput = false;
        }
    };
    //8號鍵
    Button.OnClickListener num_8_click = new Button.OnClickListener(){
        @Override
        public void onClick(View v) {
            if (firstinput)
                inputmoney_tx.setText("8");
            else
            if (inputmoney_tx.getText() == "0"){
                inputmoney_tx.setText("8");
            }
            else {
                inputmoney_tx.setText(inputmoney_tx.getText()+"8");
            }
            firstinput = false;
        }
    };
    //9號鍵
    Button.OnClickListener num_9_click = new Button.OnClickListener(){
        @Override
        public void onClick(View v) {
            if (firstinput)
                inputmoney_tx.setText("9");
            else
            if (inputmoney_tx.getText() == "0"){
                inputmoney_tx.setText("9");
            }
            else {
                inputmoney_tx.setText(inputmoney_tx.getText()+"9");
            }
            firstinput = false;
        }
    };
    //0號鍵
    Button.OnClickListener num_0_click = new Button.OnClickListener(){
        @Override
        public void onClick(View v) {
            if (firstinput)
                inputmoney_tx.setText("0");
            else
            if (inputmoney_tx.getText() == "0"){
                inputmoney_tx.setText("0");
            }
            else {
                inputmoney_tx.setText(inputmoney_tx.getText()+"0");
            }
            firstinput = false;
        }
    };

    //+號鍵
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
                        case '-':
                            temp_money = lastmoney - Integer.parseInt(inputmoney_tx.getText().toString());
                            break;
                        case '*':
                            temp_money = lastmoney * Integer.parseInt(inputmoney_tx.getText().toString());
                            break;
                        case '/':
                            temp_money = lastmoney / Integer.parseInt(inputmoney_tx.getText().toString());
                            break;
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

    //-號鍵
    Button.OnClickListener minus_click = new Button.OnClickListener(){
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
                        case '-':
                            temp_money = lastmoney - Integer.parseInt(inputmoney_tx.getText().toString());
                            break;
                        case '*':
                            temp_money = lastmoney * Integer.parseInt(inputmoney_tx.getText().toString());
                            break;
                        case '/':
                            temp_money = lastmoney / Integer.parseInt(inputmoney_tx.getText().toString());
                            break;
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
                    lastOperate = '-';
                    lastmoney = Integer.parseInt(inputmoney_tx.getText().toString());
                    inputmoney_tx.setText("0");
                }
            }
        }
    };

    //*號鍵
    Button.OnClickListener times_click = new Button.OnClickListener(){
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
                        case '-':
                            temp_money = lastmoney - Integer.parseInt(inputmoney_tx.getText().toString());
                            break;
                        case '*':
                            temp_money = lastmoney * Integer.parseInt(inputmoney_tx.getText().toString());
                            break;
                        case '/':
                            temp_money = lastmoney / Integer.parseInt(inputmoney_tx.getText().toString());
                            break;
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
                    lastOperate = '*';
                    lastmoney = Integer.parseInt(inputmoney_tx.getText().toString());
                    inputmoney_tx.setText("0");
                }
            }
        }
    };

    //除號鍵
    Button.OnClickListener divied_click = new Button.OnClickListener(){
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
                        case '-':
                            temp_money = lastmoney - Integer.parseInt(inputmoney_tx.getText().toString());
                            break;
                        case '*':
                            temp_money = lastmoney * Integer.parseInt(inputmoney_tx.getText().toString());
                            break;
                        case '/':
                            temp_money = lastmoney / Integer.parseInt(inputmoney_tx.getText().toString());
                            break;
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
                    lastOperate = '/';
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

    //倒退鍵
    Button.OnClickListener back_click = new Button.OnClickListener(){
        @Override
        public void onClick(View v) {
            if (firstinput)
                inputmoney_tx.setText("輸入金額");
            else
                if (inputmoney_tx.getText().toString().length()==1){
                    inputmoney_tx.setText("0");
                }
                else {
                    inputmoney_tx.setText(inputmoney_tx.getText().toString().substring(0, inputmoney_tx.getText().toString().length() - 1));
                }

        }
    };

    //等於鍵
    Button.OnClickListener equals_click = new Button.OnClickListener(){
        @Override
        public void onClick(View v){
            if (firstinput)
                inputmoney_tx.setText("輸入金額");
            else {
                if (contiOperate){
                    result = 0;
                    int temp_money = Integer.parseInt(inputmoney_tx.getText().toString());
                    switch (lastOperate){
                        case '+':
                            result = lastmoney + temp_money;
                            break;
                        case '-':
                            result = lastmoney - temp_money;
                            break;
                        case '*':
                            result = lastmoney * temp_money;
                            break;
                        case '/':
                            result = lastmoney / temp_money;
                            break;
                        default:
                            break;
                    }
                    inputmoney_tx.setText(String.valueOf(result));
                    contiOperate = false;
                }
                else {
                    result = Integer.parseInt(inputmoney_tx.getText().toString());
                    inputmoney_tx.setText(String.valueOf(result));
                }
            }
        }
    };

}
