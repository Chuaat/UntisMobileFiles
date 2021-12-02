// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import androidx.annotation.p0;
import androidx.annotation.b1;
import android.os.Build$VERSION;
import java.io.File;
import androidx.annotation.j0;
import android.content.Context;
import androidx.work.q;
import androidx.annotation.t0;

@t0({ t0.a.H })
public class i
{
    private static final String a;
    private static final String b = "androidx.work.workdb";
    private static final String[] c;
    
    static {
        a = q.f("WrkDbPathHelper");
        c = new String[] { "-journal", "-shm", "-wal" };
    }
    
    private i() {
    }
    
    @b1
    @j0
    public static File a(@j0 final Context context) {
        if (Build$VERSION.SDK_INT < 23) {
            return b(context);
        }
        return c(context, "androidx.work.workdb");
    }
    
    @b1
    @j0
    public static File b(@j0 final Context context) {
        return context.getDatabasePath("androidx.work.workdb");
    }
    
    @p0(23)
    private static File c(@j0 final Context context, @j0 final String child) {
        return new File(context.getNoBackupFilesDir(), child);
    }
    
    @j0
    public static String d() {
        return "androidx.work.workdb";
    }
    
    public static void e(@j0 final Context context) {
        final File b = b(context);
        if (Build$VERSION.SDK_INT >= 23 && b.exists()) {
            q.c().a(i.a, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
            final Map<File, File> f = f(context);
            for (final File file : f.keySet()) {
                final File dest = f.get(file);
                if (file.exists() && dest != null) {
                    if (dest.exists()) {
                        q.c().h(i.a, String.format("Over-writing contents of %s", dest), new Throwable[0]);
                    }
                    String s;
                    if (file.renameTo(dest)) {
                        s = String.format("Migrated %s to %s", file, dest);
                    }
                    else {
                        s = String.format("Renaming %s to %s failed", file, dest);
                    }
                    q.c().a(i.a, s, new Throwable[0]);
                }
            }
        }
    }
    
    @b1
    @j0
    public static Map<File, File> f(@j0 final Context context) {
        final HashMap<File, File> hashMap = new HashMap<File, File>();
        if (Build$VERSION.SDK_INT >= 23) {
            final File b = b(context);
            final File a = a(context);
            hashMap.put(b, a);
            for (final String s : i.c) {
                final StringBuilder sb = new StringBuilder();
                sb.append(b.getPath());
                sb.append(s);
                final File file = new File(sb.toString());
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(a.getPath());
                sb2.append(s);
                hashMap.put(file, new File(sb2.toString()));
            }
        }
        return hashMap;
    }
}
