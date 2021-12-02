// 
// Decompiled by Procyon v0.5.36
// 

package com.getkeepsafe.relinker.elf;

import java.io.IOException;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;

public class b extends a
{
    public b(final f f, final com.getkeepsafe.relinker.elf.c.b b, long n, final int n2) throws IOException {
        final ByteBuffer allocate = ByteBuffer.allocate(8);
        ByteOrder bo;
        if (b.a) {
            bo = ByteOrder.BIG_ENDIAN;
        }
        else {
            bo = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(bo);
        n += n2 * 16;
        super.a = f.g(allocate, n);
        super.b = f.g(allocate, n + 8L);
    }
}
