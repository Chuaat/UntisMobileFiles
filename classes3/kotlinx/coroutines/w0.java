// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import kotlin.internal.f;
import n6.a;
import kotlinx.coroutines.internal.m0;
import java.util.concurrent.atomic.AtomicLong;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u0017\u0010\u0005\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0081\b\"\u001c\u0010\n\u001a\u00020\u00038\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0016\u0010\u000e\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\r\"\u0016\u0010\u0010\u001a\u00020\u000b8\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\r\"\u0016\u0010\u0011\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\r\"\u0016\u0010\u0013\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\r\"\u001c\u0010\u0014\u001a\u00020\u00038\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0007\u001a\u0004\b\u000f\u0010\t\"\u001c\u0010\u0019\u001a\u00020\u00158\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018\"\u0016\u0010\u001a\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\r\"\u001c\u0010\u001c\u001a\u00020\u00038\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0007\u001a\u0004\b\f\u0010\t¨\u0006\u001d" }, d2 = { "Lkotlin/j2;", "f", "Lkotlin/Function0;", "", "value", "a", "g", "Z", "d", "()Z", "DEBUG", "", "e", "Ljava/lang/String;", "DEBUG_PROPERTY_VALUE_OFF", "b", "STACKTRACE_RECOVERY_PROPERTY_NAME", "DEBUG_PROPERTY_VALUE_ON", "c", "DEBUG_PROPERTY_VALUE_AUTO", "ASSERTIONS_ENABLED", "Ljava/util/concurrent/atomic/AtomicLong;", "i", "Ljava/util/concurrent/atomic/AtomicLong;", "()Ljava/util/concurrent/atomic/AtomicLong;", "COROUTINE_ID", "DEBUG_PROPERTY_NAME", "h", "RECOVER_STACK_TRACES", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class w0
{
    @e
    public static final String a = "kotlinx.coroutines.debug";
    @e
    public static final String b = "kotlinx.coroutines.stacktrace.recovery";
    @e
    public static final String c = "auto";
    @e
    public static final String d = "on";
    @e
    public static final String e = "off";
    private static final boolean f = false;
    private static final boolean g;
    private static final boolean h;
    @e
    private static final AtomicLong i;
    
    static {
        final String d = m0.d("kotlinx.coroutines.debug");
        final boolean b = true;
        boolean g2 = false;
        Label_0092: {
            Label_0052: {
                if (d != null) {
                    final int hashCode = d.hashCode();
                    Label_0132: {
                        if (hashCode != 0) {
                            if (hashCode != 3551) {
                                if (hashCode != 109935) {
                                    if (hashCode == 3005871 && d.equals("auto")) {
                                        break Label_0052;
                                    }
                                    break Label_0132;
                                }
                                else {
                                    if (d.equals("off")) {
                                        break Label_0052;
                                    }
                                    break Label_0132;
                                }
                            }
                            else if (!d.equals("on")) {
                                break Label_0132;
                            }
                        }
                        else if (!d.equals("")) {
                            break Label_0132;
                        }
                        g2 = true;
                        break Label_0092;
                    }
                    final StringBuilder sb = new StringBuilder();
                    sb.append("System property 'kotlinx.coroutines.debug' has unrecognized value '");
                    sb.append(d);
                    sb.append('\'');
                    throw new IllegalStateException(sb.toString().toString());
                }
            }
            g2 = false;
        }
        g = g2;
        h = (g2 && m0.e("kotlinx.coroutines.stacktrace.recovery", true) && b);
        i = new AtomicLong(0L);
    }
    
    @f
    private static final void a(final a<Boolean> a) {
        if (b() && !(boolean)a.invoke()) {
            throw new AssertionError();
        }
    }
    
    public static final boolean b() {
        return w0.f;
    }
    
    @e
    public static final AtomicLong c() {
        return w0.i;
    }
    
    public static final boolean d() {
        return w0.g;
    }
    
    public static final boolean e() {
        return w0.h;
    }
    
    public static final void f() {
        w0.i.set(0L);
    }
}
