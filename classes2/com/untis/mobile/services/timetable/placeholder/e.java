// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.services.timetable.placeholder;

import org.joda.time.base.d;
import java.util.Collection;
import kotlin.collections.v;
import java.util.Iterator;
import org.joda.time.m0;
import org.joda.time.l0;
import org.joda.time.r;
import java.util.ArrayList;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.timetable.period.Period;
import org.joda.time.c;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b#\u0010$J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002J\u001e\u0010\f\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rJ\u0016\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rR\"\u0010\n\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u001a\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\u001f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001f\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u001b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b!\u0010\u001e¨\u0006%" }, d2 = { "Lcom/untis/mobile/services/timetable/placeholder/e;", "", "Lcom/untis/mobile/persistence/models/timetable/period/Period;", "period", "Lkotlin/j2;", "a", "", "c", "", "b", "start", "total", "d", "Lorg/joda/time/r;", "interval", "j", "columnIndex", "e", "Lorg/joda/time/c;", "Lorg/joda/time/c;", "i", "()Lorg/joda/time/c;", "l", "(Lorg/joda/time/c;)V", "g", "k", "end", "", "Ljava/util/List;", "h", "()Ljava/util/List;", "periods", "Lcom/untis/mobile/services/timetable/placeholder/a;", "f", "columns", "<init>", "(Lcom/untis/mobile/persistence/models/timetable/period/Period;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
final class e
{
    @org.jetbrains.annotations.e
    private final List<a> a;
    @org.jetbrains.annotations.e
    private c b;
    @org.jetbrains.annotations.e
    private c c;
    @org.jetbrains.annotations.e
    private final List<Period> d;
    
    public e(@org.jetbrains.annotations.e final Period period) {
        k0.p(period, "period");
        final ArrayList<a> a = new ArrayList<a>();
        this.a = a;
        this.b = period.getStart();
        this.c = period.getEnd();
        final ArrayList<Period> d = new ArrayList<Period>();
        this.d = d;
        a.add(new a(period));
        d.add(period);
    }
    
    public final void a(@org.jetbrains.annotations.e final Period period) {
        k0.p(period, "period");
        final r r = new r((l0)period.getStart(), (l0)period.getEnd());
        if (((org.joda.time.base.c)period.getStart()).C((l0)this.b)) {
            this.b = period.getStart();
        }
        if (((org.joda.time.base.c)period.getEnd()).R((l0)this.c)) {
            this.c = period.getEnd();
        }
        this.d.add(period);
    Label_0087:
        for (final a a : this.a) {
            for (final g g : a.b()) {
                if (((org.joda.time.base.c)g.e()).X4((l0)period.getStart()) && ((org.joda.time.base.c)g.c()).X4((l0)period.getEnd())) {
                    g.b(period);
                    return;
                }
                if (((d)r).F((m0)new r((l0)g.e(), (l0)g.c()))) {
                    continue Label_0087;
                }
            }
            a.a(period);
            return;
        }
        this.a.add(new a(period));
    }
    
    public final float b(@org.jetbrains.annotations.e final Period period) {
        k0.p(period, "period");
        final r r = new r((l0)period.getStart(), (l0)period.getEnd());
        final Iterator<a> iterator = (Iterator<a>)this.a.iterator();
        float n = 0.0f;
    Label_0035:
        while (iterator.hasNext()) {
            final a a = iterator.next();
            final List<g> b = a.b();
            final ArrayList list = new ArrayList<Iterable<? extends T>>(v.Y((Iterable<?>)b, 10));
            final Iterator<Object> iterator2 = b.iterator();
            while (iterator2.hasNext()) {
                list.add(iterator2.next().d());
            }
            final List<Object> c0 = v.c0((Iterable<? extends Iterable<?>>)list);
            final boolean b2 = c0 instanceof Collection;
            final boolean b3 = false;
            int n2 = 0;
            Label_0222: {
                if (b2 && c0.isEmpty()) {
                    n2 = (b3 ? 1 : 0);
                }
                else {
                    final Iterator<Period> iterator3 = c0.iterator();
                    Period period2;
                    do {
                        n2 = (b3 ? 1 : 0);
                        if (!iterator3.hasNext()) {
                            break Label_0222;
                        }
                        period2 = iterator3.next();
                    } while (!((d)r).F((m0)new r((l0)period2.getStart(), (l0)period2.getEnd())));
                    n2 = 1;
                }
            }
            if (n2 != 0) {
                if (c0.contains(period)) {
                    final Iterator<Period> iterator4 = c0.iterator();
                    float n3 = n;
                    while (true) {
                        n = n3;
                        if (!iterator4.hasNext()) {
                            continue Label_0035;
                        }
                        final Period period3 = iterator4.next();
                        if (period3.getId() == period.getId()) {
                            break;
                        }
                        if (!((d)r).F((m0)new r((l0)period3.getStart(), (l0)period3.getEnd()))) {
                            continue;
                        }
                        ++n3;
                    }
                    return n3;
                }
                n += a.c(r);
            }
        }
        return n;
    }
    
