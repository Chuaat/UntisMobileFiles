// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.realm;

import android.util.Log;
import java.io.Closeable;
import kotlin.io.c;
import kotlin.j2;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.utils.c0;
import kotlin.jvm.internal.k0;
import io.realm.m0;
import io.realm.j0;
import io.realm.f0;
import java.util.HashMap;
import android.content.Context;
import com.untis.mobile.a;
import kotlin.jvm.internal.w;
import io.realm.CompactOnLaunchCallback;
import java.util.Map;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000e2\u00020\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\n\u001a\u00020\tH\u0016J\u0012\u0010\r\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\"\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015¨\u0006\u001b" }, d2 = { "Lcom/untis/mobile/persistence/realm/k;", "Lcom/untis/mobile/persistence/realm/d;", "Lio/realm/j0;", "e", "", "profileId", "Lio/realm/CompactOnLaunchCallback;", "f", "g", "Lio/realm/f0;", "d", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "a", "c", "Lkotlin/j2;", "b", "", "Ljava/util/Map;", "compactOnLaunchCache", "Lcom/untis/mobile/persistence/realm/j;", "Lcom/untis/mobile/persistence/realm/j;", "migration", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class k implements d
{
    @e
    public static final a c;
    private static final long d;
    @e
    private static final String e = "com.grupet.web.app";
    @e
    private final j a;
    @e
    private final Map<String, CompactOnLaunchCallback> b;
    
    static {
        c = new a(null);
        d = com.untis.mobile.a.f;
    }
    
    private k(final Context context) {
        this.a = new j();
        this.b = new HashMap<String, CompactOnLaunchCallback>();
        f0.z2(context);
        f0.a3(this.e());
    }
    
    private final j0 e() {
        final j0 e = new j0.a().w(k.d).s("com.grupet.web.app").q(this.a).h(this.f("")).b(true).c(true).e();
        k0.o(e, "Builder()\n                .schemaVersion(SCHEMA_VERSION)\n                .name(SCHEMA_NAME)\n                .migration(migration)\n                .compactOnLaunch(getCompactOnLaunchFor(\"\"))\n                .allowQueriesOnUiThread(true) // quickfix for some legacy code\n                .allowWritesOnUiThread(true) // quickfix for some legacy code\n                .build()");
        return e;
    }
    
    private final CompactOnLaunchCallback f(final String s) {
        CompactOnLaunchCallback compactOnLaunchCallback;
        if ((compactOnLaunchCallback = this.b.get(s)) == null) {
            compactOnLaunchCallback = new f(s);
            this.b.put(s, compactOnLaunchCallback);
        }
        return compactOnLaunchCallback;
    }
    
    private final j0 g(final String s) {
        final j0 e = new j0.a().w(k.d).s(k0.C(c0.i(s), "@com.grupet.web.app")).q(this.a).h(this.f(s)).b(true).c(true).e();
        k0.o(e, "Builder()\n                .schemaVersion(SCHEMA_VERSION)\n                .name(removeAndReplaceSpecialChars(profileId) + \"@\" + BuildConfig.APPLICATION_ID)\n                .migration(migration)\n                .compactOnLaunch(getCompactOnLaunchFor(profileId))\n                .allowQueriesOnUiThread(true) // quickfix for some legacy code\n                .allowWritesOnUiThread(true) // quickfix for some legacy code\n                .build()");
        return e;
    }
    
    @e
    @Override
    public f0 a(@org.jetbrains.annotations.f final Profile profile) {
        String uniqueId;
        if (profile == null) {
            uniqueId = null;
        }
        else {
            uniqueId = profile.getUniqueId();
        }
        if (uniqueId == null) {
            return this.d();
        }
        return this.c(uniqueId);
    }
    
    @Override
    public void b(@e Profile q2) {
        k0.p(q2, "profile");
        final j0 g = this.g(((Profile)q2).getUniqueId());
        q2 = (Exception)f0.q2(g);
        try {
            ((f0)q2).beginTransaction();
            ((f0)q2).r();
            ((f0)q2).n();
            final j2 a = j2.a;
            kotlin.io.c.a((Closeable)q2, null);
            while (!((f0)q2).isClosed()) {
                ((f0)q2).close();
            }
            try {
                f0.s(g);
            }
            catch (Exception q2) {
                Log.e("untis_log", "error while deleting realm", (Throwable)q2);
            }
        }
        finally {
            try {}
            finally {
                final Throwable t;
                kotlin.io.c.a((Closeable)q2, t);
            }
        }
    }
    
    @e
    @Override
    public f0 c(@e final String str) {
        k0.p(str, "profileId");
        try {
            final f0 q2 = f0.q2(this.g(str));
            k0.o(q2, "getInstance(profileRealmConfiguration(profileId))");
            return q2;
        }
        catch (Exception ex) {
            final StringBuilder sb = new StringBuilder();
            sb.append("getRealm for ");
            sb.append(str);
            sb.append(" not working");
            Log.e("untis_log", sb.toString(), (Throwable)ex);
            final f0 q3 = f0.q2(this.g(str));
            k0.o(q3, "getInstance(profileRealmConfiguration(profileId))");
            return q3;
        }
    }
    
    @e
    @Override
    public f0 d() {
        try {
            final f0 j2 = f0.j2();
            k0.o(j2, "getDefaultInstance()");
            return j2;
        }
        catch (Exception ex) {
            Log.e("untis_log", "getDefaultRealm not working", (Throwable)ex);
            final f0 j3 = f0.j2();
            k0.o(j3, "getDefaultInstance()");
            return j3;
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e" }, d2 = { "com/untis/mobile/persistence/realm/k$a", "", "Landroid/content/Context;", "context", "Lcom/untis/mobile/persistence/realm/d;", "a", "", "SCHEMA_NAME", "Ljava/lang/String;", "", "SCHEMA_VERSION", "J", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final d a(@e final Context context) {
            k0.p(context, "context");
            return new k(context, null);
        }
    }
}
