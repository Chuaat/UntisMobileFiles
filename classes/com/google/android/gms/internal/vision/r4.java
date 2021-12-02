// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class r4<MessageType extends r4<MessageType, BuilderType>, BuilderType extends q4<MessageType, BuilderType>> implements z7
{
    protected int zza;
    
    public r4() {
        this.zza = 0;
    }
    
    protected static <T> void b(final Iterable<T> iterable, final List<? super T> list) {
        t6.d(iterable);
        if (iterable instanceof j7) {
            final List<?> c = ((j7)iterable).c();
            final j7 j7 = (j7)list;
            final int size = list.size();
            for (final Object next : c) {
                if (next == null) {
                    final int size2 = j7.size();
                    final StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(size2 - size);
                    sb.append(" is null.");
                    final String string = sb.toString();
                    for (int i = j7.size() - 1; i >= size; --i) {
                        j7.remove(i);
                    }
                    throw new NullPointerException(string);
                }
                if (next instanceof f5) {
                    j7.q4((f5)next);
                }
                else {
                    j7.add((String)next);
                }
            }
            return;
        }
        if (iterable instanceof l8) {
            list.addAll((Collection<?>)iterable);
            return;
        }
        if (list instanceof ArrayList && iterable instanceof Collection) {
            ((ArrayList<Object>)list).ensureCapacity(list.size() + ((Collection<? extends T>)iterable).size());
        }
        final int size3 = list.size();
        for (final Object next2 : iterable) {
            if (next2 == null) {
                final int size4 = list.size();
                final StringBuilder sb2 = new StringBuilder(37);
                sb2.append("Element at index ");
                sb2.append(size4 - size3);
                sb2.append(" is null.");
                final String string2 = sb2.toString();
                for (int k = list.size() - 1; k >= size3; --k) {
                    list.remove(k);
                }
                throw new NullPointerException(string2);
            }
            list.add(next2);
        }
    }
    
    void c(final int n) {
        throw new UnsupportedOperationException();
    }
    
    public final byte[] d() {
        try {
            final byte[] array = new byte[this.q()];
            final v5 f = v5.f(array);
            this.a(f);
            f.N();
            return array;
        }
        catch (IOException cause) {
            final String name = this.getClass().getName();
            final StringBuilder sb = new StringBuilder(name.length() + 62 + "byte array".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), cause);
        }
    }
    
    int f() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final f5 m() {
        try {
            final o5 z = f5.z(this.q());
            this.a(z.b());
            return z.a();
        }
        catch (IOException cause) {
            final String name = this.getClass().getName();
            final StringBuilder sb = new StringBuilder(name.length() + 62 + "ByteString".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("ByteString");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), cause);
        }
    }
}
