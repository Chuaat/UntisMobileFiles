// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.register;

import rx.g;
import org.jetbrains.annotations.e;
import com.untis.mobile.persistence.models.profile.Profile;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&J \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¨\u0006\t" }, d2 = { "Lcom/untis/mobile/api/register/RegisterService;", "", "Lcom/untis/mobile/persistence/models/profile/Profile;", "profile", "", "firstTry", "Lrx/g;", "register", "deregister", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public interface RegisterService
{
    @e
    g<Boolean> deregister(@e final Profile p0, final boolean p1);
    
    @e
    g<Boolean> register(@e final Profile p0, final boolean p1);
    
    @Metadata(bv = { 1, 0, 3 }, d1 = {}, d2 = {}, k = 3, mv = { 1, 5, 1 })
    public static final class DefaultImpls
    {
    }
}
