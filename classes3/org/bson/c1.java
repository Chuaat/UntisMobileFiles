// 
// Decompiled by Procyon v0.5.36
// 

package org.bson;

import java.nio.ByteOrder;
import java.util.concurrent.atomic.AtomicInteger;
import java.nio.ByteBuffer;

public class c1 implements b1
{
    private ByteBuffer a;
    private final AtomicInteger b;
    
    public c1(final ByteBuffer byteBuffer) {
        this.b = new AtomicInteger(1);
        this.a = byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    }
    
    @Override
    public b1 A0() {
        this.a.flip();
        return this;
    }
    
    public c1 a() {
        if (this.b.incrementAndGet() != 1) {
            return this;
        }
        this.b.decrementAndGet();
        throw new IllegalStateException("Attempted to increment the reference count when it is already 0");
    }
    
    @Override
    public boolean c0() {
        return this.a.hasRemaining();
    }
    
    @Override
    public b1 clear() {
        this.a.clear();
        return this;
    }
    
    @Override
    public int d0() {
        return this.a.capacity();
    }
    
    @Override
    public double e0() {
        return this.a.getDouble();
    }
    
    @Override
    public long f0() {
        return this.a.getLong();
    }
    
    @Override
    public int g0() {
        return this.a.limit();
    }
    
    @Override
    public byte get() {
        return this.a.get();
    }
    
    @Override
    public byte get(final int n) {
        return this.a.get(n);
    }
    
    @Override
    public double getDouble(final int n) {
        return this.a.getDouble(n);
    }
    
    @Override
    public int getInt(final int n) {
        return this.a.getInt(n);
    }
    
    @Override
    public long getLong(final int n) {
        return this.a.getLong(n);
    }
    
    @Override
    public b1 h0() {
        return new c1(this.a.duplicate());
    }
    
    @Override
    public int i0() {
        return this.a.position();
    }
    
    @Override
    public int j0() {
        return this.b.get();
    }
    
    @Override
    public byte[] k0() {
        return this.a.array();
    }
    
    @Override
    public b1 l0(final int n, final byte[] array) {
        return this.o0(n, array, 0, array.length);
    }
    
    @Override
    public ByteBuffer m0() {
        return this.a;
    }
    
    @Override
    public b1 n0() {
        return new c1(this.a.asReadOnlyBuffer());
    }
    
    @Override
    public b1 o0(final int n, final byte[] array, final int n2, final int n3) {
        for (int i = 0; i < n3; ++i) {
            array[n2 + i] = this.a.get(n + i);
        }
        return this;
    }
    
    @Override
    public b1 p0(final byte[] dst, final int offset, final int length) {
        this.a.get(dst, offset, length);
        return this;
    }
    
    @Override
    public b1 q0(final int newLimit) {
        this.a.limit(newLimit);
        return this;
    }
    
    @Override
    public b1 r0(final int n, final byte b) {
        this.a.put(n, b);
        return this;
    }
    
    @Override
    public void release() {
        if (this.b.decrementAndGet() >= 0) {
            if (this.b.get() == 0) {
                this.a = null;
            }
            return;
        }
        this.b.incrementAndGet();
        throw new IllegalStateException("Attempted to decrement the reference count below 0");
    }
    
    @Override
    public b1 t0(final byte[] dst) {
        this.a.get(dst);
        return this;
    }
    
    @Override
    public b1 u0(final ByteOrder bo) {
        this.a.order(bo);
        return this;
    }
    
    @Override
    public b1 v0(final byte[] src, final int offset, final int length) {
        this.a.put(src, offset, length);
        return this;
    }
    
    @Override
    public b1 w0(final byte b) {
        this.a.put(b);
        return this;
    }
    
    @Override
    public int x0() {
        return this.a.getInt();
    }
    
    @Override
    public int y0() {
        return this.a.remaining();
    }
    
    @Override
    public b1 z0(final int newPosition) {
        this.a.position(newPosition);
        return this;
    }
}
