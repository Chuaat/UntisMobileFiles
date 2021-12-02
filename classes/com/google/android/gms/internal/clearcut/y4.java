// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import java.nio.ReadOnlyBufferException;
import java.nio.BufferOverflowException;
import java.io.IOException;
import java.nio.ByteOrder;
import java.nio.ByteBuffer;

public final class y4
{
    private final ByteBuffer a;
    private p0 b;
    private int c;
    
    private y4(final ByteBuffer a) {
        (this.a = a).order(ByteOrder.LITTLE_ENDIAN);
    }
    
    private y4(final byte[] array, final int offset, final int length) {
        this(ByteBuffer.wrap(array, offset, length));
    }
    
    private static int A(final int n) {
        if ((n & 0xFFFFFF80) == 0x0) {
            return 1;
        }
        if ((n & 0xFFFFC000) == 0x0) {
            return 2;
        }
        if ((0xFFE00000 & n) == 0x0) {
            return 3;
        }
        if ((n & 0xF0000000) == 0x0) {
            return 4;
        }
        return 5;
    }
    
    private static int a(final CharSequence seq) {
        final int length = seq.length();
        final int n = 0;
        int i;
        for (i = 0; i < length && seq.charAt(i) < '\u0080'; ++i) {}
        int n2 = length;
        int n3;
        while (true) {
            n3 = n2;
            if (i >= length) {
                break;
            }
            final char char1 = seq.charAt(i);
            if (char1 >= '\u0800') {
                final int length2 = seq.length();
                int n4 = n;
                while (i < length2) {
                    final char char2 = seq.charAt(i);
                    int n5;
                    if (char2 < '\u0800') {
                        n4 += '\u007f' - char2 >>> 31;
                        n5 = i;
                    }
                    else {
                        final int n6 = n4 += 2;
                        n5 = i;
                        if ('\ud800' <= char2) {
                            n4 = n6;
                            n5 = i;
                            if (char2 <= '\udfff') {
                                if (Character.codePointAt(seq, i) < 65536) {
                                    final StringBuilder sb = new StringBuilder(39);
                                    sb.append("Unpaired surrogate at index ");
                                    sb.append(i);
                                    throw new IllegalArgumentException(sb.toString());
                                }
                                n5 = i + 1;
                                n4 = n6;
                            }
                        }
                    }
                    i = n5 + 1;
                }
                n3 = n2 + n4;
                break;
            }
            n2 += '\u007f' - char1 >>> 31;
            ++i;
        }
        if (n3 >= length) {
            return n3;
        }
        final long n7 = n3;
        final StringBuilder sb2 = new StringBuilder(54);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(n7 + 4294967296L);
        throw new IllegalArgumentException(sb2.toString());
    }
    
    private final void e(final int n) throws IOException {
        final byte b = (byte)n;
        if (this.a.hasRemaining()) {
            this.a.put(b);
            return;
        }
        throw new z4(this.a.position(), this.a.limit());
    }
    
    private final void f(int n) throws IOException {
        while ((n & 0xFFFFFF80) != 0x0) {
            this.e((n & 0x7F) | 0x80);
            n >>>= 7;
        }
        this.e(n);
    }
    
    public static int g(int y, final f5 f5) {
        y = y(y);
        final int c = f5.c();
        return y + (A(c) + c);
    }
    
    public static int h(final int n, final String s) {
        return y(n) + r(s);
    }
    
    public static int i(final int n, final byte[] array) {
        return y(n) + s(array);
    }
    
    public static int m(final int n, final long n2) {
        return y(n) + x(n2);
    }
    
