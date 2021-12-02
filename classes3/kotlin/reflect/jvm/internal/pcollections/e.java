// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.pcollections;

import java.io.Serializable;

final class e<K, V> implements Serializable
{
    public final K G;
    public final V H;
    
    public e(final K g, final V h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    public boolean equals(Object h) {
        final boolean b = h instanceof e;
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        final e e = (e)h;
        final K g = this.G;
        if (g == null) {
            final boolean b3 = b2;
            if (e.G != null) {
                return b3;
            }
        }
        else {
            final boolean b3 = b2;
            if (!g.equals(e.G)) {
                return b3;
            }
        }
        final V h2 = this.H;
        h = e.H;
        if (h2 == null) {
            final boolean b3 = b2;
            if (h != null) {
                return b3;
            }
        }
        else {
            final boolean b3 = b2;
            if (!h2.equals(h)) {
                return b3;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        final K g = this.G;
        int hashCode = 0;
        int hashCode2;
        if (g == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = g.hashCode();
        }
        final V h = this.H;
        if (h != null) {
            hashCode = h.hashCode();
        }
        return hashCode2 ^ hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.G);
        sb.append("=");
        sb.append(this.H);
        return sb.toString();
    }
}
