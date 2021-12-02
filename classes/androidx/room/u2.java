// 
// Decompiled by Procyon v0.5.36
// 

package androidx.room;

import java.util.Iterator;
import java.util.List;
import android.database.Cursor;
import androidx.sqlite.db.f;
import androidx.sqlite.db.b;
import androidx.sqlite.db.c;
import androidx.annotation.j0;
import androidx.annotation.k0;
import androidx.annotation.t0;
import androidx.sqlite.db.d;

@t0({ t0.a.I })
public class u2 extends d.a
{
    @k0
    private n0 c;
    @j0
    private final a d;
    @j0
    private final String e;
    @j0
    private final String f;
    
    public u2(@j0 final n0 n0, @j0 final a a, @j0 final String s) {
        this(n0, a, "", s);
    }
    
    public u2(@j0 final n0 c, @j0 final a d, @j0 final String e, @j0 final String f) {
        super(d.a);
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    private void h(final androidx.sqlite.db.c c) {
        if (k(c)) {
            final Object o = null;
            final Cursor z3 = c.Z3(new androidx.sqlite.db.b("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
            Object string = o;
            try {
                if (z3.moveToFirst()) {
                    string = z3.getString(0);
                }
                z3.close();
                if (this.e.equals(string)) {
                    return;
                }
                if (this.f.equals(string)) {
                    return;
                }
                throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
            }
            finally {
                z3.close();
            }
        }
        final b g = this.d.g(c);
        if (!g.a) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Pre-packaged database has an invalid schema: ");
            sb.append(g.b);
            throw new IllegalStateException(sb.toString());
        }
        this.d.e(c);
        this.l(c);
    }
    
    private void i(final androidx.sqlite.db.c c) {
        c.J0("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }
    
    private static boolean j(androidx.sqlite.db.c w2) {
        w2 = (androidx.sqlite.db.c)w2.W2("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            final boolean moveToFirst = ((Cursor)w2).moveToFirst();
            boolean b = false;
            if (moveToFirst) {
                final int int1 = ((Cursor)w2).getInt(0);
                b = b;
                if (int1 == 0) {
                    b = true;
                }
            }
            return b;
        }
        finally {
            ((Cursor)w2).close();
        }
    }
    
    private static boolean k(final androidx.sqlite.db.c c) {
        final Cursor w2 = c.W2("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            final boolean moveToFirst = w2.moveToFirst();
            boolean b = false;
            if (moveToFirst) {
                final int int1 = w2.getInt(0);
                b = b;
                if (int1 != 0) {
                    b = true;
                }
            }
            return b;
        }
        finally {
            w2.close();
        }
    }
    
    private void l(final androidx.sqlite.db.c c) {
        this.i(c);
        c.J0(t2.a(this.e));
    }
    
    @Override
    public void b(final androidx.sqlite.db.c c) {
        super.b(c);
    }
    
    @Override
    public void d(final androidx.sqlite.db.c c) {
        final boolean j = j(c);
        this.d.a(c);
        if (!j) {
            final b g = this.d.g(c);
            if (!g.a) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Pre-packaged database has an invalid schema: ");
                sb.append(g.b);
                throw new IllegalStateException(sb.toString());
            }
        }
        this.l(c);
        this.d.c(c);
    }
    
    @Override
    public void e(final androidx.sqlite.db.c c, final int n, final int n2) {
        this.g(c, n, n2);
    }
    
    @Override
    public void f(final androidx.sqlite.db.c c) {
        super.f(c);
        this.h(c);
        this.d.d(c);
        this.c = null;
    }
    
    @Override
    public void g(final androidx.sqlite.db.c c, final int i, final int j) {
        final n0 c2 = this.c;
        boolean b = false;
        Label_0149: {
            if (c2 != null) {
                final List<e1.c> c3 = c2.d.c(i, j);
                if (c3 != null) {
                    this.d.f(c);
                    final Iterator<e1.c> iterator = c3.iterator();
                    while (iterator.hasNext()) {
                        iterator.next().a(c);
                    }
                    final b g = this.d.g(c);
                    if (g.a) {
                        this.d.e(c);
                        this.l(c);
                        b = true;
                        break Label_0149;
                    }
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Migration didn't properly handle: ");
                    sb.append(g.b);
                    throw new IllegalStateException(sb.toString());
                }
            }
            b = false;
        }
        if (!b) {
            final n0 c4 = this.c;
            if (c4 == null || c4.a(i, j)) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("A migration from ");
                sb2.append(i);
                sb2.append(" to ");
                sb2.append(j);
                sb2.append(" was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
                throw new IllegalStateException(sb2.toString());
            }
            this.d.b(c);
            this.d.a(c);
        }
    }
    
    @t0({ t0.a.I })
    public abstract static class a
    {
        public final int a;
        
        public a(final int a) {
            this.a = a;
        }
        
        protected abstract void a(final androidx.sqlite.db.c p0);
        
        protected abstract void b(final androidx.sqlite.db.c p0);
        
        protected abstract void c(final androidx.sqlite.db.c p0);
        
        protected abstract void d(final androidx.sqlite.db.c p0);
        
        protected void e(final androidx.sqlite.db.c c) {
        }
        
        protected void f(final androidx.sqlite.db.c c) {
        }
        
        @j0
        protected b g(@j0 final androidx.sqlite.db.c c) {
            this.h(c);
            return new b(true, null);
        }
        
        @Deprecated
        protected void h(final androidx.sqlite.db.c c) {
            throw new UnsupportedOperationException("validateMigration is deprecated");
        }
    }
    
    @t0({ t0.a.I })
    public static class b
    {
        public final boolean a;
        @k0
        public final String b;
        
        public b(final boolean a, @k0 final String b) {
            this.a = a;
            this.b = b;
        }
    }
}
