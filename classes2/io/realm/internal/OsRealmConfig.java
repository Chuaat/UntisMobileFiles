// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.internal;

import java.io.File;
import java.net.SocketAddress;
import java.util.List;
import java.util.Iterator;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URISyntaxException;
import io.realm.log.RealmLog;
import java.util.Map;
import c6.h;
import io.realm.CompactOnLaunchCallback;
import java.net.URI;
import io.realm.j0;

public class OsRealmConfig implements k
{
    private static final byte N = 0;
    private static final byte O = 1;
    private static final byte P = 2;
    private static final byte Q = 3;
    private static final byte R = 4;
    private static final byte S = 5;
    private static final byte T = 6;
    private static final byte U = 0;
    private static final byte V = 1;
    private static final byte W = 2;
    private static final byte X = 0;
    public static final byte Y = 0;
    public static final byte Z = 1;
    public static final byte a0 = 2;
    private static final long b0;
    private final j0 G;
    private final URI H;
    private final long I;
    private final j J;
    private final CompactOnLaunchCallback K;
    private final OsSharedRealm.MigrationCallback L;
    private final OsSharedRealm.InitializationCallback M;
    
    static {
        b0 = nativeGetFinalizerPtr();
    }
    
    private OsRealmConfig(j0 j0, String str, final boolean b, @h OsSchemaInfo osSchemaInfo, @h final OsSharedRealm.MigrationCallback l, @h OsSharedRealm.InitializationCallback default1) {
        this.J = new j();
        this.G = j0;
        this.I = nativeCreate(j0.m(), (String)str, true, j0.j());
        j.c.a(this);
        final Object[] d = l.e().d(j0);
        final String s = (String)d[0];
        final String s2 = (String)d[1];
        final String str2 = (String)d[2];
        final String s3 = (String)d[3];
        final String s4 = (String)d[4];
        final String s5 = (String)d[5];
        final Byte b2 = (Byte)d[6];
        final String s6 = (String)d[7];
        final String s7 = (String)d[8];
        final Map map = (Map)d[9];
        final Byte b3 = (Byte)d[10];
        final String s8 = (String)d[11];
        final Object o = d[12];
        final Long n = (Long)d[13];
        int n2;
        if (map != null) {
            n2 = map.size() * 2;
        }
        else {
            n2 = 0;
        }
        final String[] array = new String[n2];
        if (map != null) {
            final Iterator<Map.Entry<String, V>> iterator = map.entrySet().iterator();
            int n3 = 0;
            while (iterator.hasNext()) {
                final Map.Entry<String, V> entry = iterator.next();
                array[n3] = entry.getKey();
                array[n3 + 1] = (String)entry.getValue();
                n3 += 2;
            }
        }
        final byte[] g = j0.g();
        if (g != null) {
            nativeSetEncryptionKey(this.I, g);
        }
        nativeSetInMemory(this.I, j0.f() == c.I);
        nativeEnableChangeNotification(this.I, b);
        d d2 = OsRealmConfig.d.M;
        if (j0.x()) {
            d2 = OsRealmConfig.d.I;
        }
        else if (j0.w()) {
            d2 = OsRealmConfig.d.J;
        }
        else if (s2 != null) {
            d2 = OsRealmConfig.d.L;
        }
        else if (j0.A()) {
            d2 = OsRealmConfig.d.K;
        }
        final long s9 = j0.s();
        long nativePtr;
        if (osSchemaInfo == null) {
            nativePtr = 0L;
        }
        else {
            nativePtr = osSchemaInfo.getNativePtr();
        }
        this.L = l;
        this.nativeSetSchemaConfig(this.I, d2.b(), s9, nativePtr, l);
        final CompactOnLaunchCallback e = j0.e();
        this.K = e;
        if (e != null) {
            nativeSetCompactOnLaunchCallback(this.I, e);
        }
        if ((this.M = default1) != null) {
            this.nativeSetInitializationCallback(this.I, default1);
        }
        j0 = null;
        osSchemaInfo = null;
        if (s2 != null) {
            str = (j0 = (j0)nativeCreateAndSetSyncConfig(n, this.I, s2, str2, s, s3, s4, s5, b2, s6, s7, array, b3, s8, o));
            try {
                j0 = (j0)str;
                final StringBuilder sb = new StringBuilder();
                j0 = (j0)str;
                sb.append(str2);
                j0 = (j0)str;
                sb.append(s6.substring(1));
                j0 = (j0)str;
                str = (j0 = (j0 = (j0)sb.toString()));
                j0 = (j0)new URI((String)str);
            }
            catch (URISyntaxException ex) {
                RealmLog.h(ex, "Cannot create a URI from the Realm URL address", new Object[0]);
                str = j0;
                j0 = null;
            }
            default1 = (OsSharedRealm.InitializationCallback)ProxySelector.getDefault();
            if (j0 != null && default1 != null) {
                Object o2;
                try {
                    o2 = new URI(((String)str).replaceFirst("ws", "http"));
                }
                catch (URISyntaxException ex2) {
                    RealmLog.h(ex2, "Cannot create a URI from the Realm URL address", new Object[0]);
                    o2 = osSchemaInfo;
                }
                final List<Proxy> select = ((ProxySelector)default1).select((URI)o2);
                if (select != null && !select.isEmpty()) {
                    final Proxy proxy = select.get(0);
                    if (proxy.type() != Proxy.Type.DIRECT) {
                        final byte b4 = -1;
                        byte b5;
                        if (OsRealmConfig$a.a[proxy.type().ordinal()] != 1) {
                            b5 = b4;
                        }
                        else {
                            b5 = 0;
                        }
                        if (proxy.type() == Proxy.Type.HTTP) {
                            final SocketAddress address = proxy.address();
                            if (address instanceof InetSocketAddress) {
                                final InetSocketAddress inetSocketAddress = (InetSocketAddress)address;
                                nativeSetSyncConfigProxySettings(this.I, b5, inetSocketAddress.getHostString(), inetSocketAddress.getPort());
                            }
                            else {
                                final StringBuilder sb2 = new StringBuilder();
                                sb2.append("Unsupported proxy socket address type: ");
                                sb2.append(((InetSocketAddress)address).getClass().getName());
                                RealmLog.f(sb2.toString(), new Object[0]);
                            }
                        }
                        else {
                            RealmLog.f("SOCKS proxies are not supported.", new Object[0]);
                        }
                    }
                }
            }
        }
        this.H = (URI)j0;
    }
    
