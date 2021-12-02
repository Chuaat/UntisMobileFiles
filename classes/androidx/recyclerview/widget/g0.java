// 
// Decompiled by Procyon v0.5.36
// 

package androidx.recyclerview.widget;

public abstract class g0<T2> extends b<T2>
{
    final RecyclerView.h G;
    
    public g0(final RecyclerView.h g) {
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
    
    @Override
    public void h(final int n, final int n2) {
        this.G.notifyItemRangeChanged(n, n2);
    }
}
