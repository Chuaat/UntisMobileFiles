// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.persistence.model.studentabsence;

import a4.a;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import com.google.gson.annotations.SerializedName;
import t5.d;
import com.google.gson.annotations.JsonAdapter;
import org.joda.time.t;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b)\u0010*J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0004\u001a\u00020\u0002H\u00c6\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\u0007\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\t\u001a\u00020\bH\u00c6\u0003J=\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\bH\u00c6\u0001J\t\u0010\u0010\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR\"\u0010\u000e\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006+" }, d2 = { "Lcom/untis/mobile/dashboard/persistence/model/studentabsence/DashboardExcuse;", "", "", "component1", "component2", "", "component3", "component4", "Lorg/joda/time/t;", "component5", "id", "statusId", "text", "number", "date", "copy", "toString", "", "hashCode", "other", "", "equals", "J", "getStatusId", "()J", "setStatusId", "(J)V", "getNumber", "setNumber", "getId", "setId", "Lorg/joda/time/t;", "getDate", "()Lorg/joda/time/t;", "setDate", "(Lorg/joda/time/t;)V", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "<init>", "(JJLjava/lang/String;JLorg/joda/time/t;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class DashboardExcuse
{
    @JsonAdapter(d.class)
    @SerializedName("date")
    @e
    private t date;
    @SerializedName("id")
    private long id;
    @SerializedName("number")
    private long number;
    @SerializedName("excuseStatusId")
    private long statusId;
    @SerializedName("text")
    @f
    private String text;
    
    public DashboardExcuse(final long id, final long statusId, @f final String text, final long number, @e final t date) {
        k0.p(date, "date");
        this.id = id;
        this.statusId = statusId;
        this.text = text;
        this.number = number;
        this.date = date;
    }
    
    public final long component1() {
        return this.id;
    }
    
    public final long component2() {
        return this.statusId;
    }
    
    @f
    public final String component3() {
        return this.text;
    }
    
    public final long component4() {
        return this.number;
    }
    
    @e
    public final t component5() {
        return this.date;
    }
    
    @e
    public final DashboardExcuse copy(final long n, final long n2, @f final String s, final long n3, @e final t t) {
        k0.p(t, "date");
        return new DashboardExcuse(n, n2, s, n3, t);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DashboardExcuse)) {
            return false;
        }
        final DashboardExcuse dashboardExcuse = (DashboardExcuse)o;
        return this.id == dashboardExcuse.id && this.statusId == dashboardExcuse.statusId && k0.g(this.text, dashboardExcuse.text) && this.number == dashboardExcuse.number && k0.g(this.date, dashboardExcuse.date);
    }
    
    @e
    public final t getDate() {
        return this.date;
    }
    
    public final long getId() {
        return this.id;
    }
    
    public final long getNumber() {
        return this.number;
    }
    
    public final long getStatusId() {
        return this.statusId;
    }
    
    @f
    public final String getText() {
        return this.text;
    }
    
    @Override
    public int hashCode() {
        final int a = a4.a.a(this.id);
        final int a2 = a4.a.a(this.statusId);
        final String text = this.text;
        int hashCode;
        if (text == null) {
            hashCode = 0;
        }
        else {
            hashCode = text.hashCode();
        }
        return (((a * 31 + a2) * 31 + hashCode) * 31 + a4.a.a(this.number)) * 31 + this.date.hashCode();
    }
    
    public final void setDate(@e final t date) {
        k0.p(date, "<set-?>");
        this.date = date;
    }
    
    public final void setId(final long id) {
        this.id = id;
    }
    
    public final void setNumber(final long number) {
        this.number = number;
    }
    
    public final void setStatusId(final long statusId) {
        this.statusId = statusId;
    }
    
    public final void setText(@f final String text) {
        this.text = text;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("DashboardExcuse(id=");
        sb.append(this.id);
        sb.append(", statusId=");
        sb.append(this.statusId);
        sb.append(", text=");
        sb.append((Object)this.text);
        sb.append(", number=");
        sb.append(this.number);
        sb.append(", date=");
        sb.append(this.date);
        sb.append(')');
        return sb.toString();
    }
}
