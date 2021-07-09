package com.example.aswitch;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class trigonometric extends AppCompatActivity {
    Spinner spinner;
    private EditText edittext1;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trigonometric);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        spinner=(Spinner)findViewById(R.id.spinner2);
        button=(Button)findViewById(R.id.button2);
        edittext1 = (EditText) findViewById(R.id.editText1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1=edittext1.getText().toString();
                String item=spinner.getSelectedItem().toString();
                if(value1.isEmpty())
                {
                    Toast.makeText(trigonometric.this,"Please Enter The Value",Toast.LENGTH_LONG).show();
                }
                else {
                    double a = Double.parseDouble(value1);
                    if (item.equals("Sin")) {
                        double radians = Math.toRadians(a);
                        double sinValue = Math.sin(radians);
                        Toast.makeText(trigonometric.this, "Sin:" + a + "=" + sinValue, Toast.LENGTH_SHORT).show();
                    }
                    if (item.equals("Cos")) {
                        double radians = Math.toRadians(a);
                        double sinValue = Math.cos(radians);
                        Toast.makeText(trigonometric.this, "Cos:" + a + "=" + sinValue, Toast.LENGTH_SHORT).show();
                    }
                    if (item.equals("Tan")) {
                        double radians = Math.toRadians(a);
                        double sinValue = Math.tan(radians);
                        Toast.makeText(trigonometric.this, "Tan:" + a + "=" + sinValue, Toast.LENGTH_SHORT).show();
                    }
                    if (item.equals("Cot")) {
                        double radians = Math.toRadians(a);
                        double sinValue = Math.tan(radians);
                        Toast.makeText(trigonometric.this, "Cot:" + a + "=" + 1 / (1 / sinValue), Toast.LENGTH_SHORT).show();
                    }
                    if (item.equals("Sec")) {
                        double radians = Math.toRadians(a);
                        double sinValue = Math.cos(radians);
                        Toast.makeText(trigonometric.this, "Sec:" + a + "=" + 1 / (1 / sinValue), Toast.LENGTH_SHORT).show();
                    }
                    if (item.equals("Cosec")) {
                        double radians = Math.toRadians(a);
                        double sinValue = Math.sin(radians);
                        Toast.makeText(trigonometric.this, "Cosec:" + a + "=" + 1 / (1 / sinValue), Toast.LENGTH_SHORT).show();
                    }

                }
            }
        });
    }
}