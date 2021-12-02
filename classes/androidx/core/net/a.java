// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.net;

import androidx.annotation.t0;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import android.os.Build$VERSION;
import androidx.annotation.s0;
import androidx.annotation.k0;
import android.annotation.SuppressLint;
import android.net.NetworkInfo;
import android.content.Intent;
import androidx.annotation.j0;
import android.net.ConnectivityManager;

public final class a
{
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
    
    private a() {
    }
    
    @SuppressLint({ "ReferencesDeprecated" })
    @k0
    @s0("android.permission.ACCESS_NETWORK_STATE")
    public static NetworkInfo a(@j0 final ConnectivityManager connectivityManager, @j0 final Intent intent) {
        final NetworkInfo networkInfo = (NetworkInfo)intent.getParcelableExtra("networkInfo");
        if (networkInfo != null) {
            return connectivityManager.getNetworkInfo(networkInfo.getType());
        }
        return null;
    }
    
    public static int b(@j0 final ConnectivityManager connectivityManager) {
        if (Build$VERSION.SDK_INT >= 24) {
            return connectivityManager.getRestrictBackgroundStatus();
        }
        return 3;
    }
    
    @s0("android.permission.ACCESS_NETWORK_STATE")
    public static boolean c(@j0 final ConnectivityManager connectivityManager) {
        if (Build$VERSION.SDK_INT >= 16) {
            return connectivityManager.isActiveNetworkMetered();
        }
        final NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return true;
        }
        final int type = activeNetworkInfo.getType();
        return type != 1 && type != 7 && type != 9;
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ t0.a.I })
    public @interface a {
    }
}
