// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.vision.text;

import com.google.android.gms.internal.vision.n;
import android.content.Context;
import com.google.android.gms.internal.vision.i;
import com.google.android.gms.internal.vision.sa;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.OutputStream;
import android.graphics.YuvImage;
import java.io.ByteArrayOutputStream;
import com.google.android.gms.common.internal.x;
import java.nio.ByteBuffer;
import com.google.android.gms.internal.vision.oa;
import com.google.android.gms.internal.vision.k;
import android.graphics.Rect;
import android.util.SparseArray;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.vision.o;
import com.google.android.gms.vision.b;

public final class e extends b<d>
{
    private final o c;
    
    private e() {
        throw new IllegalStateException("Default constructor called");
    }
    
    private e(final o c) {
        this.c = c;
    }
    
    @RecentlyNonNull
    @Override
    public final SparseArray<d> a(@RecentlyNonNull final com.google.android.gms.vision.d d) {
        final k k = new k(new Rect());
        if (d != null) {
            final oa m = oa.M(d);
            final Bitmap a = d.a();
            final int n = 0;
            Bitmap bitmap;
            if (a != null) {
                bitmap = d.a();
            }
            else {
                final com.google.android.gms.vision.d.b c = d.c();
                final ByteBuffer byteBuffer = x.k(d.b());
                final int a2 = c.a();
                final int g = m.G;
                final int h = m.H;
                byte[] array;
                if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
                    array = byteBuffer.array();
                }
                else {
                    array = new byte[byteBuffer.capacity()];
                    byteBuffer.get(array);
                }
                final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                new YuvImage(array, a2, g, h, (int[])null).compressToJpeg(new Rect(0, 0, g, h), 100, (OutputStream)byteArrayOutputStream);
                final byte[] byteArray = byteArrayOutputStream.toByteArray();
                bitmap = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
            }
            final Bitmap a3 = sa.a(x.k(bitmap), m);
            if (!k.G.isEmpty()) {
                final Rect g2 = k.G;
                final int f = d.c().f();
                final int b = d.c().b();
                final int i = m.K;
                Rect rect;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            rect = g2;
                        }
                        else {
                            rect = new Rect(g2.top, f - g2.right, g2.bottom, f - g2.left);
                        }
                    }
                    else {
                        rect = new Rect(f - g2.right, b - g2.bottom, f - g2.left, b - g2.top);
                    }
                }
                else {
                    rect = new Rect(b - g2.bottom, g2.left, b - g2.top, g2.right);
                }
                k.G.set(rect);
            }
            m.K = 0;
            final i[] f2 = this.c.f(a3, m, k);
            final SparseArray sparseArray = new SparseArray();
            for (final i l : f2) {
                SparseArray sparseArray2;
                if ((sparseArray2 = (SparseArray)sparseArray.get(l.P)) == null) {
                    sparseArray2 = new SparseArray();
                    sparseArray.append(l.P, (Object)sparseArray2);
                }
                sparseArray2.append(l.Q, (Object)l);
            }
            final SparseArray sparseArray3 = new SparseArray(sparseArray.size());
            for (int n2 = n; n2 < sparseArray.size(); ++n2) {
                sparseArray3.append(sparseArray.keyAt(n2), (Object)new d((SparseArray<i>)sparseArray.valueAt(n2)));
            }
            return (SparseArray<d>)sparseArray3;
        }
        throw new IllegalArgumentException("No frame supplied.");
    }
    
    @Override
    public final boolean b() {
        return this.c.c();
    }
    
    @Override
    public final void d() {
        super.d();
        this.c.d();
    }
    
    public static class a
    {
        private Context a;
        private n b;
        
        public a(@RecentlyNonNull final Context a) {
            this.a = a;
            this.b = new n();
        }
        
        @RecentlyNonNull
        public e a() {
            return new e(new o(this.a, this.b), null);
        }
    }
}
