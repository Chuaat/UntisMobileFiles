// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.realmToModel.infocenter;

import a4.a;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import org.joda.time.v;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0006\u001a\u00020\u0004H\u00c6\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0004H\u00c6\u0001J\t\u0010\f\u001a\u00020\u000bH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\rH\u00d6\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\"\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u001c\u0010\u0014\"\u0004\b\u001d\u0010\u0016¨\u0006 " }, d2 = { "Lcom/untis/mobile/utils/mapper/realmToModel/infocenter/f;", "", "", "a", "Lorg/joda/time/v;", "b", "c", "teacherId", "start", "end", "d", "", "toString", "", "hashCode", "other", "", "equals", "Lorg/joda/time/v;", "f", "()Lorg/joda/time/v;", "i", "(Lorg/joda/time/v;)V", "J", "h", "()J", "k", "(J)V", "g", "j", "<init>", "(JLorg/joda/time/v;Lorg/joda/time/v;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class f
{
    private long a;
    @e
    private v b;
    @e
    private v c;
    
    public f(final long a, @e final v b, @e final v c) {
        k0.p(b, "start");
        k0.p(c, "end");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final long a() {
        return this.a;
    }
    
    @e
    public final v b() {
        return this.b;
    }
    
    @e
    public final v c() {
        return this.c;
    }
    
    @e
    public final f d(final long n, @e final v v, @e final v v2) {
        k0.p(v, "start");
        k0.p(v2, "end");
        return new f(n, v, v2);
    }
    
    @Override
    public boolean equals(@org.jetbrains.annotations.f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof f)) {
            return false;
        }
        final f f = (f)o;
        return this.a == f.a && k0.g(this.b, f.b) && k0.g(this.c, f.c);
    }
    
    @e
    public final v f() {
        return this.c;
    }
    
    @e
    public final v g() {
        return this.b;
    }
    
    public final long h() {
        return this.a;
    }
    
    @Override
    public int hashCode() {
        return (a4.a.a(this.a) * 31 + ((org.joda.time.base.e)this.b).hashCode()) * 31 + ((org.joda.time.base.e)this.c).hashCode();
    }
    
    public final void i(@e final v c) {
        k0.p(c, "<set-?>");
        this.c = c;
    }
    
    public final void j(@e final v b) {
        k0.p(b, "<set-?>");
        this.b = b;
    }
    
    public final void k(final long a) {
        this.a = a;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("InfoCenterInvigilator(teacherId=");
        sb.append(this.a);
        sb.append(", start=");
        sb.append(this.b);
        sb.append(", end=");
        sb.append(this.c);
        sb.append(')');
        return sb.toString();
    }
}
