// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.dynamite;

import android.content.Context;

final class d implements DynamiteModule.b
{
    @Override
    public final a a(final Context context, final String s, final DynamiteModule.b.b b) throws DynamiteModule.a {
        final a a = new a();
        final int b2 = b.b(context, s);
        a.a = b2;
        if (b2 != 0) {
            a.c = -1;
        }
        else if ((a.b = b.a(context, s, true)) != 0) {
            a.c = 1;
        }
        return a;
    }
}
