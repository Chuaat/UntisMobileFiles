// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.os;

import android.util.SizeF;
import android.util.Size;
import android.os.IBinder;
import android.os.Build$VERSION;
import java.io.Serializable;
import android.os.Parcelable;
import kotlin.jvm.internal.k0;
import android.os.Bundle;
import org.jetbrains.annotations.e;
import kotlin.s0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001a\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\u0006\u001a\u00020\u00052.\u0010\u0004\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0000\"\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b" }, d2 = { "", "Lkotlin/s0;", "", "", "pairs", "Landroid/os/Bundle;", "a", "([Lkotlin/s0;)Landroid/os/Bundle;", "core-ktx_release" }, k = 2, mv = { 1, 5, 1 })
public final class b
{
    @e
    public static final Bundle a(@e final s0<String, ?>... array) {
        k0.p((Object)array, "pairs");
        final Bundle bundle = new Bundle(array.length);
        final int length = array.length;
        int i = 0;
        while (i < length) {
            final s0<String, ?> s0 = array[i];
            ++i;
            final String s2 = (String)s0.a();
            final Object b = s0.b();
            if (b == null) {
                bundle.putString(s2, (String)null);
            }
            else if (b instanceof Boolean) {
                bundle.putBoolean(s2, (boolean)b);
            }
            else if (b instanceof Byte) {
                bundle.putByte(s2, ((Number)b).byteValue());
            }
            else if (b instanceof Character) {
                bundle.putChar(s2, (char)b);
            }
            else if (b instanceof Double) {
                bundle.putDouble(s2, ((Number)b).doubleValue());
            }
            else if (b instanceof Float) {
                bundle.putFloat(s2, ((Number)b).floatValue());
            }
            else if (b instanceof Integer) {
                bundle.putInt(s2, ((Number)b).intValue());
            }
            else if (b instanceof Long) {
                bundle.putLong(s2, ((Number)b).longValue());
            }
            else if (b instanceof Short) {
                bundle.putShort(s2, ((Number)b).shortValue());
            }
            else if (b instanceof Bundle) {
                bundle.putBundle(s2, (Bundle)b);
            }
            else if (b instanceof CharSequence) {
                bundle.putCharSequence(s2, (CharSequence)b);
            }
            else if (b instanceof Parcelable) {
                bundle.putParcelable(s2, (Parcelable)b);
            }
            else if (b instanceof boolean[]) {
                bundle.putBooleanArray(s2, (boolean[])b);
            }
            else if (b instanceof byte[]) {
                bundle.putByteArray(s2, (byte[])b);
            }
            else if (b instanceof char[]) {
                bundle.putCharArray(s2, (char[])b);
            }
            else if (b instanceof double[]) {
                bundle.putDoubleArray(s2, (double[])b);
            }
            else if (b instanceof float[]) {
                bundle.putFloatArray(s2, (float[])b);
            }
            else if (b instanceof int[]) {
                bundle.putIntArray(s2, (int[])b);
            }
            else if (b instanceof long[]) {
                bundle.putLongArray(s2, (long[])b);
            }
            else if (b instanceof short[]) {
                bundle.putShortArray(s2, (short[])b);
            }
            else {
                if (b instanceof Object[]) {
                    final Class<?> componentType = ((short[])b).getClass().getComponentType();
                    k0.m((Object)componentType);
                    if (Parcelable.class.isAssignableFrom(componentType)) {
                        bundle.putParcelableArray(s2, (Parcelable[])b);
                        continue;
                    }
                    if (String.class.isAssignableFrom(componentType)) {
                        bundle.putStringArray(s2, (String[])b);
                        continue;
                    }
                    if (CharSequence.class.isAssignableFrom(componentType)) {
                        bundle.putCharSequenceArray(s2, (CharSequence[])b);
                        continue;
                    }
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        final String canonicalName = componentType.getCanonicalName();
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Illegal value array type ");
                        sb.append((Object)canonicalName);
                        sb.append(" for key \"");
                        sb.append(s2);
                        sb.append('\"');
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                else if (!(b instanceof Serializable)) {
                    final int sdk_INT = Build$VERSION.SDK_INT;
                    if (sdk_INT >= 18 && b instanceof IBinder) {
                        bundle.putBinder(s2, (IBinder)b);
                        continue;
                    }
                    if (sdk_INT >= 21 && b instanceof Size) {
                        bundle.putSize(s2, (Size)b);
                        continue;
                    }
                    if (sdk_INT >= 21 && b instanceof SizeF) {
                        bundle.putSizeF(s2, (SizeF)b);
                        continue;
                    }
                    final String canonicalName2 = ((SizeF)b).getClass().getCanonicalName();
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Illegal value type ");
                    sb2.append((Object)canonicalName2);
                    sb2.append(" for key \"");
                    sb2.append(s2);
                    sb2.append('\"');
                    throw new IllegalArgumentException(sb2.toString());
                }
                bundle.putSerializable(s2, (Serializable)b);
            }
        }
        return bundle;
    }
}
