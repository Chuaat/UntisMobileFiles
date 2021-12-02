// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import android.util.Log;
import android.content.Context;

public final class ma
{
    public static boolean a(final Context context, final String s, String s2) {
        s2 = m1.b(s2);
        if (!"face".equals(s) && !"ica".equals(s) && !"ocr".equals(s) && !"barcode".equals(s)) {
            Log.e("NativeLibraryLoader", String.format("Unrecognized engine: %s", s));
            return false;
        }
        final int lastIndex = s2.lastIndexOf(".so");
        String substring = s2;
        if (lastIndex == s2.length() - 3) {
            substring = s2.substring(0, lastIndex);
        }
        s2 = substring;
        if (substring.indexOf("lib") == 0) {
            s2 = substring.substring(3);
        }
        final boolean a = na.a(s, s2);
        if (!a) {
            Log.d("NativeLibraryLoader", String.format("%s engine not loaded with %s.", s, s2));
        }
        return a;
    }
}
