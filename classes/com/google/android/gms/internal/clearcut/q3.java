// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import java.util.Map;
import java.util.Iterator;

final class q3 extends w3
{
    private final /* synthetic */ n3 H;
    
    private q3(final n3 h) {
        this.H = h;
        super(h, null);
    }
    
    @Override
    public final Iterator<Map.Entry<Object, Object>> iterator() {
        return new p3(this.H, null);
    }
}
