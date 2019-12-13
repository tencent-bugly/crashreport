package cn.anhui.mobile.carpooling;

import android.app.Activity;
import android.os.Bundle;
import android.supports.v17.AppCompat;
import android.supports.v17.SvConfig;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SvConfig.d = true ;
        AppCompat.build(this);
    }
}
