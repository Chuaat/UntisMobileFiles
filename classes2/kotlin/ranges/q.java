// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.ranges;

import kotlin.j;
import kotlin.o2;
import kotlin.e1;
import java.util.NoSuchElementException;
import kotlin.random.g;
import kotlin.jvm.internal.k0;
import kotlin.random.f;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bA\n\u0002\u0010\u000f\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\b\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0087\b\u001a\r\u0010\u0005\u001a\u00020\u0004*\u00020\u0003H\u0087\b\u001a\r\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0087\b\u001a\u0014\u0010\u000b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0007\u001a\u0014\u0010\f\u001a\u00020\u0004*\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0007\u001a\u0014\u0010\r\u001a\u00020\u0007*\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007\u001a\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0087\b¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0004*\u00020\u0003H\u0087\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u0007*\u00020\u0006H\u0087\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u0004*\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u0007*\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001e\u0010\u001c\u001a\u00020\u001b*\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u0087\n¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001e\u0010\u001e\u001a\u00020\u001b*\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004H\u0087\n¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001e\u0010 \u001a\u00020\u001b*\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u0007H\u0087\n¢\u0006\u0004\b \u0010!\u001a\"\u0010%\u001a\u00020\u001b*\b\u0012\u0004\u0012\u00020\u00010\"2\u0006\u0010$\u001a\u00020#H\u0087\u0002¢\u0006\u0004\b%\u0010&\u001a\"\u0010'\u001a\u00020\u001b*\b\u0012\u0004\u0012\u00020\u00040\"2\u0006\u0010$\u001a\u00020#H\u0087\u0002¢\u0006\u0004\b'\u0010&\u001a\"\u0010)\u001a\u00020\u001b*\b\u0012\u0004\u0012\u00020(0\"2\u0006\u0010$\u001a\u00020#H\u0087\u0002¢\u0006\u0004\b)\u0010&\u001a\"\u0010+\u001a\u00020\u001b*\b\u0012\u0004\u0012\u00020*0\"2\u0006\u0010$\u001a\u00020#H\u0087\u0002¢\u0006\u0004\b+\u0010&\u001a\"\u0010-\u001a\u00020\u001b*\b\u0012\u0004\u0012\u00020,0\"2\u0006\u0010$\u001a\u00020#H\u0087\u0002¢\u0006\u0004\b-\u0010&\u001a\"\u0010.\u001a\u00020\u001b*\b\u0012\u0004\u0012\u00020\u00010\"2\u0006\u0010$\u001a\u00020*H\u0087\u0002¢\u0006\u0004\b.\u0010/\u001a\"\u00100\u001a\u00020\u001b*\b\u0012\u0004\u0012\u00020\u00040\"2\u0006\u0010$\u001a\u00020*H\u0087\u0002¢\u0006\u0004\b0\u0010/\u001a\"\u00101\u001a\u00020\u001b*\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010$\u001a\u00020*H\u0087\u0002¢\u0006\u0004\b1\u0010/\u001a\"\u00102\u001a\u00020\u001b*\b\u0012\u0004\u0012\u00020(0\"2\u0006\u0010$\u001a\u00020*H\u0087\u0002¢\u0006\u0004\b2\u0010/\u001a\"\u00103\u001a\u00020\u001b*\b\u0012\u0004\u0012\u00020,0\"2\u0006\u0010$\u001a\u00020*H\u0087\u0002¢\u0006\u0004\b3\u0010/\u001a\"\u00104\u001a\u00020\u001b*\b\u0012\u0004\u0012\u00020\u00010\"2\u0006\u0010$\u001a\u00020,H\u0087\u0002¢\u0006\u0004\b4\u00105\u001a\"\u00106\u001a\u00020\u001b*\b\u0012\u0004\u0012\u00020\u00040\"2\u0006\u0010$\u001a\u00020,H\u0087\u0002¢\u0006\u0004\b6\u00105\u001a\"\u00107\u001a\u00020\u001b*\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010$\u001a\u00020,H\u0087\u0002¢\u0006\u0004\b7\u00105\u001a\"\u00108\u001a\u00020\u001b*\b\u0012\u0004\u0012\u00020(0\"2\u0006\u0010$\u001a\u00020,H\u0087\u0002¢\u0006\u0004\b8\u00105\u001a\"\u00109\u001a\u00020\u001b*\b\u0012\u0004\u0012\u00020*0\"2\u0006\u0010$\u001a\u00020,H\u0087\u0002¢\u0006\u0004\b9\u00105\u001a\"\u0010:\u001a\u00020\u001b*\b\u0012\u0004\u0012\u00020\u00040\"2\u0006\u0010$\u001a\u00020\u0001H\u0087\u0002¢\u0006\u0004\b:\u0010;\u001a\"\u0010<\u001a\u00020\u001b*\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010$\u001a\u00020\u0001H\u0087\u0002¢\u0006\u0004\b<\u0010;\u001a\"\u0010=\u001a\u00020\u001b*\b\u0012\u0004\u0012\u00020(0\"2\u0006\u0010$\u001a\u00020\u0001H\u0087\u0002¢\u0006\u0004\b=\u0010;\u001a\"\u0010>\u001a\u00020\u001b*\b\u0012\u0004\u0012\u00020*0\"2\u0006\u0010$\u001a\u00020\u0001H\u0087\u0002¢\u0006\u0004\b>\u0010;\u001a\"\u0010?\u001a\u00020\u001b*\b\u0012\u0004\u0012\u00020,0\"2\u0006\u0010$\u001a\u00020\u0001H\u0087\u0002¢\u0006\u0004\b?\u0010;\u001a\"\u0010@\u001a\u00020\u001b*\b\u0012\u0004\u0012\u00020\u00010\"2\u0006\u0010$\u001a\u00020\u0004H\u0087\u0002¢\u0006\u0004\b@\u0010A\u001a\"\u0010B\u001a\u00020\u001b*\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010$\u001a\u00020\u0004H\u0087\u0002¢\u0006\u0004\bB\u0010A\u001a\"\u0010C\u001a\u00020\u001b*\b\u0012\u0004\u0012\u00020(0\"2\u0006\u0010$\u001a\u00020\u0004H\u0087\u0002¢\u0006\u0004\bC\u0010A\u001a\"\u0010D\u001a\u00020\u001b*\b\u0012\u0004\u0012\u00020*0\"2\u0006\u0010$\u001a\u00020\u0004H\u0087\u0002¢\u0006\u0004\bD\u0010A\u001a\"\u0010E\u001a\u00020\u001b*\b\u0012\u0004\u0012\u00020,0\"2\u0006\u0010$\u001a\u00020\u0004H\u0087\u0002¢\u0006\u0004\bE\u0010A\u001a\"\u0010F\u001a\u00020\u001b*\b\u0012\u0004\u0012\u00020\u00010\"2\u0006\u0010$\u001a\u00020(H\u0087\u0002¢\u0006\u0004\bF\u0010G\u001a\"\u0010H\u001a\u00020\u001b*\b\u0012\u0004\u0012\u00020\u00040\"2\u0006\u0010$\u001a\u00020(H\u0087\u0002¢\u0006\u0004\bH\u0010G\u001a\"\u0010I\u001a\u00020\u001b*\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010$\u001a\u00020(H\u0087\u0002¢\u0006\u0004\bI\u0010G\u001a\"\u0010J\u001a\u00020\u001b*\b\u0012\u0004\u0012\u00020*0\"2\u0006\u0010$\u001a\u00020(H\u0087\u0002¢\u0006\u0004\bJ\u0010G\u001a\"\u0010K\u001a\u00020\u001b*\b\u0012\u0004\u0012\u00020,0\"2\u0006\u0010$\u001a\u00020(H\u0087\u0002¢\u0006\u0004\bK\u0010G\u001a\u0015\u0010N\u001a\u00020M*\u00020\u00012\u0006\u0010L\u001a\u00020#H\u0086\u0004\u001a\u0015\u0010P\u001a\u00020O*\u00020\u00042\u0006\u0010L\u001a\u00020#H\u0086\u0004\u001a\u0015\u0010Q\u001a\u00020M*\u00020#2\u0006\u0010L\u001a\u00020#H\u0086\u0004\u001a\u0015\u0010R\u001a\u00020M*\u00020(2\u0006\u0010L\u001a\u00020#H\u0086\u0004\u001a\u0015\u0010T\u001a\u00020S*\u00020\u00072\u0006\u0010L\u001a\u00020\u0007H\u0086\u0004\u001a\u0015\u0010U\u001a\u00020M*\u00020\u00012\u0006\u0010L\u001a\u00020\u0001H\u0086\u0004\u001a\u0015\u0010V\u001a\u00020O*\u00020\u00042\u0006\u0010L\u001a\u00020\u0001H\u0086\u0004\u001a\u0015\u0010W\u001a\u00020M*\u00020#2\u0006\u0010L\u001a\u00020\u0001H\u0086\u0004\u001a\u0015\u0010X\u001a\u00020M*\u00020(2\u0006\u0010L\u001a\u00020\u0001H\u0086\u0004\u001a\u0015\u0010Y\u001a\u00020O*\u00020\u00012\u0006\u0010L\u001a\u00020\u0004H\u0086\u0004\u001a\u0015\u0010Z\u001a\u00020O*\u00020\u00042\u0006\u0010L\u001a\u00020\u0004H\u0086\u0004\u001a\u0015\u0010[\u001a\u00020O*\u00020#2\u0006\u0010L\u001a\u00020\u0004H\u0086\u0004\u001a\u0015\u0010\\\u001a\u00020O*\u00020(2\u0006\u0010L\u001a\u00020\u0004H\u0086\u0004\u001a\u0015\u0010]\u001a\u00020M*\u00020\u00012\u0006\u0010L\u001a\u00020(H\u0086\u0004\u001a\u0015\u0010^\u001a\u00020O*\u00020\u00042\u0006\u0010L\u001a\u00020(H\u0086\u0004\u001a\u0015\u0010_\u001a\u00020M*\u00020#2\u0006\u0010L\u001a\u00020(H\u0086\u0004\u001a\u0015\u0010`\u001a\u00020M*\u00020(2\u0006\u0010L\u001a\u00020(H\u0086\u0004\u001a\n\u0010a\u001a\u00020M*\u00020M\u001a\n\u0010b\u001a\u00020O*\u00020O\u001a\n\u0010c\u001a\u00020S*\u00020S\u001a\u0015\u0010e\u001a\u00020M*\u00020M2\u0006\u0010d\u001a\u00020\u0001H\u0086\u0004\u001a\u0015\u0010f\u001a\u00020O*\u00020O2\u0006\u0010d\u001a\u00020\u0004H\u0086\u0004\u001a\u0015\u0010g\u001a\u00020S*\u00020S2\u0006\u0010d\u001a\u00020\u0001H\u0086\u0004\u001a\u0015\u0010h\u001a\u0004\u0018\u00010#*\u00020\u0001H\u0000¢\u0006\u0004\bh\u0010i\u001a\u0015\u0010j\u001a\u0004\u0018\u00010#*\u00020\u0004H\u0000¢\u0006\u0004\bj\u0010k\u001a\u0015\u0010l\u001a\u0004\u0018\u00010#*\u00020(H\u0000¢\u0006\u0004\bl\u0010m\u001a\u0015\u0010n\u001a\u0004\u0018\u00010#*\u00020*H\u0000¢\u0006\u0004\bn\u0010o\u001a\u0015\u0010p\u001a\u0004\u0018\u00010#*\u00020,H\u0000¢\u0006\u0004\bp\u0010q\u001a\u0015\u0010r\u001a\u0004\u0018\u00010\u0001*\u00020\u0004H\u0000¢\u0006\u0004\br\u0010s\u001a\u0015\u0010t\u001a\u0004\u0018\u00010\u0001*\u00020*H\u0000¢\u0006\u0004\bt\u0010u\u001a\u0015\u0010v\u001a\u0004\u0018\u00010\u0001*\u00020,H\u0000¢\u0006\u0004\bv\u0010w\u001a\u0015\u0010x\u001a\u0004\u0018\u00010\u0004*\u00020*H\u0000¢\u0006\u0004\bx\u0010y\u001a\u0015\u0010z\u001a\u0004\u0018\u00010\u0004*\u00020,H\u0000¢\u0006\u0004\bz\u0010{\u001a\u0015\u0010|\u001a\u0004\u0018\u00010(*\u00020\u0001H\u0000¢\u0006\u0004\b|\u0010}\u001a\u0015\u0010~\u001a\u0004\u0018\u00010(*\u00020\u0004H\u0000¢\u0006\u0004\b~\u0010\u007f\u001a\u0018\u0010\u0080\u0001\u001a\u0004\u0018\u00010(*\u00020*H\u0000¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0018\u0010\u0082\u0001\u001a\u0004\u0018\u00010(*\u00020,H\u0000¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0016\u0010\u0084\u0001\u001a\u00020\u0000*\u00020\u00012\u0006\u0010L\u001a\u00020#H\u0086\u0004\u001a\u0016\u0010\u0085\u0001\u001a\u00020\u0003*\u00020\u00042\u0006\u0010L\u001a\u00020#H\u0086\u0004\u001a\u0016\u0010\u0086\u0001\u001a\u00020\u0000*\u00020#2\u0006\u0010L\u001a\u00020#H\u0086\u0004\u001a\u0016\u0010\u0087\u0001\u001a\u00020\u0000*\u00020(2\u0006\u0010L\u001a\u00020#H\u0086\u0004\u001a\u0016\u0010\u0088\u0001\u001a\u00020\u0006*\u00020\u00072\u0006\u0010L\u001a\u00020\u0007H\u0086\u0004\u001a\u0016\u0010\u0089\u0001\u001a\u00020\u0000*\u00020\u00012\u0006\u0010L\u001a\u00020\u0001H\u0086\u0004\u001a\u0016\u0010\u008a\u0001\u001a\u00020\u0003*\u00020\u00042\u0006\u0010L\u001a\u00020\u0001H\u0086\u0004\u001a\u0016\u0010\u008b\u0001\u001a\u00020\u0000*\u00020#2\u0006\u0010L\u001a\u00020\u0001H\u0086\u0004\u001a\u0016\u0010\u008c\u0001\u001a\u00020\u0000*\u00020(2\u0006\u0010L\u001a\u00020\u0001H\u0086\u0004\u001a\u0016\u0010\u008d\u0001\u001a\u00020\u0003*\u00020\u00012\u0006\u0010L\u001a\u00020\u0004H\u0086\u0004\u001a\u0016\u0010\u008e\u0001\u001a\u00020\u0003*\u00020\u00042\u0006\u0010L\u001a\u00020\u0004H\u0086\u0004\u001a\u0016\u0010\u008f\u0001\u001a\u00020\u0003*\u00020#2\u0006\u0010L\u001a\u00020\u0004H\u0086\u0004\u001a\u0016\u0010\u0090\u0001\u001a\u00020\u0003*\u00020(2\u0006\u0010L\u001a\u00020\u0004H\u0086\u0004\u001a\u0016\u0010\u0091\u0001\u001a\u00020\u0000*\u00020\u00012\u0006\u0010L\u001a\u00020(H\u0086\u0004\u001a\u0016\u0010\u0092\u0001\u001a\u00020\u0003*\u00020\u00042\u0006\u0010L\u001a\u00020(H\u0086\u0004\u001a\u0016\u0010\u0093\u0001\u001a\u00020\u0000*\u00020#2\u0006\u0010L\u001a\u00020(H\u0086\u0004\u001a\u0016\u0010\u0094\u0001\u001a\u00020\u0000*\u00020(2\u0006\u0010L\u001a\u00020(H\u0086\u0004\u001a.\u0010\u0097\u0001\u001a\u00028\u0000\"\u000f\b\u0000\u0010W*\t\u0012\u0004\u0012\u00028\u00000\u0095\u0001*\u00028\u00002\u0007\u0010\u0096\u0001\u001a\u00028\u0000¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0014\u0010\u0099\u0001\u001a\u00020#*\u00020#2\u0007\u0010\u0096\u0001\u001a\u00020#\u001a\u0014\u0010\u009a\u0001\u001a\u00020(*\u00020(2\u0007\u0010\u0096\u0001\u001a\u00020(\u001a\u0014\u0010\u009b\u0001\u001a\u00020\u0001*\u00020\u00012\u0007\u0010\u0096\u0001\u001a\u00020\u0001\u001a\u0014\u0010\u009c\u0001\u001a\u00020\u0004*\u00020\u00042\u0007\u0010\u0096\u0001\u001a\u00020\u0004\u001a\u0014\u0010\u009d\u0001\u001a\u00020,*\u00020,2\u0007\u0010\u0096\u0001\u001a\u00020,\u001a\u0014\u0010\u009e\u0001\u001a\u00020**\u00020*2\u0007\u0010\u0096\u0001\u001a\u00020*\u001a.\u0010 \u0001\u001a\u00028\u0000\"\u000f\b\u0000\u0010W*\t\u0012\u0004\u0012\u00028\u00000\u0095\u0001*\u00028\u00002\u0007\u0010\u009f\u0001\u001a\u00028\u0000¢\u0006\u0006\b \u0001\u0010\u0098\u0001\u001a\u0014\u0010¡\u0001\u001a\u00020#*\u00020#2\u0007\u0010\u009f\u0001\u001a\u00020#\u001a\u0014\u0010¢\u0001\u001a\u00020(*\u00020(2\u0007\u0010\u009f\u0001\u001a\u00020(\u001a\u0014\u0010£\u0001\u001a\u00020\u0001*\u00020\u00012\u0007\u0010\u009f\u0001\u001a\u00020\u0001\u001a\u0014\u0010¤\u0001\u001a\u00020\u0004*\u00020\u00042\u0007\u0010\u009f\u0001\u001a\u00020\u0004\u001a\u0014\u0010¥\u0001\u001a\u00020,*\u00020,2\u0007\u0010\u009f\u0001\u001a\u00020,\u001a\u0014\u0010¦\u0001\u001a\u00020**\u00020*2\u0007\u0010\u009f\u0001\u001a\u00020*\u001a;\u0010§\u0001\u001a\u00028\u0000\"\u000f\b\u0000\u0010W*\t\u0012\u0004\u0012\u00028\u00000\u0095\u0001*\u00028\u00002\t\u0010\u0096\u0001\u001a\u0004\u0018\u00018\u00002\t\u0010\u009f\u0001\u001a\u0004\u0018\u00018\u0000¢\u0006\u0006\b§\u0001\u0010¨\u0001\u001a\u001d\u0010©\u0001\u001a\u00020#*\u00020#2\u0007\u0010\u0096\u0001\u001a\u00020#2\u0007\u0010\u009f\u0001\u001a\u00020#\u001a\u001d\u0010ª\u0001\u001a\u00020(*\u00020(2\u0007\u0010\u0096\u0001\u001a\u00020(2\u0007\u0010\u009f\u0001\u001a\u00020(\u001a\u001d\u0010«\u0001\u001a\u00020\u0001*\u00020\u00012\u0007\u0010\u0096\u0001\u001a\u00020\u00012\u0007\u0010\u009f\u0001\u001a\u00020\u0001\u001a\u001d\u0010¬\u0001\u001a\u00020\u0004*\u00020\u00042\u0007\u0010\u0096\u0001\u001a\u00020\u00042\u0007\u0010\u009f\u0001\u001a\u00020\u0004\u001a\u001d\u0010\u00ad\u0001\u001a\u00020,*\u00020,2\u0007\u0010\u0096\u0001\u001a\u00020,2\u0007\u0010\u009f\u0001\u001a\u00020,\u001a\u001d\u0010®\u0001\u001a\u00020**\u00020*2\u0007\u0010\u0096\u0001\u001a\u00020*2\u0007\u0010\u009f\u0001\u001a\u00020*\u001a7\u0010±\u0001\u001a\u00028\u0000\"\u000f\b\u0000\u0010W*\t\u0012\u0004\u0012\u00028\u00000\u0095\u0001*\u00028\u00002\u000e\u0010°\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000¯\u0001H\u0007¢\u0006\u0006\b±\u0001\u0010²\u0001\u001a4\u0010³\u0001\u001a\u00028\u0000\"\u000f\b\u0000\u0010W*\t\u0012\u0004\u0012\u00028\u00000\u0095\u0001*\u00028\u00002\r\u0010°\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\"¢\u0006\u0006\b³\u0001\u0010´\u0001\u001a\u001a\u0010µ\u0001\u001a\u00020\u0001*\u00020\u00012\r\u0010°\u0001\u001a\b\u0012\u0004\u0012\u00020\u00010\"\u001a\u001a\u0010¶\u0001\u001a\u00020\u0004*\u00020\u00042\r\u0010°\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040\"¨\u0006·\u0001" }, d2 = { "Lkotlin/ranges/k;", "", "z0", "Lkotlin/ranges/n;", "", "B0", "Lkotlin/ranges/c;", "", "x0", "Lkotlin/random/f;", "random", "A0", "C0", "y0", "F0", "(Lkotlin/ranges/k;)Ljava/lang/Integer;", "H0", "(Lkotlin/ranges/n;)Ljava/lang/Long;", "D0", "(Lkotlin/ranges/c;)Ljava/lang/Character;", "G0", "(Lkotlin/ranges/k;Lkotlin/random/f;)Ljava/lang/Integer;", "I0", "(Lkotlin/ranges/n;Lkotlin/random/f;)Ljava/lang/Long;", "E0", "(Lkotlin/ranges/c;Lkotlin/random/f;)Ljava/lang/Character;", "element", "", "K", "(Lkotlin/ranges/k;Ljava/lang/Integer;)Z", "L", "(Lkotlin/ranges/n;Ljava/lang/Long;)Z", "J", "(Lkotlin/ranges/c;Ljava/lang/Character;)Z", "Lkotlin/ranges/g;", "", "value", "n0", "(Lkotlin/ranges/g;B)Z", "s0", "", "M0", "", "M", "", "i0", "o0", "(Lkotlin/ranges/g;D)Z", "t0", "f", "N0", "j0", "p0", "(Lkotlin/ranges/g;F)Z", "u0", "g", "O0", "N", "v0", "(Lkotlin/ranges/g;I)Z", "h", "P0", "O", "k0", "q0", "(Lkotlin/ranges/g;J)Z", "i", "Q0", "P", "l0", "r0", "(Lkotlin/ranges/g;S)Z", "w0", "j", "Q", "m0", "to", "Lkotlin/ranges/i;", "V", "Lkotlin/ranges/l;", "d0", "S", "Y", "Lkotlin/ranges/a;", "R", "W", "e0", "T", "Z", "c0", "f0", "b0", "h0", "X", "g0", "U", "a0", "K0", "L0", "J0", "step", "S0", "T0", "R0", "W0", "(I)Ljava/lang/Byte;", "X0", "(J)Ljava/lang/Byte;", "Y0", "(S)Ljava/lang/Byte;", "U0", "(D)Ljava/lang/Byte;", "V0", "(F)Ljava/lang/Byte;", "b1", "(J)Ljava/lang/Integer;", "Z0", "(D)Ljava/lang/Integer;", "a1", "(F)Ljava/lang/Integer;", "c1", "(D)Ljava/lang/Long;", "d1", "(F)Ljava/lang/Long;", "g1", "(I)Ljava/lang/Short;", "h1", "(J)Ljava/lang/Short;", "e1", "(D)Ljava/lang/Short;", "f1", "(F)Ljava/lang/Short;", "m1", "u1", "j1", "p1", "i1", "n1", "v1", "k1", "q1", "t1", "w1", "s1", "y1", "o1", "x1", "l1", "r1", "", "minimumValue", "p", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "k", "q", "n", "o", "m", "l", "maximumValue", "w", "r", "x", "u", "v", "t", "s", "F", "(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "y", "I", "B", "D", "A", "z", "Lkotlin/ranges/f;", "range", "G", "(Ljava/lang/Comparable;Lkotlin/ranges/f;)Ljava/lang/Comparable;", "H", "(Ljava/lang/Comparable;Lkotlin/ranges/g;)Ljava/lang/Comparable;", "C", "E", "kotlin-stdlib" }, k = 5, mv = { 1, 5, 1 }, xs = "kotlin/ranges/RangesKt")
class q extends p
{
    public q() {
    }
    
    public static final float A(final float n, final float f, final float f2) {
        if (f > f2) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot coerce value to an empty range: maximum ");
            sb.append(f2);
            sb.append(" is less than minimum ");
            sb.append(f);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        }
        if (n < f) {
            return f;
        }
        if (n > f2) {
            return f2;
        }
        return n;
    }
    
    @e1(version = "1.3")
    public static final int A0(@e final k k, @e final f f) {
        k0.p(k, "$this$random");
        k0.p(f, "random");
        try {
            return g.h(f, k);
        }
        catch (IllegalArgumentException ex) {
            throw new NoSuchElementException(ex.getMessage());
        }
    }
    
    public static int B(final int n, final int i, final int j) {
        if (i > j) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot coerce value to an empty range: maximum ");
            sb.append(j);
            sb.append(" is less than minimum ");
            sb.append(i);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        }
        if (n < i) {
            return i;
        }
        if (n > j) {
            return j;
        }
        return n;
    }
    
    @e1(version = "1.3")
    @kotlin.internal.f
    private static final long B0(final n n) {
        return C0(n, f.H);
    }
    
    public static final int C(final int p0, @e final kotlin.ranges.g<Integer> p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "range"
        //     4: invokestatic    kotlin/jvm/internal/k0.p:(Ljava/lang/Object;Ljava/lang/String;)V
        //     7: aload_1        
        //     8: instanceof      Lkotlin/ranges/f;
        //    11: ifeq            32
        //    14: iload_0        
        //    15: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    18: aload_1        
        //    19: checkcast       Lkotlin/ranges/f;
        //    22: invokestatic    kotlin/ranges/q.G:(Ljava/lang/Comparable;Lkotlin/ranges/f;)Ljava/lang/Comparable;
        //    25: checkcast       Ljava/lang/Number;
        //    28: invokevirtual   java/lang/Number.intValue:()I
        //    31: ireturn        
        //    32: aload_1        
        //    33: invokeinterface kotlin/ranges/g.isEmpty:()Z
        //    38: ifne            105
        //    41: iload_0        
        //    42: aload_1        
        //    43: invokeinterface kotlin/ranges/g.b:()Ljava/lang/Comparable;
        //    48: checkcast       Ljava/lang/Number;
        //    51: invokevirtual   java/lang/Number.intValue:()I
        //    54: if_icmpge       75
        //    57: aload_1        
        //    58: invokeinterface kotlin/ranges/g.b:()Ljava/lang/Comparable;
        //    63: astore_1       
        //    64: aload_1        
        //    65: checkcast       Ljava/lang/Number;
        //    68: invokevirtual   java/lang/Number.intValue:()I
        //    71: istore_2       
        //    72: goto            103
        //    75: iload_0        
        //    76: istore_2       
        //    77: iload_0        
        //    78: aload_1        
        //    79: invokeinterface kotlin/ranges/g.i:()Ljava/lang/Comparable;
        //    84: checkcast       Ljava/lang/Number;
        //    87: invokevirtual   java/lang/Number.intValue:()I
        //    90: if_icmple       103
        //    93: aload_1        
        //    94: invokeinterface kotlin/ranges/g.i:()Ljava/lang/Comparable;
        //    99: astore_1       
        //   100: goto            64
        //   103: iload_2        
        //   104: ireturn        
        //   105: new             Ljava/lang/StringBuilder;
        //   108: dup            
        //   109: invokespecial   java/lang/StringBuilder.<init>:()V
        //   112: astore_3       
        //   113: aload_3        
        //   114: ldc_w           "Cannot coerce value to an empty range: "
        //   117: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   120: pop            
        //   121: aload_3        
        //   122: aload_1        
        //   123: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   126: pop            
        //   127: aload_3        
        //   128: bipush          46
        //   130: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   133: pop            
        //   134: new             Ljava/lang/IllegalArgumentException;
        //   137: dup            
        //   138: aload_3        
        //   139: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   142: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   145: athrow         
        //    Signature:
        //  (ILkotlin/ranges/g<Ljava/lang/Integer;>;)I
        // 
        // The error that occurred was:
        // 
        // java.lang.StackOverflowError
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1412)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1399)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameWildcard(MetadataHelper.java:1454)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$200(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1987)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1947)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsType(MetadataHelper.java:1395)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1492)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1501)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$900(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$LooseSameTypeVisitor.containsTypes(MetadataHelper.java:2525)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1412)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1399)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameWildcard(MetadataHelper.java:1454)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$200(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1987)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1947)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsType(MetadataHelper.java:1395)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1492)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1501)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$900(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$LooseSameTypeVisitor.containsTypes(MetadataHelper.java:2525)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1412)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1399)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.visitWildcard(MetadataHelper.java:2600)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.visitWildcard(MetadataHelper.java:2529)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1411)
        //     at com.strobel.assembler.metadata.MetadataHelper.areSameTypes(MetadataHelper.java:1429)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.containsTypes(MetadataHelper.java:2584)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1411)
        //     at com.strobel.assembler.metadata.TypeReference.equals(TypeReference.java:118)
        //     at com.strobel.core.Comparer.equals(Comparer.java:31)
        //     at com.strobel.core.Pair.equals(Pair.java:54)
        //     at java.base/java.util.HashMap.putVal(HashMap.java:630)
        //     at java.base/java.util.HashMap.put(HashMap.java:607)
        //     at java.base/java.util.HashSet.add(HashSet.java:220)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeRecursive(MetadataHelper.java:1529)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$100(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitClassType(MetadataHelper.java:1863)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1882)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubTypeNoCapture(MetadataHelper.java:1268)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitGenericParameter(MetadataHelper.java:1874)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitGenericParameter(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.GenericParameter.accept(GenericParameter.java:85)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubTypeNoCapture(MetadataHelper.java:1268)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1989)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1947)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsType(MetadataHelper.java:1395)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1492)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1501)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$900(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$LooseSameTypeVisitor.containsTypes(MetadataHelper.java:2525)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1412)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1399)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.visitWildcard(MetadataHelper.java:2600)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.visitWildcard(MetadataHelper.java:2529)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1411)
        //     at com.strobel.assembler.metadata.MetadataHelper.areSameTypes(MetadataHelper.java:1429)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.containsTypes(MetadataHelper.java:2584)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1411)
        //     at com.strobel.assembler.metadata.TypeReference.equals(TypeReference.java:118)
        //     at com.strobel.core.Comparer.equals(Comparer.java:31)
        //     at com.strobel.core.Pair.equals(Pair.java:54)
        //     at java.base/java.util.HashMap.putVal(HashMap.java:630)
        //     at java.base/java.util.HashMap.put(HashMap.java:607)
        //     at java.base/java.util.HashSet.add(HashSet.java:220)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeRecursive(MetadataHelper.java:1529)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$100(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitClassType(MetadataHelper.java:1863)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1882)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubTypeNoCapture(MetadataHelper.java:1268)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitGenericParameter(MetadataHelper.java:1874)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitGenericParameter(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.GenericParameter.accept(GenericParameter.java:85)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubTypeNoCapture(MetadataHelper.java:1268)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1989)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1947)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsType(MetadataHelper.java:1395)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1492)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1501)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$900(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$LooseSameTypeVisitor.containsTypes(MetadataHelper.java:2525)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1412)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1399)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameWildcard(MetadataHelper.java:1454)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$200(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1987)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1947)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsType(MetadataHelper.java:1395)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1492)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1501)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$900(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$LooseSameTypeVisitor.containsTypes(MetadataHelper.java:2525)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1412)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1399)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameWildcard(MetadataHelper.java:1454)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$200(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1987)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1947)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsType(MetadataHelper.java:1395)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1492)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1501)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$900(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$LooseSameTypeVisitor.containsTypes(MetadataHelper.java:2525)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1412)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1399)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.visitWildcard(MetadataHelper.java:2600)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.visitWildcard(MetadataHelper.java:2529)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1411)
        //     at com.strobel.assembler.metadata.MetadataHelper.areSameTypes(MetadataHelper.java:1429)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.containsTypes(MetadataHelper.java:2584)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1411)
        //     at com.strobel.assembler.metadata.TypeReference.equals(TypeReference.java:118)
        //     at com.strobel.core.Comparer.equals(Comparer.java:31)
        //     at com.strobel.core.Pair.equals(Pair.java:54)
        //     at java.base/java.util.HashMap.putVal(HashMap.java:630)
        //     at java.base/java.util.HashMap.put(HashMap.java:607)
        //     at java.base/java.util.HashSet.add(HashSet.java:220)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeRecursive(MetadataHelper.java:1529)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$100(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitClassType(MetadataHelper.java:1863)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1882)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubTypeNoCapture(MetadataHelper.java:1268)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitGenericParameter(MetadataHelper.java:1874)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitGenericParameter(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.GenericParameter.accept(GenericParameter.java:85)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubTypeNoCapture(MetadataHelper.java:1268)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1989)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1947)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsType(MetadataHelper.java:1395)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1492)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1501)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$900(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$LooseSameTypeVisitor.containsTypes(MetadataHelper.java:2525)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1412)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1399)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.visitWildcard(MetadataHelper.java:2600)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.visitWildcard(MetadataHelper.java:2529)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1411)
        //     at com.strobel.assembler.metadata.MetadataHelper.areSameTypes(MetadataHelper.java:1429)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.containsTypes(MetadataHelper.java:2584)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1411)
        //     at com.strobel.assembler.metadata.TypeReference.equals(TypeReference.java:118)
        //     at com.strobel.core.Comparer.equals(Comparer.java:31)
        //     at com.strobel.core.Pair.equals(Pair.java:54)
        //     at java.base/java.util.HashMap.putVal(HashMap.java:630)
        //     at java.base/java.util.HashMap.put(HashMap.java:607)
        //     at java.base/java.util.HashSet.add(HashSet.java:220)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeRecursive(MetadataHelper.java:1529)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$100(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitClassType(MetadataHelper.java:1863)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1882)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubTypeNoCapture(MetadataHelper.java:1268)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitGenericParameter(MetadataHelper.java:1874)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitGenericParameter(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.GenericParameter.accept(GenericParameter.java:85)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubTypeNoCapture(MetadataHelper.java:1268)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1989)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1947)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsType(MetadataHelper.java:1395)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1492)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1501)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$900(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$LooseSameTypeVisitor.containsTypes(MetadataHelper.java:2525)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1412)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1399)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameWildcard(MetadataHelper.java:1454)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$200(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1987)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1947)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsType(MetadataHelper.java:1395)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1492)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1501)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$900(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$LooseSameTypeVisitor.containsTypes(MetadataHelper.java:2525)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1412)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1399)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameWildcard(MetadataHelper.java:1454)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$200(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1987)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1947)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsType(MetadataHelper.java:1395)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1492)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1501)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$900(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$LooseSameTypeVisitor.containsTypes(MetadataHelper.java:2525)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1412)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1399)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.visitWildcard(MetadataHelper.java:2600)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.visitWildcard(MetadataHelper.java:2529)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1411)
        //     at com.strobel.assembler.metadata.MetadataHelper.areSameTypes(MetadataHelper.java:1429)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.containsTypes(MetadataHelper.java:2584)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1411)
        //     at com.strobel.assembler.metadata.TypeReference.equals(TypeReference.java:118)
        //     at com.strobel.core.Comparer.equals(Comparer.java:31)
        //     at com.strobel.core.Pair.equals(Pair.java:54)
        //     at java.base/java.util.HashMap.putVal(HashMap.java:630)
        //     at java.base/java.util.HashMap.put(HashMap.java:607)
        //     at java.base/java.util.HashSet.add(HashSet.java:220)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeRecursive(MetadataHelper.java:1529)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$100(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitClassType(MetadataHelper.java:1863)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1882)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubTypeNoCapture(MetadataHelper.java:1268)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitGenericParameter(MetadataHelper.java:1874)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitGenericParameter(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.GenericParameter.accept(GenericParameter.java:85)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubTypeNoCapture(MetadataHelper.java:1268)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1989)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1947)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsType(MetadataHelper.java:1395)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1492)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1501)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$900(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$LooseSameTypeVisitor.containsTypes(MetadataHelper.java:2525)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1412)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1399)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.visitWildcard(MetadataHelper.java:2600)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.visitWildcard(MetadataHelper.java:2529)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1411)
        //     at com.strobel.assembler.metadata.MetadataHelper.areSameTypes(MetadataHelper.java:1429)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.containsTypes(MetadataHelper.java:2584)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1411)
        //     at com.strobel.assembler.metadata.TypeReference.equals(TypeReference.java:118)
        //     at com.strobel.core.Comparer.equals(Comparer.java:31)
        //     at com.strobel.core.Pair.equals(Pair.java:54)
        //     at java.base/java.util.HashMap.putVal(HashMap.java:630)
        //     at java.base/java.util.HashMap.put(HashMap.java:607)
        //     at java.base/java.util.HashSet.add(HashSet.java:220)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeRecursive(MetadataHelper.java:1529)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$100(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitClassType(MetadataHelper.java:1863)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1882)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubTypeNoCapture(MetadataHelper.java:1268)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitGenericParameter(MetadataHelper.java:1874)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitGenericParameter(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.GenericParameter.accept(GenericParameter.java:85)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubTypeNoCapture(MetadataHelper.java:1268)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1989)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1947)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsType(MetadataHelper.java:1395)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1492)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1501)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$900(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$LooseSameTypeVisitor.containsTypes(MetadataHelper.java:2525)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1412)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1399)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameWildcard(MetadataHelper.java:1454)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$200(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1987)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1947)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsType(MetadataHelper.java:1395)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1492)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1501)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$900(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$LooseSameTypeVisitor.containsTypes(MetadataHelper.java:2525)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1412)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1399)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameWildcard(MetadataHelper.java:1454)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$200(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1987)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1947)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsType(MetadataHelper.java:1395)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1492)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1501)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$900(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$LooseSameTypeVisitor.containsTypes(MetadataHelper.java:2525)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1412)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1399)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.visitWildcard(MetadataHelper.java:2600)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.visitWildcard(MetadataHelper.java:2529)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1411)
        //     at com.strobel.assembler.metadata.MetadataHelper.areSameTypes(MetadataHelper.java:1429)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.containsTypes(MetadataHelper.java:2584)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1411)
        //     at com.strobel.assembler.metadata.TypeReference.equals(TypeReference.java:118)
        //     at com.strobel.core.Comparer.equals(Comparer.java:31)
        //     at com.strobel.core.Pair.equals(Pair.java:54)
        //     at java.base/java.util.HashMap.putVal(HashMap.java:630)
        //     at java.base/java.util.HashMap.put(HashMap.java:607)
        //     at java.base/java.util.HashSet.add(HashSet.java:220)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeRecursive(MetadataHelper.java:1529)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$100(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitClassType(MetadataHelper.java:1863)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1882)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubTypeNoCapture(MetadataHelper.java:1268)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitGenericParameter(MetadataHelper.java:1874)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitGenericParameter(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.GenericParameter.accept(GenericParameter.java:85)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubTypeNoCapture(MetadataHelper.java:1268)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1989)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1947)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsType(MetadataHelper.java:1395)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1492)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1501)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$900(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$LooseSameTypeVisitor.containsTypes(MetadataHelper.java:2525)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1412)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1399)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.visitWildcard(MetadataHelper.java:2600)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.visitWildcard(MetadataHelper.java:2529)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1411)
        //     at com.strobel.assembler.metadata.MetadataHelper.areSameTypes(MetadataHelper.java:1429)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.containsTypes(MetadataHelper.java:2584)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1411)
        //     at com.strobel.assembler.metadata.TypeReference.equals(TypeReference.java:118)
        //     at com.strobel.core.Comparer.equals(Comparer.java:31)
        //     at com.strobel.core.Pair.equals(Pair.java:54)
        //     at java.base/java.util.HashMap.putVal(HashMap.java:630)
        //     at java.base/java.util.HashMap.put(HashMap.java:607)
        //     at java.base/java.util.HashSet.add(HashSet.java:220)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeRecursive(MetadataHelper.java:1529)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$100(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitClassType(MetadataHelper.java:1863)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1882)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubTypeNoCapture(MetadataHelper.java:1268)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitGenericParameter(MetadataHelper.java:1874)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitGenericParameter(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.GenericParameter.accept(GenericParameter.java:85)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubTypeNoCapture(MetadataHelper.java:1268)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1989)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1947)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsType(MetadataHelper.java:1395)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1492)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1501)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$900(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$LooseSameTypeVisitor.containsTypes(MetadataHelper.java:2525)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1412)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1399)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameWildcard(MetadataHelper.java:1454)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$200(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1987)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1947)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsType(MetadataHelper.java:1395)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1492)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1501)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$900(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$LooseSameTypeVisitor.containsTypes(MetadataHelper.java:2525)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1412)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1399)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameWildcard(MetadataHelper.java:1454)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$200(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1987)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1947)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsType(MetadataHelper.java:1395)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1492)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1501)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$900(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$LooseSameTypeVisitor.containsTypes(MetadataHelper.java:2525)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1412)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1399)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.visitWildcard(MetadataHelper.java:2600)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.visitWildcard(MetadataHelper.java:2529)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1411)
        //     at com.strobel.assembler.metadata.MetadataHelper.areSameTypes(MetadataHelper.java:1429)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.containsTypes(MetadataHelper.java:2584)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1411)
        //     at com.strobel.assembler.metadata.TypeReference.equals(TypeReference.java:118)
        //     at com.strobel.core.Comparer.equals(Comparer.java:31)
        //     at com.strobel.core.Pair.equals(Pair.java:54)
        //     at java.base/java.util.HashMap.putVal(HashMap.java:630)
        //     at java.base/java.util.HashMap.put(HashMap.java:607)
        //     at java.base/java.util.HashSet.add(HashSet.java:220)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeRecursive(MetadataHelper.java:1529)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$100(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitClassType(MetadataHelper.java:1863)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1882)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubTypeNoCapture(MetadataHelper.java:1268)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitGenericParameter(MetadataHelper.java:1874)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitGenericParameter(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.GenericParameter.accept(GenericParameter.java:85)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubTypeNoCapture(MetadataHelper.java:1268)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1989)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1947)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsType(MetadataHelper.java:1395)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1492)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1501)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$900(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$LooseSameTypeVisitor.containsTypes(MetadataHelper.java:2525)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1412)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1399)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.visitWildcard(MetadataHelper.java:2600)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.visitWildcard(MetadataHelper.java:2529)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1411)
        //     at com.strobel.assembler.metadata.MetadataHelper.areSameTypes(MetadataHelper.java:1429)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.containsTypes(MetadataHelper.java:2584)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1411)
        //     at com.strobel.assembler.metadata.TypeReference.equals(TypeReference.java:118)
        //     at com.strobel.core.Comparer.equals(Comparer.java:31)
        //     at com.strobel.core.Pair.equals(Pair.java:54)
        //     at java.base/java.util.HashMap.putVal(HashMap.java:630)
        //     at java.base/java.util.HashMap.put(HashMap.java:607)
        //     at java.base/java.util.HashSet.add(HashSet.java:220)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeRecursive(MetadataHelper.java:1529)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$100(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitClassType(MetadataHelper.java:1863)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1882)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubTypeNoCapture(MetadataHelper.java:1268)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitGenericParameter(MetadataHelper.java:1874)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitGenericParameter(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.GenericParameter.accept(GenericParameter.java:85)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubTypeNoCapture(MetadataHelper.java:1268)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1989)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1947)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsType(MetadataHelper.java:1395)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1492)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1501)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$900(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$LooseSameTypeVisitor.containsTypes(MetadataHelper.java:2525)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1412)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1399)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameWildcard(MetadataHelper.java:1454)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$200(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1987)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1947)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsType(MetadataHelper.java:1395)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1492)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1501)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$900(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$LooseSameTypeVisitor.containsTypes(MetadataHelper.java:2525)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1412)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1399)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameWildcard(MetadataHelper.java:1454)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$200(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1987)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1947)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsType(MetadataHelper.java:1395)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1492)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1501)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$900(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$LooseSameTypeVisitor.containsTypes(MetadataHelper.java:2525)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1412)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1399)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.visitWildcard(MetadataHelper.java:2600)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.visitWildcard(MetadataHelper.java:2529)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1411)
        //     at com.strobel.assembler.metadata.MetadataHelper.areSameTypes(MetadataHelper.java:1429)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.containsTypes(MetadataHelper.java:2584)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1411)
        //     at com.strobel.assembler.metadata.TypeReference.equals(TypeReference.java:118)
        //     at com.strobel.core.Comparer.equals(Comparer.java:31)
        //     at com.strobel.core.Pair.equals(Pair.java:54)
        //     at java.base/java.util.HashMap.putVal(HashMap.java:630)
        //     at java.base/java.util.HashMap.put(HashMap.java:607)
        //     at java.base/java.util.HashSet.add(HashSet.java:220)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeRecursive(MetadataHelper.java:1529)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$100(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitClassType(MetadataHelper.java:1863)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1882)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubTypeNoCapture(MetadataHelper.java:1268)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitGenericParameter(MetadataHelper.java:1874)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitGenericParameter(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.GenericParameter.accept(GenericParameter.java:85)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubTypeNoCapture(MetadataHelper.java:1268)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1989)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1947)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsType(MetadataHelper.java:1395)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1492)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1501)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$900(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$LooseSameTypeVisitor.containsTypes(MetadataHelper.java:2525)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1412)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1399)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.visitWildcard(MetadataHelper.java:2600)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.visitWildcard(MetadataHelper.java:2529)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1411)
        //     at com.strobel.assembler.metadata.MetadataHelper.areSameTypes(MetadataHelper.java:1429)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.containsTypes(MetadataHelper.java:2584)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1411)
        //     at com.strobel.assembler.metadata.TypeReference.equals(TypeReference.java:118)
        //     at com.strobel.core.Comparer.equals(Comparer.java:31)
        //     at com.strobel.core.Pair.equals(Pair.java:54)
        //     at java.base/java.util.HashMap.putVal(HashMap.java:630)
        //     at java.base/java.util.HashMap.put(HashMap.java:607)
        //     at java.base/java.util.HashSet.add(HashSet.java:220)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeRecursive(MetadataHelper.java:1529)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$100(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitClassType(MetadataHelper.java:1863)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1882)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubTypeNoCapture(MetadataHelper.java:1268)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitGenericParameter(MetadataHelper.java:1874)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitGenericParameter(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.GenericParameter.accept(GenericParameter.java:85)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubTypeNoCapture(MetadataHelper.java:1268)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1989)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1947)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsType(MetadataHelper.java:1395)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1492)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1501)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$900(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$LooseSameTypeVisitor.containsTypes(MetadataHelper.java:2525)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1412)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1399)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameWildcard(MetadataHelper.java:1454)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$200(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1987)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1947)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsType(MetadataHelper.java:1395)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1492)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1501)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$900(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$LooseSameTypeVisitor.containsTypes(MetadataHelper.java:2525)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1412)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1399)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameWildcard(MetadataHelper.java:1454)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$200(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1987)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1947)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsType(MetadataHelper.java:1395)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1492)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1501)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$900(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$LooseSameTypeVisitor.containsTypes(MetadataHelper.java:2525)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1412)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1399)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.visitWildcard(MetadataHelper.java:2600)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.visitWildcard(MetadataHelper.java:2529)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1411)
        //     at com.strobel.assembler.metadata.MetadataHelper.areSameTypes(MetadataHelper.java:1429)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.containsTypes(MetadataHelper.java:2584)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1411)
        //     at com.strobel.assembler.metadata.TypeReference.equals(TypeReference.java:118)
        //     at com.strobel.core.Comparer.equals(Comparer.java:31)
        //     at com.strobel.core.Pair.equals(Pair.java:54)
        //     at java.base/java.util.HashMap.putVal(HashMap.java:630)
        //     at java.base/java.util.HashMap.put(HashMap.java:607)
        //     at java.base/java.util.HashSet.add(HashSet.java:220)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeRecursive(MetadataHelper.java:1529)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$100(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitClassType(MetadataHelper.java:1863)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1882)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubTypeNoCapture(MetadataHelper.java:1268)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitGenericParameter(MetadataHelper.java:1874)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitGenericParameter(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.GenericParameter.accept(GenericParameter.java:85)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubTypeNoCapture(MetadataHelper.java:1268)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1989)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1947)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsType(MetadataHelper.java:1395)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1492)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1501)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$900(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$LooseSameTypeVisitor.containsTypes(MetadataHelper.java:2525)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1412)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1399)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.visitWildcard(MetadataHelper.java:2600)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.visitWildcard(MetadataHelper.java:2529)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1411)
        //     at com.strobel.assembler.metadata.MetadataHelper.areSameTypes(MetadataHelper.java:1429)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.containsTypes(MetadataHelper.java:2584)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1411)
        //     at com.strobel.assembler.metadata.TypeReference.equals(TypeReference.java:118)
        //     at com.strobel.core.Comparer.equals(Comparer.java:31)
        //     at com.strobel.core.Pair.equals(Pair.java:54)
        //     at java.base/java.util.HashMap.putVal(HashMap.java:630)
        //     at java.base/java.util.HashMap.put(HashMap.java:607)
        //     at java.base/java.util.HashSet.add(HashSet.java:220)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeRecursive(MetadataHelper.java:1529)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$100(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitClassType(MetadataHelper.java:1863)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1882)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubTypeNoCapture(MetadataHelper.java:1268)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitGenericParameter(MetadataHelper.java:1874)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitGenericParameter(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.GenericParameter.accept(GenericParameter.java:85)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubTypeNoCapture(MetadataHelper.java:1268)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1989)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1947)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsType(MetadataHelper.java:1395)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1492)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1501)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$900(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$LooseSameTypeVisitor.containsTypes(MetadataHelper.java:2525)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1412)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1399)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameWildcard(MetadataHelper.java:1454)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$200(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1987)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1947)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsType(MetadataHelper.java:1395)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1492)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1501)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$900(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$LooseSameTypeVisitor.containsTypes(MetadataHelper.java:2525)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1412)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1399)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameWildcard(MetadataHelper.java:1454)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$200(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1987)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1947)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsType(MetadataHelper.java:1395)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1492)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1501)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$900(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$LooseSameTypeVisitor.containsTypes(MetadataHelper.java:2525)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1412)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1399)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.visitWildcard(MetadataHelper.java:2600)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.visitWildcard(MetadataHelper.java:2529)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1411)
        //     at com.strobel.assembler.metadata.MetadataHelper.areSameTypes(MetadataHelper.java:1429)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.containsTypes(MetadataHelper.java:2584)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1411)
        //     at com.strobel.assembler.metadata.TypeReference.equals(TypeReference.java:118)
        //     at com.strobel.core.Comparer.equals(Comparer.java:31)
        //     at com.strobel.core.Pair.equals(Pair.java:54)
        //     at java.base/java.util.HashMap.putVal(HashMap.java:630)
        //     at java.base/java.util.HashMap.put(HashMap.java:607)
        //     at java.base/java.util.HashSet.add(HashSet.java:220)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeRecursive(MetadataHelper.java:1529)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$100(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitClassType(MetadataHelper.java:1863)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1882)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubTypeNoCapture(MetadataHelper.java:1268)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitGenericParameter(MetadataHelper.java:1874)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitGenericParameter(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.GenericParameter.accept(GenericParameter.java:85)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @e1(version = "1.3")
    public static final long C0(@e final n n, @e final f f) {
        k0.p(n, "$this$random");
        k0.p(f, "random");
        try {
            return g.i(f, n);
        }
        catch (IllegalArgumentException ex) {
            throw new NoSuchElementException(ex.getMessage());
        }
    }
    
    public static long D(final long n, final long lng, final long lng2) {
        if (lng > lng2) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot coerce value to an empty range: maximum ");
            sb.append(lng2);
            sb.append(" is less than minimum ");
            sb.append(lng);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        }
        if (n < lng) {
            return lng;
        }
        if (n > lng2) {
            return lng2;
        }
        return n;
    }
    
    @e1(version = "1.4")
    @kotlin.internal.f
    @o2(markerClass = { kotlin.q.class })
    private static final Character D0(final c c) {
        return E0(c, f.H);
    }
    
    public static long E(final long p0, @e final kotlin.ranges.g<Long> p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "range"
        //     4: invokestatic    kotlin/jvm/internal/k0.p:(Ljava/lang/Object;Ljava/lang/String;)V
        //     7: aload_2        
        //     8: instanceof      Lkotlin/ranges/f;
        //    11: ifeq            32
        //    14: lload_0        
        //    15: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //    18: aload_2        
        //    19: checkcast       Lkotlin/ranges/f;
        //    22: invokestatic    kotlin/ranges/q.G:(Ljava/lang/Comparable;Lkotlin/ranges/f;)Ljava/lang/Comparable;
        //    25: checkcast       Ljava/lang/Number;
        //    28: invokevirtual   java/lang/Number.longValue:()J
        //    31: lreturn        
        //    32: aload_2        
        //    33: invokeinterface kotlin/ranges/g.isEmpty:()Z
        //    38: ifne            107
        //    41: lload_0        
        //    42: aload_2        
        //    43: invokeinterface kotlin/ranges/g.b:()Ljava/lang/Comparable;
        //    48: checkcast       Ljava/lang/Number;
        //    51: invokevirtual   java/lang/Number.longValue:()J
        //    54: lcmp           
        //    55: ifge            76
        //    58: aload_2        
        //    59: invokeinterface kotlin/ranges/g.b:()Ljava/lang/Comparable;
        //    64: astore_2       
        //    65: aload_2        
        //    66: checkcast       Ljava/lang/Number;
        //    69: invokevirtual   java/lang/Number.longValue:()J
        //    72: lstore_3       
        //    73: goto            105
        //    76: lload_0        
        //    77: lstore_3       
        //    78: lload_0        
        //    79: aload_2        
        //    80: invokeinterface kotlin/ranges/g.i:()Ljava/lang/Comparable;
        //    85: checkcast       Ljava/lang/Number;
        //    88: invokevirtual   java/lang/Number.longValue:()J
        //    91: lcmp           
        //    92: ifle            105
        //    95: aload_2        
        //    96: invokeinterface kotlin/ranges/g.i:()Ljava/lang/Comparable;
        //   101: astore_2       
        //   102: goto            65
        //   105: lload_3        
        //   106: lreturn        
        //   107: new             Ljava/lang/StringBuilder;
        //   110: dup            
        //   111: invokespecial   java/lang/StringBuilder.<init>:()V
        //   114: astore          5
        //   116: aload           5
        //   118: ldc_w           "Cannot coerce value to an empty range: "
        //   121: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   124: pop            
        //   125: aload           5
        //   127: aload_2        
        //   128: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   131: pop            
        //   132: aload           5
        //   134: bipush          46
        //   136: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   139: pop            
        //   140: new             Ljava/lang/IllegalArgumentException;
        //   143: dup            
        //   144: aload           5
        //   146: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   149: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   152: athrow         
        //    Signature:
        //  (JLkotlin/ranges/g<Ljava/lang/Long;>;)J
        // 
        // The error that occurred was:
        // 
        // java.lang.StackOverflowError
        //     at com.strobel.assembler.metadata.TypeReference.hasGenericParameters(TypeReference.java:244)
        //     at com.strobel.assembler.metadata.TypeReference.isGenericType(TypeReference.java:263)
        //     at com.strobel.assembler.metadata.MetadataHelper.isRawType(MetadataHelper.java:1577)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2361)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1412)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1399)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.visitWildcard(MetadataHelper.java:2600)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.visitWildcard(MetadataHelper.java:2529)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1411)
        //     at com.strobel.assembler.metadata.MetadataHelper.areSameTypes(MetadataHelper.java:1429)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.containsTypes(MetadataHelper.java:2584)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1411)
        //     at com.strobel.assembler.metadata.TypeReference.equals(TypeReference.java:118)
        //     at com.strobel.core.Comparer.equals(Comparer.java:31)
        //     at com.strobel.core.Pair.equals(Pair.java:54)
        //     at java.base/java.util.HashMap.putVal(HashMap.java:630)
        //     at java.base/java.util.HashMap.put(HashMap.java:607)
        //     at java.base/java.util.HashSet.add(HashSet.java:220)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeRecursive(MetadataHelper.java:1529)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$100(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitClassType(MetadataHelper.java:1863)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1882)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubTypeNoCapture(MetadataHelper.java:1268)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitGenericParameter(MetadataHelper.java:1874)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitGenericParameter(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.GenericParameter.accept(GenericParameter.java:85)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubTypeNoCapture(MetadataHelper.java:1268)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1989)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1947)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsType(MetadataHelper.java:1395)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1492)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1501)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$900(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$LooseSameTypeVisitor.containsTypes(MetadataHelper.java:2525)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1412)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1399)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.visitWildcard(MetadataHelper.java:2600)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.visitWildcard(MetadataHelper.java:2529)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1411)
        //     at com.strobel.assembler.metadata.MetadataHelper.areSameTypes(MetadataHelper.java:1429)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.containsTypes(MetadataHelper.java:2584)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1411)
        //     at com.strobel.assembler.metadata.TypeReference.equals(TypeReference.java:118)
        //     at com.strobel.core.Comparer.equals(Comparer.java:31)
        //     at com.strobel.core.Pair.equals(Pair.java:54)
        //     at java.base/java.util.HashMap.putVal(HashMap.java:630)
        //     at java.base/java.util.HashMap.put(HashMap.java:607)
        //     at java.base/java.util.HashSet.add(HashSet.java:220)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeRecursive(MetadataHelper.java:1529)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$100(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitClassType(MetadataHelper.java:1863)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1882)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubTypeNoCapture(MetadataHelper.java:1268)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitGenericParameter(MetadataHelper.java:1874)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitGenericParameter(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.GenericParameter.accept(GenericParameter.java:85)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubTypeNoCapture(MetadataHelper.java:1268)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1989)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1947)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsType(MetadataHelper.java:1395)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1492)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1501)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$900(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$LooseSameTypeVisitor.containsTypes(MetadataHelper.java:2525)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1412)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1399)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameWildcard(MetadataHelper.java:1454)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$200(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1987)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1947)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsType(MetadataHelper.java:1395)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1492)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1501)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$900(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$LooseSameTypeVisitor.containsTypes(MetadataHelper.java:2525)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1412)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1399)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameWildcard(MetadataHelper.java:1454)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$200(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1987)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1947)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsType(MetadataHelper.java:1395)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1492)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1501)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$900(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$LooseSameTypeVisitor.containsTypes(MetadataHelper.java:2525)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1412)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1399)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.visitWildcard(MetadataHelper.java:2600)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.visitWildcard(MetadataHelper.java:2529)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1411)
        //     at com.strobel.assembler.metadata.MetadataHelper.areSameTypes(MetadataHelper.java:1429)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.containsTypes(MetadataHelper.java:2584)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1411)
        //     at com.strobel.assembler.metadata.TypeReference.equals(TypeReference.java:118)
        //     at com.strobel.core.Comparer.equals(Comparer.java:31)
        //     at com.strobel.core.Pair.equals(Pair.java:54)
        //     at java.base/java.util.HashMap.putVal(HashMap.java:630)
        //     at java.base/java.util.HashMap.put(HashMap.java:607)
        //     at java.base/java.util.HashSet.add(HashSet.java:220)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeRecursive(MetadataHelper.java:1529)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$100(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitClassType(MetadataHelper.java:1863)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1882)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubTypeNoCapture(MetadataHelper.java:1268)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitGenericParameter(MetadataHelper.java:1874)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitGenericParameter(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.GenericParameter.accept(GenericParameter.java:85)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubTypeNoCapture(MetadataHelper.java:1268)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1989)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1947)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsType(MetadataHelper.java:1395)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1492)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1501)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$900(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$LooseSameTypeVisitor.containsTypes(MetadataHelper.java:2525)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1412)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1399)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.visitWildcard(MetadataHelper.java:2600)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.visitWildcard(MetadataHelper.java:2529)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1411)
        //     at com.strobel.assembler.metadata.MetadataHelper.areSameTypes(MetadataHelper.java:1429)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.containsTypes(MetadataHelper.java:2584)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1411)
        //     at com.strobel.assembler.metadata.TypeReference.equals(TypeReference.java:118)
        //     at com.strobel.core.Comparer.equals(Comparer.java:31)
        //     at com.strobel.core.Pair.equals(Pair.java:54)
        //     at java.base/java.util.HashMap.putVal(HashMap.java:630)
        //     at java.base/java.util.HashMap.put(HashMap.java:607)
        //     at java.base/java.util.HashSet.add(HashSet.java:220)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeRecursive(MetadataHelper.java:1529)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$100(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitClassType(MetadataHelper.java:1863)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1882)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubTypeNoCapture(MetadataHelper.java:1268)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitGenericParameter(MetadataHelper.java:1874)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitGenericParameter(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.GenericParameter.accept(GenericParameter.java:85)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubTypeNoCapture(MetadataHelper.java:1268)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1989)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1947)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsType(MetadataHelper.java:1395)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1492)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1501)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$900(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$LooseSameTypeVisitor.containsTypes(MetadataHelper.java:2525)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1412)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1399)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameWildcard(MetadataHelper.java:1454)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$200(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1987)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1947)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsType(MetadataHelper.java:1395)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1492)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1501)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$900(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$LooseSameTypeVisitor.containsTypes(MetadataHelper.java:2525)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1412)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1399)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameWildcard(MetadataHelper.java:1454)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$200(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1987)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1947)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsType(MetadataHelper.java:1395)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1492)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1501)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$900(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$LooseSameTypeVisitor.containsTypes(MetadataHelper.java:2525)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1412)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1399)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.visitWildcard(MetadataHelper.java:2600)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.visitWildcard(MetadataHelper.java:2529)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1411)
        //     at com.strobel.assembler.metadata.MetadataHelper.areSameTypes(MetadataHelper.java:1429)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.containsTypes(MetadataHelper.java:2584)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1411)
        //     at com.strobel.assembler.metadata.TypeReference.equals(TypeReference.java:118)
        //     at com.strobel.core.Comparer.equals(Comparer.java:31)
        //     at com.strobel.core.Pair.equals(Pair.java:54)
        //     at java.base/java.util.HashMap.putVal(HashMap.java:630)
        //     at java.base/java.util.HashMap.put(HashMap.java:607)
        //     at java.base/java.util.HashSet.add(HashSet.java:220)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeRecursive(MetadataHelper.java:1529)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$100(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitClassType(MetadataHelper.java:1863)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1882)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubTypeNoCapture(MetadataHelper.java:1268)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitGenericParameter(MetadataHelper.java:1874)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitGenericParameter(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.GenericParameter.accept(GenericParameter.java:85)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubTypeNoCapture(MetadataHelper.java:1268)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1989)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1947)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsType(MetadataHelper.java:1395)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1492)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1501)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$900(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$LooseSameTypeVisitor.containsTypes(MetadataHelper.java:2525)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1412)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1399)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.visitWildcard(MetadataHelper.java:2600)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.visitWildcard(MetadataHelper.java:2529)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1411)
        //     at com.strobel.assembler.metadata.MetadataHelper.areSameTypes(MetadataHelper.java:1429)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.containsTypes(MetadataHelper.java:2584)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1411)
        //     at com.strobel.assembler.metadata.TypeReference.equals(TypeReference.java:118)
        //     at com.strobel.core.Comparer.equals(Comparer.java:31)
        //     at com.strobel.core.Pair.equals(Pair.java:54)
        //     at java.base/java.util.HashMap.putVal(HashMap.java:630)
        //     at java.base/java.util.HashMap.put(HashMap.java:607)
        //     at java.base/java.util.HashSet.add(HashSet.java:220)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeRecursive(MetadataHelper.java:1529)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$100(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitClassType(MetadataHelper.java:1863)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1882)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubTypeNoCapture(MetadataHelper.java:1268)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitGenericParameter(MetadataHelper.java:1874)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitGenericParameter(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.GenericParameter.accept(GenericParameter.java:85)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubTypeNoCapture(MetadataHelper.java:1268)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1989)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1947)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsType(MetadataHelper.java:1395)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1492)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1501)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$900(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$LooseSameTypeVisitor.containsTypes(MetadataHelper.java:2525)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1412)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1399)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameWildcard(MetadataHelper.java:1454)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$200(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1987)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1947)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsType(MetadataHelper.java:1395)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1492)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1501)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$900(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$LooseSameTypeVisitor.containsTypes(MetadataHelper.java:2525)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1412)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1399)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameWildcard(MetadataHelper.java:1454)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$200(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1987)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1947)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsType(MetadataHelper.java:1395)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1492)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1501)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$900(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$LooseSameTypeVisitor.containsTypes(MetadataHelper.java:2525)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1412)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1399)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.visitWildcard(MetadataHelper.java:2600)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.visitWildcard(MetadataHelper.java:2529)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1411)
        //     at com.strobel.assembler.metadata.MetadataHelper.areSameTypes(MetadataHelper.java:1429)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.containsTypes(MetadataHelper.java:2584)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1411)
        //     at com.strobel.assembler.metadata.TypeReference.equals(TypeReference.java:118)
        //     at com.strobel.core.Comparer.equals(Comparer.java:31)
        //     at com.strobel.core.Pair.equals(Pair.java:54)
        //     at java.base/java.util.HashMap.putVal(HashMap.java:630)
        //     at java.base/java.util.HashMap.put(HashMap.java:607)
        //     at java.base/java.util.HashSet.add(HashSet.java:220)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeRecursive(MetadataHelper.java:1529)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$100(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitClassType(MetadataHelper.java:1863)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1882)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubTypeNoCapture(MetadataHelper.java:1268)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitGenericParameter(MetadataHelper.java:1874)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitGenericParameter(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.GenericParameter.accept(GenericParameter.java:85)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubTypeNoCapture(MetadataHelper.java:1268)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1989)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1947)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsType(MetadataHelper.java:1395)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1492)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1501)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$900(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$LooseSameTypeVisitor.containsTypes(MetadataHelper.java:2525)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1412)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1399)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.visitWildcard(MetadataHelper.java:2600)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.visitWildcard(MetadataHelper.java:2529)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1411)
        //     at com.strobel.assembler.metadata.MetadataHelper.areSameTypes(MetadataHelper.java:1429)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.containsTypes(MetadataHelper.java:2584)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1411)
        //     at com.strobel.assembler.metadata.TypeReference.equals(TypeReference.java:118)
        //     at com.strobel.core.Comparer.equals(Comparer.java:31)
        //     at com.strobel.core.Pair.equals(Pair.java:54)
        //     at java.base/java.util.HashMap.putVal(HashMap.java:630)
        //     at java.base/java.util.HashMap.put(HashMap.java:607)
        //     at java.base/java.util.HashSet.add(HashSet.java:220)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeRecursive(MetadataHelper.java:1529)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$100(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitClassType(MetadataHelper.java:1863)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1882)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubTypeNoCapture(MetadataHelper.java:1268)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitGenericParameter(MetadataHelper.java:1874)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitGenericParameter(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.GenericParameter.accept(GenericParameter.java:85)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubTypeNoCapture(MetadataHelper.java:1268)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1989)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1947)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsType(MetadataHelper.java:1395)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1492)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1501)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$900(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$LooseSameTypeVisitor.containsTypes(MetadataHelper.java:2525)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1412)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1399)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameWildcard(MetadataHelper.java:1454)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$200(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1987)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1947)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsType(MetadataHelper.java:1395)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1492)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1501)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$900(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$LooseSameTypeVisitor.containsTypes(MetadataHelper.java:2525)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1412)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1399)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameWildcard(MetadataHelper.java:1454)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$200(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1987)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1947)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsType(MetadataHelper.java:1395)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1492)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1501)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$900(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$LooseSameTypeVisitor.containsTypes(MetadataHelper.java:2525)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1412)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1399)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.visitWildcard(MetadataHelper.java:2600)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.visitWildcard(MetadataHelper.java:2529)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1411)
        //     at com.strobel.assembler.metadata.MetadataHelper.areSameTypes(MetadataHelper.java:1429)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.containsTypes(MetadataHelper.java:2584)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1411)
        //     at com.strobel.assembler.metadata.TypeReference.equals(TypeReference.java:118)
        //     at com.strobel.core.Comparer.equals(Comparer.java:31)
        //     at com.strobel.core.Pair.equals(Pair.java:54)
        //     at java.base/java.util.HashMap.putVal(HashMap.java:630)
        //     at java.base/java.util.HashMap.put(HashMap.java:607)
        //     at java.base/java.util.HashSet.add(HashSet.java:220)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeRecursive(MetadataHelper.java:1529)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$100(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitClassType(MetadataHelper.java:1863)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1882)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubTypeNoCapture(MetadataHelper.java:1268)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitGenericParameter(MetadataHelper.java:1874)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitGenericParameter(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.GenericParameter.accept(GenericParameter.java:85)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubTypeNoCapture(MetadataHelper.java:1268)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1989)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1947)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsType(MetadataHelper.java:1395)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1492)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1501)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$900(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$LooseSameTypeVisitor.containsTypes(MetadataHelper.java:2525)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1412)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1399)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.visitWildcard(MetadataHelper.java:2600)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.visitWildcard(MetadataHelper.java:2529)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1411)
        //     at com.strobel.assembler.metadata.MetadataHelper.areSameTypes(MetadataHelper.java:1429)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.containsTypes(MetadataHelper.java:2584)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1411)
        //     at com.strobel.assembler.metadata.TypeReference.equals(TypeReference.java:118)
        //     at com.strobel.core.Comparer.equals(Comparer.java:31)
        //     at com.strobel.core.Pair.equals(Pair.java:54)
        //     at java.base/java.util.HashMap.putVal(HashMap.java:630)
        //     at java.base/java.util.HashMap.put(HashMap.java:607)
        //     at java.base/java.util.HashSet.add(HashSet.java:220)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeRecursive(MetadataHelper.java:1529)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$100(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitClassType(MetadataHelper.java:1863)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1882)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubTypeNoCapture(MetadataHelper.java:1268)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitGenericParameter(MetadataHelper.java:1874)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitGenericParameter(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.GenericParameter.accept(GenericParameter.java:85)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubTypeNoCapture(MetadataHelper.java:1268)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1989)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1947)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsType(MetadataHelper.java:1395)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1492)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1501)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$900(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$LooseSameTypeVisitor.containsTypes(MetadataHelper.java:2525)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1412)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1399)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameWildcard(MetadataHelper.java:1454)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$200(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1987)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1947)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsType(MetadataHelper.java:1395)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1492)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1501)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$900(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$LooseSameTypeVisitor.containsTypes(MetadataHelper.java:2525)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1412)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1399)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameWildcard(MetadataHelper.java:1454)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$200(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1987)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1947)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsType(MetadataHelper.java:1395)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1492)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1501)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$900(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$LooseSameTypeVisitor.containsTypes(MetadataHelper.java:2525)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1412)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1399)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.visitWildcard(MetadataHelper.java:2600)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.visitWildcard(MetadataHelper.java:2529)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1411)
        //     at com.strobel.assembler.metadata.MetadataHelper.areSameTypes(MetadataHelper.java:1429)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.containsTypes(MetadataHelper.java:2584)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1411)
        //     at com.strobel.assembler.metadata.TypeReference.equals(TypeReference.java:118)
        //     at com.strobel.core.Comparer.equals(Comparer.java:31)
        //     at com.strobel.core.Pair.equals(Pair.java:54)
        //     at java.base/java.util.HashMap.putVal(HashMap.java:630)
        //     at java.base/java.util.HashMap.put(HashMap.java:607)
        //     at java.base/java.util.HashSet.add(HashSet.java:220)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeRecursive(MetadataHelper.java:1529)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$100(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitClassType(MetadataHelper.java:1863)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1882)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubTypeNoCapture(MetadataHelper.java:1268)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitGenericParameter(MetadataHelper.java:1874)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitGenericParameter(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.GenericParameter.accept(GenericParameter.java:85)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubTypeNoCapture(MetadataHelper.java:1268)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1989)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1947)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsType(MetadataHelper.java:1395)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1492)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1501)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$900(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$LooseSameTypeVisitor.containsTypes(MetadataHelper.java:2525)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1412)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1399)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.visitWildcard(MetadataHelper.java:2600)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.visitWildcard(MetadataHelper.java:2529)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1411)
        //     at com.strobel.assembler.metadata.MetadataHelper.areSameTypes(MetadataHelper.java:1429)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.containsTypes(MetadataHelper.java:2584)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1411)
        //     at com.strobel.assembler.metadata.TypeReference.equals(TypeReference.java:118)
        //     at com.strobel.core.Comparer.equals(Comparer.java:31)
        //     at com.strobel.core.Pair.equals(Pair.java:54)
        //     at java.base/java.util.HashMap.putVal(HashMap.java:630)
        //     at java.base/java.util.HashMap.put(HashMap.java:607)
        //     at java.base/java.util.HashSet.add(HashSet.java:220)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeRecursive(MetadataHelper.java:1529)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$100(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitClassType(MetadataHelper.java:1863)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1882)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubTypeNoCapture(MetadataHelper.java:1268)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitGenericParameter(MetadataHelper.java:1874)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitGenericParameter(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.GenericParameter.accept(GenericParameter.java:85)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubTypeNoCapture(MetadataHelper.java:1268)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1989)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1947)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsType(MetadataHelper.java:1395)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1492)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1501)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$900(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$LooseSameTypeVisitor.containsTypes(MetadataHelper.java:2525)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1412)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1399)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameWildcard(MetadataHelper.java:1454)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$200(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1987)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1947)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsType(MetadataHelper.java:1395)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1492)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1501)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$900(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$LooseSameTypeVisitor.containsTypes(MetadataHelper.java:2525)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1412)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1399)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameWildcard(MetadataHelper.java:1454)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$200(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1987)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1947)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsType(MetadataHelper.java:1395)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1492)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1501)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$900(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$LooseSameTypeVisitor.containsTypes(MetadataHelper.java:2525)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1412)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1399)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.visitWildcard(MetadataHelper.java:2600)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.visitWildcard(MetadataHelper.java:2529)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1411)
        //     at com.strobel.assembler.metadata.MetadataHelper.areSameTypes(MetadataHelper.java:1429)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.containsTypes(MetadataHelper.java:2584)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1411)
        //     at com.strobel.assembler.metadata.TypeReference.equals(TypeReference.java:118)
        //     at com.strobel.core.Comparer.equals(Comparer.java:31)
        //     at com.strobel.core.Pair.equals(Pair.java:54)
        //     at java.base/java.util.HashMap.putVal(HashMap.java:630)
        //     at java.base/java.util.HashMap.put(HashMap.java:607)
        //     at java.base/java.util.HashSet.add(HashSet.java:220)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeRecursive(MetadataHelper.java:1529)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$100(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitClassType(MetadataHelper.java:1863)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1882)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubTypeNoCapture(MetadataHelper.java:1268)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitGenericParameter(MetadataHelper.java:1874)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitGenericParameter(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.GenericParameter.accept(GenericParameter.java:85)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubTypeNoCapture(MetadataHelper.java:1268)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1989)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1947)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsType(MetadataHelper.java:1395)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1492)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1501)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$900(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$LooseSameTypeVisitor.containsTypes(MetadataHelper.java:2525)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1412)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1399)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.visitWildcard(MetadataHelper.java:2600)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.visitWildcard(MetadataHelper.java:2529)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1411)
        //     at com.strobel.assembler.metadata.MetadataHelper.areSameTypes(MetadataHelper.java:1429)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.containsTypes(MetadataHelper.java:2584)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1411)
        //     at com.strobel.assembler.metadata.TypeReference.equals(TypeReference.java:118)
        //     at com.strobel.core.Comparer.equals(Comparer.java:31)
        //     at com.strobel.core.Pair.equals(Pair.java:54)
        //     at java.base/java.util.HashMap.putVal(HashMap.java:630)
        //     at java.base/java.util.HashMap.put(HashMap.java:607)
        //     at java.base/java.util.HashSet.add(HashSet.java:220)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeRecursive(MetadataHelper.java:1529)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$100(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitClassType(MetadataHelper.java:1863)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1882)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubTypeNoCapture(MetadataHelper.java:1268)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitGenericParameter(MetadataHelper.java:1874)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitGenericParameter(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.GenericParameter.accept(GenericParameter.java:85)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubTypeNoCapture(MetadataHelper.java:1268)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1989)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1947)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsType(MetadataHelper.java:1395)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1492)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1501)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$900(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$LooseSameTypeVisitor.containsTypes(MetadataHelper.java:2525)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1412)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1399)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameWildcard(MetadataHelper.java:1454)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$200(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1987)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1947)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsType(MetadataHelper.java:1395)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1492)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1501)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$900(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$LooseSameTypeVisitor.containsTypes(MetadataHelper.java:2525)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1412)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1399)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameWildcard(MetadataHelper.java:1454)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$200(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1987)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1947)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsType(MetadataHelper.java:1395)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1492)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1501)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$900(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$LooseSameTypeVisitor.containsTypes(MetadataHelper.java:2525)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1412)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1399)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.visitWildcard(MetadataHelper.java:2600)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.visitWildcard(MetadataHelper.java:2529)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1411)
        //     at com.strobel.assembler.metadata.MetadataHelper.areSameTypes(MetadataHelper.java:1429)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.containsTypes(MetadataHelper.java:2584)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1411)
        //     at com.strobel.assembler.metadata.TypeReference.equals(TypeReference.java:118)
        //     at com.strobel.core.Comparer.equals(Comparer.java:31)
        //     at com.strobel.core.Pair.equals(Pair.java:54)
        //     at java.base/java.util.HashMap.putVal(HashMap.java:630)
        //     at java.base/java.util.HashMap.put(HashMap.java:607)
        //     at java.base/java.util.HashSet.add(HashSet.java:220)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeRecursive(MetadataHelper.java:1529)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$100(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitClassType(MetadataHelper.java:1863)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1882)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitParameterizedType(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubTypeNoCapture(MetadataHelper.java:1268)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitGenericParameter(MetadataHelper.java:1874)
        //     at com.strobel.assembler.metadata.MetadataHelper$6.visitGenericParameter(MetadataHelper.java:1815)
        //     at com.strobel.assembler.metadata.GenericParameter.accept(GenericParameter.java:85)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubType(MetadataHelper.java:1302)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSubTypeNoCapture(MetadataHelper.java:1268)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1989)
        //     at com.strobel.assembler.metadata.MetadataHelper$7.visitWildcard(MetadataHelper.java:1947)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.DefaultTypeVisitor.visit(DefaultTypeVisitor.java:25)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsType(MetadataHelper.java:1395)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1492)
        //     at com.strobel.assembler.metadata.MetadataHelper.containsTypeEquivalent(MetadataHelper.java:1501)
        //     at com.strobel.assembler.metadata.MetadataHelper.access$900(MetadataHelper.java:33)
        //     at com.strobel.assembler.metadata.MetadataHelper$LooseSameTypeVisitor.containsTypes(MetadataHelper.java:2525)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.CoreMetadataFactory$UnresolvedGenericType.accept(CoreMetadataFactory.java:653)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1412)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1399)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.visitWildcard(MetadataHelper.java:2600)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.visitWildcard(MetadataHelper.java:2529)
        //     at com.strobel.assembler.metadata.WildcardType.accept(WildcardType.java:83)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        //     at com.strobel.assembler.metadata.MetadataHelper.isSameType(MetadataHelper.java:1411)
        //     at com.strobel.assembler.metadata.MetadataHelper.areSameTypes(MetadataHelper.java:1429)
        //     at com.strobel.assembler.metadata.MetadataHelper$StrictSameTypeVisitor.containsTypes(MetadataHelper.java:2584)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitClassType(MetadataHelper.java:2386)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2440)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visitParameterizedType(MetadataHelper.java:2322)
        //     at com.strobel.assembler.metadata.ParameterizedType.accept(ParameterizedType.java:103)
        //     at com.strobel.assembler.metadata.MetadataHelper$SameTypeVisitor.visit(MetadataHelper.java:2336)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @e1(version = "1.4")
    @o2(markerClass = { kotlin.q.class })
    @org.jetbrains.annotations.f
    public static final Character E0(@e final c c, @e final f f) {
        k0.p(c, "$this$randomOrNull");
        k0.p(f, "random");
        if (c.isEmpty()) {
            return null;
        }
        return (char)f.n(c.k(), c.n() + '\u0001');
    }
    
    @e
    public static final <T extends Comparable<? super T>> T F(@e final T t, @org.jetbrains.annotations.f final T obj, @org.jetbrains.annotations.f final T obj2) {
        k0.p(t, "$this$coerceIn");
        if (obj != null && obj2 != null) {
            if (obj.compareTo((Object)obj2) > 0) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Cannot coerce value to an empty range: maximum ");
                sb.append(obj2);
                sb.append(" is less than minimum ");
                sb.append(obj);
                sb.append('.');
                throw new IllegalArgumentException(sb.toString());
            }
            if (t.compareTo((Object)obj) < 0) {
                return obj;
            }
            if (t.compareTo((Object)obj2) > 0) {
                return obj2;
            }
        }
        else {
            if (obj != null && t.compareTo((Object)obj) < 0) {
                return obj;
            }
            if (obj2 != null && t.compareTo((Object)obj2) > 0) {
                return obj2;
            }
        }
        return t;
    }
    
    @e1(version = "1.4")
    @kotlin.internal.f
    @o2(markerClass = { kotlin.q.class })
    private static final Integer F0(final k k) {
        return G0(k, f.H);
    }
    
    @e1(version = "1.1")
    @e
    public static final <T extends Comparable<? super T>> T G(@e final T t, @e final kotlin.ranges.f<T> obj) {
        k0.p(t, "$this$coerceIn");
        k0.p(obj, "range");
        if (!obj.isEmpty()) {
            Comparable<? super T> comparable;
            if (obj.h(t, (T)obj.b()) && !obj.h((T)obj.b(), t)) {
                comparable = obj.b();
            }
            else {
                comparable = t;
                if (obj.h((T)obj.i(), t)) {
                    comparable = t;
                    if (!obj.h(t, (T)obj.i())) {
                        comparable = obj.i();
                    }
                }
            }
            return (T)comparable;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Cannot coerce value to an empty range: ");
        sb.append(obj);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString());
    }
    
    @e1(version = "1.4")
    @o2(markerClass = { kotlin.q.class })
    @org.jetbrains.annotations.f
    public static final Integer G0(@e final k k, @e final f f) {
        k0.p(k, "$this$randomOrNull");
        k0.p(f, "random");
        if (k.isEmpty()) {
            return null;
        }
        return g.h(f, k);
    }
    
    @e
    public static final <T extends Comparable<? super T>> T H(@e final T t, @e final kotlin.ranges.g<T> obj) {
        k0.p(t, "$this$coerceIn");
        k0.p(obj, "range");
        if (obj instanceof kotlin.ranges.f) {
            return G(t, (kotlin.ranges.f<T>)obj);
        }
        if (!obj.isEmpty()) {
            Comparable<? super T> comparable;
            if (t.compareTo((Object)obj.b()) < 0) {
                comparable = obj.b();
            }
            else {
                comparable = t;
                if (t.compareTo((Object)obj.i()) > 0) {
                    comparable = obj.i();
                }
            }
            return (T)comparable;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Cannot coerce value to an empty range: ");
        sb.append(obj);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString());
    }
    
    @e1(version = "1.4")
    @kotlin.internal.f
    @o2(markerClass = { kotlin.q.class })
    private static final Long H0(final n n) {
        return I0(n, f.H);
    }
    
    public static final short I(final short n, final short i, final short j) {
        if (i > j) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot coerce value to an empty range: maximum ");
            sb.append(j);
            sb.append(" is less than minimum ");
            sb.append(i);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        }
        if (n < i) {
            return i;
        }
        if (n > j) {
            return j;
        }
        return n;
    }
    
    @e1(version = "1.4")
    @o2(markerClass = { kotlin.q.class })
    @org.jetbrains.annotations.f
    public static final Long I0(@e final n n, @e final f f) {
        k0.p(n, "$this$randomOrNull");
        k0.p(f, "random");
        if (n.isEmpty()) {
            return null;
        }
        return g.i(f, n);
    }
    
    @e1(version = "1.3")
    @kotlin.internal.f
    private static final boolean J(final c c, final Character c2) {
        k0.p(c, "$this$contains");
        return c2 != null && c.r(c2);
    }
    
    @e
    public static final a J0(@e final a a) {
        k0.p(a, "$this$reversed");
        return a.J.a(a.n(), a.k(), -a.o());
    }
    
    @e1(version = "1.3")
    @kotlin.internal.f
    private static final boolean K(final k k, final Integer n) {
        k0.p(k, "$this$contains");
        return n != null && k.r(n);
    }
    
    @e
    public static final i K0(@e final i i) {
        k0.p(i, "$this$reversed");
        return i.J.a(i.n(), i.k(), -i.o());
    }
    
    @e1(version = "1.3")
    @kotlin.internal.f
    private static final boolean L(final n n, final Long n2) {
        k0.p(n, "$this$contains");
        return n2 != null && n.r(n2);
    }
    
    @e
    public static final l L0(@e final l l) {
        k0.p(l, "$this$reversed");
        return l.J.a(l.n(), l.k(), -l.o());
    }
    
    @m6.g(name = "shortRangeContains")
    public static final boolean M0(@e final kotlin.ranges.g<Short> g, final byte b) {
        k0.p(g, "$this$contains");
        return g.f((short)b);
    }
    
    @m6.g(name = "doubleRangeContains")
    public static final boolean N(@e final kotlin.ranges.g<Double> g, final float n) {
        k0.p(g, "$this$contains");
        return g.f((double)n);
    }
    
    @m6.g(name = "shortRangeContains")
    public static final boolean P0(@e final kotlin.ranges.g<Short> g, final int n) {
        k0.p(g, "$this$contains");
        final Short g2 = g1(n);
        return g2 != null && g.f(g2);
    }
    
    @m6.g(name = "shortRangeContains")
    public static final boolean Q0(@e final kotlin.ranges.g<Short> g, final long n) {
        k0.p(g, "$this$contains");
        final Short h1 = h1(n);
        return h1 != null && g.f(h1);
    }
    
    @e
    public static final a R(final char c, final char c2) {
        return a.J.a(c, c2, -1);
    }
    
    @e
    public static final a R0(@e final a a, int i) {
        k0.p(a, "$this$step");
        p.a(i > 0, i);
        final a.a j = a.J;
        final char k = a.k();
        final char n = a.n();
        if (a.o() <= 0) {
            i = -i;
        }
        return j.a(k, n, i);
    }
    
    @e
    public static final i S(final byte b, final byte b2) {
        return i.J.a(b, b2, -1);
    }
    
    @e
    public static i S0(@e final i i, int j) {
        k0.p(i, "$this$step");
        p.a(j > 0, j);
        final i.a k = i.J;
        final int l = i.k();
        final int n = i.n();
        if (i.o() <= 0) {
            j = -j;
        }
        return k.a(l, n, j);
    }
    
    @e
    public static final i T(final byte b, final int n) {
        return i.J.a(b, n, -1);
    }
    
    @e
    public static final l T0(@e final l l, long i) {
        k0.p(l, "$this$step");
        p.a(i > 0L, i);
        final l.a j = l.J;
        final long k = l.k();
        final long n = l.n();
        if (l.o() <= 0L) {
            i = -i;
        }
        return j.a(k, n, i);
    }
    
    @e
    public static final i U(final byte b, final short n) {
        return i.J.a(b, n, -1);
    }
    
    @org.jetbrains.annotations.f
    public static final Byte U0(final double n) {
        final double n2 = -128;
        final double n3 = 127;
        Byte value;
        if (n >= n2 && n <= n3) {
            value = (byte)n;
        }
        else {
            value = null;
        }
        return value;
    }
    
    @e
    public static final i V(final int n, final byte b) {
        return i.J.a(n, b, -1);
    }
    
    @org.jetbrains.annotations.f
    public static final Byte V0(final float n) {
        final float n2 = -128;
        final float n3 = 127;
        Byte value;
        if (n >= n2 && n <= n3) {
            value = (byte)n;
        }
        else {
            value = null;
        }
        return value;
    }
    
    @e
    public static i W(final int n, final int n2) {
        return i.J.a(n, n2, -1);
    }
    
    @org.jetbrains.annotations.f
    public static final Byte W0(final int n) {
        if (-128 <= n) {
            if (127 >= n) {
                return (byte)n;
            }
        }
        return null;
    }
    
    @e
    public static final i X(final int n, final short n2) {
        return i.J.a(n, n2, -1);
    }
    
    @org.jetbrains.annotations.f
    public static final Byte X0(final long n) {
        final long n2 = -128;
        final long n3 = 127;
        if (n2 <= n) {
            if (n3 >= n) {
                return (byte)n;
            }
        }
        return null;
    }
    
    @e
    public static final i Y(final short n, final byte b) {
        return i.J.a(n, b, -1);
    }
    
    @org.jetbrains.annotations.f
    public static final Byte Y0(final short n) {
        final short n2 = -128;
        final short n3 = 127;
        if (n2 <= n) {
            if (n3 >= n) {
                return (byte)n;
            }
        }
        return null;
    }
    
    @e
    public static final i Z(final short n, final int n2) {
        return i.J.a(n, n2, -1);
    }
    
    @org.jetbrains.annotations.f
    public static final Integer Z0(final double n) {
        final double n2 = Integer.MIN_VALUE;
        final double n3 = Integer.MAX_VALUE;
        Integer value;
        if (n >= n2 && n <= n3) {
            value = (int)n;
        }
        else {
            value = null;
        }
        return value;
    }
    
    @e
    public static final i a0(final short n, final short n2) {
        return i.J.a(n, n2, -1);
    }
    
    @org.jetbrains.annotations.f
    public static final Integer a1(final float n) {
        final float n2 = Integer.MIN_VALUE;
        final float n3 = Integer.MAX_VALUE;
        Integer value;
        if (n >= n2 && n <= n3) {
            value = (int)n;
        }
        else {
            value = null;
        }
        return value;
    }
    
    @e
    public static final l b0(final byte b, final long n) {
        return l.J.a(b, n, -1L);
    }
    
    @org.jetbrains.annotations.f
    public static final Integer b1(final long n) {
        final long n2 = Integer.MIN_VALUE;
        final long n3 = Integer.MAX_VALUE;
        if (n2 <= n) {
            if (n3 >= n) {
                return (int)n;
            }
        }
        return null;
    }
    
    @e
    public static final l c0(final int n, final long n2) {
        return l.J.a(n, n2, -1L);
    }
    
    @org.jetbrains.annotations.f
    public static final Long c1(final double n) {
        final double n2 = Long.MIN_VALUE;
        final double n3 = Long.MAX_VALUE;
        Long value;
        if (n >= n2 && n <= n3) {
            value = (long)n;
        }
        else {
            value = null;
        }
        return value;
    }
    
    @e
    public static final l d0(final long n, final byte b) {
        return l.J.a(n, b, -1L);
    }
    
    @org.jetbrains.annotations.f
    public static final Long d1(final float n) {
        final float n2 = Long.MIN_VALUE;
        final float n3 = Long.MAX_VALUE;
        Long value;
        if (n >= n2 && n <= n3) {
            value = (long)n;
        }
        else {
            value = null;
        }
        return value;
    }
    
    @e
    public static final l e0(final long n, final int n2) {
        return l.J.a(n, n2, -1L);
    }
    
    @org.jetbrains.annotations.f
    public static final Short e1(final double n) {
        final double n2 = -32768;
        final double n3 = 32767;
        Short value;
        if (n >= n2 && n <= n3) {
            value = (short)n;
        }
        else {
            value = null;
        }
        return value;
    }
    
    @e
    public static final l f0(final long n, final long n2) {
        return l.J.a(n, n2, -1L);
    }
    
    @org.jetbrains.annotations.f
    public static final Short f1(final float n) {
        final float n2 = -32768;
        final float n3 = 32767;
        Short value;
        if (n >= n2 && n <= n3) {
            value = (short)n;
        }
        else {
            value = null;
        }
        return value;
    }
    
    @e
    public static final l g0(final long n, final short n2) {
        return l.J.a(n, n2, -1L);
    }
    
    @org.jetbrains.annotations.f
    public static final Short g1(final int n) {
        if (-32768 <= n) {
            if (32767 >= n) {
                return (short)n;
            }
        }
        return null;
    }
    
    @m6.g(name = "byteRangeContains")
    public static final boolean h(@e final kotlin.ranges.g<Byte> g, final int n) {
        k0.p(g, "$this$contains");
        final Byte w0 = W0(n);
        return w0 != null && g.f(w0);
    }
    
    @e
    public static final l h0(final short n, final long n2) {
        return l.J.a(n, n2, -1L);
    }
    
    @org.jetbrains.annotations.f
    public static final Short h1(final long n) {
        final long n2 = -32768;
        final long n3 = 32767;
        if (n2 <= n) {
            if (n3 >= n) {
                return (short)n;
            }
        }
        return null;
    }
    
    @m6.g(name = "byteRangeContains")
    public static final boolean i(@e final kotlin.ranges.g<Byte> g, final long n) {
        k0.p(g, "$this$contains");
        final Byte x0 = X0(n);
        return x0 != null && g.f(x0);
    }
    
    @e
    public static final c i1(final char c, final char c2) {
        if (k0.t(c2, 0) <= 0) {
            return c.L.a();
        }
        return new c(c, (char)(c2 - '\u0001'));
    }
    
    @m6.g(name = "byteRangeContains")
    public static final boolean j(@e final kotlin.ranges.g<Byte> g, final short n) {
        k0.p(g, "$this$contains");
        final Byte y0 = Y0(n);
        return y0 != null && g.f(y0);
    }
    
    @m6.g(name = "floatRangeContains")
    public static final boolean j0(@e final kotlin.ranges.g<Float> g, final double n) {
        k0.p(g, "$this$contains");
        return g.f((float)n);
    }
    
    @e
    public static final k j1(final byte b, final byte b2) {
        return new k(b, b2 - 1);
    }
    
    public static final byte k(final byte b, final byte b2) {
        byte b3 = b;
        if (b < b2) {
            b3 = b2;
        }
        return b3;
    }
    
    @e
    public static final k k1(final byte b, final int n) {
        if (n <= Integer.MIN_VALUE) {
            return k.L.a();
        }
        return new k(b, n - 1);
    }
    
    public static final double l(final double n, final double n2) {
        double n3 = n;
        if (n < n2) {
            n3 = n2;
        }
        return n3;
    }
    
    @e
    public static final k l1(final byte b, final short n) {
        return new k(b, n - 1);
    }
    
    public static final float m(final float n, final float n2) {
        float n3 = n;
        if (n < n2) {
            n3 = n2;
        }
        return n3;
    }
    
    @e
    public static final k m1(final int n, final byte b) {
        return new k(n, b - 1);
    }
    
    public static int n(final int n, final int n2) {
        int n3 = n;
        if (n < n2) {
            n3 = n2;
        }
        return n3;
    }
    
    @m6.g(name = "intRangeContains")
    public static final boolean n0(@e final kotlin.ranges.g<Integer> g, final byte i) {
        k0.p(g, "$this$contains");
        return g.f((int)i);
    }
    
    @e
    public static k n1(final int n, final int n2) {
        if (n2 <= Integer.MIN_VALUE) {
            return k.L.a();
        }
        return new k(n, n2 - 1);
    }
    
    public static long o(final long n, final long n2) {
        long n3 = n;
        if (n < n2) {
            n3 = n2;
        }
        return n3;
    }
    
    @e
    public static final k o1(final int n, final short n2) {
        return new k(n, n2 - 1);
    }
    
    @e
    public static final <T extends Comparable<? super T>> T p(@e final T t, @e final T t2) {
        k0.p(t, "$this$coerceAtLeast");
        k0.p(t2, "minimumValue");
        Comparable<? super T> comparable = t;
        if (t.compareTo((Object)t2) < 0) {
            comparable = t2;
        }
        return (T)comparable;
    }
    
    @e
    public static final k p1(final short n, final byte b) {
        return new k(n, b - 1);
    }
    
    public static final short q(final short n, final short n2) {
        short n3 = n;
        if (n < n2) {
            n3 = n2;
        }
        return n3;
    }
    
    @m6.g(name = "intRangeContains")
    public static final boolean q0(@e final kotlin.ranges.g<Integer> g, final long n) {
        k0.p(g, "$this$contains");
        final Integer b1 = b1(n);
        return b1 != null && g.f(b1);
    }
    
    @e
    public static final k q1(final short n, final int n2) {
        if (n2 <= Integer.MIN_VALUE) {
            return k.L.a();
        }
        return new k(n, n2 - 1);
    }
    
    public static final byte r(final byte b, final byte b2) {
        byte b3 = b;
        if (b > b2) {
            b3 = b2;
        }
        return b3;
    }
    
    @m6.g(name = "intRangeContains")
    public static final boolean r0(@e final kotlin.ranges.g<Integer> g, final short i) {
        k0.p(g, "$this$contains");
        return g.f((int)i);
    }
    
    @e
    public static final k r1(final short n, final short n2) {
        return new k(n, n2 - 1);
    }
    
    public static final double s(final double n, final double n2) {
        double n3 = n;
        if (n > n2) {
            n3 = n2;
        }
        return n3;
    }
    
    @m6.g(name = "longRangeContains")
    public static final boolean s0(@e final kotlin.ranges.g<Long> g, final byte b) {
        k0.p(g, "$this$contains");
        return g.f((long)b);
    }
    
    @e
    public static final n s1(final byte b, final long n) {
        if (n <= Long.MIN_VALUE) {
            return n.L.a();
        }
        return new n(b, n - 1L);
    }
    
    public static final float t(final float n, final float n2) {
        float n3 = n;
        if (n > n2) {
            n3 = n2;
        }
        return n3;
    }
    
    @e
    public static final n t1(final int n, final long n2) {
        if (n2 <= Long.MIN_VALUE) {
            return n.L.a();
        }
        return new n(n, n2 - 1L);
    }
    
    public static int u(final int n, final int n2) {
        int n3 = n;
        if (n > n2) {
            n3 = n2;
        }
        return n3;
    }
    
    @e
    public static final n u1(final long n, final byte b) {
        return new n(n, b - 1L);
    }
    
    public static long v(final long n, final long n2) {
        long n3 = n;
        if (n > n2) {
            n3 = n2;
        }
        return n3;
    }
    
    @m6.g(name = "longRangeContains")
    public static final boolean v0(@e final kotlin.ranges.g<Long> g, final int n) {
        k0.p(g, "$this$contains");
        return g.f((long)n);
    }
    
    @e
    public static final n v1(final long n, final int n2) {
        return new n(n, n2 - 1L);
    }
    
    @e
    public static final <T extends Comparable<? super T>> T w(@e final T t, @e final T t2) {
        k0.p(t, "$this$coerceAtMost");
        k0.p(t2, "maximumValue");
        Comparable<? super T> comparable = t;
        if (t.compareTo((Object)t2) > 0) {
            comparable = t2;
        }
        return (T)comparable;
    }
    
    @m6.g(name = "longRangeContains")
    public static final boolean w0(@e final kotlin.ranges.g<Long> g, final short n) {
        k0.p(g, "$this$contains");
        return g.f((long)n);
    }
    
    @e
    public static final n w1(final long n, final long n2) {
        if (n2 <= Long.MIN_VALUE) {
            return n.L.a();
        }
        return new n(n, n2 - 1L);
    }
    
    public static final short x(final short n, final short n2) {
        short n3 = n;
        if (n > n2) {
            n3 = n2;
        }
        return n3;
    }
    
    @e1(version = "1.3")
    @kotlin.internal.f
    private static final char x0(final c c) {
        return y0(c, f.H);
    }
    
    @e
    public static final n x1(final long n, final short n2) {
        return new n(n, n2 - 1L);
    }
    
    public static final byte y(final byte b, final byte i, final byte j) {
        if (i > j) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot coerce value to an empty range: maximum ");
            sb.append(j);
            sb.append(" is less than minimum ");
            sb.append(i);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        }
        if (b < i) {
            return i;
        }
        if (b > j) {
            return j;
        }
        return b;
    }
    
    @e1(version = "1.3")
    public static final char y0(@e final c c, @e final f f) {
        k0.p(c, "$this$random");
        k0.p(f, "random");
        try {
            return (char)f.n(c.k(), c.n() + '\u0001');
        }
        catch (IllegalArgumentException ex) {
            throw new NoSuchElementException(ex.getMessage());
        }
    }
    
    @e
    public static final n y1(final short n, final long n2) {
        if (n2 <= Long.MIN_VALUE) {
            return n.L.a();
        }
        return new n(n, n2 - 1L);
    }
    
    public static final double z(final double n, final double d, final double d2) {
        if (d > d2) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot coerce value to an empty range: maximum ");
            sb.append(d2);
            sb.append(" is less than minimum ");
            sb.append(d);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        }
        if (n < d) {
            return d;
        }
        if (n > d2) {
            return d2;
        }
        return n;
    }
    
    @e1(version = "1.3")
    @kotlin.internal.f
    private static final int z0(final k k) {
        return A0(k, f.H);
    }
}
