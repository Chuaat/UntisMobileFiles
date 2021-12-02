// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.data.DataHolder;
import f2.a;

@f2.a
public abstract class g<L> implements b<L>
{
    private final DataHolder a;
    
    @f2.a
    protected g(@RecentlyNonNull final DataHolder a) {
        this.a = a;
    }
    
    @f2.a
    @Override
    public final void a(@RecentlyNonNull final L l) {
        this.c(l, this.a);
    }
    
    @f2.a
    @Override
    public void b() {
        final DataHolder a = this.a;
        if (a != null) {
            a.close();
        }
    }
    
    @f2.a
    protected abstract void c(@RecentlyNonNull final L p0, @RecentlyNonNull final DataHolder p1);
}
