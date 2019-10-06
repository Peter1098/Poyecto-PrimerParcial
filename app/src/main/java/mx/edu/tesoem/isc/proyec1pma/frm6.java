package mx.edu.tesoem.isc.proyec1pma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class frm6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm6);
    }
    public void regresar(View v) {
        Intent frm3= new Intent(this, frm3.class);
        startActivity(frm3);
        finish();
    }
    public void segundo(View v) {
        Intent frm7= new Intent(this, frm7.class);
        startActivity(frm7);
        finish();
    }
}
