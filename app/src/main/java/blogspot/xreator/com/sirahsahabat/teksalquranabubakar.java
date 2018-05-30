package blogspot.xreator.com.sirahsahabat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class teksalquranabubakar extends AppCompatActivity {

    TextView teksalquranabubakar;

    String abubakarteksalquran = "Abu Bakar juga berperan dalam mempertahankan teks-teks tertulis Al Qur’an. Dikatakan bahwa setelah mendapat kemenangan yang sangat sulit saat melawan Musailamah al-kadzab dalam perang Riddah, banyak para penghafal Al Qur’an yang ikut perang,  mati syahid dalam pertempuran.\n" +
            "\n" +
            "Umar bin Khottob lantas meminta Abu Bakar untuk mengumpulkan koleksi dari Al Qur’an. Oleh sebuah tim yang diketuai oleh seorang sahabat Zaid bin Tsabit, mulailah dikumpulkan lembaran-lembaran al-Qur’an dari para penghafal al-Qur’an dan tulisan-tulisan al-Qur’an yang terdapat pada media tulis seperti kulit, tulang, dan lain sebagainya, setelah lengkap penulisan ini kemudian disimpan oleh Abu Bakar.\n" +
            " \n" +
            "Setelah Abu Bakar wafat maka disimpan oleh Umar bin Khaththab dan kemudian disimpan oleh Hafsah, anak perempuan dari Umar bin Khottob dan juga istri dari Nabi Muhammad saw. Kemudian pada masa pemerintahan Usman bin Affan kumpulan al-Qur’ani ini menjadi dasar penulisan teks al-Qur’an yang dikenal saat ini.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teksalquranabubakar);

        teksalquranabubakar = findViewById(R.id.teksalquranabubakar);
        teksalquranabubakar.setText(abubakarteksalquran);

    }
}
