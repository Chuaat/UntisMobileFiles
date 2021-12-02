// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.dao.classbook;

import io.realm.q;
import com.untis.mobile.utils.j0;
import kotlin.jvm.internal.m0;
import n6.l;
import com.untis.mobile.utils.extension.h;
import java.util.List;
import java.util.Iterator;
import io.realm.s0;
import java.io.Closeable;
import kotlin.io.c;
import kotlin.j2;
import java.util.ArrayList;
import kotlin.collections.v;
import com.untis.mobile.utils.mapper.realmToModel.j;
import l4.a;
import io.realm.f0;
import java.util.HashMap;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.classbook.classregevent.Event;
import android.util.LongSparseArray;
import java.util.Map;
import com.untis.mobile.persistence.realm.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u001a\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\tH\u0016J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0018\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0005H\u0016R(\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0017¨\u0006\u001b" }, d2 = { "Lcom/untis/mobile/persistence/dao/classbook/f;", "Lcom/untis/mobile/persistence/dao/classbook/e;", "", "profileId", "Landroid/util/LongSparseArray;", "Lcom/untis/mobile/persistence/models/classbook/classregevent/Event;", "g", "Lio/realm/f0;", "realm", "", "f", "id", "a", "", "b", "event", "Lkotlin/j2;", "d", "c", "", "Ljava/util/Map;", "cache", "Lcom/untis/mobile/persistence/realm/d;", "Lcom/untis/mobile/persistence/realm/d;", "realmService", "<init>", "(Lcom/untis/mobile/persistence/realm/d;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class f implements e
{
    @org.jetbrains.annotations.e
    private final d a;
    @org.jetbrains.annotations.e
    private final Map<String, LongSparseArray<Event>> b;
    
    public f(@org.jetbrains.annotations.e final d a) {
        k0.p(a, "realmService");
        this.a = a;
        this.b = new HashMap<String, LongSparseArray<Event>>();
    }
    
    private final long f(final f0 f0) {
        final Number j1 = f0.f3(a.class).j1("id");
        long longValue;
        if (j1 == null) {
            longValue = 0L;
        }
        else {
            longValue = j1.longValue();
        }
        long n = longValue - 1L;
        if (n >= 0L) {
            n = -1L;
        }
        return n;
    }
    
    private final LongSparseArray<Event> g(final String s) {
        final LongSparseArray<Event> value;
        if ((value = this.b.get(s)) == null) {
            final LongSparseArray longSparseArray = new LongSparseArray();
            final j j = new j(s);
            final f0 c = this.a.c(s);
            try {
                final s0<a> b0 = c.f3(a.class).b0();
                k0.o(b0, "realm.where(RealmEvent::class.java)\n                                .findAll()");
                final ArrayList list = new ArrayList<Object>(v.Y((Iterable<?>)b0, 10));
                for (final a a : b0) {
                    k0.o(a, "it");
                    list.add(j.b(a));
                }
                for (final Event event : list) {
                    longSparseArray.put(event.getId(), (Object)event);
                }
                final j2 a2 = j2.a;
                kotlin.io.c.a(c, null);
                this.b.put(s, (LongSparseArray<Event>)longSparseArray);
            }
            finally {
                try {}
                finally {
                    kotlin.io.c.a(c, (Throwable)s);
                }
            }
        }
        return value;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Event a(@org.jetbrains.annotations.e final String s, final long n) {
        k0.p(s, "profileId");
        return (Event)this.g(s).get(n);
    }
    
    @org.jetbrains.annotations.e
    @Override
    public List<Event> b(@org.jetbrains.annotations.e final String s) {
        k0.p(s, "profileId");
        return h.K(this.g(s));
    }
    
    @Override
    public void c(@org.jetbrains.annotations.e final String s, @org.jetbrains.annotations.e final Event event) {
        k0.p(s, "profileId");
        k0.p(event, "event");
        j0.b(this.a.c(s), new l<f0, j2>() {
            public final void a(@org.jetbrains.annotations.e final f0 f0) {
                k0.p(f0, "realm");
                f0.f3(a.class).I("id", event.getId()).b0().T3();
            }
        });
        this.g(s).delete(event.getId());
    }
    
    @Override
    public void d(@org.jetbrains.annotations.e final String s, @org.jetbrains.annotations.e final Event event) {
        k0.p(s, "profileId");
        k0.p(event, "event");
        j0.b(this.a.c(s), new l<f0, j2>() {
            public final void a(@org.jetbrains.annotations.e final f0 f0) {
                k0.p(f0, "realm");
                if (event.getId() == 0L) {
                    event.setId(f.this.f(f0));
                }
                f0.G0(new j(s).c(event), new q[0]);
            }
        });
        this.g(s).put(event.getId(), (Object)event);
    }
}
