package com.example.aswitch;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class circle extends AppCompatActivity {
    Spinner spinner;
    private EditText edittext1;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.circle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        spinner=(Spinner)findViewById(R.id.spinner2);
        button=(Button)findViewById(R.id.button2);
        edittext1 = (EditText) findViewById(R.id.editText1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1 = edittext1.getText().toString();

                String item = spinner.getSelectedItem().toString();
                if (value1.isEmpty()) {
                    Toast.makeText(circle.this, "Please Enter The Value", Toast.LENGTH_LONG).show();

                } else {
                    double a = Double.parseDouble(value1);
                    if (item.equals("Area")) {
                        double x = Math.PI * a * a;
                        Toast.makeText(circle.this, "Area Of Circle=" + x, Toast.LENGTH_SHORT).show();
                    }
                    if (item.equals("Diameter")) {
                        double x = 2 * a;
                        Toast.makeText(circle.this, "Diameter Of Circle=" + x, Toast.LENGTH_SHORT).show();
                    }
                    if (item.equals("Circumference")) {
                        double x = 2 * Math.PI * a;
                        Toast.makeText(circle.this, "Circumference Of Circle=" + x, Toast.LENGTH_SHORT).show();
                    }
                    if (item.equals("Radius")) {
                        double x = (2 * Math.PI * a) / 2 * Math.PI;
                        Toast.makeText(circle.this, "Radius Circle=" + x, Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}