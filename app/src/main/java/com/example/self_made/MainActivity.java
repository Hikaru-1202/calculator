package com.example.self_made;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button num_1,num_2,num_3,num_4,num_5,num_6,num_7,num_8,num_9,num_0,num_add,num_min,num_mul,num_div,num_eq,num_C;
    private String number_1,number_2,number_3,number_4,number_5,number_6,number_7,number_8,number_9,number_0,number_add,number_min,number_mul,number_div,number_eq,number_C;
    private TextView numres;
    private long numbox = 0;
    private long numint2 = 0;
    private boolean checker = false;
    private int arithmetic = 0;
    private long numrem = 0;
    private int arrayCounter = 0;
    private ArrayList<Integer> numInt = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        numres = findViewById(R.id.numLabel);
        numres.setText(String.valueOf(numbox));

        num_1 = findViewById(R.id.numBtn1);
        num_2 = findViewById(R.id.numBtn2);
        num_3 = findViewById(R.id.numBtn3);
        num_4 = findViewById(R.id.numBtn4);
        num_5 = findViewById(R.id.numBtn5);
        num_6 = findViewById(R.id.numBtn6);
        num_7 = findViewById(R.id.numBtn7);
        num_8 = findViewById(R.id.numBtn8);
        num_9 = findViewById(R.id.numBtn9);
        num_0 = findViewById(R.id.numBtn0);
        num_add = findViewById(R.id.numBtnadd);
        num_min = findViewById(R.id.numBtnmin);
        num_mul = findViewById(R.id.numBtnmul);
        num_div = findViewById(R.id.numBtndiv);
        num_eq = findViewById(R.id.numBtneq);
        num_C = findViewById(R.id.numBtnC);

        num_1.setOnClickListener(this);
        num_2.setOnClickListener(this);
        num_3.setOnClickListener(this);
        num_4.setOnClickListener(this);
        num_5.setOnClickListener(this);
        num_6.setOnClickListener(this);
        num_7.setOnClickListener(this);
        num_8.setOnClickListener(this);
        num_9.setOnClickListener(this);
        num_0.setOnClickListener(this);
        num_add.setOnClickListener(this);
        num_min.setOnClickListener(this);
        num_mul.setOnClickListener(this);
        num_div.setOnClickListener(this);
        num_eq.setOnClickListener(this);
        num_C.setOnClickListener(this);

        numberChecker();
    }
    private void numberChecker(){
        number_1 = "1";
        number_2 = "2";
        number_3 = "3";
        number_4 = "4";
        number_5 = "5";
        number_6 = "6";
        number_7 = "7";
        number_8 = "8";
        number_9 = "9";
        number_0 = "0";
        number_add = "+";
        number_min = "-";
        number_mul = "*";
        number_div = "/";
        number_eq = "=";
        number_C = "C";
    }

    //ここにクラス作成予定
    /*
    public class calculation{
        if(arithmetic == 1){
            numres.setText(String.valueOf(numbox+"+"+numint2));
        } else if (arithmetic == 2) {
            numres.setText(String.valueOf(numbox+"-"+numint2));
        } else if (arithmetic == 3) {
            numres.setText(String.valueOf(numbox+"*"+numint2));
        }else {
            numres.setText(String.valueOf(numbox+"/"+numint2));
        }
    }
    */

    @Override
    public void onClick(View v) {
        Button numBtn = findViewById(v.getId());
        String btnText = numBtn.getText().toString();
        if (btnText.equals(number_1)){
            if (checker ==false){
                numbox = numbox*10+1;
                numres.setText(String.valueOf(numbox));
            }else {
                numint2 = numint2*10+1;
                if(arithmetic == 1){
                    numres.setText(String.valueOf(numbox+"+"+numint2));
                } else if (arithmetic == 2) {
                    numres.setText(String.valueOf(numbox+"-"+numint2));
                } else if (arithmetic == 3) {
                    numres.setText(String.valueOf(numbox+"*"+numint2));
                }else {
                    numres.setText(String.valueOf(numbox+"/"+numint2));
                }
            }
        } else if (btnText.equals(number_2)) {
            if (checker ==false){
                numbox = numbox*10+2;
                numres.setText(String.valueOf(numbox));
            }else {
                numint2 = numint2*10+2;
                if(arithmetic == 1){
                    numres.setText(String.valueOf(numbox+"+"+numint2));
                } else if (arithmetic == 2) {
                    numres.setText(String.valueOf(numbox+"-"+numint2));
                } else if (arithmetic == 3) {
                    numres.setText(String.valueOf(numbox+"*"+numint2));
                }else {
                    numres.setText(String.valueOf(numbox+"/"+numint2));
                }
            }
        } else if (btnText.equals(number_3)) {
            if (checker ==false){
                numbox = numbox*10+3;
                numres.setText(String.valueOf(numbox));
            }else {
                numint2 = numint2*10+3;
                if(arithmetic == 1){
                    numres.setText(String.valueOf(numbox+"+"+numint2));
                } else if (arithmetic == 2) {
                    numres.setText(String.valueOf(numbox+"-"+numint2));
                } else if (arithmetic == 3) {
                    numres.setText(String.valueOf(numbox+"*"+numint2));
                }else {
                    numres.setText(String.valueOf(numbox+"/"+numint2));
                }
            }
        } else if (btnText.equals(number_4)) {
            if (checker ==false){
                numbox = numbox*10+4;
                numres.setText(String.valueOf(numbox));
            }else {
                numint2 = numint2*10+4;
                if(arithmetic == 1){
                    numres.setText(String.valueOf(numbox+"+"+numint2));
                } else if (arithmetic == 2) {
                    numres.setText(String.valueOf(numbox+"-"+numint2));
                } else if (arithmetic == 3) {
                    numres.setText(String.valueOf(numbox+"*"+numint2));
                }else {
                    numres.setText(String.valueOf(numbox+"/"+numint2));
                }
            }
        } else if (btnText.equals(number_5)) {
            if (checker ==false){
                numbox = numbox*10+5;
                numres.setText(String.valueOf(numbox));
            }else {
                numint2 = numint2*10+5;
                if(arithmetic == 1){
                    numres.setText(String.valueOf(numbox+"+"+numint2));
                } else if (arithmetic == 2) {
                    numres.setText(String.valueOf(numbox+"-"+numint2));
                } else if (arithmetic == 3) {
                    numres.setText(String.valueOf(numbox+"*"+numint2));
                }else {
                    numres.setText(String.valueOf(numbox+"/"+numint2));
                }
            }
        } else if (btnText.equals(number_6)) {
            if (checker ==false){
                numbox = numbox*10+6;
                numres.setText(String.valueOf(numbox));
            }else {
                numint2 = numint2*10+6;
                if(arithmetic == 1){
                    numres.setText(String.valueOf(numbox+"+"+numint2));
                } else if (arithmetic == 2) {
                    numres.setText(String.valueOf(numbox+"-"+numint2));
                } else if (arithmetic == 3) {
                    numres.setText(String.valueOf(numbox+"*"+numint2));
                }else {
                    numres.setText(String.valueOf(numbox+"/"+numint2));
                }
            }
        } else if (btnText.equals(number_7)) {
            if (checker ==false){
                numbox = numbox*10+7;
                numres.setText(String.valueOf(numbox));
            }else {
                numint2 = numint2*10+7;
                if(arithmetic == 1){
                    numres.setText(String.valueOf(numbox+"+"+numint2));
                } else if (arithmetic == 2) {
                    numres.setText(String.valueOf(numbox+"-"+numint2));
                } else if (arithmetic == 3) {
                    numres.setText(String.valueOf(numbox+"*"+numint2));
                }else {
                    numres.setText(String.valueOf(numbox+"/"+numint2));
                }
            }
        } else if (btnText.equals(number_8)) {
            if (checker ==false){
                numbox = numbox*10+8;
                numres.setText(String.valueOf(numbox));
            }else {
                numint2 = numint2*10+8;
                if(arithmetic == 1){
                    numres.setText(String.valueOf(numbox+"+"+numint2));
                } else if (arithmetic == 2) {
                    numres.setText(String.valueOf(numbox+"-"+numint2));
                } else if (arithmetic == 3) {
                    numres.setText(String.valueOf(numbox+"*"+numint2));
                }else {
                    numres.setText(String.valueOf(numbox+"/"+numint2));
                }
            }
        } else if (btnText.equals(number_9)) {
            if (checker ==false){
                numbox = numbox*10+9;
                numres.setText(String.valueOf(numbox));
            }else {
                numint2 = numint2*10+9;
                if(arithmetic == 1){
                    numres.setText(String.valueOf(numbox+"+"+numint2));
                } else if (arithmetic == 2) {
                    numres.setText(String.valueOf(numbox+"-"+numint2));
                } else if (arithmetic == 3) {
                    numres.setText(String.valueOf(numbox+"*"+numint2));
                }else {
                    numres.setText(String.valueOf(numbox+"/"+numint2));
                }
            }
        } else if (btnText.equals(number_0)) {
            if (checker ==false){
                numbox = numbox*10;
                numres.setText(String.valueOf(numbox));
            }else {
                numint2 = numint2*10;
                if(arithmetic == 1){
                    numres.setText(String.valueOf(numbox+"+"+numint2));
                } else if (arithmetic == 2) {
                    numres.setText(String.valueOf(numbox+"-"+numint2));
                } else if (arithmetic == 3) {
                    numres.setText(String.valueOf(numbox+"*"+numint2));
                }else {
                    numres.setText(String.valueOf(numbox+"/"+numint2));
                }
            }
        } else if (btnText.equals(number_add)) {
            checker = true;
            arithmetic = 1;
            numInt.add((int) numbox);
            numres.setText(String.valueOf(numInt.get(arrayCounter))+"+");
            arrayCounter++;
        } else if (btnText.equals(number_min)) {
            checker = true;
            arithmetic = 2;
            numres.setText(String.valueOf(numbox)+"-");
        } else if (btnText.equals(number_mul)) {
            checker = true;
            arithmetic = 3;
            numres.setText(String.valueOf(numbox)+"*");
        } else if (btnText.equals(number_div)) {
            checker = true;
            arithmetic = 4;
            numres.setText(String.valueOf(numbox)+"/");
        } else if (btnText.equals(number_eq)) {
            if(arithmetic == 1){
                numbox += numint2;
                numres.setText(String.valueOf(numbox));
                numint2 = 0;
                checker = false;
            } else if (arithmetic == 2) {
                numbox -= numint2;
                numres.setText(String.valueOf(numbox));
                numint2 = 0;
                checker = false;
            } else if (arithmetic == 3) {
                numbox *= numint2;
                numres.setText(String.valueOf(numbox));
                numint2 = 0;
                checker = false;
            }else {
                if (numint2 == 0){
                    numres.setText("Error");
                    numint2 = 0;
                    checker = false;
                }else {
                    numrem = numbox%numint2;
                    numbox /= numint2;
                    if (numrem == 0){
                        numres.setText(String.valueOf(numbox));
                    }else {
                        numres.setText(String.valueOf(numbox)+"…"+numrem);
                    }
                    numint2 = 0;
                    checker = false;
                }
            }
        } else if (btnText.equals(number_C)) {
            numbox = 0;
            numint2 = 0;
            checker = false;
            numres.setText(String.valueOf(numbox));
        }
    }
}