// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api;

import f2.a;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.e;

public final class y extends UnsupportedOperationException
{
    private final e G;
    
    @a
    public y(@RecentlyNonNull final e g) {
        this.G = g;
    }
    
    @RecentlyNonNull
    @Override
    public final String getMessage() {
        final String value = String.valueOf(this.G);
        final StringBuilder sb = new StringBuilder(value.length() + 8);
        sb.append("Missing ");
        sb.append(value);
        return sb.toString();
    }
}
