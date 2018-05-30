package blogspot.xreator.com.sirahsahabat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class setelahmenikahaali extends AppCompatActivity {

    TextView setelahmenikahali;

    String alisetelahmenikah = "Sekarang, Fatimah sah menjadi istri Ali. Beberapa saat setelah menikah dan siap melewati kehidupan bersama, yaitu malam pertamanya hingga menjalani hari-hari selanjutnya bersama, Fatimah berkata kepada Ali, “Wahai suamiku Ali, aku sudah halal bagimu. Aku sangat bersyukur kepada Allah Swt karena ayahku memilihkan aku suami yang shalih, tampan, cerdas dan baik sepertimu.”\n" +
            "\n" +
            "Ali pun menjawab, “Aku pun begitu, wahai Fatimah istriku. Aku sangat bersyukur kepada Allah Swt, akhirnya cintaku padamu yang sedari lama kupendam telah menjadi halal dengan ikatan suci pernikahanku denganmu.”.\n" +
            "\n" +
            "Fatimah berkata lagi dengan lembut, “Wahai suamiku, bolehkah aku berkata dengan jujur padamu? Karena aku ingin terjalin komunikasi yang baik antara kita dan kelanjutan rumah tangga kita.”" +
            "\n" +
            "Kata Ali, “ Tentu saja istriku, silahkan. Aku siap mendengarkanmu.”\n" +
            "\n";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setelahmenikahaali);

        setelahmenikahali = findViewById(R.id.setelahmenikahali);
        setelahmenikahali.setText(alisetelahmenikah);

    }
}
