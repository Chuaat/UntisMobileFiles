// 
// Decompiled by Procyon v0.5.36
// 

package androidx.media;

import android.os.Bundle;
import androidx.annotation.t0;

@t0({ t0.a.G })
public class c
{
    private c() {
    }
    
    public static boolean a(final Bundle bundle, final Bundle bundle2) {
        final boolean b = true;
        final boolean b2 = true;
        boolean b3 = true;
        if (bundle == bundle2) {
            return true;
        }
        if (bundle == null) {
            if (bundle2.getInt("android.media.browse.extra.PAGE", -1) != -1 || bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1) != -1) {
                b3 = false;
            }
            return b3;
        }
        if (bundle2 == null) {
            return bundle.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1 && b;
        }
        return bundle.getInt("android.media.browse.extra.PAGE", -1) == bundle2.getInt("android.media.browse.extra.PAGE", -1) && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1) && b2;
    }
    
    public static boolean b(final Bundle bundle, final Bundle bundle2) {
        int int1;
        if (bundle == null) {
            int1 = -1;
        }
        else {
            int1 = bundle.getInt("android.media.browse.extra.PAGE", -1);
        }
        int int2;
        if (bundle2 == null) {
            int2 = -1;
        }
        else {
            int2 = bundle2.getInt("android.media.browse.extra.PAGE", -1);
        }
        int int3;
        if (bundle == null) {
            int3 = -1;
        }
        else {
            int3 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        }
        int int4;
        if (bundle2 == null) {
            int4 = -1;
        }
        else {
            int4 = bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        }
        final int n = Integer.MAX_VALUE;
        boolean b = true;
        int n3;
        int n4;
        if (int1 != -1 && int3 != -1) {
            final int n2 = int1 * int3;
            n3 = int3 + n2 - 1;
            n4 = n2;
        }
        else {
            n3 = Integer.MAX_VALUE;
            n4 = 0;
        }
        int n6;
        int n7;
        if (int2 != -1 && int4 != -1) {
            final int n5 = int2 * int4;
            n6 = int4 + n5 - 1;
            n7 = n5;
        }
        else {
            n7 = 0;
            n6 = n;
        }
        if (n3 < n7 || n6 < n4) {
            b = false;
        }
        return b;
    }
}
