// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.classbook.duty;

import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.classbook.duty.ClassRole;
import java.util.List;
import org.jetbrains.annotations.e;
import com.untis.mobile.persistence.models.classbook.duty.Duty;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u0003\u0010\u000b¨\u0006\u000f" }, d2 = { "Lcom/untis/mobile/ui/activities/classbook/duty/b;", "", "Lcom/untis/mobile/persistence/models/classbook/duty/Duty;", "a", "Lcom/untis/mobile/persistence/models/classbook/duty/Duty;", "b", "()Lcom/untis/mobile/persistence/models/classbook/duty/Duty;", "duty", "", "Lcom/untis/mobile/persistence/models/classbook/duty/ClassRole;", "Ljava/util/List;", "()Ljava/util/List;", "classRoles", "<init>", "(Lcom/untis/mobile/persistence/models/classbook/duty/Duty;Ljava/util/List;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class b
{
    @e
    private final Duty a;
    @e
    private final List<ClassRole> b;
    
    public b(@e final Duty a, @e final List<ClassRole> b) {
        k0.p(a, "duty");
        k0.p(b, "classRoles");
        this.a = a;
        this.b = b;
    }
    
    @e
    public final List<ClassRole> a() {
        return this.b;
    }
    
    @e
    public final Duty b() {
        return this.a;
    }
}
