// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import org.jetbrains.annotations.e;
import org.jetbrains.annotations.f;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\t\u001a\u00020\u00048\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\r\u001a\u0004\u0018\u00010\n8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010" }, d2 = { "Lkotlinx/coroutines/o1;", "Lkotlinx/coroutines/d2;", "", "toString", "", "G", "Z", "a", "()Z", "isActive", "Lkotlinx/coroutines/x2;", "q", "()Lkotlinx/coroutines/x2;", "list", "<init>", "(Z)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
final class o1 implements d2
{
    private final boolean G;
    
    public o1(final boolean g) {
        this.G = g;
    }
    
    @Override
    public boolean a() {
        return this.G;
    }
    
    @f
    @Override
    public x2 q() {
        return null;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        String str;
        if (this.a()) {
            str = "Active";
        }
        else {
            str = "New";
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }
}
