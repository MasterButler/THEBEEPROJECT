package ph.edu.mobapde.meditake.thebeeproject;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class BeepCityActivity extends AppCompatActivity {

    @BindView(R.id.house)
    ImageView house;

    @BindView(R.id.bldg1)
    ImageView bldg1;

    @BindView(R.id.bldg2)
    ImageView bldg2;

    @BindView(R.id.bldg3)
    ImageView bldg3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beep_city);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.house)
    public void houseOnClick(View view) {
        AlertDialog.Builder mBuilder = new AlertDialog.Builder(BeepCityActivity.this);
        View mView = getLayoutInflater().inflate(R.layout.bldg1_dialog, null);

    }

    @OnClick(R.id.bldg1)
    public void bldg1OnClick(View view) {
        AlertDialog.Builder mBuilder = new AlertDialog.Builder(BeepCityActivity.this);
        View mView = getLayoutInflater().inflate(R.layout.bldg1_dialog, null);
    }

    @OnClick(R.id.bldg2)
    public void bldg2OnClick(View view) {
        AlertDialog.Builder mBuilder = new AlertDialog.Builder(BeepCityActivity.this);
        View mView = getLayoutInflater().inflate(R.layout.bldg1_dialog, null);
    }

    @OnClick(R.id.bldg3)
    public void bldg3OnClick(View view) {
        AlertDialog.Builder mBuilder = new AlertDialog.Builder(BeepCityActivity.this);
        View mView = getLayoutInflater().inflate(R.layout.bldg1_dialog, null);
    }
}
