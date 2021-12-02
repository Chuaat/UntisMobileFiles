// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import androidx.annotation.w;
import android.net.Uri;
import androidx.collection.a;

public final class l0
{
    @w("PhenotypeConstants.class")
    private static final a<String, Uri> a;
    
    static {
        a = new a<String, Uri>();
    }
    
    public static Uri a(final String s) {
        synchronized (l0.class) {
            final a<String, Uri> a = l0.a;
            Uri parse;
            if ((parse = a.get(s)) == null) {
                final String value = String.valueOf(Uri.encode(s));
                String concat;
                if (value.length() != 0) {
                    concat = "content://com.google.android.gms.phenotype/".concat(value);
                }
                else {
                    concat = new String("content://com.google.android.gms.phenotype/");
                }
                parse = Uri.parse(concat);
                a.put(s, parse);
            }
            return parse;
        }
    }
}
