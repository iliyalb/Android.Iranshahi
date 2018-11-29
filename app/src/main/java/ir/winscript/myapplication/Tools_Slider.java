package ir.winscript.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;

public class Tools_Slider extends Tools {

    static boolean flag = false;
    private Button buttonNext;
    private Button buttonPrev;
    private CheckBox checkBoxWindows;
    private CheckBox checkBoxLinux;
    private RadioButton radioButtonWindows;
    private RadioButton radioButtonLinux;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tools_slider);

        checkBoxWindows = (CheckBox) findViewById(R.id.checkBoxWindows);
        checkBoxLinux = (CheckBox) findViewById(R.id.checkBoxLinux);
        radioButtonWindows = (RadioButton) findViewById(R.id.radioButtonWindows);
        radioButtonLinux = (RadioButton) findViewById(R.id.radioButtonLinux);
        imageView = (ImageView) findViewById(R.id.imageView);
        buttonNext = (Button) findViewById(R.id.buttonNext);
        buttonPrev = (Button) findViewById(R.id.buttonPrev);

        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==false) {
                    imageView.setImageResource(R.drawable.image2);
                    checkBoxWindows.setChecked(false);
                    checkBoxLinux.setChecked(true);
                    radioButtonWindows.setChecked(false);
                    radioButtonLinux.setChecked(true);
                    flag = true;
                }
                else {
                    imageView.setImageResource(R.drawable.image1);
                    checkBoxWindows.setChecked(true);
                    checkBoxLinux.setChecked(false);
                    radioButtonWindows.setChecked(true);
                    radioButtonLinux.setChecked(false);
                    flag = false;
                }
            }
        });

        buttonPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==true) {
                    imageView.setImageResource(R.drawable.image1);
                    checkBoxWindows.setChecked(true);
                    checkBoxLinux.setChecked(false);
                    radioButtonWindows.setChecked(true);
                    radioButtonLinux.setChecked(false);
                    flag = false;
                }
                else {
                    imageView.setImageResource(R.drawable.image2);
                    checkBoxWindows.setChecked(false);
                    checkBoxLinux.setChecked(true);
                    radioButtonWindows.setChecked(false);
                    radioButtonLinux.setChecked(true);
                    flag = true;
                }
            }
        });

        radioButtonWindows.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(radioButtonWindows.isChecked()) {
                    radioButtonLinux.setChecked(false);
                    checkBoxWindows.setChecked(true);
                    checkBoxLinux.setChecked(false);
                    imageView.setImageResource(R.drawable.image1);
                }
                else {
                    radioButtonWindows.setChecked(false);
                    checkBoxWindows.setChecked(false);
                    checkBoxLinux.setChecked(true);
                }
            }
        });

        radioButtonLinux.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (radioButtonLinux.isChecked()) {
                    radioButtonWindows.setChecked(false);
                    checkBoxWindows.setChecked(false);
                    checkBoxLinux.setChecked(true);
                    imageView.setImageResource(R.drawable.image2);
                }else{
                    radioButtonLinux.setChecked(false);
                    checkBoxWindows.setChecked(true);
                    checkBoxLinux.setChecked(true);
                }
            }
        });

        checkBoxWindows.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radioButtonWindows.setChecked(true);
                radioButtonLinux.setChecked(false);
                checkBoxWindows.setChecked(true);
                checkBoxLinux.setChecked(false);
                imageView.setImageResource(R.drawable.image1);
            }
        });

        checkBoxLinux.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radioButtonWindows.setChecked(false);
                radioButtonLinux.setChecked(true);
                checkBoxWindows.setChecked(false);
                checkBoxLinux.setChecked(true);
                imageView.setImageResource(R.drawable.image2);
            }
        });
    }


    public void HomeSlider_CL(View v) {
        finish();
    }

}