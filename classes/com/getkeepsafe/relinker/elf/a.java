// 
// Decompiled by Procyon v0.5.36
// 

package com.getkeepsafe.relinker.elf;

import java.io.IOException;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;

public class a extends com.getkeepsafe.relinker.elf.c.a
{
    public a(final f f, final b b, long n, final int n2) throws IOException {
        final ByteBuffer allocate = ByteBuffer.allocate(4);
        ByteOrder bo;
        if (b.a) {
            bo = ByteOrder.BIG_ENDIAN;
        }
        else {
            bo = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(bo);
        n += n2 * 8;
        super.a = f.j(allocate, n);
        super.b = f.j(allocate, n + 4L);
    }
}
