// 
// Decompiled by Procyon v0.5.36
// 

package androidx.room;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import androidx.annotation.b1;
import androidx.annotation.t0;
import androidx.sqlite.db.e;
import androidx.sqlite.db.f;

@t0({ t0.a.I })
public class v2 implements f, e
{
    @b1
    static final int O = 15;
    @b1
    static final int P = 10;
    @b1
    static final TreeMap<Integer, v2> Q;
    private static final int R = 1;
    private static final int S = 2;
    private static final int T = 3;
    private static final int U = 4;
    private static final int V = 5;
    private volatile String G;
    @b1
    final long[] H;
    @b1
    final double[] I;
    @b1
    final String[] J;
    @b1
    final byte[][] K;
    private final int[] L;
    @b1
    final int M;
    @b1
    int N;
    
    static {
        Q = new TreeMap<Integer, v2>();
    }
    
    private v2(int m) {
        this.M = m;
        ++m;
        this.L = new int[m];
        this.H = new long[m];
        this.I = new double[m];
        this.J = new String[m];
        this.K = new byte[m][];
    }
    
    public static v2 d(final String s, final int i) {
        Object q = v2.Q;
        synchronized (q) {
            final Map.Entry<Integer, v2> ceilingEntry = ((TreeMap<Integer, v2>)q).ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry != null) {
                ((TreeMap<Integer, v2>)q).remove(ceilingEntry.getKey());
                final v2 v2 = ceilingEntry.getValue();
                v2.g(s, i);
                return v2;
            }
            // monitorexit(q)
            q = new v2(i);
            ((v2)q).g(s, i);
            return (v2)q;
        }
    }
    
    public static v2 f(final f f) {
        final v2 d = d(f.b(), f.a());
        f.c(new e() {
            @Override
            public void H2(final int n, final byte[] array) {
                d.H2(n, array);
            }
            
            @Override
            public void K0(final int n, final String s) {
                d.K0(n, s);
            }
            
            @Override
            public void c4(final int n) {
                d.c4(n);
            }
            
            @Override
            public void close() {
            }
            
            @Override
            public void l2(final int n, final long n2) {
                d.l2(n, n2);
            }
            
            @Override
            public void m5() {
                d.m5();
            }
            
            @Override
            public void r1(final int n, final double n2) {
                d.r1(n, n2);
            }
        });
        return d;
    }
    
    private static void h() {
        final TreeMap<Integer, v2> q = v2.Q;
        if (q.size() > 15) {
            int i = q.size() - 10;
            final Iterator<Integer> iterator = q.descendingKeySet().iterator();
            while (i > 0) {
                iterator.next();
                iterator.remove();
                --i;
            }
        }
    }
    
    @Override
    public void H2(final int n, final byte[] array) {
        this.L[n] = 5;
        this.K[n] = array;
    }
    
    @Override
    public void K0(final int n, final String s) {
        this.L[n] = 4;
        this.J[n] = s;
    }
    
    @Override
    public int a() {
        return this.N;
    }
    
    @Override
    public String b() {
        return this.G;
    }
    
    @Override
    public void c(final e e) {
        for (int i = 1; i <= this.N; ++i) {
            final int n = this.L[i];
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        if (n != 4) {
                            if (n == 5) {
                                e.H2(i, this.K[i]);
                            }
                        }
                        else {
                            e.K0(i, this.J[i]);
                        }
                    }
                    else {
                        e.r1(i, this.I[i]);
                    }
                }
                else {
                    e.l2(i, this.H[i]);
                }
            }
            else {
                e.c4(i);
            }
        }
    }
    
    @Override
    public void c4(final int n) {
        this.L[n] = 1;
    }
    
    @Override
    public void close() {
    }
    
    public void e(final v2 v2) {
        final int n = v2.a() + 1;
        System.arraycopy(v2.L, 0, this.L, 0, n);
        System.arraycopy(v2.H, 0, this.H, 0, n);
        System.arraycopy(v2.J, 0, this.J, 0, n);
        System.arraycopy(v2.K, 0, this.K, 0, n);
        System.arraycopy(v2.I, 0, this.I, 0, n);
    }
    
    void g(final String g, final int n) {
        this.G = g;
        this.N = n;
    }
    
    @Override
    public void l2(final int n, final long n2) {
        this.L[n] = 2;
        this.H[n] = n2;
    }
    
    @Override
    public void m5() {
        Arrays.fill(this.L, 1);
        Arrays.fill(this.J, null);
        Arrays.fill(this.K, null);
        this.G = null;
    }
    
    @Override
    public void r1(final int n, final double n2) {
        this.L[n] = 3;
        this.I[n] = n2;
    }
    
    public void release() {
        final TreeMap<Integer, v2> q = v2.Q;
        synchronized (q) {
            q.put(this.M, this);
            h();
        }
    }
}
