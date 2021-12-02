// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.codec.digest;

import java.security.NoSuchAlgorithmException;
import java.nio.file.Files;
import java.nio.channels.FileChannel;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.ByteBuffer;
import java.io.RandomAccessFile;
import java.io.File;
import org.apache.commons.codec.binary.m;
import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.codec.binary.l;
import java.security.MessageDigest;

public class c
{
    private static final int b = 1024;
    private final MessageDigest a;
    
    @Deprecated
    public c() {
        this.a = null;
    }
    
    public c(final String s) {
        this(s(s));
    }
    
    public c(final MessageDigest a) {
        this.a = a;
    }
    
    public static MessageDigest A() {
        return s("SHA3-224");
    }
    
    public static String A0(final String s) {
        return l.s(x0(s));
    }
    
    public static MessageDigest B() {
        return s("SHA3-256");
    }
    
    public static String B0(final byte[] array) {
        return l.s(y0(array));
    }
    
    public static MessageDigest C() {
        return s("SHA3-384");
    }
    
    public static byte[] C0(final InputStream inputStream) throws IOException {
        return g(C(), inputStream);
    }
    
    public static MessageDigest D() {
        return s("SHA3-512");
    }
    
    public static byte[] D0(final String s) {
        return E0(m.k(s));
    }
    
    public static MessageDigest E() {
        return s("SHA-512");
    }
    
    public static byte[] E0(final byte[] input) {
        return C().digest(input);
    }
    
    public static MessageDigest F() {
        return s("SHA-512/224");
    }
    
    public static String F0(final InputStream inputStream) throws IOException {
        return l.s(C0(inputStream));
    }
    
    public static MessageDigest G() {
        return s("SHA-512/256");
    }
    
    public static String G0(final String s) {
        return l.s(D0(s));
    }
    
    @Deprecated
    public static MessageDigest H() {
        return x();
    }
    
    public static String H0(final byte[] array) {
        return l.s(E0(array));
    }
    
    public static boolean I(final String s) {
        return t(s, null) != null;
    }
    
    public static byte[] I0(final InputStream inputStream) throws IOException {
        return g(D(), inputStream);
    }
    
    public static byte[] J(final InputStream inputStream) throws IOException {
        return g(u(), inputStream);
    }
    
    public static byte[] J0(final String s) {
        return K0(m.k(s));
    }
    
    public static byte[] K(final String s) {
        return L(m.k(s));
    }
    
    public static byte[] K0(final byte[] input) {
        return D().digest(input);
    }
    
    public static byte[] L(final byte[] input) {
        return u().digest(input);
    }
    
    public static String L0(final InputStream inputStream) throws IOException {
        return l.s(I0(inputStream));
    }
    
    public static String M(final InputStream inputStream) throws IOException {
        return l.s(J(inputStream));
    }
    
    public static String M0(final String s) {
        return l.s(J0(s));
    }
    
    public static String N(final String s) {
        return l.s(K(s));
    }
    
    public static String N0(final byte[] array) {
        return l.s(K0(array));
    }
    
    public static String O(final byte[] array) {
        return l.s(L(array));
    }
    
    public static byte[] O0(final InputStream inputStream) throws IOException {
        return g(E(), inputStream);
    }
    
    public static byte[] P(final InputStream inputStream) throws IOException {
        return g(v(), inputStream);
    }
    
    public static byte[] P0(final String s) {
        return Q0(m.k(s));
    }
    
    public static byte[] Q(final String s) {
        return R(m.k(s));
    }
    
    public static byte[] Q0(final byte[] input) {
        return E().digest(input);
    }
    
    public static byte[] R(final byte[] input) {
        return v().digest(input);
    }
    
    public static String R0(final InputStream inputStream) throws IOException {
        return l.s(O0(inputStream));
    }
    
    public static String S(final InputStream inputStream) throws IOException {
        return l.s(P(inputStream));
    }
    
    public static String S0(final String s) {
        return l.s(P0(s));
    }
    
    public static String T(final String s) {
        return l.s(Q(s));
    }
    
    public static String T0(final byte[] array) {
        return l.s(Q0(array));
    }
    
    public static String U(final byte[] array) {
        return l.s(R(array));
    }
    
    public static byte[] U0(final InputStream inputStream) throws IOException {
        return g(F(), inputStream);
    }
    
    @Deprecated
    public static byte[] V(final InputStream inputStream) throws IOException {
        return Y(inputStream);
    }
    
    public static byte[] V0(final String s) {
        return W0(m.k(s));
    }
    
    @Deprecated
    public static byte[] W(final String s) {
        return Z(s);
    }
    
