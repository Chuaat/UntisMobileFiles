// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.provider;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import androidx.core.util.n;
import android.provider.BaseColumns;
import java.util.concurrent.Executor;
import androidx.annotation.b0;
import androidx.annotation.p0;
import androidx.core.graphics.e0;
import java.nio.ByteBuffer;
import android.net.Uri;
import java.util.Map;
import androidx.annotation.b1;
import android.content.pm.ProviderInfo;
import android.content.res.Resources;
import android.content.pm.PackageManager;
import android.os.Handler;
import androidx.core.content.res.g;
import android.content.pm.PackageManager$NameNotFoundException;
import androidx.core.graphics.x;
import android.graphics.Typeface;
import androidx.annotation.k0;
import android.os.CancellationSignal;
import androidx.annotation.j0;
import android.content.Context;
import androidx.annotation.t0;

public class f
{
    @Deprecated
    @t0({ t0.a.I })
    public static final String a = "font_results";
    @Deprecated
    @t0({ t0.a.I })
    static final int b = -1;
    @Deprecated
    @t0({ t0.a.I })
    static final int c = -2;
    
    private f() {
    }
    
    @k0
    public static Typeface a(@j0 final Context context, @k0 final CancellationSignal cancellationSignal, @j0 final c[] array) {
        return x.c(context, cancellationSignal, array, 0);
    }
    
    @j0
    public static b b(@j0 final Context context, @k0 final CancellationSignal cancellationSignal, @j0 final androidx.core.provider.d d) throws PackageManager$NameNotFoundException {
        return androidx.core.provider.c.d(context, d, cancellationSignal);
    }
    
    @Deprecated
    @t0({ t0.a.I })
    public static Typeface c(final Context context, final androidx.core.provider.d d, @k0 final g.c c, @k0 final Handler handler, final boolean b, final int n, final int n2) {
        return f(context, d, n2, b, n, g.c.c(handler), (d)new x.a(c));
    }
    
    @Deprecated
    @b1
    @k0
    @t0({ t0.a.I })
    public static ProviderInfo d(@j0 final PackageManager packageManager, @j0 final androidx.core.provider.d d, @k0 final Resources resources) throws PackageManager$NameNotFoundException {
        return androidx.core.provider.c.e(packageManager, d, resources);
    }
    
    @Deprecated
    @p0(19)
    @t0({ t0.a.I })
    public static Map<Uri, ByteBuffer> e(final Context context, final c[] array, final CancellationSignal cancellationSignal) {
        return e0.h(context, array, cancellationSignal);
    }
    
    @k0
    @t0({ t0.a.G })
    public static Typeface f(@j0 final Context context, @j0 final androidx.core.provider.d d, final int n, final boolean b, @b0(from = 0L) final int n2, @j0 final Handler handler, @j0 final d d2) {
        final androidx.core.provider.a a = new androidx.core.provider.a(d2, handler);
        if (b) {
            return e.e(context, d, a, n, n2);
        }
        return e.d(context, d, n, null, a);
    }
    
    public static void g(@j0 final Context context, @j0 final androidx.core.provider.d d, @j0 final d d2, @j0 final Handler handler) {
        e.d(context.getApplicationContext(), d, 0, androidx.core.provider.g.b(handler), new androidx.core.provider.a(d2));
    }
    
    @Deprecated
    @t0({ t0.a.I })
    public static void h() {
        e.f();
    }
    
    @b1
    @t0({ t0.a.K })
    public static void i() {
        e.f();
    }
    
    public static final class a implements BaseColumns
    {
        public static final String a = "file_id";
        public static final String b = "font_ttc_index";
        public static final String c = "font_variation_settings";
        public static final String d = "font_weight";
        public static final String e = "font_italic";
        public static final String f = "result_code";
        public static final int g = 0;
        public static final int h = 1;
        public static final int i = 2;
        public static final int j = 3;
    }
    
    public static class b
    {
        public static final int c = 0;
        public static final int d = 1;
        public static final int e = 2;
        private final int a;
        private final c[] b;
        
        @Deprecated
        @t0({ t0.a.I })
        public b(final int a, @k0 final c[] b) {
            this.a = a;
            this.b = b;
        }
        
        static b a(final int n, @k0 final c[] array) {
            return new b(n, array);
        }
        
        public c[] b() {
            return this.b;
        }
        
        public int c() {
            return this.a;
        }
    }
    
    public static class c
    {
        private final Uri a;
        private final int b;
        private final int c;
        private final boolean d;
        private final int e;
        
        @Deprecated
        @t0({ t0.a.I })
        public c(@j0 final Uri uri, @b0(from = 0L) final int b, @b0(from = 1L, to = 1000L) final int c, final boolean d, final int e) {
            this.a = n.g(uri);
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
        }
        
        static c a(@j0 final Uri uri, @b0(from = 0L) final int n, @b0(from = 1L, to = 1000L) final int n2, final boolean b, final int n3) {
            return new c(uri, n, n2, b, n3);
        }
        
        public int b() {
            return this.e;
        }
        
        @b0(from = 0L)
        public int c() {
            return this.b;
        }
        
        @j0
        public Uri d() {
            return this.a;
        }
        
        @b0(from = 1L, to = 1000L)
        public int e() {
            return this.c;
        }
        
        public boolean f() {
            return this.d;
        }
    }
    
    public static class d
    {
        @Deprecated
        @t0({ t0.a.I })
        public static final int a = 0;
        static final int b = 0;
        public static final int c = -1;
        public static final int d = -2;
        public static final int e = -3;
        public static final int f = -4;
        public static final int g = 1;
        public static final int h = 2;
        public static final int i = 3;
        
        public void a(final int n) {
        }
        
        public void b(final Typeface typeface) {
        }
        
        @Retention(RetentionPolicy.SOURCE)
        @t0({ t0.a.I })
        public @interface a {
        }
    }
}
