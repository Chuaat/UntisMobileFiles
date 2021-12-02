// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.platforminfo;

import androidx.annotation.k0;
import kotlin.y;

public final class e
{
    private e() {
    }
    
    @k0
    public static String a() {
        try {
            return y.L.toString();
        }
        catch (NoClassDefFoundError noClassDefFoundError) {
            return null;
        }
    }
}