    public static byte[] W0(final byte[] input) {
        return F().digest(input);
    }
    
    @Deprecated
    public static byte[] X(final byte[] array) {
        return a0(array);
    }
    
    public static String X0(final InputStream inputStream) throws IOException {
        return l.s(U0(inputStream));
    }
    
    public static byte[] Y(final InputStream inputStream) throws IOException {
        return g(x(), inputStream);
    }
    
    public static String Y0(final String s) {
        return l.s(V0(s));
    }
    
    public static byte[] Z(final String s) {
        return a0(m.k(s));
    }
    
    public static String Z0(final byte[] array) {
        return l.s(W0(array));
    }
    
    public static byte[] a0(final byte[] input) {
        return x().digest(input);
    }
    
    public static byte[] a1(final InputStream inputStream) throws IOException {
        return g(G(), inputStream);
    }
    
    public static String b0(final InputStream inputStream) throws IOException {
        return l.s(Y(inputStream));
    }
    
    public static byte[] b1(final String s) {
        return c1(m.k(s));
    }
    
    public static String c0(final String s) {
        return l.s(Z(s));
    }
    
    public static byte[] c1(final byte[] input) {
        return G().digest(input);
    }
    
    public static String d0(final byte[] array) {
        return l.s(a0(array));
    }
    
    public static String d1(final InputStream inputStream) throws IOException {
        return l.s(a1(inputStream));
    }
    
    public static byte[] e0(final InputStream inputStream) throws IOException {
        return g(y(), inputStream);
    }
    
    public static String e1(final String s) {
        return l.s(b1(s));
    }
    
    public static byte[] f(final MessageDigest messageDigest, final File file) throws IOException {
        return j1(messageDigest, file).digest();
    }
    
    public static byte[] f0(final String s) {
        return g0(m.k(s));
    }
    
    public static String f1(final byte[] array) {
        return l.s(c1(array));
    }
    
    public static byte[] g(final MessageDigest messageDigest, final InputStream inputStream) throws IOException {
        return k1(messageDigest, inputStream).digest();
    }
    
    public static byte[] g0(final byte[] input) {
        return y().digest(input);
    }
    
    @Deprecated
    public static String g1(final InputStream inputStream) throws IOException {
        return b0(inputStream);
    }
    
    public static byte[] h(final MessageDigest messageDigest, final RandomAccessFile randomAccessFile) throws IOException {
        return l1(messageDigest, randomAccessFile).digest();
    }
    
    public static String h0(final InputStream inputStream) throws IOException {
        return l.s(e0(inputStream));
    }
    
    @Deprecated
    public static String h1(final String s) {
        return c0(s);
    }
    
    public static byte[] i(final MessageDigest messageDigest, final ByteBuffer input) {
        messageDigest.update(input);
        return messageDigest.digest();
    }
    
    public static String i0(final String s) {
        return l.s(f0(s));
    }
    
    @Deprecated
    public static String i1(final byte[] array) {
        return d0(array);
    }
    
    public static byte[] j(final MessageDigest messageDigest, final Path path, final OpenOption... array) throws IOException {
        return p1(messageDigest, path, array).digest();
    }
    
    public static String j0(final byte[] array) {
        return l.s(g0(array));
    }
    
