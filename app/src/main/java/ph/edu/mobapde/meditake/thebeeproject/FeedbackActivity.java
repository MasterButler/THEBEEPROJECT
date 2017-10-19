package ph.edu.mobapde.meditake.thebeeproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class FeedbackActivity extends AppCompatActivity {
    @BindView(R.id.subTitle)
    EditText subTitle;

    @BindView(R.id.content)
    EditText content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.submit)
    public void submitFeed(View view) {
        subTitle.setText("");
        content.setText("");

        Toast.makeText(this.getBaseContext(), "Successfully submitted feedback", Toast.LENGTH_SHORT);



    }
}
