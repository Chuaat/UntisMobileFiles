// 
// Decompiled by Procyon v0.5.36
// 

package androidx.sqlite.db;

import java.util.Iterator;
import android.text.TextUtils;
import android.content.Context;
import java.util.List;
import android.database.sqlite.SQLiteException;
import java.io.IOException;
import android.util.Pair;
import androidx.annotation.j0;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;
import android.os.Build$VERSION;
import android.util.Log;
import androidx.annotation.p0;
import androidx.annotation.k0;
import java.io.Closeable;

public interface d extends Closeable
{
    androidx.sqlite.db.c E2();
    
    androidx.sqlite.db.c T2();
    
    void close();
    
    @k0
    String getDatabaseName();
    
    @p0(api = 16)
    void setWriteAheadLoggingEnabled(final boolean p0);
    
    public abstract static class a
    {
        private static final String b = "SupportSQLite";
        public final int a;
        
        public a(final int a) {
            this.a = a;
        }
        
        private void a(final String s) {
            if (!s.equalsIgnoreCase(":memory:")) {
                if (s.trim().length() != 0) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("deleting the database file: ");
                    sb.append(s);
                    Log.w("SupportSQLite", sb.toString());
                    try {
                        if (Build$VERSION.SDK_INT >= 16) {
                            SQLiteDatabase.deleteDatabase(new File(s));
                        }
                        else {
                            try {
                                if (!new File(s).delete()) {
                                    final StringBuilder sb2 = new StringBuilder();
                                    sb2.append("Could not delete the database file ");
                                    sb2.append(s);
                                    Log.e("SupportSQLite", sb2.toString());
                                }
                            }
                            catch (Exception ex) {
                                Log.e("SupportSQLite", "error while deleting corrupted database file", (Throwable)ex);
                            }
                        }
                    }
                    catch (Exception ex2) {
                        Log.w("SupportSQLite", "delete failed: ", (Throwable)ex2);
                    }
                }
            }
        }
        
        public void b(@j0 final androidx.sqlite.db.c c) {
        }
        
        public void c(@j0 androidx.sqlite.db.c c) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Corruption reported by sqlite on database: ");
            sb.append(c.getPath());
            Log.e("SupportSQLite", sb.toString());
            if (!c.isOpen()) {
                this.a(c.getPath());
                return;
            }
            final List list = null;
        Block_10_Outer:
            while (true) {
                try {
                    List<Pair<String, String>> b0 = null;
                    Label_0144: {
                        try {
                            b0 = c.B0();
                            break Label_0078;
                        }
                        finally {
                            Label_0141: {
                                break Label_0141;
                                try {
                                    c.close();
                                    break Label_0144;
                                    // iftrue(Label_0141:, !c.hasNext())
                                    // iftrue(Label_0131:, list == null)
                                    Block_11: {
                                        while (true) {
                                            while (true) {
                                                break Block_11;
                                                Label_0131: {
                                                    this.a(c.getPath());
                                                }
                                                break Label_0141;
                                                c = (androidx.sqlite.db.c)list.iterator();
                                                continue Block_10_Outer;
                                            }
                                            continue;
                                        }
                                    }
                                    this.a((String)((Iterator<Pair>)c).next().second);
                                }
                                catch (IOException ex) {}
                            }
                        }
                    }
                    if (b0 != null) {
                        c = (androidx.sqlite.db.c)b0.iterator();
                        while (((Iterator)c).hasNext()) {
                            this.a((String)((Iterator<Pair>)c).next().second);
                        }
                    }
                    else {
                        this.a(c.getPath());
                    }
                }
                catch (SQLiteException ex2) {
                    continue;
                }
                break;
            }
        }
        
        public abstract void d(@j0 final androidx.sqlite.db.c p0);
        
        public void e(@j0 final androidx.sqlite.db.c c, final int i, final int j) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Can't downgrade database from version ");
            sb.append(i);
            sb.append(" to ");
            sb.append(j);
            throw new SQLiteException(sb.toString());
        }
        
        public void f(@j0 final androidx.sqlite.db.c c) {
        }
        
        public abstract void g(@j0 final androidx.sqlite.db.c p0, final int p1, final int p2);
    }
    
    public static class b
    {
        @j0
        public final Context a;
        @k0
        public final String b;
        @j0
        public final d.a c;
        public final boolean d;
        
        b(@j0 final Context context, @k0 final String s, @j0 final d.a a) {
            this(context, s, a, false);
        }
        
        b(@j0 final Context a, @k0 final String b, @j0 final d.a c, final boolean d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
        
        @j0
        public static a a(@j0 final Context context) {
            return new a(context);
        }
        
        public static class a
        {
            Context a;
            String b;
            d.a c;
            boolean d;
            
            a(@j0 final Context a) {
                this.a = a;
            }
            
            @j0
            public b a() {
                if (this.c == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                }
                if (this.a == null) {
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                }
                if (this.d && TextUtils.isEmpty((CharSequence)this.b)) {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
                return new b(this.a, this.b, this.c, this.d);
            }
            
            @j0
            public a b(@j0 final d.a c) {
                this.c = c;
                return this;
            }
            
            @j0
            public a c(@k0 final String b) {
                this.b = b;
                return this;
            }
            
            @j0
            public a d(final boolean d) {
                this.d = d;
                return this;
            }
        }
    }
    
    public interface c
    {
        @j0
        d a(@j0 final b p0);
    }
}
