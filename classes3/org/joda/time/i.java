// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time;

import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Collections;
import java.util.HashMap;
import org.joda.time.format.b;
import java.util.Map;
import org.joda.convert.ToString;
import java.io.ObjectStreamException;
import java.util.Locale;
import org.joda.time.tz.c;
import java.util.TimeZone;
import org.joda.time.field.j;
import org.joda.convert.FromString;
import org.joda.time.tz.d;
import java.util.Set;
import java.security.Permission;
import org.joda.time.tz.e;
import org.joda.time.tz.f;
import java.util.concurrent.atomic.AtomicReference;
import java.io.Serializable;

public abstract class i implements Serializable
{
    private static final long H = 5546345482340108586L;
    public static final i I;
    private static final int J = 86399999;
    private static final AtomicReference<f> K;
    private static final AtomicReference<e> L;
    private static final AtomicReference<i> M;
    public static final String N = "org/joda/time/tz/data";
    private final String G;
    
    static {
        I = r0.O;
        K = new AtomicReference<f>();
        L = new AtomicReference<e>();
        M = new AtomicReference<i>();
    }
    
    protected i(final String g) {
        if (g != null) {
            this.G = g;
            return;
        }
        throw new IllegalArgumentException("Id must not be null");
    }
    
    private static int I(final String s) {
        return -(int)a.b.s(s);
    }
    
    private static String K(int n) {
        final StringBuffer sb = new StringBuffer();
        if (n >= 0) {
            sb.append('+');
        }
        else {
            sb.append('-');
            n = -n;
        }
        final int n2 = n / 3600000;
        org.joda.time.format.i.c(sb, n2, 2);
        final int n3 = n - n2 * 3600000;
        n = n3 / 60000;
        sb.append(':');
        org.joda.time.format.i.c(sb, n, 2);
        n = n3 - n * 60000;
        if (n == 0) {
            return sb.toString();
        }
        final int n4 = n / 1000;
        sb.append(':');
        org.joda.time.format.i.c(sb, n4, 2);
        n -= n4 * 1000;
        if (n == 0) {
            return sb.toString();
        }
        sb.append('.');
        org.joda.time.format.i.c(sb, n, 3);
        return sb.toString();
    }
    
