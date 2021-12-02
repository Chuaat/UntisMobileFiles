// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.cct.internal;

import android.util.SparseArray;
import com.google.auto.value.AutoValue$Builder;
import androidx.annotation.k0;
import androidx.annotation.j0;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class o
{
    @j0
    public static a a() {
        return (a)new i.b();
    }
    
    @k0
    public abstract b b();
    
    @k0
    public abstract c c();
    
    @AutoValue$Builder
    public abstract static class a
    {
        @j0
        public abstract o a();
        
        @j0
        public abstract a b(@k0 final b p0);
        
        @j0
        public abstract a c(@k0 final c p0);
    }
    
    public enum b
    {
        H(0), 
        I(1), 
        J(2), 
        K(3), 
        L(4), 
        M(5), 
        N(6), 
        O(7), 
        P(8), 
        Q(9), 
        R(10), 
        S(11), 
        T(12), 
        U(13), 
        V(14), 
        W(15), 
        X(16), 
        Y(17), 
        Z(18), 
        a0(19), 
        b0(100);
        
        private static final SparseArray<b> c0;
        private final int G;
        
        static {
            final SparseArray c = new SparseArray();
            final b b;
            (c0 = c).put(0, (Object)b);
            final b b2;
            c.put(1, (Object)b2);
            final b b3;
            c.put(2, (Object)b3);
            final b b4;
            c.put(3, (Object)b4);
            final b b5;
            c.put(4, (Object)b5);
            final b b6;
            c.put(5, (Object)b6);
            final b b7;
            c.put(6, (Object)b7);
            final b b8;
            c.put(7, (Object)b8);
            final b b9;
            c.put(8, (Object)b9);
            final b b10;
            c.put(9, (Object)b10);
            final b b11;
            c.put(10, (Object)b11);
            final b b12;
            c.put(11, (Object)b12);
            final b b13;
            c.put(12, (Object)b13);
            final b b14;
            c.put(13, (Object)b14);
            final b b15;
            c.put(14, (Object)b15);
            final b b16;
            c.put(15, (Object)b16);
            final b b17;
            c.put(16, (Object)b17);
            final b b18;
            c.put(17, (Object)b18);
            final b b19;
            c.put(18, (Object)b19);
            final b b20;
            c.put(19, (Object)b20);
        }
        
        private b(final int g) {
            this.G = g;
        }
        
        @k0
        public static b b(final int n) {
            return (b)b.c0.get(n);
        }
        
        public int d() {
            return this.G;
        }
    }
    
    public enum c
    {
        H(0), 
        I(1), 
        J(2), 
        K(3), 
        L(4), 
        M(5), 
        N(6), 
        O(7), 
        P(8), 
        Q(9), 
        R(10), 
        S(11), 
        T(12), 
        U(13), 
        V(14), 
        W(15), 
        X(16), 
        Y(17), 
        Z(-1);
        
        private static final SparseArray<c> a0;
        private final int G;
        
        static {
            final SparseArray a = new SparseArray();
            final c c;
            (a0 = a).put(0, (Object)c);
            final c c2;
            a.put(1, (Object)c2);
            final c c3;
            a.put(2, (Object)c3);
            final c c4;
            a.put(3, (Object)c4);
            final c c5;
            a.put(4, (Object)c5);
            final c c6;
            a.put(5, (Object)c6);
            final c c7;
            a.put(6, (Object)c7);
            final c c8;
            a.put(7, (Object)c8);
            final c c9;
            a.put(8, (Object)c9);
            final c c10;
            a.put(9, (Object)c10);
            final c c11;
            a.put(10, (Object)c11);
            final c c12;
            a.put(11, (Object)c12);
            final c c13;
            a.put(12, (Object)c13);
            final c c14;
            a.put(13, (Object)c14);
            final c c15;
            a.put(14, (Object)c15);
            final c c16;
            a.put(15, (Object)c16);
            final c c17;
            a.put(16, (Object)c17);
            final c c18;
            a.put(17, (Object)c18);
            final c c19;
            a.put(-1, (Object)c19);
        }
        
        private c(final int g) {
            this.G = g;
        }
        
        @k0
        public static c b(final int n) {
            return (c)c.a0.get(n);
        }
        
        public int d() {
            return this.G;
        }
    }
}
