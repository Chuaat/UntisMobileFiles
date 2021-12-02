// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.util.Arrays;

public final class g6 extends a5<g6> implements Cloneable
{
    private byte[] I;
    private String J;
    private byte[][] K;
    private boolean L;
    
    public g6() {
        this.I = i5.l;
        this.J = "";
        this.K = i5.k;
        this.L = false;
        super.H = null;
        super.G = -1;
    }
    
    private final g6 i() {
        try {
            final g6 g6 = super.g();
            final byte[][] k = this.K;
            if (k != null && k.length > 0) {
                g6.K = k.clone();
            }
            return g6;
        }
        catch (CloneNotSupportedException detailMessage) {
            throw new AssertionError((Object)detailMessage);
        }
    }
    
    @Override
    public final void a(final y4 y4) throws IOException {
        if (!Arrays.equals(this.I, i5.l)) {
            y4.d(1, this.I);
        }
        final byte[][] k = this.K;
        if (k != null && k.length > 0) {
            int n = 0;
            while (true) {
                final byte[][] i = this.K;
                if (n >= i.length) {
                    break;
                }
                final byte[] array = i[n];
                if (array != null) {
                    y4.d(2, array);
                }
                ++n;
            }
        }
        final String j = this.J;
        if (j != null && !j.equals("")) {
            y4.c(4, this.J);
        }
        super.a(y4);
    }
    
    @Override
    protected final int d() {
        int d;
        final int n = d = super.d();
        if (!Arrays.equals(this.I, i5.l)) {
            d = n + y4.i(1, this.I);
        }
        final byte[][] k = this.K;
        int n2 = d;
        if (k != null) {
            n2 = d;
            if (k.length > 0) {
                int n3 = 0;
                int n4 = 0;
                int n5 = 0;
                while (true) {
                    final byte[][] i = this.K;
                    if (n3 >= i.length) {
                        break;
                    }
                    final byte[] array = i[n3];
                    int n6 = n4;
                    int n7 = n5;
                    if (array != null) {
                        n7 = n5 + 1;
                        n6 = n4 + y4.s(array);
                    }
                    ++n3;
                    n4 = n6;
                    n5 = n7;
                }
                n2 = d + n4 + n5 * 1;
            }
        }
        final String j = this.J;
        int n8 = n2;
        if (j != null) {
            n8 = n2;
            if (!j.equals("")) {
                n8 = n2 + y4.h(4, this.J);
            }
        }
        return n8;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof g6)) {
            return false;
        }
        final g6 g6 = (g6)o;
        if (!Arrays.equals(this.I, g6.I)) {
            return false;
        }
        final String j = this.J;
        if (j == null) {
            if (g6.J != null) {
                return false;
            }
        }
        else if (!j.equals(g6.J)) {
            return false;
        }
        if (!e5.i(this.K, g6.K)) {
            return false;
        }
        final c5 h = super.H;
        if (h != null && !h.a()) {
            return super.H.equals(g6.H);
        }
        final c5 h2 = g6.H;
        return h2 == null || h2.a();
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = g6.class.getName().hashCode();
        final int hashCode2 = Arrays.hashCode(this.I);
        final String j = this.J;
        final int n = 0;
        int hashCode3;
        if (j == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = j.hashCode();
        }
        final int g = e5.g(this.K);
        final c5 h = super.H;
        int hashCode4 = n;
        if (h != null) {
            if (h.a()) {
                hashCode4 = n;
            }
            else {
                hashCode4 = super.H.hashCode();
            }
        }
        return (((((hashCode + 527) * 31 + hashCode2) * 31 + hashCode3) * 31 + g) * 31 + 1237) * 31 + hashCode4;
    }
}
