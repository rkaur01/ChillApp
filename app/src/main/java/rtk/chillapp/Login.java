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

public class Login extends AppCompatActivity implements View.OnClickListener {

    /*
    Button login;
    EditText etUsername, etPassword;
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        View.OnClickListener listnr = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login.this, Components.class));
            }
        };
        Button btn =(Button) findViewById(R.id.login);
        btn.setOnClickListener(listnr);
    }

    @Override
    public void onClick (View v) {

        startActivity(new Intent(this, Components.class));
    }
}

/**
 * end of editing for Todd Angeles on 3/16/2016
 */
