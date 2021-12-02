// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api;

import androidx.annotation.RecentlyNullable;
import androidx.annotation.j0;
import androidx.annotation.RecentlyNonNull;

public class b extends Exception
{
    @Deprecated
    @RecentlyNonNull
    protected final Status G;
    
    public b(@RecentlyNonNull final Status g) {
        final int q1 = g.q1();
        String q2;
        if (g.Q1() != null) {
            q2 = g.Q1();
        }
        else {
            q2 = "";
        }
        final StringBuilder sb = new StringBuilder(String.valueOf(q2).length() + 13);
        sb.append(q1);
        sb.append(": ");
        sb.append(q2);
        super(sb.toString());
        this.G = g;
    }
    
    @j0
    public Status a() {
        return this.G;
    }
    
    @RecentlyNonNull
    public int b() {
        return this.G.q1();
    }
    
    @Deprecated
    @RecentlyNullable
    public String c() {
        return this.G.Q1();
    }
}
