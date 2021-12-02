// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.adapters.timetableselection;

import kotlinx.coroutines.u0;
import kotlin.coroutines.g;
import com.untis.mobile.persistence.models.timetable.TimeTableEntity;
import com.untis.mobile.utils.time.a;
import kotlin.c1;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.j2;
import kotlin.coroutines.d;
import kotlinx.coroutines.r0;
import n6.p;
import kotlinx.coroutines.b2;
import kotlin.jvm.internal.k0;
import kotlinx.coroutines.k2;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.services.timetable.placeholder.k;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\f" }, d2 = { "Lcom/untis/mobile/ui/adapters/timetableselection/h;", "", "Lcom/untis/mobile/services/timetable/placeholder/k;", "timeTableService", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "", "entityId", "Lkotlinx/coroutines/k2;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class h
{
    @e
    public static final h a;
    
    static {
        a = new h();
    }
    
    private h() {
    }
    
    @e
    public final k2 a(@e final k k, @e final EntityType entityType, final long n) {
        k0.p(k, "timeTableService");
        k0.p(entityType, "entityType");
        return kotlinx.coroutines.h.f((r0)b2.G, (g)null, (u0)null, (p)new p<r0, d<? super j2>, Object>(null) {
            int G;
            final /* synthetic */ k H;
            final /* synthetic */ EntityType I;
            final /* synthetic */ long J;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>(d) {
                    int G;
                    final /* synthetic */ k H = this.H;
                    final /* synthetic */ EntityType I = this.I;
                    final /* synthetic */ long J = this.J;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((h$a)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                final Object h = b.h();
                final int g = this.G;
                if (g != 0) {
                    if (g != 1 && g != 2 && g != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1.n(o);
                }
                else {
                    c1.n(o);
                    final TimeTableEntity w = this.H.w(this.I, this.J);
                    if (w == null) {
                        final k h2 = this.H;
                        final EntityType i = this.I;
                        final long j = this.J;
                        final long d = a.d();
                        final StringBuilder sb = new StringBuilder();
                        sb.append(EntityType.CLASS.getWebuntisId());
                        sb.append('-');
                        sb.append(this.J);
                        final TimeTableEntity timeTableEntity = new TimeTableEntity(i, j, true, 1, d, sb.toString());
                        this.G = 1;
                        if (h2.j(timeTableEntity, this) == h) {
                            return h;
                        }
                    }
                    else if (w.getFavorite()) {
                        final k h3 = this.H;
                        this.G = 2;
                        if (h3.J(w, this) == h) {
                            return h;
                        }
                    }
                    else {
                        w.setFavorite(true);
                        final k h4 = this.H;
                        this.G = 3;
                        if (h4.j(w, this) == h) {
                            return h;
                        }
                    }
                }
                return j2.a;
            }
        }, 3, (Object)null);
    }
}
