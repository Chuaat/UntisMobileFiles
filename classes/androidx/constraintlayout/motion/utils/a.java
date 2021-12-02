// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.motion.utils;

import androidx.constraintlayout.core.motion.utils.p;
import androidx.constraintlayout.core.motion.utils.s;
import androidx.constraintlayout.motion.widget.r;

public class a extends r
{
    private s a;
    private p b;
    private androidx.constraintlayout.core.motion.utils.r c;
    
    public a() {
        final s s = new s();
        this.a = s;
        this.c = s;
    }
    
    @Override
    public float a() {
        return this.c.a();
    }
    
    public void b(final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        ((s)(this.c = this.a)).f(n, n2, n3, n4, n5, n6);
    }
    
    public String c(final String s, final float n) {
        return this.c.b(s, n);
    }
    
    public float d(final float n) {
        return this.c.c(n);
    }
    
    public boolean e() {
        return this.c.d();
    }
    
    public void f(final float n, final float n2, final float n3, final float n4, final float n5, final float n6, final float n7, final int n8) {
        if (this.b == null) {
            this.b = new p();
        }
        ((p)(this.c = this.b)).h(n, n2, n3, n4, n5, n6, n7, n8);
    }
    
    @Override
    public float getInterpolation(final float n) {
        return this.c.getInterpolation(n);
    }
}
