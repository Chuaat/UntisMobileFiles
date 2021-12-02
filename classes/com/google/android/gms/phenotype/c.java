// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.phenotype;

import android.net.Uri;
import com.google.android.gms.internal.phenotype.d;
import com.google.android.gms.internal.phenotype.e;
import f2.a;

@a
public final class c
{
    private static final com.google.android.gms.common.api.a.g<e> a;
    private static final com.google.android.gms.common.api.a.a<e, com.google.android.gms.common.api.a.d.d> b;
    @Deprecated
    private static final com.google.android.gms.common.api.a<com.google.android.gms.common.api.a.d.d> c;
    @Deprecated
    private static final r d;
    
    static {
        c = new com.google.android.gms.common.api.a<com.google.android.gms.common.api.a.d.d>("Phenotype.API", b = new q(), a = new com.google.android.gms.common.api.a.g());
        d = (r)new d();
    }
    
    private c() {
    }
    
    @a
    public static Uri a(String str) {
        str = String.valueOf(Uri.encode(str));
        if (str.length() != 0) {
            str = "content://com.google.android.gms.phenotype/".concat(str);
        }
        else {
            str = new String("content://com.google.android.gms.phenotype/");
        }
        return Uri.parse(str);
    }
}
