// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.dao.classbook;

import com.untis.mobile.utils.j0;
import io.realm.q;
import kotlin.jvm.internal.m0;
import io.realm.f0;
import n6.l;
import java.io.Closeable;
import kotlin.j2;
import z4.b;
import kotlin.jvm.internal.w;
import org.joda.time.v;
import com.untis.mobile.persistence.models.profile.AbsenceEndTime;
import com.untis.mobile.persistence.models.classbook.absence.AbsenceReason;
import java.util.HashMap;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.profile.ClassbookSettings;
import java.util.Map;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0016R\"\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000e¨\u0006\u0012" }, d2 = { "Lcom/untis/mobile/persistence/dao/classbook/d;", "Lcom/untis/mobile/persistence/dao/classbook/c;", "", "profileId", "Lcom/untis/mobile/persistence/models/profile/ClassbookSettings;", "c", "b", "classbookSettings", "Lkotlin/j2;", "a", "", "Ljava/util/Map;", "cache", "Lcom/untis/mobile/persistence/realm/d;", "Lcom/untis/mobile/persistence/realm/d;", "realmService", "<init>", "(Lcom/untis/mobile/persistence/realm/d;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class d implements c
{
    @e
    private final com.untis.mobile.persistence.realm.d a;
    @e
    private final Map<String, ClassbookSettings> b;
    
    public d(@e final com.untis.mobile.persistence.realm.d a) {
        k0.p(a, "realmService");
        this.a = a;
        this.b = new HashMap<String, ClassbookSettings>();
    }
    
    private final ClassbookSettings c(final String s) {
        final ClassbookSettings value;
        if ((value = this.b.get(s)) == null) {
            ClassbookSettings a = new ClassbookSettings(false, false, false, null, null, null, null, 127, null);
            Object o = this.a.c(s);
            try {
                final b b = ((f0)o).f3(b.class).d0();
                if (b != null) {
                    a = new com.untis.mobile.utils.mapper.realmToModel.e(s).a(b);
                }
                final j2 a2 = j2.a;
                kotlin.io.c.a((Closeable)o, null);
                o = this.b;
                k0.m(a);
                ((Map<String, ClassbookSettings>)o).put(s, a);
            }
            finally {
                try {}
                finally {
                    kotlin.io.c.a((Closeable)o, (Throwable)s);
                }
            }
        }
        return value;
    }
    
    @Override
    public void a(@e final String s, @e final ClassbookSettings classbookSettings) {
        k0.p(s, "profileId");
        k0.p(classbookSettings, "classbookSettings");
        j0.b(this.a.c(s), new l<f0, j2>() {
            public final void a(@e final f0 f0) {
                k0.p(f0, "realm");
                f0.G0(new com.untis.mobile.utils.mapper.realmToModel.e(s).b(classbookSettings), new q[0]);
            }
        });
        this.b.clear();
    }
    
    @e
    @Override
    public ClassbookSettings b(@e final String s) {
        k0.p(s, "profileId");
        return this.c(s);
    }
}
