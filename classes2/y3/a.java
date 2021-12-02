// 
// Decompiled by Procyon v0.5.36
// 

package y3;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\b¨\u0006\u0011" }, d2 = { "Ly3/a;", "", "", "title", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "f", "(Ljava/lang/String;)V", "details", "b", "e", "code", "a", "d", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class a
{
    @SerializedName("title")
    @e
    private String a;
    @SerializedName("details")
    @e
    private String b;
    @SerializedName("code")
    @e
    private String c;
    
    public a(@e final String a, @e final String b, @e final String c) {
        k0.p(a, "title");
        k0.p(b, "details");
        k0.p(c, "code");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @e
    public final String a() {
        return this.c;
    }
    
    @e
    public final String b() {
        return this.b;
    }
    
    @e
    public final String c() {
        return this.a;
    }
    
    public final void d(@e final String c) {
        k0.p(c, "<set-?>");
        this.c = c;
    }
    
    public final void e(@e final String b) {
        k0.p(b, "<set-?>");
        this.b = b;
    }
    
    public final void f(@e final String a) {
        k0.p(a, "<set-?>");
        this.a = a;
    }
}
