// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.c;
import java.util.ArrayList;

public class n extends e
{
    public ArrayList<e> z1;
    
    public n() {
        this.z1 = new ArrayList<e>();
    }
    
    public n(final int n, final int n2) {
        super(n, n2);
        this.z1 = new ArrayList<e>();
    }
    
    public n(final int n, final int n2, final int n3, final int n4) {
        super(n, n2, n3, n4);
        this.z1 = new ArrayList<e>();
    }
    
    @Override
    public void K1(int i, int size) {
        super.K1(i, size);
        for (size = this.z1.size(), i = 0; i < size; ++i) {
            this.z1.get(i).K1(this.Y(), this.Z());
        }
    }
    
    @Override
    public void N0() {
        this.z1.clear();
        super.N0();
    }
    
    @Override
    public void S0(final c c) {
        super.S0(c);
        for (int size = this.z1.size(), i = 0; i < size; ++i) {
            this.z1.get(i).S0(c);
        }
    }
    
    public void b(final e e) {
        this.z1.add(e);
        if (e.U() != null) {
            ((n)e.U()).i2(e);
        }
        e.M1(this);
    }
    
    public void e2(final e... array) {
        for (int length = array.length, i = 0; i < length; ++i) {
            this.b(array[i]);
        }
    }
    
    public ArrayList<e> f2() {
        return this.z1;
    }
    
    public f g2() {
        e u = this.U();
        f f;
        if (this instanceof f) {
            f = (f)this;
        }
        else {
            f = null;
        }
        while (u != null) {
            final e u2 = u.U();
            if (u instanceof f) {
                f = (f)u;
            }
            u = u2;
        }
        return f;
    }
    
    public void h2() {
        final ArrayList<e> z1 = this.z1;
        if (z1 == null) {
            return;
        }
        for (int size = z1.size(), i = 0; i < size; ++i) {
            final e e = this.z1.get(i);
            if (e instanceof n) {
                ((n)e).h2();
            }
        }
    }
    
    public void i2(final e o) {
        this.z1.remove(o);
        o.N0();
    }
    
    public void j2() {
        this.z1.clear();
    }
}
