// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.lockscreen.worker;

import androidx.work.ListenableWorker;
import androidx.work.f$a;
import androidx.work.f;
import org.koin.core.c$a;
import androidx.work.ListenableWorker$a;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.m0;
import android.app.NotificationManager;
import n6.a;
import kotlin.jvm.internal.k0;
import androidx.work.WorkerParameters;
import android.content.Context;
import kotlin.jvm.internal.w;
import kotlin.b0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import org.koin.core.c;
import androidx.work.Worker;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\u00020\u00012\u00020\u0002:\u0001\nB\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u001d\u0010\f\u001a\u00020\u00078B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014" }, d2 = { "Lcom/untis/mobile/lockscreen/worker/HideLockScreenWorker;", "Landroidx/work/Worker;", "Lorg/koin/core/c;", "", "c", "Landroidx/work/ListenableWorker$a;", "doWork", "Landroid/app/NotificationManager;", "G", "Lkotlin/b0;", "a", "()Landroid/app/NotificationManager;", "notificationManager", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "H", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class HideLockScreenWorker extends Worker implements c
{
    @e
    public static final a H;
    @e
    private static final String I = "period_ID";
    @e
    private final b0 G;
    
    static {
        H = new a(null);
    }
    
    public HideLockScreenWorker(@e final Context context, @e final WorkerParameters workerParameters) {
        k0.p(context, "context");
        k0.p(workerParameters, "workerParameters");
        super(context, workerParameters);
        this.G = d0.c((n6.a<?>)new n6.a<NotificationManager>() {
            final /* synthetic */ org.koin.core.scope.a G = ((c)this).getKoin().y();
            
            @Override
            public final NotificationManager invoke() {
                return (NotificationManager)this.G.t(k1.d(NotificationManager.class), null, null);
            }
        });
    }
    
    private final NotificationManager a() {
        return this.G.getValue();
    }
    
    private final long c() {
        return ((ListenableWorker)this).getInputData().s("period_ID", 0L);
    }
    
    @e
    public ListenableWorker$a doWork() {
        this.a().cancel("lock-screen", (int)this.c());
        final ListenableWorker$a d = ListenableWorker$a.d();
        k0.o(d, "success()");
        return d;
    }
    
    @e
    public org.koin.core.a getKoin() {
        return c$a.a((c)this);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b" }, d2 = { "com/untis/mobile/lockscreen/worker/HideLockScreenWorker$a", "", "", "periodId", "Landroidx/work/f;", "a", "", "INPUT_DATA_PERIOD_ID", "Ljava/lang/String;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final f a(final long n) {
            final f a = new f$a().o("period_ID", n).a();
            k0.o(a, "Builder()\n                    .putLong(INPUT_DATA_PERIOD_ID, periodId)\n                    .build()");
            return a;
        }
    }
}
