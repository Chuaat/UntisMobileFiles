// 
// Decompiled by Procyon v0.5.36
// 

package androidx.transition;

import android.os.IBinder;

class h1 implements j1
{
    private final IBinder a;
    
    h1(final IBinder a) {
        this.a = a;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof h1 && ((h1)o).a.equals(this.a);
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
}
