// 
// Decompiled by Procyon v0.5.36
// 

package com.getkeepsafe.relinker.elf;

import java.io.EOFException;
import java.util.Iterator;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.File;
import java.nio.channels.FileChannel;
import java.io.Closeable;

public class f implements Closeable, c
{
    private final int G;
    private final FileChannel H;
    
    public f(final File file) throws FileNotFoundException {
        this.G = 1179403647;
        if (file != null && file.exists()) {
            this.H = new FileInputStream(file).getChannel();
            return;
        }
        throw new IllegalArgumentException("File is null or does not exist");
    }
    
    private long a(final b b, final long n, final long n2) throws IOException {
        for (long n3 = 0L; n3 < n; ++n3) {
            final c b2 = b.b(n3);
            if (b2.a == 1L) {
                final long c = b2.c;
                if (c <= n2 && n2 <= b2.d + c) {
                    return n2 - c + b2.b;
                }
            }
        }
        throw new IllegalStateException("Could not map vma to file offset!");
    }
    
    public b b() throws IOException {
        this.H.position(0L);
        final ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        if (this.j(allocate, 0L) != 1179403647L) {
            throw new IllegalArgumentException("Invalid ELF Magic!");
        }
        final short e = this.e(allocate, 4L);
        final boolean b = this.e(allocate, 5L) == 2;
        if (e == 1) {
            return new com.getkeepsafe.relinker.elf.d(b, this);
        }
        if (e == 2) {
            return new e(b, this);
        }
        throw new IllegalStateException("Invalid class type!");
    }
    
    public List<String> c() throws IOException {
        this.H.position(0L);
        final ArrayList<String> list = new ArrayList<String>();
        final b b = this.b();
        final ByteBuffer allocate = ByteBuffer.allocate(8);
        ByteOrder bo;
        if (b.a) {
            bo = ByteOrder.BIG_ENDIAN;
        }
        else {
            bo = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(bo);
        final long n = b.f;
        int n2 = 0;
        long a = n;
        if (n == 65535L) {
            a = b.c(0).a;
        }
        long n3 = 0L;
        while (true) {
            while (n3 < a) {
                final c b2 = b.b(n3);
                if (b2.a == 2L) {
                    final long b3 = b2.b;
                    if (b3 == 0L) {
                        return (List<String>)Collections.unmodifiableList((List<?>)list);
                    }
                    final ArrayList<Long> list2 = new ArrayList<Long>();
                    long b4 = 0L;
                    a a2;
                    do {
                        a2 = b.a(b3, n2);
                        final long a3 = a2.a;
                        if (a3 == 1L) {
                            list2.add(a2.b);
                        }
                        else if (a3 == 5L) {
                            b4 = a2.b;
                        }
                        ++n2;
                    } while (a2.a != 0L);
                    if (b4 != 0L) {
                        final long a4 = this.a(b, a, b4);
                        final Iterator<Object> iterator = list2.iterator();
                        while (iterator.hasNext()) {
                            list.add(this.h(allocate, iterator.next() + a4));
                        }
                        return list;
                    }
                    throw new IllegalStateException("String table offset not found!");
                }
                else {
                    ++n3;
                }
            }
            final long b3 = 0L;
            continue;
        }
    }
    
    @Override
    public void close() throws IOException {
        this.H.close();
    }
    
    protected void d(final ByteBuffer byteBuffer, final long n, final int n2) throws IOException {
        byteBuffer.position(0);
        byteBuffer.limit(n2);
        int read;
        for (long n3 = 0L; n3 < n2; n3 += read) {
            read = this.H.read(byteBuffer, n + n3);
            if (read == -1) {
                throw new EOFException();
            }
        }
        byteBuffer.position(0);
    }
    
    protected short e(final ByteBuffer byteBuffer, final long n) throws IOException {
        this.d(byteBuffer, n, 1);
        return (short)(byteBuffer.get() & 0xFF);
    }
    
    protected int f(final ByteBuffer byteBuffer, final long n) throws IOException {
        this.d(byteBuffer, n, 2);
        return byteBuffer.getShort() & 0xFFFF;
    }
    
    protected long g(final ByteBuffer byteBuffer, final long n) throws IOException {
        this.d(byteBuffer, n, 8);
        return byteBuffer.getLong();
    }
    
    protected String h(final ByteBuffer byteBuffer, long n) throws IOException {
        final StringBuilder sb = new StringBuilder();
        while (true) {
            final short e = this.e(byteBuffer, n);
            if (e == 0) {
                break;
            }
            sb.append((char)e);
            ++n;
        }
        return sb.toString();
    }
    
    protected long j(final ByteBuffer byteBuffer, final long n) throws IOException {
        this.d(byteBuffer, n, 4);
        return (long)byteBuffer.getInt() & 0xFFFFFFFFL;
    }
}
