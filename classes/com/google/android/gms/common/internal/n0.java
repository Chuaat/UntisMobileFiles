// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.a;
import android.content.Context;
import androidx.annotation.j0;
import com.google.android.gms.common.g;
import com.google.android.gms.common.h;
import android.util.SparseIntArray;

public final class n0
{
    private final SparseIntArray a;
    private h b;
    
    public n0() {
        this(g.y());
    }
    
    public n0(@j0 final h b) {
        this.a = new SparseIntArray();
        x.k(b);
        this.b = b;
    }
    
    public final int a(@j0 final Context context, @j0 final a.f f) {
        x.k(context);
        x.k(f);
        final boolean r = f.r();
        final int n = 0;
        if (!r) {
            return 0;
        }
        final int s = f.s();
        final int value = this.a.get(s, -1);
        if (value != -1) {
            return value;
        }
        while (true) {
            for (int i = 0; i < this.a.size(); ++i) {
                final int key = this.a.keyAt(i);
                if (key > s && this.a.get(key) == 0) {
                    final int n2 = n;
                    int k = n2;
                    if (n2 == -1) {
                        k = this.b.k(context, s);
                    }
                    this.a.put(s, k);
                    return k;
                }
            }
            final int n2 = value;
            continue;
        }
    }
    
    public final void b() {
        this.a.clear();
    }
}