    private static void n(final CharSequence charSequence, final ByteBuffer byteBuffer) {
        if (!byteBuffer.isReadOnly()) {
            final boolean hasArray = byteBuffer.hasArray();
            final int n = 0;
            int i = 0;
            if (hasArray) {
                try {
                    final byte[] array = byteBuffer.array();
                    final int n2 = byteBuffer.arrayOffset() + byteBuffer.position();
                    final int remaining = byteBuffer.remaining();
                    final int length = charSequence.length();
                    final int n3 = remaining + n2;
                    while (i < length) {
                        final int n4 = i + n2;
                        if (n4 >= n3) {
                            break;
                        }
                        final char char1 = charSequence.charAt(i);
                        if (char1 >= '\u0080') {
                            break;
                        }
                        array[n4] = (byte)char1;
                        ++i;
                    }
                    int n5 = 0;
                    Label_0582: {
                        if (i != length) {
                            int j = n2 + i;
                            while (true) {
                                n5 = j;
                                if (i >= length) {
                                    break Label_0582;
                                }
                                final char char2 = charSequence.charAt(i);
                                if (char2 < '\u0080' && j < n3) {
                                    final int n6 = j + 1;
                                    array[j] = (byte)char2;
                                    j = n6;
                                }
                                else if (char2 < '\u0800' && j <= n3 - 2) {
                                    final int n7 = j + 1;
                                    array[j] = (byte)(char2 >>> 6 | 0x3C0);
                                    j = n7 + 1;
                                    array[n7] = (byte)((char2 & '?') | 0x80);
                                }
                                else if ((char2 < '\ud800' || '\udfff' < char2) && j <= n3 - 3) {
                                    final int n8 = j + 1;
                                    array[j] = (byte)(char2 >>> 12 | 0x1E0);
                                    final int n9 = n8 + 1;
                                    array[n8] = (byte)((char2 >>> 6 & 0x3F) | 0x80);
                                    j = n9 + 1;
                                    array[n9] = (byte)((char2 & '?') | 0x80);
                                }
                                else {
                                    if (j > n3 - 4) {
                                        final StringBuilder sb = new StringBuilder(37);
                                        sb.append("Failed writing ");
                                        sb.append(char2);
                                        sb.append(" at index ");
                                        sb.append(j);
                                        throw new ArrayIndexOutOfBoundsException(sb.toString());
                                    }
                                    final int n10 = i + 1;
                                    if (n10 == charSequence.length()) {
                                        break;
                                    }
                                    final char char3 = charSequence.charAt(n10);
                                    if (!Character.isSurrogatePair(char2, char3)) {
                                        i = n10;
                                        break;
                                    }
                                    final int codePoint = Character.toCodePoint(char2, char3);
                                    final int n11 = j + 1;
                                    array[j] = (byte)(codePoint >>> 18 | 0xF0);
                                    final int n12 = n11 + 1;
                                    array[n11] = (byte)((codePoint >>> 12 & 0x3F) | 0x80);
                                    final int n13 = n12 + 1;
                                    array[n12] = (byte)((codePoint >>> 6 & 0x3F) | 0x80);
                                    j = n13 + 1;
                                    array[n13] = (byte)((codePoint & 0x3F) | 0x80);
                                    i = n10;
                                }
                                ++i;
                            }
                            final StringBuilder sb2 = new StringBuilder(39);
                            sb2.append("Unpaired surrogate at index ");
                            sb2.append(i - 1);
                            throw new IllegalArgumentException(sb2.toString());
                        }
                        n5 = n2 + length;
                    }
                    byteBuffer.position(n5 - byteBuffer.arrayOffset());
                    return;
                }
                catch (ArrayIndexOutOfBoundsException cause) {
                    final BufferOverflowException ex = new BufferOverflowException();
                    ex.initCause(cause);
                    throw ex;
                }
            }
            for (int length2 = charSequence.length(), k = n; k < length2; ++k) {
                final char char4 = charSequence.charAt(k);
                int n14;
                if (char4 < '\u0080') {
                    n14 = char4;
                }
                else {
                    int n15;
                    if (char4 < '\u0800') {
                        n15 = (char4 >>> 6 | 0x3C0);
                    }
                    else {
                        if (char4 >= '\ud800' && '\udfff' >= char4) {
                            final int n16 = k + 1;
                            if (n16 != charSequence.length()) {
                                final char char5 = charSequence.charAt(n16);
                                if (Character.isSurrogatePair(char4, char5)) {
                                    final int codePoint2 = Character.toCodePoint(char4, char5);
                                    byteBuffer.put((byte)(codePoint2 >>> 18 | 0xF0));
                                    byteBuffer.put((byte)((codePoint2 >>> 12 & 0x3F) | 0x80));
                                    byteBuffer.put((byte)((codePoint2 >>> 6 & 0x3F) | 0x80));
                                    byteBuffer.put((byte)((codePoint2 & 0x3F) | 0x80));
                                    k = n16;
                                    continue;
                                }
                                k = n16;
                            }
                            final StringBuilder sb3 = new StringBuilder(39);
                            sb3.append("Unpaired surrogate at index ");
                            sb3.append(k - 1);
                            throw new IllegalArgumentException(sb3.toString());
                        }
                        byteBuffer.put((byte)(char4 >>> 12 | 0x1E0));
                        n15 = ((char4 >>> 6 & 0x3F) | 0x80);
                    }
                    byteBuffer.put((byte)n15);
                    n14 = ((char4 & '?') | 0x80);
                }
                byteBuffer.put((byte)n14);
            }
            return;
        }
        throw new ReadOnlyBufferException();
    }
    
