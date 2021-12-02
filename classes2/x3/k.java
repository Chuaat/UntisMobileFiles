// 
// Decompiled by Procyon v0.5.36
// 

package x3;

import y3.a;
import org.jetbrains.annotations.f;
import com.google.gson.annotations.SerializedName;
import com.untis.mobile.dashboard.persistence.model.contacthour.DashboardContactHourSlot;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fR*\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR*\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0005\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\t¨\u0006\u0010" }, d2 = { "Lx3/k;", "", "", "Lcom/untis/mobile/dashboard/persistence/model/contacthour/DashboardContactHourSlot;", "slots", "Ljava/util/List;", "b", "()Ljava/util/List;", "d", "(Ljava/util/List;)V", "Ly3/a;", "errors", "a", "c", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class k
{
    @SerializedName("timeSlots")
    @f
    private List<DashboardContactHourSlot> a;
    @SerializedName("errors")
    @f
    private List<a> b;
    
    public k(@f final List<DashboardContactHourSlot> a, @f final List<a> b) {
        this.a = a;
        this.b = b;
    }
    
    @f
    public final List<a> a() {
        return this.b;
    }
    
    @f
    public final List<DashboardContactHourSlot> b() {
        return this.a;
    }
    
    public final void c(@f final List<a> b) {
        this.b = b;
    }
    
    public final void d(@f final List<DashboardContactHourSlot> a) {
        this.a = a;
    }
}
