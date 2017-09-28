package rtk.chillapp;

/**
 * Created by Todd on 4/5/2016.
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.EditText;

import com.firebase.client.DataSnapshot;
import com.firebase.client.Firebase;
import com.firebase.client.FirebaseError;
import com.firebase.client.ValueEventListener;


public class Settings extends AppCompatActivity /* implements View.OnClickListener */ {

    EditText mPeople, mComputers, mWatts, mPSR, msqft;
    Firebase peopleRef, compRef, wattsRef, psrRef, sqftRef;
    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);
        Firebase.setAndroidContext(this);
    }

    @Override
    protected void onStart() {
        super.onStart();

        peopleRef = new Firebase("https://chiller-app.firebaseio.com/people");
        compRef = new Firebase("https://chiller-app.firebaseio.com/computers");
        wattsRef = new Firebase("https://chiller-app.firebaseio.com/watts");
        psrRef = new Firebase("https://chiller-app.firebaseio.com/PSR");
        sqftRef = new Firebase("https://chiller-app.firebaseio.com/sqfeet");
        mPeople = (EditText)findViewById(R.id.people);
        mComputers = (EditText)findViewById(R.id.computers);
        mWatts = (EditText)findViewById(R.id.watts);
        mPSR = (EditText)findViewById(R.id.psr);
        msqft = (EditText)findViewById(R.id.sqft);
        save = (Button)findViewById(R.id.buttonSave);

        peopleRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String text = dataSnapshot.getValue(String.class);
                mPeople.setText(text);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        compRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String text = dataSnapshot.getValue(String.class);
                mComputers.setText(text);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        wattsRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String text = dataSnapshot.getValue(String.class);
                mWatts.setText(text);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        psrRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String text = dataSnapshot.getValue(String.class);
                mPSR.setText(text);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        sqftRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String text = dataSnapshot.getValue(String.class);
                msqft.setText(text);
            }

            @Override
            public void onCancelled(FirebaseError firebaseError) {

            }
        });

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                peopleRef.setValue(mPeople.getText());
                wattsRef.setValue(mWatts.getText());
                compRef.setValue(mComputers.getText());
                sqftRef.setValue(msqft.getText());
                psrRef.setValue(mPSR.getText());
            }
        });

    }
}