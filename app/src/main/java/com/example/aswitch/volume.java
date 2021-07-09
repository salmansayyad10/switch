package com.example.aswitch;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class volume extends AppCompatActivity {
    Spinner spinner,spinner2;
    private EditText edittext1;
    Button button;
    double z;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.volume);
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
                if (value1.isEmpty()) {
                    Toast.makeText(volume.this, "Please Enter The Value", Toast.LENGTH_LONG).show();
                } else {
                    double a = Double.parseDouble(value1);

                    switch (item) {
                        case "Acre Foot":
                            z = 0.00000029592803033;
                            break;
                        case "Barrels (oil) [bbl]":
                            z = 0.00000000003814308;
                            break;
                        case "Bushels (UK)":
                            z = 0.00000000000872532;
                            break;
                        case "Bushels (US)":
                            z = 0.00000000000845430;
                            break;
                        case "Centiliters":
                            z = 0.00000000000000240;
                            break;
                        case "Cubic centimeters [cm3]":
                            z = 0.00000000000000024;
                            break;
                        case "Cubic decimeters [dm3]":
                            z = 0.00000000000023991;
                            break;
                        case "Cubic decimeters":
                            z = 0.00000023991275860;
                            break;
                        case "Cubic feet [ft3]":
                            z = 0.00000000000679357;
                            break;
                        case "Cubic inches":
                            z = 0.00000000000000393;
                            break;
                        case "Cubic kilometers":
                            z = 0.23991275860428665;
                            break;
                        case "Cubic meters[m3]":
                            z = 0.00000000023991276;
                            break;
                        case "Cubic mile":
                            z = 1;
                            break;
                        case "Cubic millimeters":
                            z = 0.00000000000000000023991;
                            break;
                        case "Cubic yards":
                            z = 0.00000000018342647;
                            break;
                        case "Cups":
                            z = 0.00000000000005676;
                            break;
                        case "Deciliters":
                            z = 0.00000000000002399;
                            break;
                        case "Dram (imperial)":
                            z = 0.00000000000000085;
                            break;
                        case "Dram (US)":
                            z = 0.00000000000000089;
                            break;
                        case "Fluid ounces (imperial) [fl oz]":
                            z = 0.00000000000000682;
                            break;
                        case "Fluid ounces (US) [fl oz]":
                            z = 0.00000000000000710;
                            break;
                        case "Gallons (imperial) [gal]":
                            z = 0.00000000000109066;
                            break;
                        case "Gallons dry (US)":
                            z = 0.00000000000105679;
                            break;
                        case "Gallons liquid (US) [gal]":
                            z = 0.00000000000090817;
                            break;
                        case "Gill (imperial) [gi]":
                            z = 0.00000000000003408;
                            break;
                        case "Gill (US) [gi]":
                            z = 0.00000000000002838;
                            break;
                        case "Kiloliters [kl]":
                            z = 0.00000000023991276;
                            break;
                        case "Liters [l or L]":
                            z = 0.00000000000023991;
                            break;
                        case "Liters (1901to1964)":
                            z = 0.00000000000023992;
                            break;
                        case "Milliliters [ml]":
                            z = 0.00000000000000024;
                            break;
                        case "Microliters [μl]":
                            z = 0.00000000000000000023991;
                            break;
                        case "Nanoliters [nl]":
                            z = 0.0000000000000000000002399;
                            break;
                        case "Picoliters [pl]":
                            z = 0.000000000000000000000000240;
                            break;
                        case "Pints (imperial) [pt]":
                            z = 0.00000000000013633;
                            break;
                        case "Pints dry (US)":
                            z = 0.00000000000013210;
                            break;
                        case "Pints liquid(US) [pt]":
                            z = 0.00000000000011352;
                            break;
                        case "Quarts (imperial) [qt]":
                            z = 0.00000000000027267;
                            break;
                        case "Quarts, dry (US)":
                            z = 0.00000000000026420;
                            break;
                        case "Quarts, liquid (US) [qt]":
                            z = 0.00000000000022704;
                            break;
                        case "Table spoons":
                            z = 0.00000000000000355;
                            break;
                        case "Tea spoons":
                            z = 0.00000000000000118;
                            break;
                    }
                    if (item2.equals("Acre Foot")) {
                        double x = 3379199.99964281637221575;
                        double ans = a * x * z;
                        Toast.makeText(volume.this, "Acre Foot=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Barrels (oil) [bbl]")) {
                        double x = 26217074936.00434494018554688;
                        double ans = a * x * z;
                        Toast.makeText(volume.this, "Barrels (oil) [bbl]=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Bushels (UK)")) {
                        double x = 114608977852.39622497558593750;
                        double ans = a * x * z;
                        Toast.makeText(volume.this, "Bushels (UK)=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Bushels (US)")) {
                        double x = 118282968456.91268920898437500;
                        double ans = a * x * z;
                        Toast.makeText(volume.this, "Bushels (US)=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }

                    if (item2.equals("Centiliters")) {
                        double x = 416818182500000.00000000000000000;
                        double ans = a * x * z;
                        Toast.makeText(volume.this, "Centiliters=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Cubic centimeters [cm3]")) {
                        double x = 4168181825000000.00000000000000000;
                        double ans = a * x * z;
                        Toast.makeText(volume.this, "Cubic centimeters [cm3]=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Cubic decimeters [dm3]")) {
                        double x = 4168181825000.00000000000000000;
                        double ans = a * x * z;
                        Toast.makeText(volume.this, "Cubic decimeters [dm3]=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Cubic decimeters")) {
                        double x = 4168181.82500000018626451;
                        double ans = a * x * z;
                        Toast.makeText(volume.this, "Cubic decimeters=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Cubic feet [ft3]")) {
                        double x = 147197951984.44107055664062500;
                        double ans = a * x * z;
                        Toast.makeText(volume.this, "Cubic feet [ft3]=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Cubic inches")) {
                        double x = 254358061029114.18750000000000000;
                        double ans = a * x * z;
                        Toast.makeText(volume.this, "Cubic inches=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Cubic kilometers")) {
                        double x = 4.16818182499999956;
                        double ans = a * x * z;
                        Toast.makeText(volume.this, "Cubic kilometers=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Cubic meters[m3]")) {
                        double x = 4168181825.00000000000000000;
                        double ans = a * x * z;
                        Toast.makeText(volume.this, "Cubic meters[m3]=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Cubic mile")) {
                        double x = 1;
                        double ans = a * x * z;
                        Toast.makeText(volume.this, "Cubic mile=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Cubic millimeters")) {
                        double x = 4168181825000000000.00000000000000000;
                        double ans = a * x * z;
                        Toast.makeText(volume.this, "Cubic millimeters=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Cubic yards")) {
                        double x = 5451775999.42374324798583984;
                        double ans = a * x * z;
                        Toast.makeText(volume.this, "Cubic yards=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Cups")) {
                        double x = 17617874356994.92187500000000000;
                        double ans = a * x * z;
                        Toast.makeText(volume.this, "Cups=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Deciliters")) {
                        double x = 41681818250000.00000000000000000;
                        double ans = a * x * z;
                        Toast.makeText(volume.this, "Deciliters=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Dram (imperial)")) {
                        double x = 1173595933208537.50000000000000000;
                        double ans = a * x * z;
                        Toast.makeText(volume.this, "Dram (imperial)=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Dram (US)")) {
                        double x = 1127543958847675.00000000000000000;
                        double ans = a * x * z;
                        Toast.makeText(volume.this, "Dram (US)=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Fluid ounces (imperial) [fl oz]")) {
                        double x = 146699491651067.18750000000000000;
                        double ans = a * x * z;
                        Toast.makeText(volume.this, "Fluid ounces (imperial) [fl oz]=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Fluid ounces (US) [fl oz]")) {
                        double x = 140942994855959.37500000000000000;
                        double ans = a * x * z;
                        Toast.makeText(volume.this, "Fluid ounces (US) [fl oz]=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Gallons (imperial) [gal]")) {
                        double x = 916871822819.16979980468750000;
                        double ans = a * x * z;
                        Toast.makeText(volume.this, "Gallons (imperial) [gal]=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Gallons dry (US)")) {
                        double x = 946263747655.30151367187500000;
                        double ans = a * x * z;
                        Toast.makeText(volume.this, "Gallons, dry (US)=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Gallons  liquid (US) [gal]")) {
                        double x = 1101117147312.18261718750000000;
                        double ans = a * x * z;
                        Toast.makeText(volume.this, "Gallons  liquid (US) [gal]=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Gill (imperial) [gi]")) {
                        double x = 29339898330213.43359375000000000;
                        double ans = a * x * z;
                        Toast.makeText(volume.this, "Gill (imperial) [gi]=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Gill (US) [gi]")) {
                        double x = 35235748713989.84375000000000000;
                        double ans = a * x * z;
                        Toast.makeText(volume.this, "Gill (US) [gi]=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Kiloliters [kl]")) {
                        double x = 4168181825.00000000000000000;
                        double ans = a * x * z;
                        Toast.makeText(volume.this, "Kiloliters [kl]=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Liters [l or L]")) {
                        double x = 4168181825000.00000000000000000;
                        double ans = a * x * z;
                        Toast.makeText(volume.this, "Liters [l or L]=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Liters (1901to1964)")) {
                        double x = 4168065119176.66357421875000000;
                        double ans = a * x * z;
                        Toast.makeText(volume.this, "Liters (1901to1964)=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Milliliters [ml]")) {
                        double x = 4168181825000000.00000000000000000;
                        double ans = a * x * z;
                        Toast.makeText(volume.this, "Milliliters [ml]=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Microliters [μl]")) {
                        double x = 4168181825000000000.00000000000000000;
                        double ans = a * x * z;
                        Toast.makeText(volume.this, "Microliters [μl]=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Nanoliters [nl]")) {
                        double x = 4.168181825e+21;
                        double ans = a * x * z;
                        Toast.makeText(volume.this, "Nanoliters [nl]=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Picoliters [pl]")) {
                        double x = 4.168181825e+24;
                        double ans = a * x * z;
                        Toast.makeText(volume.this, "Picoliters [pl]=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Pints (imperial) [pt]")) {
                        double x = 7334974582553.35839843750000000;
                        double ans = a * x * z;
                        Toast.makeText(volume.this, "Pints (imperial) [pt]=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Pints dry (US)")) {
                        double x = 7570109981242.41210937500000000;
                        double ans = a * x * z;
                        Toast.makeText(volume.this, "Pints dry (US)=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Pints liquid(US) [pt]")) {
                        double x = 8808937178497.46093750000000000;
                        double ans = a * x * z;
                        Toast.makeText(volume.this, "Pints liquid(US) [pt]=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Quarts (imperial) [qt]")) {
                        double x = 3667487291276.67919921875000000;
                        double ans = a * x * z;
                        Toast.makeText(volume.this, "Quarts (imperial) [qt]=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Quarts dry (US)")) {
                        double x = 3785054990621.20605468750000000;
                        double ans = a * x * z;
                        Toast.makeText(volume.this, "Quarts dry (US)=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Quarts liquid (US) [qt]")) {
                        double x = 4404468589248.73046875000000000;
                        double ans = a * x * z;
                        Toast.makeText(volume.this, "Quarts liquid (US) [qt]=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Table spoons")) {
                        double x = 281885989711918.75000000000000000;
                        double ans = a * x * z;
                        Toast.makeText(volume.this, "Table spoons=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Tea spoons")) {
                        double x = 845657969135756.25000000000000000;
                        double ans = a * x * z;
                        Toast.makeText(volume.this, "Tea spoons=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}