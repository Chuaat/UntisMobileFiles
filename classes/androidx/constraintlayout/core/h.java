// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core;

import java.util.Comparator;
import java.util.Arrays;

public class h extends androidx.constraintlayout.core.b
{
    private static final float o = 1.0E-4f;
    private static final boolean p = false;
    static final int q = -1;
    private int i;
    private i[] j;
    private i[] k;
    private int l;
    b m;
    c n;
    
    public h(final c n) {
        super(n);
        this.i = 128;
        this.j = new i[128];
        this.k = new i[128];
        this.l = 0;
        this.m = new b(this);
        this.n = n;
    }
    
    private final void I(final i i) {
        final int l = this.l;
        final i[] j = this.j;
        if (l + 1 > j.length) {
            final i[] array = Arrays.copyOf(j, j.length * 2);
            this.j = array;
            this.k = Arrays.copyOf(array, array.length * 2);
        }
        final i[] k = this.j;
        int m = this.l;
        k[m] = i;
        ++m;
        this.l = m;
        if (m > 1 && k[m - 1].I > i.I) {
            final int n = 0;
            int n2 = 0;
            int l2;
            while (true) {
                l2 = this.l;
                if (n2 >= l2) {
                    break;
                }
                this.k[n2] = this.j[n2];
                ++n2;
            }
            Arrays.sort(this.k, 0, l2, new Comparator<i>() {
                public int a(final i i, final i j) {
                    return i.I - j.I;
                }
            });
            for (int n3 = n; n3 < this.l; ++n3) {
                this.j[n3] = this.k[n3];
            }
        }
        i.G = true;
        i.b(this);
    }
    
    private final void J(final i i) {
        for (int j = 0; j < this.l; ++j) {
            if (this.j[j] == i) {
                int l;
                while (true) {
                    l = this.l;
                    if (j >= l - 1) {
                        break;
                    }
                    final i[] k = this.j;
                    final int n = j + 1;
                    k[j] = k[n];
                    j = n;
                }
                this.l = l - 1;
                i.G = false;
                return;
            }
        }
    }
    
    @Override
    public void c(final e e, final androidx.constraintlayout.core.b b, final boolean b2) {
        final i a = b.a;
        if (a == null) {
            return;
        }
        final a e2 = b.e;
        for (int d = e2.d(), i = 0; i < d; ++i) {
            final i j = e2.j(i);
            final float m = e2.m(i);
            this.m.c(j);
            if (this.m.b(a, m)) {
                this.I(j);
            }
            super.b += b.b * m;
        }
        this.J(a);
    }
    
    @Override
    public void clear() {
        this.l = 0;
        super.b = 0.0f;
    }
    
    @Override
    public i e(final e e, final boolean[] array) {
        int i = 0;
        int n = -1;
        while (i < this.l) {
            final i j = this.j[i];
            int n2 = 0;
            Label_0090: {
                if (array[j.I]) {
                    n2 = n;
                }
                else {
                    this.m.c(j);
                    final b m = this.m;
                    if (n == -1) {
                        n2 = n;
                        if (!m.d()) {
                            break Label_0090;
                        }
                    }
                    else {
                        n2 = n;
                        if (!m.f(this.j[n])) {
                            break Label_0090;
                        }
                    }
                    n2 = i;
                }
            }
            ++i;
            n = n2;
        }
        if (n == -1) {
            return null;
        }
        return this.j[n];
    }
    
    @Override
    public void f(final i i) {
        this.m.c(i);
        this.m.g();
        i.O[i.K] = 1.0f;
        this.I(i);
    }
    
    @Override
    public boolean isEmpty() {
        return this.l == 0;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(" goal -> (");
        sb.append(super.b);
        sb.append(") : ");
        String str = sb.toString();
        for (int i = 0; i < this.l; ++i) {
            this.m.c(this.j[i]);
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(this.m);
            sb2.append(" ");
            str = sb2.toString();
        }
        return str;
    }
    
    class b
    {
        i a;
        h b;
        
        public b(final h b) {
            this.b = b;
        }
        
        public void a(final i i) {
            for (int j = 0; j < 9; ++j) {
                final float[] o = this.a.O;
                o[j] += i.O[j];
                if (Math.abs(o[j]) < 1.0E-4f) {
                    this.a.O[j] = 0.0f;
                }
            }
        }
        
        public boolean b(final i i, final float n) {
            final boolean g = this.a.G;
            boolean b = true;
            int j = 0;
            if (g) {
                for (int k = 0; k < 9; ++k) {
                    final float[] o = this.a.O;
                    o[k] += i.O[k] * n;
                    if (Math.abs(o[k]) < 1.0E-4f) {
                        this.a.O[k] = 0.0f;
                    }
                    else {
                        b = false;
                    }
                }
                if (b) {
                    h.this.J(this.a);
                }
                return false;
            }
            while (j < 9) {
                final float n2 = i.O[j];
                if (n2 != 0.0f) {
                    float n3;
                    if (Math.abs(n3 = n2 * n) < 1.0E-4f) {
                        n3 = 0.0f;
                    }
                    this.a.O[j] = n3;
                }
                else {
                    this.a.O[j] = 0.0f;
                }
                ++j;
            }
            return true;
        }
        
        public void c(final i a) {
            this.a = a;
        }
        
        public final boolean d() {
            for (int i = 8; i >= 0; --i) {
                final float n = this.a.O[i];
                if (n > 0.0f) {
                    return false;
                }
                if (n < 0.0f) {
                    return true;
                }
            }
            return false;
        }
        
        public final boolean e() {
            for (int i = 0; i < 9; ++i) {
                if (this.a.O[i] != 0.0f) {
                    return false;
                }
            }
            return true;
        }
        
        public final boolean f(final i i) {
            int j = 8;
            while (j >= 0) {
                final float n = i.O[j];
                final float n2 = this.a.O[j];
                if (n2 == n) {
                    --j;
                }
                else {
                    if (n2 < n) {
                        return true;
                    }
                    break;
                }
            }
            return false;
        }
        
        public void g() {
            Arrays.fill(this.a.O, 0.0f);
        }
        
        @Override
        public String toString() {
            final i a = this.a;
            String str;
            String string = str = "[ ";
            if (a != null) {
                int n = 0;
                while (true) {
                    str = string;
                    if (n >= 9) {
                        break;
                    }
                    final StringBuilder sb = new StringBuilder();
                    sb.append(string);
                    sb.append(this.a.O[n]);
                    sb.append(" ");
                    string = sb.toString();
                    ++n;
                }
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("] ");
            sb2.append(this.a);
            return sb2.toString();
        }
    }
}
