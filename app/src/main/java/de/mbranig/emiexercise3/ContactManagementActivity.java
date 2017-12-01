package de.mbranig.emiexercise3;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ContactManagementActivity extends AppCompatActivity {

    private Spinner spContacts;
    private TextView
            tvTitle,
            tvFirstName,
            tvLastName,
            tvAddress,
            tvZip,
            tvCity,
            tvCountry;

    /*
    TODO: (TASK 3.3) Add required new UI widgets (Button) here
     */
    //private Button btEdit;

    private Button btnEdit;


    Contacts newcontact[] = new Contacts [5];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_management);

        getSupportActionBar().setBackgroundDrawable(
                new ColorDrawable(getResources().getColor(R.color.tuHausfarbeBlauDunkel)));

        InitializeApp();
    }

    /**
     * Construct the Interactive Structure
     */
    private void InitializeApp() {
        spContacts = (Spinner) findViewById(R.id.spinnerContacts);

        tvTitle = (TextView) findViewById(R.id.textViewTitle);
        tvFirstName = (TextView) findViewById(R.id.textViewFirstName);
        tvLastName = (TextView) findViewById(R.id.textViewLastName);
        tvAddress = (TextView) findViewById(R.id.textViewAddress);
        tvZip = (TextView) findViewById(R.id.textViewZip);
        tvCity = (TextView) findViewById(R.id.textViewCity);
        tvCountry = (TextView) findViewById(R.id.textViewCountry);

        btnEdit = (Button) findViewById(R.id.btnEdit);
        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ContactManagementActivity.this, EditContactActivity.class));
            }
        });




         newcontact[0] = new Contacts("Herr", "Robert", "Meyer", "Apfelbergstraße 10", "9430", "St. Margrethen", "Schweiz");
         newcontact[1] = new Contacts("Frau", "Elisabeth", "Stramm", "Fritz-Konzert-Straße 1a", "6020", "Insbruck", "Österreich");
         newcontact[2] = new Contacts("Herr", "Stefan", "Wennige", "Kirchplatz 13", "6112", "wattens", "Österreich");
         newcontact[3] = new Contacts ("Frau","Ella", "Beckmann", "Falkenstraße 3", "01067", "Dresden", "Deutschland");
         newcontact[4] = new Contacts("Frau", "Anna", "Watson","1 Langdon Park Rd", "N6 5PS", "London", "Vereinigtes Königreich");





        // Spinner Drop down elements
        List<String> el = new ArrayList<String>();

        for(int i =0; i<newcontact.length;i++){
            el.add(newcontact[i].getLastname());
        }


        //adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, el);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spContacts.setAdapter(dataAdapter);



        spContacts.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(!(view instanceof TextView))
                    return;

                TextView item = (TextView) view;
                String selectedName = item.getText().toString();

                selectedName = (String) parent.getItemAtPosition(position).toString();


                /*
                TODO: selectedName contains the selected spinner item as String Show

                Let's show the contact's details:
                 */
                DisplayContactDetails(selectedName);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

                // do nothing
            }
        });
    }

    /**
     * Set the displayed contact details by contact name
     * @param contactName contact's name
     */
    private void DisplayContactDetails(String contactName) {

        // TODO: Get contact by selected name

        // TODO: Fill TextViews with contact details


        for (int i = 0; i<newcontact.length; i++) {
            if (newcontact[i].getLastname().equals(contactName)){


                    tvTitle.setText(newcontact[i].getTitle());
                    tvFirstName.setText(newcontact[i].getFirstname());
                    tvLastName.setText(newcontact[i].getLastname());
                    tvAddress.setText(newcontact[i].getAddresse());
                    tvZip.setText(newcontact[i].getZip());
                    tvCity.setText(newcontact[i].getCity());
                    tvCountry.setText(newcontact[i].getCountry());




            }

        }


    }

}
