// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import e6.c;
import com.google.android.datatransport.runtime.dagger.internal.g;

public final class j0 implements g<i0>
{
    private final c<Context> a;
    private final c<String> b;
    private final c<Integer> c;
    
    public j0(final c<Context> a, final c<String> b, final c<Integer> c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static j0 a(final c<Context> c, final c<String> c2, final c<Integer> c3) {
        return new j0(c, c2, c3);
    }
    
    public static i0 c(final Context context, final String s, final int n) {
        return new i0(context, s, n);
    }
    
    public i0 b() {
        return c((Context)this.a.get(), (String)this.b.get(), (int)this.c.get());
    }
}
