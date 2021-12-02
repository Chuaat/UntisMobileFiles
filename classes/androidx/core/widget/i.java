// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.widget;

import androidx.annotation.a1;
import androidx.annotation.k0;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.content.Context;
import android.widget.ProgressBar;

public class i extends ProgressBar
{
    private static final int M = 500;
    private static final int N = 500;
    long G;
    boolean H;
    boolean I;
    boolean J;
    private final Runnable K;
    private final Runnable L;
    
    public i(@j0 final Context context) {
        this(context, null);
    }
    
    public i(@j0 final Context context, @k0 final AttributeSet set) {
        super(context, set, 0);
        this.G = -1L;
        this.H = false;
        this.I = false;
        this.J = false;
        this.K = new e(this);
        this.L = new g(this);
    }
    
    @a1
    private void f() {
        this.J = true;
        this.removeCallbacks(this.L);
        this.I = false;
        final long currentTimeMillis = System.currentTimeMillis();
        final long g = this.G;
        final long n = currentTimeMillis - g;
        if (n < 500L && g != -1L) {
            if (!this.H) {
                this.postDelayed(this.K, 500L - n);
                this.H = true;
            }
        }
        else {
            this.setVisibility(8);
        }
    }
    
    private void i() {
        this.removeCallbacks(this.K);
        this.removeCallbacks(this.L);
    }
    
    @a1
    private void k() {
        this.G = -1L;
        this.J = false;
        this.removeCallbacks(this.K);
        this.H = false;
        if (!this.I) {
            this.postDelayed(this.L, 500L);
            this.I = true;
        }
    }
    
    public void e() {
        this.post((Runnable)new f(this));
    }
    
    public void j() {
        this.post((Runnable)new h(this));
    }
    
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.i();
    }
    
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.i();
    }
}
