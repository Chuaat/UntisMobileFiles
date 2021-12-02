// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.firebase.model;

import a4.a;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u00c6\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004H\u00c6\u0001J\t\u0010\t\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\u000b\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\"\u0010\u0007\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001b" }, d2 = { "Lcom/untis/mobile/firebase/model/d;", "", "", "a", "", "b", "tenantId", "userId", "c", "toString", "", "hashCode", "other", "", "equals", "J", "f", "()J", "h", "(J)V", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "g", "(Ljava/lang/String;)V", "<init>", "(Ljava/lang/String;J)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class d
{
    @SerializedName("tenantId")
    @e
    private String a;
    @SerializedName("userId")
    private long b;
    
    public d(@e final String a, final long b) {
        k0.p(a, "tenantId");
        this.a = a;
        this.b = b;
    }
    
    @e
    public final String a() {
        return this.a;
    }
    
    public final long b() {
        return this.b;
    }
    
    @e
    public final d c(@e final String s, final long n) {
        k0.p(s, "tenantId");
        return new d(s, n);
    }
    
    @e
    public final String e() {
        return this.a;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof d)) {
            return false;
        }
        final d d = (d)o;
        return k0.g(this.a, d.a) && this.b == d.b;
    }
    
    public final long f() {
        return this.b;
    }
    
    public final void g(@e final String a) {
        k0.p(a, "<set-?>");
        this.a = a;
    }
    
    public final void h(final long b) {
        this.b = b;
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode() * 31 + a4.a.a(this.b);
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("FcmProfile(tenantId=");
        sb.append(this.a);
        sb.append(", userId=");
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
