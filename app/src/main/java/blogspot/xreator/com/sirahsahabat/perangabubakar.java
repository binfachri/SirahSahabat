package blogspot.xreator.com.sirahsahabat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class perangabubakar extends AppCompatActivity {

    TextView perangabubakar;

    String abubakarberperang = "Setelah pengangkatan Abu Bakar sebagai khalifah, beberapa masalah yang mengancam persatuan umat Islam saat itu muncul. Beberapa suku Arab yang berasal dari Nejed dan Hijaz membangkang kepada Abu Bakar sebagai khalifah baru dan sistem yang ada.\n" +
            "\n" +
            "\n" +
            " \n" +
            "Beberapa di antaranya menolak untuk membayar zakat walaupun tidak menolak agama Islam sepenuhnya. Beberapa dari yang lain kembali memeluk agama dan tradisi lamanya yaitu penyembahan berhala.\n" +
            "\n" +
            "Suku-suku tersebut meyakini bahwa hanya memiliki komitmen dengan Nabi Muhammad saw dan dengan kematiannya komitmen itu sudah tidak berlaku lagi. Berdasarkan hal ini Abu Bakar assidiq menyatakan perang terhadap mereka yang dikenal dengan nama perang Riddah.\n" +
            "\n" +
            "Dalam perang Ridda terbesar umat Islam memerangi “Ibnu Habib al-Hanafi” yang lebih dikenal dengan nama Musailamah al-Kazab yang artinya Musailamah si pembohong, yang mengaku dirinya sebagai Nabi baru menggantikan Nabi Muhammad saw.\n" +
            "\n" +
            "Pasukan Musailamah kemudian dikalahkan pada perang Akraba yang dipimpin oleh Khalid Bin Walid. Sedangkan Musailamah sendiri terbunuh di tangan Al-Wahsy, seorang budak yang dibebaskan oleh Hindun istri Abu Sufyan karena  sudah berhasil membunuh Hamzah Singa Allah di waktu Perang Uhud.\n" +
            "\n" +
            "Al Wahsyi kemudian memeluk Islam dan bertaubat serta mengakui bahwa dia melakukan kesalahan atas pembunuhan Hamzah. Al Wahsyi pernah berkata, “Dahulu aku membunuh seorang yang sangat dicintai Rasulullah Saw (Hamzah) dan kini aku telah membunuh orang yang sangat dibenci oleh Rasulullah saw (yaitu nabi palsu Musailamah al-Kazab).”";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perangabubakar);

        perangabubakar = findViewById(R.id.perangabubakar);
        perangabubakar.setText(abubakarberperang);

    }
}
