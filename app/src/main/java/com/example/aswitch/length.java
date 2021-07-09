package com.example.aswitch;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class length extends AppCompatActivity {
    Spinner spinner,spinner2;
    private EditText edittext1;
    Button button;
    double z;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.length);
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
                    Toast.makeText(length.this,"Please Enter The Value",Toast.LENGTH_LONG).show();
                }
                else {
                    double a = Double.parseDouble(value1);
                switch (item) {
                    case "Angstroms [A]":
                        z = 0.000000000000000000000000003241;
                        break;
                    case "Astronomical units [au]":
                        z = 0.00000484815879663;
                        break;
                    case "Barleycorns":
                        z = 0.000000000000000000274;
                        break;
                    case "Cables":
                        z = 0.00000000000000593;
                        break;
                    case "Centimeters [cm]":
                        z = 0.000000000000000000324;
                        break;
                    case "Chains (surveyors)":
                        z = 0.00000000000000065;
                        break;
                    case "Decimeters [dm]":
                        z =0.00000000000000000324;
                        break;
                    case "Ells (UK)":
                        z = 0.0000000000000000284;
                        break;
                    case "Ems (Pica)":
                        z = 0.0000000000000000001372;
                        break;
                    case "Fathoms":
                        z = 0.0000000000000000593;
                        break;
                    case "Feet (UK and US)":
                        z = 0.000000000000000009878;
                        break;
                    case "Feet (US survey)":
                        z = 0.000000000000000009878;
                        break;
                    case "Furlongs":
                        z = 0.00000000000000652;
                        break;
                    case "Hands":
                        z = 0.00000000000000000329;
                        break;
                    case "Hectometers [hm]":
                        z = 0.00000000000000324;
                        break;
                    case "Inches [in]":
                        z = 0.00000000000000000082;
                        break;
                    case "Kilometers [km]":
                        z = 0.00000000000003241;
                        break;
                    case "Light years":
                        z = 0.30659484338221205;
                        break;
                    case "Meters [m]":
                        z = 0.0000000000000000324;
                        break;
                    case "Micrometers [μm]":
                        z = 0.00000000000000000000003241;
                        break;
                    case "Mil":
                        z = 0.000000000000000000000823;
                        break;
                    case "Miles (US and UK)":
                        z = 0.00000000000005216;
                        break;
                    case "Miles (nautical, international)":
                        z = 0.00000000000006002;
                        break;
                    case "Miles (nautical, UK)":
                        z = 0.00000000000006006;
                        break;
                    case "Millimeters [mm]":
                        z = 0.0000000000000000000324;
                        break;
                    case "Nanometers [nm]":
                        z = 0.0000000000000000000000000324;
                        break;
                    case "Parsecs":
                        z = 1;
                        break;
                    case "Picometers [pm]":
                        z = 0.0000000000000000000000000000324;
                        break;
                    case "Scandinavian mile":
                        z = 0.00000000000032408;
                        break;
                    case "Thou":
                        z = 0.00000000000000000000082;
                        break;
                    case "Yards [yd]":
                        z = 0.0000000000000000296;
                        break;
                }

                if(item2.equals("Angstroms [A]"))
                {
                    double x = 3.0856776e+26;
                    double ans = a * x*z;
                    Toast.makeText(length.this,"Angstroms [A]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Astronomical units [au]"))
                {
                    double x = 206263.87087307998444885;
                    double ans = a * x*z;
                    Toast.makeText(length.this,"Astronomical units [au]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Barleycorns"))
                {
                    double x = 3644357623715601408.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(length.this,"Barleycorns="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Cables"))
                {
                    double x = 168726902887139.12500000000000000;
                    double ans = a * x*z;
                    Toast.makeText(length.this,"Cables="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Centimeters [cm]"))
                {
                    double x = 3085677600000000000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(length.this,"Centimeters [cm]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Chains (surveyors)"))
                {
                    double x = 1533877867575757.50000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(length.this,"Chains (surveyors)="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Decimeters [dm]"))
                {
                    double x = 308567760000000000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(length.this,"Decimeters [dm]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Ells (UK)"))
                {
                    double x = 35264886857142856.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(length.this,"Ells (UK)="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Ems (Pica)"))
                {
                    double x = 7289059598894480384.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(length.this,"Ems (Pica)="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Fathoms"))
                {
                    double x = 16872690288713910.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(length.this,"Fathoms="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Feet (UK and US)"))
                {
                    double x = 101236141732283456.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(length.this,"Feet (UK and US)="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Feet (US survey)"))
                {
                    double x = 101235939260000000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(length.this,"Feet (US survey)="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Furlongs"))
                {
                    double x = 153388093533762.81250000000000000;
                    double ans = a * x*z;
                    Toast.makeText(length.this,"Furlongs="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Hands"))
                {
                    double x = 303708425196850432.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(length.this,"Hands="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Hectometers [hm]"))
                {
                    double x = 308567760000000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(length.this,"Hectometers [hm]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Inches [in]"))
                {
                    double x = 1214833700787401728.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(length.this,"Inches [in]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Kilometers [km]"))
                {
                    double x = 30856776000000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(length.this,"Kilometers [km]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Light years"))
                {
                    double x = 3.26163346052550640;
                    double ans = a * x*z;
                    Toast.makeText(length.this,"Light years="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Meters [m]"))
                {
                    double x = 30856776000000000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(length.this,"Meters [m]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Micrometers [μm]"))
                {
                    double x = 3.0856776000000003e+22;
                    double ans = a * x*z;
                    Toast.makeText(length.this,"Micrometers [μm]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Mil"))
                {
                    double x = 1.2148337007874015e+21;
                    double ans = a * x*z;
                    Toast.makeText(length.this,"Mil="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Miles (US and UK)"))
                {
                    double x = 19173511691720.35156250000000000;
                    double ans = a * x*z;
                    Toast.makeText(length.this,"Miles (US and UK)="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Miles (nautical, international)"))
                {
                    double x = 16661326133909.28710937500000000;
                    double ans = a * x*z;
                    Toast.makeText(length.this,"Miles (nautical, international)="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Miles (nautical, UK)"))
                {
                    double x = 16650681205967.67578125000000000;
                    double ans = a * x*z;
                    Toast.makeText(length.this,"Miles (nautical, UK)="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Millimeters [mm]"))
                {
                    double x = 30856776000000000000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(length.this,"Millimeters [mm]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Nanometers [nm]"))
                {
                    double x = 3.0856775999999997e+25;
                    double ans = a * x*z;
                    Toast.makeText(length.this,"Nanometers [nm]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Parsecs"))
                {
                    double x = 1;
                    double ans = a * x*z;
                    Toast.makeText(length.this,"Parsecs="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Picometers [pm]"))
                {
                    double x = 3.0856776000000003e+28;
                    double ans = a * x*z;
                    Toast.makeText(length.this,"Picometers [pm]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Scandinavian mile"))
                {
                    double x = 3085677600000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(length.this,"Scandinavian mile="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Thou"))
                {
                    double x = 1.2148337007874015e+21;
                    double ans = a * x*z;
                    Toast.makeText(length.this,"Thou="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Yards [yd]"))
                {
                    double x = 33745380577427820.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(length.this,"Yards [yd]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
            }}
        });
    }
}