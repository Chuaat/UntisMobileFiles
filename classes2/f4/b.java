// 
// Decompiled by Procyon v0.5.36
// 

package f4;

import kotlin.j2;
import io.realm.q;
import io.realm.n0;
import java.util.ArrayList;
import kotlin.collections.v;
import java.util.List;
import org.jetbrains.annotations.f;
import com.untis.mobile.persistence.models.SchoolColorType;
import java.util.Iterator;
import io.realm.s0;
import io.realm.f0;
import java.io.Closeable;
import com.untis.mobile.utils.mapper.realmToModel.d0;
import com.untis.mobile.persistence.realm.c;
import java.util.HashSet;
import java.util.HashMap;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.SchoolColor;
import java.util.Set;
import java.util.Map;
import org.jetbrains.annotations.e;
import com.untis.mobile.persistence.realm.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\u0016J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0014" }, d2 = { "Lf4/b;", "Lf4/a;", "", "profileId", "", "Lcom/untis/mobile/persistence/models/SchoolColor;", "e", "Lcom/untis/mobile/persistence/models/SchoolColorType;", "schoolColorType", "a", "", "b", "schoolColors", "Lkotlin/j2;", "c", "d", "Lcom/untis/mobile/persistence/realm/d;", "realmService", "<init>", "(Lcom/untis/mobile/persistence/realm/d;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class b implements a
{
    @e
    private final d a;
    @e
    private final Map<String, Set<SchoolColor>> b;
    
    public b(@e final d a) {
        k0.p(a, "realmService");
        this.a = a;
        this.b = new HashMap<String, Set<SchoolColor>>();
    }
    
    private final Set<SchoolColor> e(final String s) {
        final Set<SchoolColor> value;
        if ((value = this.b.get(s)) == null) {
            final HashSet<SchoolColor> set = new HashSet<SchoolColor>();
            final f0 c = this.a.c(s);
            try {
                final s0<c> b0 = c.f3(c.class).b0();
                k0.o(b0, "realm.where(RealmSchoolColor::class.java)\n                                .findAll()");
                for (final c c2 : b0) {
                    final d0 a = d0.a;
                    k0.o(c2, "it");
                    final SchoolColor c3 = a.c(c2);
                    if (c3 != null) {
                        set.add(c3);
                    }
                }
                kotlin.io.c.a(c, null);
                this.b.put(s, set);
            }
            finally {
                try {}
                finally {
                    kotlin.io.c.a(c, (Throwable)value);
                }
            }
        }
        return value;
    }
    
    @f
    @Override
    public SchoolColor a(@e final String s, @e final SchoolColorType schoolColorType) {
        k0.p(s, "profileId");
        k0.p(schoolColorType, "schoolColorType");
        for (final SchoolColor next : this.e(s)) {
            if (next.getType() == schoolColorType) {
                return next;
            }
        }
        return null;
    }
    
    @e
    @Override
    public List<SchoolColor> b(@e final String s) {
        k0.p(s, "profileId");
        return v.I5((Iterable<? extends SchoolColor>)this.e(s));
    }
    
    @Override
    public void c(@e String c, @e final List<SchoolColor> iterable) {
        k0.p(c, "profileId");
        k0.p(iterable, "schoolColors");
        c = (String)this.a.c(c);
        try {
            ((f0)c).beginTransaction();
            final ArrayList<n0> list = new ArrayList<n0>();
            final Iterator<SchoolColor> iterator = iterable.iterator();
            while (iterator.hasNext()) {
                final c a = d0.a.a(iterator.next());
                if (a != null) {
                    list.add(a);
                }
            }
            ((f0)c).H0(list, new q[0]);
            ((f0)c).n();
            final j2 a2 = j2.a;
            kotlin.io.c.a((Closeable)c, null);
            this.b.clear();
        }
        finally {
            try {}
            finally {
                kotlin.io.c.a((Closeable)c, (Throwable)iterable);
            }
        }
    }
    
    @Override
    public void d(@e String c) {
        k0.p(c, "profileId");
        c = (String)this.a.c(c);
        try {
            ((f0)c).beginTransaction();
            ((f0)c).f3(c.class).b0().T3();
            ((f0)c).n();
            final j2 a = j2.a;
            kotlin.io.c.a((Closeable)c, null);
            this.b.clear();
        }
        finally {
            try {}
            finally {
                final Throwable t;
                kotlin.io.c.a((Closeable)c, t);
            }
        }
    }
}
