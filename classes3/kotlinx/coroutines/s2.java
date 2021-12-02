// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import java.util.ArrayList;
import kotlin.c1;
import kotlin.coroutines.g;
import kotlin.coroutines.g$c;
import kotlin.coroutines.g$b;
import c7.a;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.d;
import java.util.Set;
import kotlinx.coroutines.internal.j0;
import java.util.Map;
import java.util.Collections;
import java.util.IdentityHashMap;
import org.jetbrains.annotations.f;
import kotlinx.coroutines.internal.s;
import org.jetbrains.annotations.e;
import kotlin.m;
import kotlin.jvm.internal.k0;
import java.util.Objects;
import kotlinx.coroutines.internal.t;
import kotlin.j2;
import n6.l;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.k;
import kotlin.i;
import kotlin.Metadata;
import kotlinx.coroutines.selects.c;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u00dc\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0005¿\u0001\u00ce\u0001}B\u0012\u0012\u0007\u0010\u00cb\u0001\u001a\u00020\u001b¢\u0006\u0006\b\u00cc\u0001\u0010\u00cd\u0001J&\u0010\n\u001a\u00020\t2\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0082\b¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0014\u001a\u0004\u0018\u00010\u00122\u0006\u0010\r\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010#\u001a\u00020\u00072\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0012H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u0012H\u0002¢\u0006\u0004\b%\u0010&J\u001d\u0010'\u001a\u00020\u0007*\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b'\u0010$J.\u0010*\u001a\u00020\u0007\"\n\b\u0000\u0010)\u0018\u0001*\u00020(2\u0006\u0010!\u001a\u00020 2\b\u0010\"\u001a\u0004\u0018\u00010\u0012H\u0082\b¢\u0006\u0004\b*\u0010$J\u0019\u0010,\u001a\u00020+2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b,\u0010-J@\u00103\u001a\u00020(2'\u00101\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`02\u0006\u00102\u001a\u00020\u001bH\u0002¢\u0006\u0004\b3\u00104J'\u00107\u001a\u00020\u001b2\u0006\u00105\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 2\u0006\u00106\u001a\u00020(H\u0002¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\u00072\u0006\u0010\r\u001a\u000209H\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020(H\u0002¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u001bH\u0002¢\u0006\u0004\b>\u0010?J\u001b\u0010@\u001a\u0004\u0018\u00010\u00062\b\u0010\"\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b@\u0010AJ\u0019\u0010B\u001a\u00020\u00122\b\u0010\"\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bB\u0010CJ\u001b\u0010D\u001a\u0004\u0018\u00010\u00062\b\u0010\"\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bD\u0010AJ\u0019\u0010E\u001a\u0004\u0018\u00010 2\u0006\u0010\r\u001a\u00020\u0019H\u0002¢\u0006\u0004\bE\u0010FJ\u001f\u0010G\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0012H\u0002¢\u0006\u0004\bG\u0010HJ%\u0010I\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bI\u0010JJ#\u0010K\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u00192\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bK\u0010LJ\u0019\u0010N\u001a\u0004\u0018\u00010M2\u0006\u0010\r\u001a\u00020\u0019H\u0002¢\u0006\u0004\bN\u0010OJ*\u0010Q\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010P\u001a\u00020M2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0082\u0010¢\u0006\u0004\bQ\u0010RJ)\u0010T\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010S\u001a\u00020M2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bT\u0010UJ\u0015\u0010W\u001a\u0004\u0018\u00010M*\u00020VH\u0002¢\u0006\u0004\bW\u0010XJ\u0019\u0010Z\u001a\u00020Y2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\bZ\u0010[J\u0019\u0010]\u001a\u00020\u00072\b\u0010\\\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b]\u0010^J\r\u0010_\u001a\u00020\u001b¢\u0006\u0004\b_\u0010?J\u000f\u0010`\u001a\u00020\u0007H\u0010¢\u0006\u0004\b`\u0010aJ\u0011\u0010d\u001a\u00060bj\u0002`c¢\u0006\u0004\bd\u0010eJ#\u0010g\u001a\u00060bj\u0002`c*\u00020\u00122\n\b\u0002\u0010f\u001a\u0004\u0018\u00010YH\u0004¢\u0006\u0004\bg\u0010hJ6\u0010j\u001a\u00020i2'\u00101\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`0¢\u0006\u0004\bj\u0010kJF\u0010m\u001a\u00020i2\u0006\u00102\u001a\u00020\u001b2\u0006\u0010l\u001a\u00020\u001b2'\u00101\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0012¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`0¢\u0006\u0004\bm\u0010nJ\u0013\u0010o\u001a\u00020\u0007H\u0086@\u00f8\u0001\u0000¢\u0006\u0004\bo\u0010pJ\u0013\u0010q\u001a\u00020\u0007H\u0082@\u00f8\u0001\u0000¢\u0006\u0004\bq\u0010pJB\u0010v\u001a\u00020\u0007\"\u0004\b\u0000\u0010r2\f\u0010t\u001a\b\u0012\u0004\u0012\u00028\u00000s2\u001c\u0010\b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000u\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u00f8\u0001\u0000¢\u0006\u0004\bv\u0010wJ\u0017\u0010x\u001a\u00020\u00072\u0006\u00106\u001a\u00020(H\u0000¢\u0006\u0004\bx\u0010=J\u001f\u0010y\u001a\u00020\u00072\u000e\u0010\"\u001a\n\u0018\u00010bj\u0004\u0018\u0001`cH\u0016¢\u0006\u0004\by\u0010zJ\u000f\u0010{\u001a\u00020YH\u0014¢\u0006\u0004\b{\u0010|J\u0019\u0010}\u001a\u00020\u001b2\b\u0010\"\u001a\u0004\u0018\u00010\u0012H\u0017¢\u0006\u0004\b}\u0010&J\u0017\u0010~\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0012H\u0016¢\u0006\u0004\b~\u0010\u007fJ\u0019\u0010\u0081\u0001\u001a\u00020\u00072\u0007\u0010\u0080\u0001\u001a\u00020\u0003¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u0019\u0010\u0083\u0001\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u0012H\u0016¢\u0006\u0005\b\u0083\u0001\u0010&J\u0019\u0010\u0084\u0001\u001a\u00020\u001b2\b\u0010\"\u001a\u0004\u0018\u00010\u0012¢\u0006\u0005\b\u0084\u0001\u0010&J\u001c\u0010\u0085\u0001\u001a\u00020\u001b2\b\u0010\"\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J,\u0010\u0088\u0001\u001a\u00030\u0087\u00012\n\b\u0002\u0010f\u001a\u0004\u0018\u00010Y2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0012H\u0080\b¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u0015\u0010\u008a\u0001\u001a\u00060bj\u0002`cH\u0016¢\u0006\u0005\b\u008a\u0001\u0010eJ\u001c\u0010\u008b\u0001\u001a\u00020\u001b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0006\b\u008b\u0001\u0010\u0086\u0001J\u001d\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0005\b\u008c\u0001\u0010AJ\u0019\u0010\u008e\u0001\u001a\u00030\u008d\u00012\u0006\u0010P\u001a\u00020\u0002¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u001a\u0010\u0091\u0001\u001a\u00020\u00072\u0007\u0010\u0090\u0001\u001a\u00020\u0012H\u0010¢\u0006\u0005\b\u0091\u0001\u0010\u007fJ\u001b\u0010\u0092\u0001\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010\u0012H\u0014¢\u0006\u0005\b\u0092\u0001\u0010\u007fJ\u001a\u0010\u0093\u0001\u001a\u00020\u001b2\u0007\u0010\u0090\u0001\u001a\u00020\u0012H\u0014¢\u0006\u0005\b\u0093\u0001\u0010&J\u001c\u0010\u0094\u0001\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u001c\u0010\u0096\u0001\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0006\b\u0096\u0001\u0010\u0095\u0001J\u0011\u0010\u0097\u0001\u001a\u00020YH\u0016¢\u0006\u0005\b\u0097\u0001\u0010|J\u0011\u0010\u0098\u0001\u001a\u00020YH\u0007¢\u0006\u0005\b\u0098\u0001\u0010|J\u0011\u0010\u0099\u0001\u001a\u00020YH\u0010¢\u0006\u0005\b\u0099\u0001\u0010|J\u0012\u0010\u009a\u0001\u001a\u0004\u0018\u00010\u0012¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u0014\u0010\u009c\u0001\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J\u0017\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u0006H\u0080@\u00f8\u0001\u0000¢\u0006\u0005\b\u009e\u0001\u0010pJ\u0017\u0010\u009f\u0001\u001a\u0004\u0018\u00010\u0006H\u0082@\u00f8\u0001\u0000¢\u0006\u0005\b\u009f\u0001\u0010pJT\u0010¡\u0001\u001a\u00020\u0007\"\u0004\b\u0000\u0010)\"\u0004\b\u0001\u0010r2\f\u0010t\u001a\b\u0012\u0004\u0012\u00028\u00010s2#\u0010\b\u001a\u001f\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010u\u0012\u0006\u0012\u0004\u0018\u00010\u00060 \u0001H\u0000\u00f8\u0001\u0000¢\u0006\u0006\b¡\u0001\u0010¢\u0001JT\u0010£\u0001\u001a\u00020\u0007\"\u0004\b\u0000\u0010)\"\u0004\b\u0001\u0010r2\f\u0010t\u001a\b\u0012\u0004\u0012\u00028\u00010s2#\u0010\b\u001a\u001f\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010u\u0012\u0006\u0012\u0004\u0018\u00010\u00060 \u0001H\u0000\u00f8\u0001\u0000¢\u0006\u0006\b£\u0001\u0010¢\u0001R\u0015\u0010¥\u0001\u001a\u00020\u00048F@\u0006¢\u0006\u0007\u001a\u0005\br\u0010¤\u0001R\u0018\u0010§\u0001\u001a\u00020\u001b8P@\u0010X\u0090\u0004¢\u0006\u0007\u001a\u0005\b¦\u0001\u0010?R \u0010©\u0001\u001a\u0004\u0018\u00010\u0012*\u0004\u0018\u00010\u00068B@\u0002X\u0082\u0004¢\u0006\u0007\u001a\u0005\b¨\u0001\u0010CR\u0015\u0010«\u0001\u001a\u00020\u001b8F@\u0006¢\u0006\u0007\u001a\u0005\bª\u0001\u0010?R\u0018\u0010\u00ad\u0001\u001a\u00020\u001b8D@\u0004X\u0084\u0004¢\u0006\u0007\u001a\u0005\b¬\u0001\u0010?R\u001d\u0010°\u0001\u001a\u00020\u001b*\u00020\u00198B@\u0002X\u0082\u0004¢\u0006\b\u001a\u0006\b®\u0001\u0010¯\u0001R\u0015\u0010²\u0001\u001a\u00020\u001b8F@\u0006¢\u0006\u0007\u001a\u0005\b±\u0001\u0010?R\u0018\u0010´\u0001\u001a\u00020\u001b8P@\u0010X\u0090\u0004¢\u0006\u0007\u001a\u0005\b³\u0001\u0010?R0\u0010º\u0001\u001a\u0005\u0018\u00010\u008d\u00012\n\u0010µ\u0001\u001a\u0005\u0018\u00010\u008d\u00018@@@X\u0080\u000e¢\u0006\u0010\u001a\u0006\b¶\u0001\u0010·\u0001\"\u0006\b¸\u0001\u0010¹\u0001R\u001d\u0010¾\u0001\u001a\t\u0012\u0004\u0012\u00020\u00010»\u00018F@\u0006¢\u0006\b\u001a\u0006\b¼\u0001\u0010½\u0001R\u0018\u0010\u00c0\u0001\u001a\u00020\u001b8V@\u0016X\u0096\u0004¢\u0006\u0007\u001a\u0005\b¿\u0001\u0010?R\u0018\u0010\u00c2\u0001\u001a\u00020\u001b8T@\u0014X\u0094\u0004¢\u0006\u0007\u001a\u0005\b\u00c1\u0001\u0010?R\u0015\u0010\u00c3\u0001\u001a\u00020\u001b8F@\u0006¢\u0006\u0007\u001a\u0005\b\u00c3\u0001\u0010?R\u001b\u0010\u00c5\u0001\u001a\u0004\u0018\u00010\u00128D@\u0004X\u0084\u0004¢\u0006\b\u001a\u0006\b\u00c4\u0001\u0010\u009b\u0001R\u001a\u0010\r\u001a\u0004\u0018\u00010\u00068@@\u0000X\u0080\u0004¢\u0006\b\u001a\u0006\b\u00c6\u0001\u0010\u009d\u0001R\u001b\u0010\u00ca\u0001\u001a\u0007\u0012\u0002\b\u00030\u00c7\u00018F@\u0006¢\u0006\b\u001a\u0006\b\u00c8\u0001\u0010\u00c9\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u00cf\u0001" }, d2 = { "Lkotlinx/coroutines/s2;", "Lkotlinx/coroutines/k2;", "Lkotlinx/coroutines/w;", "Lkotlinx/coroutines/c3;", "Lkotlinx/coroutines/selects/c;", "Lkotlin/Function1;", "", "Lkotlin/j2;", "block", "", "O0", "(Ln6/l;)Ljava/lang/Void;", "Lkotlinx/coroutines/s2$c;", "state", "proposedUpdate", "u0", "(Lkotlinx/coroutines/s2$c;Ljava/lang/Object;)Ljava/lang/Object;", "", "", "exceptions", "A0", "(Lkotlinx/coroutines/s2$c;Ljava/util/List;)Ljava/lang/Throwable;", "rootCause", "d0", "(Ljava/lang/Throwable;Ljava/util/List;)V", "Lkotlinx/coroutines/d2;", "update", "", "m1", "(Lkotlinx/coroutines/d2;Ljava/lang/Object;)Z", "p0", "(Lkotlinx/coroutines/d2;Ljava/lang/Object;)V", "Lkotlinx/coroutines/x2;", "list", "cause", "V0", "(Lkotlinx/coroutines/x2;Ljava/lang/Throwable;)V", "m0", "(Ljava/lang/Throwable;)Z", "W0", "Lkotlinx/coroutines/r2;", "T", "X0", "", "h1", "(Ljava/lang/Object;)I", "Lkotlin/t0;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "onCancelling", "S0", "(Ln6/l;Z)Lkotlinx/coroutines/r2;", "expect", "node", "c0", "(Ljava/lang/Object;Lkotlinx/coroutines/x2;Lkotlinx/coroutines/r2;)Z", "Lkotlinx/coroutines/o1;", "b1", "(Lkotlinx/coroutines/o1;)V", "c1", "(Lkotlinx/coroutines/r2;)V", "M0", "()Z", "l0", "(Ljava/lang/Object;)Ljava/lang/Object;", "r0", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "P0", "D0", "(Lkotlinx/coroutines/d2;)Lkotlinx/coroutines/x2;", "n1", "(Lkotlinx/coroutines/d2;Ljava/lang/Throwable;)Z", "o1", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "p1", "(Lkotlinx/coroutines/d2;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/v;", "v0", "(Lkotlinx/coroutines/d2;)Lkotlinx/coroutines/v;", "child", "q1", "(Lkotlinx/coroutines/s2$c;Lkotlinx/coroutines/v;Ljava/lang/Object;)Z", "lastChild", "q0", "(Lkotlinx/coroutines/s2$c;Lkotlinx/coroutines/v;Ljava/lang/Object;)V", "Lkotlinx/coroutines/internal/t;", "U0", "(Lkotlinx/coroutines/internal/t;)Lkotlinx/coroutines/v;", "", "i1", "(Ljava/lang/Object;)Ljava/lang/String;", "parent", "I0", "(Lkotlinx/coroutines/k2;)V", "start", "a1", "()V", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "w", "()Ljava/util/concurrent/CancellationException;", "message", "j1", "(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/l1;", "N", "(Ln6/l;)Lkotlinx/coroutines/l1;", "invokeImmediately", "C", "(ZZLn6/l;)Lkotlinx/coroutines/l1;", "s", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "N0", "R", "Lkotlinx/coroutines/selects/f;", "select", "Lkotlin/coroutines/d;", "u", "(Lkotlinx/coroutines/selects/f;Ln6/l;)V", "e1", "d", "(Ljava/util/concurrent/CancellationException;)V", "n0", "()Ljava/lang/String;", "c", "k0", "(Ljava/lang/Throwable;)V", "parentJob", "y", "(Lkotlinx/coroutines/c3;)V", "o0", "i0", "j0", "(Ljava/lang/Object;)Z", "Lkotlinx/coroutines/l2;", "s0", "(Ljava/lang/String;Ljava/lang/Throwable;)Lkotlinx/coroutines/l2;", "V", "Q0", "R0", "Lkotlinx/coroutines/u;", "Y", "(Lkotlinx/coroutines/w;)Lkotlinx/coroutines/u;", "exception", "H0", "Y0", "G0", "Z0", "(Ljava/lang/Object;)V", "e0", "toString", "l1", "T0", "r", "()Ljava/lang/Throwable;", "w0", "()Ljava/lang/Object;", "g0", "h0", "Lkotlin/Function2;", "d1", "(Lkotlinx/coroutines/selects/f;Ln6/p;)V", "f1", "()Lkotlinx/coroutines/selects/c;", "onJoin", "C0", "onCancelComplete", "z0", "exceptionOrNull", "K0", "isCompletedExceptionally", "y0", "completionCauseHandled", "J0", "(Lkotlinx/coroutines/d2;)Z", "isCancelling", "g", "isCompleted", "B0", "handlesException", "value", "E0", "()Lkotlinx/coroutines/u;", "g1", "(Lkotlinx/coroutines/u;)V", "parentHandle", "Lkotlin/sequences/m;", "q", "()Lkotlin/sequences/m;", "children", "a", "isActive", "L0", "isScopedCoroutine", "isCancelled", "x0", "completionCause", "F0", "Lkotlin/coroutines/g$c;", "getKey", "()Lkotlin/coroutines/g$c;", "key", "active", "<init>", "(Z)V", "b", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
@i(level = k.H, message = "This is internal API and may be removed in the future releases")
public class s2 implements k2, w, c3, kotlinx.coroutines.selects.c
{
    private static final /* synthetic */ AtomicReferenceFieldUpdater G;
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;
    
