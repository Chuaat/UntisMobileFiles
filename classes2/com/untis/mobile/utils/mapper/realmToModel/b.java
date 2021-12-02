// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.realmToModel;

import com.untis.mobile.persistence.models.profile.Child;
import org.jetbrains.annotations.f;
import com.untis.mobile.api.common.UMPerson;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\b" }, d2 = { "Lcom/untis/mobile/utils/mapper/realmToModel/b;", "", "Lcom/untis/mobile/api/common/UMPerson;", "umPerson", "Lcom/untis/mobile/persistence/models/profile/Child;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class b
{
    @e
    public static final b a;
    
    static {
        a = new b();
    }
    
    private b() {
    }
    
    @f
    public final Child a(@f final UMPerson umPerson) {
        if (umPerson == null) {
            return null;
        }
        final long id = umPerson.id;
        final String firstName = umPerson.firstName;
        if (firstName == null) {
            return null;
        }
        final String lastName = umPerson.lastName;
        if (lastName == null) {
            return null;
        }
        return new Child(id, firstName, lastName, false);
    }
}
