// 
// Decompiled by Procyon v0.5.36
// 

package x3;

import kotlin.jvm.internal.k0;
import com.untis.mobile.api.common.timetable.UMLesson;
import java.util.Map;
import org.jetbrains.annotations.e;
import com.google.gson.annotations.SerializedName;
import com.untis.mobile.dashboard.persistence.model.event.homework.DashboardHomework;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u0013\u0010\u0014R(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR.\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0015" }, d2 = { "Lx3/f;", "", "", "Lcom/untis/mobile/dashboard/persistence/model/event/homework/DashboardHomework;", "homework", "Ljava/util/List;", "a", "()Ljava/util/List;", "c", "(Ljava/util/List;)V", "", "", "Lcom/untis/mobile/api/common/timetable/UMLesson;", "lessons", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "d", "(Ljava/util/Map;)V", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class f
{
    @SerializedName("homeWorks")
    @e
    private List<DashboardHomework> a;
    @SerializedName("lessonsById")
    @e
    private Map<Long, ? extends UMLesson> b;
    
    public f(@e final List<DashboardHomework> a, @e final Map<Long, ? extends UMLesson> b) {
        k0.p(a, "homework");
        k0.p(b, "lessons");
        this.a = a;
        this.b = b;
    }
    
    @e
    public final List<DashboardHomework> a() {
        return this.a;
    }
    
    @e
    public final Map<Long, UMLesson> b() {
        return (Map<Long, UMLesson>)this.b;
    }
    
    public final void c(@e final List<DashboardHomework> a) {
        k0.p(a, "<set-?>");
        this.a = a;
    }
    
    public final void d(@e final Map<Long, ? extends UMLesson> b) {
        k0.p(b, "<set-?>");
        this.b = b;
    }
}
