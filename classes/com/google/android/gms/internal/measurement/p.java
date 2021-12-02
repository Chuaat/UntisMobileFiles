// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

public final class p extends j implements m
{
    protected final List<String> I;
    protected final List<q> J;
    protected g5 K;
    
    private p(final p p) {
        super(p.G);
        (this.I = new ArrayList<String>(p.I.size())).addAll(p.I);
        (this.J = new ArrayList<q>(p.J.size())).addAll(p.J);
        this.K = p.K;
    }
    
    public p(final String s, final List<q> list, final List<q> c, final g5 k) {
        super(s);
        this.I = new ArrayList<String>();
        this.K = k;
        if (!list.isEmpty()) {
            final Iterator<q> iterator = list.iterator();
            while (iterator.hasNext()) {
                this.I.add(iterator.next().k());
            }
        }
        this.J = new ArrayList<q>(c);
    }
    
    @Override
    public final q a(final g5 g5, final List<q> list) {
        final g5 a = this.K.a();
        for (int i = 0; i < this.I.size(); ++i) {
            String s;
            q q;
            if (i < list.size()) {
                s = this.I.get(i);
                q = g5.b(list.get(i));
            }
            else {
                s = this.I.get(i);
                q = com.google.android.gms.internal.measurement.q.f;
            }
            a.e(s, q);
        }
        for (final q q2 : this.J) {
            q q3;
            if ((q3 = a.b(q2)) instanceof r) {
                q3 = a.b(q2);
            }
            if (q3 instanceof h) {
                return ((h)q3).a();
            }
        }
        return q.f;
    }
    
    @Override
    public final q c() {
        return new p(this);
    }
}
