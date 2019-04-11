package com.example.numbertowords;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {

    private Button btnClick;
    private EditText etNum;
    private TextView tvOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClick=findViewById(R.id.btnConvert);
        etNum=findViewById(R.id.etNumber);
        tvOut=findViewById(R.id.tvOut);


        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!validate()){
                    return;
                }
                int number =Integer.parseInt(etNum.getText().toString());
                NumberConvert numconv=new NumberConvert();
                String numWord=numconv.conversion(number);
                tvOut.setText(numWord);
                etNum.setText("");
            }
        });

    }
    public boolean validate(){
        boolean isValid=true;
        if(TextUtils.isEmpty(etNum.getText().toString())){
            etNum.setError("Please Enter Number");
            etNum.requestFocus();
            isValid=false;

        }return isValid;
    }
}
