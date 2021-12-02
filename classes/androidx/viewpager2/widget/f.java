// 
// Decompiled by Procyon v0.5.36
// 

package androidx.viewpager2.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.annotation.k0;
import android.view.View;
import java.util.Locale;
import androidx.recyclerview.widget.LinearLayoutManager;

final class f extends j
{
    private final LinearLayoutManager a;
    private m b;
    
    f(final LinearLayoutManager a) {
        this.a = a;
    }
    
    @Override
    public void a(final int n) {
    }
    
    @Override
    public void b(final int n, float n2, int i) {
        if (this.b == null) {
            return;
        }
        final float n3 = -n2;
        View p3;
        for (i = 0; i < ((RecyclerView.p)this.a).Q(); ++i) {
            p3 = ((RecyclerView.p)this.a).P(i);
            if (p3 == null) {
                throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", i, ((RecyclerView.p)this.a).Q()));
            }
            n2 = (float)(((RecyclerView.p)this.a).s0(p3) - n);
            this.b.a(p3, n2 + n3);
        }
    }
    
    @Override
    public void c(final int n) {
    }
    
    m d() {
        return this.b;
    }
    
    void e(@k0 final m b) {
        this.b = b;
    }
}
