// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.io.IOException;
import android.util.Log;
import android.util.Base64;

final class o0 extends k0<Object>
{
    private final /* synthetic */ r0 m;
    
    o0(final q0 q0, final String s, final Object o, final boolean b, final r0 m) {
        this.m = m;
        super(q0, s, o, true, null);
    }
    
    @Override
    final Object c(Object value) {
        while (true) {
            if (!(value instanceof String)) {
                break Label_0027;
            }
            try {
                return this.m.a(Base64.decode((String)value, 3));
                final String i = super.i();
                value = String.valueOf(value);
                final StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 27 + ((String)value).length());
                sb.append("Invalid byte[] value for ");
                sb.append(i);
                sb.append(": ");
                sb.append((String)value);
                Log.e("PhenotypeFlag", sb.toString());
                return null;
            }
            catch (IOException | IllegalArgumentException ex) {
                continue;
            }
            break;
        }
    }
}
