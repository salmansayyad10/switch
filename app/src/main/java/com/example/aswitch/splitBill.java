package com.example.aswitch;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class splitBill extends AppCompatActivity {
    private EditText amount1,people1;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splitbill);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        button=(Button)findViewById(R.id.button2);
        amount1 = (EditText) findViewById(R.id.amount);
        people1= (EditText) findViewById(R.id.people);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1 = amount1.getText().toString();
                String value2 = people1.getText().toString();
                if (value1.isEmpty() || value2.isEmpty()) {
                    Toast.makeText(splitBill.this, "Please Enter The Value", Toast.LENGTH_LONG).show();
                } else {
                    double a = Double.parseDouble(value1);
                    double b = Double.parseDouble(value2);
                    double c = a / b;
                    Toast.makeText(splitBill.this, "Split Amount=" + String.valueOf(c), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}