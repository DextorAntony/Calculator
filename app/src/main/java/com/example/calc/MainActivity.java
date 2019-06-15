package com.example.calc;
/**
 * Created by DextorAntony on 15/6/19.
 */
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {





        private double input1 = 0;
    private double input2 = 0;
        private TextView edt1,res;
        private boolean Addition;
    private boolean Subtract;
    private boolean Multiplication;
    private boolean Division;
    private boolean mRemainder;
    private boolean decimal;
    private Button buttonDel;
    private Button Remainder;
    Button dot;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            Button button0 = findViewById(R.id.z);
            Button button1 = findViewById(R.id.b1);
            Button button2 = findViewById(R.id.b2);
            Button button3 = findViewById(R.id.b3);
            Button button4 = findViewById(R.id.b4);
            Button button5 = findViewById(R.id.b5);
            Button button6 = findViewById(R.id.b6);
            Button button7 = findViewById(R.id.b7);
            Button button8 = findViewById(R.id.b8);
            Button button9 = findViewById(R.id.b9);
            Button buttonDot = findViewById(R.id.dot);
            Button buttonAdd = findViewById(R.id.badd);
            Button buttonSub = findViewById(R.id.bsub);
            Button buttonMul = findViewById(R.id.bmul);
            res=findViewById(R.id.res);
            Button buttonDivision = findViewById(R.id.bmod);

    buttonDel = (Button) findViewById(R.id.clear);
            Button buttonEqual = findViewById(R.id.eq);

            edt1 = findViewById(R.id.display);

            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    edt1.setText(String.format("%s1", edt1.getText().toString()));
                }
            });

            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    edt1.setText(String.format("%s2", edt1.getText().toString()));
                }
            });

            button3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    edt1.setText(String.format("%s3", edt1.getText().toString()));
                }
            });

            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    edt1.setText(String.format("%s4", edt1.getText().toString()));
                }
            });

            button5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    edt1.setText(String.format("%s5", edt1.getText().toString()));
                }
            });

            button6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    edt1.setText(String.format("%s6", edt1.getText().toString()));
                }
            });

            button7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    edt1.setText(String.format("%s7", edt1.getText().toString()));
                }
            });

            button8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    edt1.setText(String.format("%s8", edt1.getText().toString()));
                }
            });

            button9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    edt1.setText(String.format("%s9", edt1.getText().toString()));
                }
            });

            button0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    edt1.setText(String.format("%s0", edt1.getText().toString()));

                }
            });

            buttonAdd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (edt1.getText().length() != 0) {
                        input1 = Float.parseFloat(edt1.getText().toString() + "");
                        Addition = true;
                        decimal = false;
                        edt1.setText(null);
                        res.setText(null);
                        res.setText(input1+"+");
                    }
                }
            });

            buttonSub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (edt1.getText().length() != 0) {
                        input1 = Float.parseFloat(edt1.getText().toString() + "");
                        Subtract = true;
                        decimal = false;
                        edt1.setText(null);
                        res.setText(null);
                        res.setText(input1+"-");
                    }
                }
            });

            buttonMul.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (edt1.getText().length() != 0) {
                        input1 = Float.parseFloat(edt1.getText().toString() + "");
                        Multiplication = true;
                        decimal = false;
                        edt1.setText(null);
                        res.setText(null);
                        res.append(input1+"*");
                    }
                }
            });

            buttonDel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    edt1.setText("");
                    res.setText("");
                    input1 = 0.0;
                    input2 = 0.0;
                }
            });
            buttonDivision.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (edt1.getText().length() != 0) {
                        input1 = Float.parseFloat(edt1.getText().toString() + "");
                        Division = true;
                        decimal = false;
                        edt1.setText(null);
                        res.append(input1+"/");
                    }
                }
            });



            buttonEqual.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (Addition || Subtract || Multiplication || Division || mRemainder) {
                        input2 = Float.parseFloat(edt1.getText().toString() + "");
                    }

                    if (Addition) {

                        res.setText(String.format("%s", input1 + input2));
                        Addition = false;
                    }

                    if (Subtract) {

                        res.setText(String.format("%s", input1 - input2));
                        Subtract = false;
                    }

                    if (Multiplication) {
                        res.setText(String.format("%s", input1 * input2));
                        Multiplication = false;
                    }

                    if (Division) {
                        res.setText(String.format("%s", input1 / input2));
                        Division = false;
                    }
                    if (mRemainder) {
                        res.setText(String.format("%s", input1 % input2));
                        mRemainder = false;
                    }
                }
            });


        }
    }

