package com.example.aswitch;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class    operation extends AppCompatActivity {
    Spinner spinner;
    private EditText edittext1;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.operation);
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
                    Toast.makeText(operation.this,"Please Enter The Value",Toast.LENGTH_LONG).show();
                }
                else {
                    double a = Double.parseDouble(value1);
                if(item.equals("Even Or Odd"))
                {
                    if(a % 2 == 0)
                    {
                            Toast.makeText(operation.this, "Even Number=" + a, Toast.LENGTH_SHORT).show();
                    }
                    else
                        {
                            Toast.makeText(operation.this, "Odd Number=" + a, Toast.LENGTH_SHORT).show();
                        }
                }
               if(item.equals("Positive Or Negative"))
                {
                    if(a>=0)
                    {
                        Toast.makeText(operation.this, "Positive Number=" + a, Toast.LENGTH_SHORT).show();
                    }
                    else
                    {
                        Toast.makeText(operation.this, "Negative Number=" + a, Toast.LENGTH_SHORT).show();
                    }
                }
                if(item.equals("Sum Of Number"))
                {
                    int sum=0;
                    for(int i = 1; i <= a; ++i)
                    {
                           sum += i;
                    }
                        Toast.makeText(operation.this, "Sum=" + sum, Toast.LENGTH_SHORT).show();
                }

                if(item.equals("Factorial"))
                {
                    long factorial = 1;
                    for(int i = 1; i <= a; ++i)
                    {
                         factorial *= i;
                    }
                    Toast.makeText(operation.this, "Factorial=" + factorial, Toast.LENGTH_SHORT).show();
                }
                if(item.equals("Reverse"))
                {    double reversed = 0;
                    while(a != 0) {
                        double digit = a % 10;
                        reversed = reversed * 10 + digit;
                        a /= 10;
                    }
                    Toast.makeText(operation.this, "Reversed Number:=" + reversed, Toast.LENGTH_SHORT).show();
                }
                if(item.equals("Square"))
                {
                    Toast.makeText(operation.this, "Square:=" + a*a, Toast.LENGTH_SHORT).show();
                }
                if(item.equals("Cube"))
                {
                    Toast.makeText(operation.this, "Cube:=" + a*a*a, Toast.LENGTH_SHORT).show();
                }

               if(item.equals("Palindrome Number")) {

                   double reversedInteger = 0, remainder, originalInteger;
                   originalInteger = a;
                   while( a != 0 )
                   {
                       remainder = a % 10;
                       reversedInteger = reversedInteger * 10 + remainder;
                       a /= 10;
                   }

                   if (originalInteger == reversedInteger) {

                       Toast.makeText(operation.this, "Palindrome Number:=" + originalInteger, Toast.LENGTH_SHORT).show();
                   }
                   else {
                       Toast.makeText(operation.this, "Not Palindrome Number:=" + originalInteger, Toast.LENGTH_SHORT).show();
               }
            }


                if(item.equals("Prime Number")) {

                    boolean flag = false;
                    for(int i = 2; i <= a/2; ++i)
                    {
                        if(a % i == 0)
                        {
                            flag = true;
                            break;
                        }
                    }

                    if (!flag) {

                        Toast.makeText(operation.this, "Prime Number:=" + a, Toast.LENGTH_SHORT).show();
                    }
                    else {
                        Toast.makeText(operation.this, "Not Prime Number:=" + a, Toast.LENGTH_SHORT).show();
                   }
                }

            }}
        });
    }
}