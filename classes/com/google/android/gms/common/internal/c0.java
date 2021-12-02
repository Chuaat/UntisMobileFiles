// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.internal;

import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.o;
import androidx.annotation.RecentlyNonNull;
import android.content.Context;
import android.content.res.Resources;
import f2.a;

@a
public class c0
{
    private final Resources a;
    private final String b;
    
    public c0(@RecentlyNonNull final Context context) {
        x.k(context);
        final Resources resources = context.getResources();
        this.a = resources;
        this.b = resources.getResourcePackageName(o.b.a);
    }
    
    @RecentlyNullable
    @a
    public String a(@RecentlyNonNull final String s) {
        final int identifier = this.a.getIdentifier(s, "string", this.b);
        if (identifier == 0) {
            return null;
        }
        return this.a.getString(identifier);
    }
}
