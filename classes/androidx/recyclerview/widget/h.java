// 
// Decompiled by Procyon v0.5.36
// 

package androidx.recyclerview.widget;

import android.view.ViewGroup;
import java.util.Collections;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import androidx.annotation.j0;

public final class h extends RecyclerView.h<g0>
{
    static final String b = "ConcatAdapter";
    private final androidx.recyclerview.widget.i a;
    
    public h(@j0 final a a, @j0 final List<? extends RecyclerView.h<? extends g0>> list) {
        this.a = new androidx.recyclerview.widget.i(this, a);
        final Iterator<? extends RecyclerView.h<? extends g0>> iterator = list.iterator();
        while (iterator.hasNext()) {
            this.i((RecyclerView.h<? extends g0>)iterator.next());
        }
        super.setHasStableIds(this.a.w());
    }
    
    @SafeVarargs
    public h(@j0 final a a, @j0 final RecyclerView.h<? extends g0>... a2) {
        this(a, Arrays.asList(a2));
    }
    
    public h(@j0 final List<? extends RecyclerView.h<? extends g0>> list) {
        this(h.a.c, list);
    }
    
    @SafeVarargs
    public h(@j0 final RecyclerView.h<? extends g0>... array) {
        this(h.a.c, array);
    }
    
    @Override
    public int findRelativeAdapterPositionIn(@j0 final RecyclerView.h<? extends g0> h, @j0 final g0 g0, final int n) {
        return this.a.t(h, g0, n);
    }
    
    @Override
    public int getItemCount() {
        return this.a.u();
    }
    
    @Override
    public long getItemId(final int n) {
        return this.a.r(n);
    }
    
    @Override
    public int getItemViewType(final int n) {
        return this.a.s(n);
    }
    
    public boolean h(final int n, @j0 final RecyclerView.h<? extends g0> h) {
        return this.a.h(n, (RecyclerView.h<g0>)h);
    }
    
    public boolean i(@j0 final RecyclerView.h<? extends g0> h) {
        return this.a.i((RecyclerView.h<g0>)h);
    }
    
    @j0
    public List<? extends RecyclerView.h<? extends g0>> j() {
        return Collections.unmodifiableList((List<? extends RecyclerView.h<? extends g0>>)this.a.q());
    }
    
    void k(@j0 final RecyclerView.h.a stateRestorationPolicy) {
        super.setStateRestorationPolicy(stateRestorationPolicy);
    }
    
    public boolean l(@j0 final RecyclerView.h<? extends g0> h) {
        return this.a.I((RecyclerView.h<g0>)h);
    }
    
    @Override
    public void onAttachedToRecyclerView(@j0 final RecyclerView recyclerView) {
        this.a.z(recyclerView);
    }
    
    @Override
    public void onBindViewHolder(@j0 final g0 g0, final int n) {
        this.a.A(g0, n);
    }
    
    @j0
    @Override
    public g0 onCreateViewHolder(@j0 final ViewGroup viewGroup, final int n) {
        return this.a.B(viewGroup, n);
    }
    
    @Override
    public void onDetachedFromRecyclerView(@j0 final RecyclerView recyclerView) {
        this.a.C(recyclerView);
    }
    
    @Override
    public boolean onFailedToRecycleView(@j0 final g0 g0) {
        return this.a.D(g0);
    }
    
    @Override
    public void onViewAttachedToWindow(@j0 final g0 g0) {
        this.a.E(g0);
    }
    
    @Override
    public void onViewDetachedFromWindow(@j0 final g0 g0) {
        this.a.F(g0);
    }
    
    @Override
    public void onViewRecycled(@j0 final g0 g0) {
        this.a.G(g0);
    }
    
    @Override
    public void setHasStableIds(final boolean b) {
        throw new UnsupportedOperationException("Calling setHasStableIds is not allowed on the ConcatAdapter. Use the Config object passed in the constructor to control this behavior");
    }
    
    @Override
    public void setStateRestorationPolicy(@j0 final RecyclerView.h.a a) {
        throw new UnsupportedOperationException("Calling setStateRestorationPolicy is not allowed on the ConcatAdapter. This value is inferred from added adapters");
    }
    
    public static final class a
    {
        @j0
        public static final h.a c;
        public final boolean a;
        @j0
        public final b b;
        
        static {
            c = new h.a(true, b.G);
        }
        
        a(final boolean a, @j0 final b b) {
            this.a = a;
            this.b = b;
        }
        
        public static final class a
        {
            private boolean a;
            private b b;
            
            public a() {
                final h.a c = h.a.c;
                this.a = c.a;
                this.b = c.b;
            }
            
            @j0
            public h.a a() {
                return new h.a(this.a, this.b);
            }
            
            @j0
            public a b(final boolean a) {
                this.a = a;
                return this;
            }
            
            @j0
            public a c(@j0 final b b) {
                this.b = b;
                return this;
            }
        }
        
        public enum b
        {
            G, 
            H, 
            I;
        }
    }
}
