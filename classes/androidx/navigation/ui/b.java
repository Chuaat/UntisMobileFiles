// 
// Decompiled by Procyon v0.5.36
// 

package androidx.navigation.ui;

import androidx.annotation.w0;
import android.graphics.drawable.Drawable;
import androidx.annotation.j0;
import androidx.appcompat.app.e;
import androidx.annotation.t0;

@t0({ t0.a.G })
class b extends a
{
    private final e f;
    
    b(@j0 final e f, @j0 final d d) {
        super(f.getDrawerToggleDelegate().e(), d);
        this.f = f;
    }
    
    @Override
    protected void c(final Drawable drawable, @w0 final int n) {
        final androidx.appcompat.app.a supportActionBar = this.f.getSupportActionBar();
        if (drawable == null) {
            supportActionBar.Y(false);
        }
        else {
            supportActionBar.Y(true);
            this.f.getDrawerToggleDelegate().a(drawable, n);
        }
    }
    
    @Override
    protected void d(final CharSequence charSequence) {
        this.f.getSupportActionBar().A0(charSequence);
    }
}
