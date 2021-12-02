// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.telephony;

import androidx.annotation.r;
import androidx.annotation.p0;
import androidx.annotation.s0;
import androidx.annotation.k0;
import android.annotation.SuppressLint;
import java.lang.reflect.InvocationTargetException;
import android.os.Build$VERSION;
import androidx.annotation.j0;
import android.telephony.TelephonyManager;
import java.lang.reflect.Method;

public class b
{
    private static Method a;
    private static Method b;
    
    private b() {
    }
    
    @SuppressLint({ "MissingPermission" })
    @k0
    @s0("android.permission.READ_PHONE_STATE")
    public static String a(@j0 final TelephonyManager obj) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 26) {
            return androidx.core.telephony.b.b.a(obj);
        }
        if (sdk_INT >= 22) {
            final int b = b(obj);
            if (b != Integer.MAX_VALUE && b != -1) {
                final int a = androidx.core.telephony.a.a(b);
                if (sdk_INT >= 23) {
                    return androidx.core.telephony.b.a.a(obj, a);
                }
                try {
                    if (androidx.core.telephony.b.a == null) {
                        (androidx.core.telephony.b.a = TelephonyManager.class.getDeclaredMethod("getDeviceId", Integer.TYPE)).setAccessible(true);
                    }
                    return (String)androidx.core.telephony.b.a.invoke(obj, a);
                }
                catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException ex) {
                    return null;
                }
            }
        }
        return obj.getDeviceId();
    }
    
    @SuppressLint({ "SoonBlockedPrivateApi" })
    public static int b(@j0 final TelephonyManager obj) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 30) {
            return c.a(obj);
        }
        if (sdk_INT < 22) {
            return Integer.MAX_VALUE;
        }
        try {
            if (androidx.core.telephony.b.b == null) {
                (androidx.core.telephony.b.b = TelephonyManager.class.getDeclaredMethod("getSubId", (Class<?>[])new Class[0])).setAccessible(true);
            }
            final Integer n = (Integer)androidx.core.telephony.b.b.invoke(obj, new Object[0]);
            if (n != null && n != -1) {
                return n;
            }
            return Integer.MAX_VALUE;
        }
        catch (InvocationTargetException | IllegalAccessException | NoSuchMethodException ex) {
            return Integer.MAX_VALUE;
        }
    }
    
    @p0(23)
    private static class a
    {
        @SuppressLint({ "MissingPermission" })
        @k0
        @r
        @s0("android.permission.READ_PHONE_STATE")
        static String a(final TelephonyManager telephonyManager, final int n) {
            return telephonyManager.getDeviceId(n);
        }
    }
    
    @p0(26)
    private static class b
    {
        @SuppressLint({ "MissingPermission" })
        @k0
        @r
        @s0("android.permission.READ_PHONE_STATE")
        static String a(final TelephonyManager telephonyManager) {
            return telephonyManager.getImei();
        }
    }
    
    @p0(30)
    private static class c
    {
        @r
        static int a(final TelephonyManager telephonyManager) {
            return telephonyManager.getSubscriptionId();
        }
    }
}
