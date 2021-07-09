package com.example.aswitch;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class speed extends AppCompatActivity {
    Spinner spinner,spinner2;
    private EditText edittext1;
    Button button;
    double z;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.speed);
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
                    Toast.makeText(speed.this,"Please Enter The Value",Toast.LENGTH_LONG).show();
                }
                else {
                    double a = Double.parseDouble(value1);
                switch (item) {
                    case "Centimeters/minute":
                        z = 0.00000000000055594;
                        break;
                    case "Centimeters/second":
                        z = 0.00000000003335668;
                        break;
                    case "Feet/hour":
                        z = 0.00000000000028242;
                        break;
                    case "Feet/minute":
                        z = 0.00000000001694519;
                        break;
                    case "Feet/second [ft/s]":
                        z =0.00000000101671170;
                        break;
                    case "Inches/minute":
                        z = 0.00000000000141210;
                        break;
                    case "Inches/second":
                        z = 0.00000000008472597;
                        break;
                    case "Kilometers/hour[km/h]":
                        z = 0.00000000092657453;
                        break;
                    case "Kilometers/second":
                        z = 0.00000333566830114;
                        break;
                    case "Knots [kn]":
                        z = 0.00000000171601603;
                        break;
                    case "Mach number (ISA/Sea level)":
                        z = 0.00000113510557390;
                        break;
                    case "Meter/hour [m/h]":
                        z = 0.00000000000092657;
                        break;
                    case "Meter/minute":
                        z = 0.00000000005559447;
                        break;
                    case "Meter/seconds [m/s]":
                        z = 0.00000000333566830;
                        break;
                    case "Miles/hour [mph]":
                        z = 0.00000000149117716;
                        break;
                    case "Miles/minute":
                        z = 0.00000008947062944;
                        break;
                    case "Mile/second":
                        z = 0.00000536823776644;
                        break;
                    case "Nautical miles/hour":
                        z = 0.00000000171601603;
                        break;
                    case "Nm/24hr":
                        z = 0.00000000007150067;
                        break;
                    case "Speed of light":
                        z = 1;
                        break;
                    case "Speed of sound":
                        z = 0.00000114413422729;
                        break;
                    case "Yards/hour":
                        z = 0.00000000000084726;
                        break;
                    case "Yards/minute":
                        z = 0.00000000005083558;
                        break;
                    case "yards/second":
                        z = 0.00000000305013509;
                        break;
                }

                if(item2.equals("Centimeters/minute"))
                {
                    double x = 1798740000000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(speed.this,"Centimeters/minute="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Centimeters/second"))
                {
                    double x = 29979000000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(speed.this,"Centimeters/second="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Feet/hour"))
                {
                    double x = 3540819690000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(speed.this,"Feet/hour="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Feet/minute"))
                {
                    double x = 59013779527.55905151367187500;
                    double ans = a * x*z;
                    Toast.makeText(speed.this,"Feet/minute="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Feet/second [ft/s]"))
                {
                    double x = 983562992.12598419189453125;
                    double ans = a * x*z;
                    Toast.makeText(speed.this,"Feet/second [ft/s]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Inches/minute"))
                {
                    double x = 708163937999.99987792968750000;
                    double ans = a * x*z;
                    Toast.makeText(speed.this,"Inches/mi="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Inches/second"))
                {
                    double x = 11802755905.51181221008300781;
                    double ans = a * x*z;
                    Toast.makeText(speed.this,"Inches/second="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Kilometers/hour[km/h]"))
                {
                    double x = 1079244000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(speed.this,"Kilometers/hour[km/h]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Kilometers/second"))
                {
                    double x = 299790.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(speed.this,"Kilometers/second="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Knots [kn]"))
                {
                    double x = 582745140.38876891136169434;
                    double ans = a * x*z;
                    Toast.makeText(speed.this,"Knots [kn]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Mach number (ISA/Sea level)"))
                {
                    double x = 880975.32334606652148068;
                    double ans = a * x*z;
                    Toast.makeText(speed.this,"Mach number (ISA/Sea level)="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Meter/hour [m/h]"))
                {
                    double x = 1079244000000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(speed.this,"Meter/hour [m/h]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Meter/minute"))
                {
                    double x = 17987400000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(speed.this,"Meter/minute="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Meter/seconds [m/s]"))
                {
                    double x = 299790000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(speed.this,"Meter/seconds [m/s]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Miles/hour [mph]"))
                {
                    double x = 670611130.99498927593231201;
                    double ans = a * x*z;
                    Toast.makeText(speed.this,"Miles/hour [mph]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Miles/minute"))
                {
                    double x = 11176852.18324982188642025;
                    double ans = a * x*z;
                    Toast.makeText(speed.this,"Miles/minute="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Mile/second"))
                {
                    double x = 186280.86972083034925163;
                    double ans = a * x*z;
                    Toast.makeText(speed.this,"Mile/second="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Nautical miles/hour"))
                {
                    double x = 582745140.38876891136169434;
                    double ans = a * x*z;
                    Toast.makeText(speed.this,"Nautical miles/hour="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }

                if(item2.equals("Nm/24hr"))
                {
                    double x = 13985883369.33045387268066406;
                    double ans = a * x*z;
                    Toast.makeText(speed.this,"Nm/24hr="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Speed of light"))
                {
                    double x = 1;
                    double ans = a * x*z;
                    Toast.makeText(speed.this,"Speed of light="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Speed of sound"))
                {
                    double x = 874023.32361516030505300;
                    double ans = a * x*z;
                    Toast.makeText(speed.this,"Speed of sound="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Yards/hour"))
                {
                    double x = 1180273230000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(speed.this,"Yards/hour="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Yards/minute"))
                {
                    double x = 19671259842.51968383789062500;
                    double ans = a * x*z;
                    Toast.makeText(speed.this,"Yards/minute="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("yards/second"))
                {
                    double x = 327854330.70866143703460693;
                    double ans = a * x*z;
                    Toast.makeText(speed.this,"yards/second="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
            }}
        });
    }
}