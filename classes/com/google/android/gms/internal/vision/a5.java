// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.Map;
import java.util.List;
import java.io.IOException;
import java.nio.ByteBuffer;

final class a5 extends y4
{
    private final boolean a;
    private final byte[] b;
    private int c;
    private final int d;
    private int e;
    private int f;
    private int g;
    
    public a5(final ByteBuffer byteBuffer, final boolean b) {
        super(null);
        this.a = true;
        this.b = byteBuffer.array();
        final int n = byteBuffer.arrayOffset() + byteBuffer.position();
        this.c = n;
        this.d = n;
        this.e = byteBuffer.arrayOffset() + byteBuffer.limit();
    }
    
    private final Object Q(final ca ca, final Class<?> clazz, final b6 b6) throws IOException {
        switch (b5.a[ca.ordinal()]) {
            default: {
                throw new RuntimeException("unsupported field type.");
            }
            case 17: {
                return this.o();
            }
            case 16: {
                return this.t();
            }
            case 15: {
                return this.R(true);
            }
            case 14: {
                return this.d();
            }
            case 13: {
                return this.b();
            }
            case 12: {
                return this.l();
            }
            case 11: {
                return this.n();
            }
            case 10: {
                return this.N(clazz, b6);
            }
            case 9: {
                return this.m();
            }
            case 8: {
                return this.g();
            }
            case 7: {
                return this.e();
            }
            case 6: {
                return this.k();
            }
            case 5: {
                return this.r();
            }
            case 4: {
                return this.j();
            }
            case 3: {
                return this.c();
            }
            case 2: {
                return this.s();
            }
            case 1: {
                return this.i();
            }
        }
    }
    
    private final String R(final boolean b) throws IOException {
        this.Z(2);
        final int f0 = this.f0();
        if (f0 == 0) {
            return "";
        }
        this.X(f0);
        if (b) {
            final byte[] b2 = this.b;
            final int c = this.c;
            if (!u9.g(b2, c, c + f0)) {
                throw y6.i();
            }
        }
        final String s = new String(this.b, this.c, f0, t6.a);
        this.c += f0;
        return s;
    }
    
    private final void S(final int n) throws IOException {
        this.X(n);
        this.c += n;
    }
    
    private final void T(final List<String> list, final boolean b) throws IOException {
        if ((this.f & 0x7) != 0x2) {
            throw y6.g();
        }
        if (list instanceof j7 && !b) {
            final j7 j7 = (j7)list;
            int c;
            do {
                j7.q4(this.s());
                if (this.e0()) {
                    return;
                }
                c = this.c;
            } while (this.f0() == this.f);
            this.c = c;
            return;
        }
        int c2;
        do {
            list.add(this.R(b));
            if (this.e0()) {
                return;
            }
            c2 = this.c;
        } while (this.f0() == this.f);
        this.c = c2;
    }
    
    private final long U() throws IOException {
        this.X(8);
        return this.W();
    }
    
    private final int V() {
        final int c = this.c;
        final byte[] b = this.b;
        this.c = c + 4;
        return (b[c + 3] & 0xFF) << 24 | ((b[c] & 0xFF) | (b[c + 1] & 0xFF) << 8 | (b[c + 2] & 0xFF) << 16);
    }
    
    private final long W() {
        final int c = this.c;
        final byte[] b = this.b;
        this.c = c + 8;
        return ((long)b[c + 7] & 0xFFL) << 56 | (((long)b[c] & 0xFFL) | ((long)b[c + 1] & 0xFFL) << 8 | ((long)b[c + 2] & 0xFFL) << 16 | ((long)b[c + 3] & 0xFFL) << 24 | ((long)b[c + 4] & 0xFFL) << 32 | ((long)b[c + 5] & 0xFFL) << 40 | ((long)b[c + 6] & 0xFFL) << 48);
    }
    
    private final void X(final int n) throws IOException {
        if (n >= 0 && n <= this.e - this.c) {
            return;
        }
        throw y6.a();
    }
    
    private final <T> T Y(final s8<T> s8, final b6 b6) throws IOException {
        final int f0 = this.f0();
        this.X(f0);
        final int e = this.e;
        final int e2 = this.c + f0;
        this.e = e2;
        try {
            final T zza = s8.zza();
            s8.h(zza, this, b6);
            s8.b(zza);
            if (this.c == e2) {
                return zza;
            }
            throw y6.h();
        }
        finally {
            this.e = e;
        }
    }
    
