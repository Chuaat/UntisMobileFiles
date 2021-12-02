// 
// Decompiled by Procyon v0.5.36
// 

package androidx.transition;

import android.view.View;
import android.graphics.drawable.Drawable;
import androidx.annotation.j0;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import androidx.annotation.p0;

@p0(18)
class r0 implements s0
{
    private final ViewGroupOverlay a;
    
    r0(@j0 final ViewGroup viewGroup) {
        this.a = viewGroup.getOverlay();
    }
    
    @Override
    public void a(@j0 final Drawable drawable) {
        this.a.add(drawable);
    }
    
    @Override
    public void b(@j0 final Drawable drawable) {
        this.a.remove(drawable);
    }
    
    @Override
    public void c(@j0 final View view) {
        this.a.add(view);
    }
    
    @Override
    public void d(@j0 final View view) {
        this.a.remove(view);
    }
}
