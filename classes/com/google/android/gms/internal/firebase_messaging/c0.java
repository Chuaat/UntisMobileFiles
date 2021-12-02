// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.firebase_messaging;

import androidx.annotation.j0;
import java.io.OutputStream;

final class c0 extends OutputStream
{
    private long G;
    
    c0() {
        this.G = 0L;
    }
    
    final long a() {
        return this.G;
    }
    
    @Override
    public final void write(final int n) {
        ++this.G;
    }
    
    @Override
    public final void write(final byte[] array) {
        this.G += array.length;
    }
    
    @Override
    public final void write(@j0 final byte[] array, int n, final int n2) {
        if (n >= 0) {
            final int length = array.length;
            if (n <= length && n2 >= 0) {
                n += n2;
                if (n <= length && n >= 0) {
                    this.G += n2;
                    return;
                }
            }
        }
        throw new IndexOutOfBoundsException();
    }
}
