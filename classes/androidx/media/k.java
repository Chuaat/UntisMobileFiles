// 
// Decompiled by Procyon v0.5.36
// 

package androidx.media;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import androidx.annotation.r;
import androidx.annotation.p0;
import android.os.Build$VERSION;
import androidx.annotation.t0;
import androidx.annotation.k0;
import android.media.VolumeProvider;

public abstract class k
{
    public static final int g = 0;
    public static final int h = 1;
    public static final int i = 2;
    private final int a;
    private final int b;
    private final String c;
    private int d;
    private d e;
    private VolumeProvider f;
    
    public k(final int n, final int n2, final int n3) {
        this(n, n2, n3, null);
    }
    
    @t0({ t0.a.I })
    public k(final int a, final int b, final int d, @k0 final String c) {
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = c;
    }
    
    public final int a() {
        return this.d;
    }
    
    public final int b() {
        return this.b;
    }
    
    public final int c() {
        return this.a;
    }
    
    @k0
    @t0({ t0.a.I })
    public final String d() {
        return this.c;
    }
    
    public Object e() {
        if (this.f == null) {
            final int sdk_INT = Build$VERSION.SDK_INT;
            VolumeProvider f;
            if (sdk_INT >= 30) {
                f = new VolumeProvider(this.a, this.b, this.d, this.c) {
                    public void onAdjustVolume(final int n) {
                        k.this.f(n);
                    }
                    
                    public void onSetVolumeTo(final int n) {
                        k.this.g(n);
                    }
                };
            }
            else {
                if (sdk_INT < 21) {
                    return this.f;
                }
                f = new VolumeProvider(this.a, this.b, this.d) {
                    public void onAdjustVolume(final int n) {
                        k.this.f(n);
                    }
                    
                    public void onSetVolumeTo(final int n) {
                        k.this.g(n);
                    }
                };
            }
            this.f = f;
        }
        return this.f;
    }
    
    public void f(final int n) {
    }
    
    public void g(final int n) {
    }
    
    public void h(final d e) {
        this.e = e;
    }
    
    public final void i(final int d) {
        this.d = d;
        if (Build$VERSION.SDK_INT >= 21) {
            k.c.a((VolumeProvider)this.e(), d);
        }
        final d e = this.e;
        if (e != null) {
            e.a(this);
        }
    }
    
    @p0(21)
    private static class c
    {
        @r
        static void a(final VolumeProvider volumeProvider, final int currentVolume) {
            volumeProvider.setCurrentVolume(currentVolume);
        }
    }
    
    public abstract static class d
    {
        public abstract void a(final k p0);
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ t0.a.I })
    public @interface e {
    }
}
