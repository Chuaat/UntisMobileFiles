// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.cct;

import com.google.android.datatransport.runtime.backends.n;
import com.google.android.datatransport.runtime.backends.i;
import androidx.annotation.Keep;
import com.google.android.datatransport.runtime.backends.d;

@Keep
public class CctBackendFactory implements d
{
    @Override
    public n create(final i i) {
        return new com.google.android.datatransport.cct.d(i.c(), i.f(), i.e());
    }
}
