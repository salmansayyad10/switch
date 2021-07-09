package com.example.aswitch;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class binary extends AppCompatActivity {
    Spinner spinner;
    private EditText edittext1;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.binary);
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
                    Toast.makeText(binary.this, "Please The Enter Value", Toast.LENGTH_LONG).show();
                }
                else {
                    double a = Double.parseDouble(value1);
                    if (item.equals("Binary")) {
                        if (a == (int) a) {
                            int x = (int) a;
                            Toast.makeText(binary.this, "Binary=" + Integer.toBinaryString(x), Toast.LENGTH_SHORT).show();
                        } else {
                            long doubleBits = Double.doubleToLongBits(a);
                            String doubleBitsStr = Long.toBinaryString(doubleBits);
                            Toast.makeText(binary.this, "Binary=" + doubleBitsStr, Toast.LENGTH_SHORT).show();
                        }
                    }
                    if (item.equals("Octal")) {
                        if (a == (int) a) {
                            int x = (int) a;
                            Toast.makeText(binary.this, "Octal=" + Integer.toOctalString(x), Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(binary.this, "Please Enter Decimal Number", Toast.LENGTH_SHORT).show();
                        }
                    }
                    if (item.equals("Hexadecimal")) {
                        if (a == (int) a) {
                            int x = (int) a;
                            Toast.makeText(binary.this, "Hexadecimal=" + Integer.toHexString(x), Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(binary.this, "Please Enter Decimal Number", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            }
        });
    }
}