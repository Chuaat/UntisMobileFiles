// 
// Decompiled by Procyon v0.5.36
// 

package m;

import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import android.database.Cursor;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b\u001a\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001e\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\t\u0010\n\u001a\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\u000b\u0010\f\u001a\u001e\u0010\u000e\u001a\u0004\u0018\u00010\r*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b¨\u0006\u0015" }, d2 = { "Landroid/database/Cursor;", "", "index", "", "a", "", "b", "(Landroid/database/Cursor;I)Ljava/lang/Double;", "", "c", "(Landroid/database/Cursor;I)Ljava/lang/Float;", "d", "(Landroid/database/Cursor;I)Ljava/lang/Integer;", "", "e", "(Landroid/database/Cursor;I)Ljava/lang/Long;", "", "f", "(Landroid/database/Cursor;I)Ljava/lang/Short;", "", "g", "core-ktx_release" }, k = 2, mv = { 1, 5, 1 })
public final class a
{
    @f
    public static final byte[] a(@e final Cursor cursor, final int n) {
        k0.p((Object)cursor, "<this>");
        byte[] blob;
        if (cursor.isNull(n)) {
            blob = null;
        }
        else {
            blob = cursor.getBlob(n);
        }
        return blob;
    }
    
    @f
    public static final Double b(@e final Cursor cursor, final int n) {
        k0.p((Object)cursor, "<this>");
        Double value;
        if (cursor.isNull(n)) {
            value = null;
        }
        else {
            value = cursor.getDouble(n);
        }
        return value;
    }
    
    @f
    public static final Float c(@e final Cursor cursor, final int n) {
        k0.p((Object)cursor, "<this>");
        Float value;
        if (cursor.isNull(n)) {
            value = null;
        }
        else {
            value = cursor.getFloat(n);
        }
        return value;
    }
    
    @f
    public static final Integer d(@e final Cursor cursor, final int n) {
        k0.p((Object)cursor, "<this>");
        Integer value;
        if (cursor.isNull(n)) {
            value = null;
        }
        else {
            value = cursor.getInt(n);
        }
        return value;
    }
    
    @f
    public static final Long e(@e final Cursor cursor, final int n) {
        k0.p((Object)cursor, "<this>");
        Long value;
        if (cursor.isNull(n)) {
            value = null;
        }
        else {
            value = cursor.getLong(n);
        }
        return value;
    }
    
    @f
    public static final Short f(@e final Cursor cursor, final int n) {
        k0.p((Object)cursor, "<this>");
        Short value;
        if (cursor.isNull(n)) {
            value = null;
        }
        else {
            value = cursor.getShort(n);
        }
        return value;
    }
    
    @f
    public static final String g(@e final Cursor cursor, final int n) {
        k0.p((Object)cursor, "<this>");
        String string;
        if (cursor.isNull(n)) {
            string = null;
        }
        else {
            string = cursor.getString(n);
        }
        return string;
    }
}
