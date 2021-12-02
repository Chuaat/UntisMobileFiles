// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.ui.period.classbook.event;

import kotlinx.coroutines.u0;
import kotlin.coroutines.g;
import kotlinx.coroutines.h;
import java.util.Collection;
import com.untis.mobile.persistence.models.masterdata.Klasse;
import com.untis.mobile.persistence.models.masterdata.Student;
import kotlin.c1;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.o;
import kotlin.j2;
import kotlin.coroutines.d;
import kotlinx.coroutines.r0;
import n6.p;
import androidx.lifecycle.x0;
import kotlinx.coroutines.k2;
import org.jetbrains.annotations.f;
import com.untis.mobile.persistence.models.profile.Profile;
import java.util.Iterator;
import com.untis.mobile.utils.extension.c;
import java.util.ArrayList;
import kotlin.collections.v;
import android.content.Context;
import org.jetbrains.annotations.e;
import androidx.lifecycle.LiveData;
import com.untis.mobile.services.masterdata.a;
import com.untis.mobile.persistence.models.classbook.classregevent.Event;
import com.untis.mobile.persistence.models.DisplayableEntity;
import java.util.List;
import androidx.lifecycle.k0;
import com.untis.mobile.persistence.models.EntityType;
import kotlin.Metadata;
import androidx.lifecycle.w0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b&\u0010'J0\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bJ\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\rJ\u0012\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\b0\rJ\u000e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\"\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\b0\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u001c\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010\u001e¨\u0006(" }, d2 = { "Lcom/untis/mobile/calendar/ui/period/classbook/event/l;", "Landroidx/lifecycle/w0;", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "Lcom/untis/mobile/persistence/models/classbook/classregevent/Event;", "event", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "", "", "ids", "Lkotlinx/coroutines/k2;", "k", "Landroidx/lifecycle/LiveData;", "j", "Lcom/untis/mobile/persistence/models/DisplayableEntity;", "g", "Landroid/content/Context;", "context", "", "i", "h", "a", "Lcom/untis/mobile/persistence/models/EntityType;", "Lcom/untis/mobile/services/classbook/a;", "e", "Lcom/untis/mobile/services/classbook/a;", "classbookService", "Landroidx/lifecycle/k0;", "b", "Landroidx/lifecycle/k0;", "entitiesLiveData", "Lcom/untis/mobile/services/masterdata/a;", "d", "Lcom/untis/mobile/services/masterdata/a;", "masterDataService", "c", "eventLiveData", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class l extends w0
{
    private EntityType a;
    private k0<List<DisplayableEntity>> b;
    private k0<Event> c;
    private com.untis.mobile.services.masterdata.a d;
    private com.untis.mobile.services.classbook.a e;
    
    public static final /* synthetic */ com.untis.mobile.services.masterdata.a a(final l l) {
        return l.d;
    }
    
    public static final /* synthetic */ void b(final l l, final com.untis.mobile.services.classbook.a e) {
        l.e = e;
    }
    
    public static final /* synthetic */ void c(final l l, final k0 b) {
        l.b = (k0<List<DisplayableEntity>>)b;
    }
    
    public static final /* synthetic */ void d(final l l, final EntityType a) {
        l.a = a;
    }
    
    public static final /* synthetic */ void e(final l l, final k0 c) {
        l.c = (k0<Event>)c;
    }
    
    public static final /* synthetic */ void f(final l l, final com.untis.mobile.services.masterdata.a d) {
        l.d = d;
    }
    
    @e
    public final LiveData<List<DisplayableEntity>> g() {
        final k0<List<DisplayableEntity>> b = this.b;
        if (b != null) {
            return (LiveData<List<DisplayableEntity>>)b;
        }
        kotlin.jvm.internal.k0.S("entitiesLiveData");
        throw null;
    }
    
    @e
    public final String h(@e final Context context) {
        kotlin.jvm.internal.k0.p(context, "context");
        final k0<List<DisplayableEntity>> b = this.b;
        if (b == null) {
            kotlin.jvm.internal.k0.S("entitiesLiveData");
            throw null;
        }
        final List list = (List)((LiveData)b).f();
        if (list == null) {
            final String string = context.getString(2131886745);
            kotlin.jvm.internal.k0.o(string, "context.getString(R.string.shared_noSelection_text)");
            return string;
        }
        final ArrayList list2 = new ArrayList<String>(v.Y((Iterable<?>)list, 10));
        final Iterator<DisplayableEntity> iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(iterator.next().getDisplayableTitle());
        }
        return com.untis.mobile.utils.extension.c.a((List<String>)list2, "\n");
    }
    
    @e
    public final String i(@e final Context context) {
        kotlin.jvm.internal.k0.p(context, "context");
        final EntityType a = this.a;
        if (a != null) {
            final int n = l.a.a[a.ordinal()];
            String s;
            String s2;
            if (n != 1) {
                if (n != 2) {
                    s = "";
                    return s;
                }
                s = context.getString(2131886780);
                s2 = "context.getString(R.string.shared_students_text)";
            }
            else {
                s = context.getString(2131886680);
                s2 = "context.getString(R.string.shared_classes_text)";
            }
            kotlin.jvm.internal.k0.o(s, s2);
            return s;
        }
        kotlin.jvm.internal.k0.S("entityType");
        throw null;
    }
    
    @e
    public final LiveData<Event> j() {
        final k0<Event> c = this.c;
        if (c != null) {
            return (LiveData<Event>)c;
        }
        kotlin.jvm.internal.k0.S("eventLiveData");
        throw null;
    }
    
    @e
    public final k2 k(@e final Profile profile, @e final Event event, @f final EntityType entityType, @f final List<Long> list) {
        kotlin.jvm.internal.k0.p(profile, "profile");
        kotlin.jvm.internal.k0.p(event, "event");
        return h.f(x0.a((w0)this), (g)null, (u0)null, (p)new p<r0, d<? super j2>, Object>(entityType) {
            int G;
            final /* synthetic */ l H;
            final /* synthetic */ Profile I;
            final /* synthetic */ Event J;
            final /* synthetic */ EntityType K;
            final /* synthetic */ List<Long> L;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ l H = this.H;
                    final /* synthetic */ Profile I = this.I;
                    final /* synthetic */ Event J = this.J;
                    final /* synthetic */ EntityType K = this.K;
                    final /* synthetic */ List<Long> L = this.L;
                };
            }
            
            @f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @f final kotlin.coroutines.d<? super j2> d) {
                return ((l$b)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object o) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.G == 0) {
                    c1.n(o);
                    l.f(this.H, this.I.getMasterDataService());
                    l.b(this.H, this.I.getClassBookService());
                    l.e(this.H, new k0((Object)this.J));
                    final l h = this.H;
                    EntityType entityType;
                    if ((entityType = this.K) == null) {
                        entityType = this.J.getEntityType();
                    }
                    l.d(h, entityType);
                    final List<Long> l = this.L;
                    int n = -1;
                    DisplayableEntity displayableEntity = null;
                    Label_0442: {
                        Label_0138: {
                            if (l != null) {
                                final EntityType k = this.K;
                                if (k != null) {
                                    n = a.a[k.ordinal()];
                                }
                                if (n != 1) {
                                    if (n != 2) {
                                        break Label_0138;
                                    }
                                    final List<Long> i = this.L;
                                    final l h2 = this.H;
                                    final Collection<Student> collection = new ArrayList<Student>();
                                    final Iterator<Number> iterator = i.iterator();
                                    while (true) {
                                        o = collection;
                                        if (!iterator.hasNext()) {
                                            break;
                                        }
                                        final long longValue = iterator.next().longValue();
                                        final com.untis.mobile.services.masterdata.a a = com.untis.mobile.calendar.ui.period.classbook.event.l.a(h2);
                                        if (a == null) {
                                            kotlin.jvm.internal.k0.S("masterDataService");
                                            throw null;
                                        }
                                        final Student v = a.V(longValue);
                                        if (v == null) {
                                            continue;
                                        }
                                        collection.add(v);
                                    }
                                }
                                else {
                                    final List<Long> j = this.L;
                                    final l h3 = this.H;
                                    final Collection<Klasse> collection2 = new ArrayList<Klasse>();
                                    final Iterator<Number> iterator2 = j.iterator();
                                    while (true) {
                                        o = collection2;
                                        if (!iterator2.hasNext()) {
                                            break;
                                        }
                                        final long longValue2 = iterator2.next().longValue();
                                        final com.untis.mobile.services.masterdata.a a2 = com.untis.mobile.calendar.ui.period.classbook.event.l.a(h3);
                                        if (a2 == null) {
                                            kotlin.jvm.internal.k0.S("masterDataService");
                                            throw null;
                                        }
                                        final Klasse n2 = a2.N(longValue2);
                                        if (n2 == null) {
                                            continue;
                                        }
                                        collection2.add(n2);
                                    }
                                }
                                break Label_0442;
                            }
                            final EntityType m = this.K;
                            if (m != null) {
                                n = a.a[m.ordinal()];
                            }
                            if (n != 1) {
                                if (n == 2) {
                                    final com.untis.mobile.services.masterdata.a a3 = com.untis.mobile.calendar.ui.period.classbook.event.l.a(this.H);
                                    if (a3 == null) {
                                        kotlin.jvm.internal.k0.S("masterDataService");
                                        throw null;
                                    }
                                    displayableEntity = a3.V(this.J.getEntityId());
                                }
                            }
                            else {
                                final com.untis.mobile.services.masterdata.a a4 = com.untis.mobile.calendar.ui.period.classbook.event.l.a(this.H);
                                if (a4 == null) {
                                    kotlin.jvm.internal.k0.S("masterDataService");
                                    throw null;
                                }
                                displayableEntity = a4.N(this.J.getEntityId());
                            }
                            if (displayableEntity != null) {
                                o = v.k(displayableEntity);
                                break Label_0442;
                            }
                        }
                        o = v.E();
                    }
                    com.untis.mobile.calendar.ui.period.classbook.event.l.c(this.H, new k0(o));
                    return j2.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }, 3, (Object)null);
    }
}
