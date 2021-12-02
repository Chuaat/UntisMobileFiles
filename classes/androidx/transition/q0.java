// 
// Decompiled by Procyon v0.5.36
// 

package androidx.transition;

import androidx.annotation.j0;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;

class q0 extends v0 implements s0
{
    q0(final Context context, final ViewGroup viewGroup, final View view) {
        super(context, viewGroup, view);
    }
    
    static q0 g(final ViewGroup viewGroup) {
        return (q0)v0.e((View)viewGroup);
    }
    
    @Override
    public void c(@j0 final View view) {
        super.a.b(view);
    }
    
    @Override
    public void d(@j0 final View view) {
        super.a.h(view);
    }
}
