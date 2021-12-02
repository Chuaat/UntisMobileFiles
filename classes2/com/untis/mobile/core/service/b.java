// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.core.service;

import androidx.lifecycle.LiveData;
import com.untis.mobile.receivers.ReminderReceiver;
import org.joda.time.c;
import kotlinx.coroutines.w2;
import kotlinx.coroutines.m0;
import androidx.core.app.w;
import com.untis.mobile.dashboard.persistence.model.reminder.ReminderSubtype;
import com.untis.mobile.dashboard.persistence.model.reminder.Reminder;
import kotlin.coroutines.g;
import kotlinx.coroutines.h;
import kotlin.c1;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlinx.coroutines.r0;
import n6.p;
import kotlinx.coroutines.i1;
import kotlin.j2;
import kotlin.coroutines.d;
import java.util.List;
import com.untis.mobile.dashboard.persistence.model.reminder.ReminderType;
import android.app.NotificationManager;
import java.util.Objects;
import android.app.NotificationChannel;
import android.os.Build$VERSION;
import kotlin.jvm.internal.k0;
import com.untis.mobile.dashboard.persistence.model.reminder.ReminderDao;
import android.app.AlarmManager;
import org.jetbrains.annotations.e;
import android.content.Context;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010)\u001a\u00020'\u0012\u0006\u0010&\u001a\u00020$¢\u0006\u0004\b+\u0010,J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001b\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\n\u0010\tJ+\u0010\u0011\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u000fH\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0016H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J1\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u00162\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0012J+\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0012J1\u0010\u001d\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0016H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ3\u0010\u0011\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001fH\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u0011\u0010!J,\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00160\"2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016R\u0016\u0010&\u001a\u00020$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010%R\u0016\u0010)\u001a\u00020'8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010(R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010*\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006-" }, d2 = { "Lcom/untis/mobile/core/service/b;", "Lcom/untis/mobile/core/service/a;", "Landroid/content/Context;", "context", "Lkotlin/j2;", "j", "Lcom/untis/mobile/dashboard/persistence/model/reminder/Reminder;", "reminder", "f", "(Lcom/untis/mobile/dashboard/persistence/model/reminder/Reminder;Lkotlin/coroutines/d;)Ljava/lang/Object;", "d", "", "profileId", "Lcom/untis/mobile/dashboard/persistence/model/reminder/ReminderType;", "sourceType", "", "sourceId", "delete", "(Ljava/lang/String;Lcom/untis/mobile/dashboard/persistence/model/reminder/ReminderType;JLkotlin/coroutines/d;)Ljava/lang/Object;", "reminderId", "e", "(JLkotlin/coroutines/d;)Ljava/lang/Object;", "", "findAll", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "b", "", "c", "sourceIds", "a", "(Ljava/lang/String;Lcom/untis/mobile/dashboard/persistence/model/reminder/ReminderType;Ljava/util/List;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/dashboard/persistence/model/reminder/ReminderSubtype;", "subtype", "(Ljava/lang/String;Lcom/untis/mobile/dashboard/persistence/model/reminder/ReminderType;JLcom/untis/mobile/dashboard/persistence/model/reminder/ReminderSubtype;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/lifecycle/LiveData;", "observeFor", "Lcom/untis/mobile/dashboard/persistence/model/reminder/ReminderDao;", "Lcom/untis/mobile/dashboard/persistence/model/reminder/ReminderDao;", "reminderDao", "Landroid/app/AlarmManager;", "Landroid/app/AlarmManager;", "alarmManager", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;Landroid/app/AlarmManager;Lcom/untis/mobile/dashboard/persistence/model/reminder/ReminderDao;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class b implements a
{
    @e
    private final Context a;
    @e
    private final AlarmManager b;
    @e
    private final ReminderDao c;
    
    public b(@e final Context a, @e final AlarmManager b, @e final ReminderDao c) {
        k0.p(a, "context");
        k0.p(b, "alarmManager");
        k0.p(c, "reminderDao");
        this.a = a;
        this.b = b;
        this.c = c;
        this.j(a);
    }
    
    public static final /* synthetic */ AlarmManager g(final b b) {
        return b.b;
    }
    
    public static final /* synthetic */ Context h(final b b) {
        return b.a;
    }
    
    public static final /* synthetic */ ReminderDao i(final b b) {
        return b.c;
    }
    
    private final void j(final Context context) {
        if (Build$VERSION.SDK_INT >= 26) {
            final String string = context.getString(2131886901);
            k0.o(string, "context.getString(R.string.untis_channel_name)");
            final String string2 = context.getString(2131886900);
            k0.o(string2, "context.getString(R.string.untis_channel_description)");
            final NotificationChannel notificationChannel = new NotificationChannel("untismobile", (CharSequence)string, 3);
            notificationChannel.setDescription(string2);
            final Object systemService = context.getSystemService("notification");
            Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager)systemService).createNotificationChannel(notificationChannel);
        }
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object a(@e final String s, @e final ReminderType reminderType, @e final List<Long> list, @e final d<? super j2> d) {
        final Object i = h.i((g)i1.c(), (p)new p<r0, d<? super j2>, Object>(list) {
            int G;
            final /* synthetic */ b H;
            final /* synthetic */ String I;
            final /* synthetic */ ReminderType J;
            final /* synthetic */ List<Long> K;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ b H = this.H;
                    final /* synthetic */ String I = this.I;
                    final /* synthetic */ ReminderType J = this.J;
                    final /* synthetic */ List<Long> K = this.K;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((b$c)this.create(r0, d)).invokeSuspend(j2.a);
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
                    final ReminderDao i = com.untis.mobile.core.service.b.i(this.H);
                    final String j = this.I;
                    final ReminderType k = this.J;
                    final List<Long> l = this.K;
                    this.G = 1;
                    if (i.deleteAllOther(j, k, l, this) == h) {
                        return h;
                    }
                }
                return j2.a;
            }
        }, (d)d);
        if (i == kotlin.coroutines.intrinsics.b.h()) {
            return i;
        }
        return j2.a;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object b(@e final String s, @e final ReminderType reminderType, final long n, @e final d<? super List<Reminder>> d) {
        return h.i((g)i1.c(), (p)new p<r0, d<? super List<? extends Reminder>>, Object>(n) {
            int G;
            final /* synthetic */ b H;
            final /* synthetic */ String I;
            final /* synthetic */ ReminderType J;
            final /* synthetic */ long K;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super List<? extends Reminder>>, Object>() {
                    int G;
                    final /* synthetic */ b H = this.H;
                    final /* synthetic */ String I = this.I;
                    final /* synthetic */ ReminderType J = this.J;
                    final /* synthetic */ long K = this.K;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super List<Reminder>> d) {
                return ((b$f)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object allBy) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                if (g != 0) {
                    if (g != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1.n(allBy);
                }
                else {
                    c1.n(allBy);
                    final ReminderDao i = com.untis.mobile.core.service.b.i(this.H);
                    final String j = this.I;
                    final ReminderType k = this.J;
                    final long l = this.K;
                    this.G = 1;
                    if ((allBy = i.findAllBy(j, k, l, this)) == h) {
                        return h;
                    }
                }
                return allBy;
            }
        }, (d)d);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object c(@e final String s, @e final ReminderType reminderType, final long n, @e final d<? super Boolean> d) {
        return h.i((g)i1.c(), (p)new p<r0, d<? super Boolean>, Object>(n) {
            int G;
            final /* synthetic */ b H;
            final /* synthetic */ String I;
            final /* synthetic */ ReminderType J;
            final /* synthetic */ long K;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super Boolean>, Object>() {
                    int G;
                    final /* synthetic */ b H = this.H;
                    final /* synthetic */ String I = this.I;
                    final /* synthetic */ ReminderType J = this.J;
                    final /* synthetic */ long K = this.K;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super Boolean> d) {
                return ((b$g)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object count) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                boolean b = true;
                if (g != 0) {
                    if (g != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1.n(count);
                }
                else {
                    c1.n(count);
                    final ReminderDao i = com.untis.mobile.core.service.b.i(this.H);
                    final String j = this.I;
                    final ReminderType k = this.J;
                    final long l = this.K;
                    this.G = 1;
                    if ((count = i.count(j, k, l, this)) == h) {
                        return h;
                    }
                }
                if (((Number)count).intValue() <= 0) {
                    b = false;
                }
                return kotlin.coroutines.jvm.internal.b.a(b);
            }
        }, (d)d);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object d(@e final Reminder reminder, @e final d<? super j2> d) {
        final Object i = h.i((g)i1.c(), (p)new p<r0, d<? super j2>, Object>() {
            int G;
            final /* synthetic */ b H;
            final /* synthetic */ Reminder I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ b H = this.H;
                    final /* synthetic */ Reminder I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((b$i)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object by) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                if (g != 0) {
                    if (g != 1) {
                        if (g != 2 && g != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c1.n(by);
                        return j2.a;
                    }
                    else {
                        c1.n(by);
                    }
                }
                else {
                    c1.n(by);
                    final ReminderDao i = com.untis.mobile.core.service.b.i(this.H);
                    final String profileId = this.I.getProfileId();
                    final ReminderType sourceType = this.I.getSourceType();
                    final long sourceId = this.I.getSourceId();
                    final ReminderSubtype sourceSubType = this.I.getSourceSubType();
                    this.G = 1;
                    if ((by = i.findBy(profileId, sourceType, sourceId, sourceSubType, this)) == h) {
                        return h;
                    }
                }
                final Reminder reminder = (Reminder)by;
                if (reminder != null) {
                    final ReminderDao j = com.untis.mobile.core.service.b.i(this.H);
                    this.G = 2;
                    if (j.delete(reminder, this) == h) {
                        return h;
                    }
                }
                else {
                    final b h2 = this.H;
                    final Reminder k = this.I;
                    this.G = 3;
                    if (h2.f(k, this) == h) {
                        return h;
                    }
                }
                return j2.a;
            }
        }, (d)d);
        if (i == kotlin.coroutines.intrinsics.b.h()) {
            return i;
        }
        return j2.a;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object delete(@e final String s, @e final ReminderType reminderType, final long n, @e final ReminderSubtype reminderSubtype, @e final d<? super j2> d) {
        final Object i = h.i((g)i1.c(), (p)new p<r0, d<? super j2>, Object>(n) {
            int G;
            final /* synthetic */ b H;
            final /* synthetic */ String I;
            final /* synthetic */ ReminderType J;
            final /* synthetic */ long K;
            final /* synthetic */ ReminderSubtype L;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ b H = this.H;
                    final /* synthetic */ String I = this.I;
                    final /* synthetic */ ReminderType J = this.J;
                    final /* synthetic */ long K = this.K;
                    final /* synthetic */ ReminderSubtype L = this.L;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((b$b)this.create(r0, d)).invokeSuspend(j2.a);
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
                    final ReminderDao i = com.untis.mobile.core.service.b.i(this.H);
                    final String j = this.I;
                    final ReminderType k = this.J;
                    final long l = this.K;
                    final ReminderSubtype m = this.L;
                    this.G = 1;
                    if (i.delete(j, k, l, m, this) == h) {
                        return h;
                    }
                }
                return j2.a;
            }
        }, (d)d);
        if (i == kotlin.coroutines.intrinsics.b.h()) {
            return i;
        }
        return j2.a;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object delete(@e final String s, @e final ReminderType reminderType, final long n, @e final d<? super j2> d) {
        final Object i = h.i((g)i1.c(), (p)new p<r0, d<? super j2>, Object>(n) {
            int G;
            final /* synthetic */ b H;
            final /* synthetic */ String I;
            final /* synthetic */ ReminderType J;
            final /* synthetic */ long K;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ b H = this.H;
                    final /* synthetic */ String I = this.I;
                    final /* synthetic */ ReminderType J = this.J;
                    final /* synthetic */ long K = this.K;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((b$a)this.create(r0, d)).invokeSuspend(j2.a);
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
                    final ReminderDao i = com.untis.mobile.core.service.b.i(this.H);
                    final String j = this.I;
                    final ReminderType k = this.J;
                    final long l = this.K;
                    this.G = 1;
                    if (i.delete(j, k, l, this) == h) {
                        return h;
                    }
                }
                return j2.a;
            }
        }, (d)d);
        if (i == kotlin.coroutines.intrinsics.b.h()) {
            return i;
        }
        return j2.a;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object e(final long n, @e final d<? super j2> d) {
        final Object i = h.i((g)i1.c(), (p)new p<r0, d<? super j2>, Object>() {
            int G;
            final /* synthetic */ b H;
            final /* synthetic */ long I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ b H = this.H;
                    final /* synthetic */ long I = this.I;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((b$d)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object by) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                if (g != 0) {
                    if (g != 1) {
                        if (g == 2) {
                            c1.n(by);
                            return j2.a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        c1.n(by);
                    }
                }
                else {
                    c1.n(by);
                    final ReminderDao i = com.untis.mobile.core.service.b.i(this.H);
                    final long j = this.I;
                    this.G = 1;
                    if ((by = i.findBy(j, this)) == h) {
                        return h;
                    }
                }
                final Reminder reminder = (Reminder)by;
                if (reminder == null) {
                    return j2.a;
                }
                final w2 e = i1.e();
                final p<r0, kotlin.coroutines.d<? super Long>, Object> p = new p<r0, kotlin.coroutines.d<? super Long>, Object>() {
                    int G;
                    final /* synthetic */ b H;
                    final /* synthetic */ Reminder I;
                    
                    @org.jetbrains.annotations.e
                    @Override
                    public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                        return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super Long>, Object>() {
                            int G;
                            final /* synthetic */ b H = this.H;
                            final /* synthetic */ Reminder I = this.I;
                        };
                    }
                    
                    @org.jetbrains.annotations.f
                    @Override
                    public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super Long> d) {
                        return ((b$d$a)this.create(r0, d)).invokeSuspend(j2.a);
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
                            final w p = w.p(com.untis.mobile.core.service.b.h(this.H));
                            final Reminder j = this.I;
                            p.C((int)j.getId(), j.createNotification(com.untis.mobile.core.service.b.h(this.H)));
                            final m0 c = i1.c();
                            final p<r0, kotlin.coroutines.d<? super Long>, Object> p2 = new p<r0, kotlin.coroutines.d<? super Long>, Object>() {
                                int G;
                                final /* synthetic */ b H;
                                final /* synthetic */ Reminder I;
                                
                                @org.jetbrains.annotations.e
                                @Override
                                public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                                    return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super Long>, Object>() {
                                        int G;
                                        final /* synthetic */ b H = this.H;
                                        final /* synthetic */ Reminder I = this.I;
                                    };
                                }
                                
                                @org.jetbrains.annotations.f
                                @Override
                                public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super Long> d) {
                                    return ((b$d$a$a)this.create(r0, d)).invokeSuspend(j2.a);
                                }
                                
                                @org.jetbrains.annotations.f
                                public final Object invokeSuspend(@org.jetbrains.annotations.e Object save) {
                                    final Object h = kotlin.coroutines.intrinsics.b.h();
                                    final int g = this.G;
                                    if (g != 0) {
                                        if (g != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        c1.n(save);
                                    }
                                    else {
                                        c1.n(save);
                                        final ReminderDao i = com.untis.mobile.core.service.b.i(this.H);
                                        final Reminder j = this.I;
                                        this.G = 1;
                                        if ((save = i.save(j, this)) == h) {
                                            return h;
                                        }
                                    }
                                    return save;
                                }
                            };
                            this.G = 1;
                            if ((i = kotlinx.coroutines.h.i((g)c, (p)p2, (kotlin.coroutines.d)this)) == h) {
                                return h;
                            }
                        }
                        return i;
                    }
                };
                this.G = 2;
                if (kotlinx.coroutines.h.i((g)e, (p)p, (kotlin.coroutines.d)this) == h) {
                    return h;
                }
                return j2.a;
            }
        }, (d)d);
        if (i == kotlin.coroutines.intrinsics.b.h()) {
            return i;
        }
        return j2.a;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object f(@e final Reminder reminder, @e final d<? super j2> d) {
        final Object i = h.i((g)i1.c(), (p)new p<r0, d<? super j2>, Object>() {
            Object G;
            int H;
            final /* synthetic */ Reminder I;
            final /* synthetic */ b J;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    Object G;
                    int H;
                    final /* synthetic */ Reminder I = this.I;
                    final /* synthetic */ b J = this.J;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super j2> d) {
                return ((b$h)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int h2 = this.H;
                Reminder reminder2 = null;
                Label_0146: {
                    Reminder reminder;
                    Object save;
                    if (h2 != 0) {
                        if (h2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        reminder = (Reminder)this.G;
                        c1.n(o);
                        save = o;
                    }
                    else {
                        c1.n(o);
                        if (this.I.getId() >= 1L) {
                            reminder2 = this.I;
                            break Label_0146;
                        }
                        final Reminder i = this.I;
                        final ReminderDao j = com.untis.mobile.core.service.b.i(this.J);
                        final Reminder k = this.I;
                        this.G = i;
                        this.H = 1;
                        save = j.save(k, this);
                        if (save == h) {
                            return h;
                        }
                        reminder = i;
                    }
                    reminder2 = Reminder.copy$default(reminder, ((Number)save).longValue(), null, null, 0L, null, null, null, null, 254, null);
                }
                if (((org.joda.time.base.g)reminder2.getDateTime()).n() < System.currentTimeMillis()) {
                    com.untis.mobile.core.service.b.g(this.J).set(0, ((org.joda.time.base.g)reminder2.getDateTime()).n(), ReminderReceiver.Companion.pendingIntent(com.untis.mobile.core.service.b.h(this.J), reminder2));
                }
                return j2.a;
            }
        }, (d)d);
        if (i == kotlin.coroutines.intrinsics.b.h()) {
            return i;
        }
        return j2.a;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object findAll(@e final d<? super List<Reminder>> d) {
        return h.i((g)i1.c(), (p)new p<r0, d<? super List<? extends Reminder>>, Object>() {
            int G;
            final /* synthetic */ b H;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super List<? extends Reminder>>, Object>() {
                    int G;
                    final /* synthetic */ b H = this.H;
                };
            }
            
            @org.jetbrains.annotations.f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.f final kotlin.coroutines.d<? super List<Reminder>> d) {
                return ((b$e)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object all) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                if (g != 0) {
                    if (g != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1.n(all);
                }
                else {
                    c1.n(all);
                    final ReminderDao i = com.untis.mobile.core.service.b.i(this.H);
                    this.G = 1;
                    if ((all = i.findAll(this)) == h) {
                        return h;
                    }
                }
                return all;
            }
        }, (d)d);
    }
    
    @e
    @Override
    public LiveData<List<Reminder>> observeFor(@e final String s, @e final ReminderType reminderType, final long n) {
        k0.p(s, "profileId");
        k0.p(reminderType, "sourceType");
        return this.c.observeFor(s, reminderType, n);
    }
}
