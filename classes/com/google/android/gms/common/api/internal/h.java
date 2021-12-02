// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.data.DataHolder;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Status;
import f2.a;
import com.google.android.gms.common.api.t;
import com.google.android.gms.common.api.p;

@a
public class h implements p, t
{
    @RecentlyNonNull
    @a
    protected final Status G;
    @RecentlyNonNull
    @a
    protected final DataHolder H;
    
    @a
    protected h(@RecentlyNonNull final DataHolder dataHolder) {
        this(dataHolder, new Status(dataHolder.i3()));
    }
    
    @a
    protected h(@RecentlyNonNull final DataHolder h, @RecentlyNonNull final Status g) {
        this.G = g;
        this.H = h;
    }
    
    @RecentlyNonNull
    @a
    @Override
    public Status h() {
        return this.G;
    }
    
    @a
    @Override
    public void release() {
        final DataHolder h = this.H;
        if (h != null) {
            h.close();
        }
    }
}
