package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView infoTextView;
    EditText infoEditText;
    Button one, two, three, four, five, six, seven, eight, nine, zero, minus, plus, divide, multiply, exponentiationNumber, sqrNumber, sqrtNumber, clear, dot, equally;
    float mValueOne, mValueTwo;
    Double square, sqrt, sqr;
    boolean mAddition, mSubtract, mMultiplication, mDivision, isEmpty, mExponentiation, mSqrt, mSqr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        checkNumericButton();
    }

    private void initView() {
        infoTextView = findViewById(R.id.infoTextView);

        infoEditText = findViewById(R.id.infoEditText);

        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);
        equally = findViewById(R.id.equally);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);
        clear = findViewById(R.id.clear);
        dot = findViewById(R.id.dot);
        exponentiationNumber = findViewById(R.id.exNumber);
        sqrtNumber = findViewById(R.id.sqrtNumber);
        sqrNumber = findViewById(R.id.sqrNumber);
    }

    private void checkNumericButton() {

        isEmpty = true;

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                infoEditText.setText(infoEditText.getText() + "1");
                isEmpty = false;
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                infoEditText.setText(infoEditText.getText() + "2");
                isEmpty = false;
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                infoEditText.setText(infoEditText.getText() + "3");
                isEmpty = false;
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                infoEditText.setText(infoEditText.getText() + "4");
                isEmpty = false;
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                infoEditText.setText(infoEditText.getText() + "5");
                isEmpty = false;
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                infoEditText.setText(infoEditText.getText() + "6");
                isEmpty = false;
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                infoEditText.setText(infoEditText.getText() + "7");
                isEmpty = false;
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                infoEditText.setText(infoEditText.getText() + "8");
                isEmpty = false;
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                infoEditText.setText(infoEditText.getText() + "9");
                isEmpty = false;
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                infoEditText.setText(infoEditText.getText() + "0");
                isEmpty = false;
            }
        });

        final Toast toast = (Toast) Toast.makeText(this, "Pleas, enter a number", Toast.LENGTH_SHORT);
        final Toast toastZero = (Toast) Toast.makeText(this, "You can`t devided by zero", Toast.LENGTH_SHORT);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isEmpty) {
                    if (infoEditText == null) {
                        infoEditText.setText("0");
                    } else {
                        mValueOne = Float.parseFloat(infoEditText.getText() + "");
                        mAddition = true;
                        infoEditText.setText(null);
                    }
                } else {
                    toast.show();
                }
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isEmpty) {
                    mValueOne = Float.parseFloat(infoEditText.getText() + "");
                    mSubtract = true;
                    infoEditText.setText(null);
                } else {
                    toast.show();
                }
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isEmpty) {
                    mValueOne = Float.parseFloat(infoEditText.getText() + "");
                    mMultiplication = true;
                    infoEditText.setText(null);
                } else {
                    toast.show();
                }
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isEmpty) {
                    mValueOne = Float.parseFloat(infoEditText.getText() + "");
                    mDivision = true;
                    infoEditText.setText(null);
                } else {
                    toast.show();
                }
            }
        });

        exponentiationNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isEmpty) {
                    mValueOne = Float.parseFloat(infoEditText.getText() + "");
                    mExponentiation = true;
                    infoEditText.setText(null);
                } else {
                    toast.show();
                }
            }
        });

        sqrNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isEmpty) {
                    mValueOne = Float.parseFloat(infoEditText.getText() + "");
                    mSqr = true;
                    infoEditText.setText(null);
                } else {
                    toast.show();
                }
                if (mSqr) {
                    sqr = Math.pow(mValueOne, 2);
                    infoTextView.setText(sqr.toString());
                    mSqr = false;
                }
            }
        });

        sqrtNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isEmpty) {
                    mValueOne = Float.parseFloat(infoEditText.getText() + "");
                    mSqrt = true;
                    infoEditText.setText(null);
                } else {
                    toast.show();
                }
                if (mSqrt) {
                    sqrt = Math.sqrt(mValueOne);
                    infoTextView.setText(sqrt.toString());
                    mSqrt = false;
                }
            }
        });

        equally.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!isEmpty) {

                    mValueTwo = Float.parseFloat(infoEditText.getText() + "");

                    if (mAddition) {
                        infoTextView.setText(mValueOne + mValueTwo + "");
                        mAddition = false;
                    }

                    if (mSubtract) {
                        infoTextView.setText(mValueOne - mValueTwo + "");
                        mSubtract = false;
                    }

                    if (mMultiplication) {
                        infoTextView.setText(mValueOne * mValueTwo + "");
                        mMultiplication = false;
                    }

                    if (mDivision) {
                        if (mValueTwo == 0) {
                            toastZero.show();
                        } else {
                            infoTextView.setText(mValueOne / mValueTwo + "");
                            mDivision = false;
                        }
                    }

                    if (mExponentiation) {
                        square = Math.pow(mValueOne, mValueTwo);
                        infoTextView.setText(square.toString());
                        mExponentiation = false;
                    }

                } else {
                    toast.show();
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                infoTextView.setText("");
                infoEditText.setText("");
                isEmpty = true;
            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isEmpty) {
                    infoEditText.setText(infoEditText.getText() + "0.");
                } else {
                    infoEditText.setText(infoEditText.getText() + ".");
                }
            }
        });

    }

}

