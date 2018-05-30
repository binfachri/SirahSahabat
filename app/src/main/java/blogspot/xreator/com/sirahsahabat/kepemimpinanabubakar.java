package blogspot.xreator.com.sirahsahabat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class kepemimpinanabubakar extends AppCompatActivity {

    TextView kepemimpinanabubakar;

    String abubakarpemimpin = "Kepemimpinan Abu Bakar ash Sidiq Khulafaur Rasyidin adalah pemimpin umat Islam setelah Nabi Muhammad saw wafat, yaitu pada masa pemerintahan Abu Bakar, Umar bin Khattab, Utsman bin Affan dan Ali bin Abi Thalib, dimana sistem pemerintahan yang diterapkan adalah pemerintahan yang demokratis. Nabi Muhammad saw tidak meninggalkan wasiat mengenai siapa yang akan menggantikan beliau sebagai pemimpin politik umat Islam setelah beliau wafat.\n" +
            "\n" +
            "Beliau nampaknya menyerahkan persoalan itu kepada kaum muslimin sendiri untuk menentukannya. Karena itulah tidak lama setelah beliau wafat, belum lagi jenazahnya dimakamkan, sejumlah tokoh Muhajirin dan Anshar berkumpul di balaikota  Bani Sa’idah tepatnya di Madinah, mereka bermusyawarah menentukan siapa yang akan dipilih menjadi pemimpin. Musyawarah itu berjalan cukup alot sebab masing-masing pihak baik Muhajirin atau Anshar sama-sama merasa berhak menjadi pemimpin umat Islam.\n" +
            "\n" +
            "Namun dengan semangat ukhuwah Islamiyah tinggi, akhirnya Abu Bakar yang terpilih. Semangat keagamaan Abu Bakar memperoleh penghargaan tinggi dari umat Islam, sehingga masing-masing pihak menerima dan membaiatnya. Sebagai pemimpin umat Islam setelah Rasul, maka Abu Bakar disebut Khalifah Rasulullah (Pengganti Rasul). Khalifah adalah pemimpin yang diangkat sesudah Nabi wafat untuk menggantikan beliau melanjutkan tugas-tugas sebagai pemimpin agama dan kepala pemerintahan. Setelah selesai orang membaiat,\n" +
            "\n" +
            "Abu Bakar pun berpidato sebagai sambutan atas kepercayaan orang banyak kepada dirinya, penting dan ringkas : “Wahai manusia, sekarang aku telah menjabat pekerjaan kami ini, tetapi bukanlah aku orang yang lebih baik dari pada kamu. Jika aku lelah berlaku baik dalam jabatanku, sokonglah aku, tetapi kalau aku berlaku salah, tegakkanlah aku kembali, kejujuran adalah suatu amanat, kedustaan adalah suatu khianat.\n" +
            "\n" +
            "Orang yang kuat di antara kamu, pada sisiku hanyalah lemah, sehingga hak si lemah aku tarik dari padanya. Orang yang lemah di sisimu, pada sisiku kuat, sebab akan ku ambilkan dari pada si kuat akan haknya, Insyaallah. Janganlah kalian suka menghentikan jihad itu, yang tak akan ditimpa kehinaan. Taatlah kepadaku selama aku taat kepada Allah dan Rasul-Nya. Tetapi kalau aku melanggar perintah-Nya, tidak usahlah kalian taat dan ikut aku lagi. Berdirilah sembahyang, semoga rahmat Allah meliputi kamu.\n" +
            "\n" +
            "Pemerintahan Abu Bakar adalah pemerintahan pertama yang mengobarkan peperangan dan memepersenjatai bala tentara untuk membela hak-hak kaum kafir yang lemah. Dalam hal ini Abu Bakar sangat di kenal dengan sebuah ungkapannya sekaligus yang menjadi komitmennya : “Demi Allah jika mereka tidak mau membayar zakat dari harta yang mampu mereka bayar , padahal (dahulu) mereka membayarkannya kepada Rasulullah SAW.\n" +
            "\n" +
            " \n" +
            "Maka niscaya aku akan memerangi mereka.” Abu Bakar yang memulai penakhlukan dan perluasan Islam pada masanya, Islam mampu menakhlukan Persia dan Romawi, bahkan beliau meninggal pada saat perang yarmuk melawan imperium Romawi. Dalam setiap peperangan yang diperintahkan beliau adalah selalu menanamkan nilai-nilai etika yang berdasar al Qur’an dan as sunnah. Beliau mewasiatkan pada kaum Muslimin : “Janganlah sekali-kali membunuh pendeta biarlah mereka melaksanakan peribadatan sesuai keyakinan mereka. Abu Bakar menjadi khalifah hanya selama dua tahun, pada tahun 634 M beliau meninggal dunia.\n" +
            "\n" +
            "Masa sesingkat itu habis untuk menyelesaikan persoalan dalam negeri terutama tantangan yang ditimbulkan oleh suku-suku bangsa Arab yang tidak mau tunduk lagi kepada pemerintah Madinah, mereka menganggap bahwa perjanjian yang dibuat dengan Nabi Muhammad saw dengan sendirinya batal setelah Nabi wafat. Karena itu mereka menentang Abu Bakar. Karena sikap keras kepala dan penentangan mereka yang dapat membahayakan agama dan pemerintahan, maka Abu Bakar menyelesaikan persoalan ini dengan apa yang disebut Perang Riddah (perang melawan kemurtadan). Khalid bin Walid adalah jenderal yang banyak berjasa dalam Perang Riddah ini.\n" +
            "\n" +
            "Kekuasaan yang dijalankan pada masa Khalifah Abu Bakar, sebagaimana pada masa Rasulullah saw, bersifat sentral : kekuasaan legislatif, eksekutif dan yudikatif terpusat di tangan khalifah. Selain menjalankan roda pemerintahan, khalifah juga melaksanakan hukum. Meskipun demikian, seperti juga Nabi Muhammad saw, Abu Bakar selalu mengajak sahabat-sahabat besarnya bermusyawarah. Setelah menyelesaikan urusan perang dalam negeri, barulah Abu Bakar mengirim kekuatan ke luar Arabia. Khalid ibn Walid dikirim ke Iraq dan dapat menguasai al Hirah pada tahun 634 M. Ke Syria dikirim ekspedisi di bawah pimpinan empat jenderal yaitu Abu Ubaidah, Amr ibnu ‘Ash, Yazid ibnu Abi Sufyan dan Syurahbil. Sebelumnya pasukan dipimpin oleh Usamah yang masih berusia 18 tahun. Untuk memperkuat tentara ini, Khalid ibnu Walid diperintahkan meninggalkan Irak, dan melalui gurun pasir yang jarang dijalani, dia sampai ke Syria.";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kepemimpinanabubakar);

        kepemimpinanabubakar = findViewById(R.id.kepemimpinanabubakar);
        kepemimpinanabubakar.setText(abubakarpemimpin);

    }
}
