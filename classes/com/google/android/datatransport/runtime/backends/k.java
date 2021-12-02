// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.time.a;
import android.content.Context;
import e6.c;
import com.google.android.datatransport.runtime.dagger.internal.g;

public final class k implements g<j>
{
    private final c<Context> a;
    private final c<a> b;
    private final c<a> c;
    
    public k(final c<Context> a, final c<a> b, final c<a> c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static k a(final c<Context> c, final c<a> c2, final c<a> c3) {
        return new k(c, c2, c3);
    }
    
    public static j c(final Context context, final a a, final a a2) {
        return new j(context, a, a2);
    }
    
    public j b() {
        return c((Context)this.a.get(), (a)this.b.get(), (a)this.c.get());
    }
}
