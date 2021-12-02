// 
// Decompiled by Procyon v0.5.36
// 

package androidx.navigation.ui;

import android.view.ViewGroup;
import androidx.annotation.w0;
import android.graphics.drawable.Drawable;
import androidx.annotation.k0;
import android.os.Bundle;
import androidx.navigation.a0;
import androidx.navigation.NavController;
import androidx.annotation.j0;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import androidx.annotation.t0;

@t0({ t0.a.G })
class p extends a
{
    private final WeakReference<Toolbar> f;
    
    p(@j0 final Toolbar referent, @j0 final d d) {
        super(referent.getContext(), d);
        this.f = new WeakReference<Toolbar>(referent);
    }
    
    @Override
    public void a(@j0 final NavController navController, @j0 final a0 a0, @k0 final Bundle bundle) {
        if (this.f.get() == null) {
            navController.L((NavController.b)this);
            return;
        }
        super.a(navController, a0, bundle);
    }
    
    @Override
    protected void c(final Drawable navigationIcon, @w0 final int navigationContentDescription) {
        final Toolbar toolbar = this.f.get();
        if (toolbar != null) {
            final boolean b = navigationIcon == null && toolbar.getNavigationIcon() != null;
            toolbar.setNavigationIcon(navigationIcon);
            toolbar.setNavigationContentDescription(navigationContentDescription);
            if (b) {
                androidx.transition.j0.a(toolbar);
            }
        }
    }
    
    @Override
    protected void d(final CharSequence title) {
        this.f.get().setTitle(title);
    }
}
