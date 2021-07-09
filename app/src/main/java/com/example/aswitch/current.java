package com.example.aswitch;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class current extends AppCompatActivity {
    Spinner spinner,spinner2;
    private EditText edittext1;
    Button button;
    double z;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.current);
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
                    Toast.makeText(current.this,"Please Enter The Value",Toast.LENGTH_LONG).show();
                }
                else {
                    double a = Double.parseDouble(value1);

                switch (item) {
                    case "Abampere [abA]":
                        z = 0.00000000001000000;
                        break;
                    case "Ampere [A]":
                        z = 0.00000000000100000;
                        break;
                    case "Biot [Bi]":
                        z = 0.00000000001000000;
                        break;
                    case "Centiampere":
                        z = 0.00000000000001000;
                        break;
                    case "Coulomb/second":
                        z = 0.00000000000100000;
                        break;
                    case "EMU of current":
                        z = 0.00000000001000000;
                        break;
                    case "ESU of current":
                        z = 0.0000000000000000000003;
                        break;
                    case "Franklin/second":
                        z = 0.0000000000000000000003;
                        break;
                    case "Gaussian electric current":
                        z = 0.0000000000000000000003;
                        break;
                    case "Gigaampere":
                        z = 0.0000000000000000000003;
                        break;
                    case "Gilbert [Gi]":
                        z = 0.00100000000000000;
                        break;
                    case "Kiloampere [kA]":
                        z = 0.00000000100000000;
                        break;
                    case "Megaampere":
                        z = 0.00000100000000000;
                        break;
                    case "Microampere":
                        z = 0.000000000000000001;
                        break;
                    case "Milliampere [mA]":
                        z = 0.00000000000000100;
                        break;
                    case "Milliamp":
                        z = 0.00000000000000100;
                        break;
                    case "Nanoampere":
                        z = 0.000000000000000000001;
                        break;
                    case "Picoampere":
                        z = 0.000000000000000000000001;
                        break;
                    case "Siemens volt":
                        z = 0.00000000000100000;
                        break;
                    case "Statampere [stA]":
                        z = 0.0000000000000000000003;
                        break;
                    case "Teraampere":
                        z = 1;
                        break;
                    case "Volt/ohm":
                        z = 0.00000000000100000;
                        break;
                    case "Watt/volt":
                        z = 0.00000000000100000;
                        break;
                    case "Weber/henry":
                        z = 0.00000000000100000;
                        break;
                }

                if(item2.equals("Abampere [abA]"))
                {
                    double x = 100000000000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(current.this,"Abampere [abA]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Ampere [A]"))
                {
                    double x = 1000000000000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(current.this,"Ampere [A]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Biot [Bi]"))
                {
                    double x = 100000000000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(current.this,"Biot [Bi]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Centiampere"))
                {
                    double x = 100000000000000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(current.this,"Centiampere="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Coulomb/second"))
                {
                    double x = 1000000000000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(current.this,"Coulomb/second="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("EMU of current"))
                {
                    double x = 100000000000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(current.this,"EMU of current="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("ESU of current"))
                {
                    double x = 2.9979245368431435e+21;
                    double ans = a * x*z;
                    Toast.makeText(current.this,"ESU of current="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Franklin/second"))
                {
                    double x = 2.9979245368431435e+21;
                    double ans = a * x*z;
                    Toast.makeText(current.this,"Franklin/second="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Gaussian electric current"))
                {
                    double x =2.9979245368431435e+21 ;
                    double ans = a * x*z;
                    Toast.makeText(current.this,"Gaussian electric current="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Gigaampere"))
                {
                    double x = 1000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(current.this,"Gigaampere="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Gilbert [Gi]"))
                {
                    double x = 1256637054265.81030273437500000;
                    double ans = a * x*z;
                    Toast.makeText(current.this,"Gilbert [Gi]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Kiloampere [kA]"))
                {
                    double x = 1000000000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(current.this,"Kiloampere [kA]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Megaampere"))
                {
                    double x = 1000000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(current.this,"Megaampere="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Microampere"))
                {
                    double x = 1000000000000000000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(current.this,"Microampere="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Milliampere [mA]"))
                {
                    double x = 1000000000000000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(current.this,"Milliampere [mA]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Milliamp"))
                {
                    double x = 1000000000000000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(current.this,"Milliamp="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Nanoampere"))
                {
                    double x = 1e+21;
                    double ans = a * x*z;
                    Toast.makeText(current.this,"Nanoampere="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Picoampere"))
                {
                    double x = 1e+24;
                    double ans = a * x*z;
                    Toast.makeText(current.this,"Picoampere="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Siemens volt"))
                {
                    double x = 1000000000000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(current.this,"Siemens volt="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Statampere [stA]"))
                {
                    double x = 2.9979245368431435e+21;
                    double ans = a * x*z;
                    Toast.makeText(current.this,"Statampere [stA]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Teraampere"))
                {
                    double x = 1.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(current.this,"Teraampere="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Volt/ohm"))
                {
                    double x = 1.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(current.this,"Volt/ohm="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Watt/volt"))
                {
                    double x = 1000000000000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(current.this,"Watt/volt="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Weber/henry"))
                {
                    double x = 1000000000000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(current.this,"Weber/henry="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
            }
            }
        });
    }
}