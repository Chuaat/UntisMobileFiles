// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.Map;
import java.util.List;
import java.io.IOException;

final class t5 implements t8
{
    private final s5 a;
    private int b;
    private int c;
    private int d;
    
    private t5(s5 a) {
        this.d = 0;
        a = t6.f(a, "input");
        this.a = a;
        a.d = this;
    }
    
    public static t5 Q(final s5 s5) {
        final t5 d = s5.d;
        if (d != null) {
            return d;
        }
        return new t5(s5);
    }
    
    private final Object R(final ca ca, final Class<?> clazz, final b6 b6) throws IOException {
        switch (w5.a[ca.ordinal()]) {
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
                return this.q();
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
    
    private final void S(final int n) throws IOException {
        if ((this.b & 0x7) == n) {
            return;
        }
        throw y6.g();
    }
    
    private final void T(final List<String> list, final boolean b) throws IOException {
        if ((this.b & 0x7) != 0x2) {
            throw y6.g();
        }
        if (list instanceof j7 && !b) {
            final j7 j7 = (j7)list;
            int i;
            do {
                j7.q4(this.s());
                if (this.a.A()) {
                    return;
                }
                i = this.a.a();
            } while (i == this.b);
            this.d = i;
            return;
        }
        int k;
        do {
            String s;
            if (b) {
                s = this.q();
            }
            else {
                s = this.p();
            }
            list.add(s);
            if (this.a.A()) {
                return;
            }
            k = this.a.a();
        } while (k == this.b);
        this.d = k;
    }
    
    private static void U(final int n) throws IOException {
        if ((n & 0x7) == 0x0) {
            return;
        }
        throw y6.h();
    }
    
    private final <T> T V(final s8<T> s8, final b6 b6) throws IOException {
        final int t = this.a.t();
        final s5 a = this.a;
        if (a.a < a.b) {
            final int h = a.h(t);
            final T zza = s8.zza();
            final s5 a2 = this.a;
            ++a2.a;
            s8.h(zza, this, b6);
            s8.b(zza);
            this.a.d(0);
            final s5 a3 = this.a;
            --a3.a;
            a3.j(h);
            return zza;
        }
        throw new y6("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }
    
    private static void W(final int n) throws IOException {
        if ((n & 0x3) == 0x0) {
            return;
        }
        throw y6.h();
    }
    
    private final <T> T X(final s8<T> s8, final b6 b6) throws IOException {
        final int c = this.c;
        this.c = (this.b >>> 3 << 3 | 0x4);
        try {
            final T zza = s8.zza();
            s8.h(zza, this, b6);
            s8.b(zza);
            if (this.b == this.c) {
                return zza;
            }
            throw y6.h();
        }
        finally {
            this.c = c;
        }
    }
    
    private final void Y(final int n) throws IOException {
        if (this.a.B() == n) {
            return;
        }
        throw y6.a();
    }
    
    @Override
    public final <K, V> void A(final Map<K, V> map, final u7<K, V> u7, final b6 b6) throws IOException {
        this.S(2);
        final int h = this.a.h(this.a.t());
        Object o = u7.b;
        Object o2 = u7.d;
        try {
            while (true) {
                final int zza = this.zza();
                if (zza != Integer.MAX_VALUE && !this.a.A()) {
                    Label_0126: {
                        if (zza == 1) {
                            break Label_0126;
                        }
                        Label_0101: {
                            if (zza == 2) {
                                break Label_0101;
                            }
                            try {
                                if (this.a()) {
                                    continue;
                                }
                                throw new y6("Unable to parse map entry.");
                                o = this.R(u7.a, null, null);
                                continue;
                                o2 = this.R(u7.c, u7.d.getClass(), b6);
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
            this.a.j(h);
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
            final int n = this.b & 0x7;
            if (n == 0) {
                int i;
                do {
                    m7.f(this.a.y());
                    if (this.a.A()) {
                        return;
                    }
                    i = this.a.a();
                } while (i == this.b);
                this.d = i;
                return;
            }
            if (n == 2) {
                final int n2 = this.a.B() + this.a.t();
                do {
                    m7.f(this.a.y());
                } while (this.a.B() < n2);
                this.Y(n2);
                return;
            }
            throw y6.g();
        }
        else {
            final int n3 = this.b & 0x7;
            if (n3 == 0) {
                int j;
                do {
                    list.add(this.a.y());
                    if (this.a.A()) {
                        return;
                    }
                    j = this.a.a();
                } while (j == this.b);
                this.d = j;
                return;
            }
            if (n3 == 2) {
                final int n4 = this.a.B() + this.a.t();
                do {
                    list.add(this.a.y());
                } while (this.a.B() < n4);
                this.Y(n4);
                return;
            }
            throw y6.g();
        }
    }
    
    @Override
    public final void D(final List<Integer> list) throws IOException {
        if (list instanceof r6) {
            final r6 r6 = (r6)list;
            final int n = this.b & 0x7;
            if (n == 0) {
                int i;
                do {
                    r6.h(this.a.t());
                    if (this.a.A()) {
                        return;
                    }
                    i = this.a.a();
                } while (i == this.b);
                this.d = i;
                return;
            }
            if (n == 2) {
                final int n2 = this.a.B() + this.a.t();
                do {
                    r6.h(this.a.t());
                } while (this.a.B() < n2);
                this.Y(n2);
                return;
            }
            throw y6.g();
        }
        else {
            final int n3 = this.b & 0x7;
            if (n3 == 0) {
                int j;
                do {
                    list.add(this.a.t());
                    if (this.a.A()) {
                        return;
                    }
                    j = this.a.a();
                } while (j == this.b);
                this.d = j;
                return;
            }
            if (n3 == 2) {
                final int n4 = this.a.B() + this.a.t();
                do {
                    list.add(this.a.t());
                } while (this.a.B() < n4);
                this.Y(n4);
                return;
            }
            throw y6.g();
        }
    }
    
    @Override
    public final void E(final List<Long> list) throws IOException {
        if (list instanceof m7) {
            final m7 m7 = (m7)list;
            final int n = this.b & 0x7;
            if (n == 0) {
                int i;
                do {
                    m7.f(this.a.i());
                    if (this.a.A()) {
                        return;
                    }
                    i = this.a.a();
                } while (i == this.b);
                this.d = i;
                return;
            }
            if (n == 2) {
                final int n2 = this.a.B() + this.a.t();
                do {
                    m7.f(this.a.i());
                } while (this.a.B() < n2);
                this.Y(n2);
                return;
            }
            throw y6.g();
        }
        else {
            final int n3 = this.b & 0x7;
            if (n3 == 0) {
                int j;
                do {
                    list.add(this.a.i());
                    if (this.a.A()) {
                        return;
                    }
                    j = this.a.a();
                } while (j == this.b);
                this.d = j;
                return;
            }
            if (n3 == 2) {
                final int n4 = this.a.B() + this.a.t();
                do {
                    list.add(this.a.i());
                } while (this.a.B() < n4);
                this.Y(n4);
                return;
            }
            throw y6.g();
        }
    }
    
    @Override
    public final <T> void F(final List<T> list, final s8<T> s8, final b6 b6) throws IOException {
        final int b7 = this.b;
        if ((b7 & 0x7) == 0x2) {
            int i;
            do {
                list.add(this.V(s8, b6));
                if (!this.a.A()) {
                    if (this.d == 0) {
                        i = this.a.a();
                        continue;
                    }
                }
                return;
            } while (i == b7);
            this.d = i;
            return;
        }
        throw y6.g();
    }
    
    @Override
    public final void G(final List<f5> list) throws IOException {
        if ((this.b & 0x7) == 0x2) {
            int i;
            do {
                list.add(this.s());
                if (this.a.A()) {
                    return;
                }
                i = this.a.a();
            } while (i == this.b);
            this.d = i;
            return;
        }
        throw y6.g();
    }
    
    @Override
    public final void H(final List<Float> list) throws IOException {
        if (list instanceof o6) {
            final o6 o6 = (o6)list;
            final int n = this.b & 0x7;
            if (n == 2) {
                final int t = this.a.t();
                W(t);
                do {
                    o6.f(this.a.g());
                } while (this.a.B() < this.a.B() + t);
                return;
            }
            if (n == 5) {
                int i;
                do {
                    o6.f(this.a.g());
                    if (this.a.A()) {
                        return;
                    }
                    i = this.a.a();
                } while (i == this.b);
                this.d = i;
                return;
            }
            throw y6.g();
        }
        else {
            final int n2 = this.b & 0x7;
            if (n2 == 2) {
                final int t2 = this.a.t();
                W(t2);
                do {
                    list.add(this.a.g());
                } while (this.a.B() < this.a.B() + t2);
                return;
            }
            if (n2 == 5) {
                int j;
                do {
                    list.add(this.a.g());
                    if (this.a.A()) {
                        return;
                    }
                    j = this.a.a();
                } while (j == this.b);
                this.d = j;
                return;
            }
            throw y6.g();
        }
    }
    
    @Override
    public final void I(final List<Integer> list) throws IOException {
        if (list instanceof r6) {
            final r6 r6 = (r6)list;
            final int n = this.b & 0x7;
            if (n == 2) {
                final int t = this.a.t();
                W(t);
                do {
                    r6.h(this.a.v());
                } while (this.a.B() < this.a.B() + t);
                return;
            }
            if (n == 5) {
                int i;
                do {
                    r6.h(this.a.v());
                    if (this.a.A()) {
                        return;
                    }
                    i = this.a.a();
                } while (i == this.b);
                this.d = i;
                return;
            }
            throw y6.g();
        }
        else {
            final int n2 = this.b & 0x7;
            if (n2 == 2) {
                final int t2 = this.a.t();
                W(t2);
                do {
                    list.add(this.a.v());
                } while (this.a.B() < this.a.B() + t2);
                return;
            }
            if (n2 == 5) {
                int j;
                do {
                    list.add(this.a.v());
                    if (this.a.A()) {
                        return;
                    }
                    j = this.a.a();
                } while (j == this.b);
                this.d = j;
                return;
            }
            throw y6.g();
        }
    }
    
    @Override
    public final <T> T J(final Class<T> clazz, final b6 b6) throws IOException {
        this.S(3);
        return this.X((s8<T>)n8.a().b((Class<T>)clazz), b6);
    }
    
    @Override
    public final void K(final List<Integer> list) throws IOException {
        if (list instanceof r6) {
            final r6 r6 = (r6)list;
            final int n = this.b & 0x7;
            if (n == 0) {
                int i;
                do {
                    r6.h(this.a.m());
                    if (this.a.A()) {
                        return;
                    }
                    i = this.a.a();
                } while (i == this.b);
                this.d = i;
                return;
            }
            if (n == 2) {
                final int n2 = this.a.B() + this.a.t();
                do {
                    r6.h(this.a.m());
                } while (this.a.B() < n2);
                this.Y(n2);
                return;
            }
            throw y6.g();
        }
        else {
            final int n3 = this.b & 0x7;
            if (n3 == 0) {
                int j;
                do {
                    list.add(this.a.m());
                    if (this.a.A()) {
                        return;
                    }
                    j = this.a.a();
                } while (j == this.b);
                this.d = j;
                return;
            }
            if (n3 == 2) {
                final int n4 = this.a.B() + this.a.t();
                do {
                    list.add(this.a.m());
                } while (this.a.B() < n4);
                this.Y(n4);
                return;
            }
            throw y6.g();
        }
    }
    
    @Override
    public final <T> T L(final s8<T> s8, final b6 b6) throws IOException {
        this.S(3);
        return (T)this.X((s8<Object>)s8, b6);
    }
    
    @Override
    public final void M(final List<Integer> list) throws IOException {
        if (list instanceof r6) {
            final r6 r6 = (r6)list;
            final int n = this.b & 0x7;
            if (n == 0) {
                int i;
                do {
                    r6.h(this.a.u());
                    if (this.a.A()) {
                        return;
                    }
                    i = this.a.a();
                } while (i == this.b);
                this.d = i;
                return;
            }
            if (n == 2) {
                final int n2 = this.a.B() + this.a.t();
                do {
                    r6.h(this.a.u());
                } while (this.a.B() < n2);
                this.Y(n2);
                return;
            }
            throw y6.g();
        }
        else {
            final int n3 = this.b & 0x7;
            if (n3 == 0) {
                int j;
                do {
                    list.add(this.a.u());
                    if (this.a.A()) {
                        return;
                    }
                    j = this.a.a();
                } while (j == this.b);
                this.d = j;
                return;
            }
            if (n3 == 2) {
                final int n4 = this.a.B() + this.a.t();
                do {
                    list.add(this.a.u());
                } while (this.a.B() < n4);
                this.Y(n4);
                return;
            }
            throw y6.g();
        }
    }
    
    @Override
    public final <T> T N(final Class<T> clazz, final b6 b6) throws IOException {
        this.S(2);
        return this.V((s8<T>)n8.a().b((Class<T>)clazz), b6);
    }
    
    @Override
    public final void O(final List<Long> list) throws IOException {
        if (list instanceof m7) {
            final m7 m7 = (m7)list;
            final int n = this.b & 0x7;
            if (n == 0) {
                int i;
                do {
                    m7.f(this.a.l());
                    if (this.a.A()) {
                        return;
                    }
                    i = this.a.a();
                } while (i == this.b);
                this.d = i;
                return;
            }
            if (n == 2) {
                final int n2 = this.a.B() + this.a.t();
                do {
                    m7.f(this.a.l());
                } while (this.a.B() < n2);
                this.Y(n2);
                return;
            }
            throw y6.g();
        }
        else {
            final int n3 = this.b & 0x7;
            if (n3 == 0) {
                int j;
                do {
                    list.add(this.a.l());
                    if (this.a.A()) {
                        return;
                    }
                    j = this.a.a();
                } while (j == this.b);
                this.d = j;
                return;
            }
            if (n3 == 2) {
                final int n4 = this.a.B() + this.a.t();
                do {
                    list.add(this.a.l());
                } while (this.a.B() < n4);
                this.Y(n4);
                return;
            }
            throw y6.g();
        }
    }
    
    @Override
    public final <T> T P(final s8<T> s8, final b6 b6) throws IOException {
        this.S(2);
        return (T)this.V((s8<Object>)s8, b6);
    }
    
    @Override
    public final boolean a() throws IOException {
        if (!this.a.A()) {
            final int b = this.b;
            if (b != this.c) {
                return this.a.f(b);
            }
        }
        return false;
    }
    
    @Override
    public final int b() throws IOException {
        this.S(0);
        return this.a.x();
    }
    
    @Override
    public final double c() throws IOException {
        this.S(1);
        return this.a.e();
    }
    
    @Override
    public final long d() throws IOException {
        this.S(0);
        return this.a.y();
    }
    
    @Override
    public final float e() throws IOException {
        this.S(5);
        return this.a.g();
    }
    
    @Override
    public final void f(final List<Boolean> list) throws IOException {
        if (list instanceof d5) {
            final d5 d5 = (d5)list;
            final int n = this.b & 0x7;
            if (n == 0) {
                int i;
                do {
                    d5.f(this.a.p());
                    if (this.a.A()) {
                        return;
                    }
                    i = this.a.a();
                } while (i == this.b);
                this.d = i;
                return;
            }
            if (n == 2) {
                final int n2 = this.a.B() + this.a.t();
                do {
                    d5.f(this.a.p());
                } while (this.a.B() < n2);
                this.Y(n2);
                return;
            }
            throw y6.g();
        }
        else {
            final int n3 = this.b & 0x7;
            if (n3 == 0) {
                int j;
                do {
                    list.add(this.a.p());
                    if (this.a.A()) {
                        return;
                    }
                    j = this.a.a();
                } while (j == this.b);
                this.d = j;
                return;
            }
            if (n3 == 2) {
                final int n4 = this.a.B() + this.a.t();
                do {
                    list.add(this.a.p());
                } while (this.a.B() < n4);
                this.Y(n4);
                return;
            }
            throw y6.g();
        }
    }
    
    @Override
    public final int g() throws IOException {
        this.S(0);
        return this.a.m();
    }
    
    @Override
    public final void h(final List<Integer> list) throws IOException {
        if (list instanceof r6) {
            final r6 r6 = (r6)list;
            final int n = this.b & 0x7;
            if (n == 2) {
                final int t = this.a.t();
                W(t);
                do {
                    r6.h(this.a.o());
                } while (this.a.B() < this.a.B() + t);
                return;
            }
            if (n == 5) {
                int i;
                do {
                    r6.h(this.a.o());
                    if (this.a.A()) {
                        return;
                    }
                    i = this.a.a();
                } while (i == this.b);
                this.d = i;
                return;
            }
            throw y6.g();
        }
        else {
            final int n2 = this.b & 0x7;
            if (n2 == 2) {
                final int t2 = this.a.t();
                W(t2);
                do {
                    list.add(this.a.o());
                } while (this.a.B() < this.a.B() + t2);
                return;
            }
            if (n2 == 5) {
                int j;
                do {
                    list.add(this.a.o());
                    if (this.a.A()) {
                        return;
                    }
                    j = this.a.a();
                } while (j == this.b);
                this.d = j;
                return;
            }
            throw y6.g();
        }
    }
    
    @Override
    public final boolean i() throws IOException {
        this.S(0);
        return this.a.p();
    }
    
    @Override
    public final int j() throws IOException {
        this.S(0);
        return this.a.u();
    }
    
    @Override
    public final long k() throws IOException {
        this.S(1);
        return this.a.n();
    }
    
    @Override
    public final long l() throws IOException {
        this.S(1);
        return this.a.w();
    }
    
    @Override
    public final long m() throws IOException {
        this.S(0);
        return this.a.l();
    }
    
    @Override
    public final int n() throws IOException {
        this.S(5);
        return this.a.v();
    }
    
    @Override
    public final long o() throws IOException {
        this.S(0);
        return this.a.i();
    }
    
    @Override
    public final String p() throws IOException {
        this.S(2);
        return this.a.q();
    }
    
    @Override
    public final String q() throws IOException {
        this.S(2);
        return this.a.r();
    }
    
    @Override
    public final int r() throws IOException {
        this.S(5);
        return this.a.o();
    }
    
    @Override
    public final f5 s() throws IOException {
        this.S(2);
        return this.a.s();
    }
    
    @Override
    public final int t() throws IOException {
        this.S(0);
        return this.a.t();
    }
    
    @Override
    public final void u(final List<Integer> list) throws IOException {
        if (list instanceof r6) {
            final r6 r6 = (r6)list;
            final int n = this.b & 0x7;
            if (n == 0) {
                int i;
                do {
                    r6.h(this.a.x());
                    if (this.a.A()) {
                        return;
                    }
                    i = this.a.a();
                } while (i == this.b);
                this.d = i;
                return;
            }
            if (n == 2) {
                final int n2 = this.a.B() + this.a.t();
                do {
                    r6.h(this.a.x());
                } while (this.a.B() < n2);
                this.Y(n2);
                return;
            }
            throw y6.g();
        }
        else {
            final int n3 = this.b & 0x7;
            if (n3 == 0) {
                int j;
                do {
                    list.add(this.a.x());
                    if (this.a.A()) {
                        return;
                    }
                    j = this.a.a();
                } while (j == this.b);
                this.d = j;
                return;
            }
            if (n3 == 2) {
                final int n4 = this.a.B() + this.a.t();
                do {
                    list.add(this.a.x());
                } while (this.a.B() < n4);
                this.Y(n4);
                return;
            }
            throw y6.g();
        }
    }
    
    @Override
    public final void v(final List<Long> list) throws IOException {
        if (list instanceof m7) {
            final m7 m7 = (m7)list;
            final int n = this.b & 0x7;
            if (n == 1) {
                int i;
                do {
                    m7.f(this.a.w());
                    if (this.a.A()) {
                        return;
                    }
                    i = this.a.a();
                } while (i == this.b);
                this.d = i;
                return;
            }
            if (n == 2) {
                final int t = this.a.t();
                U(t);
                do {
                    m7.f(this.a.w());
                } while (this.a.B() < this.a.B() + t);
                return;
            }
            throw y6.g();
        }
        else {
            final int n2 = this.b & 0x7;
            if (n2 == 1) {
                int j;
                do {
                    list.add(this.a.w());
                    if (this.a.A()) {
                        return;
                    }
                    j = this.a.a();
                } while (j == this.b);
                this.d = j;
                return;
            }
            if (n2 == 2) {
                final int t2 = this.a.t();
                U(t2);
                do {
                    list.add(this.a.w());
                } while (this.a.B() < this.a.B() + t2);
                return;
            }
            throw y6.g();
        }
    }
    
    @Override
    public final void w(final List<Long> list) throws IOException {
        if (list instanceof m7) {
            final m7 m7 = (m7)list;
            final int n = this.b & 0x7;
            if (n == 1) {
                int i;
                do {
                    m7.f(this.a.n());
                    if (this.a.A()) {
                        return;
                    }
                    i = this.a.a();
                } while (i == this.b);
                this.d = i;
                return;
            }
            if (n == 2) {
                final int t = this.a.t();
                U(t);
                do {
                    m7.f(this.a.n());
                } while (this.a.B() < this.a.B() + t);
                return;
            }
            throw y6.g();
        }
        else {
            final int n2 = this.b & 0x7;
            if (n2 == 1) {
                int j;
                do {
                    list.add(this.a.n());
                    if (this.a.A()) {
                        return;
                    }
                    j = this.a.a();
                } while (j == this.b);
                this.d = j;
                return;
            }
            if (n2 == 2) {
                final int t2 = this.a.t();
                U(t2);
                do {
                    list.add(this.a.n());
                } while (this.a.B() < this.a.B() + t2);
                return;
            }
            throw y6.g();
        }
    }
    
    @Override
    public final <T> void x(final List<T> list, final s8<T> s8, final b6 b6) throws IOException {
        final int b7 = this.b;
        if ((b7 & 0x7) == 0x3) {
            int i;
            do {
                list.add(this.X(s8, b6));
                if (!this.a.A()) {
                    if (this.d == 0) {
                        i = this.a.a();
                        continue;
                    }
                }
                return;
            } while (i == b7);
            this.d = i;
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
            final int n = this.b & 0x7;
            if (n == 1) {
                int i;
                do {
                    a6.f(this.a.e());
                    if (this.a.A()) {
                        return;
                    }
                    i = this.a.a();
                } while (i == this.b);
                this.d = i;
                return;
            }
            if (n == 2) {
                final int t = this.a.t();
                U(t);
                do {
                    a6.f(this.a.e());
                } while (this.a.B() < this.a.B() + t);
                return;
            }
            throw y6.g();
        }
        else {
            final int n2 = this.b & 0x7;
            if (n2 == 1) {
                int j;
                do {
                    list.add(this.a.e());
                    if (this.a.A()) {
                        return;
                    }
                    j = this.a.a();
                } while (j == this.b);
                this.d = j;
                return;
            }
            if (n2 == 2) {
                final int t2 = this.a.t();
                U(t2);
                do {
                    list.add(this.a.e());
                } while (this.a.B() < this.a.B() + t2);
                return;
            }
            throw y6.g();
        }
    }
    
    @Override
    public final int zza() throws IOException {
        final int d = this.d;
        if (d != 0) {
            this.b = d;
            this.d = 0;
        }
        else {
            this.b = this.a.a();
        }
        final int b = this.b;
        if (b != 0 && b != this.c) {
            return b >>> 3;
        }
        return Integer.MAX_VALUE;
    }
    
    @Override
    public final int zzb() {
        return this.b;
    }
}
