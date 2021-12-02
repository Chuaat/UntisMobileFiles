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
import com.untis.mobile.services.widget.d;
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

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\u00020\u00012\u00020\u0002:\u0001\u0011B\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u001d\u0010\n\u001a\u00020\u00058B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u0012" }, d2 = { "Lcom/untis/mobile/receivers/HourlyWorker;", "Landroidx/work/Worker;", "Lorg/koin/core/c;", "Landroidx/work/ListenableWorker$a;", "doWork", "Lcom/untis/mobile/services/widget/d;", "widgetService$delegate", "Lkotlin/b0;", "getWidgetService", "()Lcom/untis/mobile/services/widget/d;", "widgetService", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Companion", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class HourlyWorker extends Worker implements c
{
    @e
    public static final Companion Companion;
    @e
    private final b0 widgetService$delegate;
    
    static {
        Companion = new Companion(null);
    }
    
    public HourlyWorker(@e final Context context, @e final WorkerParameters workerParameters) {
        k0.p(context, "context");
        k0.p(workerParameters, "workerParameters");
        super(context, workerParameters);
        this.widgetService$delegate = d0.c((n6.a<?>)new HourlyWorker$special$$inlined$inject$default.HourlyWorker$special$$inlined$inject$default$1(((c)this).getKoin().y(), (a)null, (n6.a)null));
    }
    
    private final d getWidgetService() {
        return this.widgetService$delegate.getValue();
    }
    
    @e
    public ListenableWorker$a doWork() {
        s.a.x((n6.a<j2>)new HourlyWorker$doWork.HourlyWorker$doWork$1(this));
        final ListenableWorker$a d = ListenableWorker$a.d();
        k0.o(d, "success()");
        return d;
    }
    
    @e
    public org.koin.core.a getKoin() {
        return c$a.a((c)this);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b" }, d2 = { "Lcom/untis/mobile/receivers/HourlyWorker$Companion;", "", "Landroidx/work/d0;", "workManager", "Lkotlin/j2;", "init", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class Companion
    {
        private Companion() {
        }
        
        public final void init(@e final androidx.work.d0 d0) {
            k0.p(d0, "workManager");
            final f0 b = ((f0$a)new s$a((Class)HourlyWorker.class)).b();
            k0.o(b, "OneTimeWorkRequestBuilder<HourlyWorker>()\n                    .build()");
            d0.m("hourly-job", k.H, (androidx.work.s)b);
            final f0 b2 = ((f0$a)new w$a((Class)HourlyWorker.class, 1L, TimeUnit.HOURS)).b();
            k0.o(b2, "PeriodicWorkRequestBuilder<HourlyWorker>(1, TimeUnit.HOURS)\n                    .build()");
            d0.l("hourly-job", j.G, (androidx.work.w)b2);
        }
    }
}
