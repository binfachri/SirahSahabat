package blogspot.xreator.com.sirahsahabat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class abubakar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abubakar);
    }

    public void ceritasingkatabubakar(View view) {
        startActivity(new Intent(abubakar.this, ceritasingkatabubakar.class));
    }

    public void memelukislamabubakar(View view) {
        startActivity(new Intent(abubakar.this, memelukislamabubakar.class));
    }

    public void penyiksaanabubakar(View view) {
        startActivity(new Intent(abubakar.this, penyiksaanabubakar.class));
    }

    public void kepemimpinanabubakar(View view) {
        startActivity(new Intent(abubakar.this, kepemimpinanabubakar.class));
    }

    public void perangabubakar(View view) {
        startActivity(new Intent(abubakar.this, perangabubakar.class));
    }

    public void ekspedisiabubakar(View view) {
        startActivity(new Intent(abubakar.this, ekspedisiabubakar.class));
    }

    public void pidatoabubakar(View view) {
        startActivity(new Intent(abubakar.this, pidatoabubakar.class));
    }

    public void teksalquranabubakar(View view) {
        startActivity(new Intent(abubakar.this, teksalquranabubakar.class));
    }

    public void wafatabubakar(View view) {
        startActivity(new Intent(abubakar.this, wafatabubakar.class));
    }
}
