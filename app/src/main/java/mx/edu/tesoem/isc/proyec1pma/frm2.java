package mx.edu.tesoem.isc.proyec1pma;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class frm2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm2);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent frm3 = new Intent(frm2.this,frm3.class);
                startActivity(frm3);
                finish();
            }
        },10000);
    }
    }

