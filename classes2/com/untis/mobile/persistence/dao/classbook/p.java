// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.dao.classbook;

import com.untis.mobile.utils.j0;
import io.realm.q;
import kotlin.jvm.internal.m0;
import n6.l;
import com.untis.mobile.utils.extension.h;
import java.util.List;
import org.jetbrains.annotations.f;
import java.util.Iterator;
import io.realm.s0;
import io.realm.f0;
import java.io.Closeable;
import kotlin.io.c;
import kotlin.j2;
import com.untis.mobile.utils.mapper.realmToModel.w;
import java.util.ArrayList;
import kotlin.collections.v;
import n4.a;
import java.util.HashMap;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.classbook.info.PeriodInfo;
import android.util.LongSparseArray;
import java.util.Map;
import org.jetbrains.annotations.e;
import com.untis.mobile.persistence.realm.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0005H\u0016J\u0018\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016R\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R(\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0014¨\u0006\u0018" }, d2 = { "Lcom/untis/mobile/persistence/dao/classbook/p;", "Lcom/untis/mobile/persistence/dao/classbook/o;", "", "profileId", "Landroid/util/LongSparseArray;", "Lcom/untis/mobile/persistence/models/classbook/info/PeriodInfo;", "e", "", "b", "", "id", "a", "periodInfo", "Lkotlin/j2;", "c", "d", "Lcom/untis/mobile/persistence/realm/d;", "Lcom/untis/mobile/persistence/realm/d;", "realmService", "", "Ljava/util/Map;", "cache", "<init>", "(Lcom/untis/mobile/persistence/realm/d;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class p implements o
{
    @e
    private final d a;
    @e
    private final Map<String, LongSparseArray<PeriodInfo>> b;
    
    public p(@e final d a) {
        k0.p(a, "realmService");
        this.a = a;
        this.b = new HashMap<String, LongSparseArray<PeriodInfo>>();
    }
    
    private final LongSparseArray<PeriodInfo> e(final String s) {
        final LongSparseArray<PeriodInfo> value;
        if ((value = this.b.get(s)) == null) {
            final LongSparseArray longSparseArray = new LongSparseArray();
            final f0 c = this.a.c(s);
            try {
                final s0<a> b0 = c.f3(a.class).b0();
                k0.o(b0, "realm.where(RealmPeriodInfo::class.java)\n                                .findAll()");
                final ArrayList list = new ArrayList<Object>(v.Y((Iterable<?>)b0, 10));
                for (final a a : b0) {
                    final w a2 = w.a;
                    k0.o(a, "it");
                    list.add(a2.b(a));
                }
                for (final PeriodInfo periodInfo : list) {
                    longSparseArray.put(periodInfo.getId(), (Object)periodInfo);
                }
                final j2 a3 = j2.a;
                kotlin.io.c.a(c, null);
                this.b.put(s, (LongSparseArray<PeriodInfo>)longSparseArray);
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
    
    @f
    @Override
    public PeriodInfo a(@e final String s, final long n) {
        k0.p(s, "profileId");
        return (PeriodInfo)this.e(s).get(n);
    }
    
    @e
    @Override
    public List<PeriodInfo> b(@e final String s) {
        k0.p(s, "profileId");
        return h.K(this.e(s));
    }
    
    @Override
    public void c(@e final String s, @e final PeriodInfo periodInfo) {
        k0.p(s, "profileId");
        k0.p(periodInfo, "periodInfo");
        j0.b(this.a.c(s), new l<f0, j2>() {
            public final void a(@e final f0 f0) {
                k0.p(f0, "realm");
                f0.G0(w.a.c(periodInfo), new q[0]);
            }
        });
        this.e(s).put(periodInfo.getId(), (Object)periodInfo);
    }
    
    @Override
    public void d(@e final String s, final long n) {
        k0.p(s, "profileId");
        j0.b(this.a.c(s), new l<f0, j2>() {
            public final void a(@e final f0 f0) {
                k0.p(f0, "realm");
                f0.f3(a.class).I("id", n).b0().T3();
            }
        });
        this.e(s).delete(n);
    }
}