    static {
        G = AtomicReferenceFieldUpdater.newUpdater(s2.class, Object.class, "_state");
    }
    
    public s2(final boolean b) {
        o1 state;
        if (b) {
            state = t2.c();
        }
        else {
            state = t2.d();
        }
        this._state = state;
        this._parentHandle = null;
    }
    
    private final Throwable A0(final c c, final List<? extends Throwable> list) {
        final boolean empty = list.isEmpty();
        final Throwable t = null;
        if (!empty) {
            while (true) {
                for (final Throwable next : list) {
                    if (next instanceof CancellationException ^ true) {
                        final Throwable t2 = next;
                        if (t2 != null) {
                            return t2;
                        }
                        final Throwable t3 = list.get(0);
                        if (t3 instanceof y3) {
                            final Iterator<Object> iterator2 = list.iterator();
                            Throwable t4;
                            Throwable next2;
                            do {
                                next2 = t;
                                if (!iterator2.hasNext()) {
                                    break;
                                }
                                next2 = iterator2.next();
                                t4 = next2;
                            } while (t4 == t3 || !(t4 instanceof y3));
                            final Throwable t5 = next2;
                            if (t5 != null) {
                                return t5;
                            }
                        }
                        return t3;
                    }
                }
                Throwable next = null;
                continue;
            }
        }
        if (c.f()) {
            return new l2(this.n0(), null, this);
        }
        return null;
    }
    
