// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.receivers;

import n6.p;
import kotlinx.coroutines.u0;
import kotlin.coroutines.g;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.h;
import kotlin.coroutines.d;
import kotlinx.coroutines.b2;
import kotlin.text.s;
import android.content.Intent;
import org.jetbrains.annotations.f;
import android.content.Context;
import org.koin.core.c$a;
import kotlin.d0;
import l7.a;
import org.jetbrains.annotations.e;
import kotlin.b0;
import kotlin.Metadata;
import org.koin.core.c;
import android.content.BroadcastReceiver;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\b\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016R\u001d\u0010\u000e\u001a\u00020\t8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011" }, d2 = { "Lcom/untis/mobile/receivers/UmOnBootReceiver;", "Landroid/content/BroadcastReceiver;", "Lorg/koin/core/c;", "Landroid/content/Context;", "nullableContext", "Landroid/content/Intent;", "intent", "Lkotlin/j2;", "onReceive", "Landroidx/work/d0;", "workManager$delegate", "Lkotlin/b0;", "getWorkManager", "()Landroidx/work/d0;", "workManager", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class UmOnBootReceiver extends BroadcastReceiver implements c
{
    @e
    private final b0 workManager$delegate;
    
    public UmOnBootReceiver() {
        this.workManager$delegate = d0.c((n6.a<?>)new UmOnBootReceiver$special$$inlined$inject$default.UmOnBootReceiver$special$$inlined$inject$default$1(((c)this).getKoin().y(), (a)null, (n6.a)null));
    }
    
    private final androidx.work.d0 getWorkManager() {
        return this.workManager$delegate.getValue();
    }
    
    @e
    public org.koin.core.a getKoin() {
        return c$a.a((c)this);
    }
    
    public void onReceive(@f final Context context, @f final Intent intent) {
        String action;
        if (intent == null) {
            action = null;
        }
        else {
            action = intent.getAction();
        }
        if (s.L1(action, "android.intent.action.BOOT_COMPLETED", false, 2, (Object)null)) {
            h.f((r0)b2.G, (g)null, (u0)null, (p)new UmOnBootReceiver$onReceive.UmOnBootReceiver$onReceive$1(this, (d)null), 3, (Object)null);
        }
    }
}
