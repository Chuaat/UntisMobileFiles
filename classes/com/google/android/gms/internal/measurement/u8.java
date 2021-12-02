// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

final class u8
{
    private final Object a;
    private final int b;
    
    u8(final Object a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof u8)) {
            return false;
        }
        final u8 u8 = (u8)o;
        return this.a == u8.a && this.b == u8.b;
    }
    
    @Override
    public final int hashCode() {
        return System.identityHashCode(this.a) * 65535 + this.b;
    }
}
