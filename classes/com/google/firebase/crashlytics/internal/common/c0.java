// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.common;

import java.util.Iterator;
import java.util.List;
import java.io.IOException;
import java.io.Closeable;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;
import java.io.FileOutputStream;
import androidx.annotation.j0;
import java.io.File;
import androidx.annotation.k0;
import java.io.InputStream;

class c0
{
    private static void a(@k0 final InputStream inputStream, @j0 final File file) throws IOException {
        if (inputStream == null) {
            return;
        }
        final byte[] array = new byte[8192];
        final Closeable closeable = null;
        Closeable closeable2;
        try {
            final GZIPOutputStream gzipOutputStream = new GZIPOutputStream(new FileOutputStream(file));
            try {
                while (true) {
                    final int read = inputStream.read(array);
                    if (read <= 0) {
                        break;
                    }
                    gzipOutputStream.write(array, 0, read);
                }
                gzipOutputStream.finish();
                g.f(gzipOutputStream);
                return;
            }
            finally {}
        }
        finally {
            closeable2 = closeable;
        }
        g.f(closeable2);
    }
    
    static void b(final File parent, List<b0> o) {
        for (final b0 b0 : o) {
            o = null;
            Closeable closeable = null;
            try {
                final InputStream b2 = b0.b();
                if (b2 == null) {
                    o = b2;
                }
                else {
                    closeable = b2;
                    o = b2;
                    closeable = b2;
                    o = b2;
                    final File file = new File(parent, b0.a());
                    closeable = b2;
                    o = b2;
                    a(b2, file);
                    o = b2;
                }
            }
            catch (IOException ex) {}
            finally {
                g.f(closeable);
            }
        }
        goto Label_0113;
    }
}
