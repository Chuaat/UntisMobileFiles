// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

import java.util.Arrays;
import java.lang.reflect.Field;

final class i3
{
    private int A;
    private int B;
    private Field C;
    private Object D;
    private Object E;
    private Object F;
    private final j3 a;
    private final Object[] b;
    private Class<?> c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private final int[] n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;
    private int w;
    private int x;
    private int y;
    private int z;
    
    i3(final Class<?> c, final String s, final Object[] b) {
        this.q = Integer.MAX_VALUE;
        this.r = Integer.MIN_VALUE;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = 0;
        this.w = 0;
        this.c = c;
        final j3 a = new j3(s);
        this.a = a;
        this.b = b;
        this.d = a.b();
        final int b2 = a.b();
        this.e = b2;
        int[] n = null;
        if (b2 == 0) {
            this.f = 0;
            this.g = 0;
            this.h = 0;
            this.i = 0;
            this.j = 0;
            this.l = 0;
            this.k = 0;
            this.m = 0;
            this.n = null;
            return;
        }
        final int b3 = a.b();
        this.f = b3;
        final int b4 = a.b();
        this.g = b4;
        this.h = a.b();
        this.i = a.b();
        this.l = a.b();
        this.k = a.b();
        this.j = a.b();
        this.m = a.b();
        final int b5 = a.b();
        if (b5 != 0) {
            n = new int[b5];
        }
        this.n = n;
        this.o = (b3 << 1) + b4;
    }
    
    private static Field c(final Class<?> clazz, final String str) {
        try {
            return clazz.getDeclaredField(str);
        }
        catch (NoSuchFieldException ex) {
            final Field[] declaredFields = clazz.getDeclaredFields();
            for (final Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            final String name = clazz.getName();
            final String string = Arrays.toString(declaredFields);
            final StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + name.length() + String.valueOf(string).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(string);
            throw new RuntimeException(sb.toString());
        }
    }
    
    private final Object f() {
        return this.b[this.o++];
    }
    
    private final boolean i() {
        return (this.d & 0x1) == 0x1;
    }
    
    final boolean a() {
        final boolean a = this.a.a();
        final int n = 0;
        if (!a) {
            return false;
        }
        this.x = this.a.b();
        final int b = this.a.b();
        this.y = b;
        final int z = b & 0xFF;
        this.z = z;
        final int x = this.x;
        if (x < this.q) {
            this.q = x;
        }
        if (x > this.r) {
            this.r = x;
        }
        final e1 j0 = e1.J0;
        if (z == j0.b()) {
            ++this.s;
        }
        else if (this.z >= e1.d0.b() && this.z <= e1.I0.b()) {
            ++this.t;
        }
        final int w = this.w + 1;
        this.w = w;
        int u;
        if (m3.s(this.q, this.x, w)) {
            final int v = this.x + 1;
            this.v = v;
            u = v - this.q;
        }
        else {
            u = this.u + 1;
        }
        this.u = u;
        if ((this.y & 0x400) != 0x0) {
            this.n[this.p++] = this.x;
        }
        this.D = null;
        this.E = null;
        this.F = null;
        Object d = null;
        Label_0367: {
            Label_0361: {
                if (this.k()) {
                    this.A = this.a.b();
                    if (this.z == e1.U.b() + 51) {
                        break Label_0361;
                    }
                    if (this.z == e1.c0.b() + 51) {
                        break Label_0361;
                    }
                    if (this.z != e1.X.b() + 51 || !this.i()) {
                        return true;
                    }
                }
                else {
                    this.C = c(this.c, (String)this.f());
                    if (this.o()) {
                        this.B = this.a.b();
                    }
                    if (this.z == e1.U.b() || this.z == e1.c0.b()) {
                        d = this.C.getType();
                        break Label_0367;
                    }
                    if (this.z == e1.m0.b()) {
                        break Label_0361;
                    }
                    if (this.z == e1.I0.b()) {
                        break Label_0361;
                    }
                    if (this.z != e1.X.b() && this.z != e1.p0.b() && this.z != e1.D0.b()) {
                        if (this.z != j0.b()) {
                            return true;
                        }
                        this.F = this.f();
                        int n2 = n;
                        if ((this.y & 0x800) != 0x0) {
                            n2 = 1;
                        }
                        if (n2 == 0) {
                            return true;
                        }
                    }
                    else if (!this.i()) {
                        return true;
                    }
                }
                this.E = this.f();
                return true;
            }
            d = this.f();
        }
        this.D = d;
        return true;
    }
    
    final int g() {
        return this.x;
    }
    
    final int h() {
        return this.z;
    }
    
    final boolean k() {
        return this.z > e1.J0.b();
    }
    
    final Field l() {
        final int n = this.A << 1;
        final Object o = this.b[n];
        if (o instanceof Field) {
            return (Field)o;
        }
        return (Field)(this.b[n] = c(this.c, (String)o));
    }
    
    final Field m() {
        final int n = (this.A << 1) + 1;
        final Object o = this.b[n];
        if (o instanceof Field) {
            return (Field)o;
        }
        return (Field)(this.b[n] = c(this.c, (String)o));
    }
    
    final Field n() {
        return this.C;
    }
    
    final boolean o() {
        return this.i() && this.z <= e1.c0.b();
    }
    
    final Field p() {
        final int n = (this.f << 1) + this.B / 32;
        final Object o = this.b[n];
        if (o instanceof Field) {
            return (Field)o;
        }
        return (Field)(this.b[n] = c(this.c, (String)o));
    }
    
    final int q() {
        return this.B % 32;
    }
    
    final boolean r() {
        return (this.y & 0x100) != 0x0;
    }
    
    final boolean s() {
        return (this.y & 0x200) != 0x0;
    }
    
    final Object t() {
        return this.D;
    }
    
    final Object u() {
        return this.E;
    }
    
    final Object v() {
        return this.F;
    }
}
