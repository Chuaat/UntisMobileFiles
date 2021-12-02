// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.receivers;

import android.content.IntentFilter;
import kotlin.jvm.internal.k0;
import n6.p;
import kotlinx.coroutines.u0;
import kotlin.coroutines.g;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.h;
import kotlin.coroutines.d;
import kotlinx.coroutines.b2;
import kotlin.text.s;
import android.util.Log;
import android.content.Intent;
import org.jetbrains.annotations.f;
import com.untis.mobile.UntisMobileApplication;
import android.content.Context;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import android.content.BroadcastReceiver;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u001c\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\r" }, d2 = { "Lcom/untis/mobile/receivers/UmOnScreenOnReceiver;", "Landroid/content/BroadcastReceiver;", "Landroid/content/Context;", "context", "Lcom/untis/mobile/UntisMobileApplication;", "getUntisMobileApplication", "Landroid/content/Intent;", "intent", "Lkotlin/j2;", "onReceive", "<init>", "()V", "Companion", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class UmOnScreenOnReceiver extends BroadcastReceiver
{
    @e
    public static final Companion Companion;
    
    static {
        Companion = new Companion(null);
    }
    
    private final UntisMobileApplication getUntisMobileApplication(final Context context) {
        final UntisMobileApplication untisMobileApplication = null;
        Object applicationContext;
        if (context == null) {
            applicationContext = null;
        }
        else {
            applicationContext = context.getApplicationContext();
        }
        UntisMobileApplication untisMobileApplication2 = untisMobileApplication;
        if (applicationContext instanceof UntisMobileApplication) {
            untisMobileApplication2 = (UntisMobileApplication)applicationContext;
        }
        UntisMobileApplication b;
        if ((b = untisMobileApplication2) == null) {
            b = UntisMobileApplication.I.b();
        }
        return b;
    }
    
    public void onReceive(@f final Context context, @f final Intent intent) {
        Log.d("untis_log", "UmOnScreenOnReceiver.onReceive");
        String action;
        if (intent == null) {
            action = null;
        }
        else {
            action = intent.getAction();
        }
        if (s.L1(action, "android.intent.action.SCREEN_ON", false, 2, (Object)null)) {
            h.f((r0)b2.G, (g)null, (u0)null, (p)new UmOnScreenOnReceiver$onReceive.UmOnScreenOnReceiver$onReceive$1(this, context, (d)null), 3, (Object)null);
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b" }, d2 = { "Lcom/untis/mobile/receivers/UmOnScreenOnReceiver$Companion;", "", "Landroid/content/Context;", "context", "Lkotlin/j2;", "register", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class Companion
    {
        private Companion() {
        }
        
        public final void register(@e final Context context) {
            k0.p(context, "context");
            final IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            context.registerReceiver((BroadcastReceiver)new UmOnScreenOnReceiver(), intentFilter);
        }
    }
}
