package com.example.aswitch;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class angle extends AppCompatActivity {
    Spinner spinner,spinner2;
    private EditText edittext1;
    Button button;
    double z;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.angle);
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
                   Toast.makeText(angle.this,"Please Enter The Value",Toast.LENGTH_LONG).show();
               }
               else {
                   double a = Double.parseDouble(value1);
                   switch (item) {
                       case "Arcminute":
                           z = 0.000046;
                           break;
                       case "Arcsecond":
                           z = 0.000001;
                           break;
                       case "Circle":
                           z = 1;
                           break;
                       case "Degree [°]":
                           z = 0.002778;
                           break;
                       case "Gon":
                           z = 0.002500;
                           break;
                       case "Grad":
                           z = 0.002500;
                           break;
                       case "Mil (Nato)":
                           z = 0.000156;
                           break;
                       case "Mil (Soviet Union)":
                           z = 0.000167;
                           break;
                       case "Mil (Sweden)":
                           z = 0.000159;
                           break;
                       case "Octant":
                           z = 0.125000;
                           break;
                       case "Quadrant":
                           z = 0.250000;
                           break;
                       case "Radian":
                           z = 0.159155;
                           break;
                       case "Revolution":
                           z = 1.000000;
                           break;
                       case "Sextant":
                           z = 0.166667;
                           break;
                       case "Sign":
                           z = 0.083333;
                           break;
                       case "Turn":
                           z = 1.000000;
                           break;
                   }
                   if (item2.equals("Arcminute")) {
                       double x = 21600.000000;
                       double ans = a * x * z;
                       Toast.makeText(angle.this, "Arcminute=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                   }
                   if (item2.equals("Arcsecond")) {
                       double x = 1296000.000000;
                       double ans = a * x * z;
                       Toast.makeText(angle.this, "Arcsecond=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                   }
                   if (item2.equals("Circle")) {
                       double x = 1.000000;
                       double ans = a * x * z;
                       Toast.makeText(angle.this, "Circle=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                   }
                   if (item2.equals("Degree [°]")) {
                       double x = 360.000000;
                       double ans = a * x * z;
                       Toast.makeText(angle.this, "Degree [°]=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                   }
                   if (item2.equals("Gon")) {
                       double x = 400.000000;
                       double ans = a * x * z;
                       Toast.makeText(angle.this, "Gon=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                   }
                   if (item2.equals("Grad")) {
                       double x = 400.000000;
                       double ans = a * x * z;
                       Toast.makeText(angle.this, "Grad=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                   }
                   if (item2.equals("Mil (Nato)")) {
                       double x = 6400.000000;
                       double ans = a * x * z;
                       Toast.makeText(angle.this, "Mil (Nato)=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                   }
                   if (item2.equals("Mil (Soviet Union)")) {
                       double x = 6000.000000;
                       double ans = a * x * z;
                       Toast.makeText(angle.this, "Mil (Soviet Union)=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                   }
                   if (item2.equals("Mil (Sweden)")) {
                       double x = 6300.000000;
                       double ans = a * x * z;
                       Toast.makeText(angle.this, "Mil (Sweden)=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                   }
                   if (item2.equals("Octant")) {
                       double x = 8.000000;
                       double ans = a * x * z;
                       Toast.makeText(angle.this, "Octant=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                   }
                   if (item2.equals("Quadrant")) {
                       double x = 4.000000;
                       double ans = a * x * z;
                       Toast.makeText(angle.this, "Quadrant=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                   }
                   if (item2.equals("Radian")) {
                       double x = 6.283185;
                       double ans = a * x * z;
                       Toast.makeText(angle.this, "Radian=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                   }
                   if (item2.equals("Revolution")) {
                       double x = 1.000000;
                       double ans = a * x * z;
                       Toast.makeText(angle.this, "Revolution=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                   }
                   if (item2.equals("Sextant")) {
                       double x = 6.000000;
                       double ans = a * x * z;
                       Toast.makeText(angle.this, "Sextant=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                   }
                   if (item2.equals("Sign")) {
                       double x = 12.000000;
                       double ans = a * x * z;
                       Toast.makeText(angle.this, "Sign=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                   }
                   if (item2.equals("Turn")) {
                       double x = 1.000000;
                       double ans = a * x * z;
                       Toast.makeText(angle.this, "Turn=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                   }
               }
            }
        });
    }
}