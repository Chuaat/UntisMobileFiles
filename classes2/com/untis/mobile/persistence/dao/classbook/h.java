// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.dao.classbook;

import com.untis.mobile.utils.j0;
import io.realm.n0;
import io.realm.q;
import kotlin.jvm.internal.m0;
import n6.l;
import com.untis.mobile.api.common.masterdata.UMExcuseStatus;
import java.util.List;
import org.jetbrains.annotations.f;
import java.util.Iterator;
import io.realm.s0;
import io.realm.f0;
import java.io.Closeable;
import kotlin.io.c;
import kotlin.j2;
import com.untis.mobile.utils.mapper.realmToModel.m;
import java.util.ArrayList;
import kotlin.collections.v;
import java.util.HashMap;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.classbook.absence.ExcuseStatus;
import android.util.LongSparseArray;
import java.util.Map;
import org.jetbrains.annotations.e;
import com.untis.mobile.persistence.realm.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\nH\u0016J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0013\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012R(\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015¨\u0006\u0019" }, d2 = { "Lcom/untis/mobile/persistence/dao/classbook/h;", "Lcom/untis/mobile/persistence/dao/classbook/g;", "", "profileId", "Landroid/util/LongSparseArray;", "Lcom/untis/mobile/persistence/models/classbook/absence/ExcuseStatus;", "e", "", "id", "a", "", "b", "Lcom/untis/mobile/api/common/masterdata/UMExcuseStatus;", "umExcuseStates", "Lkotlin/j2;", "c", "d", "Lcom/untis/mobile/persistence/realm/d;", "Lcom/untis/mobile/persistence/realm/d;", "realmService", "", "Ljava/util/Map;", "cache", "<init>", "(Lcom/untis/mobile/persistence/realm/d;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class h implements g
{
    @e
    private final d a;
    @e
    private final Map<String, LongSparseArray<ExcuseStatus>> b;
    
    public h(@e final d a) {
        k0.p(a, "realmService");
        this.a = a;
        this.b = new HashMap<String, LongSparseArray<ExcuseStatus>>();
    }
    
    private final LongSparseArray<ExcuseStatus> e(final String s) {
        final LongSparseArray<ExcuseStatus> value;
        if ((value = this.b.get(s)) == null) {
            final LongSparseArray longSparseArray = new LongSparseArray();
            final f0 c = this.a.c(s);
            try {
                final s0<j4.d> b0 = c.f3(j4.d.class).b0();
                k0.o(b0, "realm.where(RealmExcuseStatus::class.java)\n                                .findAll()");
                final ArrayList list = new ArrayList<Object>(v.Y((Iterable<?>)b0, 10));
                for (final j4.d d : b0) {
                    final m a = m.a;
                    k0.o(d, "it");
                    list.add(a.b(d));
                }
                for (final ExcuseStatus excuseStatus : list) {
                    longSparseArray.put(excuseStatus.getId(), (Object)excuseStatus);
                }
                final j2 a2 = j2.a;
                kotlin.io.c.a(c, null);
                this.b.put(s, (LongSparseArray<ExcuseStatus>)longSparseArray);
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
    public ExcuseStatus a(@e final String s, final long n) {
        k0.p(s, "profileId");
        return (ExcuseStatus)this.e(s).get(n);
    }
    
    @e
    @Override
    public List<ExcuseStatus> b(@e final String s) {
        k0.p(s, "profileId");
        return com.untis.mobile.utils.extension.h.K(this.e(s));
    }
    
    @Override
    public void c(@e final String s, @e final List<? extends UMExcuseStatus> list) {
        k0.p(s, "profileId");
        k0.p(list, "umExcuseStates");
        j0.b(this.a.c(s), new l<f0, j2>() {
            public final void a(@e final f0 f0) {
                k0.p(f0, "realm");
                final List<UMExcuseStatus> g = (List<UMExcuseStatus>)list;
                final ArrayList<j4.d> list = new ArrayList<j4.d>();
                final Iterator<Object> iterator = g.iterator();
                while (iterator.hasNext()) {
                    final j4.d c = m.a.c(iterator.next());
                    if (c != null) {
                        list.add(c);
                    }
                }
                f0.H0((Iterable<n0>)list, new q[0]);
            }
        });
        this.b.remove(s);
    }
    
    @Override
    public void d(@e final String s) {
        k0.p(s, "profileId");
        j0.b(this.a.c(s), h$a.G);
        this.b.remove(s);
    }
}
