package com.example.aswitch;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class pressure extends AppCompatActivity {
    Spinner spinner,spinner2;
    private EditText edittext1;
    Button button;
    double z;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pressure);
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
                    Toast.makeText(pressure.this,"Please Enter The Value",Toast.LENGTH_LONG).show();
                }
                else {
                    double a = Double.parseDouble(value1);
                switch (item) {
                    case "Atmospheres [atm]":
                        z = 0.00000010132500000;
                        break;
                    case "Bars":
                        z = 0.00000010000000000;
                        break;
                    case "Centimeters mercury":
                        z = 0.00000000133322000;
                        break;
                    case "Centimeters water":
                        z = 0.00000000009806650;
                        break;
                    case "Feet of water":
                        z = 0.00000000298906692;
                        break;
                    case "Hectopascals [hPa]":
                        z = 0.00000000010000000;
                        break;
                    case "Inches of water":
                        z = 0.00000000024908891;
                        break;
                    case "Inches of mercury":
                        z = 0.00000000338638800;
                        break;
                    case "Kilogram force/sq.centimeter":
                        z = 0.00000009806650000;
                        break;
                    case "Kilogram force/sq.meter":
                        z = 0.00000000000980665;
                        break;
                    case "Kilonewtons/sq.meter":
                        z = 0.00000000100000000;
                        break;
                    case "Kilonewtons/sq.millimeter":
                        z = 0.00100000000000000;
                        break;
                    case "Kilopascals [kPa]":
                        z = 0.00000000100000000;
                        break;
                    case "Kips/sq.inch":
                        z = 0.00000689476000000;
                        break;
                    case "Meganewtones/sq.meter":
                        z = 0.00000100000000000;
                        break;
                    case "Meganewtones/sq.millimeter":
                        z = 1;
                        break;
                    case "Megapascals [MPa]":
                        z = 0.00000100000000000;
                        break;
                    case "Meter of water":
                        z = 0.00000000980665000;
                        break;
                    case "Millibars":
                        z = 0.00000000010000000;
                        break;
                    case "Millimeters of mercury [mmHg]":
                        z = 0.00000000013332200;
                        break;
                    case "Millimeters of water":
                        z = 0.00000000001000000;
                        break;
                    case "Newtons/sq.centimeter [N/cm2]":
                        z = 0.00000000000980665;
                        break;
                    case "Newtons/sq.meter [N/m2]":
                        z = 0.00000001000000000;
                        break;
                    case "Newtons/sq.millimeter [N/mm2]":
                        z = 0.00000100000000000;
                        break;
                    case "Pascals [Pa]":
                        z = 0.00000000000100000;
                        break;
                    case "Pounds force/sq.foot":
                        z = 0.00000000004788000;
                        break;
                    case "Pounds force/sq.inch [psi]":
                        z = 0.00000000689475700;
                        break;
                    case "Poundals/sq.foot":
                        z = 0.00000000000144816;
                        break;
                    case "Tons(Uk) force/sq.foot":
                        z = 0.00000010725100000;
                        break;
                    case "Tons(Uk) force/sq.inch":
                        z = 0.00001544430000000;
                        break;
                    case "Tons(US) force/sq.foot":
                        z =0.00000009576000000;
                        break;
                    case "Tons(US) force/sq.inch":
                        z = 0.00001378950000000;
                        break;
                    case "Tonnes force/sq.cm":
                        z = 0.00009806650000000;
                        break;
                    case "Tonnes force/sq.meter":
                        z = 0.00000000980665000;
                        break;
                    case "torr(mm Hg 0 C)":
                        z = 0.00000000013332200;
                        break;
                }
                if(item2.equals("Atmospheres [atm]"))
                {
                    double x = 9869232.66716012917459011;
                    double ans = a * x*z;
                    Toast.makeText(pressure.this,"Atmospheres [atm]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Bars"))
                {
                    double x = 10000000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(pressure.this,"Bars="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Centimeters mercury"))
                {
                    double x = 750063755.41921067237854004;
                    double ans = a * x*z;
                    Toast.makeText(pressure.this,"Centimeters mercury="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Centimeters water"))
                {
                    double x = 10197162129.77928161621093750;
                    double ans = a * x*z;
                    Toast.makeText(pressure.this,"Centimeters water="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Feet of water"))
                {
                    double x = 334552563.31296855211257935;
                    double ans = a * x*z;
                    Toast.makeText(pressure.this,"Feet of water="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Hectopascals [hPa]"))
                {
                    double x = 10000000000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(pressure.this,"Hectopascals [hPa]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Inches of water"))
                {
                    double x = 4014630759.75562286376953125;
                    double ans = a * x*z;
                    Toast.makeText(pressure.this,"Inches of water="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Inches of mercury"))
                {
                    double x = 295299888.84912186861038208;
                    double ans = a * x*z;
                    Toast.makeText(pressure.this,"Inches of mercury="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Kilogram force/sq.centimeter"))
                {
                    double x = 10197162.12977928295731544;
                    double ans = a * x*z;
                    Toast.makeText(pressure.this,"Kilogram force/sq.centimeter="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Kilogram force/sq.meter"))
                {
                    double x = 101971621297.79283142089843750;
                    double ans = a * x*z;
                    Toast.makeText(pressure.this,"Kilogram force/sq.meter="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Kilonewtons/sq.meter"))
                {
                    double x = 1000000000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(pressure.this,"Kilonewtons/sq.meter="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Kilonewtons/sq.millimeter"))
                {
                    double x = 1000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(pressure.this,"Kilonewtons/sq.millimeter="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Kilopascals [kPa]"))
                {
                    double x = 1000000000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(pressure.this,"Kilopascals [kPa]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Kips/sq.inch"))
                {
                    double x = 145037.68078946910100058;
                    double ans = a * x*z;
                    Toast.makeText(pressure.this,"Kips/sq.inch="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Meganewtones/sq.meter"))
                {
                    double x = 1000000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(pressure.this,"Meganewtones/sq.meter="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Meganewtones/sq.millimeter"))
                {
                    double x = 1;
                    double ans = a * x*z;
                    Toast.makeText(pressure.this,"Meganewtones/sq.millimeter="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Megapascals [MPa]"))
                {
                    double x = 1000000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(pressure.this,"Megapascals [MPa]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Meter of water"))
                {
                    double x = 101971621.29779282212257385;
                    double ans = a * x*z;
                    Toast.makeText(pressure.this,"Meter of water="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Millibars"))
                {
                    double x = 10000000000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(pressure.this,"Millibars="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Millimeters of mercury [mmHg]"))
                {
                    double x = 7500637554.19210624694824219;
                    double ans = a * x*z;
                    Toast.makeText(pressure.this,"Millimeters of mercury [mmHg]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Millimeters of water"))
                {
                    double x = 101971621297.79283142089843750;
                    double ans = a * x*z;
                    Toast.makeText(pressure.this,"Millimeters of water="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Newtons/sq.centimeter [N/cm2]"))
                {
                    double x =100000000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(pressure.this,"Newtons/sq.centimeter [N/cm2]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Newtons/sq.meter [N/m2]"))
                {
                    double x = 1000000000000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(pressure.this,"Newtons/sq.meter [N/m2]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Newtons/sq.millimeter [N/mm2]"))
                {
                    double x = 1000000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(pressure.this,"Newtons/sq.millimeter [N/mm2]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Pascals [Pa]"))
                {
                    double x = 1000000000000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(pressure.this,"Pascals [Pa]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Pounds force/sq.foot"))
                {
                    double x = 20885547201.33667373657226563;
                    double ans = a * x*z;
                    Toast.makeText(pressure.this,"Pounds force/sq.foot="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Pounds force/sq.inch [psi]"))
                {
                    double x = 145037743.89728310704231262;
                    double ans = a * x*z;
                    Toast.makeText(pressure.this,"Pounds force/sq.inch [psi]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Poundals/sq.foot"))
                {
                    double x = 100000000000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(pressure.this,"Poundals/sq.foot="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Tons(Uk) force/sq.foot"))
                {
                    double x = 690531432990.82983398437500000;
                    double ans = a * x*z;
                    Toast.makeText(pressure.this,"Tons(Uk) force/sq.foot="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Tons(Uk) force/sq.inch"))
                {
                    double x = 9323922.38767004571855068;
                    double ans = a * x*z;
                    Toast.makeText(pressure.this,"Tons(Uk) force/sq.inch="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Tons(US) force/sq.foot"))
                {
                    double x = 64748.80700323096243665;
                    double ans = a * x*z;
                    Toast.makeText(pressure.this,"Tons(US) force/sq.foot="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Tons(US) force/sq.inch"))
                {
                    double x = 10442773.60066833719611168;
                    double ans = a * x*z;
                    Toast.makeText(pressure.this,"Tons(US) force/sq.inch="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Tonnes force/sq.cm"))
                {
                    double x = 10197.16212977928262262;
                    double ans = a * x*z;
                    Toast.makeText(pressure.this,"Tonnes force/sq.cm="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Tonnes force/sq.meter"))
                {
                    double x = 101971621.29779282212257385;
                    double ans = a * x*z;
                    Toast.makeText(pressure.this,"Tonnes force/sq.meter="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("torr(mm Hg 0 C)"))
                {
                    double x = 7500637554.19210624694824219;
                    double ans = a * x*z;
                    Toast.makeText(pressure.this,"torr(mm Hg 0 C)="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
            }}
        });
    }
}