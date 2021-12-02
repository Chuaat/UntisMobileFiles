// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.realmToModel;

import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.error.WebUntisError;
import org.jetbrains.annotations.f;
import com.untis.mobile.api.common.error.UMError;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\b" }, d2 = { "Lcom/untis/mobile/utils/mapper/realmToModel/m0;", "", "Lcom/untis/mobile/api/common/error/UMError;", "umError", "Lcom/untis/mobile/persistence/models/error/WebUntisError;", "a", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class m0
{
    @e
    public static final m0 a;
    
    static {
        a = new m0();
    }
    
    private m0() {
    }
    
    @f
    public final WebUntisError a(@f final UMError umError) {
        final String s = null;
        if (umError == null) {
            return null;
        }
        String title;
        if ((title = umError.title) == null) {
            title = "";
        }
        String details = umError.details;
        if (k0.g(title, details)) {
            details = s;
        }
        return new WebUntisError(title, details);
    }
}
