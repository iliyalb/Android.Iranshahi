package ir.winscript.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Tools_Calculator extends Tools {

    private int temp1, temp2;
    private int result;
    private int flag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tools_calculator);

        Button GoHome = (Button) findViewById(R.id.buttongohome);
        Button Addition = (Button) findViewById(R.id.buttonAdd);
        Button Substraction = (Button) findViewById(R.id.buttonSub);
        Button Multiply = (Button) findViewById(R.id.buttonMul);
        Button Division = (Button) findViewById(R.id.buttonDiv);
        Button Button_0 = (Button) findViewById(R.id.button_0);
        Button Button_1 = (Button) findViewById(R.id.button_1);
        Button Button_2 = (Button) findViewById(R.id.button_2);
        Button Button_3 = (Button) findViewById(R.id.button_3);
        Button Button_4 = (Button) findViewById(R.id.button_4);
        Button Button_5 = (Button) findViewById(R.id.button_5);
        Button Button_6 = (Button) findViewById(R.id.button_6);
        Button Button_7 = (Button) findViewById(R.id.button_7);
        Button Button_8 = (Button) findViewById(R.id.button_8);
        Button Button_9 = (Button) findViewById(R.id.button_9);
        Button Equation = (Button) findViewById(R.id.buttonEqu);
        final EditText EditTextCalculator = (EditText) findViewById(R.id.editText_Calculator);

        GoHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp1 = Integer.parseInt(EditTextCalculator.getText().toString());
                EditTextCalculator.setText("");
                flag = 1;
            }
        });

        Substraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp1 = Integer.parseInt(EditTextCalculator.getText().toString());
                EditTextCalculator.setText("");
                flag = 2;
            }
        });

        Multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp1 = Integer.parseInt(EditTextCalculator.getText().toString());
                EditTextCalculator.setText("");
                flag = 3;
            }
        });

        Division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                temp1 = Integer.parseInt(EditTextCalculator.getText().toString());
                EditTextCalculator.setText("");
                flag = 4;
            }
        });

        Button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (EditTextCalculator.getText().toString().equals(""+0))
                    EditTextCalculator.setText(""+0);
                else
                    EditTextCalculator.append(""+0);
            }
        });

        Button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(EditTextCalculator.getText().toString().equals(""+0))
                    EditTextCalculator.setText(""+1);
                else
                    EditTextCalculator.append(""+1);
            }
        });

        Button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(EditTextCalculator.getText().toString().equals(""+0))
                    EditTextCalculator.setText(""+2);
                else
                    EditTextCalculator.append(""+2);
            }
        });

        Button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(EditTextCalculator.getText().toString().equals(""+0))
                    EditTextCalculator.setText(""+3);
                else
                    EditTextCalculator.append(""+3);
            }
        });

        Button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(EditTextCalculator.getText().toString().equals(""+0))
                    EditTextCalculator.setText(""+4);
                else
                    EditTextCalculator.append(""+4);
            }
        });

        Button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(EditTextCalculator.getText().toString().equals(""+0))
                    EditTextCalculator.setText(""+5);
                else
                    EditTextCalculator.append(""+5);
            }
        });

        Button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(EditTextCalculator.getText().toString().equals(""+0))
                    EditTextCalculator.setText(""+6);
                else
                    EditTextCalculator.append(""+6);
            }
        });

        Button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(EditTextCalculator.getText().toString().equals(""+0))
                    EditTextCalculator.setText(""+7);
                else
                    EditTextCalculator.append(""+7);
            }
        });

        Button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(EditTextCalculator.getText().toString().equals(""+0))
                    EditTextCalculator.setText(""+8);
                else
                    EditTextCalculator.append(""+8);
            }
        });

        Button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(EditTextCalculator.getText().toString().equals(""+0))
                    EditTextCalculator.setText(""+9);
                else
                    EditTextCalculator.append(""+9);
            }
        });

        Equation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                temp2 = Integer.parseInt(EditTextCalculator.getText().toString());
                EditTextCalculator.setText("");

                switch (flag){
                    case 1:
                        result = temp1 + temp2;
                        break;
                    case 2:
                        result = temp1 - temp2;
                        break;
                    case 3:
                        result = temp1 * temp2;
                        break;
                    case 4:
                        if(temp1 != 0 || temp2 != 0)
                            result = temp1 / temp2;
                        else{
                        Toast.makeText(getApplicationContext(), "Divide by zero?", Toast.LENGTH_LONG).show();
                        return;
                        }
                        break;
                }

                Toast.makeText(getApplicationContext(),""+result,Toast.LENGTH_LONG).show();
            }
        });
    }
}
