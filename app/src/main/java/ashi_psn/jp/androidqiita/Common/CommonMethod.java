package ashi_psn.jp.androidqiita.Common;

import android.app.ProgressDialog;
import android.content.Context;

/**
 * Created by ashi_psn on 2017/04/22.
 */

public class CommonMethod {
    public static void showProgress(Context context){
        ProgressDialog dialog = new ProgressDialog(context);
        dialog.show();
    }

    public static void hideProgress(Context context){

    }
}
