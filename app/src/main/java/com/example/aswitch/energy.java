package com.example.aswitch;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class energy extends AppCompatActivity {
    Spinner spinner,spinner2;
    private EditText edittext1;
    Button button;
    double z;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.energy);
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
                   Toast.makeText(energy.this,"Please Enter The Value",Toast.LENGTH_LONG).show();
                }
                else {
                    double a = Double.parseDouble(value1);

                switch (item) {
                    case "Btu (th)":
                        z =0.00000000000000105;
                        break;
                    case "Btu (mean)":
                        z = 0.00000000000000106;
                        break;
                    case "Calories (IT)":
                        z = 0.00000000000000000419;
                        break;
                    case "Calories (th)":
                        z = 0.00000000000000000418;
                        break;
                    case "Calories (mean)":
                        z = 0.00000000000000000419;
                        break;
                    case "Calories (15C)":
                        z = 0.00000000000000000419;
                        break;
                    case "Calories (20C)":
                        z = 0.000000000000000004182;
                        break;
                    case "Calories (food)":
                        z =0.00000000000000419;
                        break;
                    case "Centigrade heat units":
                        z = 0.00000000000000190;
                        break;
                    case "Dutch natural gas (m3,LHV)":
                        z = 0.00000000003165000;
                        break;
                    case "Electron volts [eV]":
                        z = 0.000000000000000000000000000000000000160;
                        break;
                    case "Ergs":
                        z = 0.0000000000000000000000001;
                        break;
                    case "Exajoules [EJ]":
                        z = 1;
                        break;
                    case "Foot pound force [ft lbs]":
                        z = 0.00000000000000000136;
                        break;
                    case "Foot poundals":
                        z =0.0000000000000000000421;
                        break;
                    case "Gasoline (L)":
                        z = 0.00000000003420000;
                        break;
                    case "Gigajolules [GJ]":
                        z = 0.00000000100000000;
                        break;
                    case "Gigawatt hours [GWh]":
                        z = 0.00000360000000000;
                        break;
                    case "Horsepower hours":
                        z = 0.00000000000268452;
                        break;
                    case "Inch pound force [in lbf]":
                        z = 0.0000000000000000001130;
                        break;
                    case "Joules [J]":
                        z = 0.00000000000000000100;
                        break;
                    case "Kilocalories (IT)":
                        z = 0.00000000000000419;
                        break;
                    case "Kilocalories (th)":
                        z = 0.00000000000000418;
                        break;
                    case "Kilogram force meters":
                        z = 0.000000000000000009807;
                        break;
                    case "Kilojoules [kJ]":
                        z = 0.000000000000001000000;
                        break;
                    case "Kilowatt hours [kWh]":
                        z = 0.00000000000360000;
                        break;
                    case "Megajoules [MJ]":
                        z = 0.00000000000100000;
                        break;
                    case "Megawatt hours [MWh]":
                        z = 0.00000000360000000;
                        break;
                    case "Newton meters [Nm]":
                        z = 0.000000000000000001;
                        break;
                    case "Petajoules [PJ]":
                        z = 0.00100000000000000;
                        break;
                    case "Treajoules [TJ]":
                        z = 0.00000100000000000;
                        break;
                    case "Terawatt hours [TWh]":
                        z = 0.00360000000000000;
                        break;
                    case "Therms":
                        z = 0.00000000010550559;
                        break;
                    case "Watt seconds [Ws]":
                        z = 0.000000000000000001;
                        break;
                    case "Watt hours [Wh]":
                        z = 0.00000000000000360;
                        break;
                }

                if(item2.equals("Btu (th)"))
                {
                    double x = 948451652677004.87500000000000000;
                    double ans = a * x*z;
                    Toast.makeText(energy.this,"Btu (th)="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Btu (mean)"))
                {
                    double x = 947086289031793.75000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(energy.this,"Btu (mean)="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Calories (IT)"))
                {
                    double x = 238845896627495936.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(energy.this,"Calories (IT)="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Calories (th)"))
                {
                    double x = 239005736137667296.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(energy.this,"Calories (th)="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Calories (mean)"))
                {
                    double x = 238662345287134688.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(energy.this,"Calories (mean)="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Calories (15C)"))
                {
                    double x = 238902957618615296.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(energy.this,"Calories (15C)="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Calories (20C)"))
                {
                    double x = 239125756235204096.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(energy.this,"Calories (20C)="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Calories (food)"))
                {
                    double x = 238891543239369.31250000000000000;
                    double ans = a * x*z;
                    Toast.makeText(energy.this,"Calories (food)="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Centigrade heat units"))
                {
                    double x =526205009471690.12500000000000000;
                    double ans = a * x*z;
                    Toast.makeText(energy.this,"Centigrade heat units="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Dutch natural gas (m3,LHV)"))
                {
                    double x = 31595576619.27330017089843750;
                    double ans = a * x*z;
                    Toast.makeText(energy.this,"Dutch natural gas (m3,LHV)="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Electron volts [eV]"))
                {
                    double x = 6.241457005723417e+36;
                    double ans = a * x*z;
                    Toast.makeText(energy.this,"Electron volts [eV]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Ergs"))
                {
                    double x = 1e+25;
                    double ans = a * x*z;
                    Toast.makeText(energy.this,"Ergs="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Exajoules [EJ]"))
                {
                    double x = 1;
                    double ans = a * x*z;
                    Toast.makeText(energy.this,"Exajoules [EJ]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Foot pound force [ft lbs]"))
                {
                    double x = 737562149277265408.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(energy.this,"Foot pound force [ft lbs]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Foot poundals"))
                {
                    double x = 23730422401518747648.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(energy.this,"Foot poundals="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Gasoline (L)"))
                {
                    double x = 29239766081.87134552001953125;
                    double ans = a * x*z;
                    Toast.makeText(energy.this,"Gasoline (L)="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Gigajolules [GJ]"))
                {
                    double x = 1000000000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(energy.this,"Gigajolules [GJ]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Gigawatt hours [GWh]"))
                {
                    double x = 277777.77777777775190771;
                    double ans = a * x*z;
                    Toast.makeText(energy.this,"Gigawatt hours [GWh]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Horsepower hours"))
                {
                    double x = 372506071848.97113037109375000;
                    double ans = a * x*z;
                    Toast.makeText(energy.this,"Horsepower hours="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Inch pound force [in lbf]"))
                {
                    double x = 8850745791327185920.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(energy.this,"Inch pound force [in lbf]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Joules [J]"))
                {
                    double x = 1000000000000000000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(energy.this,"Joules [J]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Kilocalories (IT)"))
                {
                    double x = 238845896627495.93750000000000000;
                    double ans = a * x*z;
                    Toast.makeText(energy.this,"Kilocalories (IT)="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Kilocalories (th)"))
                {
                    double x = 239005736137667.31250000000000000;
                    double ans = a * x*z;
                    Toast.makeText(energy.this,"Kilocalories (th)="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Kilogram force meters"))
                {
                    double x = 101971621297792832.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(energy.this,"Kilogram force meters="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Kilojoules [kJ]"))
                {
                    double x = 1000000000000000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(energy.this,"Kilojoules [kJ]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Kilowatt hours [kWh]"))
                {
                    double x = 277777777777.77777099609375000;
                    double ans = a * x*z;
                    Toast.makeText(energy.this,"Kilowatt hours [kWh]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Megajoules [MJ]"))
                {
                    double x = 1000000000000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(energy.this,"Megajoules [MJ]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Megawatt hours [MWh]"))
                {
                    double x = 277777777.77777779102325439;
                    double ans = a * x*z;
                    Toast.makeText(energy.this,"Megawatt hours [MWh]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Newton meters [Nm]"))
                {
                    double x = 1000000000000000000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(energy.this,"Newton meters [Nm]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Petajoules [PJ]"))
                {
                    double x = 1000000000000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(energy.this,"Petajoules [PJ]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Treajoules [TJ]"))
                {
                    double x = 1000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(energy.this,"Treajoules [TJ]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Terawatt hours [TWh]"))
                {
                    double x = 277.77777777777777146;
                    double ans = a * x*z;
                    Toast.makeText(energy.this,"Terawatt hours [TWh]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Therms"))
                {
                    double x = 9478171203.55108833312988281;
                    double ans = a * x*z;
                    Toast.makeText(energy.this,"Therms="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Watt seconds [Ws]"))
                {
                    double x = 1000000000000000000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(energy.this,"Watt seconds [Ws]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Watt hours [Wh]"))
                {
                    double x = 277777777777777.78125000000000000;
                    double ans = a * x*z;
                    Toast.makeText(energy.this,"Watt hours [Wh]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
            }}
        });
    }
}