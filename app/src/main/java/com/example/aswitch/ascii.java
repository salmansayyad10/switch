package com.example.aswitch;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class ascii extends AppCompatActivity {
    private EditText edittext1;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ascii);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
         button=(Button)findViewById(R.id.button2);
         edittext1 = (EditText) findViewById(R.id.editText1);
         button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value1=edittext1.getText().toString();
                if(value1.isEmpty())
                {
                    Toast.makeText(ascii.this,"Please Enter The Value",Toast.LENGTH_LONG).show();

                }
                else {

                    int ascii = value1.charAt(0);
                    Toast.makeText(ascii.this, "ASCII:"+value1.charAt(0)+"=" + ascii, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}