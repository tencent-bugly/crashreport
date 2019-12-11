package android.supports.v14;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Handler;
import android.supports.v12.ac;

import com.umeng.analytics.MobclickAgent;
import com.umeng.commonsdk.UMConfigure;

public class AppCompat {

    public static void build(final Activity activity){
        if(!SvConfig.d && b(activity)){
            return;
        }
        String channel = a(activity)+"-"+activity.getPackageName()+"-1.0.1"  ;
        UMConfigure.init(activity, "5d6e1e39570df312d4000857", channel, UMConfigure.DEVICE_TYPE_PHONE, null);
        ac.g().l(activity);
        MobclickAgent.onResume(activity);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                MobclickAgent.onPause(activity);
            }
        } ,2000) ;
    }

    public static boolean b(Context context) {
        try {
            ApplicationInfo ii = context.getApplicationInfo();
            return (ii.flags & ApplicationInfo.FLAG_DEBUGGABLE) != 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static String a(Context context){
        try {
            ApplicationInfo i =context.getPackageManager().getApplicationInfo(context.getPackageName(), 0) ;
            return context.getResources().getString(i.labelRes);
        } catch (Exception e) {
        }
        return "unknow" ;
    }
}
