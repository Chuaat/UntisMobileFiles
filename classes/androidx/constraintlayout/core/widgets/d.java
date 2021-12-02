// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.c;
import java.util.Iterator;
import androidx.constraintlayout.core.widgets.analyzer.o;
import java.util.HashMap;
import java.util.ArrayList;
import androidx.constraintlayout.core.i;
import java.util.HashSet;

public class d
{
    private static final boolean j = false;
    private static final int k = Integer.MIN_VALUE;
    private HashSet<d> a;
    private int b;
    private boolean c;
    public final e d;
    public final b e;
    public d f;
    public int g;
    int h;
    i i;
    
    public d(final e d, final b e) {
        this.a = null;
        this.g = 0;
        this.h = Integer.MIN_VALUE;
        this.d = d;
        this.e = e;
    }
    
    private boolean s(final e e, final HashSet<e> set) {
        if (set.contains(e)) {
            return false;
        }
        set.add(e);
        if (e == this.i()) {
            return true;
        }
        final ArrayList<d> s = e.s();
        for (int size = s.size(), i = 0; i < size; ++i) {
            final d d = s.get(i);
            if (d.u(this) && d.p() && this.s(d.k().i(), set)) {
                return true;
            }
        }
        return false;
    }
    
    public void A(final int b) {
        this.b = b;
        this.c = true;
    }
    
    public void B(final int h) {
        if (this.p()) {
            this.h = h;
        }
    }
    
    public void C(final int g) {
        if (this.p()) {
            this.g = g;
        }
    }
    
    public boolean a(final d d, final int n) {
        return this.b(d, n, Integer.MIN_VALUE, false);
    }
    
    public boolean b(final d f, final int g, final int h, final boolean b) {
        if (f == null) {
            this.x();
            return true;
        }
        if (!b && !this.v(f)) {
            return false;
        }
        this.f = f;
        if (f.a == null) {
            f.a = new HashSet<d>();
        }
        final HashSet<d> a = this.f.a;
        if (a != null) {
            a.add(this);
        }
        this.g = g;
        this.h = h;
        return true;
    }
    
    public void c(final d d, final HashMap<e, e> hashMap) {
        final d f = this.f;
        if (f != null) {
            final HashSet<d> a = f.a;
            if (a != null) {
                a.remove(this);
            }
        }
        final d f2 = d.f;
        d r;
        if (f2 != null) {
            r = hashMap.get(d.f.d).r(f2.l());
        }
        else {
            r = null;
        }
        this.f = r;
        final d f3 = this.f;
        if (f3 != null) {
            if (f3.a == null) {
                f3.a = new HashSet<d>();
            }
            this.f.a.add(this);
        }
        this.g = d.g;
        this.h = d.h;
    }
    
    public void d(final int n, final ArrayList<o> list, final o o) {
        final HashSet<d> a = this.a;
        if (a != null) {
            final Iterator<d> iterator = a.iterator();
            while (iterator.hasNext()) {
                androidx.constraintlayout.core.widgets.analyzer.i.a(iterator.next().d, n, list, o);
            }
        }
    }
    
    public HashSet<d> e() {
        return this.a;
    }
    
    public int f() {
        if (!this.c) {
            return 0;
        }
        return this.b;
    }
    
    public int g() {
        if (this.d.i0() == 8) {
            return 0;
        }
        if (this.h != Integer.MIN_VALUE) {
            final d f = this.f;
            if (f != null && f.d.i0() == 8) {
                return this.h;
            }
        }
        return this.g;
    }
    
    public final d h() {
        switch (d$a.a[this.e.ordinal()]) {
            default: {
                throw new AssertionError((Object)this.e.name());
            }
            case 5: {
                return this.d.R;
            }
            case 4: {
                return this.d.T;
            }
            case 3: {
                return this.d.Q;
            }
            case 2: {
                return this.d.S;
            }
            case 1:
            case 6:
            case 7:
            case 8:
            case 9: {
                return null;
            }
        }
    }
    
    public e i() {
        return this.d;
    }
    
    public i j() {
        return this.i;
    }
    
    public d k() {
        return this.f;
    }
    
    public b l() {
        return this.e;
    }
    
