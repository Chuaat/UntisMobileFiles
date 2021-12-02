// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.flags;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;

public class b
{
    private final Collection<a> a;
    private final Collection<a.d> b;
    private final Collection<a.d> c;
    
    public b() {
        this.a = new ArrayList<a>();
        this.b = new ArrayList<a.d>();
        this.c = new ArrayList<a.d>();
    }
    
    @f2.a
    public static void a(final Context context) {
        e.c().a(context);
    }
    
    public final void b(final a a) {
        this.a.add(a);
    }
}
