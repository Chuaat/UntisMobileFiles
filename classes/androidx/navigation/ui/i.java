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
class i extends a
{
    private final WeakReference<com.google.android.material.appbar.a> f;
    private final WeakReference<Toolbar> g;
    
    i(@j0 final com.google.android.material.appbar.a referent, @j0 final Toolbar referent2, @j0 final d d) {
        super(referent.getContext(), d);
        this.f = new WeakReference<com.google.android.material.appbar.a>(referent);
        this.g = new WeakReference<Toolbar>(referent2);
    }
    
    @Override
    public void a(@j0 final NavController navController, @j0 final a0 a0, @k0 final Bundle bundle) {
        final com.google.android.material.appbar.a a2 = this.f.get();
        final Toolbar toolbar = this.g.get();
        if (a2 != null && toolbar != null) {
            super.a(navController, a0, bundle);
            return;
        }
        navController.L((NavController.b)this);
    }
    
    @Override
    protected void c(final Drawable navigationIcon, @w0 final int navigationContentDescription) {
        final Toolbar toolbar = this.g.get();
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
        final com.google.android.material.appbar.a a = this.f.get();
        if (a != null) {
            a.setTitle(title);
        }
    }
}
