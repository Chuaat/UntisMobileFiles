// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile;

import org.koin.core.c$a;
import org.koin.core.a;
import kotlin.jvm.internal.k0;
import com.untis.mobile.utils.extension.k;
import com.untis.mobile.persistence.models.profile.Profile;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import org.koin.core.c;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\t" }, d2 = { "Lcom/untis/mobile/b;", "Lorg/koin/core/c;", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "", "a", "b", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class b implements c
{
    @e
    public static final b G;
    
    static {
        G = new b();
    }
    
    private b() {
    }
    
    private final boolean a(final Profile profile) {
        return (profile.getShowCalendarDetails() || !profile.isAnonymousUser()) && k.d(profile, 2021, 4, 0, 4, null);
    }
    
    public final boolean b(@e final Profile profile) {
        k0.p(profile, "profile");
        return this.a(profile);
    }
    
    @e
    public a getKoin() {
        return c$a.a((c)this);
    }
}
