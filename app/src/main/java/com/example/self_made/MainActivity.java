package com.example.self_made;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private final String number_add = "+";
    private final String number_min = "-";
    private final String number_mul = "*";
    private final String number_div = "/";
    //テキスト出力
    private TextView numres;
    //計算式第一項
    private double numDoub1 = 0;
    //計算式第二項
    private double numDoub2 = 0;
    //計算式の項判定
    private boolean checker = false;

    //四則演算判定
    private int arithmetic = 0;
    private final int arithmetic_default =0;
    private final int arithmetic_add =1;
    private final int arithmetic_min =2;
    private final int arithmetic_mul =3;
    private final int arithmetic_div =4;
    //第二項に入力
    private boolean firstInput = false;
    private boolean isNumber = false;

    DecimalFormat df = new DecimalFormat("0.################");





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
        numres.setText(df.format(numDoub1));

        Button num_1 = findViewById(R.id.numBtn1);
        Button num_2 = findViewById(R.id.numBtn2);
        Button num_3 = findViewById(R.id.numBtn3);
        Button num_4 = findViewById(R.id.numBtn4);
        Button num_5 = findViewById(R.id.numBtn5);
        Button num_6 = findViewById(R.id.numBtn6);
        Button num_7 = findViewById(R.id.numBtn7);
        Button num_8 = findViewById(R.id.numBtn8);
        Button num_9 = findViewById(R.id.numBtn9);
        Button num_0 = findViewById(R.id.numBtn0);
        Button num_add = findViewById(R.id.numBtnadd);
        Button num_min = findViewById(R.id.numBtnmin);
        Button num_mul = findViewById(R.id.numBtnmul);
        Button num_div = findViewById(R.id.numBtndiv);
        Button num_eq = findViewById(R.id.numBtneq);
        Button num_C = findViewById(R.id.numBtnC);

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
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onClick(View v) {
        Button numBtn = findViewById(v.getId());
        String btnText = numBtn.getText().toString();

        //ボタン押下時に出力されるint型及びString型
        int number_1 = 1;
        int number_2 = 2;
        int number_3 = 3;
        int number_4 = 4;
        int number_5 = 5;
        int number_6 = 6;
        int number_7 = 7;
        int number_8 = 8;
        int number_9 = 9;
        int number_0 = 0;
        String number_eq = "=";
        String number_C = "C";
        if (btnText.equals(String.valueOf(number_1))){
            numberButton(number_1);
            isNum(true);

        } else if (btnText.equals(String.valueOf(number_2))) {
            numberButton(number_2);
            isNum(true);

        } else if (btnText.equals(String.valueOf(number_3))) {
            numberButton(number_3);
            isNum(true);

        } else if (btnText.equals(String.valueOf(number_4))) {
            numberButton(number_4);
            isNum(true);

        } else if (btnText.equals(String.valueOf(number_5))) {
            numberButton(number_5);
            isNum(true);

        } else if (btnText.equals(String.valueOf(number_6))) {
            numberButton(number_6);
            isNum(true);

        } else if (btnText.equals(String.valueOf(number_7))) {
            numberButton(number_7);
            isNum(true);

        } else if (btnText.equals(String.valueOf(number_8))) {
            numberButton(number_8);
            isNum(true);

        } else if (btnText.equals(String.valueOf(number_9))) {
            numberButton(number_9);
            isNum(true);

        } else if (btnText.equals(String.valueOf(number_0))) {
            numberButton(number_0);
            isNum(true);

        } else if (btnText.equals(number_add)) {
            if (isNotNumber()) {
                arithCheck(arithmetic_add);
            } else {
                if (!checker) {
                    checker = true;
                } else {
                    additionalCalculation();
                }
                arithmetic = arithmetic_add;
                numDoub2 = numDoub1;
                numres.setText(df.format(numDoub1) + "+");
                firstInput = false;
            }
            isNum(false);
        } else if (btnText.equals(number_min)) {
            if (isNotNumber()) {
                arithCheck(arithmetic_min);
            } else {
                if (!checker) {
                    checker = true;
                } else {
                    additionalCalculation();
                }
                arithmetic = arithmetic_min;
                numDoub2 = numDoub1;
                numres.setText(df.format(numDoub1) + "-");
                firstInput = false;
            }
            isNum(false);

        } else if (btnText.equals(number_mul)) {
            if (isNotNumber()) {
                arithmetic = arithmetic_mul;
                arithCheck(arithmetic_mul);
            } else {
                if (!checker) {
                    checker = true;
                } else {
                    additionalCalculation();
                }
                arithmetic = arithmetic_mul;
                numDoub2 = numDoub1;
                numres.setText(df.format(numDoub1) + "*");
                firstInput = false;
            }
            isNum(false);

        } else if (btnText.equals(number_div)) {
            if (isNotNumber()) {
                arithCheck(arithmetic_div);
            } else {
                if (!checker) {
                    checker = true;
                } else {
                    additionalCalculation();
                }
                arithmetic = arithmetic_div;
                numDoub2 = numDoub1;
                numres.setText(df.format(numDoub1) + "/");
                firstInput = false;
            }
            isNum(false);

        } else if (btnText.equals(number_eq)) {
            if(arithmetic == arithmetic_add){
                numDoub1 += numDoub2;
                numres.setText(df.format(numDoub1));
            } else if (arithmetic == arithmetic_min) {
                numDoub1 -= numDoub2;
                numres.setText(df.format(numDoub1));
            } else if (arithmetic == arithmetic_mul) {
                numDoub1 *= numDoub2;
                numres.setText(df.format(numDoub1));
            }else if (arithmetic == arithmetic_div){
                if (numDoub2 == 0){
                    numres.setText("Error");
                    numDoub1 = 0;
                    numDoub2 = 0;
                    checker = false;
                    arithmetic = arithmetic_default;
                }else {
                    numDoub1 /= numDoub2;
                    numres.setText(df.format(numDoub1));
                }
            }else {
                numres.setText(df.format(numDoub1));
            }
            firstInput = false;
            isNum(false);

        } else if (btnText.equals(number_C)) {
            numDoub1 = 0;
            numDoub2 = 0;
            checker = false;
            firstInput = false;
            arithmetic = arithmetic_default;
            numres.setText(df.format(numDoub1));
            isNum(false);

        }
    }

    // 数値の場合
    private void isNum(boolean bool) {
        isNumber = bool;
    }

    private boolean isNotNumber() {
        return !isNumber;
    }


    // 四則演算子のみ更新する
    @SuppressLint("SetTextI18n")
    private void arithCheck(int a){
        String arithStr = "";
        if (a == arithmetic_add){
            arithStr = number_add;
        } else if (a == arithmetic_min) {
            arithStr = number_min;
        } else if (a == arithmetic_mul) {
            arithStr = number_mul;
        } else if (a == arithmetic_div) {
            arithStr = number_div;
        }
        arithmetic = a;
        numres.setText(df.format(numDoub1)+ arithStr);
        checker = true;
    }


    //テキスト出力
    private String connectSolution(String numStr1, String numStr2) {
        String connectStr = "";
        if(arithmetic == arithmetic_add){//四則演算判定
            connectStr = number_add;
        } else if (arithmetic == arithmetic_min) {
            connectStr = number_min;
        } else if (arithmetic == arithmetic_mul) {
            connectStr = number_mul;
        }else if (arithmetic == arithmetic_div){
            connectStr = number_div;
        }
        return numStr1 + connectStr + numStr2;
    }


    //追加計算
    @SuppressLint("SetTextI18n")
    private void additionalCalculation(){
        if (arithmetic == arithmetic_add) {
            numDoub1 += numDoub2;
        } else if (arithmetic == arithmetic_min) {
            numDoub1 -= numDoub2;
        } else if (arithmetic == arithmetic_mul) {
            numDoub1 *= numDoub2;
        } else if (arithmetic == arithmetic_div) {
            if (numDoub2 == 0) {
                numres.setText("Error");
                numDoub1 = 0;
                numDoub2 = 0;
                checker = false;
                arithmetic = arithmetic_default;
            } else {
                numDoub1 /= numDoub2;
            }
        }
    }

    //数字キー入力
    private void numberButton(int a){//名前を分かりやすく
        if (!checker){//項の判定
            numDoub1 = numDoub1 *10+a;
            numres.setText(df.format(numDoub1));
        }else {
            if (!firstInput){
                firstInput = true;
                numDoub2 = 0;
                numDoub2 = numDoub2 *10+a;
                String numStr1 = df.format(numDoub1);
                String numStr2 = df.format(numDoub2);
                numres.setText(connectSolution(numStr1, numStr2));
            }else {
                numDoub2 = numDoub2 *10+a;
                String numStr1 = df.format(numDoub1);
                String numStr2 = df.format(numDoub2);
                numres.setText(connectSolution(numStr1, numStr2));
            }
        }
    }
}