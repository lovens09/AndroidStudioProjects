package com.example.calculatorex;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView affichage;
    EditText nombreentree;
    Button Button1, Button2, Button3, Button4, Button5, Button6, Button7, Button8, Button9, Button0, ButtonDot, ButtonC, ButtonEgal, ButtonDiv, ButtonMult, ButtonPlus, ButtonMoins;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        affichage = (TextView)findViewById(R.id.infoTextView);
        Button0 = (Button) findViewById(R.id.buttonZero)
        Button1 = (Button) findViewById(R.id.buttonOne);
        Button2 = (Button) findViewById(R.id.buttonTwo);
        Button3 = (Button) findViewById(R.id.buttonThree);
        Button4 = (Button) findViewById(R.id.buttonFour);
        Button5 = (Button) findViewById(R.id.buttonFive);
        Button6 = (Button) findViewById(R.id.buttonSix);
        Button7 = (Button) findViewById(R.id.buttonSeven);
        Button8 = (Button) findViewById(R.id.buttonEight);
        Button9 = (Button) findViewById(R.id.buttonNine);
        ButtonEgal = (Button) findViewById(R.id.buttonEqual);
        ButtonDiv = (Button) findViewById(R.id.buttonDivide);
        ButtonMult = (Button) findViewById(R.id.buttonMultiply);
        ButtonPlus = (Button) findViewById(R.id.buttonAdd);
        ButtonMoins = (Button) findViewById(R.id.buttonSubtract);
        ButtonC = (Button) findViewById(R.id.buttonClear);
        nombreentree = (EditText) findViewById(R.id.editText);

        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nombreentree.setText(nombreentree.getText() + "1");
            }
        });

        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nombreentree.setText(nombreentree.getText() + "2");
            }
        });

        Button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nombreentree.setText(nombreentree.getText() + "3");
            }
        });

        Button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nombreentree.setText(nombreentree.getText() + "4");
            }
        });

        Button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nombreentree.setText(nombreentree.getText() + "5");
            }
        });

        Button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nombreentree.setText(nombreentree.getText() + "6");
            }
        });

        Button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nombreentree.setText(nombreentree.getText() + "7");
            }
        });

        Button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nombreentree.setText(nombreentree.getText() + "8");
            }
        });

        Button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nombreentree.setText(nombreentree.getText() + "9");
            }
        });

        Button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nombreentree.setText(nombreentree.getText() + "0");
            }
        });

        ButtonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nombreentree.setText("");
            }
        });




    }
}
