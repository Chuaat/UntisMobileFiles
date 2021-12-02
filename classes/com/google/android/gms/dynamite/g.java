// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.dynamite;

import android.content.Context;

final class g implements DynamiteModule.b
{
    @Override
    public final a a(final Context context, final String s, final DynamiteModule.b.b b) throws DynamiteModule.a {
        final a a = new a();
        final int b2 = b.b(context, s);
        a.a = b2;
        int b3;
        if (b2 != 0) {
            b3 = b.a(context, s, false);
        }
        else {
            b3 = b.a(context, s, true);
        }
        a.b = b3;
        final int a2 = a.a;
        if (a2 == 0 && a.b == 0) {
            a.c = 0;
        }
        else if (a.b >= a2) {
            a.c = 1;
        }
        else {
            a.c = -1;
        }
        return a;
    }
}
