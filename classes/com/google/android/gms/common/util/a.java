// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.util;

import java.security.NoSuchAlgorithmException;
import androidx.annotation.RecentlyNullable;
import android.content.pm.PackageManager$NameNotFoundException;
import java.security.MessageDigest;
import android.content.pm.Signature;
import android.content.pm.PackageInfo;
import com.google.android.gms.common.wrappers.c;
import android.annotation.TargetApi;
import com.google.android.gms.internal.common.l;
import androidx.annotation.RecentlyNonNull;
import android.content.Context;

@f2.a
public class a
{
    private static volatile int a = -1;
    
    @Deprecated
    @TargetApi(24)
    @RecentlyNonNull
    @f2.a
    public static Context a(@RecentlyNonNull final Context context) {
        Context a = context;
        if (l.b()) {
            a = l.a(context);
        }
        return a;
    }
    
    @Deprecated
    @RecentlyNullable
    @f2.a
    public static byte[] b(@RecentlyNonNull final Context context, @RecentlyNonNull final String s) throws PackageManager$NameNotFoundException {
        final PackageInfo e = c.a(context).e(s, 64);
        final Signature[] signatures = e.signatures;
        if (signatures != null && signatures.length == 1) {
            final MessageDigest c = c("SHA1");
            if (c != null) {
                return c.digest(e.signatures[0].toByteArray());
            }
        }
        return null;
    }
    
    @RecentlyNullable
    public static MessageDigest c(@RecentlyNonNull final String algorithm) {
        int n = 0;
    Label_0018_Outer:
        while (true) {
            Label_0024: {
                if (n >= 2) {
                    break Label_0024;
                }
                while (true) {
                    try {
                        final MessageDigest instance = MessageDigest.getInstance(algorithm);
                        if (instance != null) {
                            return instance;
                        }
                        ++n;
                        continue Label_0018_Outer;
                        return null;
                    }
                    catch (NoSuchAlgorithmException ex) {
                        continue;
                    }
                    break;
                }
            }
        }
    }
}
