// 
// Decompiled by Procyon v0.5.36
// 

package com.getkeepsafe.relinker.elf;

import java.io.IOException;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;

public class g extends c
{
    public g(final f f, final b b, long n) throws IOException {
        final ByteBuffer allocate = ByteBuffer.allocate(4);
        ByteOrder bo;
        if (b.a) {
            bo = ByteOrder.BIG_ENDIAN;
        }
        else {
            bo = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(bo);
        n = b.c + n * b.e;
        super.a = f.j(allocate, n);
        super.b = f.j(allocate, 4L + n);
        super.c = f.j(allocate, 8L + n);
        super.d = f.j(allocate, n + 20L);
    }
}
