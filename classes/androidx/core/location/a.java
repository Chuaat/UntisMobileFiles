// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.location;

import androidx.annotation.t0;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import androidx.annotation.t;
import androidx.annotation.b0;
import android.location.GpsStatus;
import androidx.annotation.p0;
import androidx.annotation.j0;
import android.location.GnssStatus;
import android.annotation.SuppressLint;

public abstract class a
{
    @SuppressLint({ "InlinedApi" })
    public static final int a = 0;
    @SuppressLint({ "InlinedApi" })
    public static final int b = 1;
    @SuppressLint({ "InlinedApi" })
    public static final int c = 2;
    @SuppressLint({ "InlinedApi" })
    public static final int d = 3;
    @SuppressLint({ "InlinedApi" })
    public static final int e = 4;
    @SuppressLint({ "InlinedApi" })
    public static final int f = 5;
    @SuppressLint({ "InlinedApi" })
    public static final int g = 6;
    @SuppressLint({ "InlinedApi" })
    public static final int h = 7;
    
    a() {
    }
    
    @j0
    @p0(24)
    public static a n(@j0 final GnssStatus gnssStatus) {
        return new androidx.core.location.b(gnssStatus);
    }
    
    @SuppressLint({ "ReferencesDeprecated" })
    @j0
    public static a o(@j0 final GpsStatus gpsStatus) {
        return new c(gpsStatus);
    }
    
    @t(from = 0.0, to = 360.0)
    public abstract float a(@b0(from = 0L) final int p0);
    
    @t(from = 0.0, to = 63.0)
    public abstract float b(@b0(from = 0L) final int p0);
    
    @t(from = 0.0)
    public abstract float c(@b0(from = 0L) final int p0);
    
    @t(from = 0.0, to = 63.0)
    public abstract float d(@b0(from = 0L) final int p0);
    
    public abstract int e(@b0(from = 0L) final int p0);
    
    @t(from = -90.0, to = 90.0)
    public abstract float f(@b0(from = 0L) final int p0);
    
    @b0(from = 0L)
    public abstract int g();
    
    @b0(from = 1L, to = 200L)
    public abstract int h(@b0(from = 0L) final int p0);
    
    public abstract boolean i(@b0(from = 0L) final int p0);
    
    public abstract boolean j(@b0(from = 0L) final int p0);
    
    public abstract boolean k(@b0(from = 0L) final int p0);
    
    public abstract boolean l(@b0(from = 0L) final int p0);
    
    public abstract boolean m(@b0(from = 0L) final int p0);
    
    public abstract static class a
    {
        public void a(@b0(from = 0L) final int n) {
        }
        
        public void b(@j0 final androidx.core.location.a a) {
        }
        
        public void c() {
        }
        
        public void d() {
        }
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ t0.a.G })
    public @interface b {
    }
}
