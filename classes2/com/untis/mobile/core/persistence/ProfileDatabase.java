// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.core.persistence;

import androidx.room.o2;
import kotlin.jvm.internal.k0;
import android.content.Context;
import com.untis.mobile.dashboard.persistence.model.reminder.ReminderDao;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import com.untis.mobile.dashboard.persistence.model.reminder.Reminder;
import androidx.room.m0;
import com.untis.mobile.utils.persistence.typeconverter.b;
import com.untis.mobile.utils.persistence.typeconverter.c;
import androidx.room.g3;
import kotlin.Metadata;
import androidx.room.r2;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000 \u00062\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\b" }, d2 = { "Lcom/untis/mobile/core/persistence/ProfileDatabase;", "Landroidx/room/r2;", "Lcom/untis/mobile/dashboard/persistence/model/reminder/ReminderDao;", "K", "<init>", "()V", "p", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
@g3({ c.class, b.class })
@m0(entities = { Reminder.class }, exportSchema = false, version = 1)
public abstract class ProfileDatabase extends r2
{
    @e
    public static final a p;
    
    static {
        p = new a(null);
    }
    
    @e
    public abstract ReminderDao K();
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b" }, d2 = { "com/untis/mobile/core/persistence/ProfileDatabase$a", "", "Landroid/content/Context;", "context", "Lcom/untis/mobile/core/persistence/ProfileDatabase;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final ProfileDatabase a(@e final Context context) {
            k0.p(context, "context");
            final r2 e = o2.a(context, (Class)ProfileDatabase.class, "untis.mobile.db.general").e();
            k0.o(e, "databaseBuilder(\n                            context,\n                            ProfileDatabase::class.java,\n                            \"untis.mobile.db.general\"\n                    )\n                    .build()");
            return (ProfileDatabase)e;
        }
    }
}
