// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.dynamite;

import android.content.Context;

final class c implements DynamiteModule.b
{
    @Override
    public final a a(final Context context, final String s, final DynamiteModule.b.b b) throws DynamiteModule.a {
        final a a = new a();
        final int a2 = b.a(context, s, false);
        a.b = a2;
        if (a2 == 0) {
            a.c = 0;
        }
        else {
            a.c = 1;
        }
        return a;
    }
}
