// 
// Decompiled by Procyon v0.5.36
// 

package androidx.lifecycle;

import android.app.Application;
import androidx.fragment.app.d;
import androidx.annotation.k0;
import androidx.annotation.g0;
import androidx.annotation.j0;
import androidx.fragment.app.Fragment;

@Deprecated
public class b1
{
    @Deprecated
    public b1() {
    }
    
    @Deprecated
    @g0
    @j0
    public static z0 a(@j0 final Fragment fragment) {
        return new z0(fragment);
    }
    
    @Deprecated
    @g0
    @j0
    public static z0 b(@j0 final Fragment fragment, @k0 final z0.b b) {
        z0.b defaultViewModelProviderFactory = b;
        if (b == null) {
            defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
        }
        return new z0(fragment.getViewModelStore(), defaultViewModelProviderFactory);
    }
    
    @Deprecated
    @g0
    @j0
    public static z0 c(@j0 final d d) {
        return new z0(d);
    }
    
    @Deprecated
    @g0
    @j0
    public static z0 d(@j0 final d d, @k0 final z0.b b) {
        z0.b defaultViewModelProviderFactory = b;
        if (b == null) {
            defaultViewModelProviderFactory = d.getDefaultViewModelProviderFactory();
        }
        return new z0(d.getViewModelStore(), defaultViewModelProviderFactory);
    }
    
    @Deprecated
    public static class a extends z0.a
    {
        @Deprecated
        public a(@j0 final Application application) {
            super(application);
        }
    }
}
