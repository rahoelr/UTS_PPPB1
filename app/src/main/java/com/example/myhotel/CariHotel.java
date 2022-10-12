package com.example.myhotel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;

public class CariHotel extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    private static final String TAG = MainActivity.class.getSimpleName();
    private String mSpinnerLabel = "";
    private String dateMessage1 = "";
    private String dateMessage2 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cari_hotel);

        //Create the Spinner
        Spinner spinner = (Spinner) findViewById(R.id.label_spinner_kmr);
        if (spinner != null) {
            spinner.setOnItemSelectedListener(this);
        }
        // Create ArrayAdapter using the string array and default spinner layout.
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.labels_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears.
        adapter.setDropDownViewResource
                (android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner.
        if (spinner != null) {
            spinner.setAdapter(adapter);
        }
    }
    public void showDatePickerDialogIn(View v) {
        DialogFragment newFragment = new DatePickerFragmentCheckIn();
        newFragment.show(getSupportFragmentManager(), "DatePicker");
    }

    public void showDatePickerDialogOut(View v) {
        DialogFragment newFragment = new DatePickerFragmentCheckOut();
        newFragment.show(getSupportFragmentManager(), "DatePicker");
    }

    public void processDatePickerResultIn(int year1, int month1, int day1) {
        String month_string1 = Integer.toString(month1+1);
        String day_string1 = Integer.toString(day1);
        String year_string1 = Integer.toString(year1);
        dateMessage1 = (day_string1 + "/" + month_string1 + "/" + year_string1);
        TextView checkinDate = (TextView) findViewById(R.id.checkin_confirm);
        checkinDate.setText("Check - In Date : " + dateMessage1);
    }

    public void processDatePickerResultOut(int year2, int month2, int day2) {
        String month_string2 = Integer.toString(month2+1);
        String day_string2 = Integer.toString(day2);
        String year_string2 = Integer.toString(year2);
        dateMessage2 = (day_string2 + "/" + month_string2 + "/" + year_string2);
        TextView checkoutDate = (TextView) findViewById(R.id.checkout_confirm);
        checkoutDate.setText("Check - Out Date : " + dateMessage2);
    }

    //Spinner Item Selected
    public void showText(View view) {
        String showString = (mSpinnerLabel);
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        mSpinnerLabel = adapterView.getItemAtPosition(i).toString();
        showText(view);
    }


    public void onNothingSelected(AdapterView<?> adapterView) {
        Log.d(TAG, getString(R.string.nothing_selected));
    }


    public void openHalamanHotel (View view){
        Intent messageIntent1 = new Intent (this, HalamanHotel.class);
        messageIntent1.putExtra("checkin", dateMessage1);
        messageIntent1.putExtra("checkout", dateMessage2);
        messageIntent1.putExtra("kamar", mSpinnerLabel);
        startActivity(messageIntent1);
    }
}