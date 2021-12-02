// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.transition;

import android.graphics.Path$Op;
import android.graphics.RectF;
import android.graphics.Region$Op;
import android.os.Build$VERSION;
import android.graphics.Canvas;
import com.google.android.material.shape.o;
import com.google.android.material.shape.p;
import android.graphics.Path;

class j
{
    private final Path a;
    private final Path b;
    private final Path c;
    private final p d;
    private o e;
    
    j() {
        this.a = new Path();
        this.b = new Path();
        this.c = new Path();
        this.d = p.k();
    }
    
    void a(final Canvas canvas) {
        if (Build$VERSION.SDK_INT >= 23) {
            canvas.clipPath(this.a);
        }
        else {
            canvas.clipPath(this.b);
            canvas.clipPath(this.c, Region$Op.UNION);
        }
    }
    
    void b(final float n, o r, final o o, final RectF rectF, final RectF rectF2, final RectF rectF3, final l.e e) {
        r = u.r(r, o, rectF, rectF3, e.d(), e.c(), n);
        this.e = r;
        this.d.d(r, 1.0f, rectF2, this.b);
        this.d.d(this.e, 1.0f, rectF3, this.c);
        if (Build$VERSION.SDK_INT >= 23) {
            this.a.op(this.b, this.c, Path$Op.UNION);
        }
    }
    
    o c() {
        return this.e;
    }
    
    Path d() {
        return this.a;
    }
}
