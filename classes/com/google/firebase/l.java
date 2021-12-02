// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase;

import com.google.android.gms.common.internal.x;
import androidx.annotation.RecentlyNonNull;

public class l extends Exception
{
    @Deprecated
    protected l() {
    }
    
    public l(@RecentlyNonNull final String s) {
        super(x.h(s, "Detail message must not be empty"));
    }
    
    public l(@RecentlyNonNull final String s, @RecentlyNonNull final Throwable cause) {
        super(x.h(s, "Detail message must not be empty"), cause);
    }
}
