package rtk.chillapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;

/**
 * Created by Todd Angeles on 3/16/2016.
 */

public class Components extends AppCompatActivity implements View.OnClickListener {

    /*
    Button login;
    EditText etUsername, etPassword;
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.components);

        /*
        etUsername = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etUsername);
        login = (Button) findViewById(R.id.login);

        login.setOnClickListener(this);
        */
    }

    @Override
    public void onClick (View v) {
        // switch statement for buttons
        startActivity(new Intent(this, Settings.class));
    }
}

/**
 * end of editing for Todd Angeles on 3/16/2016
 */
