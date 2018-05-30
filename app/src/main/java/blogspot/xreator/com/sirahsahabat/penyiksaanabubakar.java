package blogspot.xreator.com.sirahsahabat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class penyiksaanabubakar extends AppCompatActivity {

    TextView ceritapeyiksaanabubakar;

    String penyiksaanabubakar = "Sebagaimana yang juga dialami oleh para sahabat yang mememeluk Islam pada masa awal. Abu Bakar juga mengalami penyiksaan yang dilakukan oleh penduduk Mekkah yang kebanyakan dari mereka masih memeluk agama nenek moyangnya.\n" +
            "\n" +
            "Namun, penyiksaan paling kejam yang dialami oleh mereka yang berasal dari golongan budak. Sementara para pemeluk islam yang bukan dari golongan budak biasanya masih dilindungi oleh para keluarga dan sahabat mereka, sedangkan para budak disiksa sekehendak tuannya.\n" +
            "\n" +
            "Hal ini mendorong Abu Bakar guna membebaskan para budak tersebut dengan membeli budak dari tuannya kemudian memerdekakannya.\n" +
            "\n" +
            "\n" +
            " \n" +
            "Pada saat Nabi Muhammad saw pindah ke Madinah (622 M), ketika peristiwa Hijrah, Abu Bakar adalah satu-satunya orang yang selalu menemaninya. Abu Bakar juga terikat dengan Rasulullah saw secara kekeluargaan. Aisyah, anak perempuan Abu Bakar menikah dengan Nabi Muhammad saw beberapa saat setelah Hijrah.\n" +
            "\n" +
            "Selama masa Rasulullah saw sakit saat menjelang wafat, dikatakan bahwa Abu Bakar ditunjuk untuk menggantikan Rasulullah Saw menjadi imam salat, banyak yang menganggap ini sebagai indikasi bahwa Abu Bakar yang pantas untuk menggantikan posisi Rasulullah sebagai pemimpin Umat Islam.\n" +
            "\n" +
            "Bahkan setelah Rasulullah SAW telah meninggal dunia, Abu Bakar Ash-Shiddiq dianggap sebagai sahabat yang paling tabah menghadapi meninggalnya Rasulullah SAW ini. Segera setelah kematian Rasulullah Saw, dilakukan musyawarah di kalangan para pemuka kaum Muhajirin dan Anshar di Madinah, yang akhirnya menghasilkan ditunjuknya Abu Bakar sebagai pemimpin umat Islam atau khalifah Islam tahun 632 M.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penyiksaanabubakar);

        ceritapeyiksaanabubakar = findViewById(R.id.ceritapenyiksaanabubakar);
        ceritapeyiksaanabubakar.setText(penyiksaanabubakar);

    }
}
