// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import e6.c;
import com.google.android.datatransport.runtime.dagger.internal.g;

public final class m implements g<l>
{
    private final c<Context> a;
    private final c<j> b;
    
    public m(final c<Context> a, final c<j> b) {
        this.a = a;
        this.b = b;
    }
    
    public static m a(final c<Context> c, final c<j> c2) {
        return new m(c, c2);
    }
    
    public static l c(final Context context, final Object o) {
        return new l(context, (j)o);
    }
    
    public l b() {
        return c((Context)this.a.get(), this.b.get());
    }
}
