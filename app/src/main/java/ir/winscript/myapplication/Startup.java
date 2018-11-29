package ir.winscript.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Startup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startup);

        Button button_login = (Button) findViewById(R.id.button_login);

        /*
        Intent myIntent = getIntent();
        Bundle myBundle = myIntent.getExtras();

        try {

        String nabodi = myBundle.getString("mmd", "1");
        Toast.makeText(getApplication(), nabodi, Toast.LENGTH_LONG).show();
        }
        catch (Exception e) {

        }
        finally{
            String finalystring = "Please don't crash";
        }
        */

    }

    static final String PassCode = "test123";

    public void button_login_CL(View v) {

        EditText editText_login = (EditText) findViewById(R.id.edittext_login);
        String getPassCode = editText_login.getText().toString();


        if (getPassCode.equals(PassCode)) {
            Toast.makeText(Startup.this, "Welcome", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(Startup.this, Tools.class);
            startActivity(intent);
            finish();
        }
        else
            Toast.makeText(Startup.this, "Invalid Entry", Toast.LENGTH_SHORT).show();
    }
}
