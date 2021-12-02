// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.dynamic;

import java.util.Iterator;
import android.os.Bundle;

final class k implements g<Object>
{
    private final /* synthetic */ a a;
    
    k(final a a) {
        this.a = a;
    }
    
    @Override
    public final void a(final e e) {
        this.a.a = (T)e;
        final Iterator iterator = this.a.c.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(this.a.a);
        }
        this.a.c.clear();
        com.google.android.gms.dynamic.a.p(this.a, null);
    }
}
