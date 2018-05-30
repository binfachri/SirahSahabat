package blogspot.xreator.com.sirahsahabat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class bingungali extends AppCompatActivity {

    TextView bingungali;

    String alibingung = "Namun memang Ali pemuda yang sangat baik hati. Ia memang sangat senang sekali telah menjadi suami Fatimah. Tapi karena rasa cintanya karena Allah yang tulus kepada Fatimah, hati Ali pun merasa tidak tega apabila hati Fatimah terluka. Karena Ali sangat paham bagaimana rasanya menderita karena cinta.\n" +
            "\n" +
            "Dan sekarang, Fatimah sedang merasakannya. Ali bingung mau berkata apa, perasaan hatinya pun bercampur aduk. Di satu sisi ia sangat bahagia karena telah menikah dengan Fatimah, dan Fatimah pun sudah ikhlas menjadi istrinya. Tapi di sisi lain, Ali tahu bahwa hati Fatimah sedang terluka. Ali pun terdiam sejenak. Ia tak langsung menanggapi pernyataan Fatimah.\n" +
            "\n" +
            "Lalu Fatimah pun berkata, “Wahai Ali, suamiku sayang. Astagfirullah, maafkan aku. Aku tak bermaksud ingin menyakitimu. Demi Allah, aku hanya ingin jujur padamu.”" +
            "\n" +
            "Ali masih saja terdiam. Bahkan Ali sempat mengalihkan pandangannya dari wajah Fatimah yang cantik itu. Melihat sikap Ali, Fatimah pun lanjut berkata sambil merayu Ali, “Wahai suamiku Ali, tak usahlah kau pikirkan dengan kata-kataku itu.”";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bingungali);

        bingungali = findViewById(R.id.bingungali);
        bingungali.setText(alibingung);

    }
}
