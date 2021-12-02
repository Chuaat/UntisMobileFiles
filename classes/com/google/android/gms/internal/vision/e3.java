// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.Iterator;

final class e3<E> extends q2<E>
{
    private final transient E I;
    private transient int J;
    
    e3(final E e) {
        this.I = k1.b(e);
    }
    
    e3(final E i, final int j) {
        this.I = i;
        this.J = j;
    }
    
    @Override
    final int b(final Object[] array, final int n) {
        array[n] = this.I;
        return n + 1;
    }
    
    @Override
    public final boolean contains(final Object obj) {
        return this.I.equals(obj);
    }
    
    @Override
    public final i3<E> f() {
        return (i3<E>)new v2(this.I);
    }
    
    @Override
    public final int hashCode() {
        int j;
        if ((j = this.J) == 0) {
            j = this.I.hashCode();
            this.J = j;
        }
        return j;
    }
    
    @Override
    final boolean m() {
        return false;
    }
    
    @Override
    final boolean o() {
        return this.J != 0;
    }
    
    @Override
    final l2<E> p() {
        return l2.o(this.I);
    }
    
    @Override
    public final int size() {
        return 1;
    }
    
    @Override
    public final String toString() {
        final String string = this.I.toString();
        final StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 2);
        sb.append('[');
        sb.append(string);
        sb.append(']');
        return sb.toString();
    }
}
