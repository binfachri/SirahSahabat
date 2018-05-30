package blogspot.xreator.com.sirahsahabat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abubakar(View view) {
        startActivity(new Intent(MainActivity.this, abubakar.class));
    }

    public void utsman(View view) {
        startActivity(new Intent(MainActivity.this, utsman.class));
    }

    public void ali(View view) {
        startActivity(new Intent(MainActivity.this, ali.class));
    }

    public void umar(View view) {
        startActivity(new Intent(MainActivity.this, umar.class));
    }

    public void thalhah(View view) {
        startActivity(new Intent(MainActivity.this, thalhah.class));
    }
}
