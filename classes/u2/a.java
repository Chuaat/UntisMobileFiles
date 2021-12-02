// 
// Decompiled by Procyon v0.5.36
// 

package u2;

import com.google.android.material.internal.b0;
import android.view.View;
import android.graphics.Color;
import androidx.core.graphics.h;
import androidx.annotation.l;
import com.google.android.material.resources.b;
import androidx.annotation.j0;
import android.content.Context;

public class a
{
    private static final float e = 4.5f;
    private static final float f = 2.0f;
    private final boolean a;
    private final int b;
    private final int c;
    private final float d;
    
    public a(@j0 final Context context) {
        this.a = com.google.android.material.resources.b.b(context, o2.a.c.H4, false);
        this.b = s2.a.b(context, o2.a.c.G4, 0);
        this.c = s2.a.b(context, o2.a.c.P2, 0);
        this.d = context.getResources().getDisplayMetrics().density;
    }
    
    private boolean m(@l final int n) {
        return h.B(n, 255) == this.c;
    }
    
    public int a(final float n) {
        return Math.round(this.b(n) * 255.0f);
    }
    
    public float b(final float n) {
        final float d = this.d;
        if (d > 0.0f && n > 0.0f) {
            return Math.min(((float)Math.log1p(n / d) * 4.5f + 2.0f) / 100.0f, 1.0f);
        }
        return 0.0f;
    }
    
    @l
    public int c(@l final int n, float b) {
        b = this.b(b);
        return h.B(s2.a.h(h.B(n, 255), this.b, b), Color.alpha(n));
    }
    
    @l
    public int d(@l final int n, final float n2, @j0 final View view) {
        return this.c(n, n2 + this.i(view));
    }
    
    @l
    public int e(@l final int n, final float n2) {
        int c = n;
        if (this.a) {
            c = n;
            if (this.m(n)) {
                c = this.c(n, n2);
            }
        }
        return c;
    }
    
    @l
    public int f(@l final int n, final float n2, @j0 final View view) {
        return this.e(n, n2 + this.i(view));
    }
    
    @l
    public int g(final float n) {
        return this.e(this.c, n);
    }
    
    @l
    public int h(final float n, @j0 final View view) {
        return this.g(n + this.i(view));
    }
    
    public float i(@j0 final View view) {
        return b0.i(view);
    }
    
    @l
    public int j() {
        return this.b;
    }
    
    @l
    public int k() {
        return this.c;
    }
    
    public boolean l() {
        return this.a;
    }
}
