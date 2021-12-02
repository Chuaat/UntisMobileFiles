// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.receivers;

import androidx.work.f0$a;
import androidx.work.f0;
import androidx.work.j;
import androidx.work.w$a;
import java.util.concurrent.TimeUnit;
import androidx.work.k;
import androidx.work.s$a;
import org.koin.core.c$a;
import kotlin.j2;
import com.untis.mobile.utils.s;
import androidx.work.ListenableWorker$a;
import com.untis.mobile.systemNotifications.b;
import com.untis.mobile.persistence.models.profile.Profile;
import kotlin.d0;
import l7.a;
import kotlin.jvm.internal.k0;
import androidx.work.WorkerParameters;
import android.content.Context;
import kotlin.jvm.internal.w;
import kotlin.b0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import org.koin.core.c;
import androidx.work.Worker;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0001+B\u0017\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0003H\u0002J\b\u0010\n\u001a\u00020\tH\u0016R\u001d\u0010\u0010\u001a\u00020\u000b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0015\u001a\u00020\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u001a\u001a\u00020\u00168B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001f\u001a\u00020\u001b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\r\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010$\u001a\u00020 8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\r\u001a\u0004\b\"\u0010#¨\u0006," }, d2 = { "Lcom/untis/mobile/receivers/DailyWorker;", "Landroidx/work/Worker;", "Lorg/koin/core/c;", "Lkotlin/j2;", "doLockScreenWork", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "doSilentModeWork", "doSystemNotificationWork", "Landroidx/work/ListenableWorker$a;", "doWork", "Lcom/untis/mobile/lockscreen/a;", "lockScreen$delegate", "Lkotlin/b0;", "getLockScreen", "()Lcom/untis/mobile/lockscreen/a;", "lockScreen", "Lcom/untis/mobile/silentmode/a;", "silentMode$delegate", "getSilentMode", "()Lcom/untis/mobile/silentmode/a;", "silentMode", "Lcom/untis/mobile/services/profile/legacy/a;", "profileService$delegate", "getProfileService", "()Lcom/untis/mobile/services/profile/legacy/a;", "profileService", "Lcom/untis/mobile/utils/a;", "settings$delegate", "getSettings", "()Lcom/untis/mobile/utils/a;", "settings", "Lcom/untis/mobile/systemNotifications/b;", "systemNotificationService$delegate", "getSystemNotificationService", "()Lcom/untis/mobile/systemNotifications/b;", "systemNotificationService", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Companion", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class DailyWorker extends Worker implements c
{
    @e
    public static final Companion Companion;
    @e
    private final b0 lockScreen$delegate;
    @e
    private final b0 profileService$delegate;
    @e
    private final b0 settings$delegate;
    @e
    private final b0 silentMode$delegate;
    @e
    private final b0 systemNotificationService$delegate;
    
    static {
        Companion = new Companion(null);
    }
    
    public DailyWorker(@e final Context context, @e final WorkerParameters workerParameters) {
        k0.p(context, "context");
        k0.p(workerParameters, "workerParameters");
        super(context, workerParameters);
        this.silentMode$delegate = d0.c((n6.a<?>)new DailyWorker$special$$inlined$inject$default.DailyWorker$special$$inlined$inject$default$1(((c)this).getKoin().y(), (a)null, (n6.a)null));
        this.profileService$delegate = d0.c((n6.a<?>)new DailyWorker$special$$inlined$inject$default.DailyWorker$special$$inlined$inject$default$2(((c)this).getKoin().y(), (a)null, (n6.a)null));
        this.settings$delegate = d0.c((n6.a<?>)new DailyWorker$special$$inlined$inject$default.DailyWorker$special$$inlined$inject$default$3(((c)this).getKoin().y(), (a)null, (n6.a)null));
        this.lockScreen$delegate = d0.c((n6.a<?>)new DailyWorker$special$$inlined$inject$default.DailyWorker$special$$inlined$inject$default$4(((c)this).getKoin().y(), (a)null, (n6.a)null));
        this.systemNotificationService$delegate = d0.c((n6.a<?>)new DailyWorker$special$$inlined$inject$default.DailyWorker$special$$inlined$inject$default$5(((c)this).getKoin().y(), (a)null, (n6.a)null));
    }
    
    private final void doLockScreenWork() {
        this.getLockScreen().stop();
        this.getLockScreen().start();
    }
    
    private final void doSilentModeWork(final Profile profile) {
        if (this.getSettings().I(profile)) {
            if (this.getSettings().R()) {
                if (this.getSilentMode().d()) {
                    if (profile.hasEntity()) {
                        this.getSilentMode().c(profile.getUniqueId(), profile.getEntityType(), profile.getEntityId());
                    }
                    return;
                }
            }
        }
        this.getSilentMode().stop();
    }
    
    private final void doSystemNotificationWork() {
        this.getSystemNotificationService().start();
    }
    
    private final com.untis.mobile.lockscreen.a getLockScreen() {
        return this.lockScreen$delegate.getValue();
    }
    
    private final com.untis.mobile.services.profile.legacy.a getProfileService() {
        return this.profileService$delegate.getValue();
    }
    
    private final com.untis.mobile.utils.a getSettings() {
        return this.settings$delegate.getValue();
    }
    
    private final com.untis.mobile.silentmode.a getSilentMode() {
        return this.silentMode$delegate.getValue();
    }
    
    private final b getSystemNotificationService() {
        return this.systemNotificationService$delegate.getValue();
    }
    
    @e
    public ListenableWorker$a doWork() {
        final Profile n = this.getProfileService().n();
        if (n != null) {
            s.a.x((n6.a<j2>)new DailyWorker$doWork.DailyWorker$doWork$1(this, n));
        }
        final ListenableWorker$a d = ListenableWorker$a.d();
        k0.o(d, "success()");
        return d;
    }
    
    @e
    public org.koin.core.a getKoin() {
        return c$a.a((c)this);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b" }, d2 = { "Lcom/untis/mobile/receivers/DailyWorker$Companion;", "", "Landroidx/work/d0;", "workManager", "Lkotlin/j2;", "init", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class Companion
    {
        private Companion() {
        }
        
        public final void init(@e final androidx.work.d0 d0) {
            k0.p(d0, "workManager");
            final f0 b = ((f0$a)new s$a((Class)DailyWorker.class)).b();
            k0.o(b, "OneTimeWorkRequestBuilder<DailyWorker>()\n                    .build()");
            d0.m("daily-job", k.H, (androidx.work.s)b);
            final f0 b2 = ((f0$a)new w$a((Class)DailyWorker.class, 1L, TimeUnit.DAYS)).b();
            k0.o(b2, "PeriodicWorkRequestBuilder<DailyWorker>(1, TimeUnit.DAYS)\n                    .build()");
            d0.l("daily-job", j.G, (androidx.work.w)b2);
        }
    }
}
