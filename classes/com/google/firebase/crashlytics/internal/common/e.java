// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.model.a0$e$b;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;
import java.io.ByteArrayOutputStream;
import androidx.annotation.j0;
import androidx.annotation.k0;

class e implements b0
{
    @k0
    private final byte[] a;
    @j0
    private final String b;
    @j0
    private final String c;
    
    e(@j0 final String b, @j0 final String c, @k0 final byte[] a) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    @k0
    private byte[] d() {
        if (this.e()) {
            return null;
        }
        try {
            final ByteArrayOutputStream out = new ByteArrayOutputStream();
            try {
                final GZIPOutputStream gzipOutputStream = new GZIPOutputStream(out);
                try {
                    gzipOutputStream.write(this.a);
                    gzipOutputStream.finish();
                    final byte[] byteArray = out.toByteArray();
                    gzipOutputStream.close();
                    out.close();
                    return byteArray;
                }
                finally {
                    try {
                        gzipOutputStream.close();
                    }
                    finally {
                        final Throwable t;
                        final Throwable exception;
                        t.addSuppressed(exception);
                    }
                }
            }
            finally {
                try {
                    out.close();
                }
                finally {
                    final Throwable t2;
                    final Throwable exception2;
                    t2.addSuppressed(exception2);
                }
            }
        }
        catch (IOException ex) {
            return null;
        }
    }
    
    private boolean e() {
        final byte[] a = this.a;
        return a == null || a.length == 0;
    }
    
    @j0
    @Override
    public String a() {
        return this.c;
    }
    
    @k0
    @Override
    public InputStream b() {
        InputStream inputStream;
        if (this.e()) {
            inputStream = null;
        }
        else {
            inputStream = new ByteArrayInputStream(this.a);
        }
        return inputStream;
    }
    
    @k0
    @Override
    public a0$e$b c() {
        final byte[] d = this.d();
        a0$e$b a;
        if (d == null) {
            a = null;
        }
        else {
            a = a0$e$b.a().b(d).c(this.b).a();
        }
        return a;
    }
}
