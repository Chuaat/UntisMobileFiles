// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.platform;

import java.util.Arrays;
import java.util.Objects;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import okhttp3.d0;
import java.util.List;
import org.jetbrains.annotations.f;
import java.lang.reflect.InvocationTargetException;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import java.lang.reflect.Method;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001c\u001dB7\u0012\u0006\u0010\u0018\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\r\u0012\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\r¢\u0006\u0004\b\u0019\u0010\u001aJ(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u000eR\u0016\u0010\u0018\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012¨\u0006\u001e" }, d2 = { "Lokhttp3/internal/platform/e;", "Lokhttp3/internal/platform/h;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lokhttp3/d0;", "protocols", "Lkotlin/j2;", "f", "c", "j", "Ljava/lang/Class;", "Ljava/lang/Class;", "serverProviderClass", "Ljava/lang/reflect/Method;", "h", "Ljava/lang/reflect/Method;", "removeMethod", "g", "getMethod", "i", "clientProviderClass", "putMethod", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/Class;Ljava/lang/Class;)V", "k", "a", "b", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class e extends h
{
    public static final b k;
    private final Method f;
    private final Method g;
    private final Method h;
    private final Class<?> i;
    private final Class<?> j;
    
    static {
        k = new b(null);
    }
    
    public e(@org.jetbrains.annotations.e final Method f, @org.jetbrains.annotations.e final Method g, @org.jetbrains.annotations.e final Method h, @org.jetbrains.annotations.e final Class<?> i, @org.jetbrains.annotations.e final Class<?> j) {
        k0.p((Object)f, "putMethod");
        k0.p((Object)g, "getMethod");
        k0.p((Object)h, "removeMethod");
        k0.p((Object)i, "clientProviderClass");
        k0.p((Object)j, "serverProviderClass");
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    @Override
    public void c(@org.jetbrains.annotations.e final SSLSocket sslSocket) {
        k0.p((Object)sslSocket, "sslSocket");
        try {
            this.h.invoke(null, sslSocket);
        }
        catch (InvocationTargetException cause) {
            throw new AssertionError("failed to remove ALPN", cause);
        }
        catch (IllegalAccessException cause2) {
            throw new AssertionError("failed to remove ALPN", cause2);
        }
    }
    
    @Override
    public void f(@org.jetbrains.annotations.e final SSLSocket sslSocket, @f final String s, @org.jetbrains.annotations.e final List<? extends d0> list) {
        k0.p((Object)sslSocket, "sslSocket");
        k0.p((Object)list, "protocols");
        final List<String> b = okhttp3.internal.platform.h.e.b(list);
        try {
            this.f.invoke(null, sslSocket, Proxy.newProxyInstance(h.class.getClassLoader(), new Class[] { this.i, this.j }, new a(b)));
        }
        catch (IllegalAccessException cause) {
            throw new AssertionError("failed to set ALPN", cause);
        }
        catch (InvocationTargetException cause2) {
            throw new AssertionError("failed to set ALPN", cause2);
        }
    }
    
    @f
    @Override
    public String j(@org.jetbrains.annotations.e final SSLSocket sslSocket) {
        k0.p((Object)sslSocket, "sslSocket");
        try {
            final Method g = this.g;
            final String s = null;
            final InvocationHandler invocationHandler = Proxy.getInvocationHandler(g.invoke(null, sslSocket));
            if (invocationHandler == null) {
                throw new NullPointerException("null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            }
            final a a = (a)invocationHandler;
            if (!a.b() && a.a() == null) {
                okhttp3.internal.platform.h.n(this, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 0, null, 6, null);
                return null;
            }
            String a2;
            if (a.b()) {
                a2 = s;
            }
            else {
                a2 = a.a();
            }
            return a2;
        }
        catch (IllegalAccessException cause) {
            throw new AssertionError("failed to get ALPN selected protocol", cause);
        }
        catch (InvocationTargetException cause2) {
            throw new AssertionError("failed to get ALPN selected protocol", cause2);
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0012¢\u0006\u0004\b\u001b\u0010\u001cJ2\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013R\"\u0010\u001a\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u000b\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001d" }, d2 = { "okhttp3/internal/platform/e$a", "Ljava/lang/reflect/InvocationHandler;", "", "proxy", "Ljava/lang/reflect/Method;", "method", "", "args", "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", "", "b", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "c", "(Ljava/lang/String;)V", "selected", "", "Ljava/util/List;", "protocols", "", "Z", "()Z", "d", "(Z)V", "unsupported", "<init>", "(Ljava/util/List;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    private static final class a implements InvocationHandler
    {
        private boolean a;
        @f
        private String b;
        private final List<String> c;
        
        public a(@org.jetbrains.annotations.e final List<String> c) {
            k0.p((Object)c, "protocols");
            this.c = c;
        }
        
        @f
        public final String a() {
            return this.b;
        }
        
        public final boolean b() {
            return this.a;
        }
        
        public final void c(@f final String b) {
            this.b = b;
        }
        
        public final void d(final boolean a) {
            this.a = a;
        }
        
        @f
        @Override
        public Object invoke(@org.jetbrains.annotations.e Object o, @org.jetbrains.annotations.e final Method method, @f Object[] original) throws Throwable {
            k0.p(o, "proxy");
            k0.p((Object)method, "method");
            if (original == null) {
                original = new Object[0];
            }
            final String name = method.getName();
            final Class<?> returnType = method.getReturnType();
            if (k0.g((Object)name, (Object)"supports") && k0.g((Object)Boolean.TYPE, (Object)returnType)) {
                return Boolean.TRUE;
            }
            if (k0.g((Object)name, (Object)"unsupported") && k0.g((Object)Void.TYPE, (Object)returnType)) {
                this.a = true;
                return null;
            }
            if (k0.g((Object)name, (Object)"protocols") && original.length == 0) {
                return this.c;
            }
            if ((k0.g((Object)name, (Object)"selectProtocol") || k0.g((Object)name, (Object)"select")) && k0.g((Object)String.class, (Object)returnType) && original.length == 1 && original[0] instanceof List) {
                o = original[0];
                Objects.requireNonNull(o, "null cannot be cast to non-null type kotlin.collections.List<*>");
                final List list = (List)o;
                final int size = list.size();
                if (size >= 0) {
                    int n = 0;
                    while (true) {
                        final String value = list.get(n);
                        Objects.requireNonNull(value, "null cannot be cast to non-null type kotlin.String");
                        final String b = value;
                        if (this.c.contains(b)) {
                            return this.b = b;
                        }
                        if (n == size) {
                            break;
                        }
                        ++n;
                    }
                }
                return this.b = this.c.get(0);
            }
            if ((k0.g((Object)name, (Object)"protocolSelected") || k0.g((Object)name, (Object)"selected")) && original.length == 1) {
                o = original[0];
                Objects.requireNonNull(o, "null cannot be cast to non-null type kotlin.String");
                this.b = (String)o;
                return null;
            }
            return method.invoke(this, Arrays.copyOf(original, original.length));
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\u0006" }, d2 = { "okhttp3/internal/platform/e$b", "", "Lokhttp3/internal/platform/h;", "a", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class b
    {
        private b() {
        }
        
        @f
        public final h a() {
            final String property = System.getProperty("java.specification.version", "unknown");
            while (true) {
                try {
                    k0.o((Object)property, "jvmVersion");
                    if (Integer.parseInt(property) >= 9) {
                        return null;
                    }
                    try {
                        final Class<?> forName = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                        final StringBuilder sb = new StringBuilder();
                        sb.append("org.eclipse.jetty.alpn.ALPN");
                        sb.append("$Provider");
                        final Class<?> forName2 = Class.forName(sb.toString(), true, null);
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("org.eclipse.jetty.alpn.ALPN");
                        sb2.append("$ClientProvider");
                        final Class<?> forName3 = Class.forName(sb2.toString(), true, null);
                        final StringBuilder sb3 = new StringBuilder();
                        sb3.append("org.eclipse.jetty.alpn.ALPN");
                        sb3.append("$ServerProvider");
                        final Class<?> forName4 = Class.forName(sb3.toString(), true, null);
                        final Method method = forName.getMethod("put", SSLSocket.class, forName2);
                        final Method method2 = forName.getMethod("get", SSLSocket.class);
                        final Method method3 = forName.getMethod("remove", SSLSocket.class);
                        k0.o((Object)method, "putMethod");
                        k0.o((Object)method2, "getMethod");
                        k0.o((Object)method3, "removeMethod");
                        k0.o((Object)forName3, "clientProviderClass");
                        k0.o((Object)forName4, "serverProviderClass");
                        return new e(method, method2, method3, forName3, forName4);
                    }
                    catch (ClassNotFoundException | NoSuchMethodException ex) {
                        return null;
                    }
                }
                catch (NumberFormatException ex2) {
                    continue;
                }
                break;
            }
        }
    }
}
