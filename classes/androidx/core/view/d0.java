// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.view;

import java.util.Objects;
import androidx.annotation.j0;
import android.view.ViewTreeObserver;
import android.view.View;
import android.view.View$OnAttachStateChangeListener;
import android.view.ViewTreeObserver$OnPreDrawListener;

public final class d0 implements ViewTreeObserver$OnPreDrawListener, View$OnAttachStateChangeListener
{
    private final View G;
    private ViewTreeObserver H;
    private final Runnable I;
    
    private d0(final View g, final Runnable i) {
        this.G = g;
        this.H = g.getViewTreeObserver();
        this.I = i;
    }
    
    @j0
    public static d0 a(@j0 final View obj, @j0 final Runnable obj2) {
        Objects.requireNonNull(obj, "view == null");
        Objects.requireNonNull(obj2, "runnable == null");
        final d0 d0 = new d0(obj, obj2);
        obj.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)d0);
        obj.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)d0);
        return d0;
    }
    
    public void b() {
        ViewTreeObserver viewTreeObserver;
        if (this.H.isAlive()) {
            viewTreeObserver = this.H;
        }
        else {
            viewTreeObserver = this.G.getViewTreeObserver();
        }
        viewTreeObserver.removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
        this.G.removeOnAttachStateChangeListener((View$OnAttachStateChangeListener)this);
    }
    
    public boolean onPreDraw() {
        this.b();
        this.I.run();
        return true;
    }
    
    public void onViewAttachedToWindow(final View view) {
        this.H = view.getViewTreeObserver();
    }
    
    public void onViewDetachedFromWindow(final View view) {
        this.b();
    }
}
