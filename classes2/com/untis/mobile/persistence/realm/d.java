// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.realm;

import org.jetbrains.annotations.e;
import io.realm.f0;
import org.jetbrains.annotations.f;
import com.untis.mobile.persistence.models.profile.Profile;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H&J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\f" }, d2 = { "Lcom/untis/mobile/persistence/realm/d;", "", "Lio/realm/f0;", "d", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "a", "", "profileId", "c", "Lkotlin/j2;", "b", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public interface d
{
    @e
    f0 a(@f final Profile p0);
    
    void b(@e final Profile p0);
    
    @e
    f0 c(@e final String p0);
    
    @e
    f0 d();
}