    public static y4 q(final byte[] array) {
        return t(array, 0, array.length);
    }
    
    public static int r(final String s) {
        final int a = a(s);
        return A(a) + a;
    }
    
    public static int s(final byte[] array) {
        return A(array.length) + array.length;
    }
    
    public static y4 t(final byte[] array, final int n, final int n2) {
        return new y4(array, 0, n2);
    }
    
    public static long v(final long n) {
        return n >> 63 ^ n << 1;
    }
    
    public static int x(final long n) {
        if ((0xFFFFFFFFFFFFFF80L & n) == 0x0L) {
            return 1;
        }
        if ((0xFFFFFFFFFFFFC000L & n) == 0x0L) {
            return 2;
        }
        if ((0xFFFFFFFFFFE00000L & n) == 0x0L) {
            return 3;
        }
        if ((0xFFFFFFFFF0000000L & n) == 0x0L) {
            return 4;
        }
        if ((0xFFFFFFF800000000L & n) == 0x0L) {
            return 5;
        }
        if ((0xFFFFFC0000000000L & n) == 0x0L) {
            return 6;
        }
        if ((0xFFFE000000000000L & n) == 0x0L) {
            return 7;
        }
        if ((0xFF00000000000000L & n) == 0x0L) {
            return 8;
        }
        if ((n & Long.MIN_VALUE) == 0x0L) {
            return 9;
        }
        return 10;
    }
    
    public static int y(final int n) {
        return A(n << 3);
    }
    
    public static int z(final int n) {
        if (n >= 0) {
            return A(n);
        }
        return 10;
    }
    
    public final void b(final int n, final f5 f5) throws IOException {
        this.j(n, 2);
        if (f5.G < 0) {
            f5.c();
        }
        this.f(f5.G);
        f5.a(this);
    }
    
    public final void c(int position, final String s) throws IOException {
        this.j(position, 2);
        try {
            final int a = A(s.length());
            if (a != A(s.length() * 3)) {
                this.f(a(s));
                n(s, this.a);
                return;
            }
            position = this.a.position();
            if (this.a.remaining() >= a) {
                this.a.position(position + a);
                n(s, this.a);
                final int position2 = this.a.position();
                this.a.position(position);
                this.f(position2 - position - a);
                this.a.position(position2);
                return;
            }
            throw new z4(position + a, this.a.limit());
        }
        catch (BufferOverflowException cause) {
            final z4 z4 = new z4(this.a.position(), this.a.limit());
            z4.initCause(cause);
            throw z4;
        }
    }
    
    public final void d(int length, final byte[] src) throws IOException {
        this.j(length, 2);
        this.f(src.length);
        length = src.length;
        if (this.a.remaining() >= length) {
            this.a.put(src, 0, length);
            return;
        }
        throw new z4(this.a.position(), this.a.limit());
    }
    
    public final void j(final int n, final int n2) throws IOException {
        this.f(n << 3 | n2);
    }
    
    public final void k(final int n, final boolean b) throws IOException {
        this.j(25, 0);
        final byte b2 = (byte)(b ? 1 : 0);
        if (this.a.hasRemaining()) {
            this.a.put(b2);
            return;
        }
        throw new z4(this.a.position(), this.a.limit());
    }
    
    public final void l(final int n, final int n2) throws IOException {
        this.j(n, 0);
        if (n2 >= 0) {
            this.f(n2);
            return;
        }
        this.w(n2);
    }
    
    public final void o(final int n, final s2 s2) throws IOException {
        Label_0079: {
            if (this.b == null) {
                this.b = p0.f(this.a);
            }
            else {
                if (this.c == this.a.position()) {
                    break Label_0079;
                }
                this.b.c(this.a.array(), this.c, this.a.position() - this.c);
            }
            this.c = this.a.position();
        }
        final p0 b = this.b;
        b.n(n, s2);
        b.b();
        this.c = this.a.position();
    }
    
    public final void p() {
        if (this.a.remaining() == 0) {
            return;
        }
        throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", this.a.remaining()));
    }
    
    public final void u(final int n, final long n2) throws IOException {
        this.j(n, 0);
        this.w(n2);
    }
    
    public final void w(long n) throws IOException {
        while ((0xFFFFFFFFFFFFFF80L & n) != 0x0L) {
            this.e(((int)n & 0x7F) | 0x80);
            n >>>= 7;
        }
        this.e((int)n);
    }
}
