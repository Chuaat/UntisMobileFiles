// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.persistence.typeconverter;

import org.koin.core.c$a;
import kotlin.collections.v;
import com.untis.mobile.dashboard.persistence.model.parentday.DashboardParentDayAppointment;
import com.untis.mobile.dashboard.persistence.model.event.exam.DashboardExamInvigilator;
import com.untis.mobile.dashboard.persistence.model.studentabsence.DashboardExcuse;
import androidx.room.f3;
import org.jetbrains.annotations.f;
import com.untis.mobile.dashboard.persistence.model.contacthour.DashboardContactHourSlot;
import java.util.List;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.m0;
import com.google.gson.Gson;
import com.untis.mobile.utils.extension.h;
import java.util.ArrayList;
import kotlin.jvm.internal.w;
import kotlin.b0;
import java.lang.reflect.Type;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import org.koin.core.c;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u001d2\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0007J\u001a\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0007J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0002H\u0007J\u001a\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0007J\u0014\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0007J\u0014\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\rH\u0007J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0002H\u0007J\u001a\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0007R\u001d\u0010\u001a\u001a\u00020\u00158B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001e" }, d2 = { "Lcom/untis/mobile/utils/persistence/typeconverter/a;", "Lorg/koin/core/c;", "", "Lcom/untis/mobile/dashboard/persistence/model/contacthour/DashboardContactHourSlot;", "slots", "", "a", "json", "f", "Lcom/untis/mobile/dashboard/persistence/model/event/exam/DashboardExamInvigilator;", "invigilators", "c", "h", "Lcom/untis/mobile/dashboard/persistence/model/studentabsence/DashboardExcuse;", "g", "dashboardExcuse", "b", "Lcom/untis/mobile/dashboard/persistence/model/parentday/DashboardParentDayAppointment;", "appointments", "d", "i", "Lcom/google/gson/Gson;", "G", "Lkotlin/b0;", "e", "()Lcom/google/gson/Gson;", "gson", "<init>", "()V", "H", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class a implements c
{
    @e
    public static final a H;
    @e
    private static final Type I;
    @e
    private static final Type J;
    @e
    private static final Type K;
    @e
    private final b0 G;
    
    static {
        H = new a(null);
        I = h.W(new ArrayList());
        J = h.W(new ArrayList());
        K = h.W(new ArrayList());
    }
    
    public a() {
        this.G = d0.c((a<?>)new a<Gson>() {
            final /* synthetic */ org.koin.core.scope.a G = ((c)this).getKoin().y();
            
            @Override
            public final Gson invoke() {
                return (Gson)this.G.t(k1.d(Gson.class), null, null);
            }
        });
    }
    
    private final Gson e() {
        return this.G.getValue();
    }
    
    @f3
    @f
    public final String a(@f final List<DashboardContactHourSlot> list) {
        final String s = "[]";
        if (list == null) {
            return "[]";
        }
        try {
            return this.e().toJson(list);
        }
        catch (Exception ex) {
            return s;
        }
    }
    
    @f3
    @f
    public final String b(@f final DashboardExcuse dashboardExcuse) {
        final String s = null;
        if (dashboardExcuse == null) {
            return null;
        }
        try {
            return this.e().toJson(dashboardExcuse);
        }
        catch (Exception ex) {
            return s;
        }
    }
    
    @f3
    @f
    public final String c(@f final List<DashboardExamInvigilator> list) {
        final String s = "[]";
        if (list == null) {
            return "[]";
        }
        try {
            return this.e().toJson(list);
        }
        catch (Exception ex) {
            return s;
        }
    }
    
    @f3
    @f
    public final String d(@f final List<DashboardParentDayAppointment> list) {
        final String s = "[]";
        if (list == null) {
            return "[]";
        }
        try {
            return this.e().toJson(list);
        }
        catch (Exception ex) {
            return s;
        }
    }
    
    @f3
    @f
    public final List<DashboardContactHourSlot> f(@f final String s) {
        if (s == null) {
            return v.E();
        }
        List<DashboardContactHourSlot> e;
        try {
            e = this.e().fromJson(s, a.I);
        }
        catch (Exception ex) {
            e = v.E();
        }
        return e;
    }
    
    @f3
    @f
    public final DashboardExcuse g(@f final String s) {
        final DashboardExcuse dashboardExcuse = null;
        if (s == null) {
            return null;
        }
        try {
            return this.e().fromJson(s, DashboardExcuse.class);
        }
        catch (Exception ex) {
            return dashboardExcuse;
        }
    }
    
    @e
    public org.koin.core.a getKoin() {
        return c$a.a((c)this);
    }
    
    @f3
    @f
    public final List<DashboardExamInvigilator> h(@f final String s) {
        if (s == null) {
            return v.E();
        }
        List<DashboardExamInvigilator> e;
        try {
            e = this.e().fromJson(s, a.J);
        }
        catch (Exception ex) {
            e = v.E();
        }
        return e;
    }
    
    @f3
    @f
    public final List<DashboardParentDayAppointment> i(@f final String s) {
        if (s == null) {
            return v.E();
        }
        List<DashboardParentDayAppointment> e;
        try {
            e = this.e().fromJson(s, a.K);
        }
        catch (Exception ex) {
            e = v.E();
        }
        return e;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t" }, d2 = { "com/untis/mobile/utils/persistence/typeconverter/a$a", "", "Ljava/lang/reflect/Type;", "dashboardAppointmentListType", "Ljava/lang/reflect/Type;", "dashboardContactHourSlotListType", "dashboardInvigilatorListType", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
    }
}
