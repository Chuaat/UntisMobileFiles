// 
// Decompiled by Procyon v0.5.36
// 

package androidx.room.util;

import android.util.Log;
import java.util.Arrays;
import androidx.annotation.b1;
import android.os.Build$VERSION;
import android.database.MatrixCursor;
import androidx.annotation.j0;
import android.database.Cursor;
import androidx.annotation.t0;

@t0({ t0.a.I })
public class b
{
    private b() {
    }
    
    @j0
    public static Cursor a(@j0 final Cursor cursor) {
        try {
            final MatrixCursor matrixCursor = new MatrixCursor(cursor.getColumnNames(), cursor.getCount());
            while (cursor.moveToNext()) {
                final Object[] array = new Object[cursor.getColumnCount()];
                for (int i = 0; i < cursor.getColumnCount(); ++i) {
                    final int type = cursor.getType(i);
                    if (type != 0) {
                        if (type != 1) {
                            if (type != 2) {
                                if (type != 3) {
                                    if (type != 4) {
                                        throw new IllegalStateException();
                                    }
                                    array[i] = cursor.getBlob(i);
                                }
                                else {
                                    array[i] = cursor.getString(i);
                                }
                            }
                            else {
                                array[i] = cursor.getDouble(i);
                            }
                        }
                        else {
                            array[i] = cursor.getLong(i);
                        }
                    }
                    else {
                        array[i] = null;
                    }
                }
                matrixCursor.addRow(array);
            }
            return (Cursor)matrixCursor;
        }
        finally {
            cursor.close();
        }
    }
    
    private static int b(@j0 final Cursor cursor, @j0 final String s) {
        if (Build$VERSION.SDK_INT > 25) {
            return -1;
        }
        if (s.length() == 0) {
            return -1;
        }
        return c(cursor.getColumnNames(), s);
    }
    
    @b1(otherwise = 2)
    static int c(final String[] array, final String s) {
        final StringBuilder sb = new StringBuilder();
        sb.append(".");
        sb.append(s);
        final String string = sb.toString();
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(".");
        sb2.append(s);
        sb2.append("`");
        final String string2 = sb2.toString();
        for (int i = 0; i < array.length; ++i) {
            final String s2 = array[i];
            if (s2.length() >= s.length() + 2) {
                if (s2.endsWith(string)) {
                    return i;
                }
                if (s2.charAt(0) == '`' && s2.endsWith(string2)) {
                    return i;
                }
            }
        }
        return -1;
    }
    
    public static int d(@j0 final Cursor cursor, @j0 final String str) {
        final int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("`");
        sb.append(str);
        sb.append("`");
        final int columnIndex2 = cursor.getColumnIndex(sb.toString());
        if (columnIndex2 >= 0) {
            return columnIndex2;
        }
        return b(cursor, str);
    }
    
    public static int e(@j0 final Cursor cursor, @j0 final String str) {
        final int d = d(cursor, str);
        if (d >= 0) {
            return d;
        }
        String string;
        try {
            string = Arrays.toString(cursor.getColumnNames());
        }
        catch (Exception ex) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", (Throwable)ex);
            string = "";
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("column '");
        sb.append(str);
        sb.append("' does not exist. Available columns: ");
        sb.append(string);
        throw new IllegalArgumentException(sb.toString());
    }
}
