// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.persistence.database;

import androidx.room.o2;
import com.untis.mobile.utils.extension.h;
import kotlin.jvm.internal.k0;
import android.content.Context;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import com.untis.mobile.calendar.persistence.model.CalendarPeriod;
import androidx.room.m0;
import com.untis.mobile.utils.roomadapter.a;
import androidx.room.g3;
import kotlin.Metadata;
import androidx.room.r2;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000 \u00062\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\b" }, d2 = { "Lcom/untis/mobile/calendar/persistence/database/CalendarDatabase;", "Landroidx/room/r2;", "Lcom/untis/mobile/calendar/persistence/dao/a;", "K", "<init>", "()V", "p", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
@g3({ com.untis.mobile.utils.roomadapter.a.class })
@m0(entities = { CalendarPeriod.class }, exportSchema = false, version = 5)
public abstract class CalendarDatabase extends r2
{
    @e
    public static final a p;
    
    static {
        p = new a(null);
    }
    
    @e
    public abstract com.untis.mobile.calendar.persistence.dao.a K();
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n" }, d2 = { "com/untis/mobile/calendar/persistence/database/CalendarDatabase$a", "", "Landroid/content/Context;", "context", "", "profileId", "Lcom/untis/mobile/calendar/persistence/database/CalendarDatabase;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final CalendarDatabase a(@e final Context context, @e final String s) {
            k0.p(context, "context");
            k0.p(s, "profileId");
            final r2 e = o2.a(context, (Class)CalendarDatabase.class, k0.C("untis.mobile.db.calendar.", h.F(s))).m().e();
            k0.o(e, "databaseBuilder(\n                    context,\n                    CalendarDatabase::class.java,\n                    \"untis.mobile.db.calendar.${profileId.toAlphaNumericOnly()}\"\n            )\n                    .fallbackToDestructiveMigration()\n                    .build()");
            return (CalendarDatabase)e;
        }
    }
}
