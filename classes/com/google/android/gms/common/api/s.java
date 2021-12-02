// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api;

import androidx.annotation.j0;
import androidx.annotation.RecentlyNonNull;

public class s<T extends t>
{
    private T G;
    
    public s() {
    }
    
    protected s(@RecentlyNonNull final T g) {
        this.G = g;
    }
    
    @j0
    protected T b() {
        return this.G;
    }
    
    public void f(@RecentlyNonNull final T g) {
        this.G = g;
    }
}
