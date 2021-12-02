// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import java.util.Iterator;
import com.google.android.gms.common.internal.x;
import android.os.Looper;
import androidx.annotation.RecentlyNonNull;
import java.util.Map;
import java.util.Collections;
import java.util.WeakHashMap;
import java.util.Set;
import f2.a;

@a
public class o
{
    private final Set<n<?>> a;
    
    public o() {
        this.a = Collections.newSetFromMap(new WeakHashMap<n<?>, Boolean>());
    }
    
    @RecentlyNonNull
    @a
    public static <L> n<L> a(@RecentlyNonNull final L l, @RecentlyNonNull final Looper looper, @RecentlyNonNull final String s) {
        x.l(l, "Listener must not be null");
        x.l(looper, "Looper must not be null");
        x.l(s, "Listener type must not be null");
        return new n<L>(looper, l, s);
    }
    
    @RecentlyNonNull
    @a
    public static <L> n.a<L> b(@RecentlyNonNull final L l, @RecentlyNonNull final String s) {
        x.l(l, "Listener must not be null");
        x.l(s, "Listener type must not be null");
        x.h(s, "Listener type must not be empty");
        return (n.a<L>)new n.a(l, s);
    }
    
    @RecentlyNonNull
    public final <L> n<L> c(@RecentlyNonNull final L l, @RecentlyNonNull final Looper looper, @RecentlyNonNull final String s) {
        final n<Object> a = a((Object)l, looper, s);
        this.a.add(a);
        return (n<L>)a;
    }
    
    public final void d() {
        final Iterator<n<?>> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            iterator.next().a();
        }
        this.a.clear();
    }
}
