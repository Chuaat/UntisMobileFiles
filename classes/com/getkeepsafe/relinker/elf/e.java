// 
// Decompiled by Procyon v0.5.36
// 

package com.getkeepsafe.relinker.elf;

import java.io.IOException;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;

public class e extends b
{
    private final f m;
    
    public e(final boolean a, final f m) throws IOException {
        super.a = a;
        this.m = m;
        final ByteBuffer allocate = ByteBuffer.allocate(8);
        ByteOrder bo;
        if (a) {
            bo = ByteOrder.BIG_ENDIAN;
        }
        else {
            bo = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(bo);
        super.b = m.f(allocate, 16L);
        super.c = m.g(allocate, 32L);
        super.d = m.g(allocate, 40L);
        super.e = m.f(allocate, 54L);
        super.f = m.f(allocate, 56L);
        super.g = m.f(allocate, 58L);
        super.h = m.f(allocate, 60L);
        super.i = m.f(allocate, 62L);
    }
    
    @Override
    public a a(final long n, final int n2) throws IOException {
        return new com.getkeepsafe.relinker.elf.b(this.m, this, n, n2);
    }
    
    @Override
    public c.c b(final long n) throws IOException {
        return new h(this.m, this, n);
    }
    
    @Override
    public d c(final int n) throws IOException {
        return new j(this.m, this, n);
    }
}
