// 
// Decompiled by Procyon v0.5.36
// 

package x3;

import kotlin.jvm.internal.k0;
import com.untis.mobile.persistence.models.masterdata.Student;
import com.untis.mobile.dashboard.persistence.model.classlead.DashboardClassbookEvent;
import org.jetbrains.annotations.e;
import com.google.gson.annotations.SerializedName;
import com.untis.mobile.dashboard.persistence.model.studentabsence.DashboardStudentAbsence;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0002\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0012\u0010\u0013R(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0005\u001a\u0004\b\u0010\u0010\u0007\"\u0004\b\u0011\u0010\t¨\u0006\u0014" }, d2 = { "Lx3/b;", "", "", "Lcom/untis/mobile/persistence/models/masterdata/Student;", "students", "Ljava/util/List;", "c", "()Ljava/util/List;", "f", "(Ljava/util/List;)V", "Lcom/untis/mobile/dashboard/persistence/model/classlead/DashboardClassbookEvent;", "events", "b", "e", "Lcom/untis/mobile/dashboard/persistence/model/studentabsence/DashboardStudentAbsence;", "absences", "a", "d", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class b
{
    @SerializedName("absences")
    @e
    private List<DashboardStudentAbsence> a;
    @SerializedName("classRegEvents")
    @e
    private List<DashboardClassbookEvent> b;
    @SerializedName("referencedStudents")
    @e
    private List<Student> c;
    
    public b(@e final List<DashboardStudentAbsence> a, @e final List<DashboardClassbookEvent> b, @e final List<Student> c) {
        k0.p(a, "absences");
        k0.p(b, "events");
        k0.p(c, "students");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @e
    public final List<DashboardStudentAbsence> a() {
        return this.a;
    }
    
    @e
    public final List<DashboardClassbookEvent> b() {
        return this.b;
    }
    
    @e
    public final List<Student> c() {
        return this.c;
    }
    
    public final void d(@e final List<DashboardStudentAbsence> a) {
        k0.p(a, "<set-?>");
        this.a = a;
    }
    
    public final void e(@e final List<DashboardClassbookEvent> b) {
        k0.p(b, "<set-?>");
        this.b = b;
    }
    
    public final void f(@e final List<Student> c) {
        k0.p(c, "<set-?>");
        this.c = c;
    }
}
