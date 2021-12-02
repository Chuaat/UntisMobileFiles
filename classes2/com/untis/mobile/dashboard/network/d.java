// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.network;

import com.untis.mobile.api.dto.GetExamsRequest;
import com.untis.mobile.dashboard.persistence.model.event.exam.DashboardExam;
import java.util.Iterator;
import com.untis.mobile.api.dto.GetHomeWorkRequest;
import java.util.ArrayList;
import com.untis.mobile.api.common.timetable.UMLesson;
import kotlin.collections.v;
import com.untis.mobile.api.common.JsonRpcErrorType;
import com.untis.mobile.dashboard.persistence.model.event.homework.DashboardHomework;
import com.untis.mobile.persistence.models.EntityType;
import x3.i;
import java.util.List;
import x3.m;
import com.untis.mobile.dashboard.persistence.model.studentabsence.DashboardStudentAbsence;
import com.untis.mobile.api.dto.SubmitOfficeHourRegistrationRequest;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.api.JsonRpcRequestBuilder;
import com.untis.mobile.persistence.models.officehour.OfficeHourRegistration;
import kotlin.jvm.internal.w;
import com.untis.mobile.persistence.models.masterdata.Teacher;
import x3.k;
import com.untis.mobile.dashboard.persistence.model.contacthour.DashboardContactHour;
import org.joda.time.t;
import com.untis.mobile.api.error.JsonRpcError;
import kotlinx.coroutines.h;
import com.untis.mobile.api.common.JsonRpcRequest;
import com.untis.mobile.api.common.JsonRpcResponse;
import n6.l;
import kotlin.c1;
import kotlin.j2;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlinx.coroutines.r0;
import n6.p;
import kotlinx.coroutines.i1;
import x3.g;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u00108\u001a\u000207¢\u0006\u0004\b9\u0010:J#\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J9\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0005H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J9\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u001d2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0005H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\"\u0010 J)\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u001d2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0003H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b$\u0010%J\u001b\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020#H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b(\u0010)J\u0013\u0010+\u001a\u00020*H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b+\u0010,J+\u0010.\u001a\u00020-2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0003H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b.\u0010/J#\u00103\u001a\u0002022\u0006\u00100\u001a\u00020\u00052\u0006\u00101\u001a\u00020\u0005H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b3\u0010\u000eR\u0016\u00106\u001a\u0002048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00105\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006;" }, d2 = { "Lcom/untis/mobile/dashboard/network/d;", "Lcom/untis/mobile/dashboard/network/a;", "Lcom/untis/mobile/dashboard/network/c;", "Lorg/joda/time/t;", "start", "", "klassenId", "Lx3/d;", "b", "(Lorg/joda/time/t;JLkotlin/coroutines/d;)Ljava/lang/Object;", "contactHourId", "teacherId", "Lx3/c;", "f", "(JJLkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/dashboard/persistence/model/contacthour/DashboardContactHour;", "contactHour", "", "position", "Lx3/k;", "d", "(Lcom/untis/mobile/dashboard/persistence/model/contacthour/DashboardContactHour;ILkotlin/coroutines/d;)Ljava/lang/Object;", "Lx3/a;", "c", "(Lcom/untis/mobile/dashboard/persistence/model/contacthour/DashboardContactHour;Lkotlin/coroutines/d;)Ljava/lang/Object;", "end", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "entityId", "", "Lcom/untis/mobile/dashboard/persistence/model/event/homework/DashboardHomework;", "i", "(Lorg/joda/time/t;Lorg/joda/time/t;Lcom/untis/mobile/persistence/models/EntityType;JLkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/dashboard/persistence/model/event/exam/DashboardExam;", "k", "Lcom/untis/mobile/dashboard/persistence/model/studentabsence/DashboardStudentAbsence;", "g", "(Lorg/joda/time/t;Lorg/joda/time/t;Lkotlin/coroutines/d;)Ljava/lang/Object;", "studentAbsence", "Lx3/m;", "e", "(Lcom/untis/mobile/dashboard/persistence/model/studentabsence/DashboardStudentAbsence;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lx3/g;", "a", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lx3/b;", "j", "(JLorg/joda/time/t;Lorg/joda/time/t;Lkotlin/coroutines/d;)Ljava/lang/Object;", "absenceId", "excuseStatusId", "Lx3/i;", "h", "Lcom/untis/mobile/dashboard/network/b;", "Lcom/untis/mobile/dashboard/network/b;", "api", "", "profileId", "<init>", "(Ljava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class d extends a implements c
{
    @e
    private final com.untis.mobile.dashboard.network.b b;
    
    public d(@e final String s) {
        k0.p(s, "profileId");
        super(s);
        this.b = com.untis.mobile.dashboard.network.b.a.f(this.n());
    }
    
    public static final /* synthetic */ com.untis.mobile.dashboard.network.b q(final d d) {
        return d.b;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object a(@e final kotlin.coroutines.d<? super g> d) throws JsonRpcError {
        return h.i((kotlin.coroutines.g)i1.c(), (p)new p<r0, kotlin.coroutines.d<? super g>, Object>() {
            int G;
            final /* synthetic */ d H;
            
            @org.jetbrains.annotations.e
            @Override
            public final d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final d<?> d) {
                return (d<j2>)new p<r0, d<? super g>, Object>() {
                    int G;
                    final /* synthetic */ d H = this.H;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final d<? super g> d) {
                return ((d$g)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object p) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                if (g != 0) {
                    if (g != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1.n(p);
                }
                else {
                    c1.n(p);
                    timber.log.b.b("fetchParentDay()", new Object[0]);
                    final d h2 = this.H;
                    final l<d<? super JsonRpcResponse<g>>, Object> l = new l<d<? super JsonRpcResponse<g>>, Object>() {
                        int G;
                        final /* synthetic */ d H;
                        
                        @org.jetbrains.annotations.e
                        @Override
                        public final d<j2> create(@org.jetbrains.annotations.e final d<?> d) {
                            return (d<j2>)new l<d<? super JsonRpcResponse<g>>, Object>() {
                                int G;
                                final /* synthetic */ d H = this.H;
                            };
                        }
                        
                        @org.jetbrains.annotations.f
                        @Override
                        public final Object invoke(@org.jetbrains.annotations.f final d<? super JsonRpcResponse<g>> d) {
                            return ((d$g$a)this.create(d)).invokeSuspend(j2.a);
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
                                final com.untis.mobile.dashboard.network.b q = d.q(this.H);
                                final String wuUrl = this.H.n().getWuUrl();
                                final JsonRpcRequest<com.untis.mobile.dashboard.network.parameter.g> a = com.untis.mobile.dashboard.network.parameter.g.G.a(this.H.n());
                                this.G = 1;
                                if ((d = q.d(wuUrl, a, this)) == h) {
                                    return h;
                                }
                            }
                            return d;
                        }
                    };
                    this.G = 1;
                    if ((p = a.p(h2, false, l, this, 1, null)) == h) {
                        return h;
                    }
                }
                return p;
            }
        }, (kotlin.coroutines.d)d);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object b(@e final t t, final long n, @e final kotlin.coroutines.d<? super x3.d> d) throws JsonRpcError {
        return h.i((kotlin.coroutines.g)i1.c(), (p)new p<r0, kotlin.coroutines.d<? super x3.d>, Object>(null) {
            int G;
            final /* synthetic */ org.joda.time.t H;
            final /* synthetic */ long I;
            final /* synthetic */ d J;
            
            @org.jetbrains.annotations.e
            @Override
            public final d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final d<?> d) {
                return (d<j2>)new p<r0, d<? super x3.d>, Object>(d) {
                    int G;
                    final /* synthetic */ org.joda.time.t H = this.H;
                    final /* synthetic */ long I = this.I;
                    final /* synthetic */ d J = this.J;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final d<? super x3.d> d) {
                return ((d$d)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object p) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                if (g != 0) {
                    if (g != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1.n(p);
                }
                else {
                    c1.n(p);
                    final StringBuilder sb = new StringBuilder();
                    sb.append("fetchContactHours(");
                    sb.append(this.H);
                    sb.append(", ");
                    sb.append(this.I);
                    sb.append(')');
                    timber.log.b.b(sb.toString(), new Object[0]);
                    final d j = this.J;
                    final l<d<? super JsonRpcResponse<x3.d>>, Object> l = new l<d<? super JsonRpcResponse<x3.d>>, Object>(null) {
                        int G;
                        final /* synthetic */ d H;
                        final /* synthetic */ org.joda.time.t I;
                        final /* synthetic */ long J;
                        
                        @org.jetbrains.annotations.e
                        @Override
                        public final d<j2> create(@org.jetbrains.annotations.e final d<?> d) {
                            return (d<j2>)new l<d<? super JsonRpcResponse<x3.d>>, Object>(d) {
                                int G;
                                final /* synthetic */ d H = this.H;
                                final /* synthetic */ org.joda.time.t I = this.I;
                                final /* synthetic */ long J = this.J;
                            };
                        }
                        
                        @org.jetbrains.annotations.f
                        @Override
                        public final Object invoke(@org.jetbrains.annotations.f final d<? super JsonRpcResponse<x3.d>> d) {
                            return ((d$d$a)this.create(d)).invokeSuspend(j2.a);
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
                                final com.untis.mobile.dashboard.network.b q = d.q(this.H);
                                final String wuUrl = this.H.n().getWuUrl();
                                final JsonRpcRequest<com.untis.mobile.dashboard.network.parameter.d> a = com.untis.mobile.dashboard.network.parameter.d.I.a(this.H.n(), this.I, this.J);
                                this.G = 1;
                                if ((j = q.j(wuUrl, a, this)) == h) {
                                    return h;
                                }
                            }
                            return j;
                        }
                    };
                    this.G = 1;
                    if ((p = a.p(j, false, l, this, 1, null)) == h) {
                        return h;
                    }
                }
                return p;
            }
        }, (kotlin.coroutines.d)d);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object c(@e final DashboardContactHour dashboardContactHour, @e final kotlin.coroutines.d<? super x3.a> d) throws JsonRpcError {
        return h.i((kotlin.coroutines.g)i1.c(), (p)new p<r0, kotlin.coroutines.d<? super x3.a>, Object>() {
            int G;
            final /* synthetic */ DashboardContactHour H;
            final /* synthetic */ d I;
            
            @org.jetbrains.annotations.e
            @Override
            public final d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final d<?> d) {
                return (d<j2>)new p<r0, d<? super x3.a>, Object>() {
                    int G;
                    final /* synthetic */ DashboardContactHour H = this.H;
                    final /* synthetic */ d I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final d<? super x3.a> d) {
                return ((d$a)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object p) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                if (g != 0) {
                    if (g != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1.n(p);
                }
                else {
                    c1.n(p);
                    final StringBuilder sb = new StringBuilder();
                    sb.append("deleteContactHourRegistration(");
                    sb.append(this.H);
                    sb.append(')');
                    timber.log.b.b(sb.toString(), new Object[0]);
                    final d i = this.I;
                    final l<d<? super JsonRpcResponse<x3.a>>, Object> l = new l<d<? super JsonRpcResponse<x3.a>>, Object>() {
                        int G;
                        final /* synthetic */ d H;
                        final /* synthetic */ DashboardContactHour I;
                        
                        @org.jetbrains.annotations.e
                        @Override
                        public final d<j2> create(@org.jetbrains.annotations.e final d<?> d) {
                            return (d<j2>)new l<d<? super JsonRpcResponse<x3.a>>, Object>() {
                                int G;
                                final /* synthetic */ d H = this.H;
                                final /* synthetic */ DashboardContactHour I = this.I;
                            };
                        }
                        
                        @org.jetbrains.annotations.f
                        @Override
                        public final Object invoke(@org.jetbrains.annotations.f final d<? super JsonRpcResponse<x3.a>> d) {
                            return ((d$a$a)this.create(d)).invokeSuspend(j2.a);
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
                                final com.untis.mobile.dashboard.network.b q = d.q(this.H);
                                final String wuUrl = this.H.n().getWuUrl();
                                final JsonRpcRequest<com.untis.mobile.dashboard.network.parameter.a> a = com.untis.mobile.dashboard.network.parameter.a.J.a(this.H.n(), this.I);
                                this.G = 1;
                                if ((g = q.g(wuUrl, a, this)) == h) {
                                    return h;
                                }
                            }
                            return g;
                        }
                    };
                    this.G = 1;
                    if ((p = a.p(i, false, l, this, 1, null)) == h) {
                        return h;
                    }
                }
                return p;
            }
        }, (kotlin.coroutines.d)d);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object d(@e final DashboardContactHour dashboardContactHour, final int n, @e final kotlin.coroutines.d<? super k> d) throws JsonRpcError {
        return h.i((kotlin.coroutines.g)i1.c(), (p)new p<r0, kotlin.coroutines.d<? super k>, Object>(null) {
            int G;
            final /* synthetic */ DashboardContactHour H;
            final /* synthetic */ int I;
            final /* synthetic */ d J;
            
            @org.jetbrains.annotations.e
            @Override
            public final d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final d<?> d) {
                return (d<j2>)new p<r0, d<? super k>, Object>(d) {
                    int G;
                    final /* synthetic */ DashboardContactHour H = this.H;
                    final /* synthetic */ int I = this.I;
                    final /* synthetic */ d J = this.J;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final d<? super k> d) {
                return ((d$j)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object p) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                if (g != 0) {
                    if (g != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1.n(p);
                }
                else {
                    c1.n(p);
                    final StringBuilder sb = new StringBuilder();
                    sb.append("submitContactHourRegistration(");
                    sb.append(this.H);
                    sb.append(", ");
                    sb.append(this.I);
                    sb.append(')');
                    timber.log.b.b(sb.toString(), new Object[0]);
                    final d j = this.J;
                    final l<d<? super JsonRpcResponse<k>>, Object> l = new l<d<? super JsonRpcResponse<k>>, Object>(null) {
                        int G;
                        final /* synthetic */ d H;
                        final /* synthetic */ DashboardContactHour I;
                        final /* synthetic */ int J;
                        
                        @org.jetbrains.annotations.e
                        @Override
                        public final d<j2> create(@org.jetbrains.annotations.e final d<?> d) {
                            return (d<j2>)new l<d<? super JsonRpcResponse<k>>, Object>(d) {
                                int G;
                                final /* synthetic */ d H = this.H;
                                final /* synthetic */ DashboardContactHour I = this.I;
                                final /* synthetic */ int J = this.J;
                            };
                        }
                        
                        @org.jetbrains.annotations.f
                        @Override
                        public final Object invoke(@org.jetbrains.annotations.f final d<? super JsonRpcResponse<k>> d) {
                            return ((d$j$a)this.create(d)).invokeSuspend(j2.a);
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
                                final com.untis.mobile.dashboard.network.b q = d.q(this.H);
                                final String wuUrl = this.H.n().getWuUrl();
                                final Profile n = this.H.n();
                                final long wuId = this.I.getWuId();
                                final Teacher teacher = new Teacher(this.I.getTeacherId(), null, null, null, null, null, 0, 0, false, false, 1022, null);
                                final org.joda.time.c slotStart = this.I.getSlotStart(this.J);
                                k0.m(slotStart);
                                final org.joda.time.c slotEnd = this.I.getSlotEnd(this.J);
                                k0.m(slotEnd);
                                String userText;
                                if ((userText = this.I.getUserText()) == null) {
                                    userText = "";
                                }
                                final JsonRpcRequest<SubmitOfficeHourRegistrationRequest> submitOfficeHourRegistrationRequest = JsonRpcRequestBuilder.createSubmitOfficeHourRegistrationRequest(n, new OfficeHourRegistration(wuId, teacher, slotStart, slotEnd, userText));
                                k0.o(submitOfficeHourRegistrationRequest, "createSubmitOfficeHourRegistrationRequest(\n                    profile,\n                    OfficeHourRegistration(\n                        contactHour.wuId,\n                        teacher = Teacher(id = contactHour.teacherId),\n                        start = contactHour.getSlotStart(position)!!,\n                        end = contactHour.getSlotEnd(position)!!,\n                        userText =  contactHour.userText ?: \"\"\n                    )\n                )");
                                this.G = 1;
                                if ((k = q.k(wuUrl, submitOfficeHourRegistrationRequest, this)) == h) {
                                    return h;
                                }
                            }
                            return k;
                        }
                    };
                    this.G = 1;
                    if ((p = a.p(j, false, l, this, 1, null)) == h) {
                        return h;
                    }
                }
                return p;
            }
        }, (kotlin.coroutines.d)d);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object e(@e final DashboardStudentAbsence dashboardStudentAbsence, @e final kotlin.coroutines.d<? super m> d) throws JsonRpcError {
        return h.i((kotlin.coroutines.g)i1.c(), (p)new p<r0, kotlin.coroutines.d<? super m>, Object>() {
            int G;
            final /* synthetic */ DashboardStudentAbsence H;
            final /* synthetic */ d I;
            
            @org.jetbrains.annotations.e
            @Override
            public final d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final d<?> d) {
                return (d<j2>)new p<r0, d<? super m>, Object>() {
                    int G;
                    final /* synthetic */ DashboardStudentAbsence H = this.H;
                    final /* synthetic */ d I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final d<? super m> d) {
                return ((d$k)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object p) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                if (g != 0) {
                    if (g != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1.n(p);
                }
                else {
                    c1.n(p);
                    final StringBuilder sb = new StringBuilder();
                    sb.append("submitStudentAbsence(");
                    sb.append(this.H);
                    sb.append(')');
                    timber.log.b.b(sb.toString(), new Object[0]);
                    final d i = this.I;
                    final l<d<? super JsonRpcResponse<m>>, Object> l = new l<d<? super JsonRpcResponse<m>>, Object>() {
                        int G;
                        final /* synthetic */ d H;
                        final /* synthetic */ DashboardStudentAbsence I;
                        
                        @org.jetbrains.annotations.e
                        @Override
                        public final d<j2> create(@org.jetbrains.annotations.e final d<?> d) {
                            return (d<j2>)new l<d<? super JsonRpcResponse<m>>, Object>() {
                                int G;
                                final /* synthetic */ d H = this.H;
                                final /* synthetic */ DashboardStudentAbsence I = this.I;
                            };
                        }
                        
                        @org.jetbrains.annotations.f
                        @Override
                        public final Object invoke(@org.jetbrains.annotations.f final d<? super JsonRpcResponse<m>> d) {
                            return ((d$k$a)this.create(d)).invokeSuspend(j2.a);
                        }
                        
                        @org.jetbrains.annotations.f
                        public final Object invokeSuspend(@org.jetbrains.annotations.e Object f) {
                            final Object h = kotlin.coroutines.intrinsics.b.h();
                            final int g = this.G;
                            if (g != 0) {
                                if (g != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                c1.n(f);
                            }
                            else {
                                c1.n(f);
                                final com.untis.mobile.dashboard.network.b q = d.q(this.H);
                                final String wuUrl = this.H.n().getWuUrl();
                                final JsonRpcRequest<com.untis.mobile.dashboard.network.parameter.k> a = com.untis.mobile.dashboard.network.parameter.k.M.a(this.H.n(), this.I);
                                this.G = 1;
                                if ((f = q.f(wuUrl, a, this)) == h) {
                                    return h;
                                }
                            }
                            return f;
                        }
                    };
                    this.G = 1;
                    if ((p = a.p(i, false, l, this, 1, null)) == h) {
                        return h;
                    }
                }
                return p;
            }
        }, (kotlin.coroutines.d)d);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object f(final long n, final long n2, @e final kotlin.coroutines.d<? super x3.c> d) throws JsonRpcError {
        return h.i((kotlin.coroutines.g)i1.c(), (p)new p<r0, kotlin.coroutines.d<? super x3.c>, Object>(null) {
            int G;
            final /* synthetic */ long H;
            final /* synthetic */ long I;
            final /* synthetic */ d J;
            
            @org.jetbrains.annotations.e
            @Override
            public final d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final d<?> d) {
                return (d<j2>)new p<r0, d<? super x3.c>, Object>(d) {
                    int G;
                    final /* synthetic */ long H = this.H;
                    final /* synthetic */ long I = this.I;
                    final /* synthetic */ d J = this.J;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final d<? super x3.c> d) {
                return ((d$c)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object p) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                if (g != 0) {
                    if (g != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1.n(p);
                }
                else {
                    c1.n(p);
                    final StringBuilder sb = new StringBuilder();
                    sb.append("fetchContactHourRegistration(");
                    sb.append(this.H);
                    sb.append(", ");
                    sb.append(this.I);
                    sb.append(')');
                    timber.log.b.b(sb.toString(), new Object[0]);
                    final d j = this.J;
                    final l<d<? super JsonRpcResponse<x3.c>>, Object> l = new l<d<? super JsonRpcResponse<x3.c>>, Object>(null) {
                        int G;
                        final /* synthetic */ d H;
                        final /* synthetic */ long I;
                        final /* synthetic */ long J;
                        
                        @org.jetbrains.annotations.e
                        @Override
                        public final d<j2> create(@org.jetbrains.annotations.e final d<?> d) {
                            return (d<j2>)new l<d<? super JsonRpcResponse<x3.c>>, Object>(d) {
                                int G;
                                final /* synthetic */ d H = this.H;
                                final /* synthetic */ long I = this.I;
                                final /* synthetic */ long J = this.J;
                            };
                        }
                        
                        @org.jetbrains.annotations.f
                        @Override
                        public final Object invoke(@org.jetbrains.annotations.f final d<? super JsonRpcResponse<x3.c>> d) {
                            return ((d$c$a)this.create(d)).invokeSuspend(j2.a);
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
                                final com.untis.mobile.dashboard.network.b q = d.q(this.H);
                                final String wuUrl = this.H.n().getWuUrl();
                                final JsonRpcRequest<com.untis.mobile.dashboard.network.parameter.c> a = com.untis.mobile.dashboard.network.parameter.c.I.a(this.H.n(), this.I, this.J);
                                this.G = 1;
                                if ((b = q.b(wuUrl, a, this)) == h) {
                                    return h;
                                }
                            }
                            return b;
                        }
                    };
                    this.G = 1;
                    if ((p = a.p(j, false, l, this, 1, null)) == h) {
                        return h;
                    }
                }
                return p;
            }
        }, (kotlin.coroutines.d)d);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object g(@e final t t, @e final t t2, @e final kotlin.coroutines.d<? super List<DashboardStudentAbsence>> d) throws JsonRpcError {
        return h.i((kotlin.coroutines.g)i1.c(), (p)new p<r0, kotlin.coroutines.d<? super List<? extends DashboardStudentAbsence>>, Object>(null) {
            int G;
            final /* synthetic */ org.joda.time.t H;
            final /* synthetic */ org.joda.time.t I;
            final /* synthetic */ d J;
            
            @org.jetbrains.annotations.e
            @Override
            public final d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final d<?> d) {
                return (d<j2>)new p<r0, d<? super List<? extends DashboardStudentAbsence>>, Object>(d) {
                    int G;
                    final /* synthetic */ org.joda.time.t H = this.H;
                    final /* synthetic */ org.joda.time.t I = this.I;
                    final /* synthetic */ d J = this.J;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final d<? super List<DashboardStudentAbsence>> d) {
                return ((d$h)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object p) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                if (g != 0) {
                    if (g != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1.n(p);
                }
                else {
                    c1.n(p);
                    final StringBuilder sb = new StringBuilder();
                    sb.append("fetchStudentAbsences(");
                    sb.append(this.H);
                    sb.append(", ");
                    sb.append(this.I);
                    sb.append(')');
                    timber.log.b.b(sb.toString(), new Object[0]);
                    final d j = this.J;
                    final l<d<? super JsonRpcResponse<x3.h>>, Object> l = new l<d<? super JsonRpcResponse<x3.h>>, Object>(null) {
                        int G;
                        final /* synthetic */ d H;
                        final /* synthetic */ org.joda.time.t I;
                        final /* synthetic */ org.joda.time.t J;
                        
                        @org.jetbrains.annotations.e
                        @Override
                        public final d<j2> create(@org.jetbrains.annotations.e final d<?> d) {
                            return (d<j2>)new l<d<? super JsonRpcResponse<x3.h>>, Object>(d) {
                                int G;
                                final /* synthetic */ d H = this.H;
                                final /* synthetic */ org.joda.time.t I = this.I;
                                final /* synthetic */ org.joda.time.t J = this.J;
                            };
                        }
                        
                        @org.jetbrains.annotations.f
                        @Override
                        public final Object invoke(@org.jetbrains.annotations.f final d<? super JsonRpcResponse<x3.h>> d) {
                            return ((d$h$a)this.create(d)).invokeSuspend(j2.a);
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
                                final com.untis.mobile.dashboard.network.b q = d.q(this.H);
                                final String wuUrl = this.H.n().getWuUrl();
                                final JsonRpcRequest<com.untis.mobile.dashboard.network.parameter.h> a = com.untis.mobile.dashboard.network.parameter.h.K.a(this.H.n(), this.I, this.J);
                                this.G = 1;
                                if ((c = q.c(wuUrl, a, this)) == h) {
                                    return h;
                                }
                            }
                            return c;
                        }
                    };
                    this.G = 1;
                    if ((p = a.p(j, false, l, this, 1, null)) == h) {
                        return h;
                    }
                }
                return ((x3.h)p).a();
            }
        }, (kotlin.coroutines.d)d);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object h(final long n, final long n2, @e final kotlin.coroutines.d<? super i> d) throws JsonRpcError {
        return h.i((kotlin.coroutines.g)i1.c(), (p)new p<r0, kotlin.coroutines.d<? super i>, Object>(null) {
            int G;
            final /* synthetic */ long H;
            final /* synthetic */ long I;
            final /* synthetic */ d J;
            
            @org.jetbrains.annotations.e
            @Override
            public final d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final d<?> d) {
                return (d<j2>)new p<r0, d<? super i>, Object>(d) {
                    int G;
                    final /* synthetic */ long H = this.H;
                    final /* synthetic */ long I = this.I;
                    final /* synthetic */ d J = this.J;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final d<? super i> d) {
                return ((d$i)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object p) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                if (g != 0) {
                    if (g != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1.n(p);
                }
                else {
                    c1.n(p);
                    final StringBuilder sb = new StringBuilder();
                    sb.append("submitClassLeadExcuse(");
                    sb.append(this.H);
                    sb.append(", ");
                    sb.append(this.I);
                    sb.append(')');
                    timber.log.b.b(sb.toString(), new Object[0]);
                    final d j = this.J;
                    final l<d<? super JsonRpcResponse<i>>, Object> l = new l<d<? super JsonRpcResponse<i>>, Object>(null) {
                        int G;
                        final /* synthetic */ d H;
                        final /* synthetic */ long I;
                        final /* synthetic */ long J;
                        
                        @org.jetbrains.annotations.e
                        @Override
                        public final d<j2> create(@org.jetbrains.annotations.e final d<?> d) {
                            return (d<j2>)new l<d<? super JsonRpcResponse<i>>, Object>(d) {
                                int G;
                                final /* synthetic */ d H = this.H;
                                final /* synthetic */ long I = this.I;
                                final /* synthetic */ long J = this.J;
                            };
                        }
                        
                        @org.jetbrains.annotations.f
                        @Override
                        public final Object invoke(@org.jetbrains.annotations.f final d<? super JsonRpcResponse<i>> d) {
                            return ((d$i$a)this.create(d)).invokeSuspend(j2.a);
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
                                final com.untis.mobile.dashboard.network.b q = d.q(this.H);
                                final String wuUrl = this.H.n().getWuUrl();
                                final JsonRpcRequest<com.untis.mobile.dashboard.network.parameter.i> a2 = com.untis.mobile.dashboard.network.parameter.i.K.a(this.H.n(), this.I, this.J);
                                this.G = 1;
                                if ((a = q.a(wuUrl, a2, this)) == h) {
                                    return h;
                                }
                            }
                            return a;
                        }
                    };
                    this.G = 1;
                    if ((p = a.p(j, false, l, this, 1, null)) == h) {
                        return h;
                    }
                }
                return p;
            }
        }, (kotlin.coroutines.d)d);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object i(@e final t t, @e final t t2, @e final EntityType entityType, final long n, @e final kotlin.coroutines.d<? super List<DashboardHomework>> d) throws JsonRpcError {
        return h.i((kotlin.coroutines.g)i1.c(), (p)new p<r0, kotlin.coroutines.d<? super List<? extends DashboardHomework>>, Object>(n) {
            int G;
            final /* synthetic */ org.joda.time.t H;
            final /* synthetic */ org.joda.time.t I;
            final /* synthetic */ EntityType J;
            final /* synthetic */ long K;
            final /* synthetic */ d L;
            
            @org.jetbrains.annotations.e
            @Override
            public final d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final d<?> d) {
                return (d<j2>)new p<r0, d<? super List<? extends DashboardHomework>>, Object>() {
                    int G;
                    final /* synthetic */ org.joda.time.t H = this.H;
                    final /* synthetic */ org.joda.time.t I = this.I;
                    final /* synthetic */ EntityType J = this.J;
                    final /* synthetic */ long K = this.K;
                    final /* synthetic */ d L = this.L;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final d<? super List<DashboardHomework>> d) {
                return ((d$f)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object p) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                Label_0039: {
                    if (g == 0) {
                        break Label_0039;
                    }
                    Label_0029: {
                        if (g != 1) {
                            break Label_0029;
                        }
                        Label_0194: {
                            try {
                                c1.n(p);
                                break Label_0194;
                            }
                            catch (JsonRpcError jsonRpcError) {
                                if (jsonRpcError.isAnyOf(JsonRpcErrorType.NoRight)) {
                                    return v.E();
                                }
                                throw jsonRpcError;
                                // iftrue(Label_0280:, umLesson != null)
                                // iftrue(Label_0307:, !iterator.hasNext())
                            Label_0228:
                                while (true) {
                                    Long g2 = null;
                                    DashboardHomework dashboardHomework = null;
                                    ArrayList list = null;
                                    Label_0288: {
                                        while (true) {
                                            while (true) {
                                                g2 = null;
                                                break Label_0288;
                                                final Iterator<Object> iterator;
                                                dashboardHomework = iterator.next();
                                                final x3.f f;
                                                final UMLesson umLesson = f.b().get(kotlin.coroutines.jvm.internal.b.g(dashboardHomework.getLessonId()));
                                                continue;
                                            }
                                            Label_0307: {
                                                return list;
                                            }
                                            final x3.f f = (x3.f)p;
                                            final List<DashboardHomework> a = f.a();
                                            list = new ArrayList<DashboardHomework>(v.Y((Iterable<?>)a, 10));
                                            final Iterator<Object> iterator = a.iterator();
                                            break Label_0228;
                                            UMLesson umLesson = null;
                                            Label_0280:
                                            g2 = kotlin.coroutines.jvm.internal.b.g(umLesson.subjectId);
                                            break Label_0288;
                                            continue;
                                        }
                                    }
                                    dashboardHomework.setSubjectId(g2);
                                    list.add(dashboardHomework);
                                    continue Label_0228;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                c1.n(p);
                                final StringBuilder sb = new StringBuilder();
                                sb.append("fetchHomework(");
                                sb.append(this.H);
                                sb.append(", ");
                                sb.append(this.I);
                                sb.append(", ");
                                sb.append(this.J);
                                sb.append(", ");
                                sb.append(this.K);
                                sb.append(')');
                                timber.log.b.b(sb.toString(), new Object[0]);
                                final d l = this.L;
                                p = new l<d<? super JsonRpcResponse<x3.f>>, Object>(this.H) {
                                    int G;
                                    final /* synthetic */ d H;
                                    final /* synthetic */ EntityType I;
                                    final /* synthetic */ long J;
                                    final /* synthetic */ org.joda.time.t K;
                                    final /* synthetic */ org.joda.time.t L;
                                    
                                    @org.jetbrains.annotations.e
                                    @Override
                                    public final d<j2> create(@org.jetbrains.annotations.e final d<?> d) {
                                        return (d<j2>)new l<d<? super JsonRpcResponse<x3.f>>, Object>() {
                                            int G;
                                            final /* synthetic */ d H = this.H;
                                            final /* synthetic */ EntityType I = this.I;
                                            final /* synthetic */ long J = this.J;
                                            final /* synthetic */ org.joda.time.t K = this.K;
                                            final /* synthetic */ org.joda.time.t L = this.L;
                                        };
                                    }
                                    
                                    @org.jetbrains.annotations.f
                                    @Override
                                    public final Object invoke(@org.jetbrains.annotations.f final d<? super JsonRpcResponse<x3.f>> d) {
                                        return ((d$f$a)this.create(d)).invokeSuspend(j2.a);
                                    }
                                    
                                    @org.jetbrains.annotations.f
                                    public final Object invokeSuspend(@org.jetbrains.annotations.e Object i) {
                                        final Object h = kotlin.coroutines.intrinsics.b.h();
                                        final int g = this.G;
                                        if (g != 0) {
                                            if (g != 1) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            c1.n(i);
                                        }
                                        else {
                                            c1.n(i);
                                            final com.untis.mobile.dashboard.network.b q = d.q(this.H);
                                            final String wuUrl = this.H.n().getWuUrl();
                                            final JsonRpcRequest<GetHomeWorkRequest> getHomeWorkRequest = JsonRpcRequestBuilder.createGetHomeWorkRequest(this.H.n(), this.I, this.J, this.K, this.L);
                                            k0.o(getHomeWorkRequest, "createGetHomeWorkRequest(\n                        profile,\n                        entityType,\n                        entityId,\n                        start,\n                        end\n                    )");
                                            this.G = 1;
                                            if ((i = q.i(wuUrl, getHomeWorkRequest, this)) == h) {
                                                return h;
                                            }
                                        }
                                        return i;
                                    }
                                };
                                this.G = 1;
                                // iftrue(Label_0194:, p = a.p((a)l, false, (l)p, (d)this, 1, (Object)null) != h)
                                return h;
                            }
                        }
                    }
                }
            }
        }, (kotlin.coroutines.d)d);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object j(final long n, @e final t t, @e final t t2, @e final kotlin.coroutines.d<? super x3.b> d) throws JsonRpcError {
        return h.i((kotlin.coroutines.g)i1.c(), (p)new p<r0, kotlin.coroutines.d<? super x3.b>, Object>(this) {
            int G;
            final /* synthetic */ long H;
            final /* synthetic */ org.joda.time.t I;
            final /* synthetic */ org.joda.time.t J;
            final /* synthetic */ d K;
            
            @org.jetbrains.annotations.e
            @Override
            public final d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final d<?> d) {
                return (d<j2>)new p<r0, d<? super x3.b>, Object>() {
                    int G;
                    final /* synthetic */ long H = this.H;
                    final /* synthetic */ org.joda.time.t I = this.I;
                    final /* synthetic */ org.joda.time.t J = this.J;
                    final /* synthetic */ d K = this.K;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final d<? super x3.b> d) {
                return ((d$b)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object p) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                if (g != 0) {
                    if (g != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1.n(p);
                }
                else {
                    c1.n(p);
                    final StringBuilder sb = new StringBuilder();
                    sb.append("fetchClassLead(");
                    sb.append(this.H);
                    sb.append(", ");
                    sb.append(this.I);
                    sb.append(", ");
                    sb.append(this.J);
                    sb.append(')');
                    timber.log.b.b(sb.toString(), new Object[0]);
                    final d k = this.K;
                    final l<d<? super JsonRpcResponse<x3.b>>, Object> l = new l<d<? super JsonRpcResponse<x3.b>>, Object>(this.J) {
                        int G;
                        final /* synthetic */ d H;
                        final /* synthetic */ long I;
                        final /* synthetic */ org.joda.time.t J;
                        final /* synthetic */ org.joda.time.t K;
                        
                        @org.jetbrains.annotations.e
                        @Override
                        public final d<j2> create(@org.jetbrains.annotations.e final d<?> d) {
                            return (d<j2>)new l<d<? super JsonRpcResponse<x3.b>>, Object>() {
                                int G;
                                final /* synthetic */ d H = this.H;
                                final /* synthetic */ long I = this.I;
                                final /* synthetic */ org.joda.time.t J = this.J;
                                final /* synthetic */ org.joda.time.t K = this.K;
                            };
                        }
                        
                        @org.jetbrains.annotations.f
                        @Override
                        public final Object invoke(@org.jetbrains.annotations.f final d<? super JsonRpcResponse<x3.b>> d) {
                            return ((d$b$a)this.create(d)).invokeSuspend(j2.a);
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
                                final com.untis.mobile.dashboard.network.b q = d.q(this.H);
                                final String wuUrl = this.H.n().getWuUrl();
                                final JsonRpcRequest<com.untis.mobile.dashboard.network.parameter.b> a = com.untis.mobile.dashboard.network.parameter.b.J.a(this.H.n(), this.I, this.J, this.K);
                                this.G = 1;
                                if ((e = q.e(wuUrl, a, this)) == h) {
                                    return h;
                                }
                            }
                            return e;
                        }
                    };
                    this.G = 1;
                    if ((p = a.p(k, false, l, this, 1, null)) == h) {
                        return h;
                    }
                }
                return p;
            }
        }, (kotlin.coroutines.d)d);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object k(@e final t t, @e final t t2, @e final EntityType entityType, final long n, @e final kotlin.coroutines.d<? super List<DashboardExam>> d) throws JsonRpcError {
        return h.i((kotlin.coroutines.g)i1.c(), (p)new p<r0, kotlin.coroutines.d<? super List<? extends DashboardExam>>, Object>(n) {
            int G;
            final /* synthetic */ org.joda.time.t H;
            final /* synthetic */ org.joda.time.t I;
            final /* synthetic */ EntityType J;
            final /* synthetic */ long K;
            final /* synthetic */ d L;
            
            @org.jetbrains.annotations.e
            @Override
            public final d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final d<?> d) {
                return (d<j2>)new p<r0, d<? super List<? extends DashboardExam>>, Object>() {
                    int G;
                    final /* synthetic */ org.joda.time.t H = this.H;
                    final /* synthetic */ org.joda.time.t I = this.I;
                    final /* synthetic */ EntityType J = this.J;
                    final /* synthetic */ long K = this.K;
                    final /* synthetic */ d L = this.L;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final d<? super List<DashboardExam>> d) {
                return ((d$e)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object p) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                if (g != 0) {
                    if (g != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1.n(p);
                }
                else {
                    c1.n(p);
                    final StringBuilder sb = new StringBuilder();
                    sb.append("fetchExam(");
                    sb.append(this.H);
                    sb.append(", ");
                    sb.append(this.I);
                    sb.append(", ");
                    sb.append(this.J);
                    sb.append(", ");
                    sb.append(this.K);
                    sb.append(')');
                    timber.log.b.b(sb.toString(), new Object[0]);
                    final d l = this.L;
                    final l<d<? super JsonRpcResponse<x3.e>>, Object> i = new l<d<? super JsonRpcResponse<x3.e>>, Object>(this.H) {
                        int G;
                        final /* synthetic */ d H;
                        final /* synthetic */ EntityType I;
                        final /* synthetic */ long J;
                        final /* synthetic */ org.joda.time.t K;
                        final /* synthetic */ org.joda.time.t L;
                        
                        @org.jetbrains.annotations.e
                        @Override
                        public final d<j2> create(@org.jetbrains.annotations.e final d<?> d) {
                            return (d<j2>)new l<d<? super JsonRpcResponse<x3.e>>, Object>() {
                                int G;
                                final /* synthetic */ d H = this.H;
                                final /* synthetic */ EntityType I = this.I;
                                final /* synthetic */ long J = this.J;
                                final /* synthetic */ org.joda.time.t K = this.K;
                                final /* synthetic */ org.joda.time.t L = this.L;
                            };
                        }
                        
                        @org.jetbrains.annotations.f
                        @Override
                        public final Object invoke(@org.jetbrains.annotations.f final d<? super JsonRpcResponse<x3.e>> d) {
                            return ((d$e$a)this.create(d)).invokeSuspend(j2.a);
                        }
                        
                        @org.jetbrains.annotations.f
                        public final Object invokeSuspend(@org.jetbrains.annotations.e Object h) {
                            final Object h2 = kotlin.coroutines.intrinsics.b.h();
                            final int g = this.G;
                            if (g != 0) {
                                if (g != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                c1.n(h);
                            }
                            else {
                                c1.n(h);
                                final com.untis.mobile.dashboard.network.b q = d.q(this.H);
                                final String wuUrl = this.H.n().getWuUrl();
                                final JsonRpcRequest<GetExamsRequest> getExamsRequest = JsonRpcRequestBuilder.createGetExamsRequest(this.H.n(), this.I, this.J, this.K, this.L);
                                k0.o(getExamsRequest, "createGetExamsRequest(\n                    profile,\n                    entityType,\n                    entityId,\n                    start,\n                    end\n                )");
                                this.G = 1;
                                if ((h = q.h(wuUrl, getExamsRequest, this)) == h2) {
                                    return h2;
                                }
                            }
                            return h;
                        }
                    };
                    this.G = 1;
                    if ((p = a.p(l, false, i, this, 1, null)) == h) {
                        return h;
                    }
                }
                return ((x3.e)p).c();
            }
        }, (kotlin.coroutines.d)d);
    }
}
