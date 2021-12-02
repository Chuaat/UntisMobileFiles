// 
// Decompiled by Procyon v0.5.36
// 

package com.getkeepsafe.relinker.elf;

import java.io.IOException;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;

public class d extends b
{
    private final f m;
    
    public d(final boolean a, final f m) throws IOException {
        super.a = a;
        this.m = m;
        final ByteBuffer allocate = ByteBuffer.allocate(4);
        ByteOrder bo;
        if (a) {
            bo = ByteOrder.BIG_ENDIAN;
        }
        else {
            bo = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(bo);
        super.b = m.f(allocate, 16L);
        super.c = m.j(allocate, 28L);
        super.d = m.j(allocate, 32L);
        super.e = m.f(allocate, 42L);
        super.f = m.f(allocate, 44L);
        super.g = m.f(allocate, 46L);
        super.h = m.f(allocate, 48L);
        super.i = m.f(allocate, 50L);
    }
    
    @Override
    public a a(final long n, final int n2) throws IOException {
        return new com.getkeepsafe.relinker.elf.a(this.m, this, n, n2);
    }
    
    @Override
    public c.c b(final long n) throws IOException {
        return new g(this.m, this, n);
    }
    
    @Override
    public com.getkeepsafe.relinker.elf.c.d c(final int n) throws IOException {
        return new i(this.m, this, n);
    }
}
