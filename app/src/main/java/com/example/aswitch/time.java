package com.example.aswitch;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class time extends AppCompatActivity {
    Spinner spinner,spinner2;
    private EditText edittext1;
    Button button;
    double z;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.time);
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
                    Toast.makeText(time.this,"Please Enter The Value",Toast.LENGTH_LONG).show();
                }
                else {
                    double a = Double.parseDouble(value1);
                switch (item) {
                    case "Centuries":
                        z = 0.10000000000000001;
                        break;
                    case "Days [d]":
                        z = 0.00000273972602740;
                        break;
                    case "Decades":
                        z =0.01000000000000000;
                        break;
                    case "Femtoseconds [fs]":
                        z = 0.0000000000000000000000000317;
                        break;
                    case "Fortnights":
                        z = 0.00003835616438356;
                        break;
                    case "Hours [h]":
                        z = 0.00000011415525114;
                        break;
                    case "Microseconds [μs]":
                        z = 0.00000000000000003171;
                        break;
                    case "Millenia":
                        z = 1;
                        break;
                    case "Milliseconds [ms]":
                        z = 0.00000000000003171;
                        break;
                    case "Minutes [min]":
                        z = 0.00000000190258752;
                        break;
                    case "Months (Common)":
                        z = 0.00008333333333333;
                        break;
                    case "Moths (Synodic)":
                        z = 0.00008090572328767;
                        break;
                    case "Nanoseconds [ns]":
                        z = 0.0000000000000000000317;
                        break;
                    case "Picoseconds [ps]":
                        z = 0.00000000000000000000003171;
                        break;
                    case "Quarters (Common)":
                        z = 0.00025000000000000;
                        break;
                    case "Seconds [s]":
                        z =0.00000000003170979;
                        break;
                    case "Shakes":
                        z =0.0000000000000000003171;
                        break;
                    case "Weeks":
                        z = 0.00001917808219178;
                        break;
                    case "Years (Common) [y]":
                        z = 0.00100000000000000;
                        break;
                    case "Years (Average Gregorian)":
                        z = 0.00100066438356164;
                        break;
                    case "Years (Julian)":
                        z = 0.00100068493150685;
                        break;
                    case "Years (Leap)":
                        z = 0.00100273972602740;
                        break;
                    case "Years (Tropical)":
                        z = 0.00100066353424658;
                        break;
                }
                if(item2.equals("Centuries"))
                {
                    double x = 10.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(time.this,"Centuries="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Days [d]"))
                {
                    double x = 365000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(time.this,"Days [d]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Decades"))
                {
                    double x = 100.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(time.this,"Decades="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Femtoseconds [fs]"))
                {
                    double x = 3.1535999999999997e+25;
                    double ans = a * x*z;
                    Toast.makeText(time.this,"Femtoseconds [fs]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Fortnights"))
                {
                    double x = 26071.42857142857246799;
                    double ans = a * x*z;
                    Toast.makeText(time.this,"Fortnights="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Hours [h]"))
                {
                    double x = 8760000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(time.this,"Hours [h]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Microseconds [μs]"))
                {
                    double x = 31536000000000000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(time.this,"Microseconds [μs]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Millenia"))
                {
                    double x = 1;
                    double ans = a * x*z;
                    Toast.makeText(time.this,"Millenia="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Milliseconds [ms]"))
                {
                    double x = 31536000000000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(time.this,"Milliseconds [ms]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Minutes [min]"))
                {
                    double x = 525600000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(time.this,"Minutes [min]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Months (Common)"))
                {
                    double x = 12000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(time.this,"Months (Common)="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Moths (Synodic)"))
                {
                    double x = 12360.06501597377609869;
                    double ans = a * x*z;
                    Toast.makeText(time.this,"Moths (Synodic)="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Nanoseconds [ns]"))
                {
                    double x = 31536000000000000000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(time.this,"Nanoseconds [ns]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Picoseconds [ps]"))
                {
                    double x = 3.1536e+22;
                    double ans = a * x*z;
                    Toast.makeText(time.this,"Picoseconds [ps]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Quarters (Common)"))
                {
                    double x = 4000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(time.this,"Quarters (Common)="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Seconds [s]"))
                {
                    double x = 31536000000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(time.this,"Seconds [s]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Shakes"))
                {
                    double x = 3153600000000000000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(time.this,"Shakes="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Weeks"))
                {
                    double x = 52142.85714285714493599;
                    double ans = a * x*z;
                    Toast.makeText(time.this,"Weeks="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Years (Common) [y]"))
                {
                    double x = 1000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(time.this,"Years (Common) [y]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Years (Average Gregorian)"))
                {
                    double x = 999.33605755080532163;
                    double ans = a * x*z;
                    Toast.makeText(time.this,"Years (Average Gregorian)="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Years (Julian)"))
                {
                    double x =999.31553730321695639;
                    double ans = a * x*z;
                    Toast.makeText(time.this,"Years (Julian)="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Years (Leap)"))
                {
                    double x = 997.26775956284154745;
                    double ans = a * x*z;
                    Toast.makeText(time.this,"Years (Leap)="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Years (Tropical)"))
                {
                    double x = 999.33690573917544953;
                    double ans = a * x*z;
                    Toast.makeText(time.this,"Years (Tropical)="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
            }}
        });
    }
}