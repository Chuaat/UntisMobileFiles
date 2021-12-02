// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import android.graphics.Color;
import java.nio.ByteBuffer;
import android.graphics.Matrix;
import android.graphics.Bitmap;

public final class sa
{
    public static Bitmap a(final Bitmap bitmap, final oa oa) {
        final int width = bitmap.getWidth();
        final int height = bitmap.getHeight();
        Bitmap bitmap2 = bitmap;
        if (oa.K != 0) {
            final Matrix matrix = new Matrix();
            final int k = oa.K;
            int n;
            if (k != 0) {
                if (k != 1) {
                    if (k != 2) {
                        if (k != 3) {
                            throw new IllegalArgumentException("Unsupported rotation degree.");
                        }
                        n = 270;
                    }
                    else {
                        n = 180;
                    }
                }
                else {
                    n = 90;
                }
            }
            else {
                n = 0;
            }
            matrix.postRotate((float)n);
            bitmap2 = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
        }
        final int i = oa.K;
        if (i == 1 || i == 3) {
            oa.G = height;
            oa.H = width;
        }
        return bitmap2;
    }
    
    public static ByteBuffer b(final Bitmap bitmap, final boolean b) {
        final int width = bitmap.getWidth();
        final int height = bitmap.getHeight();
        final int n = width * height;
        final ByteBuffer allocateDirect = ByteBuffer.allocateDirect(((width + 1) / 2 * ((height + 1) / 2) << 1) + n);
        int i = 0;
        int n2 = n;
        while (i < n) {
            final int n3 = i % width;
            final int n4 = i / width;
            final int pixel = bitmap.getPixel(n3, n4);
            final int red = Color.red(pixel);
            final int green = Color.green(pixel);
            final int blue = Color.blue(pixel);
            final float n5 = (float)red;
            final float n6 = (float)green;
            final float n7 = (float)blue;
            allocateDirect.put(i, (byte)(0.299f * n5 + 0.587f * n6 + 0.114f * n7));
            int n8 = n2;
            if (n4 % 2 == 0) {
                n8 = n2;
                if (n3 % 2 == 0) {
                    final int n9 = n2 + 1;
                    allocateDirect.put(n2, (byte)(-0.169f * n5 + -0.331f * n6 + n7 * 0.5f + 128.0f));
                    n8 = n9 + 1;
                    allocateDirect.put(n9, (byte)(n5 * 0.5f + n6 * -0.419f + n7 * -0.081f + 128.0f));
                }
            }
            ++i;
            n2 = n8;
        }
        return allocateDirect;
    }
}
