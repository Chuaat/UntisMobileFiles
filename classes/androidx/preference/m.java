// 
// Decompiled by Procyon v0.5.36
// 

package androidx.preference;

import androidx.annotation.j0;
import android.os.Bundle;
import androidx.core.view.accessibility.d;
import android.view.View;
import androidx.core.view.a;
import androidx.recyclerview.widget.RecyclerView;
import androidx.annotation.t0;
import androidx.recyclerview.widget.b0;

@Deprecated
@t0({ t0.a.I })
public class m extends b0
{
    final RecyclerView f;
    final androidx.core.view.a g;
    final androidx.core.view.a h;
    
    public m(final RecyclerView f) {
        super(f);
        this.g = super.n();
        this.h = new androidx.core.view.a() {
            @Override
            public void g(final View view, final d d) {
                m.this.g.g(view, d);
                final int p2 = m.this.f.p0(view);
                final RecyclerView.h adapter = m.this.f.getAdapter();
                if (!(adapter instanceof i)) {
                    return;
                }
                final Preference k = ((i)adapter).k(p2);
                if (k == null) {
                    return;
                }
                k.O0(d);
            }
            
            @Override
            public boolean j(final View view, final int n, final Bundle bundle) {
                return m.this.g.j(view, n, bundle);
            }
        };
        this.f = f;
    }
    
    @j0
    @Override
    public androidx.core.view.a n() {
        return this.h;
    }
}
