// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.profile;

import kotlin.jvm.internal.w;
import org.jetbrains.annotations.f;
import com.untis.mobile.api.schoolsearch.SchoolSearchSchool;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B%\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007R*\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0013" }, d2 = { "Lcom/untis/mobile/ui/activities/profile/i1;", "", "", "b", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "d", "(Ljava/lang/Throwable;)V", "throwable", "", "Lcom/untis/mobile/api/schoolsearch/SchoolSearchSchool;", "a", "Ljava/util/List;", "()Ljava/util/List;", "c", "(Ljava/util/List;)V", "schools", "<init>", "(Ljava/util/List;Ljava/lang/Throwable;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class i1
{
    @f
    private List<SchoolSearchSchool> a;
    @f
    private Throwable b;
    
    public i1() {
        this(null, null, 3, null);
    }
    
    public i1(@f final List<SchoolSearchSchool> a, @f final Throwable b) {
        this.a = a;
        this.b = b;
    }
    
    @f
    public final List<SchoolSearchSchool> a() {
        return this.a;
    }
    
    @f
    public final Throwable b() {
        return this.b;
    }
    
    public final void c(@f final List<SchoolSearchSchool> a) {
        this.a = a;
    }
    
    public final void d(@f final Throwable b) {
        this.b = b;
    }
}
