// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.load;

import androidx.collection.m;
import androidx.annotation.k0;
import java.security.MessageDigest;
import androidx.annotation.j0;
import com.bumptech.glide.util.b;
import androidx.collection.a;

public final class j implements g
{
    private final a<i<?>, Object> c;
    
    public j() {
        this.c = new b<i<?>, Object>();
    }
    
    private static <T> void f(@j0 final i<T> i, @j0 final Object o, @j0 final MessageDigest messageDigest) {
        i.h((T)o, messageDigest);
    }
    
    @Override
    public void a(@j0 final MessageDigest messageDigest) {
        for (int i = 0; i < this.c.size(); ++i) {
            f((i<?>)this.c.i(i), this.c.o(i), messageDigest);
        }
    }
    
    @k0
    public <T> T c(@j0 final i<T> i) {
        Object o;
        if (this.c.containsKey(i)) {
            o = this.c.get(i);
        }
        else {
            o = i.d();
        }
        return (T)o;
    }
    
    public void d(@j0 final j j) {
        this.c.j((m<?, ?>)j.c);
    }
    
    @j0
    public <T> j e(@j0 final i<T> i, @j0 final T t) {
        this.c.put(i, t);
        return this;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof j && this.c.equals(((j)o).c);
    }
    
    @Override
    public int hashCode() {
        return this.c.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Options{values=");
        sb.append(this.c);
        sb.append('}');
        return sb.toString();
    }
}