    public final int c() {
        final List<Period> d = this.d;
        final ArrayList list = new ArrayList<Number>(v.Y((Iterable<?>)d, 10));
        for (final Period period : d) {
            list.add(Integer.valueOf(this.j(new r((l0)period.getStart(), (l0)period.getEnd()))));
        }
        final Iterator<Number> iterator2 = list.iterator();
        int n = 0;
        while (iterator2.hasNext()) {
            final int intValue = iterator2.next().intValue();
            if (intValue > n) {
                n = intValue;
            }
        }
        return n;
    }
    
    public final float d(final float n, final int n2, @org.jetbrains.annotations.e final Period period) {
        k0.p(period, "period");
        final r r = new r((l0)period.getStart(), (l0)period.getEnd());
        float n3 = (float)n2;
        final List<a> a = this.a;
        final ArrayList list = new ArrayList<Iterable<? extends T>>(v.Y((Iterable<?>)a, 10));
        final Iterator<Object> iterator = a.iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next().b());
        }
        final List<Object> c0 = v.c0((Iterable<? extends Iterable<?>>)list);
        final ArrayList list2 = new ArrayList<Iterable<? extends T>>(v.Y((Iterable<?>)c0, 10));
        final Iterator<g> iterator2 = c0.iterator();
        while (iterator2.hasNext()) {
            list2.add(iterator2.next().d());
        }
        final List<Object> c2 = v.c0((Iterable<? extends Iterable<?>>)list2);
        final ArrayList<Period> list3 = new ArrayList<Period>();
        for (final Period next : c2) {
            final Period period2 = next;
            if (((d)r).F((m0)new r((l0)period2.getStart(), (l0)period2.getEnd()))) {
                list3.add(next);
            }
        }
        for (final Period period3 : v.K4((Iterable<?>)list3)) {
            if (period3.getId() == period.getId()) {
                return n3 - n;
            }
            final float b = this.b(period3);
            if (b >= n3 || b <= n) {
                continue;
            }
            n3 = b;
        }
        return n3 - n;
    }
    
    public final int e(final int n, @org.jetbrains.annotations.e final r r) {
        k0.p(r, "interval");
        final List<a> a = this.a;
        final ArrayList<a> list = new ArrayList<a>();
        final Iterator<Object> iterator = a.iterator();
        int n2 = 0;
        while (iterator.hasNext()) {
            final a next = iterator.next();
            if (n2 < 0) {
                v.W();
            }
            final a a2 = next;
            final int n3 = 1;
            int n4 = 0;
            Label_0241: {
                if (n2 > n) {
                    final List<g> b = a2.b();
                    final ArrayList list2 = new ArrayList<Iterable<? extends T>>(v.Y((Iterable<?>)b, 10));
                    final Iterator<Object> iterator2 = b.iterator();
                    while (iterator2.hasNext()) {
                        list2.add(iterator2.next().d());
                    }
                    final List<Object> c0 = v.c0((Iterable<? extends Iterable<?>>)list2);
                    boolean b2 = false;
                    Label_0226: {
                        if (!(c0 instanceof Collection) || !c0.isEmpty()) {
                            for (final Period period : c0) {
                                if (((d)r).F((m0)new r((l0)period.getStart(), (l0)period.getEnd()))) {
                                    b2 = true;
                                    break Label_0226;
                                }
                            }
                        }
                        b2 = false;
                    }
                    if (!b2) {
                        n4 = n3;
                        break Label_0241;
                    }
                }
                n4 = 0;
            }
            if (n4 != 0) {
                list.add(next);
            }
            ++n2;
        }
        return list.size();
    }
    
    @org.jetbrains.annotations.e
    public final List<a> f() {
        return this.a;
    }
    
    @org.jetbrains.annotations.e
    public final c g() {
        return this.c;
    }
    
    @org.jetbrains.annotations.e
    public final List<Period> h() {
        return this.d;
    }
    
    @org.jetbrains.annotations.e
    public final c i() {
        return this.b;
    }
    
    public final int j(@org.jetbrains.annotations.e final r r) {
        k0.p(r, "interval");
        final Iterator<a> iterator = this.a.iterator();
        int n = 0;
        int n2 = 0;
        while (iterator.hasNext()) {
            final a next = iterator.next();
            if (n2 < 0) {
                v.W();
            }
            final Iterator<Object> iterator2 = next.b().iterator();
            int n3 = 0;
            while (iterator2.hasNext()) {
                final g g = iterator2.next();
                final r r2 = new r((l0)g.e(), (l0)g.c());
                if (((d)r).F((m0)r2)) {
                    final int n4 = g.d().size() - this.e(n2, r2);
                    if (n4 <= n3) {
                        continue;
                    }
                    n3 = n4;
                }
            }
            n += n3;
            ++n2;
        }
        return n;
    }
    
    public final void k(@org.jetbrains.annotations.e final c c) {
        k0.p(c, "<set-?>");
        this.c = c;
    }
    
    public final void l(@org.jetbrains.annotations.e final c b) {
        k0.p(b, "<set-?>");
        this.b = b;
    }
}
