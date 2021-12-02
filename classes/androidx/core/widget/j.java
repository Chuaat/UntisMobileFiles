// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.widget;

import android.graphics.Canvas;
import android.os.Build$VERSION;
import androidx.annotation.j0;
import android.content.Context;
import android.widget.EdgeEffect;

public final class j
{
    private EdgeEffect a;
    
    @Deprecated
    public j(final Context context) {
        this.a = new EdgeEffect(context);
    }
    
    public static void e(@j0 final EdgeEffect edgeEffect, final float n, final float n2) {
        if (Build$VERSION.SDK_INT >= 21) {
            edgeEffect.onPull(n, n2);
        }
        else {
            edgeEffect.onPull(n);
        }
    }
    
    @Deprecated
    public boolean a(final Canvas canvas) {
        return this.a.draw(canvas);
    }
    
    @Deprecated
    public void b() {
        this.a.finish();
    }
    
    @Deprecated
    public boolean c() {
        return this.a.isFinished();
    }
    
    @Deprecated
    public boolean d(final int n) {
        this.a.onAbsorb(n);
        return true;
    }
    
    @Deprecated
    public boolean f(final float n) {
        this.a.onPull(n);
        return true;
    }
    
    @Deprecated
    public boolean g(final float n, final float n2) {
        e(this.a, n, n2);
        return true;
    }
    
    @Deprecated
    public boolean h() {
        this.a.onRelease();
        return this.a.isFinished();
    }
    
    @Deprecated
    public void i(final int n, final int n2) {
        this.a.setSize(n, n2);
    }
}
