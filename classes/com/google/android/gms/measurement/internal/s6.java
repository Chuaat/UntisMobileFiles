// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.os.Bundle;

final class s6 implements fa
{
    final /* synthetic */ e7 a;
    
    s6(final e7 a) {
        this.a = a;
    }
    
    @Override
    public final void a(final String s, final String s2, final Bundle bundle) {
        if (!TextUtils.isEmpty((CharSequence)s)) {
            this.a.p("auto", "_err", bundle, s);
            return;
        }
        this.a.n("auto", "_err", bundle);
    }
}
