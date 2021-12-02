// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.receivers;

import kotlin.jvm.internal.k0;
import android.app.PendingIntent;
import com.untis.mobile.dashboard.persistence.model.reminder.Reminder;
import android.annotation.SuppressLint;
import android.os.Bundle;
import n6.p;
import kotlinx.coroutines.u0;
import kotlin.coroutines.g;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.h;
import kotlin.coroutines.d;
import kotlinx.coroutines.b2;
import android.util.Log;
import android.content.Intent;
import org.jetbrains.annotations.f;
import android.content.Context;
import org.koin.core.c$a;
import kotlin.d0;
import l7.a;
import kotlin.jvm.internal.w;
import kotlin.b0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import org.koin.core.c;
import android.content.BroadcastReceiver;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00112\u00020\u00012\u00020\u0002:\u0001\u0011B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001c\u0010\b\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0017R\u001d\u0010\u000e\u001a\u00020\t8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0012" }, d2 = { "Lcom/untis/mobile/receivers/ReminderReceiver;", "Landroid/content/BroadcastReceiver;", "Lorg/koin/core/c;", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lkotlin/j2;", "onReceive", "Lcom/untis/mobile/core/service/a;", "reminderService$delegate", "Lkotlin/b0;", "getReminderService", "()Lcom/untis/mobile/core/service/a;", "reminderService", "<init>", "()V", "Companion", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class ReminderReceiver extends BroadcastReceiver implements c
{
    @e
    private static final String ARGUMENT_REMINDER_ID = "reminder_id";
    @e
    public static final Companion Companion;
    private static final int REQUEST_CODE = 10001;
    @e
    private final b0 reminderService$delegate;
    
    static {
        Companion = new Companion(null);
    }
    
    public ReminderReceiver() {
        this.reminderService$delegate = d0.c((n6.a<?>)new ReminderReceiver$special$$inlined$inject$default.ReminderReceiver$special$$inlined$inject$default$1(((c)this).getKoin().y(), (a)null, (n6.a)null));
    }
    
    private final com.untis.mobile.core.service.a getReminderService() {
        return this.reminderService$delegate.getValue();
    }
    
    @e
    public org.koin.core.a getKoin() {
        return c$a.a((c)this);
    }
    
    @SuppressLint({ "UnsafeProtectedBroadcastReceiver" })
    public void onReceive(@f final Context context, @f final Intent intent) {
        Long value = null;
        Label_0031: {
            if (intent != null) {
                final Bundle extras = intent.getExtras();
                if (extras != null) {
                    value = extras.getLong("reminder_id");
                    break Label_0031;
                }
            }
            value = null;
        }
        if (value == null) {
            Log.e("untis_log", "invalid reminder id, cannot start notification");
            return;
        }
        h.f((r0)b2.G, (g)null, (u0)null, (p)new ReminderReceiver$onReceive.ReminderReceiver$onReceive$1(this, value, (d)null), 3, (Object)null);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010" }, d2 = { "Lcom/untis/mobile/receivers/ReminderReceiver$Companion;", "", "Landroid/content/Context;", "context", "Lcom/untis/mobile/dashboard/persistence/model/reminder/Reminder;", "reminder", "Landroid/app/PendingIntent;", "pendingIntent", "", "ARGUMENT_REMINDER_ID", "Ljava/lang/String;", "", "REQUEST_CODE", "I", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class Companion
    {
        private Companion() {
        }
        
        @e
        public final PendingIntent pendingIntent(@e final Context context, @e final Reminder reminder) {
            k0.p(context, "context");
            k0.p(reminder, "reminder");
            final Intent intent = new Intent(context, (Class)ReminderReceiver.class);
            final Bundle bundle = new Bundle();
            bundle.putLong("reminder_id", reminder.getId());
            intent.putExtras(bundle);
            final PendingIntent broadcast = PendingIntent.getBroadcast(context, 10001, intent, 0);
            k0.o(broadcast, "getBroadcast(\n                    context,\n                    REQUEST_CODE,\n                    intent,\n                    0 //PendingIntent.FLAG_UPDATE_CURRENT\n            )");
            return broadcast;
        }
    }
}
