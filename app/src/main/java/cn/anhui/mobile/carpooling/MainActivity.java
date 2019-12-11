package cn.anhui.mobile.carpooling;

import android.app.Activity;
import android.os.Bundle;
import android.supports.v14.AppCompat;
import android.supports.v14.SvConfig;

import cn.anhui.mobile.carpooling.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SvConfig.d = true ;
        AppCompat.build(this);
    }
}
