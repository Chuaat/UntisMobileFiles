// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class q7<MessageType extends q7<MessageType, BuilderType>, BuilderType extends p7<MessageType, BuilderType>> implements sa
{
    protected int zzb;
    
    public q7() {
        this.zzb = 0;
    }
    
    protected static <T> void g(final Iterable<T> iterable, final List<? super T> list) {
        s9.e(iterable);
        if (iterable instanceof z9) {
            final List<?> g = ((z9)iterable).g();
            final z9 z9 = (z9)list;
            final int size = list.size();
            for (final Object next : g) {
                if (next == null) {
                    final int size2 = z9.size();
                    final StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(size2 - size);
                    sb.append(" is null.");
                    final String string = sb.toString();
                    int size3 = z9.size();
                    while (--size3 >= size) {
                        z9.remove(size3);
                    }
                    throw new NullPointerException(string);
                }
                if (next instanceof h8) {
                    z9.x2((h8)next);
                }
                else {
                    z9.add((String)next);
                }
            }
        }
        else {
            if (iterable instanceof za) {
                list.addAll((Collection<?>)iterable);
                return;
            }
            if (list instanceof ArrayList && iterable instanceof Collection) {
                ((ArrayList<Object>)list).ensureCapacity(list.size() + ((Collection)iterable).size());
            }
            final int size4 = list.size();
            for (final Object next2 : iterable) {
                if (next2 == null) {
                    final int size5 = list.size();
                    final StringBuilder sb2 = new StringBuilder(37);
                    sb2.append("Element at index ");
                    sb2.append(size5 - size4);
                    sb2.append(" is null.");
                    final String string2 = sb2.toString();
                    int size6 = list.size();
                    while (--size6 >= size4) {
                        list.remove(size6);
                    }
                    throw new NullPointerException(string2);
                }
                list.add(next2);
            }
        }
    }
    
    @Override
    public final h8 b() {
        try {
            final int y = this.y();
            final h8 h = h8.H;
            final byte[] array = new byte[y];
            final q8 c = q8.c(array);
            this.c(c);
            c.d();
            return new e8(array);
        }
        catch (IOException cause) {
            final String name = this.getClass().getName();
            final StringBuilder sb = new StringBuilder(name.length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ByteString threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), cause);
        }
    }
    
    int e() {
        throw null;
    }
    
    void h(final int n) {
        throw null;
    }
    
    public final byte[] i() {
        try {
            final byte[] array = new byte[this.y()];
            final q8 c = q8.c(array);
            this.c(c);
            c.d();
            return array;
        }
        catch (IOException cause) {
            final String name = this.getClass().getName();
            final StringBuilder sb = new StringBuilder(name.length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a byte array threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), cause);
        }
    }
}
