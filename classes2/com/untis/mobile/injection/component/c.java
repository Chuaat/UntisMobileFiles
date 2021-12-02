// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.injection.component;

import kotlin.jvm.internal.k0;
import com.untis.mobile.dashboard.persistence.model.reminder.ReminderDao;
import com.untis.mobile.core.persistence.ProfileDatabase;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b" }, d2 = { "Lcom/untis/mobile/injection/component/c;", "", "Lcom/untis/mobile/core/persistence/ProfileDatabase;", "db", "Lcom/untis/mobile/dashboard/persistence/model/reminder/ReminderDao;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class c
{
    @e
    public static final c a;
    
    static {
        a = new c();
    }
    
    private c() {
    }
    
    @e
    public final ReminderDao a(@e final ProfileDatabase profileDatabase) {
        k0.p(profileDatabase, "db");
        return profileDatabase.K();
    }
}
