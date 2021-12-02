// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.calendar.ui;

import com.untis.mobile.services.profile.legacy.j0;
import kotlin.collections.v;
import kotlin.jvm.internal.k0;
import org.joda.time.c;
import org.jetbrains.annotations.f;
import com.untis.mobile.persistence.models.EntityType;
import java.util.List;
import com.untis.mobile.persistence.models.profile.Profile;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import androidx.lifecycle.w0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b7\u00108J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR(\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0019\u0010\u001b\u001a\u00020\u00168\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010 \u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u0007\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010'\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010-\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010)\u001a\u0004\b\u0017\u0010*\"\u0004\b+\u0010,R$\u00101\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010)\u001a\u0004\b/\u0010*\"\u0004\b0\u0010,R$\u00106\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00102\u001a\u0004\b.\u00103\"\u0004\b4\u00105¨\u00069" }, d2 = { "Lcom/untis/mobile/calendar/ui/a;", "Landroidx/lifecycle/w0;", "", "profileId", "Lkotlin/j2;", "m", "Lcom/untis/mobile/persistence/models/profile/Profile;", "b", "Lcom/untis/mobile/persistence/models/profile/Profile;", "d", "()Lcom/untis/mobile/persistence/models/profile/Profile;", "l", "(Lcom/untis/mobile/persistence/models/profile/Profile;)V", "profile", "", "", "Ljava/util/List;", "c", "()Ljava/util/List;", "k", "(Ljava/util/List;)V", "periodIds", "Lcom/untis/mobile/services/profile/legacy/a;", "a", "Lcom/untis/mobile/services/profile/legacy/a;", "e", "()Lcom/untis/mobile/services/profile/legacy/a;", "profileService", "J", "()J", "j", "(J)V", "periodId", "Lcom/untis/mobile/persistence/models/EntityType;", "Lcom/untis/mobile/persistence/models/EntityType;", "h", "()Lcom/untis/mobile/persistence/models/EntityType;", "p", "(Lcom/untis/mobile/persistence/models/EntityType;)V", "timetableEntityType", "Lorg/joda/time/c;", "Lorg/joda/time/c;", "()Lorg/joda/time/c;", "i", "(Lorg/joda/time/c;)V", "end", "g", "f", "n", "start", "Ljava/lang/Long;", "()Ljava/lang/Long;", "o", "(Ljava/lang/Long;)V", "timetableEntityId", "<init>", "(Lcom/untis/mobile/services/profile/legacy/a;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class a extends w0
{
    @e
    private final com.untis.mobile.services.profile.legacy.a a;
    public Profile b;
    private long c;
    @e
    private List<Long> d;
    @f
    private EntityType e;
    @f
    private Long f;
    @f
    private c g;
    @f
    private c h;
    
    public a(@e final com.untis.mobile.services.profile.legacy.a a) {
        k0.p(a, "profileService");
        this.a = a;
        this.d = v.E();
    }
    
    @f
    public final c a() {
        return this.h;
    }
    
    public final long b() {
        return this.c;
    }
    
    @e
    public final List<Long> c() {
        return this.d;
    }
    
    @e
    public final Profile d() {
        final Profile b = this.b;
        if (b != null) {
            return b;
        }
        k0.S("profile");
        throw null;
    }
    
    @e
    public final com.untis.mobile.services.profile.legacy.a e() {
        return this.a;
    }
    
    @f
    public final c f() {
        return this.g;
    }
    
    @f
    public final Long g() {
        return this.f;
    }
    
    @f
    public final EntityType h() {
        return this.e;
    }
    
    public final void i(@f final c h) {
        this.h = h;
    }
    
    public final void j(final long c) {
        this.c = c;
    }
    
    public final void k(@e final List<Long> d) {
        k0.p(d, "<set-?>");
        this.d = d;
    }
    
    public final void l(@e final Profile b) {
        k0.p(b, "<set-?>");
        this.b = b;
    }
    
    public final void m(@e final String s) throws IllegalArgumentException {
        k0.p(s, "profileId");
        final Profile l = j0.G.l(s);
        if (l != null) {
            this.l(l);
            return;
        }
        throw new IllegalArgumentException("no valid profile");
    }
    
    public final void n(@f final c g) {
        this.g = g;
    }
    
    public final void o(@f final Long f) {
        this.f = f;
    }
    
    public final void p(@f final EntityType e) {
        this.e = e;
    }
}
