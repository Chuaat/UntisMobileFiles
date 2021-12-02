// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.vision.face;

import android.util.SparseArray;
import com.google.android.gms.vision.i;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.vision.c;

public class e extends c<com.google.android.gms.vision.face.b>
{
    public e(@RecentlyNonNull final com.google.android.gms.vision.b<com.google.android.gms.vision.face.b> b, @RecentlyNonNull final i<com.google.android.gms.vision.face.b> i) {
        super(b, i);
    }
    
    @Override
    public int a(@RecentlyNonNull final com.google.android.gms.vision.b.a<com.google.android.gms.vision.face.b> a) {
        final android.util.SparseArray<com.google.android.gms.vision.face.b> b = a.b();
        if (b.size() != 0) {
            int key = b.keyAt(0);
            float l = ((com.google.android.gms.vision.face.b)b.valueAt(0)).l();
            float n;
            for (int i = 1; i < b.size(); ++i, l = n) {
                final int key2 = b.keyAt(i);
                final float j = ((com.google.android.gms.vision.face.b)b.valueAt(i)).l();
                n = l;
                if (j > l) {
                    key = key2;
                    n = j;
                }
            }
            return key;
        }
        throw new IllegalArgumentException("No faces for selectFocus.");
    }
    
    public static class a
    {
        private e a;
        
        public a(@RecentlyNonNull final com.google.android.gms.vision.b<com.google.android.gms.vision.face.b> b, @RecentlyNonNull final i<com.google.android.gms.vision.face.b> i) {
            this.a = new e(b, i);
        }
        
        @RecentlyNonNull
        public e a() {
            return this.a;
        }
        
        @RecentlyNonNull
        public a b(final int n) {
            this.a.b(n);
            return this;
        }
    }
}
