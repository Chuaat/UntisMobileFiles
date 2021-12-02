// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load;

import com.bumptech.glide.load.engine.v;
import android.content.Context;
import java.util.Iterator;
import java.security.MessageDigest;
import java.util.Arrays;
import androidx.annotation.j0;
import java.util.Collection;

public class h<T> implements n<T>
{
    private final Collection<? extends n<T>> c;
    
    public h(@j0 final Collection<? extends n<T>> c) {
        if (!c.isEmpty()) {
            this.c = c;
            return;
        }
        throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
    }
    
    @SafeVarargs
    public h(@j0 final n<T>... a) {
        if (a.length != 0) {
            this.c = Arrays.asList(a);
            return;
        }
        throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
    }
    
    @Override
    public void a(@j0 final MessageDigest messageDigest) {
        final Iterator<? extends n<T>> iterator = this.c.iterator();
        while (iterator.hasNext()) {
            ((n<?>)iterator.next()).a(messageDigest);
        }
    }
    
    @j0
    @Override
    public v<T> b(@j0 final Context context, @j0 final v<T> obj, final int n, final int n2) {
        final Iterator<? extends n<T>> iterator = this.c.iterator();
        v<T> v = obj;
        while (iterator.hasNext()) {
            final v<T> b = ((n<T>)iterator.next()).b(context, v, n, n2);
            if (v != null && !v.equals(obj) && !v.equals(b)) {
                v.a();
            }
            v = b;
        }
        return v;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof h && this.c.equals(((h)o).c);
    }
    
    @Override
    public int hashCode() {
        return this.c.hashCode();
    }
}
