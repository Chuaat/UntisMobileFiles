// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.channels;

import org.jetbrains.annotations.f;
import kotlin.j2;
import org.jetbrains.annotations.e;
import kotlin.k;
import kotlin.i;
import n6.l;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a>\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u001a\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0007¨\u0006\u000b" }, d2 = { "E", "", "capacity", "Lkotlinx/coroutines/channels/n;", "onBufferOverflow", "Lkotlin/Function1;", "Lkotlin/j2;", "onUndeliveredElement", "Lkotlinx/coroutines/channels/o;", "b", "a", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class r
{
    @e
    public static final <E> o<E> b(int a, @e final n n, @f final l<? super E, j2> l) {
        final int n2 = 1;
        final int n3 = 1;
        Object o;
        if (a != -2) {
            if (a != -1) {
                if (a != 0) {
                    if (a != Integer.MAX_VALUE) {
                        if (a == 1 && n == n.H) {
                            o = new z<E>((n6.l<? super Object, j2>)l);
                        }
                        else {
                            o = new kotlinx.coroutines.channels.i(a, n, (n6.l<? super Object, j2>)l);
                        }
                    }
                    else {
                        o = new c0((n6.l<? super Object, j2>)l);
                    }
                }
                else if (n == n.G) {
                    o = new j0((n6.l<? super Object, j2>)l);
                }
                else {
                    o = new kotlinx.coroutines.channels.i(1, n, (n6.l<? super Object, j2>)l);
                }
            }
            else {
                if (n == n.G) {
                    a = n3;
                }
                else {
                    a = 0;
                }
                if (a == 0) {
                    throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
                }
                o = new z<E>((n6.l<? super Object, j2>)l);
            }
        }
        else {
            a = n2;
            if (n == n.G) {
                a = kotlinx.coroutines.channels.o.u.a();
            }
            o = new kotlinx.coroutines.channels.i(a, n, (n6.l<? super Object, j2>)l);
        }
        return (o<E>)o;
    }
}
