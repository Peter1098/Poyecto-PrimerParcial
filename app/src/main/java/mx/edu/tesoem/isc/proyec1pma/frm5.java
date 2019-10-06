package mx.edu.tesoem.isc.proyec1pma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class frm5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm5);
    }
    public void regresar(View v) {
        Intent frm3= new Intent(this, frm3.class);
        startActivity(frm3);
        finish();
    }
    public void siguiente(View v) {
        Intent frm6= new Intent(this, frm6.class);
        startActivity(frm6);
        finish();
    }
}
