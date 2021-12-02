// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.coroutines.jvm.internal;

import kotlin.e1;
import java.util.Objects;
import java.util.ArrayList;
import org.jetbrains.annotations.e;
import java.lang.reflect.Field;
import kotlin.jvm.internal.k0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u000e\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0000H\u0002\u001a\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0000H\u0002\u001a\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0002\u001a\u001b\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f*\u00020\u0000H\u0001¢\u0006\u0004\b\u000e\u0010\u000f\"\u0016\u0010\u0011\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010¨\u0006\u0012" }, d2 = { "Lkotlin/coroutines/jvm/internal/a;", "Ljava/lang/StackTraceElement;", "e", "(Lkotlin/coroutines/jvm/internal/a;)Ljava/lang/StackTraceElement;", "Lkotlin/coroutines/jvm/internal/f;", "b", "", "c", "expected", "actual", "Lkotlin/j2;", "a", "", "", "d", "(Lkotlin/coroutines/jvm/internal/a;)[Ljava/lang/String;", "I", "COROUTINES_DEBUG_METADATA_VERSION", "kotlin-stdlib" }, k = 2, mv = { 1, 5, 1 })
public final class g
{
    private static final int a = 1;
    
    private static final void a(final int i, final int j) {
        if (j <= i) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Debug metadata version mismatch. Expected: ");
        sb.append(i);
        sb.append(", got ");
        sb.append(j);
        sb.append(". Please update the Kotlin standard library.");
        throw new IllegalStateException(sb.toString().toString());
    }
    
    private static final f b(final a a) {
        return a.getClass().getAnnotation(f.class);
    }
    
    private static final int c(final a obj) {
        int intValue;
        try {
            final Field declaredField = obj.getClass().getDeclaredField("label");
            k0.o(declaredField, "field");
            declaredField.setAccessible(true);
            Object value;
            if (!((value = declaredField.get(obj)) instanceof Integer)) {
                value = null;
            }
            final Integer n = (Integer)value;
            if (n != null) {
                intValue = n;
            }
            else {
                intValue = 0;
            }
            --intValue;
        }
        catch (Exception ex) {
            intValue = -1;
        }
        return intValue;
    }
    
    @e1(version = "1.3")
    @m6.g(name = "getSpilledVariableFieldMapping")
    @org.jetbrains.annotations.f
    public static final String[] d(@e final a a) {
        k0.p(a, "$this$getSpilledVariableFieldMapping");
        final f b = b(a);
        if (b != null) {
            a(1, b.v());
            final ArrayList<String> list = new ArrayList<String>();
            final int c = c(a);
            final int[] i = b.i();
            for (int length = i.length, j = 0; j < length; ++j) {
                if (i[j] == c) {
                    list.add(b.s()[j]);
                    list.add(b.n()[j]);
                }
            }
            final String[] array = list.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            return array;
        }
        return null;
    }
    
    @e1(version = "1.3")
    @m6.g(name = "getStackTraceElement")
    @org.jetbrains.annotations.f
    public static final StackTraceElement e(@e final a a) {
        k0.p(a, "$this$getStackTraceElementImpl");
        final f b = b(a);
        if (b != null) {
            a(1, b.v());
            final int c = c(a);
            int lineNumber;
            if (c < 0) {
                lineNumber = -1;
            }
            else {
                lineNumber = b.l()[c];
            }
            final String b2 = i.c.b(a);
            String declaringClass;
            if (b2 == null) {
                declaringClass = b.c();
            }
            else {
                final StringBuilder sb = new StringBuilder();
                sb.append(b2);
                sb.append('/');
                sb.append(b.c());
                declaringClass = sb.toString();
            }
            return new StackTraceElement(declaringClass, b.m(), b.f(), lineNumber);
        }
        return null;
    }
}
