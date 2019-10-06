package mx.edu.tesoem.isc.proyec1pma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class frm7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm7);
    }
    public void regresar(View v) {
        Intent frm3= new Intent(this, frm3.class);
        startActivity(frm3);
        finish();
    }
    public void siguiente(View v) {
        Intent frm8= new Intent(this, frm8.class);
        startActivity(frm8);
        finish();
    }

}
