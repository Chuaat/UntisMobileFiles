// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.persistence.typeconverter;

import org.koin.core.c$a;
import kotlin.collections.v;
import com.untis.mobile.dashboard.persistence.model.reminder.ReminderType;
import com.untis.mobile.dashboard.persistence.model.reminder.ReminderSubtype;
import com.untis.mobile.persistence.models.EntityType;
import androidx.room.f3;
import org.jetbrains.annotations.f;
import java.util.List;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.m0;
import com.google.gson.Gson;
import n6.a;
import kotlin.jvm.internal.w;
import kotlin.b0;
import com.untis.mobile.dashboard.persistence.model.Attachment;
import java.util.ArrayList;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import org.koin.core.c;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 *2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b(\u0010)J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u0004\u0018\u00010\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0014\u001a\u0004\u0018\u00010\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00122\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018H\u0007J\u001a\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001bH\u0007J\u001a\u0010 \u001a\u0004\u0018\u00010\u001b2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0018H\u0007J\u001a\u0010!\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00182\b\u0010\u001d\u001a\u0004\u0018\u00010\u001bH\u0007R\u001d\u0010'\u001a\u00020\"8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006+" }, d2 = { "Lcom/untis/mobile/utils/persistence/typeconverter/b;", "Lorg/koin/core/c;", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "", "b", "(Lcom/untis/mobile/persistence/models/EntityType;)Ljava/lang/Integer;", "webUntisId", "d", "(Ljava/lang/Integer;)Lcom/untis/mobile/persistence/models/EntityType;", "Lcom/untis/mobile/dashboard/persistence/model/reminder/ReminderType;", "reminderType", "", "k", "(Lcom/untis/mobile/dashboard/persistence/model/reminder/ReminderType;)Ljava/lang/Long;", "id", "f", "(Ljava/lang/Long;)Lcom/untis/mobile/dashboard/persistence/model/reminder/ReminderType;", "Lcom/untis/mobile/dashboard/persistence/model/reminder/ReminderSubtype;", "reminderSubtype", "j", "(Lcom/untis/mobile/dashboard/persistence/model/reminder/ReminderSubtype;)Ljava/lang/Long;", "e", "(Ljava/lang/Long;)Lcom/untis/mobile/dashboard/persistence/model/reminder/ReminderSubtype;", "", "Lcom/untis/mobile/dashboard/persistence/model/Attachment;", "attachments", "", "a", "json", "g", "longList", "i", "h", "Lcom/google/gson/Gson;", "G", "Lkotlin/b0;", "c", "()Lcom/google/gson/Gson;", "gson", "<init>", "()V", "H", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class b implements c
{
    @e
    public static final a H;
    @e
    private static final Class<ArrayList<Long>> I;
    @e
    private static final Class<ArrayList<Attachment>> J;
    @e
    private final b0 G;
    
    static {
        H = new a(null);
        I = new ArrayList().getClass();
        J = new ArrayList().getClass();
    }
    
    public b() {
        this.G = d0.c((n6.a<?>)new n6.a<Gson>() {
            final /* synthetic */ org.koin.core.scope.a G = ((c)this).getKoin().y();
            
            @Override
            public final Gson invoke() {
                return (Gson)this.G.t(k1.d(Gson.class), null, null);
            }
        });
    }
    
    private final Gson c() {
        return this.G.getValue();
    }
    
    @f3
    @f
    public final String a(@f final List<Attachment> list) {
        final String s = "[]";
        if (list == null) {
            return "[]";
        }
        try {
            return this.c().toJson(list);
        }
        catch (Exception ex) {
            return s;
        }
    }
    
    @f3
    @f
    public final Integer b(@f final EntityType entityType) {
        Integer value;
        if (entityType == null) {
            value = null;
        }
        else {
            value = entityType.getWebuntisId();
        }
        return value;
    }
    
    @f3
    @f
    public final EntityType d(@f final Integer n) {
        return EntityType.Companion.findBy(n);
    }
    
    @f3
    @f
    public final ReminderSubtype e(@f final Long n) {
        return ReminderSubtype.Companion.findById(n);
    }
    
    @f3
    @f
    public final ReminderType f(@f final Long n) {
        return ReminderType.Companion.findById(n);
    }
    
    @f3
    @f
    public final List<Attachment> g(@f final String s) {
        if (s == null) {
            return v.E();
        }
        List<Attachment> e;
        try {
            e = this.c().fromJson(s, b.J);
        }
        catch (Exception ex) {
            e = v.E();
        }
        return e;
    }
    
    @e
    public org.koin.core.a getKoin() {
        return c$a.a((c)this);
    }
    
    @f3
    @f
    public final List<Long> h(@f final String s) {
        if (s == null) {
            return v.E();
        }
        List<Long> e;
        try {
            e = this.c().fromJson(s, b.I);
        }
        catch (Exception ex) {
            e = v.E();
        }
        return e;
    }
    
    @f3
    @f
    public final String i(@f final List<Long> list) {
        final String s = "[]";
        if (list == null) {
            return "[]";
        }
        try {
            return this.c().toJson(list);
        }
        catch (Exception ex) {
            return s;
        }
    }
    
    @f3
    @f
    public final Long j(@f final ReminderSubtype reminderSubtype) {
        Long value;
        if (reminderSubtype == null) {
            value = null;
        }
        else {
            value = reminderSubtype.getId();
        }
        return value;
    }
    
    @f3
    @f
    public final Long k(@f final ReminderType reminderType) {
        Long value;
        if (reminderType == null) {
            value = null;
        }
        else {
            value = reminderType.getId();
        }
        return value;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR,\u0010\u0006\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00050\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R,\u0010\t\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0003j\b\u0012\u0004\u0012\u00020\b`\u00050\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007¨\u0006\f" }, d2 = { "com/untis/mobile/utils/persistence/typeconverter/b$a", "", "Ljava/lang/Class;", "Ljava/util/ArrayList;", "Lcom/untis/mobile/dashboard/persistence/model/Attachment;", "Lkotlin/collections/ArrayList;", "attachmentListType", "Ljava/lang/Class;", "", "longListType", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
    }
}
