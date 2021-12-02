// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.data;

import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.x;
import androidx.annotation.RecentlyNonNull;
import java.util.ArrayList;

@f2.a
public abstract class i<T> extends a<T>
{
    private boolean H;
    private ArrayList<Integer> I;
    
    @f2.a
    protected i(@RecentlyNonNull final DataHolder dataHolder) {
        super(dataHolder);
        this.H = false;
    }
    
    private final int k(final int n) {
        if (n >= 0 && n < this.I.size()) {
            return this.I.get(n);
        }
        final StringBuilder sb = new StringBuilder(53);
        sb.append("Position ");
        sb.append(n);
        sb.append(" is out of bounds for this buffer");
        throw new IllegalArgumentException(sb.toString());
    }
    
    private final void n() {
        synchronized (this) {
            if (!this.H) {
                final int count = x.k(super.G).getCount();
                final ArrayList<Integer> i = new ArrayList<Integer>();
                this.I = i;
                if (count > 0) {
                    i.add(0);
                    final String h = this.h();
                    String j3 = super.G.j3(h, 0, super.G.O3(0));
                    String s;
                    for (int k = 1; k < count; ++k, j3 = s) {
                        final int o3 = super.G.O3(k);
                        final String j4 = super.G.j3(h, k, o3);
                        if (j4 == null) {
                            final StringBuilder sb = new StringBuilder(String.valueOf(h).length() + 78);
                            sb.append("Missing value for markerColumn: ");
                            sb.append(h);
                            sb.append(", at row: ");
                            sb.append(k);
                            sb.append(", for window: ");
                            sb.append(o3);
                            throw new NullPointerException(sb.toString());
                        }
                        s = j3;
                        if (!j4.equals(j3)) {
                            this.I.add(k);
                            s = j4;
                        }
                    }
                }
                this.H = true;
            }
        }
    }
    
    @RecentlyNullable
    @f2.a
    protected String b() {
        return null;
    }
    
    @RecentlyNonNull
    @f2.a
    protected abstract T f(@RecentlyNonNull final int p0, @RecentlyNonNull final int p1);
    
    @RecentlyNonNull
    @f2.a
    @Override
    public final T get(@RecentlyNonNull int k) {
        this.n();
        final int i = this.k(k);
        int n2;
        final int n = n2 = 0;
        if (k >= 0) {
            if (k == this.I.size()) {
                n2 = n;
            }
            else {
                int n3;
                if (k == this.I.size() - 1) {
                    n3 = x.k(super.G).getCount();
                }
                else {
                    n3 = this.I.get(k + 1);
                }
                n2 = n3 - this.I.get(k);
                if (n2 == 1) {
                    k = this.k(k);
                    final int o3 = x.k(super.G).O3(k);
                    final String b = this.b();
                    if (b != null && super.G.j3(b, k, o3) == null) {
                        n2 = n;
                    }
                }
            }
        }
        return this.f(i, n2);
    }
    
    @RecentlyNonNull
    @f2.a
    @Override
    public int getCount() {
        this.n();
        return this.I.size();
    }
    
    @RecentlyNonNull
    @f2.a
    protected abstract String h();
}
