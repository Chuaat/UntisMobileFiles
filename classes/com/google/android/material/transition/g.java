// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.transition;

import android.graphics.RectF;

class g
{
    private static final f a;
    private static final f b;
    
    static {
        a = new f() {
            @Override
            public h a(float p7, float n, float n2, final float n3, final float n4, final float n5, final float n6) {
                p7 = u.p(n3, n5, n, n2, p7, true);
                n = p7 / n3;
                n2 = p7 / n5;
                return new h(n, n2, p7, n4 * n, p7, n6 * n2);
            }
            
            @Override
            public boolean b(final h h) {
                return h.d > h.f;
            }
            
            @Override
            public void c(final RectF rectF, final float n, final h h) {
                rectF.bottom -= Math.abs(h.f - h.d) * n;
            }
        };
        b = new f() {
            @Override
            public h a(float p7, float n, float n2, final float n3, final float n4, final float n5, final float n6) {
                p7 = u.p(n4, n6, n, n2, p7, true);
                n = p7 / n4;
                n2 = p7 / n6;
                return new h(n, n2, n3 * n, p7, n5 * n2, p7);
            }
            
            @Override
            public boolean b(final h h) {
                return h.c > h.e;
            }
            
            @Override
            public void c(final RectF rectF, float n, final h h) {
                final float abs = Math.abs(h.e - h.c);
                final float left = rectF.left;
                n *= abs / 2.0f;
                rectF.left = left + n;
                rectF.right -= n;
            }
        };
    }
    
    private g() {
    }
    
    static f a(final int i, final boolean b, final RectF rectF, final RectF rectF2) {
        if (i == 0) {
            f f;
            if (b(b, rectF, rectF2)) {
                f = g.a;
            }
            else {
                f = g.b;
            }
            return f;
        }
        if (i == 1) {
            return g.a;
        }
        if (i == 2) {
            return g.b;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Invalid fit mode: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
    
    private static boolean b(final boolean b, final RectF rectF, final RectF rectF2) {
        final float width = rectF.width();
        final float height = rectF.height();
        final float width2 = rectF2.width();
        final float height2 = rectF2.height();
        final float n = height2 * width / width2;
        final float n2 = width2 * height / width;
        final boolean b2 = true;
        return (b ? (n >= height) : (n2 >= height2)) && b2;
    }
}
