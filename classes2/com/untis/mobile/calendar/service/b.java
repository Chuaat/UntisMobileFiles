// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.service;

import java.util.Iterator;
import com.untis.mobile.calendar.network.model.CalendarTeachingContentsResponse;
import com.untis.mobile.persistence.models.classbook.info.PeriodInfo;
import com.untis.mobile.calendar.network.model.period.room.CalendarPeriodRoomResponse;
import com.untis.mobile.persistence.models.classbook.lessontopic.LessonTopic;
import com.untis.mobile.calendar.persistence.model.common.CalendarPeriodType;
import com.untis.mobile.calendar.persistence.model.entity.CalendarPeriodSubject;
import com.untis.mobile.calendar.persistence.model.common.CalendarPeriodSubType;
import com.untis.mobile.calendar.persistence.model.common.CalendarPeriodStatus;
import com.untis.mobile.calendar.persistence.model.common.CalendarOriginalPeriod;
import com.untis.mobile.calendar.persistence.model.common.CalendarMessengerChannel;
import com.untis.mobile.calendar.persistence.model.common.CalendarPeriodLesson;
import com.untis.mobile.calendar.persistence.model.common.CalendarPeriodExam;
import com.untis.mobile.calendar.persistence.model.common.CalendarBooking;
import com.untis.mobile.utils.g0;
import com.untis.mobile.UntisMobileApplication;
import com.untis.mobile.calendar.persistence.model.entity.CalendarPeriodVideoCall;
import com.untis.mobile.persistence.models.timetable.period.Period;
import java.util.Collection;
import kotlin.collections.v;
import com.untis.mobile.persistence.models.timetable.period.PeriodElement;
import com.untis.mobile.persistence.models.EntityType;
import java.util.List;
import kotlinx.coroutines.u0;
import kotlin.coroutines.g;
import kotlinx.coroutines.h;
import kotlinx.coroutines.b2;
import kotlin.c1;
import kotlin.j2;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlinx.coroutines.r0;
import n6.p;
import kotlinx.coroutines.i1;
import com.untis.mobile.calendar.persistence.model.CalendarPeriod;
import kotlin.coroutines.d;
import com.untis.mobile.calendar.network.c;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.profile.Profile;
import android.content.Context;
import com.untis.mobile.services.timetable.placeholder.k;
import com.untis.mobile.calendar.persistence.database.CalendarDatabase;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010A\u001a\u00020@\u0012\u0006\u0010C\u001a\u00020B¢\u0006\u0004\bD\u0010EJ\u001d\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0006J'\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ9\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0002H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0002H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001aJ+\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010!\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001fH\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b!\u0010\"J#\u0010$\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u001fH\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b$\u0010\"J#\u0010&\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u001fH\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b&\u0010\"J#\u0010)\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010(\u001a\u00020'H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b)\u0010*J\u0013\u0010,\u001a\u00020+H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b,\u0010-J\u001b\u0010/\u001a\u00020.2\u0006\u0010\u0017\u001a\u00020\u0004H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b/\u00100R\u0016\u00103\u001a\u0002018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00102R\u0016\u00106\u001a\u0002048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u00105R\u0016\u00109\u001a\u0002078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u00108R\u0016\u0010<\u001a\u00020:8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010;R\u0016\u0010?\u001a\u00020=8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010>\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006F" }, d2 = { "Lcom/untis/mobile/calendar/service/b;", "Lcom/untis/mobile/calendar/service/a;", "", "id", "Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;", "h", "(JLkotlin/coroutines/d;)Ljava/lang/Object;", "a", "", "ids", "b", "(Ljava/util/List;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "entityId", "Lorg/joda/time/c;", "start", "end", "n", "(Lcom/untis/mobile/persistence/models/EntityType;JLorg/joda/time/c;Lorg/joda/time/c;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/calendar/network/model/period/room/CalendarPeriodRoomResponse;", "g", "(Lorg/joda/time/c;Lorg/joda/time/c;Lkotlin/coroutines/d;)Ljava/lang/Object;", "period", "roomId", "k", "(Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;JLkotlin/coroutines/d;)Ljava/lang/Object;", "c", "originalRoomId", "l", "(Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;JJLkotlin/coroutines/d;)Ljava/lang/Object;", "", "notesAll", "i", "(Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "content", "e", "notesTeacher", "m", "Lcom/untis/mobile/calendar/persistence/model/entity/CalendarPeriodVideoCall;", "onlineLessonLink", "d", "(Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;Lcom/untis/mobile/calendar/persistence/model/entity/CalendarPeriodVideoCall;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/j2;", "f", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/calendar/network/model/CalendarTeachingContentsResponse;", "j", "(Lcom/untis/mobile/calendar/persistence/model/CalendarPeriod;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/calendar/network/b;", "Lcom/untis/mobile/calendar/network/b;", "requests", "Lcom/untis/mobile/calendar/persistence/dao/a;", "Lcom/untis/mobile/calendar/persistence/dao/a;", "calendarPeriodDao", "Lcom/untis/mobile/services/classbook/a;", "Lcom/untis/mobile/services/classbook/a;", "classbookService", "Lcom/untis/mobile/services/timetable/placeholder/k;", "Lcom/untis/mobile/services/timetable/placeholder/k;", "timetableService", "Lcom/untis/mobile/calendar/persistence/database/CalendarDatabase;", "Lcom/untis/mobile/calendar/persistence/database/CalendarDatabase;", "database", "Landroid/content/Context;", "context", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "<init>", "(Landroid/content/Context;Lcom/untis/mobile/persistence/models/profile/Profile;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class b implements a
{
    @e
    private final com.untis.mobile.calendar.network.b a;
    @e
    private final CalendarDatabase b;
    @e
    private final com.untis.mobile.calendar.persistence.dao.a c;
    @e
    private final com.untis.mobile.services.classbook.a d;
    @e
    private final k e;
    
    public b(@e final Context context, @e final Profile profile) {
        k0.p(context, "context");
        k0.p(profile, "profile");
        this.a = new c(profile);
        final CalendarDatabase a = CalendarDatabase.p.a(context, profile.getUniqueId());
        this.b = a;
        this.c = a.K();
        this.d = profile.getClassBookService();
        this.e = profile.getTimeTableService();
    }
    
    public static final /* synthetic */ com.untis.mobile.calendar.persistence.dao.a o(final b b) {
        return b.c;
    }
    
    public static final /* synthetic */ com.untis.mobile.services.classbook.a p(final b b) {
        return b.d;
    }
    
    public static final /* synthetic */ com.untis.mobile.calendar.network.b q(final b b) {
        return b.a;
    }
    
    public static final /* synthetic */ k r(final b b) {
        return b.e;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object a(final long n, @e final d<? super CalendarPeriod> d) throws Exception {
        return h.i((g)i1.c(), (p)new p<r0, d<? super CalendarPeriod>, Object>() {
            int G;
            final /* synthetic */ b H;
            final /* synthetic */ long I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super CalendarPeriod>, Object>() {
                    int G;
                    final /* synthetic */ b H = this.H;
                    final /* synthetic */ long I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super CalendarPeriod> d) {
                return ((b$d)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object c) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                if (g != 0) {
                    if (g != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1.n(c);
                }
                else {
                    c1.n(c);
                    final com.untis.mobile.calendar.network.b q = com.untis.mobile.calendar.service.b.q(this.H);
                    final long i = this.I;
                    this.G = 1;
                    if ((c = com.untis.mobile.calendar.network.b.a.c(q, i, false, this, 2, null)) == h) {
                        return h;
                    }
                }
                final CalendarPeriod calendarPeriod = (CalendarPeriod)c;
                kotlinx.coroutines.h.f((r0)b2.G, (g)null, (u0)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ b H;
                    final /* synthetic */ CalendarPeriod I;
                    
                    @org.jetbrains.annotations.e
                    @Override
                    public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                        return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                            int G;
                            final /* synthetic */ b H = this.H;
                            final /* synthetic */ CalendarPeriod I = this.I;
                        };
                    }
                    
                    @org.jetbrains.annotations.f
                    @Override
                    public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                        return ((b$d$a)this.create(r0, d)).invokeSuspend(j2.a);
                    }
                    
                    @org.jetbrains.annotations.f
                    public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                        kotlin.coroutines.intrinsics.b.h();
                        if (this.G == 0) {
                            c1.n(o);
                            com.untis.mobile.calendar.service.b.o(this.H).f(this.I);
                            return j2.a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }, 3, (Object)null);
                return calendarPeriod;
            }
        }, (d)d);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object b(@e final List<Long> list, @e final d<? super List<CalendarPeriod>> d) throws Exception {
        return h.i((g)i1.c(), (p)new p<r0, d<? super List<? extends CalendarPeriod>>, Object>() {
            int G;
            final /* synthetic */ b H;
            final /* synthetic */ List<Long> I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super List<? extends CalendarPeriod>>, Object>() {
                    int G;
                    final /* synthetic */ b H = this.H;
                    final /* synthetic */ List<Long> I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super List<CalendarPeriod>> d) {
                return ((b$h)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.G == 0) {
                    c1.n(o);
                    return com.untis.mobile.calendar.service.b.o(this.H).d(this.I);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }, (d)d);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object c(@e final CalendarPeriod calendarPeriod, final long n, @e final d<? super CalendarPeriod> d) throws Exception {
        return h.i((g)i1.c(), (p)new p<r0, d<? super CalendarPeriod>, Object>(null) {
            int G;
            final /* synthetic */ b H;
            final /* synthetic */ CalendarPeriod I;
            final /* synthetic */ long J;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super CalendarPeriod>, Object>(d) {
                    int G;
                    final /* synthetic */ b H = this.H;
                    final /* synthetic */ CalendarPeriod I = this.I;
                    final /* synthetic */ long J = this.J;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super CalendarPeriod> d) {
                return ((b$a)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object a) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                if (g != 0) {
                    if (g != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1.n(a);
                }
                else {
                    c1.n(a);
                    final com.untis.mobile.calendar.network.b q = com.untis.mobile.calendar.service.b.q(this.H);
                    final CalendarPeriod i = this.I;
                    final long j = this.J;
                    this.G = 1;
                    if ((a = com.untis.mobile.calendar.network.b.a.a(q, i, j, false, this, 4, null)) == h) {
                        return h;
                    }
                }
                final CalendarPeriod calendarPeriod = (CalendarPeriod)a;
                kotlinx.coroutines.h.f((r0)b2.G, (g)null, (u0)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>(this.J) {
                    int G;
                    final /* synthetic */ b H;
                    final /* synthetic */ CalendarPeriod I;
                    final /* synthetic */ CalendarPeriod J;
                    final /* synthetic */ long K;
                    
                    @org.jetbrains.annotations.e
                    @Override
                    public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                        return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                            int G;
                            final /* synthetic */ b H = this.H;
                            final /* synthetic */ CalendarPeriod I = this.I;
                            final /* synthetic */ CalendarPeriod J = this.J;
                            final /* synthetic */ long K = this.K;
                        };
                    }
                    
                    @org.jetbrains.annotations.f
                    @Override
                    public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                        return ((b$a$a)this.create(r0, d)).invokeSuspend(j2.a);
                    }
                    
                    @org.jetbrains.annotations.f
                    public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                        final Object h = kotlin.coroutines.intrinsics.b.h();
                        final int g = this.G;
                        if (g != 0) {
                            if (g != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            c1.n(o);
                        }
                        else {
                            c1.n(o);
                            com.untis.mobile.calendar.service.b.o(this.H).f(this.I);
                            final Period l = com.untis.mobile.calendar.service.b.r(this.H).l(this.J.getId());
                            if (l != null) {
                                l.setRooms(v.r4(l.getRooms(), new PeriodElement(EntityType.ROOM, 0L, this.K)));
                                final k r = com.untis.mobile.calendar.service.b.r(this.H);
                                this.G = 1;
                                if (r.q(l, this) == h) {
                                    return h;
                                }
                            }
                        }
                        return j2.a;
                    }
                }, 3, (Object)null);
                return calendarPeriod;
            }
        }, (d)d);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object d(@e final CalendarPeriod calendarPeriod, @e final CalendarPeriodVideoCall calendarPeriodVideoCall, @e final d<? super CalendarPeriod> d) throws Exception {
        return h.i((g)i1.c(), (p)new p<r0, d<? super CalendarPeriod>, Object>(null) {
            int G;
            final /* synthetic */ b H;
            final /* synthetic */ CalendarPeriod I;
            final /* synthetic */ CalendarPeriodVideoCall J;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super CalendarPeriod>, Object>(d) {
                    int G;
                    final /* synthetic */ b H = this.H;
                    final /* synthetic */ CalendarPeriod I = this.I;
                    final /* synthetic */ CalendarPeriodVideoCall J = this.J;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super CalendarPeriod> d) {
                return ((b$m)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object k) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                if (g != 0) {
                    if (g != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1.n(k);
                }
                else {
                    c1.n(k);
                    final com.untis.mobile.calendar.network.b q = com.untis.mobile.calendar.service.b.q(this.H);
                    final CalendarPeriod i = this.I;
                    final CalendarPeriodVideoCall j = this.J;
                    this.G = 1;
                    if ((k = com.untis.mobile.calendar.network.b.a.k(q, i, j, false, this, 4, null)) == h) {
                        return h;
                    }
                }
                final CalendarPeriod calendarPeriod = (CalendarPeriod)k;
                kotlinx.coroutines.h.f((r0)b2.G, (g)null, (u0)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>(this.J) {
                    int G;
                    final /* synthetic */ b H;
                    final /* synthetic */ CalendarPeriod I;
                    final /* synthetic */ CalendarPeriod J;
                    final /* synthetic */ CalendarPeriodVideoCall K;
                    
                    @org.jetbrains.annotations.e
                    @Override
                    public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                        return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                            int G;
                            final /* synthetic */ b H = this.H;
                            final /* synthetic */ CalendarPeriod I = this.I;
                            final /* synthetic */ CalendarPeriod J = this.J;
                            final /* synthetic */ CalendarPeriodVideoCall K = this.K;
                        };
                    }
                    
                    @org.jetbrains.annotations.f
                    @Override
                    public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                        return ((b$m$a)this.create(r0, d)).invokeSuspend(j2.a);
                    }
                    
                    @org.jetbrains.annotations.f
                    public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                        final Object h = kotlin.coroutines.intrinsics.b.h();
                        final int g = this.G;
                        if (g != 0) {
                            if (g != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            c1.n(o);
                        }
                        else {
                            c1.n(o);
                            com.untis.mobile.calendar.service.b.o(this.H).f(this.I);
                            final Period l = com.untis.mobile.calendar.service.b.r(this.H).l(this.J.getId());
                            if (l != null) {
                                l.setOnlinePeriod(this.K.isActive());
                                final k r = com.untis.mobile.calendar.service.b.r(this.H);
                                this.G = 1;
                                if (r.q(l, this) == h) {
                                    return h;
                                }
                            }
                        }
                        return j2.a;
                    }
                }, 3, (Object)null);
                return calendarPeriod;
            }
        }, (d)d);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object e(@e final CalendarPeriod calendarPeriod, @e final String s, @e final d<? super CalendarPeriod> d) throws Exception {
        return h.i((g)i1.c(), (p)new p<r0, d<? super CalendarPeriod>, Object>(null) {
            boolean G;
            int H;
            final /* synthetic */ b I;
            final /* synthetic */ CalendarPeriod J;
            final /* synthetic */ String K;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super CalendarPeriod>, Object>(d) {
                    boolean G;
                    int H;
                    final /* synthetic */ b I = this.I;
                    final /* synthetic */ CalendarPeriod J = this.J;
                    final /* synthetic */ String K = this.K;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super CalendarPeriod> d) {
                return ((b$j)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object h) {
                final Object h2 = kotlin.coroutines.intrinsics.b.h();
                final int h3 = this.H;
                boolean g = false;
                CalendarPeriod copy$default = null;
                Label_0170: {
                    if (h3 != 0) {
                        if (h3 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        g = this.G;
                        c1.n(h);
                    }
                    else {
                        c1.n(h);
                        g = g0.a((Context)UntisMobileApplication.I.b());
                        if (!g) {
                            copy$default = CalendarPeriod.copy$default(this.J, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, this.K, null, null, null, null, null, null, 2130706431, null);
                            break Label_0170;
                        }
                        final com.untis.mobile.calendar.network.b q = com.untis.mobile.calendar.service.b.q(this.I);
                        final CalendarPeriod j = this.J;
                        final String k = this.K;
                        this.G = g;
                        this.H = 1;
                        if ((h = com.untis.mobile.calendar.network.b.a.h(q, j, k, false, this, 4, null)) == h2) {
                            return h2;
                        }
                    }
                    copy$default = (CalendarPeriod)h;
                }
                h.f((r0)b2.G, (g)null, (u0)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>(this.K) {
                    int G;
                    final /* synthetic */ b H;
                    final /* synthetic */ CalendarPeriod I;
                    final /* synthetic */ CalendarPeriod J;
                    final /* synthetic */ String K;
                    final /* synthetic */ boolean L;
                    
                    @org.jetbrains.annotations.e
                    @Override
                    public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                        return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                            int G;
                            final /* synthetic */ b H = this.H;
                            final /* synthetic */ CalendarPeriod I = this.I;
                            final /* synthetic */ CalendarPeriod J = this.J;
                            final /* synthetic */ String K = this.K;
                            final /* synthetic */ boolean L = this.L;
                        };
                    }
                    
                    @org.jetbrains.annotations.f
                    @Override
                    public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                        return ((b$j$a)this.create(r0, d)).invokeSuspend(j2.a);
                    }
                    
                    @org.jetbrains.annotations.f
                    public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                        final Object h = kotlin.coroutines.intrinsics.b.h();
                        final int g = this.G;
                        if (g != 0) {
                            if (g != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            c1.n(o);
                        }
                        else {
                            c1.n(o);
                            com.untis.mobile.calendar.service.b.o(this.H).f(this.I);
                            LessonTopic d;
                            if ((d = com.untis.mobile.calendar.service.b.p(this.H).D(this.J.getId())) == null) {
                                d = new LessonTopic(this.J.getId(), this.K, this.I.getStart(), this.I.getEnd(), v.E(), this.L);
                            }
                            d.setText(this.K);
                            d.setSynced(this.L);
                            final com.untis.mobile.services.classbook.a p = com.untis.mobile.calendar.service.b.p(this.H);
                            this.G = 1;
                            if (p.Q(d, this) == h) {
                                return h;
                            }
                        }
                        return j2.a;
                    }
                }, 3, (Object)null);
                return copy$default;
            }
        }, (d)d);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object f(@e final d<? super j2> d) throws Exception {
        final Object i = h.i((g)i1.c(), (p)new p<r0, d<? super j2>, Object>() {
            int G;
            final /* synthetic */ b H;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ b H = this.H;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((b$b)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.G == 0) {
                    c1.n(o);
                    final com.untis.mobile.calendar.persistence.dao.a o2 = com.untis.mobile.calendar.service.b.o(this.H);
                    final org.joda.time.c f0 = com.untis.mobile.utils.v.a.g().Q(2).F0();
                    k0.o(f0, "Date.today().minusWeeks(2).toDateTimeAtStartOfDay()");
                    o2.b(f0);
                    return j2.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }, (d)d);
        if (i == kotlin.coroutines.intrinsics.b.h()) {
            return i;
        }
        return j2.a;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object g(@e final org.joda.time.c c, @e final org.joda.time.c c2, @e final d<? super CalendarPeriodRoomResponse> d) throws Exception {
        return h.i((g)i1.c(), (p)new p<r0, d<? super CalendarPeriodRoomResponse>, Object>(null) {
            int G;
            final /* synthetic */ b H;
            final /* synthetic */ org.joda.time.c I;
            final /* synthetic */ org.joda.time.c J;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super CalendarPeriodRoomResponse>, Object>(d) {
                    int G;
                    final /* synthetic */ b H = this.H;
                    final /* synthetic */ org.joda.time.c I = this.I;
                    final /* synthetic */ org.joda.time.c J = this.J;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super CalendarPeriodRoomResponse> d) {
                return ((b$e)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object d) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                if (g != 0) {
                    if (g != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1.n(d);
                }
                else {
                    c1.n(d);
                    final com.untis.mobile.calendar.network.b q = com.untis.mobile.calendar.service.b.q(this.H);
                    final org.joda.time.c i = this.I;
                    final org.joda.time.c j = this.J;
                    this.G = 1;
                    if ((d = com.untis.mobile.calendar.network.b.a.d(q, i, j, false, this, 4, null)) == h) {
                        return h;
                    }
                }
                return d;
            }
        }, (d)d);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object h(final long n, @e final d<? super CalendarPeriod> d) throws Exception {
        return h.i((g)i1.c(), (p)new p<r0, d<? super CalendarPeriod>, Object>() {
            int G;
            final /* synthetic */ b H;
            final /* synthetic */ long I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super CalendarPeriod>, Object>() {
                    int G;
                    final /* synthetic */ b H = this.H;
                    final /* synthetic */ long I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super CalendarPeriod> d) {
                return ((b$g)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.G == 0) {
                    c1.n(o);
                    return com.untis.mobile.calendar.service.b.o(this.H).e(this.I);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }, (d)d);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object i(@e final CalendarPeriod calendarPeriod, @e final String s, @e final d<? super CalendarPeriod> d) throws Exception {
        return h.i((g)i1.c(), (p)new p<r0, d<? super CalendarPeriod>, Object>(null) {
            boolean G;
            int H;
            final /* synthetic */ b I;
            final /* synthetic */ CalendarPeriod J;
            final /* synthetic */ String K;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super CalendarPeriod>, Object>(d) {
                    boolean G;
                    int H;
                    final /* synthetic */ b I = this.I;
                    final /* synthetic */ CalendarPeriod J = this.J;
                    final /* synthetic */ String K = this.K;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super CalendarPeriod> d) {
                return ((b$k)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object i) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int h2 = this.H;
                boolean g = false;
                CalendarPeriod copy$default = null;
                Label_0170: {
                    if (h2 != 0) {
                        if (h2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        g = this.G;
                        c1.n(i);
                    }
                    else {
                        c1.n(i);
                        g = g0.a((Context)UntisMobileApplication.I.b());
                        if (!g) {
                            copy$default = CalendarPeriod.copy$default(this.J, 0L, null, null, null, null, null, null, null, null, null, this.K, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2147482623, null);
                            break Label_0170;
                        }
                        final com.untis.mobile.calendar.network.b q = com.untis.mobile.calendar.service.b.q(this.I);
                        final CalendarPeriod j = this.J;
                        final String k = this.K;
                        this.G = g;
                        this.H = 1;
                        if ((i = com.untis.mobile.calendar.network.b.a.i(q, j, k, false, this, 4, null)) == h) {
                            return h;
                        }
                    }
                    copy$default = (CalendarPeriod)i;
                }
                kotlinx.coroutines.h.f((r0)b2.G, (g)null, (u0)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>(this.K) {
                    int G;
                    final /* synthetic */ b H;
                    final /* synthetic */ CalendarPeriod I;
                    final /* synthetic */ CalendarPeriod J;
                    final /* synthetic */ String K;
                    final /* synthetic */ boolean L;
                    
                    @org.jetbrains.annotations.e
                    @Override
                    public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                        return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                            int G;
                            final /* synthetic */ b H = this.H;
                            final /* synthetic */ CalendarPeriod I = this.I;
                            final /* synthetic */ CalendarPeriod J = this.J;
                            final /* synthetic */ String K = this.K;
                            final /* synthetic */ boolean L = this.L;
                        };
                    }
                    
                    @org.jetbrains.annotations.f
                    @Override
                    public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                        return ((b$k$a)this.create(r0, d)).invokeSuspend(j2.a);
                    }
                    
                    @org.jetbrains.annotations.f
                    public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                        final Object h = kotlin.coroutines.intrinsics.b.h();
                        final int g = this.G;
                        if (g != 0) {
                            if (g != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            c1.n(o);
                        }
                        else {
                            c1.n(o);
                            com.untis.mobile.calendar.service.b.o(this.H).f(this.I);
                            final PeriodInfo d = com.untis.mobile.calendar.service.b.p(this.H).d(this.J.getId());
                            if (d != null) {
                                d.setInfo(this.K);
                                d.setSync(this.L);
                                final com.untis.mobile.services.classbook.a p = com.untis.mobile.calendar.service.b.p(this.H);
                                this.G = 1;
                                if (p.R(d, this) == h) {
                                    return h;
                                }
                            }
                        }
                        return j2.a;
                    }
                }, 3, (Object)null);
                return copy$default;
            }
        }, (d)d);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object j(@e final CalendarPeriod calendarPeriod, @e final d<? super CalendarTeachingContentsResponse> d) throws Exception {
        return com.untis.mobile.calendar.network.b.a.f(this.a, calendarPeriod, false, d, 2, null);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object k(@e final CalendarPeriod calendarPeriod, final long n, @e final d<? super CalendarPeriod> d) throws Exception {
        return h.i((g)i1.c(), (p)new p<r0, d<? super CalendarPeriod>, Object>(null) {
            int G;
            final /* synthetic */ b H;
            final /* synthetic */ CalendarPeriod I;
            final /* synthetic */ long J;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super CalendarPeriod>, Object>(d) {
                    int G;
                    final /* synthetic */ b H = this.H;
                    final /* synthetic */ CalendarPeriod I = this.I;
                    final /* synthetic */ long J = this.J;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super CalendarPeriod> d) {
                return ((b$c)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object b) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                if (g != 0) {
                    if (g != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1.n(b);
                }
                else {
                    c1.n(b);
                    final com.untis.mobile.calendar.network.b q = b.q(this.H);
                    final CalendarPeriod i = this.I;
                    final long j = this.J;
                    this.G = 1;
                    if ((b = b.a.b(q, i, j, false, this, 4, null)) == h) {
                        return h;
                    }
                }
                final CalendarPeriod calendarPeriod = (CalendarPeriod)b;
                kotlinx.coroutines.h.f((r0)b2.G, (g)null, (u0)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>(this.J) {
                    int G;
                    final /* synthetic */ b H;
                    final /* synthetic */ CalendarPeriod I;
                    final /* synthetic */ CalendarPeriod J;
                    final /* synthetic */ long K;
                    
                    @org.jetbrains.annotations.e
                    @Override
                    public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                        return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                            int G;
                            final /* synthetic */ b H = this.H;
                            final /* synthetic */ CalendarPeriod I = this.I;
                            final /* synthetic */ CalendarPeriod J = this.J;
                            final /* synthetic */ long K = this.K;
                        };
                    }
                    
                    @org.jetbrains.annotations.f
                    @Override
                    public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                        return ((b$c$a)this.create(r0, d)).invokeSuspend(j2.a);
                    }
                    
                    @org.jetbrains.annotations.f
                    public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                        final Object h = kotlin.coroutines.intrinsics.b.h();
                        final int g = this.G;
                        if (g != 0) {
                            if (g != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            c1.n(o);
                        }
                        else {
                            c1.n(o);
                            com.untis.mobile.calendar.service.b.o(this.H).f(this.I);
                            final Period l = com.untis.mobile.calendar.service.b.r(this.H).l(this.J.getId());
                            if (l != null) {
                                final List<PeriodElement> rooms = l.getRooms();
                                final long k = this.K;
                                final Iterator<PeriodElement> iterator = rooms.iterator();
                                int n = 0;
                                while (true) {
                                    while (iterator.hasNext()) {
                                        if (kotlin.coroutines.jvm.internal.b.a(iterator.next().getCurrentId() == k)) {
                                            final List<Object> l2 = v.L5((Collection<?>)l.getRooms());
                                            if (n >= 0) {
                                                l2.remove(n);
                                            }
                                            l.setRooms((List<PeriodElement>)l2);
                                            final k r = com.untis.mobile.calendar.service.b.r(this.H);
                                            this.G = 1;
                                            if (r.q(l, this) == h) {
                                                return h;
                                            }
                                            return j2.a;
                                        }
                                        else {
                                            ++n;
                                        }
                                    }
                                    n = -1;
                                    continue;
                                }
                            }
                        }
                        return j2.a;
                    }
                }, 3, (Object)null);
                return calendarPeriod;
            }
        }, (d)d);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object l(@e final CalendarPeriod calendarPeriod, final long n, final long n2, @e final d<? super CalendarPeriod> d) throws Exception {
        return h.i((g)i1.c(), (p)new p<r0, d<? super CalendarPeriod>, Object>(n2) {
            int G;
            final /* synthetic */ b H;
            final /* synthetic */ CalendarPeriod I;
            final /* synthetic */ long J;
            final /* synthetic */ long K;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super CalendarPeriod>, Object>() {
                    int G;
                    final /* synthetic */ b H = this.H;
                    final /* synthetic */ CalendarPeriod I = this.I;
                    final /* synthetic */ long J = this.J;
                    final /* synthetic */ long K = this.K;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super CalendarPeriod> d) {
                return ((b$i)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object g) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g2 = this.G;
                if (g2 != 0) {
                    if (g2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1.n(g);
                }
                else {
                    c1.n(g);
                    final com.untis.mobile.calendar.network.b q = com.untis.mobile.calendar.service.b.q(this.H);
                    final CalendarPeriod i = this.I;
                    final long j = this.J;
                    final long k = this.K;
                    this.G = 1;
                    if ((g = com.untis.mobile.calendar.network.b.a.g(q, i, j, k, false, this, 8, null)) == h) {
                        return h;
                    }
                }
                final CalendarPeriod calendarPeriod = (CalendarPeriod)g;
                kotlinx.coroutines.h.f((r0)b2.G, (g)null, (u0)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>(this.J) {
                    int G;
                    final /* synthetic */ b H;
                    final /* synthetic */ CalendarPeriod I;
                    final /* synthetic */ CalendarPeriod J;
                    final /* synthetic */ long K;
                    final /* synthetic */ long L;
                    
                    @org.jetbrains.annotations.e
                    @Override
                    public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                        return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                            int G;
                            final /* synthetic */ b H = this.H;
                            final /* synthetic */ CalendarPeriod I = this.I;
                            final /* synthetic */ CalendarPeriod J = this.J;
                            final /* synthetic */ long K = this.K;
                            final /* synthetic */ long L = this.L;
                        };
                    }
                    
                    @org.jetbrains.annotations.f
                    @Override
                    public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                        return ((b$i$a)this.create(r0, d)).invokeSuspend(j2.a);
                    }
                    
                    @org.jetbrains.annotations.f
                    public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                        final Object h = kotlin.coroutines.intrinsics.b.h();
                        final int g = this.G;
                        if (g != 0) {
                            if (g != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            c1.n(o);
                        }
                        else {
                            c1.n(o);
                            com.untis.mobile.calendar.service.b.o(this.H).f(this.I);
                            final Period l = com.untis.mobile.calendar.service.b.r(this.H).l(this.J.getId());
                            if (l != null) {
                                final List<PeriodElement> rooms = l.getRooms();
                                final long k = this.K;
                                final long i = this.L;
                                for (final PeriodElement periodElement : rooms) {
                                    if (periodElement.getOriginalId() == k) {
                                        periodElement.setCurrentId(i);
                                    }
                                }
                                final k r = com.untis.mobile.calendar.service.b.r(this.H);
                                this.G = 1;
                                if (r.q(l, this) == h) {
                                    return h;
                                }
                            }
                        }
                        return j2.a;
                    }
                }, 3, (Object)null);
                return calendarPeriod;
            }
        }, (d)d);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object m(@e final CalendarPeriod calendarPeriod, @e final String s, @e final d<? super CalendarPeriod> d) throws Exception {
        return h.i((g)i1.c(), (p)new p<r0, d<? super CalendarPeriod>, Object>(null) {
            int G;
            final /* synthetic */ b H;
            final /* synthetic */ CalendarPeriod I;
            final /* synthetic */ String J;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super CalendarPeriod>, Object>(d) {
                    int G;
                    final /* synthetic */ b H = this.H;
                    final /* synthetic */ CalendarPeriod I = this.I;
                    final /* synthetic */ String J = this.J;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super CalendarPeriod> d) {
                return ((b$l)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object j) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                if (g != 0) {
                    if (g != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1.n(j);
                }
                else {
                    c1.n(j);
                    final com.untis.mobile.calendar.network.b q = com.untis.mobile.calendar.service.b.q(this.H);
                    final CalendarPeriod i = this.I;
                    final String k = this.J;
                    this.G = 1;
                    if ((j = com.untis.mobile.calendar.network.b.a.j(q, i, k, false, this, 4, null)) == h) {
                        return h;
                    }
                }
                final CalendarPeriod calendarPeriod = (CalendarPeriod)j;
                kotlinx.coroutines.h.f((r0)b2.G, (g)null, (u0)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ b H;
                    final /* synthetic */ CalendarPeriod I;
                    
                    @org.jetbrains.annotations.e
                    @Override
                    public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                        return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                            int G;
                            final /* synthetic */ b H = this.H;
                            final /* synthetic */ CalendarPeriod I = this.I;
                        };
                    }
                    
                    @org.jetbrains.annotations.f
                    @Override
                    public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                        return ((b$l$a)this.create(r0, d)).invokeSuspend(j2.a);
                    }
                    
                    @org.jetbrains.annotations.f
                    public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                        kotlin.coroutines.intrinsics.b.h();
                        if (this.G == 0) {
                            c1.n(o);
                            com.untis.mobile.calendar.service.b.o(this.H).f(this.I);
                            return j2.a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }, 3, (Object)null);
                return calendarPeriod;
            }
        }, (d)d);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object n(@e final EntityType entityType, final long n, @e final org.joda.time.c c, @e final org.joda.time.c c2, @e final d<? super List<CalendarPeriod>> d) throws Exception {
        return h.i((g)i1.c(), (p)new p<r0, d<? super List<? extends CalendarPeriod>>, Object>(c) {
            int G;
            final /* synthetic */ b H;
            final /* synthetic */ EntityType I;
            final /* synthetic */ long J;
            final /* synthetic */ org.joda.time.c K;
            final /* synthetic */ org.joda.time.c L;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super List<? extends CalendarPeriod>>, Object>() {
                    int G;
                    final /* synthetic */ b H = this.H;
                    final /* synthetic */ EntityType I = this.I;
                    final /* synthetic */ long J = this.J;
                    final /* synthetic */ org.joda.time.c K = this.K;
                    final /* synthetic */ org.joda.time.c L = this.L;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super List<CalendarPeriod>> d) {
                return ((b$f)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object e) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                if (g != 0) {
                    if (g != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1.n(e);
                }
                else {
                    c1.n(e);
                    final com.untis.mobile.calendar.network.b q = com.untis.mobile.calendar.service.b.q(this.H);
                    final EntityType i = this.I;
                    final long j = this.J;
                    final org.joda.time.c k = this.K;
                    final org.joda.time.c l = this.L;
                    this.G = 1;
                    if ((e = com.untis.mobile.calendar.network.b.a.e(q, i, j, k, l, false, this, 16, null)) == h) {
                        return h;
                    }
                }
                final List list = (List)e;
                kotlinx.coroutines.h.f((r0)b2.G, (g)null, (u0)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ b H;
                    final /* synthetic */ List<CalendarPeriod> I;
                    
                    @org.jetbrains.annotations.e
                    @Override
                    public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                        return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                            int G;
                            final /* synthetic */ b H = this.H;
                            final /* synthetic */ List<CalendarPeriod> I = this.I;
                        };
                    }
                    
                    @org.jetbrains.annotations.f
                    @Override
                    public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                        return ((b$f$a)this.create(r0, d)).invokeSuspend(j2.a);
                    }
                    
                    @org.jetbrains.annotations.f
                    public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                        kotlin.coroutines.intrinsics.b.h();
                        if (this.G == 0) {
                            c1.n(o);
                            com.untis.mobile.calendar.service.b.o(this.H).c(this.I);
                            return j2.a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }, 3, (Object)null);
                return list;
            }
        }, (d)d);
    }
}
