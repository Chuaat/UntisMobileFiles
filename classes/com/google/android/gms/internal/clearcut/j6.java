// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import java.io.IOException;

public final class j6 extends a5<j6> implements Cloneable
{
    private static volatile j6[] K;
    private String I;
    private String J;
    
    public j6() {
        this.I = "";
        this.J = "";
        super.H = null;
        super.G = -1;
    }
    
    public static j6[] i() {
        if (j6.K == null) {
            synchronized (e5.c) {
                if (j6.K == null) {
                    j6.K = new j6[0];
                }
            }
        }
        return j6.K;
    }
    
    private final j6 j() {
        try {
            return super.g();
        }
        catch (CloneNotSupportedException detailMessage) {
            throw new AssertionError((Object)detailMessage);
        }
    }
    
    @Override
    public final void a(final y4 y4) throws IOException {
        final String i = this.I;
        if (i != null && !i.equals("")) {
            y4.c(1, this.I);
        }
        final String j = this.J;
        if (j != null && !j.equals("")) {
            y4.c(2, this.J);
        }
        super.a(y4);
    }
    
    @Override
    protected final int d() {
        final int d = super.d();
        final String i = this.I;
        int n = d;
        if (i != null) {
            n = d;
            if (!i.equals("")) {
                n = d + y4.h(1, this.I);
            }
        }
        final String j = this.J;
        int n2 = n;
        if (j != null) {
            n2 = n;
            if (!j.equals("")) {
                n2 = n + y4.h(2, this.J);
            }
        }
        return n2;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof j6)) {
            return false;
        }
        final j6 j6 = (j6)o;
        final String i = this.I;
        if (i == null) {
            if (j6.I != null) {
                return false;
            }
        }
        else if (!i.equals(j6.I)) {
            return false;
        }
        final String k = this.J;
        if (k == null) {
            if (j6.J != null) {
                return false;
            }
        }
        else if (!k.equals(j6.J)) {
            return false;
        }
        final c5 h = super.H;
        if (h != null && !h.a()) {
            return super.H.equals(j6.H);
        }
        final c5 h2 = j6.H;
        return h2 == null || h2.a();
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = j6.class.getName().hashCode();
        final String i = this.I;
        final int n = 0;
        int hashCode2;
        if (i == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = i.hashCode();
        }
        final String j = this.J;
        int hashCode3;
        if (j == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = j.hashCode();
        }
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
        return (((hashCode + 527) * 31 + hashCode2) * 31 + hashCode3) * 31 + hashCode4;
    }
}
