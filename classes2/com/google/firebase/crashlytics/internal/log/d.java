// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.log;

import java.io.Closeable;
import com.google.firebase.crashlytics.internal.common.g;
import java.io.InputStream;
import java.io.IOException;
import com.google.firebase.crashlytics.internal.f;
import java.util.Locale;
import java.io.File;
import java.nio.charset.Charset;

class d implements a
{
    private static final Charset d;
    private final File a;
    private final int b;
    private c c;
    
    static {
        d = Charset.forName("UTF-8");
    }
    
    d(final File a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    private void f(final long l, String s) {
        if (this.c == null) {
            return;
        }
        String s2;
        if ((s2 = s) == null) {
            s2 = "null";
        }
        try {
            final int n = this.b / 4;
            s = s2;
            if (s2.length() > n) {
                final StringBuilder sb = new StringBuilder();
                sb.append("...");
                sb.append(s2.substring(s2.length() - n));
                s = sb.toString();
            }
            s = s.replaceAll("\r", " ").replaceAll("\n", " ");
            this.c.e(String.format(Locale.US, "%d %s%n", l, s).getBytes(com.google.firebase.crashlytics.internal.log.d.d));
            while (!this.c.o() && this.c.K() > this.b) {
                this.c.D();
            }
        }
        catch (IOException ex) {
            f.f().e("There was a problem writing to the Crashlytics log.", (Throwable)ex);
        }
    }
    
    private b g() {
        if (!this.a.exists()) {
            return null;
        }
        this.h();
        final c c = this.c;
        if (c == null) {
            return null;
        }
        final int[] array = { 0 };
        final byte[] array2 = new byte[c.K()];
        try {
            this.c.j((c.d)new c.d() {
                @Override
                public void i(final InputStream inputStream, final int len) throws IOException {
                    try {
                        inputStream.read(array2, array[0], len);
                        final int[] b = array;
                        b[0] += len;
                    }
                    finally {
                        inputStream.close();
                    }
                }
            });
        }
        catch (IOException ex) {
            f.f().e("A problem occurred while reading the Crashlytics log file.", (Throwable)ex);
        }
        return new b(array2, array[0]);
    }
    
    private void h() {
        if (this.c == null) {
            try {
                this.c = new c(this.a);
            }
            catch (IOException ex) {
                final f f = com.google.firebase.crashlytics.internal.f.f();
                final StringBuilder sb = new StringBuilder();
                sb.append("Could not open log file: ");
                sb.append(this.a);
                f.e(sb.toString(), (Throwable)ex);
            }
        }
    }
    
    @Override
    public void a() {
        g.e((Closeable)this.c, "There was a problem closing the Crashlytics log file.");
        this.c = null;
    }
    
    @Override
    public String b() {
        final byte[] c = this.c();
        String s;
        if (c != null) {
            s = new String(c, com.google.firebase.crashlytics.internal.log.d.d);
        }
        else {
            s = null;
        }
        return s;
    }
    
    @Override
    public byte[] c() {
        final b g = this.g();
        if (g == null) {
            return null;
        }
        final int b = g.b;
        final byte[] array = new byte[b];
        System.arraycopy(g.a, 0, array, 0, b);
        return array;
    }
    
    @Override
    public void d() {
        this.a();
        this.a.delete();
    }
    
    @Override
    public void e(final long n, final String s) {
        this.h();
        this.f(n, s);
    }
    
    private static class b
    {
        public final byte[] a;
        public final int b;
        
        b(final byte[] a, final int b) {
            this.a = a;
            this.b = b;
        }
    }
}