    private final x2 D0(final d2 obj) {
        final x2 q = obj.q();
        x2 x2;
        if (q != null) {
            x2 = q;
        }
        else if (obj instanceof o1) {
            x2 = new x2();
        }
        else {
            if (!(obj instanceof r2)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("State should have list: ");
                sb.append(obj);
                throw new IllegalStateException(sb.toString().toString());
            }
            this.c1((r2)obj);
            x2 = null;
        }
        return x2;
    }
    
    private final boolean J0(final d2 d2) {
        return d2 instanceof c && ((c)d2).f();
    }
    
    private final boolean M0() {
        Object f0;
        do {
            f0 = this.F0();
            if (!(f0 instanceof d2)) {
                return false;
            }
        } while (this.h1(f0) < 0);
        return true;
    }
    
    private final Void O0(final l<Object, j2> l) {
        while (true) {
            l.invoke(this.F0());
        }
    }
    
    private final Object P0(Object o) {
        final Throwable t = null;
        Throwable r0 = null;
        while (true) {
            final Object f0 = this.F0();
            if (f0 instanceof c) {
                synchronized (f0) {
                    if (((c)f0).h()) {
                        return t2.f();
                    }
                    final boolean f2 = ((c)f0).f();
                    if (o != null || !f2) {
                        if (r0 == null) {
                            r0 = this.r0(o);
                        }
                        ((c)f0).b(r0);
                    }
                    final Throwable e = ((c)f0).e();
                    Throwable t2 = t;
                    if (f2 ^ true) {
                        t2 = e;
                    }
                    // monitorexit(f0)
                    if (t2 != null) {
                        this.V0(((c)f0).q(), t2);
                    }
                    return kotlinx.coroutines.t2.a();
                }
            }
            if (!(f0 instanceof d2)) {
                return t2.f();
            }
            Throwable r2;
            if (r0 != null) {
                r2 = r0;
            }
            else {
                r2 = this.r0(o);
            }
            final c c = (c)f0;
            if (c.a()) {
                r0 = r2;
                if (this.n1(c, r2)) {
                    return t2.a();
                }
                continue;
            }
            else {
                final Object o2 = this.o1(f0, new d0(r2, false, 2, null));
                if (o2 == t2.a()) {
                    o = new StringBuilder();
                    ((StringBuilder)o).append("Cannot happen in ");
                    ((StringBuilder)o).append(f0);
                    throw new IllegalStateException(((StringBuilder)o).toString().toString());
                }
                if (o2 != t2.b()) {
                    return o2;
                }
                r0 = r2;
            }
        }
    }
    
    private final r2 S0(final l<? super Throwable, j2> l, final boolean b) {
        final r2 r2 = null;
        r2 r3 = null;
        r2 r4;
        if (b) {
            if (l instanceof m2) {
                r3 = (r2)l;
            }
            final m2 m2 = (m2)r3;
            if (m2 != null) {
                r4 = m2;
            }
            else {
                r4 = new i2(l);
            }
        }
        else {
            r2 r5;
            if (!(l instanceof r2)) {
                r5 = r2;
            }
            else {
                r5 = (r2)l;
            }
            final r2 r6 = r5;
            if (r6 != null) {
                r4 = r6;
                if (w0.b()) {
                    if (!(r6 instanceof m2 ^ true)) {
                        throw new AssertionError();
                    }
                    r4 = r6;
                }
            }
            else {
                r4 = new kotlinx.coroutines.j2(l);
            }
        }
        r4.L0(this);
        return r4;
    }
    
    private final v U0(t t) {
        t t2;
        while (true) {
            t2 = t;
            if (!t.z0()) {
                break;
            }
            t = t.w0();
        }
        while (true) {
            t = t2.v0();
            if (t.z0()) {
                t2 = t;
            }
            else {
                if (t instanceof v) {
                    return (v)t;
                }
                t2 = t;
                if (t instanceof x2) {
                    return null;
                }
                continue;
            }
        }
    }
    
