// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.profile;

import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import org.jetbrains.annotations.f;
import com.untis.mobile.persistence.models.profile.Profile;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001BQ\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010$\u001a\u00020\u001f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0002\u0012\b\b\u0002\u0010&\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b'\u0010(R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0013\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0011\u0010\u0005\"\u0004\b\u0012\u0010\u0007R$\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\u001c\u0010\u0005\"\u0004\b\u001d\u0010\u0007R\"\u0010$\u001a\u00020\u001f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010 \u001a\u0004\b\u0015\u0010!\"\u0004\b\"\u0010#R\"\u0010&\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0004\u001a\u0004\b\n\u0010\u0005\"\u0004\b%\u0010\u0007¨\u0006)" }, d2 = { "Lcom/untis/mobile/ui/activities/profile/c0;", "", "", "d", "Ljava/lang/String;", "()Ljava/lang/String;", "k", "(Ljava/lang/String;)V", "schoolUrl", "", "g", "Ljava/lang/Throwable;", "e", "()Ljava/lang/Throwable;", "l", "(Ljava/lang/Throwable;)V", "throwable", "c", "j", "schoolLogin", "Lcom/untis/mobile/persistence/models/profile/Profile;", "a", "Lcom/untis/mobile/persistence/models/profile/Profile;", "b", "()Lcom/untis/mobile/persistence/models/profile/Profile;", "i", "(Lcom/untis/mobile/persistence/models/profile/Profile;)V", "profile", "f", "m", "userLogin", "", "Z", "()Z", "h", "(Z)V", "locked", "n", "userSecret", "<init>", "(Lcom/untis/mobile/persistence/models/profile/Profile;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class c0
{
    @f
    private Profile a;
    private boolean b;
    @e
    private String c;
    @e
    private String d;
    @e
    private String e;
    @e
    private String f;
    @f
    private Throwable g;
    
    public c0() {
        this(null, false, null, null, null, null, null, 127, null);
    }
    
    public c0(@f final Profile a, final boolean b, @e final String c, @e final String d, @e final String e, @e final String f, @f final Throwable g) {
        k0.p(c, "schoolLogin");
        k0.p(d, "schoolUrl");
        k0.p(e, "userLogin");
        k0.p(f, "userSecret");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public final boolean a() {
        return this.b;
    }
    
    @f
    public final Profile b() {
        return this.a;
    }
    
    @e
    public final String c() {
        return this.c;
    }
    
    @e
    public final String d() {
        return this.d;
    }
    
    @f
    public final Throwable e() {
        return this.g;
    }
    
    @e
    public final String f() {
        return this.e;
    }
    
    @e
    public final String g() {
        return this.f;
    }
    
    public final void h(final boolean b) {
        this.b = b;
    }
    
    public final void i(@f final Profile a) {
        this.a = a;
    }
    
    public final void j(@e final String c) {
        k0.p(c, "<set-?>");
        this.c = c;
    }
    
    public final void k(@e final String d) {
        k0.p(d, "<set-?>");
        this.d = d;
    }
    
    public final void l(@f final Throwable g) {
        this.g = g;
    }
    
    public final void m(@e final String e) {
        k0.p(e, "<set-?>");
        this.e = e;
    }
    
    public final void n(@e final String f) {
        k0.p(f, "<set-?>");
        this.f = f;
    }
}
