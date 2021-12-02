// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.Map;
import java.util.Iterator;

final class y8 extends e9
{
    private final /* synthetic */ x8 H;
    
    private y8(final x8 h) {
        this.H = h;
        super(h, null);
    }
    
    @Override
    public final Iterator<Map.Entry<Object, Object>> iterator() {
        return new z8(this.H, null);
    }
}
