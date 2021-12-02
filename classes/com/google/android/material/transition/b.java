// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.transition;

class b
{
    private static final a a;
    private static final a b;
    private static final a c;
    private static final a d;
    
    static {
        a = new a() {
            @Override
            public c a(final float n, final float n2, final float n3, final float n4) {
                return com.google.android.material.transition.c.a(255, u.q(0, 255, n2, n3, n));
            }
        };
        b = new a() {
            @Override
            public c a(final float n, final float n2, final float n3, final float n4) {
                return com.google.android.material.transition.c.b(u.q(255, 0, n2, n3, n), 255);
            }
        };
        c = new a() {
            @Override
            public c a(final float n, final float n2, final float n3, final float n4) {
                return com.google.android.material.transition.c.b(u.q(255, 0, n2, n3, n), u.q(0, 255, n2, n3, n));
            }
        };
        d = new a() {
            @Override
            public c a(final float n, final float n2, final float n3, float n4) {
                n4 = (n3 - n2) * n4 + n2;
                return com.google.android.material.transition.c.b(u.q(255, 0, n2, n4, n), u.q(0, 255, n4, n3, n));
            }
        };
    }
    
    private b() {
    }
    
    static a a(final int i, final boolean b) {
        if (i == 0) {
            a a;
            if (b) {
                a = b.a;
            }
            else {
                a = b.b;
            }
            return a;
        }
        if (i == 1) {
            a a2;
            if (b) {
                a2 = b.b;
            }
            else {
                a2 = b.a;
            }
            return a2;
        }
        if (i == 2) {
            return b.c;
        }
        if (i == 3) {
            return b.d;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Invalid fade mode: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
