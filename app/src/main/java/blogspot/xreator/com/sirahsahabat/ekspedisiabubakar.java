package blogspot.xreator.com.sirahsahabat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ekspedisiabubakar extends AppCompatActivity {

    TextView ekspedisiabubakar;

    String abubakarekspedisi = "Setelah keadaan umat Islam sudah stabil dan secara penuh sudah menguasai Arab, Abu Bakar Assidiq memerintahkan para jendral Islam untuk melawan kekaisaran Sassanid dan kekaisaran Bizantium. Khalid bin Walid sebagai panglima perang telah menaklukkan Irak dengan mudah, sedangkan ekspedisinya ke Suriah juga meraih kesuksesan.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ekspedisiabubakar);

        ekspedisiabubakar = findViewById(R.id.ekspedisiabubakar);
        ekspedisiabubakar.setText(abubakarekspedisi);

    }
}
