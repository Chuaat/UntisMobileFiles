// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

final class ia implements qa
{
    private final qa[] a;
    
    ia(final qa... a) {
        this.a = a;
    }
    
    @Override
    public final boolean a(final Class<?> clazz) {
        final qa[] a = this.a;
        for (int i = 0; i < 2; ++i) {
            if (a[i].a(clazz)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final pa b(final Class<?> clazz) {
        final qa[] a = this.a;
        for (int i = 0; i < 2; ++i) {
            final qa qa = a[i];
            if (qa.a(clazz)) {
                return qa.b(clazz);
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
