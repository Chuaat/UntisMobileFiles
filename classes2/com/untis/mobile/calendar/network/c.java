// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.network;

import com.untis.mobile.calendar.network.model.period.CalendarPeriodDetailResponse;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.calendar.network.model.CalendarTeachingContentsResponse;
import org.koin.core.c$a;
import com.untis.mobile.calendar.network.model.period.room.CalendarPeriodRoomResponse;
import com.untis.mobile.calendar.persistence.model.entity.CalendarPeriodVideoCall;
import kotlin.coroutines.g;
import kotlinx.coroutines.h;
import java.util.Iterator;
import kotlin.jvm.internal.w;
import com.untis.mobile.calendar.network.model.period.update.CalendarPeriodUpdateOnlineLesson;
import com.untis.mobile.calendar.network.model.period.update.CalendarPeriodUpdateTeachingContent;
import java.util.List;
import com.untis.mobile.calendar.network.model.period.update.CalendarPeriodUpdateNote;
import com.untis.mobile.calendar.network.model.period.update.CalendarPeriodUpdateCancel;
import com.untis.mobile.calendar.network.model.period.update.CalendarPeriodUpdate;
import com.untis.mobile.calendar.network.model.period.update.CalendarPeriodUpdateRoom;
import java.util.Collection;
import kotlin.collections.v;
import java.util.ArrayList;
import com.untis.mobile.calendar.persistence.model.common.CalendarPeriodRoomStatus;
import com.untis.mobile.calendar.persistence.model.entity.CalendarPeriodRoom;
import android.util.Log;
import kotlin.coroutines.jvm.internal.o;
import kotlinx.coroutines.r0;
import n6.p;
import kotlinx.coroutines.i1;
import com.untis.mobile.calendar.persistence.model.CalendarPeriod;
import kotlin.c1;
import kotlin.coroutines.jvm.internal.f;
import kotlin.j2;
import kotlin.coroutines.d;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.m0;
import android.content.Context;
import kotlin.jvm.internal.k0;
import kotlin.b0;
import org.jetbrains.annotations.e;
import com.untis.mobile.persistence.models.profile.Profile;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010=\u001a\u00020:¢\u0006\u0004\bC\u0010DJ\u0013\u0010\u0004\u001a\u00020\u0003H\u0082@\u00f8\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJA\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00132\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\bH\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J+\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\bH\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001cJ3\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J+\u0010#\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\t\u001a\u00020\bH\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b#\u0010$J+\u0010&\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010%\u001a\u00020!2\u0006\u0010\t\u001a\u00020\bH\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b&\u0010$J+\u0010(\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010'\u001a\u00020!2\u0006\u0010\t\u001a\u00020\bH\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b(\u0010$J+\u0010+\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010*\u001a\u00020)2\u0006\u0010\t\u001a\u00020\bH\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b+\u0010,J#\u0010.\u001a\u00020-2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b.\u0010/R\u001d\u00105\u001a\u0002008B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010=\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u001d\u0010B\u001a\u00020>8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u00102\u001a\u0004\b@\u0010A\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006E" }, d2 = { "Lcom/untis/mobile/calendar/network/c;", "Lcom/untis/mobile/calendar/network/b;", "Lorg/koin/core/c;", "Lkotlin/j2;", "p", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "id", "", "firstRun", "Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;", "b", "(JZLkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "entityId", "Lorg/joda/time/c;", "start", "end", "", "i", "(Lcom/untis/mobile/persistence/models/EntityType;JLorg/joda/time/c;Lorg/joda/time/c;ZLkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomResponse;", "d", "(Lorg/joda/time/c;Lorg/joda/time/c;ZLkotlin/coroutines/d;)Ljava/lang/Object;", "period", "roomId", "a", "(Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;JZLkotlin/coroutines/d;)Ljava/lang/Object;", "originalRoomId", "f", "k", "(Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;JJZLkotlin/coroutines/d;)Ljava/lang/Object;", "", "notesAll", "g", "(Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;Ljava/lang/String;ZLkotlin/coroutines/d;)Ljava/lang/Object;", "content", "j", "notesTeacher", "e", "Lcom/untis/mobile/calendar/persistence/model/entity/CalendarPeriodVideoCall;", "onlineLessonLink", "c", "(Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;Lcom/untis/mobile/calendar/persistence/model/entity/CalendarPeriodVideoCall;ZLkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/calendar/network/model/CalendarTeachingContentsResponse;", "h", "(Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;ZLkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/services/profile/legacy/a;", "J", "Lkotlin/b0;", "o", "()Lcom/untis/mobile/services/profile/legacy/a;", "profileService", "Lcom/untis/mobile/calendar/network/a;", "I", "Lcom/untis/mobile/calendar/network/a;", "api", "Lcom/untis/mobile/persistence/models/profile/Profile;", "G", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "Landroid/content/Context;", "H", "n", "()Landroid/content/Context;", "context", "<init>", "(Lcom/untis/mobile/persistence/models/profile/Profile;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class c implements b, org.koin.core.c
{
    @e
    private Profile G;
    @e
    private final b0 H;
    @e
    private final com.untis.mobile.calendar.network.a I;
    @e
    private final b0 J;
    
    public c(@e final Profile g) {
        k0.p(g, "profile");
        this.G = g;
        this.H = d0.c((n6.a<?>)new n6.a<Context>() {
            final /* synthetic */ org.koin.core.scope.a G = ((org.koin.core.c)this).getKoin().y();
            
            @Override
            public final Context invoke() {
                return (Context)this.G.t(k1.d(Context.class), null, null);
            }
        });
        this.I = com.untis.mobile.calendar.network.a.a.a(this.n(), this.G);
        this.J = d0.c((n6.a<?>)new n6.a<com.untis.mobile.services.profile.legacy.a>() {
            final /* synthetic */ org.koin.core.scope.a G = ((org.koin.core.c)this).getKoin().y();
            
            @Override
            public final com.untis.mobile.services.profile.legacy.a invoke() {
                return (com.untis.mobile.services.profile.legacy.a)this.G.t(k1.d(com.untis.mobile.services.profile.legacy.a.class), null, null);
            }
        });
    }
    
    public static final /* synthetic */ com.untis.mobile.calendar.network.a l(final c c) {
        return c.I;
    }
    
    private final Context n() {
        return this.H.getValue();
    }
    
    private final com.untis.mobile.services.profile.legacy.a o() {
        return this.J.getValue();
    }
    
    private final Object p(final d<? super j2> d) {
        kotlin.coroutines.jvm.internal.d d3 = null;
        Label_0047: {
            if (d instanceof c$n) {
                final kotlin.coroutines.jvm.internal.d d2 = (c$n)d;
                final int j = d2.J;
                if ((j & Integer.MIN_VALUE) != 0x0) {
                    d2.J = j + Integer.MIN_VALUE;
                    d3 = d2;
                    break Label_0047;
                }
            }
            d3 = new kotlin.coroutines.jvm.internal.d(d) {
                Object G;
                /* synthetic */ Object H;
                int J;
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@org.jetbrains.annotations.e final Object h) {
                    this.H = h;
                    this.J |= Integer.MIN_VALUE;
                    return c.this.p(this);
                }
            };
        }
        Object o = d3.H;
        final Object h = kotlin.coroutines.intrinsics.b.h();
        final int i = d3.J;
        c c;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c = (c)d3.G;
            c1.n(o);
        }
        else {
            c1.n(o);
            final com.untis.mobile.services.profile.legacy.a o2 = this.o();
            final Profile g = this.G;
            d3.G = this;
            d3.J = 1;
            o = o2.i(g, d3);
            if (o == h) {
                return h;
            }
            c = this;
        }
        c.G = (Profile)o;
        return j2.a;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object a(@e final CalendarPeriod calendarPeriod, final long n, final boolean b, @e final d<? super CalendarPeriod> d) throws Exception {
        return h.i((g)i1.c(), (p)new p<r0, d<? super CalendarPeriod>, Object>(b) {
            int G;
            final /* synthetic */ c H;
            final /* synthetic */ CalendarPeriod I;
            final /* synthetic */ long J;
            final /* synthetic */ boolean K;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super CalendarPeriod>, Object>() {
                    int G;
                    final /* synthetic */ c H = this.H;
                    final /* synthetic */ CalendarPeriod I = this.I;
                    final /* synthetic */ long J = this.J;
                    final /* synthetic */ boolean K = this.K;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super CalendarPeriod> d) {
                return ((c$a)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object o) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                Label_0063: {
                    if (g == 0) {
                        break Label_0063;
                    }
                    if (g != 1) {
                        if (g == 2) {
                            c1.n(o);
                            break Label_0063;
                        }
                        if (g == 3) {
                            c1.n(o);
                            return o;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        c1.n(o);
                        return o;
                    }
                    finally {
                        final Throwable t;
                        Log.e("untis_log_cal_net", "error on adding new room to calendar period", t);
                        if (!this.K || !com.untis.mobile.utils.extension.f.a(t)) {
                            break Label_0063;
                        }
                        final c h2 = this.H;
                        this.G = 2;
                        if (h2.p(this) == h) {
                            return h;
                        }
                        break Label_0063;
                        // iftrue(Label_0175:, !kotlin.coroutines.jvm.internal.b.a((CalendarPeriodRoom)next.getStatus() != CalendarPeriodRoomStatus.Removed).booleanValue())
                        // iftrue(Label_0241:, !iterator2.hasNext())
                        // iftrue(Label_0178:, !iterator.hasNext())
                    Label_0112_Outer:
                        while (true) {
                            final Iterator<Object> iterator2;
                            final ArrayList list2;
                            Block_11: {
                                ArrayList<CalendarPeriodRoom> list = null;
                            Label_0112:
                                while (true) {
                                    Label_0175: {
                                        while (true) {
                                            while (true) {
                                                final CalendarPeriodRoom next;
                                                list.add(next);
                                                break Label_0175;
                                                final Iterator<CalendarPeriodRoom> iterator;
                                                next = iterator.next();
                                                continue Label_0112_Outer;
                                            }
                                            break Block_11;
                                            c1.n(o);
                                            final a l = c.l(this.H);
                                            final long id = this.I.getId();
                                            final List<CalendarPeriodRoom> rooms = this.I.getRooms();
                                            list = new ArrayList<CalendarPeriodRoom>();
                                            final Iterator<CalendarPeriodRoom> iterator = (Iterator<CalendarPeriodRoom>)rooms.iterator();
                                            break Label_0112;
                                            Label_0321: {
                                                return o;
                                            }
                                            continue Label_0112_Outer;
                                        }
                                    }
                                    continue Label_0112;
                                }
                                Label_0178: {
                                    list2 = new ArrayList<Long>(v.Y((Iterable<?>)list, 10));
                                }
                                iterator2 = (Iterator<Object>)list.iterator();
                                continue Label_0112_Outer;
                                Label_0241:
                                final CalendarPeriodUpdate calendarPeriodUpdate = new CalendarPeriodUpdate(null, null, null, null, null, new CalendarPeriodUpdateRoom(v.r4((Collection<? extends Long>)list2, kotlin.coroutines.jvm.internal.b.g(this.J))), null, null, null, null, 991, null);
                                this.G = 1;
                                return h;
                            }
                            list2.add(kotlin.coroutines.jvm.internal.b.g(iterator2.next().getId()));
                            continue;
                        }
                    }
                    // iftrue(Label_0321:, o = l.b(id, calendarPeriodUpdate, (d<? super CalendarPeriod>)this) != h)
                }
                final c h3 = this.H;
                final CalendarPeriod i = this.I;
                final long j = this.J;
                this.G = 3;
                if ((o = h3.a(i, j, false, this)) == h) {
                    return h;
                }
                return o;
            }
        }, (d)d);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object b(final long n, final boolean b, @e final d<? super CalendarPeriod> d) throws Exception {
        return h.i((g)i1.c(), (p)new p<r0, d<? super CalendarPeriod>, Object>(null) {
            int G;
            final /* synthetic */ c H;
            final /* synthetic */ long I;
            final /* synthetic */ boolean J;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super CalendarPeriod>, Object>(d) {
                    int G;
                    final /* synthetic */ c H = this.H;
                    final /* synthetic */ long I = this.I;
                    final /* synthetic */ boolean J = this.J;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super CalendarPeriod> d) {
                return ((c$c)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object o) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                Label_0063: {
                    if (g == 0) {
                        break Label_0063;
                    }
                    if (g != 1) {
                        if (g == 2) {
                            c1.n(o);
                            break Label_0063;
                        }
                        if (g == 3) {
                            c1.n(o);
                            return o;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        c1.n(o);
                        return o;
                    }
                    finally {
                        final Throwable t;
                        Log.e("untis_log_cal_net", "error on fetching calendar period", t);
                        if (!this.J || !com.untis.mobile.utils.extension.f.a(t)) {
                            break Label_0063;
                        }
                        final c h2 = this.H;
                        this.G = 2;
                        if (h2.p(this) == h) {
                            return h;
                        }
                        break Label_0063;
                        Label_0108: {
                            return o;
                        }
                        c1.n(o);
                        final a l = c.l(this.H);
                        final long i = this.I;
                        this.G = 1;
                        // iftrue(Label_0108:, o = l.e(i, (d<? super CalendarPeriod>)this) != h)
                        return h;
                    }
                }
                final c h3 = this.H;
                final long j = this.I;
                this.G = 3;
                if ((o = h3.b(j, false, this)) == h) {
                    return h;
                }
                return o;
            }
        }, (d)d);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object c(@e final CalendarPeriod calendarPeriod, @e final CalendarPeriodVideoCall calendarPeriodVideoCall, final boolean b, @e final d<? super CalendarPeriod> d) throws Exception {
        return h.i((g)i1.c(), (p)new p<r0, d<? super CalendarPeriod>, Object>(b) {
            int G;
            final /* synthetic */ c H;
            final /* synthetic */ CalendarPeriod I;
            final /* synthetic */ CalendarPeriodVideoCall J;
            final /* synthetic */ boolean K;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super CalendarPeriod>, Object>() {
                    int G;
                    final /* synthetic */ c H = this.H;
                    final /* synthetic */ CalendarPeriod I = this.I;
                    final /* synthetic */ CalendarPeriodVideoCall J = this.J;
                    final /* synthetic */ boolean K = this.K;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super CalendarPeriod> d) {
                return ((c$m)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object o) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                Label_0063: {
                    if (g == 0) {
                        break Label_0063;
                    }
                    if (g != 1) {
                        if (g == 2) {
                            c1.n(o);
                            break Label_0063;
                        }
                        if (g == 3) {
                            c1.n(o);
                            return o;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        c1.n(o);
                        return o;
                    }
                    finally {
                        final Throwable t;
                        timber.log.b.g(t, "error on submitting online lesson of calendar period", new Object[0]);
                        if (!this.K || !com.untis.mobile.utils.extension.f.a(t)) {
                            break Label_0063;
                        }
                        final c h2 = this.H;
                        this.G = 2;
                        if (h2.p(this) == h) {
                            return h;
                        }
                        break Label_0063;
                        Label_0151: {
                            return o;
                        }
                        c1.n(o);
                        final a l = c.l(this.H);
                        final long id = this.I.getId();
                        o = new CalendarPeriodUpdateOnlineLesson(this.J);
                        final CalendarPeriodUpdate calendarPeriodUpdate = new CalendarPeriodUpdate(null, null, null, null, null, null, null, null, null, (CalendarPeriodUpdateOnlineLesson)o, 511, null);
                        this.G = 1;
                        // iftrue(Label_0151:, o = l.b(id, calendarPeriodUpdate, (d<? super CalendarPeriod>)this) != h)
                        return h;
                    }
                }
                final c h3 = this.H;
                final CalendarPeriod i = this.I;
                final CalendarPeriodVideoCall j = this.J;
                this.G = 3;
                if ((o = h3.c(i, j, false, this)) == h) {
                    return h;
                }
                return o;
            }
        }, (d)d);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object d(@e final org.joda.time.c c, @e final org.joda.time.c c2, final boolean b, @e final d<? super CalendarPeriodRoomResponse> d) throws Exception {
        return h.i((g)i1.c(), (p)new p<r0, d<? super CalendarPeriodRoomResponse>, Object>(b) {
            int G;
            final /* synthetic */ c H;
            final /* synthetic */ org.joda.time.c I;
            final /* synthetic */ org.joda.time.c J;
            final /* synthetic */ boolean K;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super CalendarPeriodRoomResponse>, Object>() {
                    int G;
                    final /* synthetic */ c H = this.H;
                    final /* synthetic */ org.joda.time.c I = this.I;
                    final /* synthetic */ org.joda.time.c J = this.J;
                    final /* synthetic */ boolean K = this.K;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super CalendarPeriodRoomResponse> d) {
                return ((c$d)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object o) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                Label_0063: {
                    if (g == 0) {
                        break Label_0063;
                    }
                    if (g != 1) {
                        if (g == 2) {
                            c1.n(o);
                            break Label_0063;
                        }
                        if (g == 3) {
                            c1.n(o);
                            return o;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        c1.n(o);
                        return o;
                    }
                    finally {
                        final Throwable t;
                        Log.e("untis_log_cal_net", "error on fetching calendar period room details", t);
                        if (!this.K || !com.untis.mobile.utils.extension.f.a(t)) {
                            break Label_0063;
                        }
                        final c h2 = this.H;
                        this.G = 2;
                        if (h2.p(this) == h) {
                            return h;
                        }
                        break Label_0063;
                        Label_0122: {
                            return o;
                        }
                        c1.n(o);
                        final a l = c.l(this.H);
                        final String t2 = com.untis.mobile.utils.d0.t(this.I);
                        final String t3 = com.untis.mobile.utils.d0.t(this.J);
                        this.G = 1;
                        // iftrue(Label_0122:, o = l.d(t2, t3, (d<? super CalendarPeriodRoomResponse>)this) != h)
                        return h;
                    }
                }
                final c h3 = this.H;
                final org.joda.time.c i = this.I;
                final org.joda.time.c j = this.J;
                this.G = 3;
                if ((o = h3.d(i, j, false, this)) == h) {
                    return h;
                }
                return o;
            }
        }, (d)d);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object e(@e final CalendarPeriod calendarPeriod, @e final String s, final boolean b, @e final d<? super CalendarPeriod> d) throws Exception {
        return h.i((g)i1.c(), (p)new p<r0, d<? super CalendarPeriod>, Object>(b) {
            int G;
            final /* synthetic */ c H;
            final /* synthetic */ CalendarPeriod I;
            final /* synthetic */ String J;
            final /* synthetic */ boolean K;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super CalendarPeriod>, Object>() {
                    int G;
                    final /* synthetic */ c H = this.H;
                    final /* synthetic */ CalendarPeriod I = this.I;
                    final /* synthetic */ String J = this.J;
                    final /* synthetic */ boolean K = this.K;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super CalendarPeriod> d) {
                return ((c$l)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object o) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                Label_0063: {
                    if (g == 0) {
                        break Label_0063;
                    }
                    if (g != 1) {
                        if (g == 2) {
                            c1.n(o);
                            break Label_0063;
                        }
                        if (g == 3) {
                            c1.n(o);
                            return o;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        c1.n(o);
                        return o;
                    }
                    finally {
                        final Throwable t;
                        timber.log.b.g(t, "error on submitting notes all of calendar period", new Object[0]);
                        if (!this.K || !com.untis.mobile.utils.extension.f.a(t)) {
                            break Label_0063;
                        }
                        final c h2 = this.H;
                        this.G = 2;
                        if (h2.p(this) == h) {
                            return h;
                        }
                        break Label_0063;
                        c1.n(o);
                        final a l = c.l(this.H);
                        final long id = this.I.getId();
                        o = new CalendarPeriodUpdate(null, null, null, new CalendarPeriodUpdateNote(this.J), null, null, null, null, null, null, 1015, null);
                        this.G = 1;
                        // iftrue(Label_0151:, o = l.b(id, (CalendarPeriodUpdate)o, (d<? super CalendarPeriod>)this) != h)
                        return h;
                        Label_0151: {
                            return o;
                        }
                    }
                }
                final c h3 = this.H;
                final CalendarPeriod i = this.I;
                final String j = this.J;
                this.G = 3;
                if ((o = h3.g(i, j, false, this)) == h) {
                    return h;
                }
                return o;
            }
        }, (d)d);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object f(@e final CalendarPeriod calendarPeriod, final long n, final boolean b, @e final d<? super CalendarPeriod> d) throws Exception {
        return h.i((g)i1.c(), (p)new p<r0, d<? super CalendarPeriod>, Object>(n) {
            int G;
            final /* synthetic */ c H;
            final /* synthetic */ CalendarPeriod I;
            final /* synthetic */ boolean J;
            final /* synthetic */ long K;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super CalendarPeriod>, Object>() {
                    int G;
                    final /* synthetic */ c H = this.H;
                    final /* synthetic */ CalendarPeriod I = this.I;
                    final /* synthetic */ boolean J = this.J;
                    final /* synthetic */ long K = this.K;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super CalendarPeriod> d) {
                return ((c$b)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object o) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                Label_0063: {
                    if (g == 0) {
                        break Label_0063;
                    }
                    if (g != 1) {
                        if (g == 2) {
                            c1.n(o);
                            break Label_0063;
                        }
                        if (g == 3) {
                            c1.n(o);
                            return o;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        c1.n(o);
                        return o;
                    }
                    finally {
                        final Throwable t;
                        Log.e("untis_log_cal_net", "error on deleting room from calendar period", t);
                        if (!this.J || !com.untis.mobile.utils.extension.f.a(t)) {
                            break Label_0063;
                        }
                        final c h2 = this.H;
                        this.G = 2;
                        if (h2.p(this) == h) {
                            return h;
                        }
                        break Label_0063;
                        // iftrue(Label_0333:, !iterator.hasNext())
                        // iftrue(Label_0270:, !iterator2.hasNext())
                        // iftrue(Label_0179:, !hasNext)
                        // iftrue(Label_0176:, !kotlin.coroutines.jvm.internal.b.a(b).booleanValue())
                        // iftrue(Label_0399:, o = l.b(id, calendarPeriodUpdate, (d<? super CalendarPeriod>)this) != h)
                        // iftrue(Label_0204:, !kotlin.coroutines.jvm.internal.b.a((CalendarPeriodRoom)next2.getId() != k).booleanValue())
                        // iftrue(Label_0155:, (CalendarPeriodRoom)next.getStatus() == CalendarPeriodRoomStatus.Removed)
                    Block_13_Outer:
                        while (true) {
                            Iterator<Object> iterator3 = null;
                            Block_8: {
                                while (true) {
                                    Iterator<Object> iterator2 = null;
                                    Block_11: {
                                        ArrayList<Long> list = null;
                                    Label_0204:
                                        while (true) {
                                            ArrayList<CalendarPeriodRoom> list3;
                                            while (true) {
                                                Label_0112: {
                                                Label_0296:
                                                    while (true) {
                                                        while (true) {
                                                            final Iterator<CalendarPeriodRoom> iterator;
                                                            list.add(kotlin.coroutines.jvm.internal.b.g(iterator.next().getId()));
                                                            break Label_0296;
                                                            final ArrayList<CalendarPeriodRoom> list2;
                                                            final CalendarPeriodRoom next;
                                                            list2.add(next);
                                                            Label_0176: {
                                                                break Label_0112;
                                                            }
                                                            Label_0179:
                                                            final long k = this.K;
                                                            list3 = new ArrayList<CalendarPeriodRoom>();
                                                            iterator2 = list2.iterator();
                                                            break Label_0204;
                                                            c1.n(o);
                                                            final a l = c.l(this.H);
                                                            final long id = this.I.getId();
                                                            final List<CalendarPeriodRoom> rooms = this.I.getRooms();
                                                            list2 = (ArrayList<CalendarPeriodRoom>)new ArrayList<Object>();
                                                            iterator3 = rooms.iterator();
                                                            break Label_0112;
                                                            continue Block_13_Outer;
                                                        }
                                                        Label_0270: {
                                                            list = new ArrayList<Long>(v.Y((Iterable<?>)list3, 10));
                                                        }
                                                        final Iterator<CalendarPeriodRoom> iterator = (Iterator<CalendarPeriodRoom>)list3.iterator();
                                                        continue Label_0296;
                                                    }
                                                    break Block_11;
                                                }
                                                final boolean hasNext = iterator3.hasNext();
                                                boolean b = false;
                                                break Block_8;
                                                b = true;
                                                Label_0155: {
                                                    continue Block_13_Outer;
                                                }
                                            }
                                            final CalendarPeriodRoom next2;
                                            list3.add(next2);
                                            continue Label_0204;
                                        }
                                        Label_0333: {
                                            final CalendarPeriodUpdate calendarPeriodUpdate = new CalendarPeriodUpdate(null, null, null, null, null, new CalendarPeriodUpdateRoom(list), null, null, null, null, 991, null);
                                        }
                                        this.G = 1;
                                        return h;
                                    }
                                    final CalendarPeriodRoom next2 = iterator2.next();
                                    continue;
                                }
                            }
                            final CalendarPeriodRoom next = iterator3.next();
                            continue;
                        }
                        Label_0399: {
                            return o;
                        }
                    }
                }
                final c h3 = this.H;
                final CalendarPeriod i = this.I;
                final long j = this.K;
                this.G = 3;
                if ((o = h3.f(i, j, false, this)) == h) {
                    return h;
                }
                return o;
            }
        }, (d)d);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object g(@e final CalendarPeriod calendarPeriod, @e final String s, final boolean b, @e final d<? super CalendarPeriod> d) throws Exception {
        return h.i((g)i1.c(), (p)new p<r0, d<? super CalendarPeriod>, Object>(b) {
            int G;
            final /* synthetic */ c H;
            final /* synthetic */ CalendarPeriod I;
            final /* synthetic */ String J;
            final /* synthetic */ boolean K;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super CalendarPeriod>, Object>() {
                    int G;
                    final /* synthetic */ c H = this.H;
                    final /* synthetic */ CalendarPeriod I = this.I;
                    final /* synthetic */ String J = this.J;
                    final /* synthetic */ boolean K = this.K;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super CalendarPeriod> d) {
                return ((c$k)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object o) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                Label_0063: {
                    if (g == 0) {
                        break Label_0063;
                    }
                    if (g != 1) {
                        if (g == 2) {
                            c1.n(o);
                            break Label_0063;
                        }
                        if (g == 3) {
                            c1.n(o);
                            return o;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        c1.n(o);
                        return o;
                    }
                    finally {
                        final Throwable t;
                        timber.log.b.g(t, "error on submitting notes all of calendar period", new Object[0]);
                        if (!this.K || !com.untis.mobile.utils.extension.f.a(t)) {
                            break Label_0063;
                        }
                        final c h2 = this.H;
                        this.G = 2;
                        if (h2.p(this) == h) {
                            return h;
                        }
                        break Label_0063;
                        c1.n(o);
                        final a l = c.l(this.H);
                        final long id = this.I.getId();
                        final CalendarPeriodUpdate calendarPeriodUpdate = new CalendarPeriodUpdate(null, new CalendarPeriodUpdateNote(this.J), null, null, null, null, null, null, null, null, 1021, null);
                        this.G = 1;
                        // iftrue(Label_0152:, o = l.b(id, calendarPeriodUpdate, (d<? super CalendarPeriod>)this) != h)
                        return h;
                        Label_0152: {
                            return o;
                        }
                    }
                }
                final c h3 = this.H;
                final CalendarPeriod i = this.I;
                final String j = this.J;
                this.G = 3;
                if ((o = h3.g(i, j, false, this)) == h) {
                    return h;
                }
                return o;
            }
        }, (d)d);
    }
    
    @e
    public org.koin.core.a getKoin() {
        return org.koin.core.c$a.a((org.koin.core.c)this);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object h(@e final CalendarPeriod calendarPeriod, final boolean b, @e final d<? super CalendarTeachingContentsResponse> d) throws Exception {
        return h.i((g)i1.c(), (p)new p<r0, d<? super CalendarTeachingContentsResponse>, Object>(null) {
            int G;
            final /* synthetic */ c H;
            final /* synthetic */ CalendarPeriod I;
            final /* synthetic */ boolean J;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super CalendarTeachingContentsResponse>, Object>(d) {
                    int G;
                    final /* synthetic */ c H = this.H;
                    final /* synthetic */ CalendarPeriod I = this.I;
                    final /* synthetic */ boolean J = this.J;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super CalendarTeachingContentsResponse> d) {
                return ((c$f)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object o) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                Label_0063: {
                    if (g == 0) {
                        break Label_0063;
                    }
                    if (g != 1) {
                        if (g == 2) {
                            c1.n(o);
                            break Label_0063;
                        }
                        if (g == 3) {
                            c1.n(o);
                            return o;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        c1.n(o);
                        return o;
                    }
                    finally {
                        final Throwable t;
                        timber.log.b.g(t, "error on fetching previous lesson contents", new Object[0]);
                        if (!this.J || !com.untis.mobile.utils.extension.f.a(t)) {
                            break Label_0063;
                        }
                        final c h2 = this.H;
                        this.G = 2;
                        if (h2.p(this) == h) {
                            return h;
                        }
                        break Label_0063;
                        Label_0112: {
                            return o;
                        }
                        c1.n(o);
                        final a l = c.l(this.H);
                        final long id = this.I.getId();
                        this.G = 1;
                        // iftrue(Label_0112:, o = a.b.a(l, id, (Integer)null, (d)this, 2, (Object)null) != h)
                        return h;
                    }
                }
                final c h3 = this.H;
                final CalendarPeriod i = this.I;
                this.G = 3;
                if ((o = h3.h(i, false, this)) == h) {
                    return h;
                }
                return o;
            }
        }, (d)d);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object i(@e final EntityType entityType, final long n, @e final org.joda.time.c c, @e final org.joda.time.c c2, final boolean b, @e final d<? super List<CalendarPeriod>> d) throws Exception {
        return h.i((g)i1.c(), (p)new p<r0, d<? super List<? extends CalendarPeriod>>, Object>(c) {
            int G;
            final /* synthetic */ c H;
            final /* synthetic */ EntityType I;
            final /* synthetic */ long J;
            final /* synthetic */ org.joda.time.c K;
            final /* synthetic */ org.joda.time.c L;
            final /* synthetic */ boolean M;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super List<? extends CalendarPeriod>>, Object>() {
                    int G;
                    final /* synthetic */ c H = this.H;
                    final /* synthetic */ EntityType I = this.I;
                    final /* synthetic */ long J = this.J;
                    final /* synthetic */ org.joda.time.c K = this.K;
                    final /* synthetic */ org.joda.time.c L = this.L;
                    final /* synthetic */ boolean M = this.M;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super List<CalendarPeriod>> d) {
                return ((c$e)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object o) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                Label_0063: {
                    if (g == 0) {
                        break Label_0063;
                    }
                    if (g != 1) {
                        if (g == 2) {
                            c1.n(o);
                            break Label_0063;
                        }
                        if (g == 3) {
                            c1.n(o);
                            return o;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        c1.n(o);
                        return ((CalendarPeriodDetailResponse)o).getPeriods();
                    }
                    finally {
                        final Throwable t;
                        if (!this.M || !com.untis.mobile.utils.extension.f.a(t)) {
                            break Label_0063;
                        }
                        final c h2 = this.H;
                        this.G = 2;
                        if (h2.p(this) == h) {
                            return h;
                        }
                        break Label_0063;
                        c1.n(o);
                        final a l = c.l(this.H);
                        final long n = this.I.getWebuntisId();
                        final long j = this.J;
                        final String t2 = com.untis.mobile.utils.d0.t(this.K);
                        final String t3 = com.untis.mobile.utils.d0.t(this.L);
                        this.G = 1;
                        // iftrue(Label_0142:, o = l.c(n, j, t2, t3, (d<? super CalendarPeriodDetailResponse>)this) != h)
                        return h;
                        Label_0142: {
                            return ((CalendarPeriodDetailResponse)o).getPeriods();
                        }
                    }
                }
                final c h3 = this.H;
                final EntityType i = this.I;
                final long k = this.J;
                final org.joda.time.c m = this.K;
                final org.joda.time.c l2 = this.L;
                this.G = 3;
                if ((o = h3.i(i, k, m, l2, false, this)) == h) {
                    return h;
                }
                return o;
            }
        }, (d)d);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object j(@e final CalendarPeriod calendarPeriod, @e final String s, final boolean b, @e final d<? super CalendarPeriod> d) throws Exception {
        return h.i((g)i1.c(), (p)new p<r0, d<? super CalendarPeriod>, Object>(b) {
            int G;
            final /* synthetic */ c H;
            final /* synthetic */ CalendarPeriod I;
            final /* synthetic */ String J;
            final /* synthetic */ boolean K;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super CalendarPeriod>, Object>() {
                    int G;
                    final /* synthetic */ c H = this.H;
                    final /* synthetic */ CalendarPeriod I = this.I;
                    final /* synthetic */ String J = this.J;
                    final /* synthetic */ boolean K = this.K;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super CalendarPeriod> d) {
                return ((c$j)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object o) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                Label_0063: {
                    if (g == 0) {
                        break Label_0063;
                    }
                    if (g != 1) {
                        if (g == 2) {
                            c1.n(o);
                            break Label_0063;
                        }
                        if (g == 3) {
                            c1.n(o);
                            return o;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        c1.n(o);
                        return o;
                    }
                    finally {
                        final Throwable t;
                        Log.e("untis_log_cal_net", "error on replacing room from calendar period", t);
                        if (!this.K || !com.untis.mobile.utils.extension.f.a(t)) {
                            break Label_0063;
                        }
                        final c h2 = this.H;
                        this.G = 2;
                        if (h2.p(this) == h) {
                            return h;
                        }
                        break Label_0063;
                        Label_0152: {
                            return o;
                        }
                        c1.n(o);
                        final a l = c.l(this.H);
                        final long id = this.I.getId();
                        final CalendarPeriodUpdate calendarPeriodUpdate = new CalendarPeriodUpdate(null, null, null, null, null, null, null, new CalendarPeriodUpdateTeachingContent(this.J), null, null, 895, null);
                        this.G = 1;
                        // iftrue(Label_0152:, o = l.b(id, calendarPeriodUpdate, (d<? super CalendarPeriod>)this) != h)
                        return h;
                    }
                }
                final c h3 = this.H;
                final CalendarPeriod i = this.I;
                final String j = this.J;
                this.G = 3;
                if ((o = h3.j(i, j, false, this)) == h) {
                    return h;
                }
                return o;
            }
        }, (d)d);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object k(@e final CalendarPeriod calendarPeriod, final long n, final long n2, final boolean b, @e final d<? super CalendarPeriod> d) throws Exception {
        return h.i((g)i1.c(), (p)new p<r0, d<? super CalendarPeriod>, Object>(n) {
            int G;
            final /* synthetic */ c H;
            final /* synthetic */ CalendarPeriod I;
            final /* synthetic */ boolean J;
            final /* synthetic */ long K;
            final /* synthetic */ long L;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super CalendarPeriod>, Object>() {
                    int G;
                    final /* synthetic */ c H = this.H;
                    final /* synthetic */ CalendarPeriod I = this.I;
                    final /* synthetic */ boolean J = this.J;
                    final /* synthetic */ long K = this.K;
                    final /* synthetic */ long L = this.L;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super CalendarPeriod> d) {
                return ((c$g)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object o) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                Label_0063: {
                    if (g == 0) {
                        break Label_0063;
                    }
                    if (g != 1) {
                        if (g == 2) {
                            c1.n(o);
                            break Label_0063;
                        }
                        if (g == 3) {
                            c1.n(o);
                            return o;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        c1.n(o);
                        return o;
                    }
                    finally {
                        final Throwable t;
                        Log.e("untis_log_cal_net", "error on replacing room from calendar period", t);
                        if (!this.J || !com.untis.mobile.utils.extension.f.a(t)) {
                            break Label_0063;
                        }
                        final c h2 = this.H;
                        this.G = 2;
                        if (h2.p(this) == h) {
                            return h;
                        }
                        break Label_0063;
                        // iftrue(Label_0178:, !iterator.hasNext())
                        // iftrue(Label_0256:, calendarPeriodRoom.getId() != k)
                        // iftrue(Label_0345:, o = l.b(id, calendarPeriodUpdate, (d<? super CalendarPeriod>)this) != h)
                        // iftrue(Label_0175:, !kotlin.coroutines.jvm.internal.b.a((CalendarPeriodRoom)next.getStatus() != CalendarPeriodRoomStatus.Removed).booleanValue())
                        // iftrue(Label_0279:, !iterator2.hasNext())
                    Label_0216:
                        while (true) {
                            ArrayList list2 = null;
                            long id2 = 0L;
                        Label_0263:
                            while (true) {
                                while (true) {
                                    final ArrayList<CalendarPeriodRoom> list;
                                    final Iterator<Object> iterator;
                                    Label_0112: {
                                        break Label_0112;
                                        c1.n(o);
                                        final a l = c.l(this.H);
                                        final long id = this.I.getId();
                                        final List<CalendarPeriodRoom> rooms = this.I.getRooms();
                                        list = new ArrayList<CalendarPeriodRoom>();
                                        iterator = rooms.iterator();
                                    }
                                    Block_8: {
                                        break Block_8;
                                        final Iterator<Object> iterator2;
                                        final CalendarPeriodRoom calendarPeriodRoom = iterator2.next();
                                        final long i;
                                        Block_12: {
                                            break Block_12;
                                            Label_0279: {
                                                final CalendarPeriodUpdate calendarPeriodUpdate = new CalendarPeriodUpdate(null, null, null, null, null, new CalendarPeriodUpdateRoom((List<Long>)list2), null, null, null, null, 991, null);
                                            }
                                            this.G = 1;
                                            return h;
                                            Label_0256:
                                            id2 = calendarPeriodRoom.getId();
                                            break Label_0263;
                                            Label_0345:
                                            return o;
                                            Label_0178:
                                            final long k = this.K;
                                            i = this.L;
                                            list2 = new ArrayList<Long>(v.Y((Iterable<?>)list, 10));
                                            iterator2 = (Iterator<Object>)list.iterator();
                                            break Label_0216;
                                        }
                                        id2 = i;
                                        break Label_0263;
                                    }
                                    final CalendarPeriodRoom next = iterator.next();
                                    list.add(next);
                                    continue;
                                }
                                continue;
                            }
                            list2.add(kotlin.coroutines.jvm.internal.b.g(id2));
                            continue Label_0216;
                        }
                    }
                }
                final c h3 = this.H;
                final CalendarPeriod j = this.I;
                final long m = this.K;
                final long l2 = this.L;
                this.G = 3;
                if ((o = h3.k(j, m, l2, false, this)) == h) {
                    return h;
                }
                return o;
            }
        }, (d)d);
    }
}
