package de.mbranig.emiexercise3;

import android.content.Intent;
import android.preference.EditTextPreference;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EditContactActivity extends AppCompatActivity {
    private EditText
            tvEditTitle,
            tvEditLastname,
            tvEditFirstname,
            tvEditAddress,
            tvEditZip,
            tvEditCity,
            tvEditCountry;
    private Button btSaveChange;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_contact);

        InitializeActivity();
    }

    private void InitializeActivity() {
        /*
        TODO: (TASK 3.3) Design a GUI, link widgets and fill this
         */


        tvEditTitle = (EditText) findViewById(R.id.tvEditTitel) ;
        tvEditLastname = (EditText) findViewById(R.id.tvEditLastname);
        tvEditFirstname = (EditText) findViewById(R.id.tvEditFirstname);
        tvEditAddress = (EditText) findViewById(R.id.tvEditAdress);
        tvEditZip = (EditText) findViewById(R.id.tvEditZip);
        tvEditCity = (EditText) findViewById(R.id.tvEditCity);
        tvEditCountry = (EditText) findViewById(R.id.tvEditCountry);

        btSaveChange = (Button) findViewById(R.id.btSaveChange);
        btSaveChange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(EditContactActivity.this, ContactManagementActivity.class));
            }
        });


    }

}
