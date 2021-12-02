// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.platform.android;

import kotlin.text.s;
import okhttp3.internal.platform.h;
import okhttp3.d0;
import java.util.List;
import javax.net.ssl.X509TrustManager;
import javax.net.ssl.SSLSocketFactory;
import java.nio.charset.Charset;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import okhttp3.internal.platform.b;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import javax.net.ssl.SSLSocket;
import java.lang.reflect.Method;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0016\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0006B\u0017\u0012\u000e\u0010\u0015\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00040\u0012¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J(\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u001e\u0010\u0015\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00040\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0017\u001a\n \u0016*\u0004\u0018\u00010\u000f0\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u001e\u0010\u0019\u001a\n \u0016*\u0004\u0018\u00010\u000f0\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0010R\u001e\u0010\u001a\u001a\n \u0016*\u0004\u0018\u00010\u000f0\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010¨\u0006\u001e" }, d2 = { "Lokhttp3/internal/platform/android/f;", "Lokhttp3/internal/platform/android/k;", "", "b", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "a", "", "hostname", "", "Lokhttp3/d0;", "protocols", "Lkotlin/j2;", "f", "c", "Ljava/lang/reflect/Method;", "Ljava/lang/reflect/Method;", "setUseSessionTickets", "Ljava/lang/Class;", "e", "Ljava/lang/Class;", "sslSocketClass", "kotlin.jvm.PlatformType", "setHostname", "d", "setAlpnProtocols", "getAlpnSelectedProtocol", "<init>", "(Ljava/lang/Class;)V", "g", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public class f implements k
{
    @e
    private static final j.a f;
    public static final a g;
    private final Method a;
    private final Method b;
    private final Method c;
    private final Method d;
    private final Class<? super SSLSocket> e;
    
    static {
        f = (g = new a(null)).c("com.google.android.gms.org.conscrypt");
    }
    
    public f(@e final Class<? super SSLSocket> e) {
        k0.p((Object)e, "sslSocketClass");
        this.e = e;
        final Method declaredMethod = e.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        k0.o((Object)declaredMethod, "sslSocketClass.getDeclar\u2026:class.javaPrimitiveType)");
        this.a = declaredMethod;
        this.b = e.getMethod("setHostname", String.class);
        this.c = e.getMethod("getAlpnSelectedProtocol", (Class<?>[])new Class[0]);
        this.d = e.getMethod("setAlpnProtocols", byte[].class);
    }
    
    public static final /* synthetic */ j.a g() {
        return okhttp3.internal.platform.android.f.f;
    }
    
    @Override
    public boolean a(@e final SSLSocket sslSocket) {
        k0.p((Object)sslSocket, "sslSocket");
        return this.e.isInstance(sslSocket);
    }
    
    @Override
    public boolean b() {
        return okhttp3.internal.platform.b.i.b();
    }
    
    @org.jetbrains.annotations.f
    @Override
    public String c(@e final SSLSocket obj) {
        k0.p((Object)obj, "sslSocket");
        final boolean a = this.a(obj);
        final String s = null;
        if (!a) {
            return null;
        }
        String s2;
        try {
            final byte[] bytes = (byte[])this.c.invoke(obj, new Object[0]);
            s2 = s;
            if (bytes != null) {
                final Charset utf_8 = StandardCharsets.UTF_8;
                k0.o((Object)utf_8, "StandardCharsets.UTF_8");
                s2 = new String(bytes, utf_8);
            }
        }
        catch (InvocationTargetException detailMessage) {
            throw new AssertionError((Object)detailMessage);
        }
        catch (IllegalAccessException detailMessage2) {
            throw new AssertionError((Object)detailMessage2);
        }
        catch (NullPointerException ex) {
            if (!k0.g((Object)ex.getMessage(), (Object)"ssl == null")) {
                throw ex;
            }
            s2 = s;
        }
        return s2;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public X509TrustManager d(@e final SSLSocketFactory sslSocketFactory) {
        k0.p((Object)sslSocketFactory, "sslSocketFactory");
        return k.a.b(this, sslSocketFactory);
    }
    
    @Override
    public boolean e(@e final SSLSocketFactory sslSocketFactory) {
        k0.p((Object)sslSocketFactory, "sslSocketFactory");
        return k.a.a(this, sslSocketFactory);
    }
    
    @Override
    public void f(@e final SSLSocket obj, @org.jetbrains.annotations.f final String s, @e final List<? extends d0> list) {
        k0.p((Object)obj, "sslSocket");
        k0.p((Object)list, "protocols");
        if (this.a(obj)) {
            try {
                this.a.invoke(obj, Boolean.TRUE);
                if (s != null) {
                    this.b.invoke(obj, s);
                }
                this.d.invoke(obj, h.e.c(list));
            }
            catch (InvocationTargetException detailMessage) {
                throw new AssertionError((Object)detailMessage);
            }
            catch (IllegalAccessException detailMessage2) {
                throw new AssertionError((Object)detailMessage2);
            }
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00030\u0002H\u0002J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007R\u0019\u0010\u000b\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011" }, d2 = { "okhttp3/internal/platform/android/f$a", "", "Ljava/lang/Class;", "Ljavax/net/ssl/SSLSocket;", "actualSSLSocketClass", "Lokhttp3/internal/platform/android/f;", "b", "", "packageName", "Lokhttp3/internal/platform/android/j$a;", "c", "playProviderFactory", "Lokhttp3/internal/platform/android/j$a;", "d", "()Lokhttp3/internal/platform/android/j$a;", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class a
    {
        private a() {
        }
        
        private final f b(final Class<? super SSLSocket> obj) {
            Class<? super SSLSocket> superclass = obj;
            while (superclass != null && (k0.g((Object)superclass.getSimpleName(), (Object)"OpenSSLSocketImpl") ^ true)) {
                superclass = superclass.getSuperclass();
                if (superclass != null) {
                    continue;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("No OpenSSLSocketImpl superclass of socket of type ");
                sb.append(obj);
                throw new AssertionError((Object)sb.toString());
            }
            k0.m((Object)superclass);
            return new f(superclass);
        }
        
        @e
        public final j.a c(@e final String s) {
            k0.p((Object)s, "packageName");
            return new j.a() {
                @Override
                public boolean a(@e final SSLSocket sslSocket) {
                    k0.p((Object)sslSocket, "sslSocket");
                    final String name = sslSocket.getClass().getName();
                    k0.o((Object)name, "sslSocket.javaClass.name");
                    final StringBuilder sb = new StringBuilder();
                    sb.append(s);
                    sb.append('.');
                    return s.u2(name, sb.toString(), false, 2, null);
                }
                
                @e
                @Override
                public k b(@e final SSLSocket sslSocket) {
                    k0.p((Object)sslSocket, "sslSocket");
                    return okhttp3.internal.platform.android.f.g.b(sslSocket.getClass());
                }
            };
        }
        
        @e
        public final j.a d() {
            return okhttp3.internal.platform.android.f.g();
        }
    }
}