    public static void L(final i newValue) throws SecurityException {
        final SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new s("DateTimeZone.setDefault"));
        }
        if (newValue != null) {
            i.M.set(newValue);
            return;
        }
        throw new IllegalArgumentException("The datetime zone must not be null");
    }
    
    public static void M(final e e) throws SecurityException {
        final SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new s("DateTimeZone.setNameProvider"));
        }
        e o;
        if ((o = e) == null) {
            o = o();
        }
        i.L.set(o);
    }
    
    public static void N(f p) throws SecurityException {
        final SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new s("DateTimeZone.setProvider"));
        }
        if (p == null) {
            p = p();
        }
        else {
            P(p);
        }
        i.K.set(p);
    }
    
    private static f P(final f f) {
        final Set<String> b = f.b();
        if (b == null || b.size() == 0) {
            throw new IllegalArgumentException("The provider doesn't have any available ids");
        }
        if (!b.contains("UTC")) {
            throw new IllegalArgumentException("The provider doesn't support UTC");
        }
        if (i.I.equals(f.a("UTC"))) {
            return f;
        }
        throw new IllegalArgumentException("Invalid UTC zone provided");
    }
    
    private static String d(final String str) {
        final StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < sb.length(); ++i) {
            final int digit = Character.digit(sb.charAt(i), 10);
            if (digit >= 0) {
                sb.setCharAt(i, (char)(digit + 48));
            }
        }
        return sb.toString();
    }
    
    private static i f(final String s, final int n) {
        if (n == 0) {
            return i.I;
        }
        return new d(s, null, n, n);
    }
    
    @FromString
    public static i g(final String str) {
        if (str == null) {
            return n();
        }
        if (str.equals("UTC")) {
            return i.I;
        }
        final i a = z().a(str);
        if (a != null) {
            return a;
        }
        if (!str.startsWith("+") && !str.startsWith("-")) {
            final StringBuilder sb = new StringBuilder();
            sb.append("The datetime zone id '");
            sb.append(str);
            sb.append("' is not recognised");
            throw new IllegalArgumentException(sb.toString());
        }
        final int i = I(str);
        if (i == 0L) {
            return org.joda.time.i.I;
        }
        return f(K(i), i);
    }
    
    public static i h(final int n) throws IllegalArgumentException {
        return i(n, 0);
    }
    
    public static i i(int h, final int i) throws IllegalArgumentException {
        if (h == 0 && i == 0) {
            return i.I;
        }
        if (h >= -23 && h <= 23) {
            if (i >= -59 && i <= 59) {
                if (h > 0 && i < 0) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Positive hours must not have negative minutes: ");
                    sb.append(i);
                    throw new IllegalArgumentException(sb.toString());
                }
                h *= 60;
                Label_0099: {
                    if (h >= 0) {
                        break Label_0099;
                    }
                    try {
                        h -= Math.abs(i);
                        while (true) {
                            h = j.h(h, 60000);
                            return j(h);
                            h += i;
                            continue;
                        }
                    }
                    catch (ArithmeticException ex) {
                        throw new IllegalArgumentException("Offset is too large");
                    }
                }
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Minutes out of range: ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        }
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("Hours out of range: ");
        sb3.append(h);
        throw new IllegalArgumentException(sb3.toString());
    }
    
    public static i j(final int i) {
        if (i >= -86399999 && i <= 86399999) {
            return f(K(i), i);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Millis out of range: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static i k(final TimeZone timeZone) {
        if (timeZone == null) {
            return n();
        }
        final String id = timeZone.getID();
        if (id == null) {
            throw new IllegalArgumentException("The TimeZone id must not be null");
        }
        if (id.equals("UTC")) {
            return i.I;
        }
        i a = null;
        final String m = m(id);
        final f z = z();
        if (m != null) {
            a = z.a(m);
        }
        i a2;
        if ((a2 = a) == null) {
            a2 = z.a(id);
        }
        if (a2 != null) {
            return a2;
        }
        if (m != null || (!id.startsWith("GMT+") && !id.startsWith("GMT-"))) {
            final StringBuilder sb = new StringBuilder();
            sb.append("The datetime zone id '");
            sb.append(id);
            sb.append("' is not recognised");
            throw new IllegalArgumentException(sb.toString());
        }
        String s2;
        final String s = s2 = id.substring(3);
        if (s.length() > 2) {
            final char char1 = s.charAt(1);
            s2 = s;
            if (char1 > '9') {
                s2 = s;
                if (Character.isDigit(char1)) {
                    s2 = d(s);
                }
            }
        }
        final int i = I(s2);
        if (i == 0L) {
            return org.joda.time.i.I;
        }
        return f(K(i), i);
    }
    
    public static Set<String> l() {
        return z().b();
    }
    
    private static String m(final String s) {
        return a.a.get(s);
    }
    
    public static i n() {
        i j;
        final i i = j = org.joda.time.i.M.get();
        if (i == null) {
            i g;
            try {
                final String property = System.getProperty("user.timezone");
                g = i;
                if (property != null) {
                    g = g(property);
                }
            }
            catch (RuntimeException ex) {
                g = i;
            }
            i k;
            if ((k = g) == null) {
                try {
                    k = k(TimeZone.getDefault());
                }
                catch (IllegalArgumentException ex2) {
                    k = g;
                }
            }
            i l;
            if ((l = k) == null) {
                l = org.joda.time.i.I;
            }
            final AtomicReference<i> m = org.joda.time.i.M;
            j = l;
            if (!m.compareAndSet(null, l)) {
                j = m.get();
            }
        }
        return j;
    }
    
    private static e o() {
        final e e = null;
        e e2 = null;
        Label_0117: {
            try {
                final String property = System.getProperty("org.joda.time.DateTimeZone.NameProvider");
                e2 = e;
                if (property != null) {
                    try {
                        final Class<?> forName = Class.forName(property, false, i.class.getClassLoader());
                        if (e.class.isAssignableFrom(forName)) {
                            e2 = (e)forName.asSubclass(e.class).getConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
                            break Label_0117;
                        }
                        final StringBuilder sb = new StringBuilder();
                        sb.append("System property referred to class that does not implement ");
                        sb.append(e.class);
                        throw new IllegalArgumentException(sb.toString());
                    }
                    catch (Exception cause) {
                        throw new RuntimeException(cause);
                    }
                }
            }
            catch (SecurityException ex) {
                e2 = e;
            }
        }
        e e3;
        if ((e3 = e2) == null) {
            e3 = new c();
        }
        return e3;
    }
    
    private static f p() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: invokestatic    java/lang/System.getProperty:(Ljava/lang/String;)Ljava/lang/String;
        //     6: astore_0       
        //     7: aload_0        
        //     8: ifnull          107
        //    11: aload_0        
        //    12: iconst_0       
        //    13: ldc             Lorg/joda/time/i;.class
        //    15: invokevirtual   java/lang/Class.getClassLoader:()Ljava/lang/ClassLoader;
        //    18: invokestatic    java/lang/Class.forName:(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
        //    21: astore_0       
        //    22: ldc             Lorg/joda/time/tz/f;.class
        //    24: aload_0        
        //    25: invokevirtual   java/lang/Class.isAssignableFrom:(Ljava/lang/Class;)Z
        //    28: ifeq            58
        //    31: aload_0        
        //    32: ldc             Lorg/joda/time/tz/f;.class
        //    34: invokevirtual   java/lang/Class.asSubclass:(Ljava/lang/Class;)Ljava/lang/Class;
        //    37: iconst_0       
        //    38: anewarray       Ljava/lang/Class;
        //    41: invokevirtual   java/lang/Class.getConstructor:([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
        //    44: iconst_0       
        //    45: anewarray       Ljava/lang/Object;
        //    48: invokevirtual   java/lang/reflect/Constructor.newInstance:([Ljava/lang/Object;)Ljava/lang/Object;
        //    51: checkcast       Lorg/joda/time/tz/f;
        //    54: invokestatic    org/joda/time/i.P:(Lorg/joda/time/tz/f;)Lorg/joda/time/tz/f;
        //    57: areturn        
        //    58: new             Ljava/lang/IllegalArgumentException;
        //    61: astore_1       
        //    62: new             Ljava/lang/StringBuilder;
        //    65: astore_0       
        //    66: aload_0        
        //    67: invokespecial   java/lang/StringBuilder.<init>:()V
        //    70: aload_0        
        //    71: ldc_w           "System property referred to class that does not implement "
        //    74: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    77: pop            
        //    78: aload_0        
        //    79: ldc             Lorg/joda/time/tz/f;.class
        //    81: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    84: pop            
        //    85: aload_1        
        //    86: aload_0        
        //    87: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    90: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //    93: aload_1        
        //    94: athrow         
        //    95: astore_0       
        //    96: new             Ljava/lang/RuntimeException;
        //    99: astore_1       
        //   100: aload_1        
        //   101: aload_0        
        //   102: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/Throwable;)V
        //   105: aload_1        
        //   106: athrow         
        //   107: ldc_w           "org.joda.time.DateTimeZone.Folder"
        //   110: invokestatic    java/lang/System.getProperty:(Ljava/lang/String;)Ljava/lang/String;
        //   113: astore_2       
        //   114: aload_2        
        //   115: ifnull          155
        //   118: new             Lorg/joda/time/tz/j;
        //   121: astore_1       
        //   122: new             Ljava/io/File;
        //   125: astore_0       
        //   126: aload_0        
        //   127: aload_2        
        //   128: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //   131: aload_1        
        //   132: aload_0        
        //   133: invokespecial   org/joda/time/tz/j.<init>:(Ljava/io/File;)V
        //   136: aload_1        
        //   137: invokestatic    org/joda/time/i.P:(Lorg/joda/time/tz/f;)Lorg/joda/time/tz/f;
        //   140: astore_0       
        //   141: aload_0        
        //   142: areturn        
        //   143: astore_1       
        //   144: new             Ljava/lang/RuntimeException;
        //   147: astore_0       
        //   148: aload_0        
        //   149: aload_1        
        //   150: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/Throwable;)V
        //   153: aload_0        
        //   154: athrow         
        //   155: new             Lorg/joda/time/tz/j;
        //   158: astore_0       
        //   159: aload_0        
        //   160: ldc             "org/joda/time/tz/data"
        //   162: invokespecial   org/joda/time/tz/j.<init>:(Ljava/lang/String;)V
        //   165: aload_0        
        //   166: invokestatic    org/joda/time/i.P:(Lorg/joda/time/tz/f;)Lorg/joda/time/tz/f;
        //   169: astore_0       
        //   170: aload_0        
        //   171: areturn        
        //   172: astore_0       
        //   173: aload_0        
        //   174: invokevirtual   java/lang/Exception.printStackTrace:()V
        //   177: new             Lorg/joda/time/tz/g;
        //   180: dup            
        //   181: invokespecial   org/joda/time/tz/g.<init>:()V
        //   184: areturn        
        //   185: astore_0       
        //   186: goto            107
        //   189: astore_0       
        //   190: goto            155
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                         
        //  -----  -----  -----  -----  -----------------------------
        //  0      7      185    189    Ljava/lang/SecurityException;
        //  11     58     95     107    Ljava/lang/Exception;
        //  58     95     95     107    Ljava/lang/Exception;
        //  96     107    185    189    Ljava/lang/SecurityException;
        //  107    114    189    193    Ljava/lang/SecurityException;
        //  118    141    143    155    Ljava/lang/Exception;
        //  144    155    189    193    Ljava/lang/SecurityException;
        //  155    170    172    185    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0107:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static e v() {
        final AtomicReference<e> l = i.L;
        e o;
        if ((o = l.get()) == null && !l.compareAndSet(null, o = o())) {
            o = l.get();
        }
        return o;
    }
    
    public static f z() {
        final AtomicReference<f> k = i.K;
        f p;
        if ((p = k.get()) == null && !k.compareAndSet(null, p = p())) {
            p = k.get();
        }
        return p;
    }
    
    public final String B(final long n) {
        return this.C(n, null);
    }
    
    public String C(final long n, final Locale locale) {
        Locale default1 = locale;
        if (locale == null) {
            default1 = Locale.getDefault();
        }
        final String u = this.u(n);
        if (u == null) {
            return this.G;
        }
        final e v = v();
        String s;
        if (v instanceof c) {
            s = ((c)v).g(default1, this.G, u, this.G(n));
        }
        else {
            s = v.b(default1, this.G, u);
        }
        if (s != null) {
            return s;
        }
        return K(this.w(n));
    }
    
    public abstract int D(final long p0);
    
    public abstract boolean E();
    
    public boolean F(final u u) {
        if (this.E()) {
            return false;
        }
        try {
            u.S0(this);
            return false;
        }
        catch (p p) {
            return true;
        }
    }
    
    public boolean G(final long n) {
        return this.w(n) == this.D(n);
    }
    
    public abstract long H(final long p0);
    
    public abstract long J(final long p0);
    
    public TimeZone O() {
        return TimeZone.getTimeZone(this.G);
    }
    
    protected Object Q() throws ObjectStreamException {
        return new b(this.G);
    }
    
    public long a(long n, final boolean b) {
        final long n2 = n - 10800000L;
        final long n3 = this.w(n2);
        final long n4 = this.w(10800000L + n);
        if (n3 <= n4) {
            return n;
        }
        final long n5 = n3 - n4;
        final long h = this.H(n2);
        final long n6 = h - n5;
        long n7 = n;
        if (n >= n6) {
            if (n >= h + n5) {
                n7 = n;
            }
            else {
                if (n - n6 >= n5) {
                    if (!b) {
                        n -= n5;
                    }
                    return n;
                }
                n7 = n;
                if (b) {
                    n7 = n + n5;
                }
            }
        }
        return n7;
    }
    
    public long b(final long n, final boolean b) {
        final int w = this.w(n);
        final long n2 = n - w;
        int w2 = this.w(n2);
        if (w != w2 && (b || w < 0)) {
            final long h = this.H(n2);
            long n3 = Long.MAX_VALUE;
            long n4 = h;
            if (h == n2) {
                n4 = Long.MAX_VALUE;
            }
            final long n5 = n - w2;
            final long h2 = this.H(n5);
            if (h2 != n5) {
                n3 = h2;
            }
            if (n4 != n3) {
                if (b) {
                    throw new p(n, this.q());
                }
                w2 = w;
            }
        }
        final long n6 = w2;
        final long n7 = n - n6;
        if ((n ^ n7) < 0L && (n ^ n6) < 0L) {
            throw new ArithmeticException("Subtracting time zone offset caused overflow");
        }
        return n7;
    }
    
    public long c(final long n, final boolean b, long n2) {
        final int w = this.w(n2);
        n2 = n - w;
        if (this.w(n2) == w) {
            return n2;
        }
        return this.b(n, b);
    }
    
    public long e(final long n) {
        final long n2 = this.w(n);
        final long n3 = n + n2;
        if ((n ^ n3) < 0L && (n ^ n2) >= 0L) {
            throw new ArithmeticException("Adding time zone offset caused overflow");
        }
        return n3;
    }
    
    @Override
    public abstract boolean equals(final Object p0);
    
    @Override
    public int hashCode() {
        return this.q().hashCode() + 57;
    }
    
    @ToString
    public final String q() {
        return this.G;
    }
    
    public long r(final i i, final long n) {
        i n2 = i;
        if (i == null) {
            n2 = n();
        }
        if (n2 == this) {
            return n;
        }
        return n2.c(this.e(n), false, n);
    }
    
    public final String s(final long n) {
        return this.t(n, null);
    }
    
    public String t(final long n, final Locale locale) {
        Locale default1 = locale;
        if (locale == null) {
            default1 = Locale.getDefault();
        }
        final String u = this.u(n);
        if (u == null) {
            return this.G;
        }
        final e v = v();
        String s;
        if (v instanceof c) {
            s = ((c)v).d(default1, this.G, u, this.G(n));
        }
        else {
            s = v.a(default1, this.G, u);
        }
        if (s != null) {
            return s;
        }
        return K(this.w(n));
    }
    
    @Override
    public String toString() {
        return this.q();
    }
    
    public abstract String u(final long p0);
    
    public abstract int w(final long p0);
    
    public final int x(final l0 l0) {
        long n;
        if (l0 == null) {
            n = h.c();
        }
        else {
            n = l0.n();
        }
        return this.w(n);
    }
    
    public int y(long n) {
        final int w = this.w(n);
        final long n2 = n - w;
        final int w2 = this.w(n2);
        if (w != w2) {
            if (w - w2 < 0) {
                final long h = this.H(n2);
                final long n3 = Long.MAX_VALUE;
                long n4 = h;
                if (h == n2) {
                    n4 = Long.MAX_VALUE;
                }
                final long n5 = n - w2;
                n = this.H(n5);
                if (n == n5) {
                    n = n3;
                }
                if (n4 != n) {
                    return w;
                }
            }
        }
        else if (w >= 0) {
            n = this.J(n2);
            if (n < n2) {
                final int w3 = this.w(n);
                if (n2 - n <= w3 - w) {
                    return w3;
                }
            }
        }
        return w2;
    }
    
    static final class a
    {
        static final Map<String, String> a;
        static final org.joda.time.format.b b;
        
        static {
            a = b();
            b = a();
        }
        
        private static org.joda.time.format.b a() {
            return new org.joda.time.format.c().V(null, true, 2, 4).u0().N(new org.joda.time.chrono.b() {
                private static final long H = -3128740902654445468L;
                
                @Override
                public a R() {
                    return this;
                }
                
                @Override
                public a S(final i i) {
                    return this;
                }
                
                @Override
                public i s() {
                    return null;
                }
                
                @Override
                public String toString() {
                    return i$a$a.class.getName();
                }
            });
        }
        
        private static Map<String, String> b() {
            final HashMap<String, String> m = new HashMap<String, String>();
            m.put("GMT", "UTC");
            m.put("WET", "WET");
            m.put("CET", "CET");
            m.put("MET", "CET");
            m.put("ECT", "CET");
            m.put("EET", "EET");
            m.put("MIT", "Pacific/Apia");
            m.put("HST", "Pacific/Honolulu");
            m.put("AST", "America/Anchorage");
            m.put("PST", "America/Los_Angeles");
            m.put("MST", "America/Denver");
            m.put("PNT", "America/Phoenix");
            m.put("CST", "America/Chicago");
            m.put("EST", "America/New_York");
            m.put("IET", "America/Indiana/Indianapolis");
            m.put("PRT", "America/Puerto_Rico");
            m.put("CNT", "America/St_Johns");
            m.put("AGT", "America/Argentina/Buenos_Aires");
            m.put("BET", "America/Sao_Paulo");
            m.put("ART", "Africa/Cairo");
            m.put("CAT", "Africa/Harare");
            m.put("EAT", "Africa/Addis_Ababa");
            m.put("NET", "Asia/Yerevan");
            m.put("PLT", "Asia/Karachi");
            m.put("IST", "Asia/Kolkata");
            m.put("BST", "Asia/Dhaka");
            m.put("VST", "Asia/Ho_Chi_Minh");
            m.put("CTT", "Asia/Shanghai");
            m.put("JST", "Asia/Tokyo");
            m.put("ACT", "Australia/Darwin");
            m.put("AET", "Australia/Sydney");
            m.put("SST", "Pacific/Guadalcanal");
            m.put("NST", "Pacific/Auckland");
            return (Map<String, String>)Collections.unmodifiableMap((Map<?, ?>)m);
        }
    }
    
    private static final class b implements Serializable
    {
        private static final long H = -6471952376487863581L;
        private transient String G;
        
        b(final String g) {
            this.G = g;
        }
        
        private void a(final ObjectInputStream objectInputStream) throws IOException {
            this.G = objectInputStream.readUTF();
        }
        
        private Object b() throws ObjectStreamException {
            return i.g(this.G);
        }
        
        private void c(final ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.writeUTF(this.G);
        }
    }
}
