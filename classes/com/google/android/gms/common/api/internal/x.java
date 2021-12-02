// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Status;
import f2.a;

@a
public class x extends k.a
{
    @a
    private final e.b<Status> f;
    
    @a
    public x(@RecentlyNonNull final e.b<Status> f) {
        this.f = f;
    }
    
    @a
    @Override
    public void J0(@RecentlyNonNull final Status status) {
        this.f.b(status);
    }
}
