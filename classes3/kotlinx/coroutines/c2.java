// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001c\u0010\t\u001a\u00020\u00048\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010" }, d2 = { "Lkotlinx/coroutines/c2;", "Lkotlinx/coroutines/d2;", "", "toString", "Lkotlinx/coroutines/x2;", "G", "Lkotlinx/coroutines/x2;", "q", "()Lkotlinx/coroutines/x2;", "list", "", "a", "()Z", "isActive", "<init>", "(Lkotlinx/coroutines/x2;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public final class c2 implements d2
{
    @e
    private final x2 G;
    
    public c2(@e final x2 g) {
        this.G = g;
    }
    
    @Override
    public boolean a() {
        return false;
    }
    
    @e
    @Override
    public x2 q() {
        return this.G;
    }
    
    @e
    @Override
    public String toString() {
        String s;
        if (w0.d()) {
            s = this.q().M0("New");
        }
        else {
            s = super.toString();
        }
        return s;
    }
}
