// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.internal;

import kotlin.j2;
import kotlinx.coroutines.o;
import kotlin.coroutines.d;
import kotlinx.coroutines.l1;
import kotlin.coroutines.g;
import org.jetbrains.annotations.e;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.f;
import kotlin.Metadata;
import kotlinx.coroutines.c1;
import kotlinx.coroutines.w2;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\b\u0010#\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b$\u0010%J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001b\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\t2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u001c\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0016J\u001e\u0010\u0017\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\t2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016R\u0016\u0010\u001c\u001a\u00020\u00018V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&" }, d2 = { "Lkotlinx/coroutines/internal/a0;", "Lkotlinx/coroutines/w2;", "Lkotlinx/coroutines/c1;", "", "Z", "Lkotlin/coroutines/g;", "context", "", "K", "", "time", "F", "(JLkotlin/coroutines/d;)Ljava/lang/Object;", "timeMillis", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlinx/coroutines/l1;", "D", "W", "Lkotlinx/coroutines/o;", "Lkotlin/j2;", "continuation", "a0", "", "toString", "M", "()Lkotlinx/coroutines/w2;", "immediate", "I", "Ljava/lang/String;", "errorHint", "", "H", "Ljava/lang/Throwable;", "cause", "<init>", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
final class a0 extends w2 implements c1
{
    private final Throwable H;
    private final String I;
    
    public a0(@f final Throwable h, @f final String i) {
        this.H = h;
        this.I = i;
    }
    
    private final Void Z() {
        if (this.H != null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Module with the Main dispatcher had failed to initialize");
            final String i = this.I;
            String string = null;
            Label_0067: {
                if (i != null) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append(". ");
                    sb2.append(i);
                    string = sb2.toString();
                    if (string != null) {
                        break Label_0067;
                    }
                }
                string = "";
            }
            sb.append(string);
            throw new IllegalStateException(sb.toString(), this.H);
        }
        z.e();
        throw new kotlin.w();
    }
    
    @e
    @Override
    public l1 D(final long n, @e final Runnable runnable, @e final g g) {
        this.Z();
        throw new kotlin.w();
    }
    
    @f
    @Override
    public Object F(final long n, @e final d<?> d) {
        this.Z();
        throw new kotlin.w();
    }
    
    @Override
    public boolean K(@e final g g) {
        this.Z();
        throw new kotlin.w();
    }
    
    @e
    @Override
    public w2 M() {
        return this;
    }
    
    @e
    public Void W(@e final g g, @e final Runnable runnable) {
        this.Z();
        throw new kotlin.w();
    }
    
    @e
    public Void a0(final long n, @e final o<? super j2> o) {
        this.Z();
        throw new kotlin.w();
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Dispatchers.Main[missing");
        String string;
        if (this.H != null) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(", cause=");
            sb2.append(this.H);
            string = sb2.toString();
        }
        else {
            string = "";
        }
        sb.append(string);
        sb.append(']');
        return sb.toString();
    }
}