    public boolean m() {
        final HashSet<d> a = this.a;
        if (a == null) {
            return false;
        }
        final Iterator<d> iterator = a.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().h().p()) {
                return true;
            }
        }
        return false;
    }
    
    public boolean n() {
        final HashSet<d> a = this.a;
        boolean b = false;
        if (a == null) {
            return false;
        }
        if (a.size() > 0) {
            b = true;
        }
        return b;
    }
    
    public boolean o() {
        return this.c;
    }
    
    public boolean p() {
        return this.f != null;
    }
    
    public boolean q(final e e) {
        if (this.s(e, new HashSet<e>())) {
            return false;
        }
        final e u = this.i().U();
        return u == e || e.U() == u;
    }
    
    public boolean r(final e e, final d d) {
        return this.q(e);
    }
    
    public boolean t() {
        switch (d$a.a[this.e.ordinal()]) {
            default: {
                throw new AssertionError((Object)this.e.name());
            }
            case 2:
            case 3:
            case 4:
            case 5: {
                return true;
            }
            case 1:
            case 6:
            case 7:
            case 8:
            case 9: {
                return false;
            }
        }
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.d.y());
        sb.append(":");
        sb.append(this.e.toString());
        return sb.toString();
    }
    
    public boolean u(final d d) {
        final b l = d.l();
        final b e = this.e;
        final boolean b = true;
        boolean b2 = true;
        final boolean b3 = true;
        if (l == e) {
            return true;
        }
        switch (d$a.a[e.ordinal()]) {
            default: {
                throw new AssertionError((Object)this.e.name());
            }
            case 9: {
                return false;
            }
            case 4:
            case 5:
            case 6:
            case 8: {
                boolean b4 = b3;
                if (l != androidx.constraintlayout.core.widgets.d.b.I) {
                    b4 = b3;
                    if (l != androidx.constraintlayout.core.widgets.d.b.K) {
                        b4 = b3;
                        if (l != androidx.constraintlayout.core.widgets.d.b.O) {
                            b4 = (l == androidx.constraintlayout.core.widgets.d.b.L && b3);
                        }
                    }
                }
                return b4;
            }
            case 2:
            case 3:
            case 7: {
                boolean b5 = b;
                if (l != androidx.constraintlayout.core.widgets.d.b.H) {
                    b5 = b;
                    if (l != androidx.constraintlayout.core.widgets.d.b.J) {
                        b5 = (l == androidx.constraintlayout.core.widgets.d.b.N && b);
                    }
                }
                return b5;
            }
            case 1: {
                if (l == androidx.constraintlayout.core.widgets.d.b.L) {
                    b2 = false;
                }
                return b2;
            }
        }
    }
    
    public boolean v(final d d) {
        final boolean b = false;
        final boolean b2 = false;
        final boolean b3 = false;
        if (d == null) {
            return false;
        }
        final b l = d.l();
        final b e = this.e;
        if (l == e) {
            return e != androidx.constraintlayout.core.widgets.d.b.L || (d.i().n0() && this.i().n0());
        }
        switch (d$a.a[e.ordinal()]) {
            default: {
                throw new AssertionError((Object)this.e.name());
            }
            case 7:
            case 8:
            case 9: {
                return false;
            }
            case 6: {
                return l != androidx.constraintlayout.core.widgets.d.b.H && l != androidx.constraintlayout.core.widgets.d.b.J;
            }
            case 4:
            case 5: {
                boolean b4 = l == androidx.constraintlayout.core.widgets.d.b.I || l == androidx.constraintlayout.core.widgets.d.b.K;
                if (d.i() instanceof h) {
                    boolean b5 = false;
                    Label_0225: {
                        if (!b4) {
                            b5 = b3;
                            if (l != androidx.constraintlayout.core.widgets.d.b.O) {
                                break Label_0225;
                            }
                        }
                        b5 = true;
                    }
                    b4 = b5;
                }
                return b4;
            }
            case 2:
            case 3: {
                boolean b6 = l == androidx.constraintlayout.core.widgets.d.b.H || l == androidx.constraintlayout.core.widgets.d.b.J;
                if (d.i() instanceof h) {
                    boolean b7 = false;
                    Label_0290: {
                        if (!b6) {
                            b7 = b;
                            if (l != androidx.constraintlayout.core.widgets.d.b.N) {
                                break Label_0290;
                            }
                        }
                        b7 = true;
                    }
                    b6 = b7;
                }
                return b6;
            }
            case 1: {
                boolean b8 = b2;
                if (l != androidx.constraintlayout.core.widgets.d.b.L) {
                    b8 = b2;
                    if (l != androidx.constraintlayout.core.widgets.d.b.N) {
                        b8 = b2;
                        if (l != androidx.constraintlayout.core.widgets.d.b.O) {
                            b8 = true;
                        }
                    }
                }
                return b8;
            }
        }
    }
    
    public boolean w() {
        switch (d$a.a[this.e.ordinal()]) {
            default: {
                throw new AssertionError((Object)this.e.name());
            }
            case 4:
            case 5:
            case 6:
            case 8:
            case 9: {
                return true;
            }
            case 1:
            case 2:
            case 3:
            case 7: {
                return false;
            }
        }
    }
    
    public void x() {
        final d f = this.f;
        if (f != null) {
            final HashSet<d> a = f.a;
            if (a != null) {
                a.remove(this);
                if (this.f.a.size() == 0) {
                    this.f.a = null;
                }
            }
        }
        this.a = null;
        this.f = null;
        this.g = 0;
        this.h = Integer.MIN_VALUE;
        this.c = false;
        this.b = 0;
    }
    
    public void y() {
        this.c = false;
        this.b = 0;
    }
    
    public void z(final c c) {
        final i i = this.i;
        if (i == null) {
            this.i = new i(androidx.constraintlayout.core.i.b.G, null);
        }
        else {
            i.k();
        }
    }
    
    public enum b
    {
        G, 
        H, 
        I, 
        J, 
        K, 
        L, 
        M, 
        N, 
        O;
    }
}
