// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.os;

import androidx.annotation.p0;
import android.os.Build$VERSION;
import kotlin.jvm.internal.k0;
import android.os.PersistableBundle;
import org.jetbrains.annotations.e;
import kotlin.s0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001a\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\u0006\u001a\u00020\u00052.\u0010\u0004\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0000\"\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b" }, d2 = { "", "Lkotlin/s0;", "", "", "pairs", "Landroid/os/PersistableBundle;", "a", "([Lkotlin/s0;)Landroid/os/PersistableBundle;", "core-ktx_release" }, k = 2, mv = { 1, 5, 1 })
public final class r
{
    @p0(21)
    @e
    public static final PersistableBundle a(@e final s0<String, ?>... array) {
        k0.p((Object)array, "pairs");
        final PersistableBundle persistableBundle = new PersistableBundle(array.length);
        final int length = array.length;
        int i = 0;
        while (i < length) {
            final s0<String, ?> s0 = array[i];
            ++i;
            final String s2 = (String)s0.a();
            final Object b = s0.b();
            String s3;
            if (b == null) {
                s3 = null;
            }
            else if (b instanceof Boolean) {
                if (Build$VERSION.SDK_INT >= 22) {
                    persistableBundle.putBoolean(s2, (boolean)b);
                    continue;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Illegal value type boolean for key \"");
                sb.append(s2);
                sb.append('\"');
                throw new IllegalArgumentException(sb.toString());
            }
            else {
                if (b instanceof Double) {
                    persistableBundle.putDouble(s2, ((Number)b).doubleValue());
                    continue;
                }
                if (b instanceof Integer) {
                    persistableBundle.putInt(s2, ((Number)b).intValue());
                    continue;
                }
                if (b instanceof Long) {
                    persistableBundle.putLong(s2, ((Number)b).longValue());
                    continue;
                }
                if (b instanceof String) {
                    s3 = (String)b;
                }
                else if (b instanceof boolean[]) {
                    if (Build$VERSION.SDK_INT >= 22) {
                        persistableBundle.putBooleanArray(s2, (boolean[])b);
                        continue;
                    }
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Illegal value type boolean[] for key \"");
                    sb2.append(s2);
                    sb2.append('\"');
                    throw new IllegalArgumentException(sb2.toString());
                }
                else {
                    if (b instanceof double[]) {
                        persistableBundle.putDoubleArray(s2, (double[])b);
                        continue;
                    }
                    if (b instanceof int[]) {
                        persistableBundle.putIntArray(s2, (int[])b);
                        continue;
                    }
                    if (b instanceof long[]) {
                        persistableBundle.putLongArray(s2, (long[])b);
                        continue;
                    }
                    if (!(b instanceof Object[])) {
                        final String canonicalName = ((String[])b).getClass().getCanonicalName();
                        final StringBuilder sb3 = new StringBuilder();
                        sb3.append("Illegal value type ");
                        sb3.append((Object)canonicalName);
                        sb3.append(" for key \"");
                        sb3.append(s2);
                        sb3.append('\"');
                        throw new IllegalArgumentException(sb3.toString());
                    }
                    final Class<?> componentType = ((long[])b).getClass().getComponentType();
                    k0.m((Object)componentType);
                    if (String.class.isAssignableFrom(componentType)) {
                        persistableBundle.putStringArray(s2, (String[])b);
                        continue;
                    }
                    final String canonicalName2 = componentType.getCanonicalName();
                    final StringBuilder sb4 = new StringBuilder();
                    sb4.append("Illegal value array type ");
                    sb4.append((Object)canonicalName2);
                    sb4.append(" for key \"");
                    sb4.append(s2);
                    sb4.append('\"');
                    throw new IllegalArgumentException(sb4.toString());
                }
            }
            persistableBundle.putString(s2, s3);
        }
        return persistableBundle;
    }
}
