// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.services.profile.legacy;

import java.util.Iterator;
import kotlin.jvm.internal.k0;
import java.util.List;
import rx.g;
import org.jetbrains.annotations.f;
import kotlin.coroutines.d;
import java.util.Collection;
import org.jetbrains.annotations.e;
import com.untis.mobile.persistence.models.profile.Profile;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0002H&J2\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0007\u001a\u00020\u0002H&J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0004H&J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H&J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H&J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0014\u001a\u00020\fH&J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\nH&J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00040\u0018H&J\n\u0010\u001a\u001a\u0004\u0018\u00010\u0004H&J\u0010\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H&J\b\u0010\u001c\u001a\u00020\u0002H&J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u001dH&J\b\u0010\u001f\u001a\u00020\u0010H&J\b\u0010 \u001a\u00020\u0002H&J\u0010\u0010!\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\"\u001a\u00020\u0010H&J\u001b\u0010#\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004H¦@\u00f8\u0001\u0000¢\u0006\u0004\b#\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%" }, d2 = { "Lcom/untis/mobile/services/profile/legacy/a;", "", "", "e", "Lcom/untis/mobile/persistence/models/profile/Profile;", "a", "prototype", "ignoreGetAppSharedSecretRequest", "Lrx/g;", "q", "", "password", "", "token", "m", "profile", "Lkotlin/j2;", "c", "b", "d", "id", "s", "uniqueId", "l", "", "g", "n", "h", "k", "", "o", "j", "r", "p", "f", "i", "(Lcom/untis/mobile/persistence/models/profile/Profile;Lkotlin/coroutines/d;)Ljava/lang/Object;", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public interface a
{
    @e
    Profile a();
    
    @e
    Profile b(@e final Profile p0);
    
    void c(@e final Profile p0);
    
    @e
    Profile d(@e final Profile p0);
    
    boolean e();
    
    void f();
    
    @e
    Collection<Profile> g();
    
    @e
    Profile h(@e final Profile p0);
    
    @f
    Object i(@e final Profile p0, @e final d<? super Profile> p1);
    
    void j();
    
    boolean k();
    
    @f
    Profile l(@e final String p0);
    
    @e
    g<Profile> m(@e final Profile p0, @f final String p1, final long p2, final boolean p3);
    
    @f
    Profile n();
    
    @e
    List<Profile> o();
    
    boolean p(@e final Profile p0);
    
    @e
    g<Profile> q(@e final Profile p0, final boolean p1);
    
    boolean r();
    
    @f
    Profile s(final long p0);
    
    @Metadata(bv = { 1, 0, 3 }, d1 = {}, d2 = {}, k = 3, mv = { 1, 5, 1 })
    public static final class a
    {
        public static boolean c(@e final com.untis.mobile.services.profile.legacy.a a, @e final Profile profile) {
            k0.p(a, "this");
            k0.p(profile, "prototype");
            final Iterator<Object> iterator = a.g().iterator();
            boolean g;
            boolean b;
            Profile next;
            do {
                final boolean hasNext = iterator.hasNext();
                b = true;
                if (!hasNext) {
                    next = null;
                    return next != null && b;
                }
                next = iterator.next();
                final Profile profile2 = next;
                if (profile.getSchoolLogin().length() > 0 && profile2.getSchoolLogin().length() > 0) {
                    g = k0.g(profile2.getUniqueId(), profile.getUniqueId());
                }
                else {
                    g = (profile.getSchoolId() != 0L && profile2.getSchoolId() != 0L && profile.getSchoolId() == profile2.getSchoolId());
                }
            } while (!g);
            return next != null && b;
        }
    }
}