    private final void Z(final int n) throws IOException {
        if ((this.f & 0x7) == n) {
            return;
        }
        throw y6.g();
    }
    
    private final <T> T a0(final s8<T> s8, final b6 b6) throws IOException {
        final int g = this.g;
        this.g = (this.f >>> 3 << 3 | 0x4);
        try {
            final T zza = s8.zza();
            s8.h(zza, this, b6);
            s8.b(zza);
            if (this.f == this.g) {
                return zza;
            }
            throw y6.h();
        }
        finally {
            this.g = g;
        }
    }
    
    private final void b0(final int n) throws IOException {
        this.X(n);
        if ((n & 0x7) == 0x0) {
            return;
        }
        throw y6.h();
    }
    
    private final void c0(final int n) throws IOException {
        this.X(n);
        if ((n & 0x3) == 0x0) {
            return;
        }
        throw y6.h();
    }
    
    private final void d0(final int n) throws IOException {
        if (this.c == n) {
            return;
        }
        throw y6.a();
    }
    
    private final boolean e0() {
        return this.c == this.e;
    }
    
    private final int f0() throws IOException {
        final int c = this.c;
        final int e = this.e;
        if (e == c) {
            throw y6.a();
        }
        final byte[] b = this.b;
        final int c2 = c + 1;
        final byte b2 = b[c];
        if (b2 >= 0) {
            this.c = c2;
            return b2;
        }
        if (e - c2 < 9) {
            return (int)this.h0();
        }
        int c3 = c2 + 1;
        final int n = b2 ^ b[c2] << 7;
        int n2;
        if (n < 0) {
            n2 = (n ^ 0xFFFFFF80);
        }
        else {
            final int n3 = c3 + 1;
            final int n4 = n ^ b[c3] << 14;
            if (n4 >= 0) {
                final int n5 = n4 ^ 0x3F80;
                c3 = n3;
                n2 = n5;
            }
            else {
                c3 = n3 + 1;
                final int n6 = n4 ^ b[n3] << 21;
                if (n6 < 0) {
                    n2 = (n6 ^ 0xFFE03F80);
                }
                else {
                    final int n7 = c3 + 1;
                    final byte b3 = b[c3];
                    final int n8 = n2 = (n6 ^ b3 << 28 ^ 0xFE03F80);
                    c3 = n7;
                    if (b3 < 0) {
                        final int n9 = n7 + 1;
                        n2 = n8;
                        c3 = n9;
                        if (b[n7] < 0) {
                            final int n10 = n9 + 1;
                            n2 = n8;
                            c3 = n10;
                            if (b[n9] < 0) {
                                final int n11 = n10 + 1;
                                n2 = n8;
                                c3 = n11;
                                if (b[n10] < 0) {
                                    final int n12 = n11 + 1;
                                    n2 = n8;
                                    c3 = n12;
                                    if (b[n11] < 0) {
                                        c3 = n12 + 1;
                                        if (b[n12] < 0) {
                                            throw y6.d();
                                        }
                                        n2 = n8;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        this.c = c3;
        return n2;
    }
    
    private final long g0() throws IOException {
        final int c = this.c;
        final int e = this.e;
        if (e == c) {
            throw y6.a();
        }
        final byte[] b = this.b;
        final int c2 = c + 1;
        final byte b2 = b[c];
        if (b2 >= 0) {
            this.c = c2;
            return b2;
        }
        if (e - c2 < 9) {
            return this.h0();
        }
        int c3 = c2 + 1;
        final int n = b2 ^ b[c2] << 7;
        long n5 = 0L;
        Label_0360: {
            int n2;
            if (n < 0) {
                n2 = (n ^ 0xFFFFFF80);
            }
            else {
                final int n3 = c3 + 1;
                final int n4 = n ^ b[c3] << 14;
                if (n4 >= 0) {
                    n5 = (n4 ^ 0x3F80);
                    c3 = n3;
                    break Label_0360;
                }
                c3 = n3 + 1;
                final int n6 = n4 ^ b[n3] << 21;
                if (n6 >= 0) {
                    final long n7 = n6;
                    final int n8 = c3 + 1;
                    long n9 = n7 ^ (long)b[c3] << 28;
                    long n13 = 0L;
                    Label_0189: {
                        if (n9 < 0L) {
                            final int n10 = n8 + 1;
                            long n11 = n9 ^ (long)b[n8] << 35;
                            long n12;
                            if (n11 < 0L) {
                                n12 = -34093383808L;
                                c3 = n10;
                            }
                            else {
                                c3 = n10 + 1;
                                n9 = (n11 ^ (long)b[n10] << 42);
                                if (n9 >= 0L) {
                                    n13 = 4363953127296L;
                                    break Label_0189;
                                }
                                final int n14 = c3 + 1;
                                n11 = (n9 ^ (long)b[c3] << 49);
                                if (n11 < 0L) {
                                    n12 = -558586000294016L;
                                    c3 = n14;
                                }
                                else {
                                    c3 = n14 + 1;
                                    n5 = (n11 ^ (long)b[n14] << 56 ^ 0xFE03F80FE03F80L);
                                    if (n5 >= 0L) {
                                        break Label_0360;
                                    }
                                    final int n15 = c3 + 1;
                                    if (b[c3] >= 0L) {
                                        c3 = n15;
                                        break Label_0360;
                                    }
                                    throw y6.d();
                                }
                            }
                            n5 = (n11 ^ n12);
                            break Label_0360;
                        }
                        n13 = 266354560L;
                        c3 = n8;
                    }
                    n5 = (n9 ^ n13);
                    break Label_0360;
                }
                n2 = (n6 ^ 0xFFE03F80);
            }
            n5 = n2;
        }
        this.c = c3;
        return n5;
    }
    
    private final long h0() throws IOException {
        long n = 0L;
        for (int i = 0; i < 64; i += 7) {
            final byte i2 = this.i0();
            n |= (long)(i2 & 0x7F) << i;
            if ((i2 & 0x80) == 0x0) {
                return n;
            }
        }
        throw y6.d();
    }
    
    private final byte i0() throws IOException {
        final int c = this.c;
        if (c != this.e) {
            final byte[] b = this.b;
            this.c = c + 1;
            return b[c];
        }
        throw y6.a();
    }
    
    private final int j0() throws IOException {
        this.X(4);
        return this.V();
    }
    
    @Override
    public final <K, V> void A(final Map<K, V> map, final u7<K, V> u7, final b6 b6) throws IOException {
        this.Z(2);
        final int f0 = this.f0();
        this.X(f0);
        final int e = this.e;
        this.e = this.c + f0;
        try {
            Object o = u7.b;
            Object o2 = u7.d;
            while (true) {
                final int zza = this.zza();
                if (zza != Integer.MAX_VALUE) {
                    Label_0123: {
                        if (zza == 1) {
                            break Label_0123;
                        }
                        Label_0098: {
                            if (zza == 2) {
                                break Label_0098;
                            }
                            try {
                                if (this.a()) {
                                    continue;
                                }
                                throw new y6("Unable to parse map entry.");
                                o2 = this.Q(u7.c, u7.d.getClass(), b6);
                                continue;
                                o = this.Q(u7.a, null, null);
                                continue;
                            }
                            catch (b7 b7) {
                                if (this.a()) {
                                    continue;
                                }
                                throw new y6("Unable to parse map entry.");
                            }
                        }
                    }
                    break;
                }
                break;
            }
            map.put((K)o, (V)o2);
        }
        finally {
            this.e = e;
        }
    }
    
    @Override
    public final void B(final List<String> list) throws IOException {
        this.T(list, false);
    }
    
    @Override
    public final void C(final List<Long> list) throws IOException {
        if (list instanceof m7) {
            final m7 m7 = (m7)list;
            final int n = this.f & 0x7;
            if (n == 0) {
                int c;
                do {
                    m7.f(this.d());
                    if (this.e0()) {
                        return;
                    }
                    c = this.c;
                } while (this.f0() == this.f);
                this.c = c;
                return;
            }
            if (n == 2) {
                while (this.c < this.c + this.f0()) {
                    m7.f(s5.b(this.g0()));
                }
                return;
            }
            throw y6.g();
        }
        else {
            final int n2 = this.f & 0x7;
            if (n2 == 0) {
                int c2;
                do {
                    list.add(this.d());
                    if (this.e0()) {
                        return;
                    }
                    c2 = this.c;
                } while (this.f0() == this.f);
                this.c = c2;
                return;
            }
            if (n2 == 2) {
                while (this.c < this.c + this.f0()) {
                    list.add(s5.b(this.g0()));
                }
                return;
            }
            throw y6.g();
        }
    }
    
    @Override
    public final void D(final List<Integer> list) throws IOException {
        if (list instanceof r6) {
            final r6 r6 = (r6)list;
            final int n = this.f & 0x7;
            if (n == 0) {
                int c;
                do {
                    r6.h(this.t());
                    if (this.e0()) {
                        return;
                    }
                    c = this.c;
                } while (this.f0() == this.f);
                this.c = c;
                return;
            }
            if (n == 2) {
                while (this.c < this.c + this.f0()) {
                    r6.h(this.f0());
                }
                return;
            }
            throw y6.g();
        }
        else {
            final int n2 = this.f & 0x7;
            if (n2 == 0) {
                int c2;
                do {
                    list.add(this.t());
                    if (this.e0()) {
                        return;
                    }
                    c2 = this.c;
                } while (this.f0() == this.f);
                this.c = c2;
                return;
            }
            if (n2 == 2) {
                while (this.c < this.c + this.f0()) {
                    list.add(this.f0());
                }
                return;
            }
            throw y6.g();
        }
    }
    
    @Override
    public final void E(final List<Long> list) throws IOException {
        if (list instanceof m7) {
            final m7 m7 = (m7)list;
            final int n = this.f & 0x7;
            if (n == 0) {
                int c;
                do {
                    m7.f(this.o());
                    if (this.e0()) {
                        return;
                    }
                    c = this.c;
                } while (this.f0() == this.f);
                this.c = c;
                return;
            }
            if (n == 2) {
                final int n2 = this.c + this.f0();
                while (this.c < n2) {
                    m7.f(this.g0());
                }
                this.d0(n2);
                return;
            }
            throw y6.g();
        }
        else {
            final int n3 = this.f & 0x7;
            if (n3 == 0) {
                int c2;
                do {
                    list.add(this.o());
                    if (this.e0()) {
                        return;
                    }
                    c2 = this.c;
                } while (this.f0() == this.f);
                this.c = c2;
                return;
            }
            if (n3 == 2) {
                final int n4 = this.c + this.f0();
                while (this.c < n4) {
                    list.add(this.g0());
                }
                this.d0(n4);
                return;
            }
            throw y6.g();
        }
    }
    
    @Override
    public final <T> void F(final List<T> list, final s8<T> s8, final b6 b6) throws IOException {
        final int f = this.f;
        if ((f & 0x7) == 0x2) {
            int c;
            do {
                list.add(this.Y(s8, b6));
                if (this.e0()) {
                    return;
                }
                c = this.c;
            } while (this.f0() == f);
            this.c = c;
            return;
        }
        throw y6.g();
    }
    
    @Override
    public final void G(final List<f5> list) throws IOException {
        if ((this.f & 0x7) == 0x2) {
            int c;
            do {
                list.add(this.s());
                if (this.e0()) {
                    return;
                }
                c = this.c;
            } while (this.f0() == this.f);
            this.c = c;
            return;
        }
        throw y6.g();
    }
    
    @Override
    public final void H(final List<Float> list) throws IOException {
        if (list instanceof o6) {
            final o6 o6 = (o6)list;
            final int n = this.f & 0x7;
            if (n == 2) {
                final int f0 = this.f0();
                this.c0(f0);
                while (this.c < this.c + f0) {
                    o6.f(Float.intBitsToFloat(this.V()));
                }
                return;
            }
            if (n == 5) {
                int c;
                do {
                    o6.f(this.e());
                    if (this.e0()) {
                        return;
                    }
                    c = this.c;
                } while (this.f0() == this.f);
                this.c = c;
                return;
            }
            throw y6.g();
        }
        else {
            final int n2 = this.f & 0x7;
            if (n2 == 2) {
                final int f2 = this.f0();
                this.c0(f2);
                while (this.c < this.c + f2) {
                    list.add(Float.intBitsToFloat(this.V()));
                }
                return;
            }
            if (n2 == 5) {
                int c2;
                do {
                    list.add(this.e());
                    if (this.e0()) {
                        return;
                    }
                    c2 = this.c;
                } while (this.f0() == this.f);
                this.c = c2;
                return;
            }
            throw y6.g();
        }
    }
    
    @Override
    public final void I(final List<Integer> list) throws IOException {
        if (list instanceof r6) {
            final r6 r6 = (r6)list;
            final int n = this.f & 0x7;
            if (n == 2) {
                final int f0 = this.f0();
                this.c0(f0);
                while (this.c < this.c + f0) {
                    r6.h(this.V());
                }
                return;
            }
            if (n == 5) {
                int c;
                do {
                    r6.h(this.n());
                    if (this.e0()) {
                        return;
                    }
                    c = this.c;
                } while (this.f0() == this.f);
                this.c = c;
                return;
            }
            throw y6.g();
        }
        else {
            final int n2 = this.f & 0x7;
            if (n2 == 2) {
                final int f2 = this.f0();
                this.c0(f2);
                while (this.c < this.c + f2) {
                    list.add(this.V());
                }
                return;
            }
            if (n2 == 5) {
                int c2;
                do {
                    list.add(this.n());
                    if (this.e0()) {
                        return;
                    }
                    c2 = this.c;
                } while (this.f0() == this.f);
                this.c = c2;
                return;
            }
            throw y6.g();
        }
    }
    
    @Override
    public final <T> T J(final Class<T> clazz, final b6 b6) throws IOException {
        this.Z(3);
        return this.a0((s8<T>)n8.a().b((Class<T>)clazz), b6);
    }
    
    @Override
    public final void K(final List<Integer> list) throws IOException {
        if (list instanceof r6) {
            final r6 r6 = (r6)list;
            final int n = this.f & 0x7;
            if (n == 0) {
                int c;
                do {
                    r6.h(this.g());
                    if (this.e0()) {
                        return;
                    }
                    c = this.c;
                } while (this.f0() == this.f);
                this.c = c;
                return;
            }
            if (n == 2) {
                final int n2 = this.c + this.f0();
                while (this.c < n2) {
                    r6.h(this.f0());
                }
                this.d0(n2);
                return;
            }
            throw y6.g();
        }
        else {
            final int n3 = this.f & 0x7;
            if (n3 == 0) {
                int c2;
                do {
                    list.add(this.g());
                    if (this.e0()) {
                        return;
                    }
                    c2 = this.c;
                } while (this.f0() == this.f);
                this.c = c2;
                return;
            }
            if (n3 == 2) {
                final int n4 = this.c + this.f0();
                while (this.c < n4) {
                    list.add(this.f0());
                }
                this.d0(n4);
                return;
            }
            throw y6.g();
        }
    }
    
    @Override
    public final <T> T L(final s8<T> s8, final b6 b6) throws IOException {
        this.Z(3);
        return (T)this.a0((s8<Object>)s8, b6);
    }
    
    @Override
    public final void M(final List<Integer> list) throws IOException {
        if (list instanceof r6) {
            final r6 r6 = (r6)list;
            final int n = this.f & 0x7;
            if (n == 0) {
                int c;
                do {
                    r6.h(this.j());
                    if (this.e0()) {
                        return;
                    }
                    c = this.c;
                } while (this.f0() == this.f);
                this.c = c;
                return;
            }
            if (n == 2) {
                while (this.c < this.c + this.f0()) {
                    r6.h(this.f0());
                }
                return;
            }
            throw y6.g();
        }
        else {
            final int n2 = this.f & 0x7;
            if (n2 == 0) {
                int c2;
                do {
                    list.add(this.j());
                    if (this.e0()) {
                        return;
                    }
                    c2 = this.c;
                } while (this.f0() == this.f);
                this.c = c2;
                return;
            }
            if (n2 == 2) {
                while (this.c < this.c + this.f0()) {
                    list.add(this.f0());
                }
                return;
            }
            throw y6.g();
        }
    }
    
    @Override
    public final <T> T N(final Class<T> clazz, final b6 b6) throws IOException {
        this.Z(2);
        return this.Y((s8<T>)n8.a().b((Class<T>)clazz), b6);
    }
    
    @Override
    public final void O(final List<Long> list) throws IOException {
        if (list instanceof m7) {
            final m7 m7 = (m7)list;
            final int n = this.f & 0x7;
            if (n == 0) {
                int c;
                do {
                    m7.f(this.m());
                    if (this.e0()) {
                        return;
                    }
                    c = this.c;
                } while (this.f0() == this.f);
                this.c = c;
                return;
            }
            if (n == 2) {
                final int n2 = this.c + this.f0();
                while (this.c < n2) {
                    m7.f(this.g0());
                }
                this.d0(n2);
                return;
            }
            throw y6.g();
        }
        else {
            final int n3 = this.f & 0x7;
            if (n3 == 0) {
                int c2;
                do {
                    list.add(this.m());
                    if (this.e0()) {
                        return;
                    }
                    c2 = this.c;
                } while (this.f0() == this.f);
                this.c = c2;
                return;
            }
            if (n3 == 2) {
                final int n4 = this.c + this.f0();
                while (this.c < n4) {
                    list.add(this.g0());
                }
                this.d0(n4);
                return;
            }
            throw y6.g();
        }
    }
    
    @Override
    public final <T> T P(final s8<T> s8, final b6 b6) throws IOException {
        this.Z(2);
        return (T)this.Y((s8<Object>)s8, b6);
    }
    
    @Override
    public final boolean a() throws IOException {
        final boolean e0 = this.e0();
        final int n = 0;
        if (!e0) {
            final int f = this.f;
            final int g = this.g;
            if (f != g) {
                final int n2 = f & 0x7;
                if (n2 != 0) {
                    int f2;
                    if (n2 != 1) {
                        if (n2 != 2) {
                            if (n2 != 3) {
                                if (n2 == 5) {
                                    this.S(4);
                                    return true;
                                }
                                throw y6.g();
                            }
                            else {
                                this.g = (f >>> 3 << 3 | 0x4);
                                while (this.zza() != Integer.MAX_VALUE && this.a()) {}
                                if (this.f == this.g) {
                                    this.g = g;
                                    return true;
                                }
                                throw y6.h();
                            }
                        }
                        else {
                            f2 = this.f0();
                        }
                    }
                    else {
                        f2 = 8;
                    }
                    this.S(f2);
                    return true;
                }
                final int e2 = this.e;
                int c = this.c;
                int i = n;
                if (e2 - c >= 10) {
                    final byte[] b = this.b;
                    int n3 = 0;
                    while (true) {
                        i = n;
                        if (n3 >= 10) {
                            break;
                        }
                        final int c2 = c + 1;
                        if (b[c] >= 0) {
                            this.c = c2;
                            return true;
                        }
                        ++n3;
                        c = c2;
                    }
                }
                while (i < 10) {
                    if (this.i0() >= 0) {
                        return true;
                    }
                    ++i;
                }
                throw y6.d();
            }
        }
        return false;
    }
    
    @Override
    public final int b() throws IOException {
        this.Z(0);
        return s5.k(this.f0());
    }
    
    @Override
    public final double c() throws IOException {
        this.Z(1);
        return Double.longBitsToDouble(this.U());
    }
    
    @Override
    public final long d() throws IOException {
        this.Z(0);
        return s5.b(this.g0());
    }
    
    @Override
    public final float e() throws IOException {
        this.Z(5);
        return Float.intBitsToFloat(this.j0());
    }
    
    @Override
    public final void f(final List<Boolean> list) throws IOException {
        if (list instanceof d5) {
            final d5 d5 = (d5)list;
            final int n = this.f & 0x7;
            if (n == 0) {
                int c;
                do {
                    d5.f(this.i());
                    if (this.e0()) {
                        return;
                    }
                    c = this.c;
                } while (this.f0() == this.f);
                this.c = c;
                return;
            }
            if (n == 2) {
                final int n2 = this.c + this.f0();
                while (this.c < n2) {
                    d5.f(this.f0() != 0);
                }
                this.d0(n2);
                return;
            }
            throw y6.g();
        }
        else {
            final int n3 = this.f & 0x7;
            if (n3 == 0) {
                int c2;
                do {
                    list.add(this.i());
                    if (this.e0()) {
                        return;
                    }
                    c2 = this.c;
                } while (this.f0() == this.f);
                this.c = c2;
                return;
            }
            if (n3 == 2) {
                final int n4 = this.c + this.f0();
                while (this.c < n4) {
                    list.add(this.f0() != 0);
                }
                this.d0(n4);
                return;
            }
            throw y6.g();
        }
    }
    
    @Override
    public final int g() throws IOException {
        this.Z(0);
        return this.f0();
    }
    
    @Override
    public final void h(final List<Integer> list) throws IOException {
        if (list instanceof r6) {
            final r6 r6 = (r6)list;
            final int n = this.f & 0x7;
            if (n == 2) {
                final int f0 = this.f0();
                this.c0(f0);
                while (this.c < this.c + f0) {
                    r6.h(this.V());
                }
                return;
            }
            if (n == 5) {
                int c;
                do {
                    r6.h(this.r());
                    if (this.e0()) {
                        return;
                    }
                    c = this.c;
                } while (this.f0() == this.f);
                this.c = c;
                return;
            }
            throw y6.g();
        }
        else {
            final int n2 = this.f & 0x7;
            if (n2 == 2) {
                final int f2 = this.f0();
                this.c0(f2);
                while (this.c < this.c + f2) {
                    list.add(this.V());
                }
                return;
            }
            if (n2 == 5) {
                int c2;
                do {
                    list.add(this.r());
                    if (this.e0()) {
                        return;
                    }
                    c2 = this.c;
                } while (this.f0() == this.f);
                this.c = c2;
                return;
            }
            throw y6.g();
        }
    }
    
    @Override
    public final boolean i() throws IOException {
        boolean b = false;
        this.Z(0);
        if (this.f0() != 0) {
            b = true;
        }
        return b;
    }
    
    @Override
    public final int j() throws IOException {
        this.Z(0);
        return this.f0();
    }
    
    @Override
    public final long k() throws IOException {
        this.Z(1);
        return this.U();
    }
    
    @Override
    public final long l() throws IOException {
        this.Z(1);
        return this.U();
    }
    
    @Override
    public final long m() throws IOException {
        this.Z(0);
        return this.g0();
    }
    
    @Override
    public final int n() throws IOException {
        this.Z(5);
        return this.j0();
    }
    
    @Override
    public final long o() throws IOException {
        this.Z(0);
        return this.g0();
    }
    
    @Override
    public final String p() throws IOException {
        return this.R(false);
    }
    
    @Override
    public final String q() throws IOException {
        return this.R(true);
    }
    
    @Override
    public final int r() throws IOException {
        this.Z(5);
        return this.j0();
    }
    
    @Override
    public final f5 s() throws IOException {
        this.Z(2);
        final int f0 = this.f0();
        if (f0 == 0) {
            return f5.H;
        }
        this.X(f0);
        f5 f2;
        if (this.a) {
            f2 = f5.w(this.b, this.c, f0);
        }
        else {
            f2 = f5.n(this.b, this.c, f0);
        }
        this.c += f0;
        return f2;
    }
    
    @Override
    public final int t() throws IOException {
        this.Z(0);
        return this.f0();
    }
    
    @Override
    public final void u(final List<Integer> list) throws IOException {
        if (list instanceof r6) {
            final r6 r6 = (r6)list;
            final int n = this.f & 0x7;
            if (n == 0) {
                int c;
                do {
                    r6.h(this.b());
                    if (this.e0()) {
                        return;
                    }
                    c = this.c;
                } while (this.f0() == this.f);
                this.c = c;
                return;
            }
            if (n == 2) {
                while (this.c < this.c + this.f0()) {
                    r6.h(s5.k(this.f0()));
                }
                return;
            }
            throw y6.g();
        }
        else {
            final int n2 = this.f & 0x7;
            if (n2 == 0) {
                int c2;
                do {
                    list.add(this.b());
                    if (this.e0()) {
                        return;
                    }
                    c2 = this.c;
                } while (this.f0() == this.f);
                this.c = c2;
                return;
            }
            if (n2 == 2) {
                while (this.c < this.c + this.f0()) {
                    list.add(s5.k(this.f0()));
                }
                return;
            }
            throw y6.g();
        }
    }
    
    @Override
    public final void v(final List<Long> list) throws IOException {
        if (list instanceof m7) {
            final m7 m7 = (m7)list;
            final int n = this.f & 0x7;
            if (n == 1) {
                int c;
                do {
                    m7.f(this.l());
                    if (this.e0()) {
                        return;
                    }
                    c = this.c;
                } while (this.f0() == this.f);
                this.c = c;
                return;
            }
            if (n == 2) {
                final int f0 = this.f0();
                this.b0(f0);
                while (this.c < this.c + f0) {
                    m7.f(this.W());
                }
                return;
            }
            throw y6.g();
        }
        else {
            final int n2 = this.f & 0x7;
            if (n2 == 1) {
                int c2;
                do {
                    list.add(this.l());
                    if (this.e0()) {
                        return;
                    }
                    c2 = this.c;
                } while (this.f0() == this.f);
                this.c = c2;
                return;
            }
            if (n2 == 2) {
                final int f2 = this.f0();
                this.b0(f2);
                while (this.c < this.c + f2) {
                    list.add(this.W());
                }
                return;
            }
            throw y6.g();
        }
    }
    
    @Override
    public final void w(final List<Long> list) throws IOException {
        if (list instanceof m7) {
            final m7 m7 = (m7)list;
            final int n = this.f & 0x7;
            if (n == 1) {
                int c;
                do {
                    m7.f(this.k());
                    if (this.e0()) {
                        return;
                    }
                    c = this.c;
                } while (this.f0() == this.f);
                this.c = c;
                return;
            }
            if (n == 2) {
                final int f0 = this.f0();
                this.b0(f0);
                while (this.c < this.c + f0) {
                    m7.f(this.W());
                }
                return;
            }
            throw y6.g();
        }
        else {
            final int n2 = this.f & 0x7;
            if (n2 == 1) {
                int c2;
                do {
                    list.add(this.k());
                    if (this.e0()) {
                        return;
                    }
                    c2 = this.c;
                } while (this.f0() == this.f);
                this.c = c2;
                return;
            }
            if (n2 == 2) {
                final int f2 = this.f0();
                this.b0(f2);
                while (this.c < this.c + f2) {
                    list.add(this.W());
                }
                return;
            }
            throw y6.g();
        }
    }
    
    @Override
    public final <T> void x(final List<T> list, final s8<T> s8, final b6 b6) throws IOException {
        final int f = this.f;
        if ((f & 0x7) == 0x3) {
            int c;
            do {
                list.add(this.a0(s8, b6));
                if (this.e0()) {
                    return;
                }
                c = this.c;
            } while (this.f0() == f);
            this.c = c;
            return;
        }
        throw y6.g();
    }
    
    @Override
    public final void y(final List<String> list) throws IOException {
        this.T(list, true);
    }
    
    @Override
    public final void z(final List<Double> list) throws IOException {
        if (list instanceof a6) {
            final a6 a6 = (a6)list;
            final int n = this.f & 0x7;
            if (n == 1) {
                int c;
                do {
                    a6.f(this.c());
                    if (this.e0()) {
                        return;
                    }
                    c = this.c;
                } while (this.f0() == this.f);
                this.c = c;
                return;
            }
            if (n == 2) {
                final int f0 = this.f0();
                this.b0(f0);
                while (this.c < this.c + f0) {
                    a6.f(Double.longBitsToDouble(this.W()));
                }
                return;
            }
            throw y6.g();
        }
        else {
            final int n2 = this.f & 0x7;
            if (n2 == 1) {
                int c2;
                do {
                    list.add(this.c());
                    if (this.e0()) {
                        return;
                    }
                    c2 = this.c;
                } while (this.f0() == this.f);
                this.c = c2;
                return;
            }
            if (n2 == 2) {
                final int f2 = this.f0();
                this.b0(f2);
                while (this.c < this.c + f2) {
                    list.add(Double.longBitsToDouble(this.W()));
                }
                return;
            }
            throw y6.g();
        }
    }
    
    @Override
    public final int zza() throws IOException {
        if (this.e0()) {
            return Integer.MAX_VALUE;
        }
        final int f0 = this.f0();
        if ((this.f = f0) == this.g) {
            return Integer.MAX_VALUE;
        }
        return f0 >>> 3;
    }
    
    @Override
    public final int zzb() {
        return this.f;
    }
}
