// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.platforminfo;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class d
{
    private static volatile d b;
    private final Set<f> a;
    
    d() {
        this.a = new HashSet<f>();
    }
    
    public static d a() {
        final d b;
        if ((b = d.b) == null) {
            synchronized (d.class) {
                if (d.b == null) {
                    d.b = new d();
                }
            }
        }
        return b;
    }
    
    Set<f> b() {
        synchronized (this.a) {
            return Collections.unmodifiableSet((Set<? extends f>)this.a);
        }
    }
    
    public void c(final String s, final String s2) {
        synchronized (this.a) {
            this.a.add(f.a(s, s2));
        }
    }
}
