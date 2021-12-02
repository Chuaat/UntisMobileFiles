// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.realmToModel;

import m6.k;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.profile.PremiumContext;
import com.untis.mobile.api.dto.IsPremiumAvailableResponse;
import kotlin.text.s;
import org.joda.time.t;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0014\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¨\u0006\f" }, d2 = { "Lcom/untis/mobile/utils/mapper/realmToModel/z;", "", "Lcom/untis/mobile/api/dto/IsPremiumAvailableResponse;", "response", "Lcom/untis/mobile/persistence/models/profile/PremiumContext;", "b", "", "iso", "Lorg/joda/time/t;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class z
{
    @e
    public static final z a;
    
    static {
        a = new z();
    }
    
    private z() {
    }
    
    private final t a(final String s) {
        final t t = null;
        if (s == null) {
            return null;
        }
        try {
            return org.joda.time.t.c0(s.k2(s, "Z", "", false, 4, (Object)null));
        }
        catch (Exception ex) {
            return t;
        }
    }
    
    @k
    @e
    public static final PremiumContext b(@e final IsPremiumAvailableResponse isPremiumAvailableResponse) {
        k0.p(isPremiumAvailableResponse, "response");
        return new PremiumContext(isPremiumAvailableResponse.premiumAvailable, z.a.a(isPremiumAvailableResponse.premiumEndDate));
    }
}
