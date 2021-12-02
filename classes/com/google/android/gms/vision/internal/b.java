// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.vision.internal;

import com.google.android.gms.internal.vision.m3;
import java.io.OutputStream;
import android.graphics.Rect;
import java.io.ByteArrayOutputStream;
import android.graphics.YuvImage;
import androidx.annotation.j0;
import android.annotation.TargetApi;
import androidx.annotation.p0;
import android.media.Image$Plane;
import java.io.IOException;
import android.graphics.BitmapFactory;
import java.nio.ByteBuffer;
import android.graphics.Matrix;
import android.graphics.Bitmap;

public final class b
{
    public static Bitmap a(final Bitmap bitmap, final int n, final int n2, final int n3) {
        if (n == 0) {
            return bitmap;
        }
        final Matrix matrix = new Matrix();
        matrix.postRotate((float)n);
        return Bitmap.createBitmap(bitmap, 0, 0, n2, n3, matrix, true);
    }
    
    public static Bitmap b(final ByteBuffer byteBuffer, final int n, final int n2, final int n3) throws IOException {
        byte[] array;
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            array = byteBuffer.array();
        }
        else {
            byteBuffer.rewind();
            final int limit = byteBuffer.limit();
            final byte[] dst = new byte[limit];
            byteBuffer.get(dst, 0, limit);
            array = dst;
        }
        final byte[] e = e(array, n, n2);
        final Bitmap decodeByteArray = BitmapFactory.decodeByteArray(e, 0, e.length);
        return a(decodeByteArray, n3, decodeByteArray.getWidth(), decodeByteArray.getHeight());
    }
    
    @p0(19)
    public static ByteBuffer c(final Image$Plane[] array, final int n, final int n2) {
        final int n3 = n * n2;
        final byte[] array2 = new byte[n3 / 4 * 2 + n3];
        final ByteBuffer buffer = array[1].getBuffer();
        final ByteBuffer buffer2 = array[2].getBuffer();
        final int position = buffer2.position();
        final int limit = buffer.limit();
        buffer2.position(position + 1);
        buffer.limit(limit - 1);
        final int remaining = buffer2.remaining();
        final int n4 = n3 * 2 / 4;
        final boolean b = remaining == n4 - 2 && buffer2.compareTo(buffer) == 0;
        buffer2.position(position);
        buffer.limit(limit);
        if (b) {
            array[0].getBuffer().get(array2, 0, n3);
            final ByteBuffer buffer3 = array[1].getBuffer();
            array[2].getBuffer().get(array2, n3, 1);
            buffer3.get(array2, n3 + 1, n4 - 1);
        }
        else {
            d(array[0], n, n2, array2, 0, 1);
            d(array[1], n, n2, array2, n3 + 1, 2);
            d(array[2], n, n2, array2, n3, 2);
        }
        return ByteBuffer.wrap(array2);
    }
    
    @TargetApi(19)
    private static void d(final Image$Plane image$Plane, int n, int i, final byte[] array, int n2, final int n3) {
        final ByteBuffer buffer = image$Plane.getBuffer();
        buffer.rewind();
        final int n4 = (buffer.limit() + image$Plane.getRowStride() - 1) / image$Plane.getRowStride();
        if (n4 == 0) {
            return;
        }
        final int n5 = n / (i / n4);
        i = 0;
        n = 0;
        while (i < n4) {
            int n6 = n;
            for (int j = 0; j < n5; ++j) {
                array[n2] = buffer.get(n6);
                n2 += n3;
                n6 += image$Plane.getPixelStride();
            }
            n += image$Plane.getRowStride();
            ++i;
        }
    }
    
    private static byte[] e(@j0 byte[] array, final int n, final int n2) throws IOException {
        final YuvImage yuvImage = new YuvImage(array, 17, n, n2, (int[])null);
        array = (byte[])(Object)new ByteArrayOutputStream();
        try {
            yuvImage.compressToJpeg(new Rect(0, 0, n, n2), 100, (OutputStream)(Object)array);
            final byte[] byteArray = ((ByteArrayOutputStream)(Object)array).toByteArray();
            ((ByteArrayOutputStream)(Object)array).close();
            return byteArray;
        }
        finally {
            try {
                ((ByteArrayOutputStream)(Object)array).close();
            }
            finally {
                final Throwable t;
                final Throwable t2;
                m3.c(t, t2);
            }
        }
    }
}
