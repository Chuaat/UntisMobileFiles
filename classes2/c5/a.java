// 
// Decompiled by Procyon v0.5.36
// 

package c5;

import io.realm.internal.p;
import kotlin.jvm.internal.w;
import kotlin.Metadata;
import io.realm.w5;
import io.realm.p0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\bR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\n" }, d2 = { "Lc5/a;", "Lio/realm/p0;", "", "holidayId", "J", "s8", "()J", "t8", "(J)V", "<init>", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public class a extends p0 implements w5
{
    private long J;
    
    public a() {
        this(0L, 1, null);
        if (this instanceof p) {
            ((p)this).y4();
        }
    }
    
    public a(final long n) {
        if (this instanceof p) {
            ((p)this).y4();
        }
        this.B4(n);
    }
    
    @Override
    public void B4(final long j) {
        this.J = j;
    }
    
    @Override
    public long q3() {
        return this.J;
    }
    
    public final long s8() {
        return this.q3();
    }
    
    public final void t8(final long n) {
        this.B4(n);
    }
}
