// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.util;

import androidx.annotation.k0;
import androidx.annotation.j0;

public class j
{
    private Class<?> a;
    private Class<?> b;
    private Class<?> c;
    
    public j() {
    }
    
    public j(@j0 final Class<?> clazz, @j0 final Class<?> clazz2) {
        this.a(clazz, clazz2);
    }
    
    public j(@j0 final Class<?> clazz, @j0 final Class<?> clazz2, @k0 final Class<?> clazz3) {
        this.b(clazz, clazz2, clazz3);
    }
    
    public void a(@j0 final Class<?> clazz, @j0 final Class<?> clazz2) {
        this.b(clazz, clazz2, null);
    }
    
    public void b(@j0 final Class<?> a, @j0 final Class<?> b, @k0 final Class<?> c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final j j = (j)o;
            return this.a.equals(j.a) && this.b.equals(j.b) && m.d(this.c, j.c);
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        final Class<?> c = this.c;
        int hashCode3;
        if (c != null) {
            hashCode3 = c.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        return (hashCode * 31 + hashCode2) * 31 + hashCode3;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("MultiClassKey{first=");
        sb.append(this.a);
        sb.append(", second=");
        sb.append(this.b);
        sb.append('}');
        return sb.toString();
    }
}
