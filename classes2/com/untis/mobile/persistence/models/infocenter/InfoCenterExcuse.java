// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.infocenter;

import a4.a;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import org.joda.time.t;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b)\u0010*J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0004\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0006\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0007\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\t\u001a\u00020\bH\u00c6\u0003J;\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\bH\u00c6\u0001J\t\u0010\u0010\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\"\u0010\r\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR\"\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010\u000e\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(¨\u0006+" }, d2 = { "Lcom/untis/mobile/persistence/models/infocenter/InfoCenterExcuse;", "", "", "component1", "component2", "", "component3", "component4", "Lorg/joda/time/t;", "component5", "id", "excuseStatusId", "text", "number", "date", "copy", "toString", "", "hashCode", "other", "", "equals", "J", "getId", "()J", "setId", "(J)V", "getExcuseStatusId", "setExcuseStatusId", "getNumber", "setNumber", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "Lorg/joda/time/t;", "getDate", "()Lorg/joda/time/t;", "setDate", "(Lorg/joda/time/t;)V", "<init>", "(JJLjava/lang/String;JLorg/joda/time/t;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class InfoCenterExcuse
{
    @e
    private t date;
    private long excuseStatusId;
    private long id;
    private long number;
    @e
    private String text;
    
    public InfoCenterExcuse(final long id, final long excuseStatusId, @e final String text, final long number, @e final t date) {
        k0.p(text, "text");
        k0.p(date, "date");
        this.id = id;
        this.excuseStatusId = excuseStatusId;
        this.text = text;
        this.number = number;
        this.date = date;
    }
    
    public final long component1() {
        return this.id;
    }
    
    public final long component2() {
        return this.excuseStatusId;
    }
    
    @e
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
    public final InfoCenterExcuse copy(final long n, final long n2, @e final String s, final long n3, @e final t t) {
        k0.p(s, "text");
        k0.p(t, "date");
        return new InfoCenterExcuse(n, n2, s, n3, t);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InfoCenterExcuse)) {
            return false;
        }
        final InfoCenterExcuse infoCenterExcuse = (InfoCenterExcuse)o;
        return this.id == infoCenterExcuse.id && this.excuseStatusId == infoCenterExcuse.excuseStatusId && k0.g(this.text, infoCenterExcuse.text) && this.number == infoCenterExcuse.number && k0.g(this.date, infoCenterExcuse.date);
    }
    
    @e
    public final t getDate() {
        return this.date;
    }
    
    public final long getExcuseStatusId() {
        return this.excuseStatusId;
    }
    
    public final long getId() {
        return this.id;
    }
    
    public final long getNumber() {
        return this.number;
    }
    
    @e
    public final String getText() {
        return this.text;
    }
    
    @Override
    public int hashCode() {
        return (((a.a(this.id) * 31 + a.a(this.excuseStatusId)) * 31 + this.text.hashCode()) * 31 + a.a(this.number)) * 31 + this.date.hashCode();
    }
    
    public final void setDate(@e final t date) {
        k0.p(date, "<set-?>");
        this.date = date;
    }
    
    public final void setExcuseStatusId(final long excuseStatusId) {
        this.excuseStatusId = excuseStatusId;
    }
    
    public final void setId(final long id) {
        this.id = id;
    }
    
    public final void setNumber(final long number) {
        this.number = number;
    }
    
    public final void setText(@e final String text) {
        k0.p(text, "<set-?>");
        this.text = text;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("InfoCenterExcuse(id=");
        sb.append(this.id);
        sb.append(", excuseStatusId=");
        sb.append(this.excuseStatusId);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", number=");
        sb.append(this.number);
        sb.append(", date=");
        sb.append(this.date);
        sb.append(')');
        return sb.toString();
    }
}
