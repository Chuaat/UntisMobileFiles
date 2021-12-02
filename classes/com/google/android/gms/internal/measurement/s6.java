// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import androidx.annotation.w;
import android.net.Uri;
import androidx.collection.a;

public final class s6
{
    @w("PhenotypeConstants.class")
    private static final a<String, Uri> a;
    
    static {
        a = new a<String, Uri>();
    }
    
    public static Uri a(String str) {
        synchronized (s6.class) {
            final a<String, Uri> a = s6.a;
            Uri parse;
            if ((parse = a.get("com.google.android.gms.measurement")) == null) {
                str = String.valueOf(Uri.encode("com.google.android.gms.measurement"));
                if (str.length() != 0) {
                    str = "content://com.google.android.gms.phenotype/".concat(str);
                }
                else {
                    str = new String("content://com.google.android.gms.phenotype/");
                }
                parse = Uri.parse(str);
                a.put("com.google.android.gms.measurement", parse);
            }
            return parse;
        }
    }
}
