// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.dao.profile;

import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import com.untis.mobile.persistence.models.profile.Profile;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\bH&J\u0012\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000bH&J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH&J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001a\u00020\bH&J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001a\u00020\bH&¨\u0006\u0013" }, d2 = { "Lcom/untis/mobile/persistence/dao/profile/a;", "", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "b", "d", "Lkotlin/j2;", "c", "", "uniqueId", "g", "", "id", "h", "", "a", "profileId", "f", "e", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public interface a
{
    @e
    List<Profile> a();
    
    @e
    Profile b(@e final Profile p0);
    
    void c(@e final Profile p0);
    
    @e
    Profile d(@e final Profile p0);
    
    @f
    String e(@e final String p0);
    
    @f
    String f(@e final String p0);
    
    @f
    Profile g(@e final String p0);
    
    @f
    Profile h(final long p0);
}
