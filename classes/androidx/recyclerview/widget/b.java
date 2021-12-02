// 
// Decompiled by Procyon v0.5.36
// 

package androidx.recyclerview.widget;

import androidx.annotation.j0;

public final class b implements v
{
    @j0
    private final RecyclerView.h G;
    
    public b(@j0 final RecyclerView.h g) {
        this.G = g;
    }
    
    @Override
    public void a(final int n, final int n2) {
        this.G.notifyItemMoved(n, n2);
    }
    
    @Override
    public void b(final int n, final int n2) {
        this.G.notifyItemRangeInserted(n, n2);
    }
    
    @Override
    public void c(final int n, final int n2) {
        this.G.notifyItemRangeRemoved(n, n2);
    }
    
    @Override
    public void d(final int n, final int n2, final Object o) {
        this.G.notifyItemRangeChanged(n, n2, o);
    }
}
