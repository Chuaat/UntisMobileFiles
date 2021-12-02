// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.persistence.model.parentday;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.util.List;
import org.jetbrains.annotations.f;
import org.joda.time.r;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0017\u0010\u0018R(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0011\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R$\u0010\u0014\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010¨\u0006\u0019" }, d2 = { "Lcom/untis/mobile/dashboard/persistence/model/parentday/DashboardParentDayAppointmentBlock;", "", "", "Lcom/untis/mobile/dashboard/persistence/model/parentday/DashboardParentDayAppointment;", "appointments", "Ljava/util/List;", "getAppointments", "()Ljava/util/List;", "setAppointments", "(Ljava/util/List;)V", "Lorg/joda/time/r;", "beforeFree", "Lorg/joda/time/r;", "getBeforeFree", "()Lorg/joda/time/r;", "setBeforeFree", "(Lorg/joda/time/r;)V", "afterFree", "getAfterFree", "setAfterFree", "interval", "getInterval", "setInterval", "<init>", "(Lorg/joda/time/r;Lorg/joda/time/r;Lorg/joda/time/r;Ljava/util/List;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class DashboardParentDayAppointmentBlock
{
    @f
    private r afterFree;
    @e
    private List<DashboardParentDayAppointment> appointments;
    @f
    private r beforeFree;
    @f
    private r interval;
    
    public DashboardParentDayAppointmentBlock(@f final r beforeFree, @f final r interval, @f final r afterFree, @e final List<DashboardParentDayAppointment> appointments) {
        k0.p(appointments, "appointments");
        this.beforeFree = beforeFree;
        this.interval = interval;
        this.afterFree = afterFree;
        this.appointments = appointments;
    }
    
    @f
    public final r getAfterFree() {
        return this.afterFree;
    }
    
    @e
    public final List<DashboardParentDayAppointment> getAppointments() {
        return this.appointments;
    }
    
    @f
    public final r getBeforeFree() {
        return this.beforeFree;
    }
    
    @f
    public final r getInterval() {
        return this.interval;
    }
    
    public final void setAfterFree(@f final r afterFree) {
        this.afterFree = afterFree;
    }
    
    public final void setAppointments(@e final List<DashboardParentDayAppointment> appointments) {
        k0.p(appointments, "<set-?>");
        this.appointments = appointments;
    }
    
    public final void setBeforeFree(@f final r beforeFree) {
        this.beforeFree = beforeFree;
    }
    
    public final void setInterval(@f final r interval) {
        this.interval = interval;
    }
}
