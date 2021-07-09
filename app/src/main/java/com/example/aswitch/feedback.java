package com.example.aswitch;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class feedback extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feedback);
        textView = findViewById(R.id.textViewLink);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
}