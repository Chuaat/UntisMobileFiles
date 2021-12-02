// 
// Decompiled by Procyon v0.5.36
// 

package androidx.vectordrawable.graphics.drawable;

import androidx.annotation.p0;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Animatable2$AnimationCallback;
import androidx.annotation.j0;
import android.graphics.drawable.Animatable;

public interface b extends Animatable
{
    void b(@j0 final a p0);
    
    void c();
    
    boolean d(@j0 final a p0);
    
    public abstract static class a
    {
        Animatable2$AnimationCallback a;
        
        @p0(23)
        Animatable2$AnimationCallback a() {
            if (this.a == null) {
                this.a = new Animatable2$AnimationCallback() {
                    public void onAnimationEnd(final Drawable drawable) {
                        b.a.this.b(drawable);
                    }
                    
                    public void onAnimationStart(final Drawable drawable) {
                        b.a.this.c(drawable);
                    }
                };
            }
            return this.a;
        }
        
        public void b(final Drawable drawable) {
        }
        
        public void c(final Drawable drawable) {
        }
    }
}
