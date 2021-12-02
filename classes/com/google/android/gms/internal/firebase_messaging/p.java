// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.firebase_messaging;

import java.util.Objects;
import java.io.OutputStream;

final class p extends OutputStream
{
    @Override
    public final String toString() {
        return "ByteStreams.nullOutputStream()";
    }
    
    @Override
    public final void write(final int n) {
    }
    
    @Override
    public final void write(final byte[] obj) {
        Objects.requireNonNull(obj);
    }
    
    @Override
    public final void write(final byte[] obj, final int n, final int n2) {
        Objects.requireNonNull(obj);
    }
}
