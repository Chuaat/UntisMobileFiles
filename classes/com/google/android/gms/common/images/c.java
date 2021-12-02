// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.images;

import com.google.android.gms.common.internal.v;
import androidx.annotation.k0;
import android.net.Uri;

final class c
{
    public final Uri a;
    
    public c(final Uri a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(@k0 final Object o) {
        return this == o || (o instanceof c && v.b(((c)o).a, this.a));
    }
    
    @Override
    public final int hashCode() {
        return v.c(this.a);
    }
}
