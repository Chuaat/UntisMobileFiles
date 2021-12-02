// 
// Decompiled by Procyon v0.5.36
// 

package t4;

import kotlin.jvm.internal.k0;
import io.realm.internal.p;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import io.realm.k3;
import io.realm.p0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\f\b\u0016\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000f¨\u0006\u0015" }, d2 = { "Lt4/b;", "Lio/realm/p0;", "", "state", "I", "u8", "()I", "x8", "(I)V", "", "end", "Ljava/lang/String;", "s8", "()Ljava/lang/String;", "v8", "(Ljava/lang/String;)V", "start", "t8", "w8", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public class b extends p0 implements k3
{
    @e
    private String J;
    @e
    private String K;
    private int L;
    
    public b() {
        this(null, null, 0, 7, null);
        if (this instanceof p) {
            ((p)this).y4();
        }
    }
    
    public b(@e final String s, @e final String s2, final int n) {
        k0.p(s, "start");
        k0.p(s2, "end");
        if (this instanceof p) {
            ((p)this).y4();
        }
        this.v(s);
        this.x(s2);
        this.D0(n);
    }
    
    @Override
    public void D0(final int l) {
        this.L = l;
    }
    
    @Override
    public int E1() {
        return this.L;
    }
    
    @Override
    public String c() {
        return this.K;
    }
    
    @Override
    public String d() {
        return this.J;
    }
    
    @e
    public final String s8() {
        return this.c();
    }
    
    @e
    public final String t8() {
        return this.d();
    }
    
    public final int u8() {
        return this.E1();
    }
    
    @Override
    public void v(final String j) {
        this.J = j;
    }
    
    public final void v8(@e final String s) {
        k0.p(s, "<set-?>");
        this.x(s);
    }
    
    public final void w8(@e final String s) {
        k0.p(s, "<set-?>");
        this.v(s);
    }
    
    @Override
    public void x(final String k) {
        this.K = k;
    }
    
    public final void x8(final int n) {
        this.D0(n);
    }
}
