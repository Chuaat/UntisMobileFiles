// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.core;

import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import com.untis.mobile.persistence.models.profile.Profile;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b \u0010!J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0006\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\b\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\t\u001a\u00020\u0007H\u00c6\u0003J;\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u0007H\u00c6\u0001J\t\u0010\u0011\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0007H\u00d6\u0001J\u0013\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0019\u0010\n\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u000e\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u000b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u0019\u0010\r\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001f\u0010\u001d¨\u0006\"" }, d2 = { "Lcom/untis/mobile/ui/core/c;", "", "Lcom/untis/mobile/persistence/models/profile/Profile;", "a", "", "b", "c", "", "d", "e", "profile", "infoCenter", "messages", "messagesCount", "notificationCount", "f", "", "toString", "hashCode", "other", "equals", "Lcom/untis/mobile/persistence/models/profile/Profile;", "l", "()Lcom/untis/mobile/persistence/models/profile/Profile;", "Z", "i", "()Z", "I", "k", "()I", "h", "j", "<init>", "(Lcom/untis/mobile/persistence/models/profile/Profile;ZZII)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class c
{
    @e
    private final Profile a;
    private final boolean b;
    private final boolean c;
    private final int d;
    private final int e;
    
    public c(@e final Profile a, final boolean b, final boolean c, final int d, final int e) {
        k0.p(a, "profile");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @e
    public final Profile a() {
        return this.a;
    }
    
    public final boolean b() {
        return this.b;
    }
    
    public final boolean c() {
        return this.c;
    }
    
    public final int d() {
        return this.d;
    }
    
    public final int e() {
        return this.e;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof c)) {
            return false;
        }
        final c c = (c)o;
        return k0.g(this.a, c.a) && this.b == c.b && this.c == c.c && this.d == c.d && this.e == c.e;
    }
    
    @e
    public final c f(@e final Profile profile, final boolean b, final boolean b2, final int n, final int n2) {
        k0.p(profile, "profile");
        return new c(profile, b, b2, n, n2);
    }
    
    public final boolean h() {
        return this.b;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.a.hashCode();
        final int b = this.b ? 1 : 0;
        int n = 1;
        int n2 = b;
        if (b != 0) {
            n2 = 1;
        }
        final int c = this.c ? 1 : 0;
        if (c == 0) {
            n = c;
        }
        return (((hashCode * 31 + n2) * 31 + n) * 31 + this.d) * 31 + this.e;
    }
    
    public final boolean i() {
        return this.c;
    }
    
    public final int j() {
        return this.d;
    }
    
    public final int k() {
        return this.e;
    }
    
    @e
    public final Profile l() {
        return this.a;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CoreActivityData(profile=");
        sb.append(this.a);
        sb.append(", infoCenter=");
        sb.append(this.b);
        sb.append(", messages=");
        sb.append(this.c);
        sb.append(", messagesCount=");
        sb.append(this.d);
        sb.append(", notificationCount=");
        sb.append(this.e);
        sb.append(')');
        return sb.toString();
    }
}
