// 
// Decompiled by Procyon v0.5.36
// 

package com.getkeepsafe.relinker.elf;

import java.io.IOException;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;

public class h extends c
{
    public h(final f f, final b b, long n) throws IOException {
        final ByteBuffer allocate = ByteBuffer.allocate(8);
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
        super.b = f.g(allocate, 8L + n);
        super.c = f.g(allocate, 16L + n);
        super.d = f.g(allocate, n + 40L);
    }
}
