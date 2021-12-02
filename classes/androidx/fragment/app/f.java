// 
// Decompiled by Procyon v0.5.36
// 

package androidx.fragment.app;

import android.view.View;
import androidx.annotation.y;
import androidx.annotation.k0;
import android.os.Bundle;
import androidx.annotation.j0;
import android.content.Context;

public abstract class f
{
    @Deprecated
    @j0
    public Fragment b(@j0 final Context context, @j0 final String s, @k0 final Bundle bundle) {
        return Fragment.instantiate(context, s, bundle);
    }
    
    @k0
    public abstract View c(@y final int p0);
    
    public abstract boolean d();
}
