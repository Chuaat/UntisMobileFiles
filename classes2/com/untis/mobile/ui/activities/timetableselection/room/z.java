// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.timetableselection.room;

import java.util.Collection;
import java.util.Iterator;
import com.untis.mobile.services.timetable.placeholder.k;
import com.untis.mobile.persistence.models.EntityType;
import java.util.ArrayList;
import kotlinx.coroutines.CoroutineExceptionHandler;
import com.untis.mobile.utils.d0;
import org.joda.time.l0;
import org.joda.time.r;
import androidx.lifecycle.LiveData;
import kotlinx.coroutines.u0;
import kotlin.coroutines.g;
import kotlinx.coroutines.h;
import com.untis.mobile.persistence.models.profile.Profile;
import kotlin.c1;
import timber.log.b;
import kotlin.collections.v;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.j2;
import kotlin.coroutines.d;
import kotlinx.coroutines.r0;
import n6.p;
import androidx.lifecycle.x0;
import kotlinx.coroutines.k2;
import kotlin.jvm.internal.w;
import java.util.List;
import com.untis.mobile.persistence.models.masterdata.Room;
import androidx.lifecycle.k0;
import org.joda.time.c;
import org.jetbrains.annotations.e;
import com.untis.mobile.services.profile.legacy.a;
import kotlin.Metadata;
import androidx.lifecycle.w0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010%\u001a\u00020\"¢\u0006\u0004\b)\u0010*J\u001a\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0002J\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007J\u000e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0013\u001a\u00020\u000fJ\u000e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u000fJ\u0006\u0010\u0016\u001a\u00020\u000fJ\u0006\u0010\u0018\u001a\u00020\u0017J\u000e\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0003J\u000e\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0003R\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001c\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010\u0014\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010'¨\u0006+" }, d2 = { "Lcom/untis/mobile/ui/activities/timetableselection/room/z;", "Landroidx/lifecycle/w0;", "", "Lcom/untis/mobile/persistence/models/masterdata/Room;", "favorites", "Lkotlinx/coroutines/k2;", "g", "Landroidx/lifecycle/LiveData;", "Lcom/untis/mobile/ui/activities/timetableselection/room/i;", "m", "Lcom/untis/mobile/ui/activities/timetableselection/room/a;", "i", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "errorHandler", "n", "Lorg/joda/time/c;", "start", "Lkotlin/j2;", "q", "k", "end", "p", "j", "", "l", "room", "r", "o", "Landroidx/lifecycle/k0;", "d", "Landroidx/lifecycle/k0;", "mLiveData", "e", "mFreeRoomLiveData", "Lcom/untis/mobile/services/profile/legacy/a;", "a", "Lcom/untis/mobile/services/profile/legacy/a;", "profileService", "c", "Lorg/joda/time/c;", "b", "<init>", "(Lcom/untis/mobile/services/profile/legacy/a;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class z extends w0
{
    @e
    private final a a;
    @e
    private c b;
    @e
    private c c;
    @e
    private final k0<i> d;
    @e
    private final k0<com.untis.mobile.ui.activities.timetableselection.room.a> e;
    
    public z(@e final a a) {
        kotlin.jvm.internal.k0.p(a, "profileService");
        this.a = a;
        final c g0 = org.joda.time.c.G0();
        kotlin.jvm.internal.k0.o(g0, "now()");
        this.b = g0;
        final c v0 = g0.V0(15);
        kotlin.jvm.internal.k0.o(v0, "start.plusMinutes(15)");
        this.c = v0;
        this.d = (k0<i>)new k0((Object)new i(null, null, null, 7, null));
        this.e = (k0<com.untis.mobile.ui.activities.timetableselection.room.a>)new k0((Object)new com.untis.mobile.ui.activities.timetableselection.room.a(null, null, 3, null));
    }
    
    public static final /* synthetic */ c b(final z z) {
        return z.c;
    }
    
    public static final /* synthetic */ k0 c(final z z) {
        return z.e;
    }
    
    public static final /* synthetic */ k0 d(final z z) {
        return z.d;
    }
    
    public static final /* synthetic */ a e(final z z) {
        return z.a;
    }
    
    public static final /* synthetic */ c f(final z z) {
        return z.b;
    }
    
    private final k2 g(final List<Room> list) {
        return h.f(x0.a((w0)this), (g)null, (u0)null, (p)new p<r0, d<? super j2>, Object>() {
            int G;
            final /* synthetic */ z H;
            final /* synthetic */ List<Room> I;
            
            private static final void q(final z z, final List list, List o) {
                final k0 c = z.c(z);
                if (o == null) {
                    o = null;
                }
                else {
                    o = v.d5((Iterable<? extends Comparable>)o);
                }
                Object e = o;
                if (o == null) {
                    e = v.E();
                }
                if ((o = list) == null) {
                    final i i = (i)((LiveData)z.d(z)).f();
                    if (i == null) {
                        o = v.E();
                    }
                    else {
                        o = i.f();
                    }
                }
                c.n((Object)new com.untis.mobile.ui.activities.timetableselection.room.a((List<Room>)e, (List<Room>)o));
            }
            
            private static final void s(final Throwable t) {
                timber.log.b.f(t);
            }
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ z H = this.H;
                    final /* synthetic */ List<Room> I = this.I;
                    
                    private static final void q(final z z, final List list, List o) {
                        final k0 c = z.c(z);
                        if (o == null) {
                            o = null;
                        }
                        else {
                            o = v.d5((Iterable<? extends Comparable>)o);
                        }
                        Object e = o;
                        if (o == null) {
                            e = v.E();
                        }
                        if ((o = list) == null) {
                            final i i = (i)((LiveData)z.d(z)).f();
                            if (i == null) {
                                o = v.E();
                            }
                            else {
                                o = i.f();
                            }
                        }
                        c.n((Object)new com.untis.mobile.ui.activities.timetableselection.room.a((List<Room>)e, (List<Room>)o));
                    }
                    
                    private static final void s(final Throwable t) {
                        timber.log.b.f(t);
                    }
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((z$a)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.G != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c1.n(o);
                final Profile n = z.e(this.H).n();
                String uniqueId;
                if (n == null) {
                    uniqueId = null;
                }
                else {
                    uniqueId = n.getUniqueId();
                }
                if (uniqueId == null) {
                    return j2.a;
                }
                new com.untis.mobile.services.booking.e(uniqueId).c(z.f(this.H), z.b(this.H)).C5((rx.functions.b)new x(this.H, this.I), (rx.functions.b)y.G);
                return j2.a;
            }
        }, 3, (Object)null);
    }
    
    static /* synthetic */ k2 h(final z z, List list, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            list = null;
        }
        return z.g(list);
    }
    
    @e
    public final LiveData<com.untis.mobile.ui.activities.timetableselection.room.a> i() {
        return (LiveData<com.untis.mobile.ui.activities.timetableselection.room.a>)this.e;
    }
    
    @e
    public final c j() {
        return this.c;
    }
    
    @e
    public final c k() {
        return this.b;
    }
    
    @e
    public final String l() {
        return d0.s(new r((l0)this.b, (l0)this.c));
    }
    
    @e
    public final LiveData<i> m() {
        return (LiveData<i>)this.d;
    }
    
    @e
    public final k2 n(@e final CoroutineExceptionHandler coroutineExceptionHandler) {
        kotlin.jvm.internal.k0.p(coroutineExceptionHandler, "errorHandler");
        return h.f(x0.a((w0)this), (g)coroutineExceptionHandler, (u0)null, (p)new p<r0, d<? super j2>, Object>() {
            int G;
            final /* synthetic */ z H;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ z H = this.H;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((z$b)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.G != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c1.n(o);
                final Profile n = z.e(this.H).n();
                if (n == null) {
                    return j2.a;
                }
                final List<Comparable> d5 = v.d5((Iterable<? extends Comparable>)n.getMasterDataService().m(true));
                final k timeTableService = n.getTimeTableService();
                final ArrayList<Room> list = new ArrayList<Room>();
                for (final Room next : d5) {
                    if (kotlin.coroutines.jvm.internal.b.a(timeTableService.i(EntityType.ROOM, next.getId()))) {
                        list.add(next);
                    }
                }
                z.d(this.H).n((Object)new i(null, d5, list, 1, null));
                z.this.g(list);
                return j2.a;
            }
        }, 2, (Object)null);
    }
    
    public final void o(@e final Room room) {
        kotlin.jvm.internal.k0.p(room, "room");
        this.d.n((Object)new i(room, null, null, 6, null));
    }
    
    public final void p(@e final c c) {
        kotlin.jvm.internal.k0.p(c, "end");
        if (((org.joda.time.base.c)this.b).X4((l0)c) || ((org.joda.time.base.c)this.b).R((l0)c)) {
            final c v0 = c.v0(15);
            kotlin.jvm.internal.k0.o(v0, "end.minusMinutes(15)");
            this.b = v0;
        }
        this.c = c;
        h(this, null, 1, null);
    }
    
    public final void q(@e final c b) {
        kotlin.jvm.internal.k0.p(b, "start");
        if (((org.joda.time.base.c)this.c).X4((l0)b) || ((org.joda.time.base.c)this.c).C((l0)b)) {
            final c v0 = b.V0(15);
            kotlin.jvm.internal.k0.o(v0, "start.plusMinutes(15)");
            this.c = v0;
        }
        this.b = b;
        h(this, null, 1, null);
    }
    
    @e
    public final k2 r(@e final Room room) {
        kotlin.jvm.internal.k0.p(room, "room");
        return h.f(x0.a((w0)this), (g)null, (u0)null, (p)new p<r0, d<? super j2>, Object>() {
            Object G;
            int H;
            final /* synthetic */ z I;
            final /* synthetic */ Room J;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    Object G;
                    int H;
                    final /* synthetic */ z I = this.I;
                    final /* synthetic */ Room J = this.J;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((z$c)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object r4) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int h2 = this.H;
                k timeTableService;
                if (h2 != 0) {
                    if (h2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    final k k = (k)this.G;
                    c1.n(r4);
                    timeTableService = k;
                }
                else {
                    c1.n(r4);
                    final Profile n = z.e(this.I).n();
                    if (n == null) {
                        timeTableService = null;
                    }
                    else {
                        timeTableService = n.getTimeTableService();
                    }
                    if (timeTableService == null) {
                        return j2.a;
                    }
                    final EntityType room = EntityType.ROOM;
                    final long id = this.J.getId();
                    this.G = timeTableService;
                    this.H = 1;
                    if (k.a.a(timeTableService, room, id, false, this, 4, null) == h) {
                        return h;
                    }
                }
                final boolean i = timeTableService.i(EntityType.ROOM, this.J.getId());
                final i j = (i)((LiveData)z.d(this.I)).f();
                Object o;
                if (j == null) {
                    o = v.E();
                }
                else {
                    o = j.f();
                }
                if (i) {
                    r4 = v.r4((Collection<? extends Room>)o, this.J);
                }
                else {
                    final Room l = this.J;
                    final Collection<Room> collection = new ArrayList<Room>();
                    for (final Room next : o) {
                        if (kotlin.coroutines.jvm.internal.b.a(next.getId() != l.getId())) {
                            collection.add(next);
                        }
                    }
                    r4 = collection;
                }
                final i m = (i)((LiveData)z.d(this.I)).f();
                if (m != null) {
                    z.d(this.I).n((Object)com.untis.mobile.ui.activities.timetableselection.room.i.e(m, null, null, (List)r4, 3, null));
                }
                final com.untis.mobile.ui.activities.timetableselection.room.a a = (com.untis.mobile.ui.activities.timetableselection.room.a)((LiveData)z.c(this.I)).f();
                if (a != null) {
                    z.c(this.I).n((Object)com.untis.mobile.ui.activities.timetableselection.room.a.d(a, null, (List)r4, 1, null));
                }
                return j2.a;
            }
        }, 3, (Object)null);
    }
}
