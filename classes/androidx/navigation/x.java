// 
// Decompiled by Procyon v0.5.36
// 

package androidx.navigation;

import org.jetbrains.annotations.e;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import kotlin.Metadata;

@w
@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004R$\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR.\u0010\u0013\u001a\u0004\u0018\u00010\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0011\u0010\t\"\u0004\b\u0012\u0010\u000bR$\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0007\u001a\u0004\b\u0006\u0010\t\"\u0004\b\u0014\u0010\u000b¨\u0006\u0018" }, d2 = { "Landroidx/navigation/x;", "", "Landroidx/navigation/u;", "a", "()Landroidx/navigation/u;", "", "d", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "f", "(Ljava/lang/String;)V", "mimeType", "Landroidx/navigation/u$a;", "Landroidx/navigation/u$a;", "builder", "p", "b", "e", "action", "g", "uriPattern", "<init>", "()V", "navigation-common-ktx_release" }, k = 1, mv = { 1, 4, 0 })
public final class x
{
    private final u.a a;
    @f
    private String b;
    @f
    private String c;
    @f
    private String d;
    
    public x() {
        this.a = new u.a();
    }
    
    @e
    public final u a() {
        final u.a a = this.a;
        final String b = this.b;
        if (b != null || this.c != null || this.d != null) {
            if (b != null) {
                a.g(b);
            }
            final String c = this.c;
            if (c != null) {
                a.e(c);
            }
            final String d = this.d;
            if (d != null) {
                a.f(d);
            }
            final u a2 = a.a();
            k0.h((Object)a2, "builder.apply {\n        \u2026eType(it) }\n    }.build()");
            return a2;
        }
        throw new IllegalStateException("The NavDeepLink must have an uri, action, and/or mimeType.".toString());
    }
    
    @f
    public final String b() {
        return this.c;
    }
    
    @f
    public final String c() {
        return this.d;
    }
    
    @f
    public final String d() {
        return this.b;
    }
    
    public final void e(@f final String c) {
        if (c != null && c.length() == 0) {
            throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
        }
        this.c = c;
    }
    
    public final void f(@f final String d) {
        this.d = d;
    }
    
    public final void g(@f final String b) {
        this.b = b;
    }
}
