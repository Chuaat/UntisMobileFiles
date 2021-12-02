// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.vision;

import android.util.SparseIntArray;
import d6.a;
import com.google.android.gms.common.util.d0;

@d0
public final class l
{
    private static final Object c;
    @a("lock")
    private static int d;
    @a("lock")
    private final SparseIntArray a;
    @a("lock")
    private final SparseIntArray b;
    
    static {
        c = new Object();
    }
    
    public l() {
        this.a = new SparseIntArray();
        this.b = new SparseIntArray();
    }
    
    public final int a(final int n) {
        synchronized (l.c) {
            final int value = this.a.get(n, -1);
            if (value != -1) {
                return value;
            }
            final int d = l.d;
            l.d = d + 1;
            this.a.append(n, d);
            this.b.append(d, n);
            return d;
        }
    }
    
    public final int b(int value) {
        synchronized (l.c) {
            value = this.b.get(value);
            return value;
        }
    }
}
