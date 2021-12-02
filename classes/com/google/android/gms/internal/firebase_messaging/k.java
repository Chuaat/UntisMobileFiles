// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.firebase_messaging;

import java.io.IOException;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;
import i3.b;
import h3.a;

@a
public abstract class k
{
    private static final f a;
    
    static {
        final e e = new e();
        j.a.a((b)e);
        a = e.c();
    }
    
    private k() {
    }
    
    public static byte[] a(final Object o) {
        final f a = k.a;
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            a.a(o, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException ex) {
            return byteArrayOutputStream.toByteArray();
        }
    }
    
    public static void b(final Object o, final OutputStream outputStream) throws IOException {
        k.a.a(o, outputStream);
    }
    
    public abstract com.google.firebase.messaging.reporting.b c();
}
