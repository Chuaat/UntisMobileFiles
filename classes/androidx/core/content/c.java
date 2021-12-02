// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.content;

import kotlin.jvm.internal.k0;
import android.content.ContentValues;
import org.jetbrains.annotations.e;
import kotlin.s0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001a\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a=\u0010\u0006\u001a\u00020\u00052.\u0010\u0004\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0000\"\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b" }, d2 = { "", "Lkotlin/s0;", "", "", "pairs", "Landroid/content/ContentValues;", "a", "([Lkotlin/s0;)Landroid/content/ContentValues;", "core-ktx_release" }, k = 2, mv = { 1, 5, 1 })
public final class c
{
    @e
    public static final ContentValues a(@e final s0<String, ?>... array) {
        k0.p((Object)array, "pairs");
        final ContentValues contentValues = new ContentValues(array.length);
        final int length = array.length;
        int i = 0;
        while (i < length) {
            final s0<String, ?> s0 = array[i];
            ++i;
            final String str = (String)s0.a();
            final Object b = s0.b();
            if (b == null) {
                contentValues.putNull(str);
            }
            else if (b instanceof String) {
                contentValues.put(str, (String)b);
            }
            else if (b instanceof Integer) {
                contentValues.put(str, (Integer)b);
            }
            else if (b instanceof Long) {
                contentValues.put(str, (Long)b);
            }
            else if (b instanceof Boolean) {
                contentValues.put(str, (Boolean)b);
            }
            else if (b instanceof Float) {
                contentValues.put(str, (Float)b);
            }
            else if (b instanceof Double) {
                contentValues.put(str, (Double)b);
            }
            else if (b instanceof byte[]) {
                contentValues.put(str, (byte[])b);
            }
            else if (b instanceof Byte) {
                contentValues.put(str, (Byte)b);
            }
            else {
                if (!(b instanceof Short)) {
                    final String canonicalName = ((Short)b).getClass().getCanonicalName();
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Illegal value type ");
                    sb.append((Object)canonicalName);
                    sb.append(" for key \"");
                    sb.append(str);
                    sb.append('\"');
                    throw new IllegalArgumentException(sb.toString());
                }
                contentValues.put(str, (Short)b);
            }
        }
        return contentValues;
    }
}
