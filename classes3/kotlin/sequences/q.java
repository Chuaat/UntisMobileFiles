// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.sequences;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.internal.f;
import kotlin.e1;
import java.util.Iterator;
import kotlin.b;
import kotlin.j2;
import kotlin.coroutines.d;
import n6.p;
import kotlin.z0;
import kotlin.k;
import kotlin.i;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aO\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002/\b\u0001\u0010\u0007\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001aP\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002/\b\t\u0010\u000b\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\f\u0010\n\u001aO\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u00002/\b\u0001\u0010\u0007\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001aP\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u00002/\b\t\u0010\u000b\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001¢\u0006\u0002\b\u0006H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000f\"\u001a\u0010\u0014\u001a\u00060\u0011j\u0002`\u00128\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013\"\u001a\u0010\u0016\u001a\u00060\u0011j\u0002`\u00128\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013\"\u001a\u0010\u0017\u001a\u00060\u0011j\u0002`\u00128\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0013\"\u001a\u0010\u0018\u001a\u00060\u0011j\u0002`\u00128\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0013\"\u001a\u0010\u001a\u001a\u00060\u0011j\u0002`\u00128\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013\"\u001a\u0010\u001b\u001a\u00060\u0011j\u0002`\u00128\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0013*V\b\u0007\u0010'\u001a\u0004\b\u0000\u0010\u0000\"\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0002B6\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u001c\b\u001f\u0012\u0018\b\u000bB\u0014\b \u0012\u0006\b!\u0012\u0002\b\f\u0012\b\b\"\u0012\u0004\b\b(#\u0012\n\b$\u0012\u0006\b\n0%8&*\f\b\u0002\u0010(\"\u00020\u00112\u00020\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006)" }, d2 = { "T", "Lkotlin/Function2;", "Lkotlin/sequences/o;", "Lkotlin/coroutines/d;", "Lkotlin/j2;", "", "Lkotlin/s;", "block", "Lkotlin/sequences/m;", "e", "(Ln6/p;)Lkotlin/sequences/m;", "builderAction", "c", "", "d", "(Ln6/p;)Ljava/util/Iterator;", "b", "", "Lkotlin/sequences/State;", "I", "State_ManyNotReady", "a", "State_NotReady", "State_Done", "State_Ready", "f", "State_Failed", "State_ManyReady", "Lkotlin/i;", "message", "Use SequenceScope class instead.", "replaceWith", "Lkotlin/z0;", "imports", "expression", "SequenceScope<T>", "level", "Lkotlin/k;", "ERROR", "SequenceBuilder", "State", "kotlin-stdlib" }, k = 5, mv = { 1, 5, 1 }, xs = "kotlin/sequences/SequencesKt")
class q
{
    private static final int a = 0;
    private static final int b = 1;
    private static final int c = 2;
    private static final int d = 3;
    private static final int e = 4;
    private static final int f = 5;
    
    public q() {
    }
    
    @i(level = k.H, message = "Use 'iterator { }' function instead.", replaceWith = @z0(expression = "iterator(builderAction)", imports = {}))
    @e1(version = "1.3")
    @f
    private static final <T> Iterator<T> b(@b final p<? super o<? super T>, ? super d<? super j2>, ?> p) {
        return p.d(p);
    }
    
    @i(level = k.H, message = "Use 'sequence { }' function instead.", replaceWith = @z0(expression = "sequence(builderAction)", imports = {}))
    @e1(version = "1.3")
    @f
    private static final <T> m<T> c(@b final p<? super o<? super T>, ? super d<? super j2>, ?> p) {
        return new m<T>() {
            @e
            @Override
            public Iterator<T> iterator() {
                return p.d((n6.p<? super o<? super T>, ? super d<? super j2>, ?>)p);
            }
        };
    }
    
    @e1(version = "1.3")
    @e
    public static <T> Iterator<T> d(@b @e final p<? super o<? super T>, ? super d<? super j2>, ?> p) {
        k0.p((Object)p, "block");
        final n n = new n();
        n.p(kotlin.coroutines.intrinsics.b.c((p)p, (Object)n, (d)n));
        return (Iterator<T>)n;
    }
    
    @e1(version = "1.3")
    @e
    public static <T> m<T> e(@b @e final p<? super o<? super T>, ? super d<? super j2>, ?> p) {
        k0.p((Object)p, "block");
        return new m<T>() {
            @e
            @Override
            public Iterator<T> iterator() {
                return p.d((n6.p<? super o<? super T>, ? super d<? super j2>, ?>)p);
            }
        };
    }
}
