// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.substitutionplanning.absences;

import com.untis.mobile.api.websocket.OnWsEventListener;
import kotlinx.coroutines.u0;
import kotlinx.coroutines.m0;
import kotlin.coroutines.g;
import kotlinx.coroutines.i1;
import kotlin.c1;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.o;
import kotlin.j2;
import kotlin.coroutines.d;
import kotlinx.coroutines.r0;
import n6.p;
import androidx.lifecycle.x0;
import androidx.lifecycle.LiveData;
import java.util.List;
import com.untis.mobile.substitutionplanning.model.PeriodGroupDto;
import com.untis.mobile.api.websocket.WsTopic;
import com.untis.mobile.persistence.models.profile.Right;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.CoroutineExceptionHandler;
import com.untis.mobile.services.profile.legacy.a;
import com.untis.mobile.substitutionplanning.model.PeriodGroupCollectionDto;
import androidx.lifecycle.k0;
import org.jetbrains.annotations.f;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.api.websocket.WebUntisWebSocket;
import org.jetbrains.annotations.e;
import com.untis.mobile.substitutionplanning.api.k;
import kotlin.Metadata;
import androidx.lifecycle.w0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010#\u001a\u00020 \u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fJ\u0006\u0010\u0013\u001a\u00020\u0011J\u0006\u0010\u0014\u001a\u00020\u0007R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006(" }, d2 = { "Lcom/untis/mobile/substitutionplanning/absences/h;", "Landroidx/lifecycle/w0;", "Landroidx/lifecycle/LiveData;", "Lcom/untis/mobile/substitutionplanning/model/PeriodGroupCollectionDto;", "g", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "errorHandler", "", "force", "Lkotlinx/coroutines/k2;", "h", "", "position", "Lcom/untis/mobile/substitutionplanning/model/PeriodGroupDto;", "f", "Lcom/untis/mobile/api/websocket/OnWsEventListener;", "listener", "Lkotlin/j2;", "j", "e", "d", "Lcom/untis/mobile/substitutionplanning/api/k;", "a", "Lcom/untis/mobile/substitutionplanning/api/k;", "substitutionPlanningApiService", "Lcom/untis/mobile/persistence/models/profile/Profile;", "c", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "Landroidx/lifecycle/k0;", "Landroidx/lifecycle/k0;", "periodGroupCollectionDtoLiveData", "Lcom/untis/mobile/api/websocket/WebUntisWebSocket;", "b", "Lcom/untis/mobile/api/websocket/WebUntisWebSocket;", "wuWebSocket", "Lcom/untis/mobile/services/profile/legacy/a;", "profileService", "<init>", "(Lcom/untis/mobile/substitutionplanning/api/k;Lcom/untis/mobile/api/websocket/WebUntisWebSocket;Lcom/untis/mobile/services/profile/legacy/a;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class h extends w0
{
    @e
    private final k a;
    @e
    private final WebUntisWebSocket b;
    @f
    private final Profile c;
    @e
    private final k0<PeriodGroupCollectionDto> d;
    
    public h(@e final k a, @e final WebUntisWebSocket b, @e final a a2) {
        kotlin.jvm.internal.k0.p(a, "substitutionPlanningApiService");
        kotlin.jvm.internal.k0.p(b, "wuWebSocket");
        kotlin.jvm.internal.k0.p(a2, "profileService");
        this.a = a;
        this.b = b;
        this.c = a2.n();
        this.d = (k0<PeriodGroupCollectionDto>)new k0((Object)null);
    }
    
    public static final /* synthetic */ k0 a(final h h) {
        return h.d;
    }
    
    public static final /* synthetic */ Profile b(final h h) {
        return h.c;
    }
    
    public static final /* synthetic */ k c(final h h) {
        return h.a;
    }
    
    public final boolean d() {
        final Profile c = this.c;
        boolean b = false;
        if (c != null) {
            if (c.hasAnyRight(Right.TEACHER_ABSENCE_CREATE)) {
                b = true;
            }
        }
        return b;
    }
    
    public final void e() {
        this.b.unsubscribe(WsTopic.SUBSTITUTION_PLANNING);
        this.b.stop();
        this.d.q((Object)null);
    }
    
    @f
    public final PeriodGroupDto f(final int n) {
        final PeriodGroupCollectionDto periodGroupCollectionDto = (PeriodGroupCollectionDto)((LiveData)this.d).f();
        PeriodGroupDto periodGroupDto = null;
        if (periodGroupCollectionDto != null) {
            final List<PeriodGroupDto> groups = periodGroupCollectionDto.getGroups();
            if (groups != null) {
                periodGroupDto = groups.get(n);
            }
        }
        return periodGroupDto;
    }
    
    @e
    public final LiveData<PeriodGroupCollectionDto> g() {
        return (LiveData<PeriodGroupCollectionDto>)this.d;
    }
    
    @e
    public final k2 h(@e final CoroutineExceptionHandler coroutineExceptionHandler, final boolean b) {
        kotlin.jvm.internal.k0.p(coroutineExceptionHandler, "errorHandler");
        return kotlinx.coroutines.h.f(x0.a((w0)this), (g)coroutineExceptionHandler, (u0)null, (p)new p<r0, d<? super j2>, Object>() {
            int G;
            final /* synthetic */ h H;
            final /* synthetic */ boolean I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ h H = this.H;
                    final /* synthetic */ boolean I = this.I;
                };
            }
            
            @f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @f final kotlin.coroutines.d<? super j2> d) {
                return ((h$a)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @f
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
                    final m0 c = i1.c();
                    final p<r0, kotlin.coroutines.d<? super j2>, Object> p = new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                        int G;
                        final /* synthetic */ h H;
                        final /* synthetic */ boolean I;
                        
                        @org.jetbrains.annotations.e
                        @Override
                        public final kotlin.coroutines.d<j2> create(@f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                            return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                                int G;
                                final /* synthetic */ h H = this.H;
                                final /* synthetic */ boolean I = this.I;
                            };
                        }
                        
                        @f
                        @Override
                        public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @f final kotlin.coroutines.d<? super j2> d) {
                            return ((h$a$a)this.create(r0, d)).invokeSuspend(j2.a);
                        }
                        
                        @f
                        public final Object invokeSuspend(@org.jetbrains.annotations.e Object o) {
                            final Object h = kotlin.coroutines.intrinsics.b.h();
                            final int g = this.G;
                            PeriodGroupCollectionDto periodGroupCollectionDto = null;
                            Label_0190: {
                                Label_0184: {
                                    Label_0179: {
                                        if (g != 0) {
                                            if (g != 1) {
                                                if (g == 2) {
                                                    c1.n(o);
                                                    break Label_0179;
                                                }
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            else {
                                                c1.n(o);
                                            }
                                        }
                                        else {
                                            c1.n(o);
                                            final Profile b = com.untis.mobile.substitutionplanning.absences.h.b(this.H);
                                            if (b == null) {
                                                return j2.a;
                                            }
                                            if (this.I) {
                                                final k c = com.untis.mobile.substitutionplanning.absences.h.c(this.H);
                                                this.G = 1;
                                                if ((o = k.x(c, b, false, this, 2, null)) == h) {
                                                    return h;
                                                }
                                            }
                                            else {
                                                if ((periodGroupCollectionDto = (PeriodGroupCollectionDto)((LiveData)com.untis.mobile.substitutionplanning.absences.h.a(this.H)).f()) != null) {
                                                    break Label_0184;
                                                }
                                                final k c2 = com.untis.mobile.substitutionplanning.absences.h.c(this.H);
                                                this.G = 2;
                                                if ((o = k.x(c2, b, false, this, 2, null)) == h) {
                                                    return h;
                                                }
                                                break Label_0179;
                                            }
                                        }
                                        periodGroupCollectionDto = (PeriodGroupCollectionDto)o;
                                        break Label_0190;
                                    }
                                    periodGroupCollectionDto = (PeriodGroupCollectionDto)o;
                                }
                                kotlin.jvm.internal.k0.o(periodGroupCollectionDto, "{\n                    periodGroupCollectionDtoLiveData.value\n                        ?: substitutionPlanningApiService.fetchTeacherOwnAbsences(profile)\n                }");
                            }
                            com.untis.mobile.substitutionplanning.absences.h.a(this.H).n((Object)periodGroupCollectionDto);
                            return j2.a;
                        }
                    };
                    this.G = 1;
                    if (kotlinx.coroutines.h.i((g)c, (p)p, (kotlin.coroutines.d)this) == h) {
                        return h;
                    }
                }
                return j2.a;
            }
        }, 2, (Object)null);
    }
    
    public final void j(@e final OnWsEventListener onWsEventListener) {
        kotlin.jvm.internal.k0.p(onWsEventListener, "listener");
        final Profile c = this.c;
        if (c == null) {
            return;
        }
        this.b.start(c);
        this.b.subscribe(WsTopic.SUBSTITUTION_PLANNING, onWsEventListener);
    }
}
