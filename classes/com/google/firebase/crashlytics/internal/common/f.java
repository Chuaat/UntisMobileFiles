// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.common;

import java.util.Date;
import android.os.Process;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

class f
{
    private static final AtomicLong a;
    private static String b;
    
    static {
        a = new AtomicLong(0L);
    }
    
    f(final w w) {
        final byte[] array = new byte[10];
        this.e(array);
        this.d(array);
        this.c(array);
        final String f = g.F(w.a());
        final String x = g.x(array);
        final Locale us = Locale.US;
        com.google.firebase.crashlytics.internal.common.f.b = String.format(us, "%s%s%s%s", x.substring(0, 12), x.substring(12, 16), x.subSequence(16, 20), f.substring(0, 12)).toUpperCase(us);
    }
    
    private static byte[] a(final long n) {
        final ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt((int)n);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }
    
    private static byte[] b(final long n) {
        final ByteBuffer allocate = ByteBuffer.allocate(2);
        allocate.putShort((short)n);
        allocate.order(ByteOrder.BIG_ENDIAN);
        allocate.position(0);
        return allocate.array();
    }
    
    private void c(final byte[] array) {
        final byte[] b = b(Process.myPid().shortValue());
        array[8] = b[0];
        array[9] = b[1];
    }
    
    private void d(final byte[] array) {
        final byte[] b = b(f.a.incrementAndGet());
        array[6] = b[0];
        array[7] = b[1];
    }
    
    private void e(final byte[] array) {
        final long time = new Date().getTime();
        final byte[] a = a(time / 1000L);
        array[0] = a[0];
        array[1] = a[1];
        array[2] = a[2];
        array[3] = a[3];
        final byte[] b = b(time % 1000L);
        array[4] = b[0];
        array[5] = b[1];
    }
    
    @Override
    public String toString() {
        return f.b;
    }
}
