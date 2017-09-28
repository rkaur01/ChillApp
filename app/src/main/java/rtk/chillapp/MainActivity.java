package rtk.chillapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity /* implements View.OnClickListener */ {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OnClickListener listnr = new OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Login.class));
            }
        };
        Button btn =(Button) findViewById(R.id.jumpbtn);
        btn.setOnClickListener(listnr);
    }
}
