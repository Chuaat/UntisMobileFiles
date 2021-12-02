// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import java.io.File;
import androidx.annotation.c1;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteDatabase;

public final class l
{
    @c1
    static void a(final n3 n3, final SQLiteDatabase sqLiteDatabase, final String s, final String s2, String s3, final String[] array) throws SQLiteException {
        if (n3 == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        final int n4 = 0;
        Object o = null;
        Cursor cursor;
        Cursor cursor2;
        boolean b;
        Cursor cursor3;
        boolean b2;
        HashSet<Object> c;
        StringBuilder sb;
        final SQLiteException ex2;
        Cursor cursor4 = null;
        Label_0423:Block_17_Outer:
        while (true) {
            Label_0118: {
                try {
                    cursor = (Cursor)(o = sqLiteDatabase.query("SQLITE_MASTER", new String[] { "name" }, "name=?", new String[] { s }, (String)null, (String)null, (String)null));
                    try {
                        cursor2 = cursor;
                        b = cursor2.moveToFirst();
                        cursor3 = cursor;
                        cursor3.close();
                        b2 = b;
                        if (!b2) {
                            break Label_0113;
                        }
                        break Label_0118;
                    }
                    catch (SQLiteException ex2) {}
                }
                catch (SQLiteException ex2) {
                    cursor = null;
                }
                finally {
                    break Label_0423;
                }
                try {
                    cursor2 = cursor;
                    b = cursor2.moveToFirst();
                    cursor3 = cursor;
                    cursor3.close();
                    b2 = b;
                    if (!b2) {
                        sqLiteDatabase.execSQL(s2);
                    }
                    try {
                        c = new HashSet<Object>();
                        o = new StringBuilder(s.length() + 22);
                        ((StringBuilder)o).append("SELECT * FROM ");
                        ((StringBuilder)o).append(s);
                        ((StringBuilder)o).append(" LIMIT 0");
                        o = sqLiteDatabase.rawQuery(((StringBuilder)o).toString(), (String[])null);
                        try {
                            Collections.addAll(c, ((Cursor)o).getColumnNames());
                            ((Cursor)o).close();
                            o = s3.split(",");
                            for (int length = ((Cursor)o).length, i = 0; i < length; ++i) {
                                s3 = o[i];
                                if (!c.remove(s3)) {
                                    sb = new StringBuilder(s.length() + 35 + String.valueOf(s3).length());
                                    sb.append("Table ");
                                    sb.append(s);
                                    sb.append(" is missing required column: ");
                                    sb.append(s3);
                                    throw new SQLiteException(sb.toString());
                                }
                            }
                            if (array != null) {
                                for (int j = n4; j < array.length; j += 2) {
                                    if (!c.remove(array[j])) {
                                        sqLiteDatabase.execSQL(array[j + 1]);
                                    }
                                }
                            }
                            if (!c.isEmpty()) {
                                n3.t().c("Table has extra columns. table, columns", s, TextUtils.join((CharSequence)", ", (Iterable)c));
                            }
                            return;
                        }
                        finally {
                            ((Cursor)o).close();
                        }
                    }
                    catch (SQLiteException ex) {
                        n3.o().b("Failed to verify columns on table that was just created", s);
                        throw ex;
                    }
                    while (true) {
                        cursor.close();
                        continue Block_17_Outer;
                        o = cursor;
                        n3.t().c("Error querying for table", s, ex2);
                        continue;
                    }
                }
                // iftrue(Label_0113:, cursor == null)
                finally {
                    cursor4 = (Cursor)o;
                }
            }
            break;
        }
        if (cursor4 != null) {
            cursor4.close();
        }
    }
    
    static void b(final n3 n3, final SQLiteDatabase sqLiteDatabase) {
        if (n3 != null) {
            final File file = new File(sqLiteDatabase.getPath());
            if (!file.setReadable(false, false)) {
                n3.t().a("Failed to turn off database read permission");
            }
            if (!file.setWritable(false, false)) {
                n3.t().a("Failed to turn off database write permission");
            }
            if (!file.setReadable(true, true)) {
                n3.t().a("Failed to turn on database read permission for owner");
            }
            if (!file.setWritable(true, true)) {
                n3.t().a("Failed to turn on database write permission for owner");
            }
            return;
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }
}
