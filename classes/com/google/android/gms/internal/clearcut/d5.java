// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Collection;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

final class d5 implements Cloneable
{
    private b5<?, ?> G;
    private Object H;
    private List<Object> I;
    
    d5() {
        this.I = new ArrayList<Object>();
    }
    
    private final byte[] a() throws IOException {
        final byte[] array = new byte[this.c()];
        this.b(y4.q(array));
        return array;
    }
    
    private final d5 d() {
        final d5 d5 = new d5();
        try {
            d5.G = this.G;
            final List<Object> i = this.I;
            if (i == null) {
                d5.I = null;
            }
            else {
                d5.I.addAll(i);
            }
            final Object h = this.H;
            if (h != null) {
                Object h2;
                if (h instanceof f5) {
                    h2 = ((f5)h).clone();
                }
                else if (h instanceof byte[]) {
                    h2 = ((byte[])h).clone();
                }
                else {
                    final boolean b = h instanceof byte[][];
                    final int n = 0;
                    int j = 0;
                    if (b) {
                        final byte[][] array = (byte[][])h;
                        final byte[][] h3 = new byte[array.length][];
                        d5.H = h3;
                        while (j < array.length) {
                            h3[j] = array[j].clone();
                            ++j;
                        }
                        return d5;
                    }
                    if (h instanceof boolean[]) {
                        h2 = ((boolean[])h).clone();
                    }
                    else if (h instanceof int[]) {
                        h2 = ((int[])h).clone();
                    }
                    else if (h instanceof long[]) {
                        h2 = ((long[])h).clone();
                    }
                    else if (h instanceof float[]) {
                        h2 = ((float[])h).clone();
                    }
                    else if (h instanceof double[]) {
                        h2 = ((double[])h).clone();
                    }
                    else {
                        if (h instanceof f5[]) {
                            final f5[] array2 = (f5[])h;
                            final f5[] h4 = new f5[array2.length];
                            d5.H = h4;
                            for (int k = n; k < array2.length; ++k) {
                                h4[k] = (f5)array2[k].clone();
                            }
                            return d5;
                        }
                        return d5;
                    }
                }
                d5.H = h2;
            }
            return d5;
        }
        catch (CloneNotSupportedException detailMessage) {
            throw new AssertionError((Object)detailMessage);
        }
    }
    
    final void b(final y4 y4) throws IOException {
        if (this.H != null) {
            throw new NoSuchMethodError();
        }
        final Iterator<Object> iterator = this.I.iterator();
        if (!iterator.hasNext()) {
            return;
        }
        iterator.next();
        throw new NoSuchMethodError();
    }
    
    final int c() {
        if (this.H != null) {
            throw new NoSuchMethodError();
        }
        final Iterator<Object> iterator = this.I.iterator();
        if (!iterator.hasNext()) {
            return 0;
        }
        iterator.next();
        throw new NoSuchMethodError();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof d5)) {
            return false;
        }
        final d5 d5 = (d5)o;
        if (this.H != null && d5.H != null) {
            final b5<?, ?> g = this.G;
            if (g != d5.G) {
                return false;
            }
            if (!g.a.isArray()) {
                return this.H.equals(d5.H);
            }
            final Object h = this.H;
            if (h instanceof byte[]) {
                return Arrays.equals((byte[])h, (byte[])d5.H);
            }
            if (h instanceof int[]) {
                return Arrays.equals((int[])h, (int[])d5.H);
            }
            if (h instanceof long[]) {
                return Arrays.equals((long[])h, (long[])d5.H);
            }
            if (h instanceof float[]) {
                return Arrays.equals((float[])h, (float[])d5.H);
            }
            if (h instanceof double[]) {
                return Arrays.equals((double[])h, (double[])d5.H);
            }
            if (h instanceof boolean[]) {
                return Arrays.equals((boolean[])h, (boolean[])d5.H);
            }
            return Arrays.deepEquals((Object[])h, (Object[])d5.H);
        }
        else {
            final List<Object> i = this.I;
            if (i != null) {
                final List<Object> j = d5.I;
                if (j != null) {
                    return i.equals(j);
                }
            }
            try {
                return Arrays.equals(this.a(), d5.a());
            }
            catch (IOException cause) {
                throw new IllegalStateException(cause);
            }
        }
    }
    
    @Override
    public final int hashCode() {
        try {
            return Arrays.hashCode(this.a()) + 527;
        }
        catch (IOException cause) {
            throw new IllegalStateException(cause);
        }
    }
}
