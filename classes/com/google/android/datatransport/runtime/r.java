// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime;

import com.google.android.datatransport.j;
import com.google.android.datatransport.d;
import com.google.android.datatransport.g;
import com.google.android.datatransport.c;
import com.google.android.datatransport.h;

final class r<T> implements h<T>
{
    private final o a;
    private final String b;
    private final c c;
    private final g<T, byte[]> d;
    private final s e;
    
    r(final o a, final String b, final c c, final g<T, byte[]> d, final s e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public void a(final d<T> d) {
        this.b(d, q.a);
    }
    
    @Override
    public void b(final d<T> d, final j j) {
        this.e.a(n.a().f(this.a).c(d).g(this.b).e(this.d).b(this.c).a(), j);
    }
}
