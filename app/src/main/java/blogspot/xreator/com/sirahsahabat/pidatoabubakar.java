package blogspot.xreator.com.sirahsahabat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class pidatoabubakar extends AppCompatActivity {

    TextView pidatoabubakar;

    String abubakarpidato = "Setelah pembaiatan Abu Bakar r.a. diangkat sebagai Khalifah, beliau r.a. berpidato: “Hai saudara-saudara! Kalian telah membaiat saya sebagai khalifah (kepala negara). Sesungguhnya saya tidaklah lebih baik dari pada kalian. Oleh karenanya, apabila saya berbuat baik, maka tolong dan bantulah saya dalam kebaikan itu; tetapi apabila saya berbuat kesalahan, maka nasihatilah saya.\n" +
            "\n" +
            "Taatlah kalian kepada saya selama saya taat kepada Allah Swt dan Rasul-Nya, dan janganlah kalian mentaati saya, apabila saya berbuat maksiat pada Allah Swt dan Rasul-Nya.” (lihat Abdul Aziz Al Badri, Al Islam bainal Ulama wal Hukkam).\n" +
            "\n" +
            "Pidato Abu Bakar r.a. di atas menunjukkan bahwa sebagai khalifah beliau tidak pernah menganggap dirinya sebagai orang suci yang harus diagung-agungkan. Justru Beliau mengutamakan supremasi hukum syariah, dan menjadikan ketaatan warga negara dan loyalitas padanya merupakan satu paket dalam ketaatan kepada Allah Swt dan rasul-Nya.\n" +
            "\n" +
            "Beliau menjadikan hukum Allah sebagai standar untuk menentukan salah dan  benar yang harus diikuti tidak hanya oleh rakyat, tapi juga penguasa.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pidatoabubakar);

        pidatoabubakar = findViewById(R.id.pidatoabubakar);
        pidatoabubakar.setText(abubakarpidato);

    }
}
