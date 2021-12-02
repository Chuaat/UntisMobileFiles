// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import android.os.Bundle;

final class w9 implements fa
{
    final /* synthetic */ z9 a;
    
    w9(final z9 a) {
        this.a = a;
    }
    
    @Override
    public final void a(final String s, final String s2, final Bundle bundle) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            if (z9.a0(this.a) != null) {
                z9.a0(this.a).c().o().b("AppId not known when logging event", "_err");
            }
            return;
        }
        this.a.b().w(new v9(this, s, "_err", bundle));
    }
}
