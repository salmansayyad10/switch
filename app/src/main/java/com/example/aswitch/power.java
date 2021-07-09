package com.example.aswitch;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class power extends AppCompatActivity {
    Spinner spinner,spinner2;
    private EditText edittext1;
    Button button;
    double z;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.power);
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
                    Toast.makeText(power.this,"Please Enter The Value",Toast.LENGTH_LONG).show();
                }
                else {
                    double a = Double.parseDouble(value1);
                switch (item) {
                    case "Btn/hour":
                        z = 0.00000000000000029;
                        break;
                    case "Btn/minute":
                        z = 0.00000000000001758;
                        break;
                    case "Btn/second":
                        z = 0.00000000000105506;
                        break;
                    case "Calories(th)/hour":
                        z = 0.00000000000000000116;
                        break;
                    case "Calories(th)/minute":
                        z = 0.0000000000000000697;
                        break;
                    case "Calories(th)/second":
                        z = 0.00000000000000418;
                        break;
                    case "Foot pounds force/minute":
                        z = 0.00000000000000002260;
                        break;
                    case "Foot pounds force/second":
                        z = 0.00000000000000135582;
                        break;
                    case "Gigawatts [GW]":
                        z = 0.00000100000000000;
                        break;
                    case "Horsepowers (electric)":
                        z = 0.00000000000074600;
                        break;
                    case "Horsepowers (international)":
                        z = 0.00000000000074570;
                        break;
                    case "Horsepowers (water)":
                        z = 0.00000000000074604;
                        break;
                    case "Horsepowers (metric)":
                        z = 0.00000000000073550;
                        break;
                    case "Watts [W]":
                        z = 0.00000000000000100;
                        break;
                    case "Joules/hour":
                        z = 0.000000000000000000278;
                        break;
                    case "Joules/minute":
                        z = 0.00000000000000001667;
                        break;
                    case "Joules/seconds":
                        z =0.00000000000000100;
                        break;
                    case "Kilocalories(th)/hour":
                        z = 0.00000000000000116;
                        break;
                    case "Kilocalories(th)/minute":
                        z = 0.00000000000006973;
                        break;
                    case "Kilogram force meters/hour":
                        z = 0.00000000000000000272;
                        break;
                    case "Kilogram force meters/minute":
                        z = 0.0000000000000001634;
                        break;
                    case "Kilowatts [kW]":
                        z = 0.00000000000100000;
                        break;
                    case "Megawatts [MW]":
                        z = 0.00000000100000000;
                        break;
                    case "Terawatts [TW]":
                        z = 0.00100000000000000;
                        break;
                    case "Ton of refrigeration [TR]":
                        z = 0.00000000000351685;
                        break;
                    case "Petawatts [PW]":
                        z = 1;
                        break;
                }
                if(item2.equals("Btn/hour"))
                {
                    double x = 3412141285851795.50000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(power.this,"Btn/hour="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Btn/minute"))
                {
                    double x = 56869018196777.83593750000000000;
                    double ans = a * x*z;
                    Toast.makeText(power.this,"Btn/minute="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Btn/second"))
                {
                    double x = 947816987913.43774414062500000;
                    double ans = a * x*z;
                    Toast.makeText(power.this,"Btn/second="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Calories(th)/hour"))
                {
                    double x = 860420650095602432.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(power.this,"Calories(th)/hour="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Calories(th)/minute"))
                {
                    double x = 14340344168260040.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(power.this,"Calories(th)/minute="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Calories(th)/second"))
                {
                    double x = 239005736137667.28125000000000000;
                    double ans = a * x*z;
                    Toast.makeText(power.this,"Calories(th)/second="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Foot pounds force/minute"))
                {
                    double x = 44253661990529720.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(power.this,"Foot pounds force/minute="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Foot pounds force/second"))
                {
                    double x = 737561033175495.25000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(power.this,"Foot pounds force/second="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Gigawatts [GW]"))
                {
                    double x = 1000000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(power.this,"Gigawatts [GW]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Horsepowers (electric)"))
                {
                    double x = 1340482573726.54150390625000000;
                    double ans = a * x*z;
                    Toast.makeText(power.this,"Horsepowers (electric)="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Horsepowers (international)"))
                {
                    double x = 1341022089595.02783203125000000;
                    double ans = a * x*z;
                    Toast.makeText(power.this,"Horsepowers (international)="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Horsepowers (water)"))
                {
                    double x = 1340405311758.16943359375000000;
                    double ans = a * x*z;
                    Toast.makeText(power.this,"Horsepowers (water)="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Horsepowers (metric)"))
                {
                    double x = 1359621524875.36352539062500000;
                    double ans = a * x*z;
                    Toast.makeText(power.this,"Horsepowers (metric)="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Watts [W]"))
                {
                    double x = 1000000000000000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(power.this,"Watts [W]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Joules/hour"))
                {
                    double x = 3600000000000000000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(power.this,"Joules/hour="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Joules/minute"))
                {
                    double x = 60000000000000000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(power.this,"Joules/minute="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Joules/seconds"))
                {
                    double x = 1000000000000000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(power.this,"Joules/seconds="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Kilocalories(th)/hour"))
                {
                    double x = 860420650095602.25000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(power.this,"Kilocalories(th)/hour="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Kilocalories(th)/minute"))
                {
                    double x = 14340344168260.03710937500000000;
                    double ans = a * x*z;
                    Toast.makeText(power.this,"Kilocalories(th)/minute="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Kilogram force meters/hour"))
                {
                    double x = 367107195301027904.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(power.this,"Kilogram force meters/hour="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Kilogram force meters/minute"))
                {
                    double x = 6118303516800861.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(power.this,"Kilogram force meters/minute="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Kilowatts [kW]"))
                {
                    double x = 1000000000000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(power.this,"Kilowatts [kW]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Megawatts [MW]"))
                {
                    double x = 1000000000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(power.this,"Megawatts [MW]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Terawatts [TW]"))
                {
                    double x = 1000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(power.this,"Terawatts [TW]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Ton of refrigeration [TR]"))
                {
                    double x = 284345123324.74517822265625000;
                    double ans = a * x*z;
                    Toast.makeText(power.this,"Ton of refrigeration [TR]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Petawatts [PW]"))
                {
                    double x = 1;
                    double ans = a * x*z;
                    Toast.makeText(power.this,"Petawatts [PW]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
            }}
        });
    }
}