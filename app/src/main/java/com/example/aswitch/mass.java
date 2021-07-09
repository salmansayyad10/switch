package com.example.aswitch;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class mass extends AppCompatActivity {
    Spinner spinner,spinner2;
    private EditText edittext1;
    Button button;
    double z;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mass);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        spinner=(Spinner)findViewById(R.id.spinner);
        spinner2=(Spinner)findViewById(R.id.spinner2);
        button=(Button)findViewById(R.id.button2);
        edittext1 = (EditText) findViewById(R.id.editText1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1 = edittext1.getText().toString();

                String item = spinner.getSelectedItem().toString();
                String item2 = spinner2.getSelectedItem().toString();
                if(value1.isEmpty())
                {
                    Toast.makeText(mass.this,"Please Enter The Value",Toast.LENGTH_LONG).show();
                }
                else {
                    double a = Double.parseDouble(value1);

                    switch (item) {
                        case "Tonne t":
                            z = 0.984206528;
                            break;
                        case "Kilogram kg":
                            z = 0.000984206528;
                            break;
                        case "Gram g":
                            z = 0.000000984206428;
                            break;
                        case "Milligram mg":
                            z = 0.0000000098420652;
                            break;
                        case "Microgram μg":
                            z = 0.00000000000984206528;
                            break;
                        case "Quintal q":
                            z = 0.0984206528;
                            break;
                        case "Pound lb":
                            z = 0.000446428571;
                            break;
                        case "Ounce oz":
                            z = 0.0000279017857;
                            break;
                        case "Carat ct":
                            z = 0.000000196841306;
                            break;
                        case "Grain gr":
                            z = 0.0000000637755102;
                            break;
                        case "Long ton l.t":
                            z = 1;
                            break;
                        case "Short ton sh.t":
                            z = 0.892857143;
                            break;
                        case "UK hundredweight cwt":
                            z = 0.05;
                            break;
                        case "US hundredweight cwt":
                            z = 0.0446428571;
                            break;
                        case "Stone st":
                            z = 0.00625;
                            break;
                        case "Dram dr":
                            z = 0.000001743861616;
                            break;
                        case "Dan dan":
                            z = 0.0492103264;
                            break;
                        case "Jin jin":
                            z = 0.000492103264;
                            break;
                        case "Qian qian":
                            z = 0.00000492103264;
                            break;
                        case "Liang liang":
                            z = 0.0000492103264;
                            break;
                        case "Jin (Taiwan)jin(tw)":
                            z = 0.0000590523917;
                            break;
                    }
                    if (item2.equals("Tonne t")) {
                        double x = 1.01604691;
                        double ans = a * x * z;
                        Toast.makeText(mass.this, "Tonne t=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Kilogram kg")) {
                        double x = 1016.04691;
                        double ans = a * x * z;
                        Toast.makeText(mass.this, "Kilogram kg=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Gram g")) {
                        double x = 1016046.91;
                        double ans = a * x * z;
                        Toast.makeText(mass.this, "Gram g=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Milligram mg")) {
                        double x = 1016046900;
                        double ans = a * x * z;
                        Toast.makeText(mass.this, "Milligram mg=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Microgram μg")) {
                        long x = 10160469110000L;
                        double ans = a * x * z;
                        Toast.makeText(mass.this, "Microgram μg=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Quintak q")) {
                        double x = 10.1604691;
                        double ans = a * x * z;
                        Toast.makeText(mass.this, "Quintak q=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Pound lb")) {
                        double x = 2240;
                        double ans = a * x * z;
                        Toast.makeText(mass.this, "Pound lb=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Ounce oz")) {
                        double x = 35840;
                        double ans = a * x * z;
                        Toast.makeText(mass.this, "Ounce oz=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Carat ct")) {
                        double x = 5080234.54;
                        double ans = a * x * z;
                        Toast.makeText(mass.this, "Carat ct=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Grain gr")) {
                        double x = 15680000;
                        double ans = a * x * z;
                        Toast.makeText(mass.this, "Grain gr=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Long ton l.t")) {
                        double x = 1;
                        double ans = a * x * z;
                        Toast.makeText(mass.this, "Long ton l.t=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Short ton sh.t")) {
                        double x = 1.12;
                        double ans = a * x * z;
                        Toast.makeText(mass.this, "Short ton sh.t=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("UK hundredweight cwt")) {
                        double x = 20;
                        double ans = a * x * z;
                        Toast.makeText(mass.this, "UK hundredweight cwt=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("US hundredweight cwt")) {
                        double x = 22.4;
                        double ans = a * x * z;
                        Toast.makeText(mass.this, "US hundredweight cwt=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Stone st")) {
                        double x = 160;
                        double ans = a * x * z;
                        Toast.makeText(mass.this, "Stone st=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Dram dr")) {
                        double x = 573440;
                        double ans = a * x * z;
                        Toast.makeText(mass.this, "Dram dr=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Dan dan")) {
                        double x = 20.3209382;
                        double ans = a * x * z;
                        Toast.makeText(mass.this, "Dan dan=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Jin jin")) {
                        double x = 2032.09382;
                        double ans = a * x * z;
                        Toast.makeText(mass.this, "Jin jin=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Qian qian")) {
                        double x = 203209.382;
                        double ans = a * x * z;
                        Toast.makeText(mass.this, "Qian qian=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Liang liang")) {
                        double x = 20320.9382;
                        double ans = a * x * z;
                        Toast.makeText(mass.this, "Liang liang=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Jin (Taiwan)jin(tw)")) {
                        double x = 1693.41151;
                        double ans = a * x * z;
                        Toast.makeText(mass.this, "Jin (Taiwan)jin(tw)=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}