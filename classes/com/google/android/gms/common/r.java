// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common;

import androidx.annotation.RecentlyNonNull;
import android.content.Intent;

public class r extends Exception
{
    private final Intent G;
    
    public r(@RecentlyNonNull final String message, @RecentlyNonNull final Intent g) {
        super(message);
        this.G = g;
    }
    
    @RecentlyNonNull
    public Intent a() {
        return new Intent(this.G);
    }
}
