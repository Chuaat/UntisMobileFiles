// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import kotlin.jvm.internal.k0;
import kotlinx.coroutines.internal.t;
import java.util.Objects;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import kotlinx.coroutines.internal.r;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003J\b\u0010\u0006\u001a\u00020\u0003H\u0016R\u0016\u0010\t\u001a\u00020\u00008V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010" }, d2 = { "Lkotlinx/coroutines/x2;", "Lkotlinx/coroutines/internal/r;", "Lkotlinx/coroutines/d2;", "", "state", "M0", "toString", "q", "()Lkotlinx/coroutines/x2;", "list", "", "a", "()Z", "isActive", "<init>", "()V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public final class x2 extends r implements d2
{
    @org.jetbrains.annotations.e
    public final String M0(@org.jetbrains.annotations.e String string) {
        final StringBuilder sb = new StringBuilder();
        sb.append("List{");
        sb.append(string);
        sb.append("}[");
        final Object u0 = this.u0();
        Objects.requireNonNull(u0, "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
        t v0 = (t)u0;
        int n = 1;
        while (k0.g((Object)v0, (Object)this) ^ true) {
            int n2 = n;
            if (v0 instanceof r2) {
                final r2 obj = (r2)v0;
                if (n != 0) {
                    n = 0;
                }
                else {
                    sb.append(", ");
                }
                sb.append(obj);
                n2 = n;
            }
            v0 = v0.v0();
            n = n2;
        }
        sb.append("]");
        string = sb.toString();
        k0.o((Object)string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
    
    @Override
    public boolean a() {
        return true;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public x2 q() {
        return this;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public String toString() {
        String s;
        if (w0.d()) {
            s = this.M0("Active");
        }
        else {
            s = super.toString();
        }
        return s;
    }
}