    private final void V0(final x2 x2, final Throwable t) {
        this.Y0(t);
        final Object u0 = x2.u0();
        Objects.requireNonNull(u0, "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
        t v0 = (t)u0;
        f0 f0 = null;
        while (k0.g((Object)v0, (Object)x2) ^ true) {
            Object o = f0;
            if (v0 instanceof m2) {
                f0 obj = (r2)v0;
                try {
                    obj.J0(t);
                    obj = f0;
                }
                finally {
                    if (f0 != null) {
                        final Throwable t2;
                        m.a((Throwable)f0, t2);
                        o = f0;
                    }
                    else {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Exception in completion handler ");
                        sb.append(obj);
                        sb.append(" for ");
                        sb.append(this);
                        final Throwable t2;
                        o = new g0(sb.toString(), t2);
                        final j2 a = j2.a;
                    }
                }
            }
            v0 = v0.v0();
            f0 = (f0)o;
        }
        if (f0 != null) {
            this.H0((Throwable)f0);
        }
        this.m0(t);
    }
    
    private final void W0(final x2 x2, final Throwable t) {
        final Object u0 = x2.u0();
        Objects.requireNonNull(u0, "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
        t v0 = (t)u0;
        Throwable t2 = null;
        while (k0.g((Object)v0, (Object)x2) ^ true) {
            Throwable t3 = t2;
            if (v0 instanceof r2) {
                final r2 obj = (r2)v0;
                try {
                    obj.J0(t);
                }
                finally {
                    if (t2 != null) {
                        final Throwable t4;
                        m.a(t2, t4);
                        t3 = t2;
                    }
                    else {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Exception in completion handler ");
                        sb.append(obj);
                        sb.append(" for ");
                        sb.append(this);
                        final Throwable t4;
                        t3 = new g0(sb.toString(), t4);
                        final j2 a = j2.a;
                    }
                }
            }
            v0 = v0.v0();
            t2 = t3;
        }
        if (t2 != null) {
            this.H0(t2);
        }
    }
    
    private final void b1(final o1 o1) {
        d2 d2 = new x2();
        if (!o1.a()) {
            d2 = new c2((x2)d2);
        }
        s2.G.compareAndSet(this, o1, d2);
    }
    
    private final boolean c0(final Object o, final x2 x2, final r2 r2) {
        final t.c c = new t.c() {
            final /* synthetic */ s2 e;
            
            @f
            public Object k(@org.jetbrains.annotations.e final t t) {
                Object a;
                if (this.e.F0() == o) {
                    a = null;
                }
                else {
                    a = s.a();
                }
                return a;
            }
        };
        boolean b;
        while (true) {
            final int h0 = x2.w0().H0(r2, x2, (t.c)c);
            b = true;
            if (h0 == 1) {
                break;
            }
            if (h0 != 2) {
                continue;
            }
            b = false;
            break;
        }
        return b;
    }
    
    private final void c1(final r2 r2) {
        r2.o0(new x2());
        s2.G.compareAndSet(this, r2, r2.v0());
    }
    
    private final void d0(final Throwable t, final List<? extends Throwable> list) {
        if (list.size() <= 1) {
            return;
        }
        final Set<Throwable> setFromMap = Collections.newSetFromMap(new IdentityHashMap<Throwable, Boolean>(list.size()));
        Throwable t2;
        if (!w0.e()) {
            t2 = t;
        }
        else {
            t2 = j0.t(t);
        }
        for (Throwable t3 : list) {
            if (w0.e()) {
                t3 = j0.t(t3);
            }
            if (t3 != t && t3 != t2 && !(t3 instanceof CancellationException) && setFromMap.add(t3)) {
                m.a(t, t3);
            }
        }
    }
    
    private final int h1(final Object o) {
        if (o instanceof o1) {
            if (((o1)o).a()) {
                return 0;
            }
            if (!s2.G.compareAndSet(this, o, t2.c())) {
                return -1;
            }
            this.a1();
            return 1;
        }
        else {
            if (!(o instanceof c2)) {
                return 0;
            }
            if (!s2.G.compareAndSet(this, o, ((c2)o).q())) {
                return -1;
            }
            this.a1();
            return 1;
        }
    }
    
    private final String i1(final Object o) {
        final boolean b = o instanceof c;
        final String s = "Active";
        String s2;
        if (b) {
            final c c = (c)o;
            if (c.f()) {
                s2 = "Cancelling";
            }
            else {
                s2 = s;
                if (c.g()) {
                    s2 = "Completing";
                }
            }
        }
        else if (o instanceof d2) {
            if (((d2)o).a()) {
                s2 = s;
            }
            else {
                s2 = "New";
            }
        }
        else if (o instanceof d0) {
            s2 = "Cancelled";
        }
        else {
            s2 = "Completed";
        }
        return s2;
    }
    
    public static /* synthetic */ CancellationException k1(final s2 s2, final Throwable t, String s3, final int n, final Object o) {
        if (o == null) {
            if ((n & 0x1) != 0x0) {
                s3 = null;
            }
            return s2.j1(t, s3);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }
    
    private final Object l0(final Object o) {
        Object o2;
        do {
            final Object f0 = this.F0();
            if (!(f0 instanceof d2) || (f0 instanceof c && ((c)f0).g())) {
                return t2.a();
            }
            o2 = this.o1(f0, new d0(this.r0(o), false, 2, null));
        } while (o2 == t2.b());
        return o2;
    }
    
    private final boolean m0(final Throwable t) {
        final boolean l0 = this.L0();
        final boolean b = true;
        if (l0) {
            return true;
        }
        final boolean b2 = t instanceof CancellationException;
        final u e0 = this.E0();
        if (e0 != null && e0 != z2.G) {
            boolean b3 = b;
            if (!e0.p(t)) {
                b3 = (b2 && b);
            }
            return b3;
        }
        return b2;
    }
    
    private final boolean m1(final d2 d2, final Object o) {
        if (w0.b() && (!(d2 instanceof o1) && !(d2 instanceof r2))) {
            throw new AssertionError();
        }
        if (w0.b() && !(o instanceof d0 ^ true)) {
            throw new AssertionError();
        }
        if (!s2.G.compareAndSet(this, d2, t2.g(o))) {
            return false;
        }
        this.Y0(null);
        this.Z0(o);
        this.p0(d2, o);
        return true;
    }
    
    private final boolean n1(final d2 d2, final Throwable t) {
        if (w0.b() && !(d2 instanceof c ^ true)) {
            throw new AssertionError();
        }
        if (w0.b() && !d2.a()) {
            throw new AssertionError();
        }
        final x2 d3 = this.D0(d2);
        if (d3 == null) {
            return false;
        }
        if (!s2.G.compareAndSet(this, d2, new c(d3, false, t))) {
            return false;
        }
        this.V0(d3, t);
        return true;
    }
    
    private final Object o1(final Object o, final Object o2) {
        if (!(o instanceof d2)) {
            return t2.a();
        }
        if ((!(o instanceof o1) && !(o instanceof r2)) || o instanceof v || o2 instanceof d0) {
            return this.p1((d2)o, o2);
        }
        if (this.m1((d2)o, o2)) {
            return o2;
        }
        return t2.b();
    }
    
    private final void p0(final d2 obj, Object o) {
        final u e0 = this.E0();
        if (e0 != null) {
            e0.dispose();
            this.g1(z2.G);
        }
        final boolean b = o instanceof d0;
        final Throwable t = null;
        if (!b) {
            o = null;
        }
        final d0 d0 = (d0)o;
        Throwable a = t;
        if (d0 != null) {
            a = d0.a;
        }
        if (obj instanceof r2) {
            try {
                ((r2)obj).J0(a);
            }
            finally {
                final StringBuilder sb = new StringBuilder();
                sb.append("Exception in completion handler ");
                sb.append(obj);
                sb.append(" for ");
                sb.append(this);
                final Throwable t2;
                this.H0(new g0(sb.toString(), t2));
            }
        }
        else {
            final x2 q = obj.q();
            if (q != null) {
                this.W0(q, a);
            }
        }
    }
    
    private final Object p1(final d2 d2, final Object o) {
        final x2 d3 = this.D0(d2);
        if (d3 != null) {
            final boolean b = d2 instanceof c;
            final Throwable t = null;
            d2 d4;
            if (!b) {
                d4 = null;
            }
            else {
                d4 = d2;
            }
            c c = (c)d4;
            if (c == null) {
                c = new c(d3, false, null);
            }
            synchronized (c) {
                if (c.g()) {
                    return t2.a();
                }
                c.j(true);
                if (c != d2 && !s2.G.compareAndSet(this, d2, c)) {
                    return t2.b();
                }
                if (w0.b() && !(c.h() ^ true)) {
                    throw new AssertionError();
                }
                final boolean f = c.f();
                Object o2;
                if (!(o instanceof d0)) {
                    o2 = null;
                }
                else {
                    o2 = o;
                }
                final d0 d5 = (d0)o2;
                if (d5 != null) {
                    c.b(d5.a);
                }
                final Throwable e = c.e();
                Throwable t2 = t;
                if (true ^ f) {
                    t2 = e;
                }
                final j2 a = j2.a;
                // monitorexit(c)
                if (t2 != null) {
                    this.V0(d3, t2);
                }
                final v v0 = this.v0(d2);
                if (v0 != null && this.q1(c, v0, o)) {
                    return kotlinx.coroutines.t2.b;
                }
                return this.u0(c, o);
            }
        }
        return t2.b();
    }
    
    private final void q0(final c c, v u0, final Object o) {
        if (w0.b() && this.F0() != c) {
            throw new AssertionError();
        }
        u0 = this.U0(u0);
        if (u0 != null && this.q1(c, u0, o)) {
            return;
        }
        this.e0(this.u0(c, o));
    }
    
    private final boolean q1(final c c, v u0, final Object o) {
        while (k2.a.f(u0.K, false, false, (l)new b(this, c, u0, o), 1, null) == z2.G) {
            u0 = this.U0(u0);
            if (u0 != null) {
                continue;
            }
            return false;
        }
        return true;
    }
    
    private final Throwable r0(Object v) {
        if (v == null || v instanceof Throwable) {
            if (v != null) {
                v = v;
            }
            else {
                v = new l2(this.n0(), null, this);
            }
        }
        else {
            Objects.requireNonNull(v, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
            v = ((c3)v).V();
        }
        return (Throwable)v;
    }
    
    private final Object u0(final c c, Object obj) {
        final boolean b = w0.b();
        final boolean b2 = true;
        if (b && this.F0() != c) {
            throw new AssertionError();
        }
        if (w0.b() && !(c.h() ^ true)) {
            throw new AssertionError();
        }
        if (w0.b() && !c.g()) {
            throw new AssertionError();
        }
        Object o;
        if (!(obj instanceof d0)) {
            o = null;
        }
        else {
            o = obj;
        }
        final d0 d0 = (d0)o;
        Throwable a;
        if (d0 != null) {
            a = d0.a;
        }
        else {
            a = null;
        }
        synchronized (c) {
            final boolean f = c.f();
            final List<Throwable> i = c.i(a);
            final Throwable a2 = this.A0(c, i);
            if (a2 != null) {
                this.d0(a2, i);
            }
            // monitorexit(c)
            if (a2 != null) {
                if (a2 != a) {
                    obj = new d0(a2, false, 2, null);
                }
            }
            if (a2 != null) {
                int n = b2 ? 1 : 0;
                if (!this.m0(a2)) {
                    if (this.G0(a2)) {
                        n = (b2 ? 1 : 0);
                    }
                    else {
                        n = 0;
                    }
                }
                if (n != 0) {
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                    ((d0)obj).b();
                }
            }
            if (!f) {
                this.Y0(a2);
            }
            this.Z0(obj);
            final boolean compareAndSet = s2.G.compareAndSet(this, c, t2.g(obj));
            if (w0.b() && !compareAndSet) {
                throw new AssertionError();
            }
            this.p0(c, obj);
            return obj;
        }
    }
    
    private final v v0(final d2 d2) {
        final boolean b = d2 instanceof v;
        final v v = null;
        d2 d3;
        if (!b) {
            d3 = null;
        }
        else {
            d3 = d2;
        }
        final v v2 = (v)d3;
        v u0;
        if (v2 != null) {
            u0 = v2;
        }
        else {
            final x2 q = d2.q();
            u0 = v;
            if (q != null) {
                u0 = this.U0(q);
            }
        }
        return u0;
    }
    
    private final Throwable z0(Object o) {
        final boolean b = o instanceof d0;
        final Throwable t = null;
        if (!b) {
            o = null;
        }
        final d0 d0 = (d0)o;
        Throwable a = t;
        if (d0 != null) {
            a = d0.a;
        }
        return a;
    }
    
    public boolean B0() {
        return true;
    }
    
    @e
    @Override
    public final l1 C(final boolean b, final boolean b2, @e final l<? super Throwable, j2> l) {
        final r2 s0 = this.S0(l, b);
        while (true) {
            final Object f0 = this.F0();
            if (f0 instanceof o1) {
                final o1 o1 = (o1)f0;
                if (o1.a()) {
                    if (s2.G.compareAndSet(this, f0, s0)) {
                        return s0;
                    }
                    continue;
                }
                else {
                    this.b1(o1);
                }
            }
            else {
                final boolean b3 = f0 instanceof d2;
                final Object o2 = null;
                final Object o3 = null;
                if (!b3) {
                    if (b2) {
                        Object o4 = f0;
                        if (!(f0 instanceof d0)) {
                            o4 = null;
                        }
                        final d0 d0 = (d0)o4;
                        Object a = o2;
                        if (d0 != null) {
                            a = d0.a;
                        }
                        l.invoke(a);
                    }
                    return z2.G;
                }
                final x2 q = ((o1)f0).q();
                if (q == null) {
                    Objects.requireNonNull(f0, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    this.c1((r2)f0);
                }
                else {
                    final z2 g = z2.G;
                    Object e = o3;
                    l1 l2 = g;
                    if (b) {
                        e = o3;
                        l2 = g;
                        if (f0 instanceof c) {
                            synchronized (f0) {
                                e = ((c)f0).e();
                                Label_0234: {
                                    if (e != null) {
                                        l2 = g;
                                        if (!(l instanceof v)) {
                                            break Label_0234;
                                        }
                                        l2 = g;
                                        if (((c)f0).g()) {
                                            break Label_0234;
                                        }
                                    }
                                    if (!this.c0(f0, q, s0)) {
                                        continue;
                                    }
                                    if (e == null) {
                                        return s0;
                                    }
                                    l2 = s0;
                                }
                                final j2 a2 = j2.a;
                            }
                        }
                    }
                    if (e != null) {
                        if (b2) {
                            l.invoke(e);
                        }
                        return l2;
                    }
                    if (this.c0(f0, q, s0)) {
                        return s0;
                    }
                    continue;
                }
            }
        }
    }
    
    public boolean C0() {
        return false;
    }
    
    @f
    public final u E0() {
        return (u)this._parentHandle;
    }
    
    @f
    public final Object F0() {
        Object state;
        while (true) {
            state = this._state;
            if (!(state instanceof kotlinx.coroutines.internal.d0)) {
                break;
            }
            ((kotlinx.coroutines.internal.d0)state).c(this);
        }
        return state;
    }
    
    @i(level = k.H, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    @e
    @Override
    public k2 G(@e final k2 k2) {
        return kotlinx.coroutines.k2.a.i(this, k2);
    }
    
    protected boolean G0(@e final Throwable t) {
        return false;
    }
    
    public void H0(@e final Throwable t) {
        throw t;
    }
    
    public final void I0(@f final k2 k2) {
        if (w0.b() && this.E0() != null) {
            throw new AssertionError();
        }
        if (k2 == null) {
            this.g1(z2.G);
            return;
        }
        k2.start();
        final u y = k2.Y(this);
        this.g1(y);
        if (this.g()) {
            y.dispose();
            this.g1(z2.G);
        }
    }
    
    public final boolean K0() {
        return this.F0() instanceof d0;
    }
    
    protected boolean L0() {
        return false;
    }
    
    @e
    @Override
    public final l1 N(@e final l<? super Throwable, j2> l) {
        return this.C(false, true, l);
    }
    
    final /* synthetic */ Object N0(final d<? super j2> d) {
        final p<Object> p = new p<Object>((kotlin.coroutines.d<? super Object>)kotlin.coroutines.intrinsics.b.d((d)d), 1);
        p.H();
        r.a(p, this.N((l<? super Throwable, j2>)new g3((d<? super j2>)p)));
        final Object y = p.y();
        if (y == kotlin.coroutines.intrinsics.b.h()) {
            h.c((d)d);
        }
        return y;
    }
    
    public final boolean Q0(@f final Object o) {
        while (true) {
            final Object o2 = this.o1(this.F0(), o);
            if (o2 == t2.a()) {
                return false;
            }
            if (o2 == t2.b) {
                return true;
            }
            if (o2 == t2.b()) {
                continue;
            }
            this.e0(o2);
            return true;
        }
    }
    
    @e
    @Override
    public final kotlinx.coroutines.selects.c R() {
        return this;
    }
    
    @f
    public final Object R0(@f final Object obj) {
        while (true) {
            final Object o1 = this.o1(this.F0(), obj);
            if (o1 == t2.a()) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Job ");
                sb.append(this);
                sb.append(" is already complete or completing, ");
                sb.append("but is being completed with ");
                sb.append(obj);
                throw new IllegalStateException(sb.toString(), this.z0(obj));
            }
            if (o1 == t2.b()) {
                continue;
            }
            return o1;
        }
    }
    
    @e
    public String T0() {
        return x0.a(this);
    }
    
    @e
    @Override
    public CancellationException V() {
        final Object f0 = this.F0();
        final boolean b = f0 instanceof c;
        Throwable t = null;
        Throwable t2;
        if (b) {
            t2 = ((c)f0).e();
        }
        else if (f0 instanceof d0) {
            t2 = ((d0)f0).a;
        }
        else {
            if (f0 instanceof d2) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Cannot be cancelling child in this state: ");
                sb.append(f0);
                throw new IllegalStateException(sb.toString().toString());
            }
            t2 = null;
        }
        if (t2 instanceof CancellationException) {
            t = t2;
        }
        final CancellationException ex = (CancellationException)t;
        CancellationException ex2;
        if (ex != null) {
            ex2 = ex;
        }
        else {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Parent job is ");
            sb2.append(this.i1(f0));
            ex2 = new l2(sb2.toString(), t2, this);
        }
        return ex2;
    }
    
    @e
    @Override
    public final u Y(@e final w w) {
        final l1 f = k2.a.f(this, true, false, (l)new v(w), 2, null);
        Objects.requireNonNull(f, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (u)f;
    }
    
    protected void Y0(@f final Throwable t) {
    }
    
    protected void Z0(@f final Object o) {
    }
    
    @Override
    public boolean a() {
        final Object f0 = this.F0();
        return f0 instanceof d2 && ((d2)f0).a();
    }
    
    public void a1() {
    }
    
    @Override
    public void d(@f CancellationException ex) {
        if (ex == null) {
            ex = new l2(this.n0(), null, this);
        }
        this.k0(ex);
    }
    
    public final <T, R> void d1(@e final kotlinx.coroutines.selects.f<? super R> f, @e final n6.p<? super T, ? super d<? super R>, ?> p2) {
        Object f2;
        do {
            f2 = this.F0();
            if (f.s()) {
                return;
            }
            if (!(f2 instanceof d2)) {
                if (f.l()) {
                    if (f2 instanceof d0) {
                        f.J(((d0)f2).a);
                    }
                    else {
                        c7.b.d((n6.p<? super Object, ? super kotlin.coroutines.d<? super Object>, ?>)p2, t2.o(f2), f.w());
                    }
                }
                return;
            }
        } while (this.h1(f2) != 0);
        f.d0(this.N((l<? super Throwable, j2>)new k3((kotlinx.coroutines.selects.f<? super Object>)f, (n6.p<? super Object, ? super kotlin.coroutines.d<? super Object>, ?>)p2)));
    }
    
    protected void e0(@f final Object o) {
    }
    
    public final void e1(@e final r2 r2) {
        Object f0;
        do {
            f0 = this.F0();
            if (!(f0 instanceof r2)) {
                if (f0 instanceof d2 && ((r2)f0).q() != null) {
                    r2.C0();
                }
                return;
            }
            if (f0 != r2) {
                return;
            }
        } while (!s2.G.compareAndSet(this, f0, t2.c()));
    }
    
    public final <T, R> void f1(@e final kotlinx.coroutines.selects.f<? super R> f, @e final n6.p<? super T, ? super d<? super R>, ?> p2) {
        final Object f2 = this.F0();
        if (f2 instanceof d0) {
            f.J(((d0)f2).a);
        }
        else {
            c7.a.e(p2, t2.o(f2), f.w(), null, 4, null);
        }
    }
    
    public <R> R fold(final R r, @e final n6.p<? super R, ? super g$b, ? extends R> p2) {
        return k2.a.d(this, r, p2);
    }
    
    @Override
    public final boolean g() {
        return this.F0() instanceof d2 ^ true;
    }
    
    @f
    public final Object g0(@e final d<Object> d) {
        Object f0;
        do {
            f0 = this.F0();
            if (!(f0 instanceof d2)) {
                if (!(f0 instanceof d0)) {
                    return t2.o(f0);
                }
                final Throwable a = ((d0)f0).a;
                if (!w0.e()) {
                    throw a;
                }
                if (!(d instanceof kotlin.coroutines.jvm.internal.e)) {
                    throw a;
                }
                throw j0.c(a, (kotlin.coroutines.jvm.internal.e)d);
            }
        } while (this.h1(f0) < 0);
        return this.h0(d);
    }
    
    public final void g1(@f final u parentHandle) {
        this._parentHandle = parentHandle;
    }
    
    @f
    public <E extends g$b> E get(@e final g$c<E> g$c) {
        return k2.a.e(this, g$c);
    }
    
    @e
    public final g$c<?> getKey() {
        return (g$c<?>)k2.t;
    }
    
    final /* synthetic */ Object h0(final d<Object> d) {
        final a a = new a<Object>((kotlin.coroutines.d<? super Object>)kotlin.coroutines.intrinsics.b.d((d)d), this);
        r.a(a, this.N((l<? super Throwable, j2>)new f3(a)));
        final Object y = a.y();
        if (y == kotlin.coroutines.intrinsics.b.h()) {
            h.c((d)d);
        }
        return y;
    }
    
    public final boolean i0(@f final Throwable t) {
        return this.j0(t);
    }
    
    @Override
    public final boolean isCancelled() {
        final Object f0 = this.F0();
        return f0 instanceof d0 || (f0 instanceof c && ((c)f0).f());
    }
    
    public final boolean j0(@f final Object o) {
        Object o2 = t2.a();
        final boolean c0 = this.C0();
        boolean b = true;
        if (c0 && (o2 = this.l0(o)) == t2.b) {
            return true;
        }
        Object p;
        if ((p = o2) == t2.a()) {
            p = this.P0(o);
        }
        if (p != t2.a()) {
            if (p != t2.b) {
                if (p == t2.f()) {
                    b = false;
                }
                else {
                    this.e0(p);
                }
            }
        }
        return b;
    }
    
    @e
    protected final CancellationException j1(@e final Throwable t, @f String a0) {
        Throwable t2;
        if (!(t instanceof CancellationException)) {
            t2 = null;
        }
        else {
            t2 = t;
        }
        final CancellationException ex = (CancellationException)t2;
        CancellationException ex2;
        if (ex != null) {
            ex2 = ex;
        }
        else {
            if (a0 == null) {
                a0 = this.n0();
            }
            ex2 = new l2(a0, t, this);
        }
        return ex2;
    }
    
    public void k0(@e final Throwable t) {
        this.j0(t);
    }
    
    @f2
    @e
    public final String l1() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.T0());
        sb.append('{');
        sb.append(this.i1(this.F0()));
        sb.append('}');
        return sb.toString();
    }
    
    @e
    public g minusKey(@e final g$c<?> g$c) {
        return k2.a.g(this, g$c);
    }
    
    @e
    protected String n0() {
        return "Job was cancelled";
    }
    
    public boolean o0(@e final Throwable t) {
        final boolean b = t instanceof CancellationException;
        boolean b2 = true;
        if (b) {
            return true;
        }
        if (!this.j0(t) || !this.B0()) {
            b2 = false;
        }
        return b2;
    }
    
    @e
    public g plus(@e final g g) {
        return k2.a.h(this, g);
    }
    
    @e
    @Override
    public final kotlin.sequences.m<k2> q() {
        return kotlin.sequences.p.e((n6.p<? super kotlin.sequences.o<? super k2>, ? super d<? super j2>, ?>)new n6.p<kotlin.sequences.o<? super w>, d<? super j2>, Object>() {
            private /* synthetic */ Object H;
            Object I;
            Object J;
            int K;
            final /* synthetic */ s2 L;
            
            @e
            public final d<j2> create(@f final Object h, @e final d<?> d) {
                final n6.p<kotlin.sequences.o<? super w>, d<? super j2>, Object> p2 = (n6.p<kotlin.sequences.o<? super w>, d<? super j2>, Object>)new n6.p<kotlin.sequences.o<? super w>, d<? super j2>, Object>() {
                    private /* synthetic */ Object H;
                    Object I;
                    Object J;
                    int K;
                    final /* synthetic */ s2 L = this.L;
                };
                p2.H = h;
                return (d<j2>)p2;
            }
            
            public final Object invoke(final Object o, final Object o2) {
                return ((s2$e)this.create(o, (d<?>)o2)).invokeSuspend(j2.a);
            }
            
            @f
            public final Object invokeSuspend(@e Object obj) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int k = this.K;
                while (true) {
                    t t = null;
                    kotlinx.coroutines.internal.r r = null;
                    kotlin.sequences.o<w> o = null;
                    Object o2 = null;
                    Label_0273: {
                        kotlin.sequences.o<w> h2;
                        kotlinx.coroutines.internal.r q;
                        t v0;
                        Object o3;
                        if (k != 0) {
                            if (k == 1) {
                                c1.n(obj);
                                return j2.a;
                            }
                            if (k == 2) {
                                t = (t)this.J;
                                r = (kotlinx.coroutines.internal.r)this.I;
                                o = (kotlin.sequences.o<w>)this.H;
                                c1.n(obj);
                                o2 = this;
                                break Label_0273;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        else {
                            c1.n(obj);
                            h2 = (kotlin.sequences.o<w>)this.H;
                            obj = this.L.F0();
                            if (obj instanceof v) {
                                final w i = ((v)obj).K;
                                this.K = 1;
                                if (h2.b(i, (d<? super j2>)this) == h) {
                                    return h;
                                }
                                return j2.a;
                            }
                            else {
                                if (!(obj instanceof d2)) {
                                    return j2.a;
                                }
                                q = ((d2)obj).q();
                                if (q == null) {
                                    return j2.a;
                                }
                                obj = q.u0();
                                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                                v0 = (t)obj;
                                o3 = this;
                            }
                        }
                        if (!(k0.g((Object)v0, (Object)q) ^ true)) {
                            return j2.a;
                        }
                        t = v0;
                        r = q;
                        o = h2;
                        o2 = o3;
                        if (v0 instanceof v) {
                            final w j = ((v)v0).K;
                            ((s2$e)o3).H = h2;
                            ((s2$e)o3).I = q;
                            ((s2$e)o3).J = v0;
                            ((s2$e)o3).K = 2;
                            t = v0;
                            r = q;
                            o = h2;
                            o2 = o3;
                            if (h2.b(j, (d<? super j2>)o3) == h) {
                                return h;
                            }
                        }
                    }
                    t v0 = t.v0();
                    kotlinx.coroutines.internal.r q = r;
                    kotlin.sequences.o<w> h2 = o;
                    Object o3 = o2;
                    continue;
                }
            }
        });
    }
    
    @f
    public final Throwable r() {
        final Object f0 = this.F0();
        if (f0 instanceof d2 ^ true) {
            return this.z0(f0);
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }
    
    @f
    @Override
    public final Object s(@e final d<? super j2> d) {
        if (!this.M0()) {
            f4.a(d.getContext());
            return j2.a;
        }
        final Object n0 = this.N0(d);
        if (n0 == kotlin.coroutines.intrinsics.b.h()) {
            return n0;
        }
        return j2.a;
    }
    
    @e
    public final l2 s0(@f String a0, @f final Throwable t) {
        if (a0 == null) {
            a0 = this.n0();
        }
        return new l2(a0, t, this);
    }
    
    @Override
    public final boolean start() {
        while (true) {
            final int h1 = this.h1(this.F0());
            if (h1 == 0) {
                return false;
            }
            if (h1 != 1) {
                continue;
            }
            return true;
        }
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.l1());
        sb.append('@');
        sb.append(x0.b(this));
        return sb.toString();
    }
    
    @Override
    public final <R> void u(@e final kotlinx.coroutines.selects.f<? super R> f, @e final l<? super d<? super R>, ?> l) {
        Object f2;
        do {
            f2 = this.F0();
            if (f.s()) {
                return;
            }
            if (!(f2 instanceof d2)) {
                if (f.l()) {
                    c7.b.c((n6.l<? super kotlin.coroutines.d<? super Object>, ?>)l, f.w());
                }
                return;
            }
        } while (this.h1(f2) != 0);
        f.d0(this.N((l<? super Throwable, j2>)new l3((kotlinx.coroutines.selects.f<? super Object>)f, l)));
    }
    
    @e
    @Override
    public final CancellationException w() {
        final Object f0 = this.F0();
        if (f0 instanceof c) {
            final Throwable e = ((c)f0).e();
            if (e != null) {
                final StringBuilder sb = new StringBuilder();
                sb.append(x0.a(this));
                sb.append(" is cancelling");
                final CancellationException ex = this.j1(e, sb.toString());
                if (ex != null) {
                    return ex;
                }
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Job is still new or active: ");
            sb2.append(this);
            throw new IllegalStateException(sb2.toString().toString());
        }
        if (f0 instanceof d2) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("Job is still new or active: ");
            sb3.append(this);
            throw new IllegalStateException(sb3.toString().toString());
        }
        CancellationException ex;
        if (f0 instanceof d0) {
            ex = k1(this, ((d0)f0).a, null, 1, null);
        }
        else {
            final StringBuilder sb4 = new StringBuilder();
            sb4.append(x0.a(this));
            sb4.append(" has completed normally");
            ex = new l2(sb4.toString(), null, this);
        }
        return ex;
    }
    
    @f
    public final Object w0() {
        final Object f0 = this.F0();
        if (!(f0 instanceof d2 ^ true)) {
            throw new IllegalStateException("This job has not completed yet".toString());
        }
        if (!(f0 instanceof d0)) {
            return t2.o(f0);
        }
        throw ((d0)f0).a;
    }
    
    @f
    protected final Throwable x0() {
        final Object f0 = this.F0();
        Throwable t;
        if (f0 instanceof c) {
            t = ((c)f0).e();
            if (t == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Job is still new or active: ");
                sb.append(this);
                throw new IllegalStateException(sb.toString().toString());
            }
        }
        else {
            if (f0 instanceof d2) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Job is still new or active: ");
                sb2.append(this);
                throw new IllegalStateException(sb2.toString().toString());
            }
            if (f0 instanceof d0) {
                t = ((d0)f0).a;
            }
            else {
                t = null;
            }
        }
        return t;
    }
    
    @Override
    public final void y(@e final c3 c3) {
        this.j0(c3);
    }
    
    protected final boolean y0() {
        final Object f0 = this.F0();
        return f0 instanceof d0 && ((d0)f0).a();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000*\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0014R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0011" }, d2 = { "kotlinx/coroutines/s2$a", "T", "Lkotlinx/coroutines/p;", "Lkotlinx/coroutines/k2;", "parent", "", "w", "", "I", "Lkotlinx/coroutines/s2;", "N", "Lkotlinx/coroutines/s2;", "job", "Lkotlin/coroutines/d;", "delegate", "<init>", "(Lkotlin/coroutines/d;Lkotlinx/coroutines/s2;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    private static final class a<T> extends p<T>
    {
        private final s2 N;
        
        public a(@e final d<? super T> d, @e final s2 n) {
            super(d, 1);
            this.N = n;
        }
        
        @e
        @Override
        protected String I() {
            return "AwaitContinuation";
        }
        
        @e
        @Override
        public Throwable w(@e final k2 k2) {
            final Object f0 = this.N.F0();
            if (f0 instanceof c) {
                final Throwable e = ((c)f0).e();
                if (e != null) {
                    return e;
                }
            }
            if (f0 instanceof d0) {
                return ((d0)f0).a;
            }
            return k2.w();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0015\u001a\u00020\u0012\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0018\u0010\r\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018" }, d2 = { "kotlinx/coroutines/s2$b", "Lkotlinx/coroutines/r2;", "", "cause", "Lkotlin/j2;", "J0", "Lkotlinx/coroutines/v;", "M", "Lkotlinx/coroutines/v;", "child", "", "N", "Ljava/lang/Object;", "proposedUpdate", "Lkotlinx/coroutines/s2$c;", "L", "Lkotlinx/coroutines/s2$c;", "state", "Lkotlinx/coroutines/s2;", "K", "Lkotlinx/coroutines/s2;", "parent", "<init>", "(Lkotlinx/coroutines/s2;Lkotlinx/coroutines/s2$c;Lkotlinx/coroutines/v;Ljava/lang/Object;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    private static final class b extends r2
    {
        private final s2 K;
        private final s2.c L;
        private final v M;
        private final Object N;
        
        public b(@org.jetbrains.annotations.e final s2 k, @org.jetbrains.annotations.e final s2.c l, @org.jetbrains.annotations.e final v m, @f final Object n) {
            this.K = k;
            this.L = l;
            this.M = m;
            this.N = n;
        }
        
        @Override
        public void J0(@f final Throwable t) {
            this.K.q0(this.L, this.M, this.N);
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000F\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B!\u0012\u0006\u0010\u001f\u001a\u00020\u001a\u0012\u0006\u0010%\u001a\u00020 \u0012\b\u0010-\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b0\u00101J\u001f\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R(\u0010\u0019\u001a\u0004\u0018\u00010\u00012\b\u0010\u0014\u001a\u0004\u0018\u00010\u00018B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001f\u001a\u00020\u001a8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR$\u0010%\u001a\u00020 2\u0006\u0010\u0014\u001a\u00020 8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0013\u0010'\u001a\u00020 8F@\u0006¢\u0006\u0006\u001a\u0004\b&\u0010\"R\u0016\u0010)\u001a\u00020 8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\"R(\u0010-\u001a\u0004\u0018\u00010\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u00058F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010\u0010R\u0013\u0010/\u001a\u00020 8F@\u0006¢\u0006\u0006\u001a\u0004\b.\u0010\"¨\u00062" }, d2 = { "kotlinx/coroutines/s2$c", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "Lkotlinx/coroutines/d2;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "c", "()Ljava/util/ArrayList;", "proposedException", "", "i", "(Ljava/lang/Throwable;)Ljava/util/List;", "exception", "Lkotlin/j2;", "b", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "value", "d", "()Ljava/lang/Object;", "k", "(Ljava/lang/Object;)V", "exceptionsHolder", "Lkotlinx/coroutines/x2;", "G", "Lkotlinx/coroutines/x2;", "q", "()Lkotlinx/coroutines/x2;", "list", "", "g", "()Z", "j", "(Z)V", "isCompleting", "h", "isSealed", "a", "isActive", "e", "()Ljava/lang/Throwable;", "l", "rootCause", "f", "isCancelling", "<init>", "(Lkotlinx/coroutines/x2;ZLjava/lang/Throwable;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    private static final class c implements d2
    {
        @e
        private final x2 G;
        private volatile /* synthetic */ Object _exceptionsHolder;
        private volatile /* synthetic */ int _isCompleting;
        private volatile /* synthetic */ Object _rootCause;
        
        public c(@e final x2 g, final boolean isCompleting, @f final Throwable rootCause) {
            this.G = g;
            this._isCompleting = (isCompleting ? 1 : 0);
            this._rootCause = rootCause;
            this._exceptionsHolder = null;
        }
        
        private final ArrayList<Throwable> c() {
            return new ArrayList<Throwable>(4);
        }
        
        private final Object d() {
            return this._exceptionsHolder;
        }
        
        private final void k(final Object exceptionsHolder) {
            this._exceptionsHolder = exceptionsHolder;
        }
        
        @Override
        public boolean a() {
            return this.e() == null;
        }
        
        public final void b(@e final Throwable t) {
            final Throwable e = this.e();
            if (e == null) {
                this.l(t);
                return;
            }
            if (t == e) {
                return;
            }
            final Object d = this.d();
            if (d == null) {
                this.k(t);
            }
            else if (d instanceof Throwable) {
                if (t == d) {
                    return;
                }
                final ArrayList<Throwable> c = this.c();
                c.add((Throwable)d);
                c.add(t);
                final j2 a = j2.a;
                this.k(c);
            }
            else {
                if (!(d instanceof ArrayList)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("State is ");
                    sb.append(d);
                    throw new IllegalStateException(sb.toString().toString());
                }
                ((ArrayList<Throwable>)d).add(t);
            }
        }
        
        @f
        public final Throwable e() {
            return (Throwable)this._rootCause;
        }
        
        public final boolean f() {
            return this.e() != null;
        }
        
        public final boolean g() {
            return this._isCompleting != 0;
        }
        
        public final boolean h() {
            return this.d() == t2.e();
        }
        
        @e
        public final List<Throwable> i(@f final Throwable e) {
            final Object d = this.d();
            List<E> list;
            if (d == null) {
                list = (List<E>)this.c();
            }
            else if (d instanceof Throwable) {
                list = (List<E>)this.c();
                ((ArrayList<ArrayList<Object>>)list).add((ArrayList<Object>)d);
            }
            else {
                if (!(d instanceof ArrayList)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("State is ");
                    sb.append(d);
                    throw new IllegalStateException(sb.toString().toString());
                }
                list = (List<E>)d;
            }
            final Throwable e2 = this.e();
            if (e2 != null) {
                ((ArrayList<ArrayList<Object>>)list).add(0, (ArrayList<Object>)e2);
            }
            if (e != null && (k0.g((Object)e, (Object)e2) ^ true)) {
                ((ArrayList<ArrayList<Object>>)list).add((ArrayList<Object>)e);
            }
            this.k(t2.e());
            return (List<Throwable>)list;
        }
        
        public final void j(final boolean isCompleting) {
            this._isCompleting = (isCompleting ? 1 : 0);
        }
        
        public final void l(@f final Throwable rootCause) {
            this._rootCause = rootCause;
        }
        
        @e
        @Override
        public x2 q() {
            return this.G;
        }
        
        @e
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("Finishing[cancelling=");
            sb.append(this.f());
            sb.append(", completing=");
            sb.append(this.g());
            sb.append(", rootCause=");
            sb.append(this.e());
            sb.append(", exceptions=");
            sb.append(this.d());
            sb.append(", list=");
            sb.append(this.q());
            sb.append(']');
            return sb.toString();
        }
    }
}