    private static native long nativeCreate(final String p0, final String p1, final boolean p2, final long p3);
    
    private static native String nativeCreateAndSetSyncConfig(final long p0, final long p1, final String p2, final String p3, final String p4, final String p5, final String p6, final String p7, final byte p8, final String p9, final String p10, final String[] p11, final byte p12, final String p13, final Object p14);
    
    private static native void nativeEnableChangeNotification(final long p0, final boolean p1);
    
    private static native long nativeGetFinalizerPtr();
    
    private static native void nativeSetCompactOnLaunchCallback(final long p0, final CompactOnLaunchCallback p1);
    
    private static native void nativeSetEncryptionKey(final long p0, final byte[] p1);
    
    private static native void nativeSetInMemory(final long p0, final boolean p1);
    
    private native void nativeSetInitializationCallback(final long p0, final OsSharedRealm.InitializationCallback p1);
    
    private native void nativeSetSchemaConfig(final long p0, final byte p1, final long p2, final long p3, @h final OsSharedRealm.MigrationCallback p4);
    
    private static native void nativeSetSyncConfigProxySettings(final long p0, final byte p1, final String p2, final int p3);
    
    private static native void nativeSetSyncConfigSslSettings(final long p0, final boolean p1, final String p2);
    
    j a() {
        return this.J;
    }
    
    public j0 b() {
        return this.G;
    }
    
    public URI c() {
        return this.H;
    }
    
    @Override
    public long getNativeFinalizerPtr() {
        return OsRealmConfig.b0;
    }
    
    @Override
    public long getNativePtr() {
        return this.I;
    }
    
    public static class b
    {
        private j0 a;
        private OsSchemaInfo b;
        private OsSharedRealm.MigrationCallback c;
        private OsSharedRealm.InitializationCallback d;
        private boolean e;
        private String f;
        
        public b(final j0 a) {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = false;
            this.f = "";
            this.a = a;
        }
        
        public b a(final boolean e) {
            this.e = e;
            return this;
        }
        
        public OsRealmConfig b() {
            return new OsRealmConfig(this.a, this.f, this.e, this.b, this.c, this.d, null);
        }
        
        public b c(final File file) {
            this.f = file.getAbsolutePath();
            return this;
        }
        
        public b d(@h final OsSharedRealm.InitializationCallback d) {
            this.d = d;
            return this;
        }
        
        public b e(@h final OsSharedRealm.MigrationCallback c) {
            this.c = c;
            return this;
        }
        
        public b f(@h final OsSchemaInfo b) {
            this.b = b;
            return this;
        }
    }
    
    public enum c
    {
        H(0), 
        I(1);
        
        final int G;
        
        private c(final int g) {
            this.G = g;
        }
    }
    
    public enum d
    {
        H((byte)0), 
        I((byte)1), 
        J((byte)2), 
        K((byte)3), 
        L((byte)4), 
        M((byte)6);
        
        final byte G;
        
        private d(final byte b) {
            this.G = b;
        }
        
        public byte b() {
            return this.G;
        }
    }
    
    public enum e
    {
        H((byte)0), 
        I((byte)1), 
        J((byte)2);
        
        final byte G;
        
        private e(final byte b) {
            this.G = b;
        }
        
        public byte b() {
            return this.G;
        }
    }
}
