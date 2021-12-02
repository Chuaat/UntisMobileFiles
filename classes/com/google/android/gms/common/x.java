// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common;

import com.google.android.gms.dynamic.d;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.f;
import com.google.android.gms.common.internal.p1;
import androidx.annotation.k0;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import com.google.android.gms.common.internal.r1;

abstract class x extends r1
{
    private int f;
    
    protected x(final byte[] a) {
        com.google.android.gms.common.internal.x.a(a.length == 25);
        this.f = Arrays.hashCode(a);
    }
    
    protected static byte[] z2(final String s) {
        try {
            return s.getBytes("ISO-8859-1");
        }
        catch (UnsupportedEncodingException detailMessage) {
            throw new AssertionError((Object)detailMessage);
        }
    }
    
    @Override
    public final int a() {
        return this.hashCode();
    }
    
    public boolean equals(@k0 final Object o) {
        if (o != null) {
            if (o instanceof p1) {
                try {
                    final p1 p = (p1)o;
                    if (p.a() != this.hashCode()) {
                        return false;
                    }
                    final d zzb = p.zzb();
                    return zzb != null && Arrays.equals(this.y2(), (byte[])com.google.android.gms.dynamic.f.y2(zzb));
                }
                catch (RemoteException ex) {
                    Log.e("GoogleCertificates", "Failed to get Google certificates from remote", (Throwable)ex);
                }
            }
        }
        return false;
    }
    
    public int hashCode() {
        return this.f;
    }
    
    abstract byte[] y2();
    
    @Override
    public final d zzb() {
        return com.google.android.gms.dynamic.f.z2(this.y2());
    }
}
