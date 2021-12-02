// 
// Decompiled by Procyon v0.5.36
// 

package x3;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import com.untis.mobile.dashboard.persistence.model.studentabsence.DashboardStudentAbsence;
import org.jetbrains.annotations.f;
import com.google.gson.annotations.SerializedName;
import y3.a;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012R*\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0013" }, d2 = { "Lx3/i;", "", "", "Ly3/a;", "errors", "Ljava/util/List;", "b", "()Ljava/util/List;", "d", "(Ljava/util/List;)V", "Lcom/untis/mobile/dashboard/persistence/model/studentabsence/DashboardStudentAbsence;", "absence", "Lcom/untis/mobile/dashboard/persistence/model/studentabsence/DashboardStudentAbsence;", "a", "()Lcom/untis/mobile/dashboard/persistence/model/studentabsence/DashboardStudentAbsence;", "c", "(Lcom/untis/mobile/dashboard/persistence/model/studentabsence/DashboardStudentAbsence;)V", "<init>", "(Ljava/util/List;Lcom/untis/mobile/dashboard/persistence/model/studentabsence/DashboardStudentAbsence;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class i
{
    @SerializedName("errors")
    @f
    private List<a> a;
    @SerializedName("absence")
    @e
    private DashboardStudentAbsence b;
    
    public i(@f final List<a> a, @e final DashboardStudentAbsence b) {
        k0.p(b, "absence");
        this.a = a;
        this.b = b;
    }
    
    @e
    public final DashboardStudentAbsence a() {
        return this.b;
    }
    
    @f
    public final List<a> b() {
        return this.a;
    }
    
    public final void c(@e final DashboardStudentAbsence b) {
        k0.p(b, "<set-?>");
        this.b = b;
    }
    
    public final void d(@f final List<a> a) {
        this.a = a;
    }
}
