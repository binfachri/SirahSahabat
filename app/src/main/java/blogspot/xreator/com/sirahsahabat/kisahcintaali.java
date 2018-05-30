package blogspot.xreator.com.sirahsahabat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class kisahcintaali extends AppCompatActivity {

    TextView cintaali;

    String alicinta = "Disaat Ali merasakan derita cintanya,  tak disangka-sangka, datanglah Abu Bakar dengan senyuman indahnya. Dan memberitahukan  Ali untuk lekas bertemu dengan Rasul Saw karena ada yang ingin beliau sampaikan. Pikir Ali, pasti ini tentang pernikahan Fatimah dengan Umar.\n" +
            "\n" +
            "Sepertinya Rasul Saw meminta Ali untuk membantu dalam persiapan pernikahan mereka. Maka Ali pun menyemangati dirinya sendiri agar selalu kuat dan tegar. Walaupun sebenarnya, hatinya sangat perih. Apalagi harus membantu mempersiapkan juga menyaksikan orang yang dicintanya menikah dengan orang lain.\n" +
            "\n" +
            "Memang rencana Allah sungguh indah. Setelah Ali bertemu Rasul Saw, tak disangka, lamaran Umar pun bernasib sama dengan Abu Bakar. Bahkan Rasul Saw menginginkan Ali untuk menjadi pendamping hidup Fatimah. Karena Rasul Saw sudah tahu bahwa Ali telah lama memendam rasa cinta kepada putrinya.\n" +
            "\n" +
            "Ali pun merasa sangat bahagia dan bersyukur. Ia pun langsung melamar Fatimah melalui Rasul Saw. Tapi, Ali malu kepada Rasul Saw karena ia tidak memiliki apapun untuk dijadikan mahar. Apalagi ia selama ini dihidupi oleh Rasul Saw sejak kecil.\n" +
            "\n" +
            "Namun, sungguh mulia akhlak Rasul Saw, beliau tidak ingin membebankan Ali. Rasul berkata “nikahilah Fatimah walaupun hanya bermahar cincin besi”. Akhirnya, Ali menyerahkan baju perang yang ia miliki untuk melamar Fatimah. Rasul Saw pun menerima lamaran itu. Fatimah pun mematuhi perintah ayahnya serta siap menikah dengan Ali. Akhirnya Ali pun menikah dengan Fatimah, perempuan yang sudah lama ia cintai.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kisahcintaali);

        cintaali = findViewById(R.id.cintaali);
        cintaali.setText(alicinta);

    }
}
