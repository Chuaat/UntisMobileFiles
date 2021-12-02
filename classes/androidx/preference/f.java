// 
// Decompiled by Procyon v0.5.36
// 

package androidx.preference;

import java.util.Set;
import androidx.annotation.k0;

public abstract class f
{
    public boolean a(final String s, final boolean b) {
        return b;
    }
    
    public float b(final String s, final float n) {
        return n;
    }
    
    public int c(final String s, final int n) {
        return n;
    }
    
    public long d(final String s, final long n) {
        return n;
    }
    
    @k0
    public String e(final String s, @k0 final String s2) {
        return s2;
    }
    
    @k0
    public Set<String> f(final String s, @k0 final Set<String> set) {
        return set;
    }
    
    public void g(final String s, final boolean b) {
        throw new UnsupportedOperationException("Not implemented on this data store");
    }
    
    public void h(final String s, final float n) {
        throw new UnsupportedOperationException("Not implemented on this data store");
    }
    
    public void i(final String s, final int n) {
        throw new UnsupportedOperationException("Not implemented on this data store");
    }
    
    public void j(final String s, final long n) {
        throw new UnsupportedOperationException("Not implemented on this data store");
    }
    
    public void k(final String s, @k0 final String s2) {
        throw new UnsupportedOperationException("Not implemented on this data store");
    }
    
    public void l(final String s, @k0 final Set<String> set) {
        throw new UnsupportedOperationException("Not implemented on this data store");
    }
}
