// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.codec.net;

import org.apache.commons.codec.f;
import org.apache.commons.codec.h;
import java.nio.ByteBuffer;
import java.util.BitSet;
import org.apache.commons.codec.a;

public class b implements org.apache.commons.codec.b, a
{
    private static final byte e = 37;
    private final BitSet a;
    private final boolean b;
    private int c;
    private int d;
    
    public b() {
        this.a = new BitSet();
        this.c = Integer.MAX_VALUE;
        this.d = Integer.MIN_VALUE;
        this.b = false;
        this.m((byte)37);
    }
    
    public b(final byte[] array, final boolean b) {
        this.a = new BitSet();
        this.c = Integer.MAX_VALUE;
        this.d = Integer.MIN_VALUE;
        this.b = b;
        this.n(array);
    }
    
    private boolean g(final byte bitIndex) {
        return !this.o(bitIndex) || (this.l(bitIndex) && this.a.get(bitIndex));
    }
    
    private boolean h(final byte[] array) {
        for (int length = array.length, i = 0; i < length; ++i) {
            if (array[i] == 32) {
                return true;
            }
        }
        return false;
    }
    
    private byte[] i(final byte[] array, int i, final boolean b) {
        final ByteBuffer allocate = ByteBuffer.allocate(i);
        int length;
        byte b2;
        byte b3;
        char b4;
        char b5;
        byte b6;
        for (length = array.length, i = 0; i < length; ++i) {
            b2 = array[i];
            if (b && this.g(b2)) {
                if ((b3 = b2) < 0) {
                    b3 = (byte)(b2 + 256);
                }
                b4 = org.apache.commons.codec.net.g.b(b3 >> 4);
                b5 = org.apache.commons.codec.net.g.b(b3);
                allocate.put((byte)37);
                allocate.put((byte)b4);
                b6 = (byte)b5;
            }
            else {
                b6 = b2;
                if (this.b && (b6 = b2) == 32) {
                    b6 = 43;
                }
            }
            allocate.put(b6);
        }
        return allocate.array();
    }
    
    private int j(final byte[] array) {
        int i;
        int n;
        int n2;
        for (i = 0, n = 0; i < array.length; i += n2, ++n) {
            if (array[i] == 37) {
                n2 = 3;
            }
            else {
                n2 = 1;
            }
        }
        return n;
    }
    
    private int k(final byte[] array) {
        final int length = array.length;
        int i = 0;
        int n = 0;
        while (i < length) {
            int n2;
            if (this.g(array[i])) {
                n2 = 3;
            }
            else {
                n2 = 1;
            }
            n += n2;
            ++i;
        }
        return n;
    }
    
    private boolean l(final byte b) {
        return b >= this.c && b <= this.d;
    }
    
    private void m(final byte d) {
        this.a.set(d);
        if (d < this.c) {
            this.c = d;
        }
        if (d > this.d) {
            this.d = d;
        }
    }
    
    private void n(final byte[] array) {
        if (array != null) {
            for (int length = array.length, i = 0; i < length; ++i) {
                this.m(array[i]);
            }
        }
        this.m((byte)37);
    }
    
    private boolean o(final byte b) {
        return b >= 0;
    }
    
    @Override
    public Object a(final Object o) throws h {
        if (o == null) {
            return null;
        }
        if (o instanceof byte[]) {
            return this.e((byte[])o);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Objects of type ");
        sb.append(o.getClass().getName());
        sb.append(" cannot be Percent encoded");
        throw new h(sb.toString());
    }
    
    @Override
    public byte[] c(final byte[] array) throws f {
        if (array == null) {
            return null;
        }
        final ByteBuffer allocate = ByteBuffer.allocate(this.j(array));
        for (int i = 0; i < array.length; ++i) {
            final byte b = array[i];
            if (b == 37) {
                ++i;
                try {
                    final int a = org.apache.commons.codec.net.g.a(array[i]);
                    ++i;
                    try {
                        allocate.put((byte)((a << 4) + org.apache.commons.codec.net.g.a(array[i])));
                    }
                    catch (ArrayIndexOutOfBoundsException ex) {
                        throw new f("Invalid percent decoding: ", ex);
                    }
                }
                catch (ArrayIndexOutOfBoundsException ex2) {}
            }
            byte b2 = b;
            if (this.b && (b2 = b) == 43) {
                b2 = 32;
            }
            allocate.put(b2);
        }
        return allocate.array();
    }
    
    @Override
    public byte[] e(final byte[] array) throws h {
        if (array == null) {
            return null;
        }
        final int k = this.k(array);
        final boolean b = k != array.length;
        if (!b && (!this.b || !this.h(array))) {
            return array;
        }
        return this.i(array, k, b);
    }
    
    @Override
    public Object f(final Object o) throws f {
        if (o == null) {
            return null;
        }
        if (o instanceof byte[]) {
            return this.c((byte[])o);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Objects of type ");
        sb.append(o.getClass().getName());
        sb.append(" cannot be Percent decoded");
        throw new f(sb.toString());
    }
}
