// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.util;

import com.google.android.gms.common.internal.x;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import androidx.annotation.RecentlyNonNull;
import java.io.InputStream;
import java.io.Closeable;
import java.io.IOException;
import c6.h;
import android.os.ParcelFileDescriptor;
import f2.a;
import com.google.android.gms.common.internal.b0;

@Deprecated
@b0
@a
public final class q
{
    private q() {
    }
    
    @a
    public static void a(@h final ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor == null) {
            return;
        }
        try {
            parcelFileDescriptor.close();
        }
        catch (IOException ex) {}
    }
    
    @a
    public static void b(@h final Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        }
        catch (IOException ex) {}
    }
    
    @Deprecated
    @RecentlyNonNull
    @a
    public static long c(@RecentlyNonNull final InputStream inputStream, @RecentlyNonNull final OutputStream outputStream) throws IOException {
        return i(inputStream, outputStream, false);
    }
    
    @Deprecated
    @RecentlyNonNull
    @a
    public static long d(@RecentlyNonNull final InputStream inputStream, @RecentlyNonNull final OutputStream outputStream, @RecentlyNonNull final boolean b, @RecentlyNonNull final int len) throws IOException {
        final byte[] array = new byte[len];
        long n = 0L;
        try {
            while (true) {
                final int read = inputStream.read(array, 0, len);
                if (read == -1) {
                    break;
                }
                n += read;
                outputStream.write(array, 0, read);
            }
            return n;
        }
        finally {
            if (b) {
                b(inputStream);
                b(outputStream);
            }
        }
    }
    
    @RecentlyNonNull
    @a
    public static boolean e(@RecentlyNonNull final byte[] array) {
        return array.length > 1 && ((array[1] & 0xFF) << 8 | (array[0] & 0xFF)) == 0x8B1F;
    }
    
    @Deprecated
    @RecentlyNonNull
    @a
    public static byte[] f(@RecentlyNonNull final InputStream inputStream) throws IOException {
        return g(inputStream, true);
    }
    
    @Deprecated
    @RecentlyNonNull
    @a
    public static byte[] g(@RecentlyNonNull final InputStream inputStream, @RecentlyNonNull final boolean b) throws IOException {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        i(inputStream, byteArrayOutputStream, b);
        return byteArrayOutputStream.toByteArray();
    }
    
    @Deprecated
    @RecentlyNonNull
    @a
    public static byte[] h(@RecentlyNonNull final InputStream inputStream) throws IOException {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        x.k(inputStream);
        x.k(byteArrayOutputStream);
        final byte[] array = new byte[4096];
        while (true) {
            final int read = inputStream.read(array);
            if (read == -1) {
                break;
            }
            byteArrayOutputStream.write(array, 0, read);
        }
        return byteArrayOutputStream.toByteArray();
    }
    
    @Deprecated
    private static long i(final InputStream inputStream, final OutputStream outputStream, final boolean b) throws IOException {
        return d(inputStream, outputStream, b, 1024);
    }
}
