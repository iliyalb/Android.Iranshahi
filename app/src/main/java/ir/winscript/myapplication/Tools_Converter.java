package ir.winscript.myapplication;

import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Tools_Converter extends Tools {

    private String tempC;
    private String flagC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tools_converter);

        final EditText editTextConvert = (EditText) findViewById(R.id.editText_Convert);
        Button button_Notify = (Button) findViewById(R.id.button_Notify);
        Button button_HomeC = (Button) findViewById(R.id.button_gohomeconv);
        RadioButton rb_dtr = (RadioButton) findViewById(R.id.radioButtondtr);
        RadioButton rb_ktp = (RadioButton) findViewById(R.id.radioButtonktp);
        RadioButton rb_ctf = (RadioButton) findViewById(R.id.radioButtonctf);


        button_Notify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string;
                string = editTextConvert.getText().toString();
                // NOTIFICATION BUILDER
                Notification.Builder builder = new Notification.Builder(Tools_Converter.this)
                        .setContentTitle(""+string)
                        .setContentText(""+flagC)
                        .setSmallIcon(R.drawable.ic_launcher_background);
                // NOTIFICATION SERVICE
                NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

                // NOTIFICATION USAGE
                notificationManager.notify(1,builder.build());

            }
        });

        button_HomeC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    // ALERT DIALOG BUILDER
                    AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Tools_Converter.this);
                    alertDialogBuilder
                            .setTitle("Exit")
                            .setMessage("Are you sure you want to exit?")
                            .setCancelable(false)
                            .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    finish();
                                }
                            })
                            .setNegativeButton("No", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            });
                    // ALERT DIALOG CREATE
                    AlertDialog alertDialog = alertDialogBuilder.create();
                    // ALERT DIALOG SHOW
                    alertDialog.show();
                }catch (Exception e){
                    Toast.makeText(getApplicationContext(),e.getMessage().toString(),Toast.LENGTH_LONG).show();
                }
            }
        });

        rb_dtr.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                tempC = editTextConvert.getText().toString();
                double number = Float.parseFloat(tempC);
                number = number * (3.1415) / (180);
                editTextConvert.setText(""+number);
                flagC="Radian";

            }
        });

        rb_ktp.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                tempC = editTextConvert.getText().toString();
                double number = Float.parseFloat(tempC);
                number = number / (0.45359237);
                editTextConvert.setText(""+number);
                flagC="Pound";
            }
        });

        rb_ctf.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                tempC = editTextConvert.getText().toString();
                double number = Float.parseFloat(tempC);
                number = number * (9) / (5) + (32);
                editTextConvert.setText(""+number);
                flagC="Fahrenheit";
            }
        });
    }
}


