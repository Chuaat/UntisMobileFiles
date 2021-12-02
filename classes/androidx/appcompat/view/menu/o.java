// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.view.menu;

import android.graphics.drawable.Drawable;
import androidx.annotation.t0;

@t0({ t0.a.I })
public interface o
{
    void e(final g p0);
    
    int getWindowAnimations();
    
    public interface a
    {
        void b(final boolean p0, final char p1);
        
        boolean d();
        
        boolean f();
        
        void g(final j p0, final int p1);
        
        j getItemData();
        
        void setCheckable(final boolean p0);
        
        void setChecked(final boolean p0);
        
        void setEnabled(final boolean p0);
        
        void setIcon(final Drawable p0);
        
        void setTitle(final CharSequence p0);
    }
}
