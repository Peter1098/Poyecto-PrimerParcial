package mx.edu.tesoem.isc.proyec1pma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class frm3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm3);
    }
    public void siguiente(View v) {
        Intent frm4= new Intent(this, frm4.class);
        startActivity(frm4);
        finish();
    }
    public void primera(View v) {
        Intent frm5= new Intent(this, frm5.class);
        startActivity(frm5);
        finish();
    }
    public void segundo(View v) {
        Intent frm7= new Intent(this, frm7.class);
        startActivity(frm7);
        finish();
    }
    public void tercera(View v) {
        Intent frm9 = new Intent(this, frm9.class);
        startActivity(frm9);
        finish();
    }
    public void salir(View v){
        finish();
    }



}
