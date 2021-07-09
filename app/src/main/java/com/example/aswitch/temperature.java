package com.example.aswitch;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class temperature extends AppCompatActivity {
    Spinner spinner,spinner2;
    private EditText edittext1;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.temperature);
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
                    Toast.makeText(temperature.this,"Please Enter The Value",Toast.LENGTH_LONG).show();
                }
                else {
                    double a = Double.parseDouble(value1);

                    if(item.equals("Celsius [C]"))
                    {
                        if(item2.equals("Celsius [C]"))
                        {
                            double x = 1;
                            double ans = a * x;
                            Toast.makeText(temperature.this,"Celsius [C]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                        }
                        if(item2.equals("Fahrenheit [F]"))
                        {
                            double ans = ((a*(1.8))+32);
                            Toast.makeText(temperature.this,"Fahrenheit [F]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                        }
                        if(item2.equals("Kelvin [K]"))
                        {
                                double ans = a+273.15;
                                Toast.makeText(temperature.this,"Kelvin [K]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                        }
                    }
                    if(item.equals("Fahrenheit [F]"))
                    {
                        if(item2.equals("Celsius [C]"))
                        {
                            double ans = (a-32)*1.8;
                            Toast.makeText(temperature.this,"Celsius [C]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                        }
                        if(item2.equals("Fahrenheit [F]"))
                        {

                            double x = 1;
                            double ans = a * x;
                            Toast.makeText(temperature.this,"Fahrenheit [F]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                        }
                        if(item2.equals("Kelvin [K]"))
                        {
                            double ans = ((a-32)*1.8)+273.15;
                            Toast.makeText(temperature.this,"Kelvin [K]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                        }
                    }
                    if(item.equals("Kelvin [K]"))
                    {
                        if(item2.equals("Celsius [C]"))
                        {
                            double ans = (a-273.15);
                            Toast.makeText(temperature.this,"Celsius [C]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                        }
                        if(item2.equals("Fahrenheit [F]"))
                        {

                            double x = 1;
                            double ans = ((a-273.15)*1.8)+32;
                            Toast.makeText(temperature.this,"Fahrenheit [F]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                        }
                        if(item2.equals("Kelvin [K]"))
                        {
                            double x = 1;
                            double ans = a * x;
                            Toast.makeText(temperature.this,"Kelvin [K]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                        }
                    }
            }}
        });
    }
}