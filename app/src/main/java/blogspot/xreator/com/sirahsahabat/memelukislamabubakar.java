package blogspot.xreator.com.sirahsahabat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class memelukislamabubakar extends AppCompatActivity {


    TextView memelukislamabubakar;

    String memelukislam = "Dari kitab Hayatussahabah (kehidupan para sahabat), dalam bab Dakwah Nabi Muhammad saw kepada perorangan, dituliskan bahwa Abu bakar assidiq masuk Islam setelah diajak oleh Rasulullah saw. Abu Bakar kemudian mendakwahkan ajaran Islam kepada Utsman bin Affan, Zubair bin Awwam, Thalhah bin Ubaidillah, Sa’ad bin Abi Waqqas dan beberapa tokoh penting dalam Islam lainnya." +
            "\n" +
            "Istri Abu Bakar yaitu  Qutaylah binti Abdul Uzza tidak menerima ajaran Islam sebagai agama, sehingga Abu Bakar menceraikannya. Istrinya yang lain, Ummu Ruman,memeluk Islam. Juga semua anaknya kecuali dengan ‘Abd Rahman bin Abu Bakar, sehingga Abu Bakar dan ‘Abd Rahman berpisah.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memelukislamabubakar);

        memelukislamabubakar = findViewById(R.id.memelukislamabubakar);
        memelukislamabubakar.setText(memelukislam);

    }
}
