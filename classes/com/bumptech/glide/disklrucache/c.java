// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.disklrucache;

import java.io.StringWriter;
import java.io.Reader;
import java.io.IOException;
import java.io.File;
import java.io.Closeable;
import java.nio.charset.Charset;

final class c
{
    static final Charset a;
    static final Charset b;
    
    static {
        a = Charset.forName("US-ASCII");
        b = Charset.forName("UTF-8");
    }
    
    private c() {
    }
    
    static void a(final Closeable closeable) {
        if (closeable == null) {
            goto Label_0016;
        }
        try {
            closeable.close();
            goto Label_0016;
        }
        catch (RuntimeException ex) {
            throw ex;
        }
        catch (Exception ex2) {
            goto Label_0016;
        }
    }
    
    static void b(File file) throws IOException {
        final File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (int length = listFiles.length, i = 0; i < length; ++i) {
                file = listFiles[i];
                if (file.isDirectory()) {
                    b(file);
                }
                if (!file.delete()) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("failed to delete file: ");
                    sb.append(file);
                    throw new IOException(sb.toString());
                }
            }
            return;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("not a readable directory: ");
        sb2.append(file);
        throw new IOException(sb2.toString());
    }
    
    static String c(final Reader reader) throws IOException {
        try {
            final StringWriter stringWriter = new StringWriter();
            final char[] array = new char[1024];
            while (true) {
                final int read = reader.read(array);
                if (read == -1) {
                    break;
                }
                stringWriter.write(array, 0, read);
            }
            return stringWriter.toString();
        }
        finally {
            reader.close();
        }
    }
}
