package com.example.aswitch;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;
public class MainActivity extends AppCompatActivity {
    ViewFlipper v_flipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.sw2);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        int images[]={R.drawable.b1,R.drawable.b2,R.drawable.b3,R.drawable.b4,R.drawable.b5,R.drawable.b6};
        v_flipper= findViewById(R.id.v_flipper);

        for(int image:images){
            flipperImages(image);
        }
        ImageButton mainButton=(ImageButton) findViewById(R.id.currency);
        ImageButton mainButton3=(ImageButton) findViewById(R.id.gst);
        ImageButton mainButton4=(ImageButton) findViewById(R.id.split);
        ImageButton mainButton5=(ImageButton) findViewById(R.id.binary);
        ImageButton mainButton6=(ImageButton) findViewById(R.id.ascii);
        ImageButton mainButton7=(ImageButton) findViewById(R.id.trigonometric);
        ImageButton mainButton8=(ImageButton) findViewById(R.id.circle);
        ImageButton mainButton9=(ImageButton) findViewById(R.id.operation);
        ImageButton mainButton10=(ImageButton) findViewById(R.id.bitcoin);
        ImageButton mainButton11=(ImageButton) findViewById(R.id.bitcoin2);
        ImageButton mainButton12=(ImageButton) findViewById(R.id.mass);
        ImageButton mainButton13=(ImageButton) findViewById(R.id.angle);
        ImageButton mainButton14=(ImageButton) findViewById(R.id.area);
        ImageButton mainButton15=(ImageButton) findViewById(R.id.storage);
        ImageButton mainButton16=(ImageButton) findViewById(R.id.current);
        ImageButton mainButton17=(ImageButton) findViewById(R.id.energy);
        ImageButton mainButton18=(ImageButton) findViewById(R.id.force);
        ImageButton mainButton19=(ImageButton) findViewById(R.id.length);
        ImageButton mainButton20=(ImageButton) findViewById(R.id.power);
        ImageButton mainButton21=(ImageButton) findViewById(R.id.pressure);
        ImageButton mainButton22=(ImageButton) findViewById(R.id.speed);
        ImageButton mainButton23=(ImageButton) findViewById(R.id.temperature);
        ImageButton mainButton24=(ImageButton) findViewById(R.id.time);
        ImageButton mainButton25=(ImageButton) findViewById(R.id.volume);
        ImageButton mainButton26=(ImageButton) findViewById(R.id.about);
        ImageButton mainButton27=(ImageButton) findViewById(R.id.contact);
        ImageButton mainButton28=(ImageButton) findViewById(R.id.feedback);

        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, currency.class);
                startActivity(intent);
            }
        });

        mainButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, gst.class);
                startActivity(intent);
            }
        });

        mainButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, splitBill.class);
                startActivity(intent);
            }
        });

        mainButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, binary.class);
                startActivity(intent);
            }
        });
        mainButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, ascii.class);
                startActivity(intent);
            }
        });
        mainButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, trigonometric.class);
                startActivity(intent);
            }
        });
        mainButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, circle.class);
                startActivity(intent);
            }
        });
        mainButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, operation.class);
                startActivity(intent);
            }
        });
        mainButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, bitcoin.class);
                startActivity(intent);
            }
        });
        mainButton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, bitcoin2.class);
                startActivity(intent);
            }
        });
        mainButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, mass.class);
                startActivity(intent);
            }
        });
        mainButton13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, angle.class);
                startActivity(intent);
            }
        });
        mainButton14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, area.class);
                startActivity(intent);
            }
        });
        mainButton15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, storage.class);
                startActivity(intent);
            }
        });
        mainButton16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, current.class);
                startActivity(intent);
            }
        });

        mainButton17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, energy.class);
                startActivity(intent);
            }
        });

        mainButton18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, force.class);
                startActivity(intent);
            }
        });

        mainButton19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, length.class);
                startActivity(intent);
            }
        });

        mainButton20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, power.class);
                startActivity(intent);
            }
        });

        mainButton21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, pressure.class);
                startActivity(intent);
            }
        });

        mainButton22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, speed.class);
                startActivity(intent);
            }
        });

        mainButton23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, temperature.class);
                startActivity(intent);
            }
        });

        mainButton24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, time.class);
                startActivity(intent);
            }
        });

        mainButton25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, volume.class);
                startActivity(intent);
            }
        });
        mainButton26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, about.class);
                startActivity(intent);
            }
        });

        mainButton27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, contact.class);
                startActivity(intent);
            }
        });

        mainButton28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, feedback.class);
                startActivity(intent);
            }
        });

    }
    public void flipperImages(int image){
        ImageView imageView=new ImageView(this);
        imageView.setBackgroundResource(image);

        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(4000);
        v_flipper.setAutoStart(true);
        v_flipper.setInAnimation(this,android.R.anim.slide_in_left);

    }
}
