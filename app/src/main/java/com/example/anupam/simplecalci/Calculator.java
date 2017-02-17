package com.example.anupam.simplecalci;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;




public class Calculator extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG ="Calculator" ;
    Button Add;
    Button Subtract;
    Button Multiply;
    Button Divide;
    Button Clear;
    Button Equal;
    Button num1;
    Button num2;
    Button num3;
    Button num4;
    Button num5;
    Button num6;
    Button num7;
    Button num8;
    Button num9;
    Button num0;
    EditText Editable;
    int getvalue1, getValue2;
    boolean add_bool, subtract_bool, divide_bool, multiply_bool;

    String oper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        // find the elements
        Editable=(EditText)findViewById(R.id.Editable);
        Add=(Button)findViewById(R.id.Add);
        Subtract=(Button)findViewById(R.id.Subtract);
        Multiply=(Button)findViewById(R.id.Multiply);
        Divide=(Button)findViewById(R.id.Divide);
        Equal=(Button)findViewById(R.id.Equal);
        Clear=(Button)findViewById(R.id.Clear);
        num0=(Button)findViewById(R.id.num0);
        num1=(Button)findViewById(R.id.num1);
        num2=(Button)findViewById(R.id.num2);
        num3=(Button)findViewById(R.id.num3);
        num4=(Button)findViewById(R.id.num4);
        num5=(Button)findViewById(R.id.num5);
        num7=(Button)findViewById(R.id.num7);
        num8=(Button)findViewById(R.id.num8);
        num9=(Button)findViewById(R.id.num9);
        num6=(Button)findViewById(R.id.num6);

        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Editable == null){
                    Editable.setText("");
                }else {
                    getvalue1 = Integer.parseInt(Editable.getText().toString());
                    add_bool = true;
                    Editable.setText(null);
                }

            }
        });
        Subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getvalue1 = Integer.parseInt(Editable.getText().toString());
                subtract_bool = true;
                Editable.setText(null);
            }
        });
        Multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getvalue1 = Integer.parseInt(Editable.getText().toString());
                multiply_bool = true;
                Editable.setText(null);
            }
        });
        Divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getvalue1 = Integer.parseInt(Editable.getText().toString());
                divide_bool = true;
                Editable.setText(null);
            }
        });

        Equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                getValue2 = Integer.parseInt(Editable.getText().toString());
                Log.d(TAG,getvalue1 +"\n" +getValue2);

                if (add_bool == true){
                    int result=getvalue1+getValue2;
                    Editable.setText(result+"");
                    add_bool=false;
                }


                if (subtract_bool == true){
                    Log.d("response",getValue2+getvalue1+"");
                    int result= getvalue1 - getValue2;
                    Editable.setText(result+"");
                    subtract_bool=false;
                }

                if (multiply_bool == true){
                    int result= getvalue1*getValue2;
                    Editable.setText(result+"");
                    multiply_bool=false;
                }

                if (divide_bool == true){
                    int result= getvalue1 / getValue2;
                    Editable.setText(result+"");
                    divide_bool=false;
                }
            }
        });

        Clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Editable.setText("");

            }
        });

        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                   Editable.setText(Editable.getText()+"0");

            }
        });

        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Editable.setText(Editable.getText()+"1");
            }
        });

        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Editable.setText(Editable.getText() + "2");
            }
        });

        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Editable.setText(Editable.getText()+"3");
            }
        });

        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Editable.setText(Editable.getText()+"4");
            }
        });

        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Editable.setText(Editable.getText()+"5");
            }
        });

        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Editable.setText(Editable.getText()+"6");
            }
        });

        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Editable.setText(Editable.getText()+"7");
            }
        });

        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Editable.setText(Editable.getText()+"8");
            }
        });

        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Editable.setText(Editable.getText()+"9");
            }
        });



    }

    @Override
    public void onClick(View v) {
    }
}





