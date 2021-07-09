package com.example.aswitch;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class storage extends AppCompatActivity {
    Spinner spinner,spinner2;
    private EditText edittext1;
    Button button;
    double z;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.storage);
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
                    Toast.makeText(storage.this,"Please Enter The Value",Toast.LENGTH_LONG).show();
                }
                else {
                    double a = Double.parseDouble(value1);
                switch (item) {
                    case "Bits":
                        z = 0.0000000000000000001;
                        break;
                    case "Bytes":
                        z = 0.0000000000000000009;
                        break;
                    case "Kilobits [Kb]":
                        z = 0.00000000000000011;
                        break;
                    case "Kilobytes [KB]":
                        z = 0.00000000000000089;
                        break;
                    case "Megabits [Mb]":
                        z = 0.00000000000011369;
                        break;
                    case "Megabytes [MB]":
                        z =0.00000000000090949;
                        break;
                    case "Gigabits [Gb]":
                        z = 0.00000000011641532;
                        break;
                    case "Gigabytes [GB]":
                        z = 0.00000000093132257;
                        break;
                    case "Terabits [Tb]":
                        z = 0.00000011920928955;
                        break;
                    case "Terabytes [TB]":
                        z = 0.00000095367431641;
                        break;
                    case "Petabits [Pb]":
                        z = 0.00012207031250000;
                        break;
                    case "Petabytes [PB]":
                        z = 0.00097656250000000;
                        break;
                    case "Exabits [Eb]":
                        z = 0.12500000000000000;
                        break;
                    case "Exabytes [EB]":
                        z =1;
                        break;
                }
                if(item2.equals("Bits"))
                {
                    double x = 9223372036854775808.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(storage.this,"Bits="+String.valueOf(ans),Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Bytes"))
                {
                    double x = 1152921504606846976.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(storage.this,"Bytes="+ String.valueOf(ans), Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Kilobits [Kb]"))
                {
                    double x = 9007199254740992.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(storage.this,"Kilobits [Kb]="+ String.valueOf(ans), Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Kilobytes [KB]"))
                {
                    double x =  1125899906842624.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(storage.this,"Kilobytes [KB]="+ String.valueOf(ans), Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Megabits [Mb]"))
                {
                    double x = 8796093022208.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(storage.this,"Megabits [Mb]="+ String.valueOf(ans), Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Megabytes [MB]"))
                {
                    double x = 1099511627776.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(storage.this,"Megabytes [MB]="+ String.valueOf(ans), Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Gigabits [Gb]"))
                {
                    double x = 8589934592.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(storage.this,"Gigabits [Gb]="+ String.valueOf(ans), Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Gigabytes [GB]"))
                {
                    double x = 1073741824.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(storage.this,"Gigabytes [GB]="+ String.valueOf(ans), Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Terabits [Tb]"))
                {
                    double x = 8388608.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(storage.this,"Terabits [Tb]="+ String.valueOf(ans), Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Terabytes [TB]"))
                {
                    double x = 1048576.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(storage.this,"Terabytes [TB]="+ String.valueOf(ans), Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Petabits [Pb]"))
                {
                    double x = 8192.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(storage.this,"Petabits [Pb]="+ String.valueOf(ans), Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Petabytes [PB]"))
                {
                    double x = 1024.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(storage.this,"Petabytes [PB]="+ String.valueOf(ans), Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Exabits [Eb]"))
                {
                    double x = 8.00000000000000000;
                    double ans = a * x*z;
                    Toast.makeText(storage.this,"Exabits [Eb]="+ String.valueOf(ans), Toast.LENGTH_LONG).show();
                }
                if(item2.equals("Exabytes [EB]"))
                {
                    double x =1;
                    double ans = a * x*z;
                    Toast.makeText(storage.this,"Exabytes [EB]="+ String.valueOf(ans), Toast.LENGTH_LONG).show();
                }
            }}
        });
    }
}