    public static MessageDigest j1(MessageDigest k1, File file) throws IOException {
        file = (File)new BufferedInputStream(new FileInputStream(file));
        try {
            k1 = k1(k1, (InputStream)file);
            ((BufferedInputStream)file).close();
            return k1;
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
    
    public static byte[] k(final MessageDigest messageDigest, final byte[] input) {
        return messageDigest.digest(input);
    }
    
    public static byte[] k0(final InputStream inputStream) throws IOException {
        return g(z(), inputStream);
    }
    
    public static MessageDigest k1(final MessageDigest messageDigest, final InputStream inputStream) throws IOException {
        final byte[] array = new byte[1024];
        while (true) {
            final int read = inputStream.read(array, 0, 1024);
            if (read <= -1) {
                break;
            }
            messageDigest.update(array, 0, read);
        }
        return messageDigest;
    }
    
    public static byte[] l0(final String s) {
        return m0(m.k(s));
    }
    
    public static MessageDigest l1(final MessageDigest messageDigest, final RandomAccessFile randomAccessFile) throws IOException {
        return o1(messageDigest, randomAccessFile.getChannel());
    }
    
    public static byte[] m0(final byte[] input) {
        return z().digest(input);
    }
    
    public static MessageDigest m1(final MessageDigest messageDigest, final String s) {
        messageDigest.update(m.k(s));
        return messageDigest;
    }
    
    public static String n0(final InputStream inputStream) throws IOException {
        return l.s(k0(inputStream));
    }
    
    public static MessageDigest n1(final MessageDigest messageDigest, final ByteBuffer input) {
        messageDigest.update(input);
        return messageDigest;
    }
    
    public static String o0(final String s) {
        return l.s(l0(s));
    }
    
    private static MessageDigest o1(final MessageDigest messageDigest, final FileChannel fileChannel) throws IOException {
        final ByteBuffer allocate = ByteBuffer.allocate(1024);
        while (fileChannel.read(allocate) > 0) {
            allocate.flip();
            messageDigest.update(allocate);
            allocate.clear();
        }
        return messageDigest;
    }
    
    public static String p0(final byte[] array) {
        return l.s(m0(array));
    }
    
    public static MessageDigest p1(MessageDigest k1, Path path, final OpenOption... options) throws IOException {
        path = (Path)new BufferedInputStream(Files.newInputStream(path, options));
        try {
            k1 = k1(k1, (InputStream)path);
            ((BufferedInputStream)path).close();
            return k1;
        }
        finally {
            try {}
            finally {
                try {
                    ((BufferedInputStream)path).close();
                }
                finally {
                    final Throwable exception;
                    ((Throwable)(Object)options).addSuppressed(exception);
                }
            }
        }
    }
    
    public static byte[] q0(final InputStream inputStream) throws IOException {
        return g(A(), inputStream);
    }
    
    public static MessageDigest q1(final MessageDigest messageDigest, final byte[] input) {
        messageDigest.update(input);
        return messageDigest;
    }
    
    public static byte[] r0(final String s) {
        return s0(m.k(s));
    }
    
    public static MessageDigest s(final String algorithm) {
        try {
            return MessageDigest.getInstance(algorithm);
        }
        catch (NoSuchAlgorithmException cause) {
            throw new IllegalArgumentException(cause);
        }
    }
    
    public static byte[] s0(final byte[] input) {
        return A().digest(input);
    }
    
    public static MessageDigest t(final String algorithm, final MessageDigest messageDigest) {
        try {
            return MessageDigest.getInstance(algorithm);
        }
        catch (Exception ex) {
            return messageDigest;
        }
    }
    
    public static String t0(final InputStream inputStream) throws IOException {
        return l.s(q0(inputStream));
    }
    
    public static MessageDigest u() {
        return s("MD2");
    }
    
    public static String u0(final String s) {
        return l.s(r0(s));
    }
    
    public static MessageDigest v() {
        return s("MD5");
    }
    
    public static String v0(final byte[] array) {
        return l.s(s0(array));
    }
    
    public static byte[] w0(final InputStream inputStream) throws IOException {
        return g(B(), inputStream);
    }
    
    public static MessageDigest x() {
        return s("SHA-1");
    }
    
    public static byte[] x0(final String s) {
        return y0(m.k(s));
    }
    
    public static MessageDigest y() {
        return s("SHA-256");
    }
    
    public static byte[] y0(final byte[] input) {
        return B().digest(input);
    }
    
    public static MessageDigest z() {
        return s("SHA-384");
    }
    
    public static String z0(final InputStream inputStream) throws IOException {
        return l.s(w0(inputStream));
    }
    
    public byte[] a(final File file) throws IOException {
        return j1(this.a, file).digest();
    }
    
    public byte[] b(final InputStream inputStream) throws IOException {
        return k1(this.a, inputStream).digest();
    }
    
    public byte[] c(final String s) {
        return m1(this.a, s).digest();
    }
    
    public byte[] d(final ByteBuffer byteBuffer) {
        return n1(this.a, byteBuffer).digest();
    }
    
    public byte[] e(final Path path, final OpenOption... array) throws IOException {
        return p1(this.a, path, array).digest();
    }
    
    public byte[] l(final byte[] array) {
        return q1(this.a, array).digest();
    }
    
    public String m(final File file) throws IOException {
        return l.s(this.a(file));
    }
    
    public String n(final InputStream inputStream) throws IOException {
        return l.s(this.b(inputStream));
    }
    
    public String o(final String s) {
        return l.s(this.c(s));
    }
    
    public String p(final ByteBuffer byteBuffer) {
        return l.s(this.d(byteBuffer));
    }
    
    public String q(final Path path, final OpenOption... array) throws IOException {
        return l.s(this.e(path, array));
    }
    
    public String r(final byte[] array) {
        return l.s(this.l(array));
    }
    
    public MessageDigest w() {
        return this.a;
    }
}
