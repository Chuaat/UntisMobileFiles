// 
// Decompiled by Procyon v0.5.36
// 

package x3;

import kotlin.jvm.internal.k0;
import com.untis.mobile.dashboard.persistence.model.parentday.DashboardParentDayAppointment;
import java.util.Map;
import com.untis.mobile.dashboard.persistence.model.parentday.DashboardParentDay;
import org.jetbrains.annotations.e;
import com.google.gson.annotations.SerializedName;
import com.untis.mobile.persistence.models.masterdata.Student;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B=\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0002\u0012\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0018R(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR4\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0019" }, d2 = { "Lx3/g;", "", "", "Lcom/untis/mobile/persistence/models/masterdata/Student;", "students", "Ljava/util/List;", "c", "()Ljava/util/List;", "f", "(Ljava/util/List;)V", "Lcom/untis/mobile/dashboard/persistence/model/parentday/DashboardParentDay;", "parentDays", "b", "e", "", "", "Lcom/untis/mobile/dashboard/persistence/model/parentday/DashboardParentDayAppointment;", "appointments", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "d", "(Ljava/util/Map;)V", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/Map;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class g
{
    @SerializedName("referencedStudents")
    @e
    private List<Student> a;
    @SerializedName("referencedPDays")
    @e
    private List<DashboardParentDay> b;
    @SerializedName("appointments")
    @e
    private Map<Long, ? extends List<DashboardParentDayAppointment>> c;
    
    public g(@e final List<Student> a, @e final List<DashboardParentDay> b, @e final Map<Long, ? extends List<DashboardParentDayAppointment>> c) {
        k0.p(a, "students");
        k0.p(b, "parentDays");
        k0.p(c, "appointments");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @e
    public final Map<Long, List<DashboardParentDayAppointment>> a() {
        return (Map<Long, List<DashboardParentDayAppointment>>)this.c;
    }
    
    @e
    public final List<DashboardParentDay> b() {
        return this.b;
    }
    
    @e
    public final List<Student> c() {
        return this.a;
    }
    
    public final void d(@e final Map<Long, ? extends List<DashboardParentDayAppointment>> c) {
        k0.p(c, "<set-?>");
        this.c = c;
    }
    
    public final void e(@e final List<DashboardParentDay> b) {
        k0.p(b, "<set-?>");
        this.b = b;
    }
    
    public final void f(@e final List<Student> a) {
        k0.p(a, "<set-?>");
        this.a = a;
    }
}
