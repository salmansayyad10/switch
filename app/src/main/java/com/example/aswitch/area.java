package com.example.aswitch;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class area extends AppCompatActivity {
    Spinner spinner,spinner2;
    private EditText edittext1;
    Button button;
    double z;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.area);
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
                if (value1.isEmpty()) {
                    Toast.makeText(area.this, "Please Enter The Value", Toast.LENGTH_LONG).show();
                } else {
                    double a = Double.parseDouble(value1);
                    switch (item) {
                        case "Acres":
                            z = 0.000043;
                            break;
                        case "Ares":
                            z = 0.000001;
                            break;
                        case "Circular inches":
                            z = 0.00000000001;
                            break;
                        case "Hectares":
                            z = 0.000107;
                            break;
                        case "Hides":
                            z = 0.005202;
                            break;
                        case "Roods":
                            z = 0.000011;
                            break;
                        case "Square centimeters [cm²]":
                            z = 0.000000000001;
                            break;
                        case "Square feet (US and UK)":
                            z = 0.000000001;
                            break;
                        case "Square feet (US survey)":
                            z = 0.00000000099639466;
                            break;
                        case "Square inches":
                            z = 0.00000000000691938;
                            break;
                        case "Square kilometers [km²]":
                            z = 0.01072505995952343;
                            break;
                        case "Square meters [m²]":
                            z = 0.00000001072505996;
                            break;
                        case "Square miles":
                            z = 0.02777777777780638;
                            break;
                        case "Square millimeters [mm²]":
                            z = 0.00000000000001073;
                            break;
                        case "Squares (of timber)":
                            z = 0.00000009963906744;
                            break;
                        case "Square rods (or poles)":
                            z = 0.00000027126736111;
                            break;
                        case "Square yards":
                            z = 0.00000000896751607;
                            break;
                        case "Townships":
                            z = 1;
                            break;
                    }
                    if (item2.equals("Acres")) {
                        double x = 23039.99999997627674020;
                        double ans = a * x * z;
                        Toast.makeText(area.this, "Acres=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Ares")) {
                        double x = 932395.71972000005189329;
                        double ans = a * x * z;
                        Toast.makeText(area.this, "Ares=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Circular inches")) {
                        double x = 184010648818.54644775390625000;
                        double ans = a * x * z;
                        Toast.makeText(area.this, "Circular inches=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Hectares")) {
                        double x = 9323.95719719999942754;
                        double ans = a * x * z;
                        Toast.makeText(area.this, "Hectares=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Hides")) {
                        double x = 192.24654014845361871;
                        double ans = a * x * z;
                        Toast.makeText(area.this, "Hides=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Roods")) {
                        double x = 92159.99999990510696080;
                        double ans = a * x * z;
                        Toast.makeText(area.this, "Roods=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Square centimeters [cm²]")) {
                        double x = 932395719720.00000000000000000;
                        double ans = a * x * z;
                        Toast.makeText(area.this, "Square centimeters [cm²]=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Square feet (US and UK)")) {
                        double x = 1003622399.99896657466888428;
                        double ans = a * x * z;
                        Toast.makeText(area.this, "Square feet (US and UK)=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Square feet (US survey)")) {
                        double x = 1003618385.51635015010833740;
                        double ans = a * x * z;
                        Toast.makeText(area.this, "Square feet (US survey)=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Square inches")) {
                        double x = 144521625599.85119628906250000;
                        double ans = a * x * z;
                        Toast.makeText(area.this, "Square inches=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Square kilometers [km²]")) {
                        double x = 93.23957197200000735;
                        double ans = a * x * z;
                        Toast.makeText(area.this, "Square kilometers [km²]=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Square meters [m²]")) {
                        double x = 93239571.97200000286102295;
                        double ans = a * x * z;
                        Toast.makeText(area.this, "Square meters [m²]=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Square miles")) {
                        double x = 35.99999999996293099;
                        double ans = a * x * z;
                        Toast.makeText(area.this, "Square miles=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Square millimeters [mm²]")) {
                        double x = 93239571972000.00000000000000000;
                        double ans = a * x * z;
                        Toast.makeText(area.this, "Square millimeters [mm²]=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Squares (of timber)")) {
                        double x = 10036223.99998966604471207;
                        double ans = a * x * z;
                        Toast.makeText(area.this, "Squares (of timber)=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Square rods (or poles)")) {
                        double x = 3686399.99999620486050844;
                        double ans = a * x * z;
                        Toast.makeText(area.this, "Square rods (or poles)=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Square yards")) {
                        double x = 111513599.99988518655300140;
                        double ans = a * x * z;
                        Toast.makeText(area.this, "Square yards=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                    if (item2.equals("Townships")) {
                        double x = 1.000000;
                        double ans = a * x * z;
                        Toast.makeText(area.this, "Townships=" + String.valueOf(ans), Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}