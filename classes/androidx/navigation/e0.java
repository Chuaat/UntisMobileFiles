// 
// Decompiled by Procyon v0.5.36
// 

package androidx.navigation;

import android.content.res.TypedArray;
import v0.a;
import android.util.AttributeSet;
import android.content.Context;
import androidx.annotation.t0;
import java.util.NoSuchElementException;
import androidx.annotation.k0;
import androidx.annotation.y;
import java.util.Collection;
import java.util.Iterator;
import androidx.annotation.j0;
import androidx.collection.n;

public class e0 extends a0 implements Iterable<a0>
{
    final n<a0> P;
    private int Q;
    private String R;
    
    public e0(@j0 final u0<? extends e0> u0) {
        super(u0);
        this.P = new n<a0>();
    }
    
    public final void J(@j0 final e0 e0) {
        final Iterator<a0> iterator = e0.iterator();
        while (iterator.hasNext()) {
            final a0 a0 = iterator.next();
            iterator.remove();
            this.K(a0);
        }
    }
    
    public final void K(@j0 final a0 obj) {
        final int p = obj.p();
        if (p == 0) {
            throw new IllegalArgumentException("Destinations must have an id. Call setId() or include an android:id in your navigation XML.");
        }
        if (p == this.p()) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Destination ");
            sb.append(obj);
            sb.append(" cannot have the same id as graph ");
            sb.append(this);
            throw new IllegalArgumentException(sb.toString());
        }
        final a0 a0 = this.P.j(p);
        if (a0 == obj) {
            return;
        }
        if (obj.t() == null) {
            if (a0 != null) {
                a0.H(null);
            }
            obj.H(this);
            this.P.s(obj.p(), obj);
            return;
        }
        throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
    }
    
    public final void L(@j0 final Collection<a0> collection) {
        for (final a0 a0 : collection) {
            if (a0 == null) {
                continue;
            }
            this.K(a0);
        }
    }
    
    public final void M(@j0 final a0... array) {
        for (final a0 a0 : array) {
            if (a0 != null) {
                this.K(a0);
            }
        }
    }
    
    @k0
    public final a0 N(@y final int n) {
        return this.O(n, true);
    }
    
    @k0
    final a0 O(@y final int n, final boolean b) {
        a0 n2 = this.P.j(n);
        if (n2 == null) {
            if (b && this.t() != null) {
                n2 = this.t().N(n);
            }
            else {
                n2 = null;
            }
        }
        return n2;
    }
    
    @j0
    String P() {
        if (this.R == null) {
            this.R = Integer.toString(this.Q);
        }
        return this.R;
    }
    
    @y
    public final int R() {
        return this.Q;
    }
    
    public final void S(@j0 final a0 a0) {
        final int m = this.P.m(a0.p());
        if (m >= 0) {
            this.P.D(m).H(null);
            this.P.x(m);
        }
    }
    
    public final void U(@y final int n) {
        if (n != this.p()) {
            this.Q = n;
            this.R = null;
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Start destination ");
        sb.append(n);
        sb.append(" cannot use the same id as the graph ");
        sb.append(this);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public final void clear() {
        final Iterator<a0> iterator = this.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
    }
    
    @j0
    @Override
    public final Iterator<a0> iterator() {
        return new Iterator<a0>() {
            private int G = -1;
            private boolean H = false;
            
            public a0 a() {
                if (this.hasNext()) {
                    this.H = true;
                    final n<a0> p = e0.this.P;
                    final int g = this.G + 1;
                    this.G = g;
                    return p.D(g);
                }
                throw new NoSuchElementException();
            }
            
            @Override
            public boolean hasNext() {
                final int g = this.G;
                boolean b = true;
                if (g + 1 >= e0.this.P.C()) {
                    b = false;
                }
                return b;
            }
            
            @Override
            public void remove() {
                if (this.H) {
                    e0.this.P.D(this.G).H(null);
                    e0.this.P.x(this.G);
                    --this.G;
                    this.H = false;
                    return;
                }
                throw new IllegalStateException("You must call next() before you can remove an element");
            }
        };
    }
    
    @j0
    @t0({ t0.a.H })
    @Override
    public String n() {
        String n;
        if (this.p() != 0) {
            n = super.n();
        }
        else {
            n = "the root navigation";
        }
        return n;
    }
    
    @j0
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" startDestination=");
        final a0 n = this.N(this.R());
        String str;
        if (n == null) {
            if ((str = this.R) == null) {
                sb.append("0x");
                str = Integer.toHexString(this.Q);
            }
        }
        else {
            sb.append("{");
            sb.append(n.toString());
            str = "}";
        }
        sb.append(str);
        return sb.toString();
    }
    
    @k0
    @Override
    b x(@j0 final z z) {
        b x = super.x(z);
        final Iterator<a0> iterator = this.iterator();
        while (iterator.hasNext()) {
            final b x2 = iterator.next().x(z);
            if (x2 != null && (x == null || x2.b(x) > 0)) {
                x = x2;
            }
        }
        return x;
    }
    
    @Override
    public void z(@j0 final Context context, @j0 final AttributeSet set) {
        super.z(context, set);
        final TypedArray obtainAttributes = context.getResources().obtainAttributes(set, v0.a.j.h0);
        this.U(obtainAttributes.getResourceId(v0.a.j.i0, 0));
        this.R = a0.o(context, this.Q);
        obtainAttributes.recycle();
    }
}
