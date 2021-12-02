// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.location;

import android.os.Build$VERSION;
import androidx.core.util.n;
import android.location.GpsSatellite;
import java.util.Iterator;
import androidx.annotation.w;
import android.location.GpsStatus;
import androidx.annotation.t0;

@t0({ t0.a.G })
class c extends a
{
    private static final int n = 0;
    private static final int o = 32;
    private static final int p = 33;
    private static final int q = 64;
    private static final int r = -87;
    private static final int s = 64;
    private static final int t = 24;
    private static final int u = 193;
    private static final int v = 200;
    private static final int w = 200;
    private static final int x = 35;
    private final GpsStatus i;
    @w("mWrapped")
    private int j;
    @w("mWrapped")
    private Iterator<GpsSatellite> k;
    @w("mWrapped")
    private int l;
    @w("mWrapped")
    private GpsSatellite m;
    
    c(GpsStatus i) {
        i = androidx.core.util.n.g(i);
        this.i = i;
        this.j = -1;
        this.k = i.getSatellites().iterator();
        this.l = -1;
        this.m = null;
    }
    
    private static int p(final int n) {
        if (n > 0 && n <= 32) {
            return 1;
        }
        if (n >= 33 && n <= 64) {
            return 2;
        }
        if (n > 64 && n <= 88) {
            return 3;
        }
        if (n > 200 && n <= 235) {
            return 5;
        }
        if (n >= 193 && n <= 200) {
            return 4;
        }
        return 0;
    }
    
    private GpsSatellite q(final int n) {
        synchronized (this.i) {
            if (n < this.l) {
                this.k = this.i.getSatellites().iterator();
                this.l = -1;
            }
            while (true) {
                final int l = this.l;
                if (l >= n) {
                    break;
                }
                this.l = l + 1;
                if (!this.k.hasNext()) {
                    this.m = null;
                    break;
                }
                this.m = this.k.next();
            }
            final GpsSatellite m = this.m;
            // monitorexit(this.i)
            return n.g(m);
        }
    }
    
    private static int r(int n) {
        final int p = p(n);
        if (p != 2) {
            if (p != 3) {
                if (p == 5) {
                    n -= 200;
                }
            }
            else {
                n -= 64;
            }
        }
        else {
            n += 87;
        }
        return n;
    }
    
    @Override
    public float a(final int n) {
        return this.q(n).getAzimuth();
    }
    
    @Override
    public float b(final int n) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public float c(final int n) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public float d(final int n) {
        return this.q(n).getSnr();
    }
    
    @Override
    public int e(final int n) {
        if (Build$VERSION.SDK_INT < 24) {
            return 1;
        }
        return p(this.q(n).getPrn());
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof c && this.i.equals(((c)o).i));
    }
    
    @Override
    public float f(final int n) {
        return this.q(n).getElevation();
    }
    
    @Override
    public int g() {
        synchronized (this.i) {
            if (this.j == -1) {
                for (final GpsSatellite gpsSatellite : this.i.getSatellites()) {
                    ++this.j;
                }
                ++this.j;
            }
            return this.j;
        }
    }
    
    @Override
    public int h(int prn) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        prn = this.q(prn).getPrn();
        if (sdk_INT < 24) {
            return prn;
        }
        return r(prn);
    }
    
    @Override
    public int hashCode() {
        return this.i.hashCode();
    }
    
    @Override
    public boolean i(final int n) {
        return this.q(n).hasAlmanac();
    }
    
    @Override
    public boolean j(final int n) {
        return false;
    }
    
    @Override
    public boolean k(final int n) {
        return false;
    }
    
    @Override
    public boolean l(final int n) {
        return this.q(n).hasEphemeris();
    }
    
    @Override
    public boolean m(final int n) {
        return this.q(n).usedInFix();
    }
}
