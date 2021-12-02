// 
// Decompiled by Procyon v0.5.36
// 

package u4;

import kotlin.jvm.internal.k0;
import io.realm.internal.p;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import com.untis.mobile.persistence.realm.b;
import io.realm.l0;
import kotlin.Metadata;
import io.realm.q3;
import io.realm.p0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0011\u0010\u0012R(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0013" }, d2 = { "Lu4/c;", "Lio/realm/p0;", "Lio/realm/l0;", "Lcom/untis/mobile/persistence/realm/b;", "subjectIds", "Lio/realm/l0;", "t8", "()Lio/realm/l0;", "v8", "(Lio/realm/l0;)V", "", "studentId", "J", "s8", "()J", "u8", "(J)V", "<init>", "(JLio/realm/l0;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public class c extends p0 implements q3
{
    private long J;
    @e
    private l0<b> K;
    
    public c() {
        this(0L, null, 3, null);
        if (this instanceof p) {
            ((p)this).y4();
        }
    }
    
    public c(final long n, @e final l0<b> l0) {
        k0.p(l0, "subjectIds");
        if (this instanceof p) {
            ((p)this).y4();
        }
        this.P(n);
        this.v6(l0);
    }
    
    @Override
    public long J() {
        return this.J;
    }
    
    @Override
    public void P(final long j) {
        this.J = j;
    }
    
    public final long s8() {
        return this.J();
    }
    
    @e
    public final l0<b> t8() {
        return (l0<b>)this.w2();
    }
    
    public final void u8(final long n) {
        this.P(n);
    }
    
    @Override
    public void v6(final l0 k) {
        this.K = (l0<b>)k;
    }
    
    public final void v8(@e final l0<b> l0) {
        k0.p(l0, "<set-?>");
        this.v6(l0);
    }
    
    @Override
    public l0 w2() {
        return this.K;
    }
}
