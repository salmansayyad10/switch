package com.example.aswitch;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class gst extends AppCompatActivity {
    Spinner spinner,spinner2;
    private EditText edittext1;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gst);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        spinner=(Spinner)findViewById(R.id.spinner);
        spinner2=(Spinner)findViewById(R.id.spinner2);
        button=(Button)findViewById(R.id.button2);
        edittext1 = (EditText) findViewById(R.id.editText1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1=edittext1.getText().toString();
                String itemx=spinner.getSelectedItem().toString();
                String item=spinner2.getSelectedItem().toString();
                if(value1.isEmpty())
                {
                    Toast.makeText(gst.this,"Please Enter The Value",Toast.LENGTH_LONG).show();
                }
                else {
                    double a = Double.parseDouble(value1);
                if(itemx.equals("No GST"))
                {
                    if (item.equals("5%")) {
                        double gst = a- (0.05 * a);
                        Toast.makeText(gst.this,"WITHOUT GST="+ String.valueOf(gst), Toast.LENGTH_SHORT).show();
                    }
                    if (item.equals("12%")) {
                        double gst =a-(0.12 * a) ;
                        Toast.makeText(gst.this,"WITHOUT GST="+ String.valueOf(gst), Toast.LENGTH_SHORT).show();
                    }
                    if (item.equals("18%")) {
                        double gst = a-(0.18 * a);
                        Toast.makeText(gst.this,"WITHOUT GST="+ String.valueOf(gst), Toast.LENGTH_SHORT).show();
                    }
                    if (item.equals("28%")) {
                        double gst = a-(0.28 * a);
                        Toast.makeText(gst.this, "WITHOUT GST="+String.valueOf(gst), Toast.LENGTH_SHORT).show();
                    }
                }
                if(itemx.equals("With GST"))
                {
                    if (item.equals("5%")) {
                        double gst = (0.05 * a) + a;
                        Toast.makeText(gst.this, "CGST/SGST="+String.valueOf(gst), Toast.LENGTH_SHORT).show();
                    }
                    if (item.equals("12%")) {
                        double gst = (0.12 * a) + a;
                        Toast.makeText(gst.this, "CGST/SGST="+String.valueOf(gst), Toast.LENGTH_SHORT).show();
                    }
                    if (item.equals("18%")) {
                        double gst = (0.18 * a) + a;
                        Toast.makeText(gst.this, "CGST/SGST="+String.valueOf(gst), Toast.LENGTH_SHORT).show();
                    }
                    if (item.equals("28%")) {
                        double gst = (0.28 * a) + a;
                        Toast.makeText(gst.this,"CGST/SGST="+ String.valueOf(gst), Toast.LENGTH_SHORT).show();
                    }
                }
            }}
        });
    }
}