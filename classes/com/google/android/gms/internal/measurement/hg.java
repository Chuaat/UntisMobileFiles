// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class hg extends j
{
    final boolean I;
    final boolean J;
    final /* synthetic */ ig K;
    
    public hg(final ig k, final boolean i, final boolean j) {
        this.K = k;
        super("log");
        this.I = i;
        this.J = j;
    }
    
    @Override
    public final q a(final g5 g5, final List<q> list) {
        h6.i("log", 1, list);
        if (list.size() == 1) {
            ig.e(this.K).a(3, g5.b(list.get(0)).k(), Collections.emptyList(), this.I, this.J);
        }
        else {
            final int b = h6.b(g5.b(list.get(0)).g());
            int i = 2;
            int n;
            if (b != 2) {
                if (b != 3) {
                    if (b != 5) {
                        if (b != 6) {
                            n = 3;
                        }
                        else {
                            n = 2;
                        }
                    }
                    else {
                        n = 5;
                    }
                }
                else {
                    n = 1;
                }
            }
            else {
                n = 4;
            }
            final String k = g5.b(list.get(1)).k();
            gg gg;
            List<String> emptyList;
            if (list.size() == 2) {
                gg = ig.e(this.K);
                emptyList = Collections.emptyList();
            }
            else {
                final ArrayList<String> list2 = new ArrayList<String>();
                while (i < Math.min(list.size(), 5)) {
                    list2.add(g5.b(list.get(i)).k());
                    ++i;
                }
                gg = ig.e(this.K);
                emptyList = list2;
            }
            gg.a(n, k, emptyList, this.I, this.J);
        }
        return q.f;
    }
}
