// 
// Decompiled by Procyon v0.5.36
// 

package g4;

import org.joda.time.n0;
import com.untis.mobile.utils.extension.h;
import java.util.List;
import org.joda.time.t;
import java.util.Iterator;
import io.realm.s0;
import io.realm.f0;
import java.io.Closeable;
import kotlin.j2;
import com.untis.mobile.utils.mapper.apiToModel.c;
import java.util.ArrayList;
import kotlin.collections.v;
import java.util.HashMap;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.officehour.OfficeHour;
import android.util.LongSparseArray;
import java.util.Map;
import org.jetbrains.annotations.e;
import com.untis.mobile.persistence.realm.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\u000f" }, d2 = { "Lg4/b;", "Lg4/a;", "", "profileId", "Landroid/util/LongSparseArray;", "Lcom/untis/mobile/persistence/models/officehour/OfficeHour;", "b", "Lorg/joda/time/t;", "date", "", "a", "Lcom/untis/mobile/persistence/realm/d;", "realmService", "<init>", "(Lcom/untis/mobile/persistence/realm/d;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class b implements a
{
    @e
    private final d a;
    @e
    private final Map<String, LongSparseArray<OfficeHour>> b;
    
    public b(@e final d a) {
        k0.p(a, "realmService");
        this.a = a;
        this.b = new HashMap<String, LongSparseArray<OfficeHour>>();
    }
    
    private final LongSparseArray<OfficeHour> b(final String s) {
        final LongSparseArray<OfficeHour> value;
        if ((value = this.b.get(s)) == null) {
            final LongSparseArray longSparseArray = new LongSparseArray();
            final f0 c = this.a.c(s);
            try {
                final s0<y4.a> b0 = c.f3(y4.a.class).b0();
                k0.o(b0, "realm.where(RealmOfficeHour::class.java)\n                                .findAll()");
                final ArrayList list = new ArrayList<Object>(v.Y((Iterable<?>)b0, 10));
                for (final y4.a a : b0) {
                    final c.a b2 = com.untis.mobile.utils.mapper.apiToModel.c.b;
                    k0.o(a, "it");
                    list.add(b2.a(a));
                }
                for (final OfficeHour officeHour : list) {
                    longSparseArray.put(officeHour.getId(), (Object)officeHour);
                }
                final j2 a2 = j2.a;
                kotlin.io.c.a(c, null);
                this.b.put(s, (LongSparseArray<OfficeHour>)longSparseArray);
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
    
    @e
    @Override
    public List<OfficeHour> a(@e final String s, @e final t t) {
        k0.p(s, "profileId");
        k0.p(t, "date");
        final List<OfficeHour> k = h.K(this.b(s));
        final ArrayList<OfficeHour> list = new ArrayList<OfficeHour>();
        for (final OfficeHour next : k) {
            final OfficeHour officeHour = next;
            final t h1 = officeHour.getStart().h1();
            final t h2 = officeHour.getEnd().h1();
            final boolean p2 = ((org.joda.time.base.e)t).p((n0)h1);
            boolean b = true;
            if (!p2) {
                if (!((org.joda.time.base.e)t).p((n0)h2)) {
                    if (!((org.joda.time.base.e)t).m((n0)h1) || !((org.joda.time.base.e)t).o((n0)h2)) {
                        b = false;
                    }
                }
            }
            if (b) {
                list.add(next);
            }
        }
        return list;
    }
}
