// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.silentmode;

import org.koin.core.c$a;
import androidx.work.ListenableWorker$a;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.m0;
import n6.a;
import kotlin.jvm.internal.k0;
import androidx.work.WorkerParameters;
import android.content.Context;
import org.jetbrains.annotations.e;
import kotlin.b0;
import kotlin.Metadata;
import org.koin.core.c;
import androidx.work.Worker;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0004\u001a\u00020\u0003H\u0016R\u001d\u0010\n\u001a\u00020\u00058B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u0011" }, d2 = { "Lcom/untis/mobile/silentmode/UnmuteWorker;", "Landroidx/work/Worker;", "Lorg/koin/core/c;", "Landroidx/work/ListenableWorker$a;", "doWork", "Lcom/untis/mobile/silentmode/a;", "G", "Lkotlin/b0;", "getSilentMode", "()Lcom/untis/mobile/silentmode/a;", "silentMode", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class UnmuteWorker extends Worker implements c
{
    @e
    private final b0 G;
    
    public UnmuteWorker(@e final Context context, @e final WorkerParameters workerParameters) {
        k0.p(context, "context");
        k0.p(workerParameters, "workerParameters");
        super(context, workerParameters);
        this.G = d0.c((a<?>)new a<com.untis.mobile.silentmode.a>() {
            final /* synthetic */ org.koin.core.scope.a G = ((c)this).getKoin().y();
            
            @Override
            public final com.untis.mobile.silentmode.a invoke() {
                return (com.untis.mobile.silentmode.a)this.G.t(k1.d(com.untis.mobile.silentmode.a.class), null, null);
            }
        });
    }
    
    private final com.untis.mobile.silentmode.a getSilentMode() {
        return this.G.getValue();
    }
    
    @e
    public ListenableWorker$a doWork() {
        this.getSilentMode().b();
        final ListenableWorker$a d = ListenableWorker$a.d();
        k0.o(d, "success()");
        return d;
    }
    
    @e
    public org.koin.core.a getKoin() {
        return c$a.a((c)this);
    }
}
