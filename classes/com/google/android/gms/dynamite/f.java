// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.dynamite;

import android.content.Context;

final class f implements DynamiteModule.b
{
    @Override
    public final a a(final Context context, final String s, final DynamiteModule.b.b b) throws DynamiteModule.a {
        final a a = new a();
        a.a = b.b(context, s);
        final int a2 = b.a(context, s, true);
        a.b = a2;
        final int a3 = a.a;
        int c;
        if (a3 == 0 && a2 == 0) {
            c = 0;
        }
        else {
            if (a3 < a2) {
                a.c = 1;
                return a;
            }
            c = -1;
        }
        a.c = c;
        return a;
    }
}
