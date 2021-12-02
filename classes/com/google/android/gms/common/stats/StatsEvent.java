// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.stats;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import h2.a;

@Deprecated
@f2.a
public abstract class StatsEvent extends h2.a implements ReflectedParcelable
{
    @RecentlyNonNull
    public abstract long M();
    
    @RecentlyNonNull
    public abstract String Q1();
    
    @RecentlyNonNull
    public abstract int g1();
    
    @RecentlyNonNull
    public abstract long q1();
    
    @RecentlyNonNull
    @Override
    public String toString() {
        final long m = this.M();
        final int g1 = this.g1();
        final long q1 = this.q1();
        final String q2 = this.Q1();
        final StringBuilder sb = new StringBuilder(String.valueOf(q2).length() + 53);
        sb.append(m);
        sb.append("\t");
        sb.append(g1);
        sb.append("\t");
        sb.append(q1);
        sb.append(q2);
        return sb.toString();
    }
    
    @f2.a
    public interface a
    {
        @RecentlyNonNull
        @f2.a
        public static final int a = 7;
        @RecentlyNonNull
        @f2.a
        public static final int b = 8;
    }
}
