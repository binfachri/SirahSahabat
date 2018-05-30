package blogspot.xreator.com.sirahsahabat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ceritasingkatabubakar extends AppCompatActivity {

    TextView ceritasingkatabubakar;

    String ceritasingkat = "Abu Bakar assidiq lahir pada tahun 572 M dan wafat pada tanggal 21 Jumadil Akhir 13 H atau 23 Agustus 634 M, dengan nama lahir Abdullah bin Abi Quhafah. Abu Bakar Assidiq juga termasuk dari sahabat yang paling awal masuk Islam atau termasuk dengan golongan Assabikun Al-awwalin.\n" +
            "\n" +
            "Abu Bakar menjadi Khalifah Islam setelah meninggalnya Rasulullah Saw dan ia juga termasuk Khalifah pertama yang memimpin umat Islam selama 2 tahun pada tahun 632 M sampai tahun 634 dan ia juga salah satu dari empat Khalifah yang mendapat gelar Khalifatu Ar-rasyidin (pemimpin yang diberi petunjuk).\n" +
            "\n" +
            "Nama lengkap Abu Bakar Assidiq adalah Abdullah bin Utsman bin Amir bin Amru bin Ka’ab bin Sa’ad bin Tayyim bin Murrah bin Ka’ab bin Lu’ay bin Ghalib bin Quraisy. Nasabnya menyambung dengan Rasulullah Saw pada kakeknya Murrah bin Ka’ab bin Sa’ad bin Taim yang berarti ayah ibunya sama dari kabilah Bani Taim.\n" +
            "\n" +
            "Abu Bakar Assidiq adalah ayah Aisyah ra (istri Rasulullah Saw). Nama yang sebenarnya adalah Abdul Ka’bah yang artinya hamba Ka’bah dan setelah Abu Bakar masuk Islam, namanya diganti oleh Rasulullah Saw dengan nama Abdullah yang artinya hamba Allah Swt." +
            "\n" +
            "Rasulullah Saw memberikan gelar Assidiq (yang berkata benar) setelah Abu Bakar membenarkan dengan adanya pristiwa Isra Mi’raj Rasulullah Saw, sehingga ia lebih dikenal dengan nama Abi Bakar Assidiq" +
            "\n" +
            "Abu Bakar ash-Shiddiq dilahirkan di Mekah dari keturunan Bani Tamim , dengan suku bangsa Quraisy. Beberapa sejarawan Islam mencatat Abu Bakar adalah seorang pedagang, seorang yang terpelajar, hakim dengan kedudukan tinggi, serta dipercaya sebagai orang yang bisa menafsirkan mimpi.\n" +
            "\n" +
            "Ketika Nabi Muhammad SAW menikah dengan Ummul Mukminin Khadijah binti Khuwailid, Rasulullah saw pindah dan hidup bersama Abu Bakar assidiq. Sejak saat itulah Nabi Muhammad saw menjadi tetangga Abu Bakar dan berkenalan satu sama lainnya. Mereka berdua berusia dan berprofesi sama, pedagang dan juga ahli berdagang.\n" +
            "\n";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ceritasingkatabubakar);

        ceritasingkatabubakar = findViewById(R.id.ceritasingkatabubakar);
        ceritasingkatabubakar.setText(ceritasingkat);

    }
}
