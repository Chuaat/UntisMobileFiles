// 
// Decompiled by Procyon v0.5.36
// 

package n;

import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.k0;
import n6.l;
import org.jetbrains.annotations.e;
import android.database.sqlite.SQLiteDatabase;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a@\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\b\u0005H\u0086\b\u00f8\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t" }, d2 = { "T", "Landroid/database/sqlite/SQLiteDatabase;", "", "exclusive", "Lkotlin/Function1;", "Lkotlin/s;", "body", "a", "(Landroid/database/sqlite/SQLiteDatabase;ZLn6/l;)Ljava/lang/Object;", "core-ktx_release" }, k = 2, mv = { 1, 5, 1 })
public final class b
{
    public static final <T> T a(@e final SQLiteDatabase sqLiteDatabase, final boolean b, @e final l<? super SQLiteDatabase, ? extends T> l) {
        k0.p((Object)sqLiteDatabase, "<this>");
        k0.p((Object)l, "body");
        if (b) {
            sqLiteDatabase.beginTransaction();
        }
        else {
            sqLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            final Object invoke = l.invoke((Object)sqLiteDatabase);
            sqLiteDatabase.setTransactionSuccessful();
            return (T)invoke;
        }
        finally {
            h0.d(1);
            sqLiteDatabase.endTransaction();
            h0.c(1);
        }
    }
}
