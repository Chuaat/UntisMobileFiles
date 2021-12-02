// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.widgets;

import java.util.HashMap;
import androidx.constraintlayout.core.widgets.analyzer.o;
import java.util.ArrayList;
import java.util.Arrays;

public class j extends e implements i
{
    public int A1;
    public e[] z1;
    
    public j() {
        this.z1 = new e[4];
        this.A1 = 0;
    }
    
    @Override
    public void a() {
        this.A1 = 0;
        Arrays.fill(this.z1, null);
    }
    
    @Override
    public void b(final e e) {
        if (e != this) {
            if (e != null) {
                final int a1 = this.A1;
                final e[] z1 = this.z1;
                if (a1 + 1 > z1.length) {
                    this.z1 = Arrays.copyOf(z1, z1.length * 2);
                }
                final e[] z2 = this.z1;
                final int a2 = this.A1;
                z2[a2] = e;
                this.A1 = a2 + 1;
            }
        }
    }
    
    @Override
    public void c(final f f) {
    }
    
    public void e2(final ArrayList<o> list, final int n, final o o) {
        final int n2 = 0;
        int n3 = 0;
        int i;
        while (true) {
            i = n2;
            if (n3 >= this.A1) {
                break;
            }
            o.a(this.z1[n3]);
            ++n3;
        }
        while (i < this.A1) {
            androidx.constraintlayout.core.widgets.analyzer.i.a(this.z1[i], n, list, o);
            ++i;
        }
    }
    
    public int f2(final int n) {
        for (int i = 0; i < this.A1; ++i) {
            final e e = this.z1[i];
            if (n == 0) {
                final int r0 = e.R0;
                if (r0 != -1) {
                    return r0;
                }
            }
            if (n == 1) {
                final int s0 = e.S0;
                if (s0 != -1) {
                    return s0;
                }
            }
        }
        return -1;
    }
    
    @Override
    public void n(final e e, final HashMap<e, e> hashMap) {
        super.n(e, hashMap);
        final j j = (j)e;
        int i = 0;
        this.A1 = 0;
        while (i < j.A1) {
            this.b(hashMap.get(j.z1[i]));
            ++i;
        }
    }
}
