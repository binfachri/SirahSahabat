package blogspot.xreator.com.sirahsahabat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class melamarali extends AppCompatActivity {

    TextView melamarali;

    String alimelamar = "Hingga ketika Ali dewasa dan sudah siap untuk menikah, maka Ali pun berniat menghadap Rasul Saw dengan tujuan ingin melamar putri Rasul Saw yang tak lain adalah Fatimah, seorang perempuan yang sejak lama Ali kagumi. Tapi sayang, niat Ali sudah didahului oleh Abu Bakar yang telah duluan melamar Fatimah.\n" +
            "\n" +
            "Ali pun harus ikhlas bahwa cinta yang ia pendam selama ini berakhir pupus. Apalagi Abu Bakar adalah sahabat setia Rasul Saw yang sangat shalih dan begitu cinta kepada Rasul Saw, dan rasul Saw pun menyayanginya. Sedangkan Ali merasa dirinya hanyalah seorang  pemuda miskin. Sungguh jauh bila dibandingkan dengan orang mulia seperti Abu Bakar, pikirnya.\n" +
            "\n" +
            " \n" +
            "Rencana Allah Swt sungguh sulit ditebak oleh manusia, ternyata Rasul Saw hanya diam ketika Abu Bakar melamar putri beliau. Maksudnya, Rasul Saw menolak secara halus terhadap lamaran Abu Bakar. Ali pun senang. Karena merasa masih punya harapan untuk melamar Fatimah. Maka Ali pun bergegas ingin melamar Fatimah sebelum didahului sahabat lainnya lagi.\n" +
            "\n" +
            "Namun sungguh disayangkan, lagi-lagi Ali didahului oleh Umar. Lagi-lagi, hati Ali terluka. Ali sangat bersedih. Sama kejadiannya seperti dengan Abu Bakar, Ali merasa tak ada harapan lagi. Lagipula, apakah cukup hanya dengan cinta ia akan melamar Fatimah? Karena hakikatnya ia hanyalah seorang pemuda biasa yang mengharapkan seorang putri Rasul Saw yang luar biasa.\n" +
            "\n" +
            "Berbeda bila disandingkan dengan Umar seorang keturunan bangsawan yang gagah dan berkharisma. Dan, Ali yakin Fatimah pasti akan bahagia hidup bersama Umar.\n" +
            "\n" +
            "Maka Ali pun hanya bisa bertawakal kepada Allah, semoga dikuatkan dengan cobaan cinta yang sedang dialaminya. Kali ini, Ali harus benar-benar tegar dan ikhlas menghadapi kenyataan itu. Namun Ali seorang pemuda yang shalih. Ia pun yakin bahwa Allah Maha Adil. Pasti Allah sudah menyiapkan pendamping hidup baginya. “Aku mengutamakan kebahagiaan Fatimah diatas cintaku,” bisik Ali dalam hatinya.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_melamarali);

        melamarali = findViewById(R.id.melamarali);
        melamarali.setText(alimelamar);

    }
}
