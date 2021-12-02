// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.realmToModel;

import org.jetbrains.annotations.f;
import org.joda.time.t;
import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.classbook.homework.LocalHomework;
import m4.b;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import com.untis.mobile.utils.mapper.common.a;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b" }, d2 = { "Lcom/untis/mobile/utils/mapper/realmToModel/s;", "Lcom/untis/mobile/utils/mapper/common/a;", "Lm4/b;", "realmLocalHomework", "Lcom/untis/mobile/persistence/models/classbook/homework/LocalHomework;", "i", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class s extends a
{
    @e
    public static final s a;
    
    static {
        a = new s();
    }
    
    private s() {
    }
    
    @f
    public final LocalHomework i(@e final b b) {
        k0.p(b, "realmLocalHomework");
        final long u8 = b.u8();
        final long v8 = b.v8();
        final t g = this.g(b.x8());
        if (g == null) {
            return null;
        }
        final t g2 = this.g(b.t8());
        if (g2 == null) {
            return null;
        }
        return new LocalHomework(u8, v8, g, g2, b.y8(), b.w8(), b.s8());
    }
}
