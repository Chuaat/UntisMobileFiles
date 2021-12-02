// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common;

import android.content.Intent;
import androidx.annotation.RecentlyNonNull;

public class j extends r
{
    private final int H;
    
    public j(@RecentlyNonNull final int h, @RecentlyNonNull final String s, @RecentlyNonNull final Intent intent) {
        super(s, intent);
        this.H = h;
    }
    
    @RecentlyNonNull
    public int b() {
        return this.H;
    }
}
