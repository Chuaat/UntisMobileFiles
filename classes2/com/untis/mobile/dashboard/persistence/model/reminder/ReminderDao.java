// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.persistence.model.reminder;

import androidx.room.e1;
import androidx.lifecycle.LiveData;
import java.util.List;
import androidx.room.q0;
import kotlin.j2;
import org.jetbrains.annotations.f;
import androidx.room.n1;
import kotlin.coroutines.d;
import org.jetbrains.annotations.e;
import androidx.room.l0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J,\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H'J\u001d\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u0006H§@\u00f8\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H§@\u00f8\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J5\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H§@\u00f8\u0001\u0000¢\u0006\u0004\b\r\u0010\u0013J\u0019\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\tH§@\u00f8\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\nH§@\u00f8\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0011H§@\u00f8\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0013J+\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H§@\u00f8\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0010J+\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H§@\u00f8\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0010J\u001b\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\nH§@\u00f8\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0018J1\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\tH§@\u00f8\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!" }, d2 = { "Lcom/untis/mobile/dashboard/persistence/model/reminder/ReminderDao;", "", "", "profileId", "Lcom/untis/mobile/dashboard/persistence/model/reminder/ReminderType;", "sourceType", "", "sourceId", "Landroidx/lifecycle/LiveData;", "", "Lcom/untis/mobile/dashboard/persistence/model/reminder/Reminder;", "observeFor", "reminderId", "findBy", "(JLkotlin/coroutines/d;)Ljava/lang/Object;", "findAllBy", "(Ljava/lang/String;Lcom/untis/mobile/dashboard/persistence/model/reminder/ReminderType;JLkotlin/coroutines/d;)Ljava/lang/Object;", "Lcom/untis/mobile/dashboard/persistence/model/reminder/ReminderSubtype;", "sourceSubtype", "(Ljava/lang/String;Lcom/untis/mobile/dashboard/persistence/model/reminder/ReminderType;JLcom/untis/mobile/dashboard/persistence/model/reminder/ReminderSubtype;Lkotlin/coroutines/d;)Ljava/lang/Object;", "findAll", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "reminder", "save", "(Lcom/untis/mobile/dashboard/persistence/model/reminder/Reminder;Lkotlin/coroutines/d;)Ljava/lang/Object;", "subtype", "Lkotlin/j2;", "delete", "", "count", "sourceIds", "deleteAllOther", "(Ljava/lang/String;Lcom/untis/mobile/dashboard/persistence/model/reminder/ReminderType;Ljava/util/List;Lkotlin/coroutines/d;)Ljava/lang/Object;", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
@l0
public interface ReminderDao
{
    @n1("SELECT COUNT(r.reminder_id) FROM reminder r WHERE profile_id = :profileId AND source_type = :sourceType AND source_id = :sourceId")
    @f
    Object count(@e final String p0, @e final ReminderType p1, final long p2, @e final d<? super Integer> p3);
    
    @q0
    @f
    Object delete(@e final Reminder p0, @e final d<? super j2> p1);
    
    @n1("DELETE FROM reminder WHERE profile_id = :profileId AND source_type = :sourceType AND source_id = :sourceId AND subtype = :subtype")
    @f
    Object delete(@e final String p0, @e final ReminderType p1, final long p2, @e final ReminderSubtype p3, @e final d<? super j2> p4);
    
    @n1("DELETE FROM reminder WHERE profile_id = :profileId AND source_type = :sourceType AND source_id = :sourceId")
    @f
    Object delete(@e final String p0, @e final ReminderType p1, final long p2, @e final d<? super j2> p3);
    
    @n1("DELETE FROM reminder WHERE profile_id = :profileId AND source_type = :sourceType AND NOT source_id IN (:sourceIds)")
    @f
    Object deleteAllOther(@e final String p0, @e final ReminderType p1, @e final List<Long> p2, @e final d<? super j2> p3);
    
    @n1("SELECT * FROM reminder")
    @f
    Object findAll(@e final d<? super List<Reminder>> p0);
    
    @n1("SELECT * FROM reminder WHERE profile_id = :profileId AND source_type = :sourceType AND source_id = :sourceId")
    @f
    Object findAllBy(@e final String p0, @e final ReminderType p1, final long p2, @e final d<? super List<Reminder>> p3);
    
    @n1("SELECT * FROM reminder WHERE reminder_id = :reminderId")
    @f
    Object findBy(final long p0, @e final d<? super Reminder> p1);
    
    @n1("SELECT * FROM reminder WHERE profile_id = :profileId AND source_type = :sourceType AND source_id = :sourceId AND subtype = :sourceSubtype")
    @f
    Object findBy(@e final String p0, @e final ReminderType p1, final long p2, @e final ReminderSubtype p3, @e final d<? super Reminder> p4);
    
    @n1("SELECT * FROM reminder WHERE profile_id = :profileId AND source_type = :sourceType AND source_id = :sourceId")
    @e
    LiveData<List<Reminder>> observeFor(@e final String p0, @e final ReminderType p1, final long p2);
    
    @e1(onConflict = 1)
    @f
    Object save(@e final Reminder p0, @e final d<? super Long> p1);
}
