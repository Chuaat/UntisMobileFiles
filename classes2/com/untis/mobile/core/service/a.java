// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.core.service;

import androidx.lifecycle.LiveData;
import com.untis.mobile.dashboard.persistence.model.reminder.ReminderSubtype;
import com.untis.mobile.dashboard.persistence.model.reminder.Reminder;
import org.jetbrains.annotations.f;
import kotlin.j2;
import kotlin.coroutines.d;
import java.util.List;
import com.untis.mobile.dashboard.persistence.model.reminder.ReminderType;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ3\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH¦@\u00f8\u0001\u0000¢\u0006\u0004\b\t\u0010\rJ\u001b\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0011J\u001b\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0006H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0016H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J1\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00162\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u0019\u0010\nJ+\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u001b\u0010\nJ1\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u0016H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ,\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00160\u001f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!" }, d2 = { "Lcom/untis/mobile/core/service/a;", "", "", "profileId", "Lcom/untis/mobile/dashboard/persistence/model/reminder/ReminderType;", "sourceType", "", "sourceId", "Lkotlin/j2;", "delete", "(Ljava/lang/String;Lcom/untis/mobile/dashboard/persistence/model/reminder/ReminderType;JLkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/dashboard/persistence/model/reminder/ReminderSubtype;", "subtype", "(Ljava/lang/String;Lcom/untis/mobile/dashboard/persistence/model/reminder/ReminderType;JLcom/untis/mobile/dashboard/persistence/model/reminder/ReminderSubtype;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/dashboard/persistence/model/reminder/Reminder;", "reminder", "f", "(Lcom/untis/mobile/dashboard/persistence/model/reminder/Reminder;Lkotlin/coroutines/d;)Ljava/lang/Object;", "d", "reminderId", "e", "(JLkotlin/coroutines/d;)Ljava/lang/Object;", "", "findAll", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "b", "", "c", "sourceIds", "a", "(Ljava/lang/String;Lcom/untis/mobile/dashboard/persistence/model/reminder/ReminderType;Ljava/util/List;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/lifecycle/LiveData;", "observeFor", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public interface a
{
    @f
    Object a(@e final String p0, @e final ReminderType p1, @e final List<Long> p2, @e final d<? super j2> p3);
    
    @f
    Object b(@e final String p0, @e final ReminderType p1, final long p2, @e final d<? super List<Reminder>> p3);
    
    @f
    Object c(@e final String p0, @e final ReminderType p1, final long p2, @e final d<? super Boolean> p3);
    
    @f
    Object d(@e final Reminder p0, @e final d<? super j2> p1);
    
    @f
    Object delete(@e final String p0, @e final ReminderType p1, final long p2, @e final ReminderSubtype p3, @e final d<? super j2> p4);
    
    @f
    Object delete(@e final String p0, @e final ReminderType p1, final long p2, @e final d<? super j2> p3);
    
    @f
    Object e(final long p0, @e final d<? super j2> p1);
    
    @f
    Object f(@e final Reminder p0, @e final d<? super j2> p1);
    
    @f
    Object findAll(@e final d<? super List<Reminder>> p0);
    
    @e
    LiveData<List<Reminder>> observeFor(@e final String p0, @e final ReminderType p1, final long p2);
}
