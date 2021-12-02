// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.heartbeatinfo;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class n implements Comparable<n>
{
    public static n d(final String s, final long n) {
        return new b(s, n);
    }
    
    public int b(final n n) {
        int n2;
        if (this.n() < n.n()) {
            n2 = -1;
        }
        else {
            n2 = 1;
        }
        return n2;
    }
    
    public abstract String f();
    
    public abstract long n();
}
