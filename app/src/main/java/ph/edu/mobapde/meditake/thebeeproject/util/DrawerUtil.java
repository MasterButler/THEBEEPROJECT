package ph.edu.mobapde.meditake.thebeeproject.util;

import android.app.Activity;
import android.support.design.widget.Snackbar;
import android.view.MenuItem;
import android.widget.Toast;

import ph.edu.mobapde.meditake.thebeeproject.R;

/**
 * Created by Winfred Villaluna on 10/20/2017.
 */

public class DrawerUtil {
    public static void execute(Activity activity, MenuItem item){
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        switch (id){
            case R.id.nav_camera:
                break;
            case R.id.nav_cards:
                break;
            case R.id.nav_presents:
                break;
            case R.id.nav_train:
                break;
            case R.id.nav_feedback:
                break;
            case R.id.nav_logout:
                break;
            default: Toast.makeText(activity.getBaseContext(), "Unexpected error encountered. Please try again", Toast.LENGTH_SHORT);
        }
    }
}
