// 
// Decompiled by Procyon v0.5.36
// 

package com.getkeepsafe.relinker.elf;

import java.io.IOException;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;

public class j extends d
{
    public j(final f f, final b b, final int n) throws IOException {
        final ByteBuffer allocate = ByteBuffer.allocate(8);
        ByteOrder bo;
        if (b.a) {
            bo = ByteOrder.BIG_ENDIAN;
        }
        else {
            bo = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(bo);
        super.a = f.j(allocate, b.d + n * b.g + 44L);
    }
}
