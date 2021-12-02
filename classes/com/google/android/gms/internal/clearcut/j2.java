// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

final class j2 implements r2
{
    private r2[] a;
    
    j2(final r2... a) {
        this.a = a;
    }
    
    @Override
    public final boolean a(final Class<?> clazz) {
        final r2[] a = this.a;
        for (int length = a.length, i = 0; i < length; ++i) {
            if (a[i].a(clazz)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final q2 b(final Class<?> clazz) {
        for (final r2 r2 : this.a) {
            if (r2.a(clazz)) {
                return r2.b(clazz);
            }
        }
        final String name = clazz.getName();
        String concat;
        if (name.length() != 0) {
            concat = "No factory is available for message type: ".concat(name);
        }
        else {
            concat = new String("No factory is available for message type: ");
        }
        throw new UnsupportedOperationException(concat);
    }
}
