// 
// Decompiled by Procyon v0.5.36
// 

package org.bson;

import java.util.UUID;
import java.util.regex.Pattern;
import org.bson.types.Decimal128;
import org.bson.types.e;
import org.bson.types.g;
import java.util.Date;
import org.bson.types.h;
import org.bson.types.ObjectId;
import org.bson.types.b;
import java.util.List;
import org.bson.types.a;
import java.util.LinkedList;

public class j implements d
{
    private Object a;
    private final LinkedList<i> b;
    private final LinkedList<String> c;
    
    public j() {
        this.b = new LinkedList<i>();
        this.c = new LinkedList<String>();
        this.reset();
    }
    
    @Override
    public void A(final String s, final long l) {
        this.C(s, l);
    }
    
    @Override
    public void B(final String s, final int n, final int n2) {
        this.C(s, new a(n, n2));
    }
    
    protected void C(final String s, Object c) {
        final i g = this.G();
        if (c.l()) {
            c = c.c(c);
        }
        g.b(s, c);
    }
    
    public i D() {
        return new m();
    }
    
    public i E(final boolean b, final List<String> list) {
        i i;
        if (b) {
            i = this.F();
        }
        else {
            i = this.D();
        }
        return i;
    }
    
    protected i F() {
        return new b();
    }
    
    protected i G() {
        return this.b.getLast();
    }
    
    protected String H() {
        return this.c.peekLast();
    }
    
    protected boolean I() {
        final int size = this.b.size();
        boolean b = true;
        if (size >= 1) {
            b = false;
        }
        return b;
    }
    
    protected void J(final Object a) {
        this.a = a;
    }
    
    @Override
    public void a(final String s) {
        this.G().b(s, null);
    }
    
    @Override
    public void b(final String s, final String s2, final ObjectId objectId) {
        this.C(s, new m("$ns", s2).a("$id", objectId));
    }
    
    @Override
    public void c() {
        if (this.b.size() <= 0) {
            final i e = this.E(false, null);
            this.a = e;
            this.b.add(e);
            return;
        }
        throw new IllegalStateException("Illegal object beginning in current context.");
    }
    
    @Override
    public d d() {
        return new j();
    }
    
    @Override
    public void e() {
        final i e = this.E(true, null);
        this.a = e;
        this.b.add(e);
    }
    
    @Override
    public void f(final String e) {
        this.c.addLast(e);
        final i e2 = this.E(true, this.c);
        this.b.getLast().b(e, e2);
        this.b.addLast(e2);
    }
    
    @Override
    public void g(final String s) {
        this.G().b(s, new h());
    }
    
    @Override
    public Object get() {
        return this.a;
    }
    
    @Override
    public void h(final String s, final long date) {
        this.C(s, new Date(date));
    }
    
    @Override
    public void i(final String s) {
        this.G().b(s, new g());
    }
    
    @Override
    public void j(final String s, final String s2, final Object o) {
        this.C(s, new e(s2, (i)o));
    }
    
    @Override
    public void k(final String s, final ObjectId objectId) {
        this.C(s, objectId);
    }
    
    @Override
    public void l(final String e) {
        this.c.addLast(e);
        final i e2 = this.E(false, this.c);
        this.b.getLast().b(e, e2);
        this.b.addLast(e2);
    }
    
    @Override
    public void m(final String s, final String s2) {
        this.C(s, s2);
    }
    
    @Override
    public void n(final String s) {
    }
    
    @Override
    public void o(final String s, final int i) {
        this.C(s, i);
    }
    
    @Override
    public void p(final String s, final String s2) {
        this.C(s, new org.bson.types.d(s2));
    }
    
    @Override
    public Object q() {
        i i = this.b.removeLast();
        if (this.c.size() > 0) {
            this.c.removeLast();
        }
        else if (this.b.size() > 0) {
            throw new IllegalStateException("Illegal object end in current context.");
        }
        if (org.bson.c.l()) {
            i = (i)org.bson.c.c(i);
        }
        return i;
    }
    
    @Override
    public Object r() {
        return this.q();
    }
    
    @Override
    public void reset() {
        this.a = null;
        this.b.clear();
        this.c.clear();
    }
    
    @Deprecated
    @Override
    public void s(final String s, final byte[] array) {
        this.v(s, (byte)0, array);
    }
    
    @Override
    public void t(final String s, final Decimal128 decimal128) {
        this.C(s, decimal128);
    }
    
    @Override
    public void u(final String s, final double d) {
        this.C(s, d);
    }
    
    @Override
    public void v(final String s, final byte b, final byte[] array) {
        if (b != 0 && b != 2) {
            this.C(s, new org.bson.types.c(b, array));
        }
        else {
            this.C(s, array);
        }
    }
    
    @Override
    public void w(final String s, final String regex, final String s2) {
        this.C(s, Pattern.compile(regex, org.bson.c.o(s2)));
    }
    
    @Override
    public void x(final String s, final boolean b) {
        this.C(s, b);
    }
    
    @Override
    public void y(final String s, final long mostSigBits, final long leastSigBits) {
        this.C(s, new UUID(mostSigBits, leastSigBits));
    }
    
    @Override
    public void z(final String s, final String s2) {
        this.C(s, s2);
    }
}
