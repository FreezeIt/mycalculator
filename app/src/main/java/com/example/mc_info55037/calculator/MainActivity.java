package com.example.mc_info55037.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements CalculatorListener {
    TextView firstOperand, secondOperand, resultTextView;
    Double first, second, result;
    MainController mainController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainController = new MainController();
        mainController.setListener(this);
        setContentView(R.layout.activity_main);
        firstOperand = (TextView) findViewById(R.id.operand_one_edit_text);
        secondOperand = (TextView) findViewById(R.id.operand_two_edit_text);
        resultTextView = (TextView) findViewById(R.id.operation_result_text_view);
    }

    public void onAdd(View view) {
        first = Double.parseDouble(firstOperand.getText().toString());
        second = Double.parseDouble(secondOperand.getText().toString());
        mainController.add(first, second);
    }

    public void onSub(View view) {
        first = Double.parseDouble(firstOperand.getText().toString());
        second = Double.parseDouble(secondOperand.getText().toString());
        mainController.sub(first, second);
    }

    public void onMul(View view) {
        first = Double.parseDouble(firstOperand.getText().toString());
        second = Double.parseDouble(secondOperand.getText().toString());
        mainController.mul(first, second);
    }

    public void onDiv(View view) {
        first = Double.parseDouble(firstOperand.getText().toString());
        second = Double.parseDouble(secondOperand.getText().toString());
        mainController.div(first, second);
    }

    @Override
    public void onSuccess(String result) {
        resultTextView.setText(String.valueOf(result));
    }
}
