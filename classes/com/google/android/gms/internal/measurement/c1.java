// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Iterator;
import java.util.Collections;
import java.util.concurrent.Callable;

public final class c1
{
    final f4 a;
    g5 b;
    final c c;
    private final og d;
    
    public c1() {
        final f4 a = new f4();
        this.a = a;
        this.b = a.b.a();
        this.c = new c();
        this.d = new og();
        a.d.a("internal.registerCallback", new a(this));
        a.d.a("internal.eventLogger", new b0(this));
    }
    
    public final c a() {
        return this.c;
    }
    
    public final void c(final v5 v5) throws d2 {
        try {
            this.b = this.a.b.a();
            if (!(this.a.a(this.b, (a6[])v5.x().toArray(new a6[0])) instanceof h)) {
                for (final t5 t5 : v5.v().z()) {
                    final List<a6> x = t5.x();
                    final String w = t5.w();
                    final Iterator<a6> iterator2 = x.iterator();
                    while (iterator2.hasNext()) {
                        final q a = this.a.a(this.b, iterator2.next());
                        if (!(a instanceof n)) {
                            throw new IllegalArgumentException("Invalid rule definition");
                        }
                        final g5 b = this.b;
                        j j;
                        if (!b.h(w)) {
                            j = null;
                        }
                        else {
                            final q d = b.d(w);
                            if (!(d instanceof j)) {
                                final String value = String.valueOf(w);
                                String concat;
                                if (value.length() != 0) {
                                    concat = "Invalid function name: ".concat(value);
                                }
                                else {
                                    concat = new String("Invalid function name: ");
                                }
                                throw new IllegalStateException(concat);
                            }
                            j = (j)d;
                        }
                        if (j == null) {
                            final String value2 = String.valueOf(w);
                            String concat2;
                            if (value2.length() != 0) {
                                concat2 = "Rule function is undefined: ".concat(value2);
                            }
                            else {
                                concat2 = new String("Rule function is undefined: ");
                            }
                            throw new IllegalStateException(concat2);
                        }
                        j.a(this.b, Collections.singletonList(a));
                    }
                }
                return;
            }
            throw new IllegalStateException("Program loading failed");
        }
        finally {
            final Throwable t6;
            throw new d2(t6);
        }
    }
    
    public final void d(final String s, final Callable<? extends j> callable) {
        this.a.d.a(s, callable);
    }
    
    public final boolean e(final b b) throws d2 {
        try {
            this.c.d(b);
            this.a.c.g("runtime.counter", new i(0.0));
            this.d.b(this.b.a(), this.c);
            return this.g() || this.f();
        }
        finally {
            final Throwable t;
            throw new d2(t);
        }
    }
    
    public final boolean f() {
        return !this.c.c().isEmpty();
    }
    
    public final boolean g() {
        return !this.c.b().equals(this.c.a());
    }
}
