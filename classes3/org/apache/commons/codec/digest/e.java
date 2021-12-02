// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.codec.digest;

import org.apache.commons.codec.binary.l;
import java.nio.ByteBuffer;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.File;
import java.security.InvalidKeyException;
import java.security.Key;
import javax.crypto.spec.SecretKeySpec;
import java.security.NoSuchAlgorithmException;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.codec.binary.m;
import javax.crypto.Mac;

public final class e
{
    private static final int b = 1024;
    private final Mac a;
    
    @Deprecated
    public e() {
        this(null);
    }
    
    public e(final String s, final String s2) {
        this(s, m.k(s2));
    }
    
    public e(final String s, final byte[] array) {
        this(f(s, array));
    }
    
    private e(final Mac a) {
        this.a = a;
    }
    
    public e(final d d, final String s) {
        this(d.b(), m.k(s));
    }
    
    public e(final d d, final byte[] array) {
        this(d.b(), array);
    }
    
    @Deprecated
    public static String A(final String s, final String s2) {
        return new e(d.I, s).o(s2);
    }
    
    @Deprecated
    public static String B(final byte[] array, final InputStream inputStream) throws IOException {
        return new e(d.I, array).n(inputStream);
    }
    
    @Deprecated
    public static String C(final byte[] array, final byte[] array2) {
        return new e(d.I, array).q(array2);
    }
    
    @Deprecated
    public static byte[] D(final String s, final String s2) {
        return new e(d.K, s).j(s2);
    }
    
    @Deprecated
    public static byte[] E(final byte[] array, final InputStream inputStream) throws IOException {
        return new e(d.K, array).i(inputStream);
    }
    
    @Deprecated
    public static byte[] F(final byte[] array, final byte[] array2) {
        return new e(d.K, array).l(array2);
    }
    
    @Deprecated
    public static String G(final String s, final String s2) {
        return new e(d.K, s).o(s2);
    }
    
    @Deprecated
    public static String H(final byte[] array, final InputStream inputStream) throws IOException {
        return new e(d.K, array).n(inputStream);
    }
    
    @Deprecated
    public static String I(final byte[] array, final byte[] array2) {
        return new e(d.K, array).q(array2);
    }
    
    @Deprecated
    public static byte[] J(final String s, final String s2) {
        return new e(d.L, s).j(s2);
    }
    
    @Deprecated
    public static byte[] K(final byte[] array, final InputStream inputStream) throws IOException {
        return new e(d.L, array).i(inputStream);
    }
    
    @Deprecated
    public static byte[] L(final byte[] array, final byte[] array2) {
        return new e(d.L, array).l(array2);
    }
    
    @Deprecated
    public static String M(final String s, final String s2) {
        return new e(d.L, s).o(s2);
    }
    
    @Deprecated
    public static String N(final byte[] array, final InputStream inputStream) throws IOException {
        return new e(d.L, array).n(inputStream);
    }
    
    @Deprecated
    public static String O(final byte[] array, final byte[] array2) {
        return new e(d.L, array).q(array2);
    }
    
    @Deprecated
    public static byte[] P(final String s, final String s2) {
        return new e(d.M, s).j(s2);
    }
    
    @Deprecated
    public static byte[] Q(final byte[] array, final InputStream inputStream) throws IOException {
        return new e(d.M, array).i(inputStream);
    }
    
    @Deprecated
    public static byte[] R(final byte[] array, final byte[] array2) {
        return new e(d.M, array).l(array2);
    }
    
    @Deprecated
    public static String S(final String s, final String s2) {
        return new e(d.M, s).o(s2);
    }
    
    @Deprecated
    public static String T(final byte[] array, final InputStream inputStream) throws IOException {
        return new e(d.M, array).n(inputStream);
    }
    
    @Deprecated
    public static String U(final byte[] array, final byte[] array2) {
        return new e(d.M, array).q(array2);
    }
    
    public static boolean V(final String algorithm) {
        try {
            Mac.getInstance(algorithm);
            return true;
        }
        catch (NoSuchAlgorithmException ex) {
            return false;
        }
    }
    
    public static boolean W(final d d) {
        try {
            Mac.getInstance(d.b());
            return true;
        }
        catch (NoSuchAlgorithmException ex) {
            return false;
        }
    }
    
