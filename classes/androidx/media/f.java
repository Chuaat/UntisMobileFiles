// 
// Decompiled by Procyon v0.5.36
// 

package androidx.media;

import androidx.annotation.k0;
import androidx.annotation.p0;
import android.text.TextUtils;
import java.util.Objects;
import android.media.session.MediaSessionManager$RemoteUserInfo;
import androidx.annotation.t0;
import androidx.annotation.j0;
import android.os.Build$VERSION;
import android.content.Context;
import android.util.Log;

public final class f
{
    static final String b = "MediaSessionManager";
    static final boolean c;
    private static final Object d;
    private static volatile f e;
    a a;
    
    static {
        c = Log.isLoggable("MediaSessionManager", 3);
        d = new Object();
    }
    
    private f(final Context context) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        i a;
        if (sdk_INT >= 28) {
            a = new h(context);
        }
        else if (sdk_INT >= 21) {
            a = new g(context);
        }
        else {
            a = new i(context);
        }
        this.a = (a)a;
    }
    
    @j0
    public static f b(@j0 final Context context) {
        if (context != null) {
            synchronized (f.d) {
                if (f.e == null) {
                    f.e = new f(context.getApplicationContext());
                }
                return f.e;
            }
        }
        throw new IllegalArgumentException("context cannot be null");
    }
    
    Context a() {
        return this.a.getContext();
    }
    
    public boolean c(@j0 final b b) {
        if (b != null) {
            return this.a.a(b.a);
        }
        throw new IllegalArgumentException("userInfo should not be null");
    }
    
    interface a
    {
        boolean a(final c p0);
        
        Context getContext();
    }
    
    public static final class b
    {
        public static final String b = "android.media.session.MediaController";
        @t0({ t0.a.I })
        public static final int c = -1;
        @t0({ t0.a.I })
        public static final int d = -1;
        c a;
        
        @p0(28)
        @t0({ t0.a.G })
        public b(final MediaSessionManager$RemoteUserInfo mediaSessionManager$RemoteUserInfo) {
            final String c = h.a.c(mediaSessionManager$RemoteUserInfo);
            Objects.requireNonNull(c, "package shouldn't be null");
            if (!TextUtils.isEmpty((CharSequence)c)) {
                this.a = new h.a(mediaSessionManager$RemoteUserInfo);
                return;
            }
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        
        public b(@j0 final String obj, final int n, final int n2) {
            Objects.requireNonNull(obj, "package shouldn't be null");
            if (!TextUtils.isEmpty((CharSequence)obj)) {
                c a;
                if (Build$VERSION.SDK_INT >= 28) {
                    a = new h.a(obj, n, n2);
                }
                else {
                    a = new i.a(obj, n, n2);
                }
                this.a = a;
                return;
            }
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        
        @j0
        public String a() {
            return this.a.x();
        }
        
        public int b() {
            return this.a.b();
        }
        
        public int c() {
            return this.a.a();
        }
        
        @Override
        public boolean equals(@k0 final Object o) {
            return this == o || (o instanceof b && this.a.equals(((b)o).a));
        }
        
        @Override
        public int hashCode() {
            return this.a.hashCode();
        }
    }
    
    interface c
    {
        int a();
        
        int b();
        
        String x();
    }
}
