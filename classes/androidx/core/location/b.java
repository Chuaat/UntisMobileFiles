// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.location;

import android.os.Build$VERSION;
import androidx.core.util.n;
import android.location.GnssStatus;
import androidx.annotation.t0;
import androidx.annotation.p0;

@p0(24)
@t0({ t0.a.G })
class b extends a
{
    private final GnssStatus i;
    
    b(final GnssStatus gnssStatus) {
        this.i = n.g(gnssStatus);
    }
    
    @Override
    public float a(final int n) {
        return this.i.getAzimuthDegrees(n);
    }
    
    @Override
    public float b(final int n) {
        if (Build$VERSION.SDK_INT >= 30) {
            return this.i.getBasebandCn0DbHz(n);
        }
        throw new UnsupportedOperationException();
    }
    
    @Override
    public float c(final int n) {
        if (Build$VERSION.SDK_INT >= 26) {
            return this.i.getCarrierFrequencyHz(n);
        }
        throw new UnsupportedOperationException();
    }
    
    @Override
    public float d(final int n) {
        return this.i.getCn0DbHz(n);
    }
    
    @Override
    public int e(final int n) {
        return this.i.getConstellationType(n);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof b && this.i.equals((Object)((b)o).i));
    }
    
    @Override
    public float f(final int n) {
        return this.i.getElevationDegrees(n);
    }
    
    @Override
    public int g() {
        return this.i.getSatelliteCount();
    }
    
    @Override
    public int h(final int n) {
        return this.i.getSvid(n);
    }
    
    @Override
    public int hashCode() {
        return this.i.hashCode();
    }
    
    @Override
    public boolean i(final int n) {
        return this.i.hasAlmanacData(n);
    }
    
    @Override
    public boolean j(final int n) {
        return Build$VERSION.SDK_INT >= 30 && this.i.hasBasebandCn0DbHz(n);
    }
    
    @Override
    public boolean k(final int n) {
        return Build$VERSION.SDK_INT >= 26 && this.i.hasCarrierFrequencyHz(n);
    }
    
    @Override
    public boolean l(final int n) {
        return this.i.hasEphemerisData(n);
    }
    
    @Override
    public boolean m(final int n) {
        return this.i.usedInFix(n);
    }
}
