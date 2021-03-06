package ph.edu.mobapde.meditake.thebeeproject.util;

import android.app.Activity;
import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.view.MenuItem;
import android.widget.Toast;

import ph.edu.mobapde.meditake.thebeeproject.BeepCityActivity;
import ph.edu.mobapde.meditake.thebeeproject.CardsActivity;
import ph.edu.mobapde.meditake.thebeeproject.FeedbackActivity;
import ph.edu.mobapde.meditake.thebeeproject.HomeActivity;
import ph.edu.mobapde.meditake.thebeeproject.LoginActivity;
import ph.edu.mobapde.meditake.thebeeproject.R;
import ph.edu.mobapde.meditake.thebeeproject.TransitActivity;

/**
 * Created by Winfred Villaluna on 10/20/2017.
 */

public class DrawerUtil {
    public static void execute(Activity activity, MenuItem item){
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        Intent i;

        switch (id){
            case R.id.nav_home:
                i = new Intent();
                i.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                i.setClass(activity.getBaseContext(), HomeActivity.class);
                activity.startActivity(i);
                break;
            case R.id.nav_cards:
                i = new Intent();
                i.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                i.setClass(activity.getBaseContext(), CardsActivity.class);
                activity.startActivity(i);
                break;
            case R.id.nav_presents:
//                i = new Intent();
//                i.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
//                i.setClass(activity.getBaseContext(), HomeActivity.class);
//                activity.startActivity(i);
                break;
            case R.id.nav_train:
                i = new Intent();
                i.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                i.setClass(activity.getBaseContext(), TransitActivity.class);
                activity.startActivity(i);
                break;
            case R.id.nav_game:
                i = new Intent();
                i.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                i.setClass(activity.getBaseContext(), BeepCityActivity.class);
                activity.startActivity(i);
                break;
            case R.id.nav_feedback:
                i = new Intent();
                i.setClass(activity.getBaseContext(), FeedbackActivity.class);
                activity.startActivity(i);
                break;
            case R.id.nav_logout:
                i = new Intent();
                i.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
                i.setClass(activity.getBaseContext(), LoginActivity.class);
                activity.startActivity(i);
                break;
            default: Toast.makeText(activity.getBaseContext(), "Unexpected error encountered. Please try again", Toast.LENGTH_SHORT);
        }
    }
}
