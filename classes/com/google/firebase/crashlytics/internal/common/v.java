// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.model.a0$e$b;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import androidx.annotation.k0;
import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;
import java.io.ByteArrayOutputStream;
import androidx.annotation.j0;
import java.io.File;

class v implements b0
{
    @j0
    private final File a;
    @j0
    private final String b;
    @j0
    private final String c;
    
    v(@j0 final String b, @j0 final String c, @j0 final File a) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    @k0
    private byte[] d() {
        final byte[] array = new byte[8192];
        try {
            final InputStream b = this.b();
            try {
                final ByteArrayOutputStream out = new ByteArrayOutputStream();
                try {
                    final GZIPOutputStream gzipOutputStream = new GZIPOutputStream(out);
                    if (b == null) {
                        gzipOutputStream.close();
                        out.close();
                        if (b != null) {
                            b.close();
                        }
                        return null;
                    }
                    Label_0053: {
                        break Label_0053;
                        try {
                            while (true) {
                                final int read = b.read(array);
                                if (read <= 0) {
                                    break;
                                }
                                gzipOutputStream.write(array, 0, read);
                            }
                            gzipOutputStream.finish();
                            final byte[] byteArray = out.toByteArray();
                            gzipOutputStream.close();
                            out.close();
                            b.close();
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
            finally {
                if (b != null) {
                    try {
                        b.close();
                    }
                    finally {
                        final Throwable t3;
                        final Throwable exception3;
                        t3.addSuppressed(exception3);
                    }
                }
            }
        }
        catch (IOException ex) {
            return null;
        }
    }
    
    @j0
    @Override
    public String a() {
        return this.c;
    }
    
    @k0
    @Override
    public InputStream b() {
        Label_0037: {
            if (!this.a.exists()) {
                break Label_0037;
            }
            if (!this.a.isFile()) {
                break Label_0037;
            }
            try {
                return new FileInputStream(this.a);
                return null;
            }
            catch (FileNotFoundException ex) {
                return null;
            }
        }
    }
    
    @k0
    @Override
    public a0$e$b c() {
        final byte[] d = this.d();
        a0$e$b a;
        if (d != null) {
            a = a0$e$b.a().b(d).c(this.b).a();
        }
        else {
            a = null;
        }
        return a;
    }
}
