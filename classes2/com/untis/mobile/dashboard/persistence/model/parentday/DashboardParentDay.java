// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.persistence.model.parentday;

import a4.a;
import kotlin.jvm.internal.k0;
import androidx.room.l1;
import org.jetbrains.annotations.e;
import com.google.gson.annotations.SerializedName;
import t5.b;
import com.google.gson.annotations.JsonAdapter;
import org.joda.time.c;
import org.jetbrains.annotations.f;
import androidx.room.i0;
import java.util.List;
import androidx.room.s0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0006¢\u0006\u0004\b-\u0010.J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0007\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\b\u001a\u00020\u0006H\u00c6\u0003J1\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u0006H\u00c6\u0001J\t\u0010\u000e\u001a\u00020\u0004H\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\n\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR*\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010\f\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u0010\u000b\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010&\u001a\u0004\b+\u0010(\"\u0004\b,\u0010*¨\u0006/" }, d2 = { "Lcom/untis/mobile/dashboard/persistence/model/parentday/DashboardParentDay;", "", "", "component1", "", "component2", "Lorg/joda/time/c;", "component3", "component4", "id", "name", "start", "end", "copy", "toString", "", "hashCode", "other", "", "equals", "J", "getId", "()J", "setId", "(J)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "", "Lcom/untis/mobile/dashboard/persistence/model/parentday/DashboardParentDayAppointment;", "appointments", "Ljava/util/List;", "getAppointments", "()Ljava/util/List;", "setAppointments", "(Ljava/util/List;)V", "Lorg/joda/time/c;", "getEnd", "()Lorg/joda/time/c;", "setEnd", "(Lorg/joda/time/c;)V", "getStart", "setStart", "<init>", "(JLjava/lang/String;Lorg/joda/time/c;Lorg/joda/time/c;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
@s0(tableName = "dashboard_parent_day")
public final class DashboardParentDay
{
    @i0(name = "appointments")
    @f
    private List<DashboardParentDayAppointment> appointments;
    @JsonAdapter(b.class)
    @SerializedName("endDateTime")
    @i0(name = "end")
    @e
    private c end;
    @SerializedName("id")
    @i0(name = "parent_day_id")
    @l1
    private long id;
    @SerializedName("name")
    @i0(name = "name")
    @e
    private String name;
    @JsonAdapter(b.class)
    @SerializedName("startDateTime")
    @i0(name = "start")
    @e
    private c start;
    
    public DashboardParentDay(final long id, @e final String name, @e final c start, @e final c end) {
        k0.p(name, "name");
        k0.p(start, "start");
        k0.p(end, "end");
        this.id = id;
        this.name = name;
        this.start = start;
        this.end = end;
    }
    
    public final long component1() {
        return this.id;
    }
    
    @e
    public final String component2() {
        return this.name;
    }
    
    @e
    public final c component3() {
        return this.start;
    }
    
    @e
    public final c component4() {
        return this.end;
    }
    
    @e
    public final DashboardParentDay copy(final long n, @e final String s, @e final c c, @e final c c2) {
        k0.p(s, "name");
        k0.p(c, "start");
        k0.p(c2, "end");
        return new DashboardParentDay(n, s, c, c2);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DashboardParentDay)) {
            return false;
        }
        final DashboardParentDay dashboardParentDay = (DashboardParentDay)o;
        return this.id == dashboardParentDay.id && k0.g(this.name, dashboardParentDay.name) && k0.g(this.start, dashboardParentDay.start) && k0.g(this.end, dashboardParentDay.end);
    }
    
    @f
    public final List<DashboardParentDayAppointment> getAppointments() {
        return this.appointments;
    }
    
    @e
    public final c getEnd() {
        return this.end;
    }
    
    public final long getId() {
        return this.id;
    }
    
    @e
    public final String getName() {
        return this.name;
    }
    
    @e
    public final c getStart() {
        return this.start;
    }
    
    @Override
    public int hashCode() {
        return ((a.a(this.id) * 31 + this.name.hashCode()) * 31 + ((org.joda.time.base.c)this.start).hashCode()) * 31 + ((org.joda.time.base.c)this.end).hashCode();
    }
    
    public final void setAppointments(@f final List<DashboardParentDayAppointment> appointments) {
        this.appointments = appointments;
    }
    
    public final void setEnd(@e final c end) {
        k0.p(end, "<set-?>");
        this.end = end;
    }
    
    public final void setId(final long id) {
        this.id = id;
    }
    
    public final void setName(@e final String name) {
        k0.p(name, "<set-?>");
        this.name = name;
    }
    
    public final void setStart(@e final c start) {
        k0.p(start, "<set-?>");
        this.start = start;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("DashboardParentDay(id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", start=");
        sb.append(this.start);
        sb.append(", end=");
        sb.append(this.end);
        sb.append(')');
        return sb.toString();
    }
}
