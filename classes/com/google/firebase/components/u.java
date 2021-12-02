// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.components;

import java.util.Arrays;
import java.util.List;

public class u extends v
{
    private final List<f<?>> G;
    
    public u(final List<f<?>> g) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Dependency cycle detected: ");
        sb.append(Arrays.toString(g.toArray()));
        super(sb.toString());
        this.G = g;
    }
    
    public List<f<?>> a() {
        return this.G;
    }
}
