// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.dynamite;

import android.content.Context;

final class a implements DynamiteModule.b
{
    @Override
    public final DynamiteModule.b.a a(final Context context, final String s, final DynamiteModule.b.b b) throws DynamiteModule.a {
        final DynamiteModule.b.a a = new DynamiteModule.b.a();
        final int a2 = b.a(context, s, true);
        a.b = a2;
        if (a2 != 0) {
            a.c = 1;
        }
        else if ((a.a = b.b(context, s)) != 0) {
            a.c = -1;
        }
        return a;
    }
}
