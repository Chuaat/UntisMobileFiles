// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

import androidx.appcompat.view.d;
import androidx.annotation.j0;
import android.view.LayoutInflater;
import android.content.Context;
import androidx.annotation.k0;
import android.content.res.Resources$Theme;
import android.widget.SpinnerAdapter;

public interface q0 extends SpinnerAdapter
{
    @k0
    Resources$Theme getDropDownViewTheme();
    
    void setDropDownViewTheme(@k0 final Resources$Theme p0);
    
    public static final class a
    {
        private final Context a;
        private final LayoutInflater b;
        private LayoutInflater c;
        
        public a(@j0 final Context a) {
            this.a = a;
            this.b = LayoutInflater.from(a);
        }
        
        @j0
        public LayoutInflater a() {
            LayoutInflater layoutInflater = this.c;
            if (layoutInflater == null) {
                layoutInflater = this.b;
            }
            return layoutInflater;
        }
        
        @k0
        public Resources$Theme b() {
            final LayoutInflater c = this.c;
            Resources$Theme theme;
            if (c == null) {
                theme = null;
            }
            else {
                theme = c.getContext().getTheme();
            }
            return theme;
        }
        
        public void c(@k0 final Resources$Theme resources$Theme) {
            LayoutInflater c;
            if (resources$Theme == null) {
                c = null;
            }
            else if (resources$Theme == this.a.getTheme()) {
                c = this.b;
            }
            else {
                c = LayoutInflater.from((Context)new d(this.a, resources$Theme));
            }
            this.c = c;
        }
    }
}
