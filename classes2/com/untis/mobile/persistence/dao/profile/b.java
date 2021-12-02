// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.dao.profile;

import java.util.concurrent.locks.Lock;
import kotlinx.coroutines.u0;
import kotlin.coroutines.g;
import kotlinx.coroutines.h;
import com.untis.mobile.utils.j0;
import io.realm.q;
import kotlin.jvm.internal.m0;
import n6.l;
import kotlin.c1;
import kotlin.coroutines.jvm.internal.o;
import kotlinx.coroutines.r0;
import n6.p;
import kotlinx.coroutines.i1;
import kotlinx.coroutines.b2;
import org.joda.time.t;
import java.util.Set;
import com.untis.mobile.persistence.models.EntityType;
import java.util.List;
import java.util.Iterator;
import io.realm.s0;
import java.io.Closeable;
import kotlin.j2;
import com.untis.mobile.utils.mapper.realmToModel.b0;
import java.util.ArrayList;
import kotlin.collections.v;
import java.util.HashMap;
import z4.c;
import android.util.Log;
import io.realm.f0;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import com.untis.mobile.persistence.models.profile.Profile;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import org.jetbrains.annotations.e;
import com.untis.mobile.persistence.realm.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u001d¢\u0006\u0004\b \u0010!J\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u0004H\u0016J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u0003H\u0016J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0011\u001a\u00020\bH\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0013H\u0016J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0015\u001a\u00020\u0003H\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0015\u001a\u00020\u0003H\u0016R$\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001d8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001e¨\u0006\"" }, d2 = { "Lcom/untis/mobile/persistence/dao/profile/b;", "Lcom/untis/mobile/persistence/dao/profile/a;", "", "", "Lcom/untis/mobile/persistence/models/profile/Profile;", "l", "Lio/realm/f0;", "realm", "", "k", "profile", "b", "d", "Lkotlin/j2;", "c", "uniqueId", "g", "id", "h", "", "a", "profileId", "f", "e", "Ljava/util/Map;", "_profiles", "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Lcom/untis/mobile/persistence/realm/d;", "Lcom/untis/mobile/persistence/realm/d;", "realmService", "<init>", "(Lcom/untis/mobile/persistence/realm/d;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class b implements a
{
    @e
    private final d a;
    @e
    private final ReentrantLock b;
    @f
    private Map<String, Profile> c;
    
    public b(@e final d a) {
        k0.p(a, "realmService");
        this.a = a;
        this.b = new ReentrantLock();
    }
    
    public static final /* synthetic */ d j(final b b) {
        return b.a;
    }
    
    private final long k(final f0 f0) {
        Log.d("untis_log", "getNewPrimaryId for profile");
        final Number h1 = f0.f3(c.class).h1("id");
        long longValue;
        if (h1 == null) {
            longValue = 0L;
        }
        else {
            longValue = h1.longValue();
        }
        return longValue + 1L;
    }
    
    private final Map<String, Profile> l() {
        final Map<String, Profile> c;
        if ((c = this.c) == null) {
            final HashMap<String, Profile> c2 = new HashMap<String, Profile>();
            final f0 d = this.a.d();
            try {
                final s0<c> b0 = d.f3(c.class).b0();
                k0.o(b0, "realm.where(RealmProfile::class.java)\n                        .findAll()");
                final ArrayList list = new ArrayList<Object>(v.Y((Iterable<?>)b0, 10));
                for (final c c3 : b0) {
                    final b0 a = com.untis.mobile.utils.mapper.realmToModel.b0.a;
                    k0.o(c3, "it");
                    list.add(a.b(c3));
                }
                for (final Profile profile : list) {
                    c2.put(profile.getUniqueId(), profile);
                }
                final j2 a2 = j2.a;
                kotlin.io.c.a(d, null);
                this.c = c2;
            }
            finally {
                try {}
                finally {
                    kotlin.io.c.a(d, (Throwable)c);
                }
            }
        }
        return c;
    }
    
    @e
    @Override
    public List<Profile> a() {
        final ReentrantLock b = this.b;
        b.lock();
        try {
            return v.I5((Iterable<? extends Profile>)this.l().values());
        }
        finally {
            b.unlock();
        }
    }
    
    @e
    @Override
    public Profile b(@e Profile profile) {
        k0.p(profile, "profile");
        Log.d("untis_log", "saving profile");
        final Profile copy$default = Profile.copy$default(profile, 0L, null, null, null, 0L, null, 0L, null, null, null, null, null, false, false, 0L, null, null, null, 0L, null, false, null, 0L, 0, null, null, false, false, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, null, 0L, false, null, null, null, null, null, null, 0L, false, 0L, -1, 65535, null);
        h.f((r0)b2.G, (g)i1.c(), (u0)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>(null) {
            int G;
            final /* synthetic */ b H;
            final /* synthetic */ Profile I;
            final /* synthetic */ Profile J;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>(d) {
                    int G;
                    final /* synthetic */ b H = this.H;
                    final /* synthetic */ Profile I = this.I;
                    final /* synthetic */ Profile J = this.J;
                };
            }
            
            @f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @f final kotlin.coroutines.d<? super j2> d) {
                return ((b$a)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.G == 0) {
                    c1.n(o);
                    j0.b(com.untis.mobile.persistence.dao.profile.b.j(this.H).d(), new l<f0, j2>() {
                        final /* synthetic */ Profile G = b$a.this.I;
                        final /* synthetic */ Profile H = b$a.this.J;
                        final /* synthetic */ b I = b$a.this.H;
                        
                        public final void a(@org.jetbrains.annotations.e final f0 f0) {
                            k0.p(f0, "realm");
                            if (this.G.getId() < 1L) {
                                this.H.setId(this.I.k(f0));
                            }
                            f0.G0(b0.a.c(this.H), new q[0]);
                        }
                    });
                    return j2.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }, 2, (Object)null);
        final ReentrantLock b = this.b;
        b.lock();
        try {
            profile = this.l().put(profile.getUniqueId(), profile);
            return copy$default;
        }
        finally {
            b.unlock();
        }
    }
    
    @Override
    public void c(@e Profile o) {
        k0.p(o, "profile");
        final ReentrantLock b = this.b;
        b.lock();
        try {
            Log.d("untis_log", "deleting profile");
            Object o2 = this.a.d();
            try {
                ((f0)o2).beginTransaction();
                ((f0)o2).f3(c.class).I("id", ((Profile)o).getId()).b0().T3();
                ((f0)o2).n();
                final j2 a = j2.a;
                kotlin.io.c.a((Closeable)o2, null);
                o2 = this.c;
                if (o2 != null) {
                    o = ((Map<K, Profile>)o2).remove(((Profile)o).getUniqueId());
                }
            }
            finally {
                try {}
                finally {
                    kotlin.io.c.a((Closeable)o2, (Throwable)o);
                }
            }
        }
        finally {
            b.unlock();
        }
    }
    
    @e
    @Override
    public Profile d(@e Profile b) {
        k0.p(b, "profile");
        Log.d("untis_log", "updating profile");
        if (this.h(b.getId()) == null && b.getId() > 0L) {
            return b;
        }
        final Profile copy$default = Profile.copy$default(b, 0L, null, null, null, 0L, null, 0L, null, null, null, null, null, false, false, 0L, null, null, null, 0L, null, false, null, 0L, 0, null, null, false, false, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, null, 0L, false, null, null, null, null, null, null, 0L, false, 0L, -1, 65535, null);
        h.f((r0)b2.G, (g)i1.c(), (u0)null, (p)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
            int G;
            final /* synthetic */ b H;
            final /* synthetic */ Profile I;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                return (kotlin.coroutines.d<j2>)new p<r0, kotlin.coroutines.d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ b H = this.H;
                    final /* synthetic */ Profile I = this.I;
                };
            }
            
            @f
            @Override
            public final Object invoke(@org.jetbrains.annotations.e final r0 r0, @f final kotlin.coroutines.d<? super j2> d) {
                return ((b$b)this.create(r0, d)).invokeSuspend(j2.a);
            }
            
            @f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object d) {
                kotlin.coroutines.intrinsics.b.h();
                if (this.G == 0) {
                    c1.n(d);
                    d = com.untis.mobile.persistence.dao.profile.b.j(this.H).d();
                    final Profile i = this.I;
                    try {
                        ((f0)d).beginTransaction();
                        ((f0)d).G0(b0.a.c(i), new q[0]);
                        ((f0)d).n();
                        final j2 a = j2.a;
                        kotlin.io.c.a((Closeable)d, null);
                        return a;
                    }
                    finally {
                        try {}
                        finally {
                            final Throwable t;
                            kotlin.io.c.a((Closeable)d, t);
                        }
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }, 2, (Object)null);
        b = (Profile)this.b;
        ((Lock)b).lock();
        try {
            final Map<String, Profile> l = this.l();
            if (l.containsKey(copy$default.getUniqueId())) {
                l.put(copy$default.getUniqueId(), copy$default);
            }
            return copy$default;
        }
        finally {
            ((Lock)b).unlock();
        }
    }
    
    @f
    @Override
    public String e(@e String authenticationToken) {
        k0.p(authenticationToken, "profileId");
        final ReentrantLock b = this.b;
        b.lock();
        try {
            final Iterator<Object> iterator = this.l().values().iterator();
            while (true) {
                Profile next;
                do {
                    final boolean hasNext = iterator.hasNext();
                    final String s = null;
                    if (!hasNext) {
                        final Profile profile = null;
                        final Profile profile2 = profile;
                        if (profile2 == null) {
                            authenticationToken = s;
                        }
                        else {
                            authenticationToken = profile2.getAuthenticationToken();
                        }
                        return authenticationToken;
                    }
                    next = iterator.next();
                } while (!k0.g(next.getUniqueId(), authenticationToken));
                final Profile profile = next;
                continue;
            }
        }
        finally {
            b.unlock();
        }
    }
    
    @f
    @Override
    public String f(@e String schoolLogin) {
        k0.p(schoolLogin, "profileId");
        final ReentrantLock b = this.b;
        b.lock();
        try {
            final Iterator<Object> iterator = this.l().values().iterator();
            while (true) {
                Profile next;
                do {
                    final boolean hasNext = iterator.hasNext();
                    final String s = null;
                    if (!hasNext) {
                        final Profile profile = null;
                        final Profile profile2 = profile;
                        if (profile2 == null) {
                            schoolLogin = s;
                        }
                        else {
                            schoolLogin = profile2.getSchoolLogin();
                        }
                        return schoolLogin;
                    }
                    next = iterator.next();
                } while (!k0.g(next.getUniqueId(), schoolLogin));
                final Profile profile = next;
                continue;
            }
        }
        finally {
            b.unlock();
        }
    }
    
    @f
    @Override
    public Profile g(@e final String s) {
        k0.p(s, "uniqueId");
        final ReentrantLock b = this.b;
        b.lock();
        try {
            return this.l().get(s);
        }
        finally {
            b.unlock();
        }
    }
    
    @f
    @Override
    public Profile h(final long n) {
        final ReentrantLock b = this.b;
        b.lock();
        try {
            for (final Profile next : this.l().values()) {
                if (next.getId() == n) {
                    return next;
                }
            }
            return null;
        }
        finally {
            b.unlock();
        }
    }
}
