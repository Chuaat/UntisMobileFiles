// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.persistence.database;

import androidx.room.o2;
import com.untis.mobile.utils.extension.h;
import kotlin.jvm.internal.k0;
import android.content.Context;
import com.untis.mobile.dashboard.persistence.dao.k;
import com.untis.mobile.dashboard.persistence.dao.i;
import com.untis.mobile.dashboard.persistence.dao.g;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import com.untis.mobile.dashboard.persistence.model.studentabsence.DashboardStudentAbsence;
import com.untis.mobile.dashboard.persistence.model.parentday.DashboardParentDay;
import com.untis.mobile.dashboard.persistence.model.event.homework.DashboardHomework;
import com.untis.mobile.dashboard.persistence.model.event.exam.DashboardExam;
import com.untis.mobile.dashboard.persistence.model.contacthour.DashboardContactHour;
import com.untis.mobile.dashboard.persistence.model.classlead.DashboardClassbookEvent;
import androidx.room.m0;
import com.untis.mobile.utils.persistence.typeconverter.b;
import com.untis.mobile.utils.persistence.typeconverter.a;
import com.untis.mobile.utils.persistence.typeconverter.c;
import androidx.room.g3;
import kotlin.Metadata;
import androidx.room.r2;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b'\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\t\u001a\u00020\bH&J\b\u0010\u000b\u001a\u00020\nH&J\b\u0010\r\u001a\u00020\fH&¨\u0006\u0012" }, d2 = { "Lcom/untis/mobile/dashboard/persistence/database/DashboardDatabase;", "Landroidx/room/r2;", "Lcom/untis/mobile/dashboard/persistence/dao/a;", "K", "Lcom/untis/mobile/dashboard/persistence/dao/c;", "L", "Lcom/untis/mobile/dashboard/persistence/dao/e;", "M", "Lcom/untis/mobile/dashboard/persistence/dao/g;", "N", "Lcom/untis/mobile/dashboard/persistence/dao/i;", "O", "Lcom/untis/mobile/dashboard/persistence/dao/k;", "P", "<init>", "()V", "p", "a", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
@g3({ c.class, com.untis.mobile.utils.persistence.typeconverter.a.class, b.class })
@m0(entities = { DashboardClassbookEvent.class, DashboardContactHour.class, DashboardExam.class, DashboardHomework.class, DashboardParentDay.class, DashboardStudentAbsence.class }, exportSchema = false, version = 2)
public abstract class DashboardDatabase extends r2
{
    @e
    public static final a p;
    
    static {
        p = new a(null);
    }
    
    @e
    public abstract com.untis.mobile.dashboard.persistence.dao.a K();
    
    @e
    public abstract com.untis.mobile.dashboard.persistence.dao.c L();
    
    @e
    public abstract com.untis.mobile.dashboard.persistence.dao.e M();
    
    @e
    public abstract g N();
    
    @e
    public abstract i O();
    
    @e
    public abstract k P();
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n" }, d2 = { "com/untis/mobile/dashboard/persistence/database/DashboardDatabase$a", "", "Landroid/content/Context;", "context", "", "profileId", "Lcom/untis/mobile/dashboard/persistence/database/DashboardDatabase;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final DashboardDatabase a(@e final Context context, @e final String s) {
            k0.p(context, "context");
            k0.p(s, "profileId");
            final r2 e = o2.a(context, (Class)DashboardDatabase.class, k0.C("untis.mobile.db.dashboard.", h.F(s))).m().e();
            k0.o(e, "databaseBuilder(\n                            context,\n                            DashboardDatabase::class.java,\n                            \"untis.mobile.db.dashboard.${profileId.toAlphaNumericOnly()}\"\n                    )\n                    .fallbackToDestructiveMigration()\n                    .build()");
            return (DashboardDatabase)e;
        }
    }
}
