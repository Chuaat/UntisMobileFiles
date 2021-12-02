// 
// Decompiled by Procyon v0.5.36
// 

package d7;

import java.util.Arrays;
import java.nio.charset.Charset;
import java.io.File;
import org.apache.commons.codec.digest.g;
import java.util.Locale;
import java.security.MessageDigest;
import org.apache.commons.codec.digest.c;
import java.io.PrintStream;
import org.apache.commons.codec.binary.l;
import java.io.IOException;

public class a
{
    private final String a;
    private final String[] b;
    private final String[] c;
    
    private a(final String[] b) {
        if (b == null) {
            throw new IllegalArgumentException("args");
        }
        if (b.length != 0) {
            this.b = b;
            this.a = b[0];
            if (b.length <= 1) {
                this.c = null;
            }
            else {
                final String[] c = new String[b.length - 1];
                System.arraycopy(b, 1, this.c = c, 0, c.length);
            }
            return;
        }
        throw new IllegalArgumentException(String.format("Usage: java %s [algorithm] [FILE|DIRECTORY|string] ...", a.class.getName()));
    }
    
    public static void a(final String[] array) throws IOException {
        new a(array).d();
    }
    
    private void b(final String s, final byte[] array) {
        this.c(s, array, null);
    }
    
    private void c(String string, final byte[] array, final String str) {
        final PrintStream out = System.out;
        final StringBuilder sb = new StringBuilder();
        sb.append(string);
        sb.append(l.s(array));
        if (str != null) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("  ");
            sb2.append(str);
            string = sb2.toString();
        }
        else {
            string = "";
        }
        sb.append(string);
        out.println(sb.toString());
    }
    
    private void d() throws IOException {
        if (!this.a.equalsIgnoreCase("ALL") && !this.a.equals("*")) {
            MessageDigest messageDigest = org.apache.commons.codec.digest.c.t(this.a, null);
            if (messageDigest == null) {
                messageDigest = org.apache.commons.codec.digest.c.s(this.a.toUpperCase(Locale.ROOT));
            }
            this.f("", messageDigest);
            return;
        }
        this.h(g.a());
    }
    
    private void e(final String s, final String s2) throws IOException {
        this.f(s, org.apache.commons.codec.digest.c.s(s2));
    }
    
    private void f(final String s, final MessageDigest messageDigest) throws IOException {
        final String[] c = this.c;
        if (c == null) {
            this.b(s, org.apache.commons.codec.digest.c.g(messageDigest, System.in));
            return;
        }
        for (final String pathname : c) {
            final File file = new File(pathname);
            if (file.isFile()) {
                this.c(s, org.apache.commons.codec.digest.c.f(messageDigest, file), pathname);
            }
            else if (file.isDirectory()) {
                final File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    this.g(s, messageDigest, listFiles);
                }
            }
            else {
                this.b(s, org.apache.commons.codec.digest.c.k(messageDigest, pathname.getBytes(Charset.defaultCharset())));
            }
        }
    }
    
    private void g(final String s, final MessageDigest messageDigest, final File[] array) throws IOException {
        for (final File file : array) {
            if (file.isFile()) {
                this.c(s, org.apache.commons.codec.digest.c.f(messageDigest, file), file.getName());
            }
        }
    }
    
    private void h(final String[] array) throws IOException {
        for (final String str : array) {
            if (org.apache.commons.codec.digest.c.I(str)) {
                final StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" ");
                this.e(sb.toString(), str);
            }
        }
    }
    
    @Override
    public String toString() {
        return String.format("%s %s", super.toString(), Arrays.toString(this.b));
    }
}
