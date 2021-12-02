// 
// Decompiled by Procyon v0.5.36
// 

package g5;

import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\t\n\u0002\b\u000f\u0018\u00002\u00020\u0001B[\u0012\b\b\u0002\u0010$\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b'\u0010(J\u0006\u0010\u0003\u001a\u00020\u0002R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\"\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR\"\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R$\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010!\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R\"\u0010$\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\f\u001a\u0004\b%\u0010\u000e\"\u0004\b&\u0010\u0010¨\u0006)" }, d2 = { "Lg5/a;", "", "", "f", "", "ignoreGetAppSharedSecretRequest", "Z", "a", "()Z", "j", "(Z)V", "schoolServer", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "m", "(Ljava/lang/String;)V", "schoolLogin", "c", "l", "skipSchoolSearchUpdate", "e", "n", "userPasswordOrSecret", "h", "p", "", "userToken", "Ljava/lang/Long;", "i", "()Ljava/lang/Long;", "q", "(Ljava/lang/Long;)V", "schoolId", "b", "k", "userLogin", "g", "o", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;ZZ)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class a
{
    @e
    private String a;
    @e
    private String b;
    @f
    private Long c;
    @e
    private String d;
    @e
    private String e;
    @f
    private Long f;
    private boolean g;
    private boolean h;
    
    public a() {
        this(null, null, null, null, null, null, false, false, 255, null);
    }
    
    public a(@e final String a, @e final String b, @f final Long c, @e final String d, @e final String e, @f final Long f, final boolean g, final boolean h) {
        k0.p(a, "userLogin");
        k0.p(b, "userPasswordOrSecret");
        k0.p(d, "schoolServer");
        k0.p(e, "schoolLogin");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public final boolean a() {
        return this.g;
    }
    
    @f
    public final Long b() {
        return this.f;
    }
    
    @e
    public final String c() {
        return this.e;
    }
    
    @e
    public final String d() {
        return this.d;
    }
    
    public final boolean e() {
        return this.h;
    }
    
    @e
    public final String f() {
        return k0.C(this.a, this.e);
    }
    
    @e
    public final String g() {
        return this.a;
    }
    
    @e
    public final String h() {
        return this.b;
    }
    
    @f
    public final Long i() {
        return this.c;
    }
    
    public final void j(final boolean g) {
        this.g = g;
    }
    
    public final void k(@f final Long f) {
        this.f = f;
    }
    
    public final void l(@e final String e) {
        k0.p(e, "<set-?>");
        this.e = e;
    }
    
    public final void m(@e final String d) {
        k0.p(d, "<set-?>");
        this.d = d;
    }
    
    public final void n(final boolean h) {
        this.h = h;
    }
    
    public final void o(@e final String a) {
        k0.p(a, "<set-?>");
        this.a = a;
    }
    
    public final void p(@e final String b) {
        k0.p(b, "<set-?>");
        this.b = b;
    }
    
    public final void q(@f final Long c) {
        this.c = c;
    }
}
