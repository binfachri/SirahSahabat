package blogspot.xreator.com.sirahsahabat;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {

    ProgressBar progress;
    int intValue = 0;
    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        progress = findViewById(R.id.progress);

        // adding color on progress bar
        progress.getProgressDrawable().setColorFilter(Color.WHITE, PorterDuff.Mode.SRC_IN);

        new Thread(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                while(intValue < 100)
                {
                    intValue++;

                    handler.post(new Runnable() {

                        @Override
                        public void run() {


                            progress.setProgress(intValue);



                        }
                    });try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                }

                Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(myIntent);

            }
        }).start();
    }

}