// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.dynamic;

import android.os.Bundle;
import android.app.Activity;

final class j implements a
{
    private final /* synthetic */ Activity a;
    private final /* synthetic */ Bundle b;
    private final /* synthetic */ Bundle c;
    private final /* synthetic */ com.google.android.gms.dynamic.a d;
    
    j(final com.google.android.gms.dynamic.a d, final Activity a, final Bundle b, final Bundle c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void a(final e e) {
        this.d.a.b(this.a, this.b, this.c);
    }
    
    @Override
    public final int b() {
        return 0;
    }
}
