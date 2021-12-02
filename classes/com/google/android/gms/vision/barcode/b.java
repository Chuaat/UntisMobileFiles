// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.vision.barcode;

import com.google.android.gms.internal.vision.o7;
import android.content.Context;
import android.media.Image$Plane;
import java.nio.ByteBuffer;
import android.os.Build$VERSION;
import com.google.android.gms.common.internal.x;
import android.graphics.Bitmap;
import com.google.android.gms.internal.vision.oa;
import android.util.SparseArray;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.vision.d;
import com.google.android.gms.internal.vision.q9;

public final class b extends com.google.android.gms.vision.b<com.google.android.gms.vision.barcode.a>
{
    private final q9 c;
    
    private b() {
        throw new IllegalStateException("Default constructor called");
    }
    
    private b(final q9 c) {
        this.c = c;
    }
    
    @RecentlyNonNull
    @Override
    public final SparseArray<com.google.android.gms.vision.barcode.a> a(@RecentlyNonNull final d d) {
        if (d != null) {
            final oa m = oa.M(d);
            final Bitmap a = d.a();
            int i = 0;
            com.google.android.gms.vision.barcode.a[] array;
            if (a != null) {
                array = this.c.f(x.k(d.a()), m);
                if (array == null) {
                    throw new IllegalArgumentException("Internal barcode detector error; check logcat output.");
                }
            }
            else if (Build$VERSION.SDK_INT >= 19 && d.d() != null) {
                array = this.c.g(x.k(x.k(d.d())[0].getBuffer()), new oa(x.k(d.d())[0].getRowStride(), m.H, m.I, m.J, m.K));
            }
            else {
                array = this.c.g(x.k(d.b()), m);
            }
            final SparseArray sparseArray = new SparseArray(array.length);
            while (i < array.length) {
                final com.google.android.gms.vision.barcode.a a2 = array[i];
                sparseArray.append(a2.H.hashCode(), (Object)a2);
                ++i;
            }
            return (SparseArray<com.google.android.gms.vision.barcode.a>)sparseArray;
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
        private o7 b;
        
        public a(@RecentlyNonNull final Context a) {
            this.a = a;
            this.b = new o7();
        }
        
        @RecentlyNonNull
        public b a() {
            return new b(new q9(this.a, this.b), null);
        }
        
        @RecentlyNonNull
        public a b(final int g) {
            this.b.G = g;
            return this;
        }
    }
}
