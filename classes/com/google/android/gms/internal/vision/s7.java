// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

final class s7 implements a8
{
    private a8[] a;
    
    s7(final a8... a) {
        this.a = a;
    }
    
    @Override
    public final boolean a(final Class<?> clazz) {
        final a8[] a = this.a;
        for (int length = a.length, i = 0; i < length; ++i) {
            if (a[i].a(clazz)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final x7 b(final Class<?> clazz) {
        for (final a8 a2 : this.a) {
            if (a2.a(clazz)) {
                return a2.b(clazz);
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
