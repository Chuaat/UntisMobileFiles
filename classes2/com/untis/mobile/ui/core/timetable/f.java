// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.core.timetable;

import com.untis.mobile.persistence.models.EntityType;
import kotlinx.coroutines.u0;
import androidx.lifecycle.x0;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.CoroutineExceptionHandler;
import androidx.lifecycle.LiveData;
import com.untis.mobile.persistence.models.timetable.TimeTableEntity;
import kotlin.coroutines.g;
import kotlinx.coroutines.h;
import java.util.Iterator;
import java.util.Set;
import com.untis.mobile.persistence.models.profile.Child;
import java.util.Collection;
import java.util.ArrayList;
import kotlin.collections.v;
import kotlin.c1;
import kotlin.coroutines.intrinsics.b;
import kotlin.j2;
import kotlin.coroutines.jvm.internal.o;
import kotlinx.coroutines.r0;
import n6.p;
import kotlinx.coroutines.i1;
import com.untis.mobile.persistence.models.DisplayableEntity;
import java.util.List;
import kotlin.coroutines.d;
import com.untis.mobile.persistence.models.profile.Profile;
import androidx.lifecycle.k0;
import org.jetbrains.annotations.e;
import com.untis.mobile.services.profile.legacy.a;
import kotlin.Metadata;
import androidx.lifecycle.w0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010&\u001a\u00020#\u0012\u0006\u0010\"\u001a\u00020\u001f¢\u0006\u0004\b'\u0010(J)\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0082@\u00f8\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0082@\u00f8\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rJ\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010J\u0016\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016J\u0016\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016R\u001e\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)" }, d2 = { "Lcom/untis/mobile/ui/core/timetable/f;", "Landroidx/lifecycle/w0;", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "", "isPremium", "", "Lcom/untis/mobile/persistence/models/DisplayableEntity;", "f", "(Lcom/untis/mobile/persistence/models/profile/Profile;ZLkotlin/coroutines/d;)Ljava/lang/Object;", "", "g", "(Lcom/untis/mobile/persistence/models/profile/Profile;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/lifecycle/LiveData;", "Lcom/untis/mobile/ui/core/timetable/e;", "h", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "coroutineExceptionHandler", "Lkotlinx/coroutines/k2;", "i", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "", "entityId", "Lkotlin/j2;", "j", "k", "Landroidx/lifecycle/k0;", "c", "Landroidx/lifecycle/k0;", "mLiveData", "Lcom/untis/mobile/utils/a;", "b", "Lcom/untis/mobile/utils/a;", "appSettings", "Lcom/untis/mobile/services/profile/legacy/a;", "a", "Lcom/untis/mobile/services/profile/legacy/a;", "profileService", "<init>", "(Lcom/untis/mobile/services/profile/legacy/a;Lcom/untis/mobile/utils/a;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class f extends w0
{
    @e
    private final a a;
    @e
    private final com.untis.mobile.utils.a b;
    @e
    private final k0<com.untis.mobile.ui.core.timetable.e> c;
    
    public f(@e final a a, @e final com.untis.mobile.utils.a b) {
        kotlin.jvm.internal.k0.p(a, "profileService");
        kotlin.jvm.internal.k0.p(b, "appSettings");
        this.a = a;
        this.b = b;
        this.c = (k0<com.untis.mobile.ui.core.timetable.e>)new k0((Object)null);
    }
    
    public static final /* synthetic */ com.untis.mobile.utils.a a(final f f) {
        return f.b;
    }
    
    public static final /* synthetic */ k0 b(final f f) {
        return f.c;
    }
    
    public static final /* synthetic */ a c(final f f) {
        return f.a;
    }
    
    private final Object f(final Profile profile, final boolean b, final d<? super List<? extends DisplayableEntity>> d) {
        return h.i((g)i1.c(), (p)new p<r0, d<? super List<? extends DisplayableEntity>>, Object>() {
            int G;
            final /* synthetic */ boolean H;
            final /* synthetic */ Profile I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super List<? extends DisplayableEntity>>, Object>() {
                    int G;
                    final /* synthetic */ boolean H = this.H;
                    final /* synthetic */ Profile I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super List<? extends DisplayableEntity>> d) {
                return ((f$a)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.G != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c1.n(o);
                if (!this.H) {
                    return v.E();
                }
                final com.untis.mobile.services.masterdata.a masterDataService = this.I.getMasterDataService();
                final ArrayList list = new ArrayList();
                list.addAll(masterDataService.f(true));
                list.addAll(masterDataService.h(true, com.untis.mobile.utils.v.a.g()));
                final Set<Child> userChildren = this.I.getUserChildren();
                final ArrayList list2 = new ArrayList<Long>(v.Y((Iterable<?>)userChildren, 10));
                final Iterator<Object> iterator = userChildren.iterator();
                while (iterator.hasNext()) {
                    list2.add(kotlin.coroutines.jvm.internal.b.g(iterator.next().getId()));
                }
                list.addAll(masterDataService.e((List<Long>)list2));
                list.addAll(masterDataService.m(true));
                list.addAll(masterDataService.x(true));
                return list;
            }
        }, (d)d);
    }
    
    private final Object g(final Profile profile, final d<? super String> d) {
        return h.i((g)i1.c(), (p)new p<r0, d<? super String>, Object>() {
            int G;
            final /* synthetic */ Profile H;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super String>, Object>() {
                    int G;
                    final /* synthetic */ Profile H = this.H;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super String> d) {
                return ((f$b)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.G == 0) {
                    c1.n(o);
                    final TimeTableEntity timeTableEntity = this.H.createTimeTableEntity();
                    final DisplayableEntity v = this.H.getMasterDataService().v(timeTableEntity.getEntityType(), timeTableEntity.getEntityId());
                    String s = "";
                    if (v != null) {
                        final String displayableTitle = v.getDisplayableTitle();
                        if (displayableTitle != null) {
                            s = displayableTitle;
                        }
                    }
                    return s;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }, (d)d);
    }
    
    @e
    public final LiveData<com.untis.mobile.ui.core.timetable.e> h() {
        return (LiveData<com.untis.mobile.ui.core.timetable.e>)this.c;
    }
    
    @e
    public final k2 i(@e final CoroutineExceptionHandler coroutineExceptionHandler) {
        kotlin.jvm.internal.k0.p(coroutineExceptionHandler, "coroutineExceptionHandler");
        return h.f(x0.a((w0)this), (g)coroutineExceptionHandler, (u0)null, (p)new p<r0, d<? super j2>, Object>() {
            Object G;
            Object H;
            boolean I;
            int J;
            final /* synthetic */ f K;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    Object G;
                    Object H;
                    boolean I;
                    int J;
                    final /* synthetic */ f K = this.K;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((f$c)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object e) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int j = this.J;
                boolean b = false;
                String s = null;
                Profile g = null;
                Object d = null;
                Label_0242: {
                    Profile n;
                    if (j != 0) {
                        if (j != 1) {
                            if (j == 2) {
                                b = this.I;
                                s = (String)this.H;
                                g = (Profile)this.G;
                                c1.n(e);
                                d = e;
                                break Label_0242;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        else {
                            b = this.I;
                            g = (Profile)this.H;
                            n = (Profile)this.G;
                            c1.n(e);
                        }
                    }
                    else {
                        c1.n(e);
                        n = f.c(this.K).n();
                        if (n == null) {
                            return j2.a;
                        }
                        b = f.a(this.K).I(n);
                        final f k = this.K;
                        this.G = n;
                        this.H = n;
                        this.I = b;
                        this.J = 1;
                        e = k.g(n, this);
                        if (e == h) {
                            return h;
                        }
                        g = n;
                    }
                    final String h2 = (String)e;
                    final f i = this.K;
                    this.G = g;
                    this.H = h2;
                    this.I = b;
                    this.J = 2;
                    d = i.f(n, b, this);
                    if (d == h) {
                        return h;
                    }
                    s = h2;
                }
                e = new com.untis.mobile.ui.core.timetable.e(g, s, b, (List<? extends DisplayableEntity>)d);
                f.b(this.K).n(e);
                return j2.a;
            }
        }, 2, (Object)null);
    }
    
    public final void j(@e final EntityType entityType, final long n) {
        kotlin.jvm.internal.k0.p(entityType, "entityType");
    }
    
    public final void k(@e final EntityType entityType, final long n) {
        kotlin.jvm.internal.k0.p(entityType, "entityType");
    }
}
