package com.example.aswitch;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class force extends AppCompatActivity {
    Spinner spinner,spinner2;
    private EditText edittext1;
    Button button;
    double z;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.force);
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
                    Toast.makeText(force.this,"Please Enter The Value",Toast.LENGTH_LONG).show();
                }
                else {
                    double a = Double.parseDouble(value1);
                switch (item) {
                    case "Dynes [dyn]":
                        z = 0.00000000001000000;
                        break;
                    case "Kilogram force[kgf]":
                        z = 0.00000980665000000;
                        break;
                    case "Kilonewtones [kN]":
                        z = 0.00100000000000000;
                        break;
                    case "Kips":
                        z = 0.00444822200000000;
                        break;
                    case "Meganewtons [MN]":
                        z = 1;
                        break;
                    case "Newtons [N]":
                        z = 0.00000000001000000;
                        break;
                    case "Pounds force [lbf]":
                        z = 0.00000444822161526;
                        break;
                    case "Poundals [pdl]":
                        z = 0.00000013825500000;
                        break;
                    case "Sthene [sn]":
                        z =0.00100000000000000;
                        break;
                    case "Tonnes force":
                        z = 0.00980665000000000;
                        break;
                    case "Tone force (UK)":
                        z = 0.00996401641818352;
                        break;
                    case "Tone force (US)":
                        z = 0.00889644323052100;
                        break;
                }
                if(item2.equals("Dynes [dyn]"))
                {
                    double x = 99999999999.99998474121093750;
                    double ans = a * x*z;
                    Toast.makeText(force.this,"Dynes [dyn]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Kilogram force[kgf]"))
                {
                    double x = 101971.62129779283714015;
                    double ans = a * x*z;
                    Toast.makeText(force.this,"Kilogram force[kgf]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Kilonewtones [kN]"))
                {
                    double x = 1000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(force.this,"Kilonewtones [kN]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Kips"))
                {
                    double x = 224.80892365533915722;
                    double ans = a * x*z;
                    Toast.makeText(force.this,"Kips="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Kips"))
                {
                    double x = 1;
                    double ans = a * x*z;
                    Toast.makeText(force.this,"Kips="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Newtons [N]"))
                {
                    double x = 1000000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(force.this,"Newtons [N]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Pounds force [lbf]"))
                {
                    double x = 224808.94309971050824970;
                    double ans = a * x*z;
                    Toast.makeText(force.this,"Pounds force [lbf]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Poundals [pdl]"))
                {
                    double x = 7233011.46432317141443491;
                    double ans = a * x*z;
                    Toast.makeText(force.this,"Poundals [pdl]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Sthene [sn]"))
                {
                    double x =1000.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(force.this,"Sthene [sn]="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Tonnes force"))
                {
                    double x = 101.97162129779282225;
                    double ans = a * x*z;
                    Toast.makeText(force.this,"Tonnes force="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Tone force (UK)"))
                {
                    double x = 100.36113531237074881;
                    double ans = a * x*z;
                    Toast.makeText(force.this,"Tone force (UK)="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Tone force (US)"))
                {
                    double x = 112.40447154985524492;
                    double ans = a * x*z;
                    Toast.makeText(force.this,"Tone force (US)="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
            }}
        });
    }
}