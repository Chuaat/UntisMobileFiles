// 
// Decompiled by Procyon v0.5.36
// 

package androidx.webkit;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import androidx.annotation.t0;
import android.annotation.SuppressLint;
import androidx.webkit.internal.u;
import androidx.annotation.j0;
import androidx.webkit.internal.v;
import androidx.webkit.internal.t;
import android.webkit.WebSettings;

public class p
{
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 0;
    public static final int e = 1;
    public static final int f = 2;
    
    private p() {
    }
    
    private static t a(final WebSettings webSettings) {
        return v.c().e(webSettings);
    }
    
    @SuppressLint({ "NewApi" })
    public static int b(@j0 final WebSettings webSettings) {
        final u m = u.M;
        if (m.j()) {
            return webSettings.getDisabledActionModeMenuItems();
        }
        if (m.k()) {
            return a(webSettings).a();
        }
        throw u.f();
    }
    
    @SuppressLint({ "NewApi" })
    public static int c(@j0 final WebSettings webSettings) {
        final u y0 = u.y0;
        if (y0.j()) {
            return webSettings.getForceDark();
        }
        if (y0.k()) {
            return a(webSettings).b();
        }
        throw u.f();
    }
    
    @SuppressLint({ "NewApi" })
    public static int d(@j0 final WebSettings webSettings) {
        if (u.z0.k()) {
            return a(webSettings).b();
        }
        throw u.f();
    }
    
    @SuppressLint({ "NewApi" })
    public static boolean e(@j0 final WebSettings webSettings) {
        final u k = u.K;
        if (k.j()) {
            return webSettings.getOffscreenPreRaster();
        }
        if (k.k()) {
            return a(webSettings).d();
        }
        throw u.f();
    }
    
    @SuppressLint({ "NewApi" })
    public static boolean f(@j0 final WebSettings webSettings) {
        final u l = u.L;
        if (l.j()) {
            return webSettings.getSafeBrowsingEnabled();
        }
        if (l.k()) {
            return a(webSettings).e();
        }
        throw u.f();
    }
    
    @SuppressLint({ "NewApi" })
    public static void g(@j0 final WebSettings webSettings, final int disabledActionModeMenuItems) {
        final u m = u.M;
        if (m.j()) {
            webSettings.setDisabledActionModeMenuItems(disabledActionModeMenuItems);
        }
        else {
            if (!m.k()) {
                throw u.f();
            }
            a(webSettings).f(disabledActionModeMenuItems);
        }
    }
    
    @SuppressLint({ "NewApi" })
    public static void h(@j0 final WebSettings webSettings, final int forceDark) {
        final u y0 = u.y0;
        if (y0.j()) {
            webSettings.setForceDark(forceDark);
        }
        else {
            if (!y0.k()) {
                throw u.f();
            }
            a(webSettings).g(forceDark);
        }
    }
    
    @SuppressLint({ "NewApi" })
    public static void i(@j0 final WebSettings webSettings, final int n) {
        if (u.z0.k()) {
            a(webSettings).h(n);
            return;
        }
        throw u.f();
    }
    
    @SuppressLint({ "NewApi" })
    public static void j(@j0 final WebSettings webSettings, final boolean offscreenPreRaster) {
        final u k = u.K;
        if (k.j()) {
            webSettings.setOffscreenPreRaster(offscreenPreRaster);
        }
        else {
            if (!k.k()) {
                throw u.f();
            }
            a(webSettings).i(offscreenPreRaster);
        }
    }
    
    @SuppressLint({ "NewApi" })
    public static void k(@j0 final WebSettings webSettings, final boolean safeBrowsingEnabled) {
        final u l = u.L;
        if (l.j()) {
            webSettings.setSafeBrowsingEnabled(safeBrowsingEnabled);
        }
        else {
            if (!l.k()) {
                throw u.f();
            }
            a(webSettings).j(safeBrowsingEnabled);
        }
    }
    
    @SuppressLint({ "NewApi" })
    @t0({ t0.a.G })
    public static void l(@j0 final WebSettings webSettings, final boolean b) {
        if (u.w0.k()) {
            a(webSettings).k(b);
            return;
        }
        throw u.f();
    }
    
    @SuppressLint({ "NewApi" })
    @t0({ t0.a.G })
    public static boolean m(@j0 final WebSettings webSettings) {
        if (u.w0.k()) {
            return a(webSettings).l();
        }
        throw u.f();
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @Target({ ElementType.PARAMETER, ElementType.METHOD })
    @t0({ t0.a.G })
    public @interface a {
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @Target({ ElementType.PARAMETER, ElementType.METHOD })
    @t0({ t0.a.G })
    public @interface b {
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @Target({ ElementType.PARAMETER, ElementType.METHOD })
    @t0({ t0.a.G })
    public @interface c {
    }
}
