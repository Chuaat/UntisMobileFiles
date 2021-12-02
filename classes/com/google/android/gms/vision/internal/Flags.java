// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.vision.internal;

import com.google.android.gms.flags.a;
import androidx.annotation.Keep;

@Keep
public class Flags
{
    private static final a<Boolean> zza;
    
    static {
        zza = a.a(0, "vision:product_barcode_value_logging_enabled", Boolean.TRUE);
    }
    
    private Flags() {
    }
}
