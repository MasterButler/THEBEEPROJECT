package ph.edu.mobapde.meditake.thebeeproject;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import butterknife.BindView;

public class WelcomeActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 1000;

    @BindView(R.id.activity_welcome_screen)
    ImageView ivBg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent = new Intent(WelcomeActivity.this, LoginActivity.class);
                startActivity(homeIntent);
                finish();
            }
        }, WelcomeActivity.SPLASH_TIME_OUT);
    }
}
