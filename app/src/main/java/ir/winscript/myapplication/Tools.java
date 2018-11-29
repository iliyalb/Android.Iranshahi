package ir.winscript.myapplication;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tools extends Startup{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tools);

        Button button_slider = (Button) findViewById(R.id.button_tools_1);
        Button button_calculator = (Button) findViewById(R.id.button_tools_2);
        Button button_converter = (Button) findViewById(R.id.button_tools_3);
        Button button_exit = (Button) findViewById(R.id.button_tools_4);

        button_slider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tools.this,Tools_Slider.class);
                startActivity(intent);
            }
        });

        button_calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tools.this,Tools_Calculator.class);
                startActivity(intent);
            }
        });

        button_converter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tools.this,Tools_Converter.class);
                startActivity(intent);
            }
        });

        button_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}
