// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.firebase;

import java.util.Iterator;
import com.untis.mobile.persistence.models.profile.Profile;
import com.google.android.gms.tasks.f;
import u3.c;
import kotlin.text.s;
import com.untis.mobile.firebase.model.d;
import com.google.android.gms.tasks.m;
import com.google.firebase.remoteconfig.l;
import kotlin.jvm.internal.k0;
import com.google.gson.Gson;
import com.untis.mobile.utils.settings.g;
import org.jetbrains.annotations.e;
import com.untis.mobile.services.profile.legacy.a;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u000b\u001a\u00020\nR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014¨\u0006\u0018" }, d2 = { "Lcom/untis/mobile/firebase/b;", "", "", "json", "Lcom/untis/mobile/firebase/model/d;", "b", "Lcom/untis/mobile/persistence/models/profile/Profile;", "f", "Lcom/untis/mobile/firebase/model/b;", "e", "Lkotlin/j2;", "c", "Lcom/untis/mobile/services/profile/legacy/a;", "a", "Lcom/untis/mobile/services/profile/legacy/a;", "profileService", "Lcom/google/gson/Gson;", "Lcom/google/gson/Gson;", "gson", "Lcom/untis/mobile/utils/settings/g;", "Lcom/untis/mobile/utils/settings/g;", "settings", "<init>", "(Lcom/untis/mobile/services/profile/legacy/a;Lcom/untis/mobile/utils/settings/g;Lcom/google/gson/Gson;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class b
{
    @e
    private final a a;
    @e
    private final g b;
    @e
    private final Gson c;
    
    public b(@e final a a, @e final g b, @e final Gson c) {
        k0.p(a, "profileService");
        k0.p(b, "settings");
        k0.p(c, "gson");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    private final d b(final String s) {
        final boolean b = s == null || s.U1((CharSequence)s);
        final d d = null;
        if (b) {
            return null;
        }
        try {
            return this.c.fromJson(s, d.class);
        }
        catch (Exception ex) {
            return d;
        }
    }
    
    private static final void d(final l l, final b b, final m m) {
        k0.p(l, "$remoteConfig");
        k0.p(b, "this$0");
        k0.p(m, "it");
        if (m.v()) {
            final long n = l.n("timetableRefreshSeconds");
            b.b(k0.C("set RemoteConfigTimetableRefreshSeconds: ", n), new Object[0]);
            final g b2 = b.b;
            final g.a a = g.a;
            g.b.i(b2, a.k(), n, 0L, 4, null);
            final long n2 = l.n("timetableForceReloadSeconds");
            b.b(k0.C("set RemoteConfigTimetableForceReloadSeconds: ", n2), new Object[0]);
            g.b.i(b.b, a.j(), n2, 0L, 4, null);
            final long n3 = l.n("dataUpdateSeconds");
            b.b(k0.C("set RemoteConfigDataUpdateSeconds: ", n3), new Object[0]);
            g.b.i(b.b, a.g(), n3, 0L, 4, null);
            final long n4 = l.n("dataUpdateWithoutSchoolyearSeconds");
            b.b(k0.C("set RemoteConfigDataUpdateWithoutSchoolyearSeconds: ", n4), new Object[0]);
            g.b.i(b.b, a.h(), n4, 0L, 4, null);
            final long n5 = l.n("spVersion");
            b.b(k0.C("set spVersion: ", n5), new Object[0]);
            g.b.i(b.b, a.i(), n5, 0L, 4, null);
        }
    }
    
    public final void c() {
        final l b = u3.c.b(com.google.firebase.ktx.b.a);
        b.C(2132082690);
        b.f().e((f)new com.untis.mobile.firebase.a(b, this));
    }
    
    @e
    public final com.untis.mobile.firebase.model.b e(@org.jetbrains.annotations.f final String s) {
        if (s == null || s.U1((CharSequence)s)) {
            return new com.untis.mobile.firebase.model.b();
        }
        com.untis.mobile.firebase.model.b b;
        try {
            final com.untis.mobile.firebase.model.b fromJson = this.c.fromJson(s, com.untis.mobile.firebase.model.b.class);
            k0.o(fromJson, "{\n            gson.fromJson(json, FcmActionCollection::class.java)\n        }");
            b = fromJson;
        }
        catch (Exception ex) {
            b = new com.untis.mobile.firebase.model.b();
        }
        return b;
    }
    
    @org.jetbrains.annotations.f
    public final Profile f(@org.jetbrains.annotations.f final String s) {
        final d b = this.b(s);
        final Profile profile = null;
        if (b == null) {
            return null;
        }
        final Iterator<Object> iterator = this.a.g().iterator();
        Profile profile2;
        Profile next;
        do {
            next = profile;
            if (!iterator.hasNext()) {
                break;
            }
            next = iterator.next();
            profile2 = next;
        } while (!k0.g(profile2.getSchoolLogin(), b.e()) || profile2.getUserId() != b.f());
        return next;
    }
}
