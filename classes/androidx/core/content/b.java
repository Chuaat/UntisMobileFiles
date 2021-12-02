// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.content;

import androidx.core.os.n;
import android.os.OperationCanceledException;
import android.os.CancellationSignal;
import android.os.Build$VERSION;
import android.database.Cursor;
import androidx.core.os.c;
import android.net.Uri;
import android.content.ContentResolver;

public final class b
{
    private b() {
    }
    
    public static Cursor a(final ContentResolver contentResolver, final Uri uri, final String[] array, final String s, final String[] array2, final String s2, final c c) {
        if (Build$VERSION.SDK_INT >= 16) {
            Label_0027: {
                if (c == null) {
                    break Label_0027;
                }
                try {
                    final Object b = c.b();
                    return contentResolver.query(uri, array, s, array2, s2, (CancellationSignal)b);
                }
                catch (Exception ex) {
                    if (ex instanceof OperationCanceledException) {
                        throw new n();
                    }
                    throw ex;
                    final Object b = null;
                    return contentResolver.query(uri, array, s, array2, s2, (CancellationSignal)b);
                }
            }
        }
        if (c != null) {
            c.e();
        }
        return contentResolver.query(uri, array, s, array2, s2);
    }
}
