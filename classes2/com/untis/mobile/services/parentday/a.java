// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.services.parentday;

import com.untis.mobile.persistence.models.parentday.ParentDay;
import java.util.List;
import rx.g;
import org.jetbrains.annotations.e;
import com.untis.mobile.persistence.models.profile.Profile;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u001c\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\t" }, d2 = { "Lcom/untis/mobile/services/parentday/a;", "", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "Lrx/g;", "", "Lcom/untis/mobile/persistence/models/parentday/ParentDay;", "a", "b", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public interface a
{
    @e
    g<List<ParentDay>> a(@e final Profile p0);
    
    @e
    g<List<ParentDay>> b(@e final Profile p0);
}
