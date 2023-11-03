package com.example.currency_converter1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view){
        Log.i("Info","Button Pressed");
        EditText editText = (EditText) findViewById(R.id.editTextNumberDecimal);

        String amountInPounds = editText.getText().toString();
        double amountInPoundsDouble = Double.parseDouble(amountInPounds);
        double amountInDollarsDouble = amountInPoundsDouble * 1.061555;

        String amountInDollarsString =  String.format("%.2f", amountInDollarsDouble);


        Toast.makeText(this, "£"+ amountInPounds + "is $" + amountInDollarsString
                , Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}