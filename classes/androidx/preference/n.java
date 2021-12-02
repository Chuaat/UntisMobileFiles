// 
// Decompiled by Procyon v0.5.36
// 

package androidx.preference;

import androidx.annotation.y;
import androidx.annotation.t0;
import android.view.View;
import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;

public class n extends g0
{
    private final SparseArray<View> a;
    private boolean b;
    private boolean c;
    
    n(final View view) {
        super(view);
        final SparseArray a = new SparseArray(4);
        (this.a = (SparseArray<View>)a).put(16908310, (Object)view.findViewById(16908310));
        a.put(16908304, (Object)view.findViewById(16908304));
        a.put(16908294, (Object)view.findViewById(16908294));
        final int z0 = androidx.preference.o.g.z0;
        a.put(z0, (Object)view.findViewById(z0));
        a.put(16908350, (Object)view.findViewById(16908350));
    }
    
    @t0({ t0.a.K })
    public static n a(final View view) {
        return new n(view);
    }
    
    public View b(@androidx.annotation.y final int n) {
        final View view = (View)this.a.get(n);
        if (view != null) {
            return view;
        }
        final View viewById = super.itemView.findViewById(n);
        if (viewById != null) {
            this.a.put(n, (Object)viewById);
        }
        return viewById;
    }
    
    public boolean c() {
        return this.b;
    }
    
    public boolean d() {
        return this.c;
    }
    
    public void e(final boolean b) {
        this.b = b;
    }
    
    public void f(final boolean c) {
        this.c = c;
    }
}
