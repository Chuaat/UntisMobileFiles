// 
// Decompiled by Procyon v0.5.36
// 

package x3;

import kotlin.jvm.internal.k0;
import com.untis.mobile.dashboard.persistence.model.event.exam.DashboardExam;
import java.util.List;
import com.google.gson.annotations.SerializedName;
import t5.c;
import com.google.gson.annotations.JsonAdapter;
import com.untis.mobile.persistence.models.EntityType;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001a" }, d2 = { "Lx3/e;", "", "", "entityId", "J", "a", "()J", "d", "(J)V", "Lcom/untis/mobile/persistence/models/EntityType;", "entityType", "Lcom/untis/mobile/persistence/models/EntityType;", "b", "()Lcom/untis/mobile/persistence/models/EntityType;", "e", "(Lcom/untis/mobile/persistence/models/EntityType;)V", "", "Lcom/untis/mobile/dashboard/persistence/model/event/exam/DashboardExam;", "exams", "Ljava/util/List;", "c", "()Ljava/util/List;", "f", "(Ljava/util/List;)V", "<init>", "(Lcom/untis/mobile/persistence/models/EntityType;JLjava/util/List;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class e
{
    @JsonAdapter(c.class)
    @SerializedName("type")
    @org.jetbrains.annotations.e
    private EntityType a;
    @SerializedName("id")
    private long b;
    @SerializedName("exams")
    @org.jetbrains.annotations.e
    private List<DashboardExam> c;
    
    public e(@org.jetbrains.annotations.e final EntityType a, final long b, @org.jetbrains.annotations.e final List<DashboardExam> c) {
        k0.p(a, "entityType");
        k0.p(c, "exams");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final long a() {
        return this.b;
    }
    
    @org.jetbrains.annotations.e
    public final EntityType b() {
        return this.a;
    }
    
    @org.jetbrains.annotations.e
    public final List<DashboardExam> c() {
        return this.c;
    }
    
    public final void d(final long b) {
        this.b = b;
    }
    
    public final void e(@org.jetbrains.annotations.e final EntityType a) {
        k0.p(a, "<set-?>");
        this.a = a;
    }
    
    public final void f(@org.jetbrains.annotations.e final List<DashboardExam> c) {
        k0.p(c, "<set-?>");
        this.c = c;
    }
}
