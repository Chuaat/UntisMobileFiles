// 
// Decompiled by Procyon v0.5.36
// 

package x3;

import kotlin.collections.v;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.k0;
import com.untis.mobile.dashboard.persistence.model.contacthour.DashboardContactHourSlot;
import java.util.List;
import org.jetbrains.annotations.e;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR(\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006\"\u0004\b\u0013\u0010\b¨\u0006\u0016" }, d2 = { "Lx3/c;", "", "", "teacherText", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "e", "(Ljava/lang/String;)V", "", "Lcom/untis/mobile/dashboard/persistence/model/contacthour/DashboardContactHourSlot;", "slots", "Ljava/util/List;", "a", "()Ljava/util/List;", "d", "(Ljava/util/List;)V", "userText", "c", "f", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class c
{
    @SerializedName("teacherText")
    @e
    private String a;
    @SerializedName("userText")
    @e
    private String b;
    @SerializedName("timeSlots")
    @e
    private List<DashboardContactHourSlot> c;
    
    public c(@e final String a, @e final String b, @e final List<DashboardContactHourSlot> c) {
        k0.p(a, "teacherText");
        k0.p(b, "userText");
        k0.p(c, "slots");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @e
    public final List<DashboardContactHourSlot> a() {
        return this.c;
    }
    
    @e
    public final String b() {
        return this.a;
    }
    
    @e
    public final String c() {
        return this.b;
    }
    
    public final void d(@e final List<DashboardContactHourSlot> c) {
        k0.p(c, "<set-?>");
        this.c = c;
    }
    
    public final void e(@e final String a) {
        k0.p(a, "<set-?>");
        this.a = a;
    }
    
    public final void f(@e final String b) {
        k0.p(b, "<set-?>");
        this.b = b;
    }
}
