// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.play_billing;

import c6.a;

public final class i extends h
{
    public static boolean a(@a final Object o, @a final Object obj) {
        boolean b = false;
        if (o != obj) {
            if (o == null) {
                return b;
            }
            if (!o.equals(obj)) {
                return false;
            }
        }
        b = true;
        return b;
    }
}
