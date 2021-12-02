// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.platform;

import javax.net.ssl.SSLSocketFactory;
import android.annotation.SuppressLint;
import android.security.NetworkSecurityPolicy;
import okhttp3.d0;
import javax.net.ssl.SSLSocket;
import okhttp3.internal.platform.android.b;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import javax.net.ssl.X509TrustManager;
import java.util.Iterator;
import java.util.ArrayList;
import kotlin.collections.v;
import okhttp3.internal.platform.android.g;
import okhttp3.internal.platform.android.i;
import okhttp3.internal.platform.android.j;
import okhttp3.internal.platform.android.f;
import android.os.Build$VERSION;
import kotlin.jvm.internal.w;
import okhttp3.internal.platform.android.k;
import java.util.List;
import okhttp3.internal.c;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\bH\u0017J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0004H\u0016R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016¨\u0006\u001c" }, d2 = { "Lokhttp3/internal/platform/a;", "Lokhttp3/internal/platform/h;", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/X509TrustManager;", "s", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lokhttp3/d0;", "protocols", "Lkotlin/j2;", "f", "j", "", "l", "trustManager", "Lokhttp3/internal/tls/c;", "d", "Lokhttp3/internal/platform/android/k;", "Ljava/util/List;", "socketAdapters", "<init>", "()V", "h", "a", "okhttp" }, k = 1, mv = { 1, 4, 0 })
@c
public final class a extends h
{
    private static final boolean g;
    public static final a h;
    private final List<k> f;
    
    static {
        h = new a(null);
        g = (okhttp3.internal.platform.h.e.h() && Build$VERSION.SDK_INT >= 29);
    }
    
    public a() {
        final List n = v.N((Object[])new k[] { a.a.a(), new j(okhttp3.internal.platform.android.f.g.d()), new j(i.b.a()), new j(okhttp3.internal.platform.android.g.b.a()) });
        final ArrayList<k> f = new ArrayList<k>();
        for (final k next : n) {
            if (next.b()) {
                f.add(next);
            }
        }
        this.f = f;
    }
    
    public static final /* synthetic */ boolean t() {
        return a.g;
    }
    
    @e
    @Override
    public okhttp3.internal.tls.c d(@e final X509TrustManager x509TrustManager) {
        k0.p((Object)x509TrustManager, "trustManager");
        final b a = okhttp3.internal.platform.android.b.d.a(x509TrustManager);
        okhttp3.internal.tls.c d;
        if (a != null) {
            d = a;
        }
        else {
            d = super.d(x509TrustManager);
        }
        return d;
    }
    
    @Override
    public void f(@e final SSLSocket sslSocket, @org.jetbrains.annotations.f final String s, @e final List<? extends d0> list) {
        k0.p((Object)sslSocket, "sslSocket");
        k0.p((Object)list, "protocols");
        while (true) {
            for (final k next : this.f) {
                if (next.a(sslSocket)) {
                    final k k = next;
                    if (k != null) {
                        k.f(sslSocket, s, list);
                    }
                    return;
                }
            }
            k next = null;
            continue;
        }
    }
    
    @org.jetbrains.annotations.f
    @Override
    public String j(@e final SSLSocket sslSocket) {
        k0.p((Object)sslSocket, "sslSocket");
        final Iterator<Object> iterator = this.f.iterator();
        while (true) {
            k next;
            do {
                final boolean hasNext = iterator.hasNext();
                final String s = null;
                if (!hasNext) {
                    next = null;
                    final k k = next;
                    String c = s;
                    if (k != null) {
                        c = k.c(sslSocket);
                    }
                    return c;
                }
                next = iterator.next();
            } while (!next.a(sslSocket));
            continue;
        }
    }
    
    @SuppressLint({ "NewApi" })
    @Override
    public boolean l(@e final String s) {
        k0.p((Object)s, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(s);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public X509TrustManager s(@e final SSLSocketFactory sslSocketFactory) {
        k0.p((Object)sslSocketFactory, "sslSocketFactory");
        final Iterator<Object> iterator = this.f.iterator();
        while (true) {
            k next;
            do {
                final boolean hasNext = iterator.hasNext();
                final X509TrustManager x509TrustManager = null;
                if (!hasNext) {
                    next = null;
                    final k k = next;
                    X509TrustManager d = x509TrustManager;
                    if (k != null) {
                        d = k.d(sslSocketFactory);
                    }
                    return d;
                }
                next = iterator.next();
            } while (!next.e(sslSocketFactory));
            continue;
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0019\u0010\u0005\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b" }, d2 = { "okhttp3/internal/platform/a$a", "", "Lokhttp3/internal/platform/h;", "a", "", "isSupported", "Z", "b", "()Z", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class a
    {
        private a() {
        }
        
        @org.jetbrains.annotations.f
        public final h a() {
            okhttp3.internal.platform.a a;
            if (this.b()) {
                a = new okhttp3.internal.platform.a();
            }
            else {
                a = null;
            }
            return a;
        }
        
        public final boolean b() {
            return okhttp3.internal.platform.a.t();
        }
    }
}