    public static Mac X(final Mac mac, final InputStream inputStream) throws IOException {
        mac.reset();
        final byte[] array = new byte[1024];
        while (true) {
            final int read = inputStream.read(array, 0, 1024);
            if (read <= -1) {
                break;
            }
            mac.update(array, 0, read);
        }
        return mac;
    }
    
    public static Mac Y(final Mac mac, final String s) {
        mac.reset();
        mac.update(m.k(s));
        return mac;
    }
    
    public static Mac Z(final Mac mac, final byte[] input) {
        mac.reset();
        mac.update(input);
        return mac;
    }
    
    @Deprecated
    public static Mac a(final byte[] array) {
        return g(d.H, array);
    }
    
    @Deprecated
    public static Mac b(final byte[] array) {
        return g(d.I, array);
    }
    
    @Deprecated
    public static Mac c(final byte[] array) {
        return g(d.K, array);
    }
    
    @Deprecated
    public static Mac d(final byte[] array) {
        return g(d.L, array);
    }
    
    @Deprecated
    public static Mac e(final byte[] array) {
        return g(d.M, array);
    }
    
    public static Mac f(final String s, final byte[] key) {
        if (key != null) {
            try {
                final SecretKeySpec key2 = new SecretKeySpec(key, s);
                final Mac instance = Mac.getInstance(s);
                instance.init(key2);
                return instance;
            }
            catch (InvalidKeyException cause) {
                throw new IllegalArgumentException(cause);
            }
            catch (NoSuchAlgorithmException cause2) {
                throw new IllegalArgumentException(cause2);
            }
        }
        throw new IllegalArgumentException("Null key");
    }
    
    public static Mac g(final d d, final byte[] array) {
        return f(d.b(), array);
    }
    
    @Deprecated
    public static byte[] r(final String s, final String s2) {
        return new e(d.H, s).j(s2);
    }
    
    @Deprecated
    public static byte[] s(final byte[] array, final InputStream inputStream) throws IOException {
        return new e(d.H, array).i(inputStream);
    }
    
    @Deprecated
    public static byte[] t(final byte[] array, final byte[] array2) {
        return new e(d.H, array).l(array2);
    }
    
    @Deprecated
    public static String u(final String s, final String s2) {
        return new e(d.H, s).o(s2);
    }
    
    @Deprecated
    public static String v(final byte[] array, final InputStream inputStream) throws IOException {
        return new e(d.H, array).n(inputStream);
    }
    
    @Deprecated
    public static String w(final byte[] array, final byte[] array2) {
        return new e(d.H, array).q(array2);
    }
    
    @Deprecated
    public static byte[] x(final String s, final String s2) {
        return new e(d.I, s).j(s2);
    }
    
    @Deprecated
    public static byte[] y(final byte[] array, final InputStream inputStream) throws IOException {
        return new e(d.I, array).i(inputStream);
    }
    
    @Deprecated
    public static byte[] z(final byte[] array, final byte[] array2) {
        return new e(d.I, array).l(array2);
    }
    
    public byte[] h(File file) throws IOException {
        file = (File)new BufferedInputStream(new FileInputStream(file));
        try {
            final byte[] i = this.i((InputStream)file);
            ((BufferedInputStream)file).close();
            return i;
        }
        finally {
            try {}
            finally {
                try {
                    ((BufferedInputStream)file).close();
                }
                finally {
                    final Throwable t;
                    final Throwable exception;
                    t.addSuppressed(exception);
                }
            }
        }
    }
    
    public byte[] i(final InputStream inputStream) throws IOException {
        final byte[] array = new byte[1024];
        while (true) {
            final int read = inputStream.read(array, 0, 1024);
            if (read <= -1) {
                break;
            }
            this.a.update(array, 0, read);
        }
        return this.a.doFinal();
    }
    
    public byte[] j(final String s) {
        return this.a.doFinal(m.k(s));
    }
    
    public byte[] k(final ByteBuffer input) {
        this.a.update(input);
        return this.a.doFinal();
    }
    
    public byte[] l(final byte[] input) {
        return this.a.doFinal(input);
    }
    
    public String m(final File file) throws IOException {
        return l.s(this.h(file));
    }
    
    public String n(final InputStream inputStream) throws IOException {
        return l.s(this.i(inputStream));
    }
    
    public String o(final String s) {
        return l.s(this.j(s));
    }
    
    public String p(final ByteBuffer byteBuffer) {
        return l.s(this.k(byteBuffer));
    }
    
    public String q(final byte[] array) {
        return l.s(this.l(array));
    }
}
