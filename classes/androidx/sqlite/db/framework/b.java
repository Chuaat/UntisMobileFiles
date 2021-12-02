// 
// Decompiled by Procyon v0.5.36
// 

package androidx.sqlite.db.framework;

import android.database.sqlite.SQLiteDatabase$CursorFactory;
import android.database.sqlite.SQLiteDatabase;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.p0;
import androidx.sqlite.db.c;
import java.io.File;
import android.os.Build$VERSION;
import android.content.Context;
import androidx.sqlite.db.d;

class b implements d
{
    private final Context G;
    private final String H;
    private final d.a I;
    private final boolean J;
    private final Object K;
    private a L;
    private boolean M;
    
    b(final Context context, final String s, final d.a a) {
        this(context, s, a, false);
    }
    
    b(final Context g, final String h, final d.a i, final boolean j) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = new Object();
    }
    
    private a a() {
        synchronized (this.K) {
            if (this.L == null) {
                final androidx.sqlite.db.framework.a[] array = { null };
                final int sdk_INT = Build$VERSION.SDK_INT;
                if (sdk_INT >= 23 && this.H != null && this.J) {
                    this.L = new a(this.G, new File(this.G.getNoBackupFilesDir(), this.H).getAbsolutePath(), array, this.I);
                }
                else {
                    this.L = new a(this.G, this.H, array, this.I);
                }
                if (sdk_INT >= 16) {
                    this.L.setWriteAheadLoggingEnabled(this.M);
                }
            }
            return this.L;
        }
    }
    
    @Override
    public androidx.sqlite.db.c E2() {
        return this.a().a();
    }
    
    @Override
    public androidx.sqlite.db.c T2() {
        return this.a().d();
    }
    
    @Override
    public void close() {
        this.a().close();
    }
    
    @Override
    public String getDatabaseName() {
        return this.H;
    }
    
    @p0(api = 16)
    @Override
    public void setWriteAheadLoggingEnabled(final boolean b) {
        synchronized (this.K) {
            final a l = this.L;
            if (l != null) {
                l.setWriteAheadLoggingEnabled(b);
            }
            this.M = b;
        }
    }
    
    static class a extends SQLiteOpenHelper
    {
        final androidx.sqlite.db.framework.a[] G;
        final d.a H;
        private boolean I;
        
        a(final Context context, final String s, final androidx.sqlite.db.framework.a[] g, final d.a h) {
            super(context, s, (SQLiteDatabase$CursorFactory)null, h.a, (DatabaseErrorHandler)new DatabaseErrorHandler() {
                public void onCorruption(final SQLiteDatabase sqLiteDatabase) {
                    h.c(androidx.sqlite.db.framework.b.a.c(g, sqLiteDatabase));
                }
            });
            this.H = h;
            this.G = g;
        }
        
        static androidx.sqlite.db.framework.a c(final androidx.sqlite.db.framework.a[] array, final SQLiteDatabase sqLiteDatabase) {
            final androidx.sqlite.db.framework.a a = array[0];
            if (a == null || !a.a(sqLiteDatabase)) {
                array[0] = new androidx.sqlite.db.framework.a(sqLiteDatabase);
            }
            return array[0];
        }
        
        androidx.sqlite.db.c a() {
            synchronized (this) {
                this.I = false;
                final SQLiteDatabase readableDatabase = super.getReadableDatabase();
                if (this.I) {
                    this.close();
                    return this.a();
                }
                return this.b(readableDatabase);
            }
        }
        
        androidx.sqlite.db.framework.a b(final SQLiteDatabase sqLiteDatabase) {
            return c(this.G, sqLiteDatabase);
        }
        
        public void close() {
            synchronized (this) {
                super.close();
                this.G[0] = null;
            }
        }
        
        androidx.sqlite.db.c d() {
            synchronized (this) {
                this.I = false;
                final SQLiteDatabase writableDatabase = super.getWritableDatabase();
                if (this.I) {
                    this.close();
                    return this.d();
                }
                return this.b(writableDatabase);
            }
        }
        
        public void onConfigure(final SQLiteDatabase sqLiteDatabase) {
            this.H.b(this.b(sqLiteDatabase));
        }
        
        public void onCreate(final SQLiteDatabase sqLiteDatabase) {
            this.H.d(this.b(sqLiteDatabase));
        }
        
        public void onDowngrade(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
            this.I = true;
            this.H.e(this.b(sqLiteDatabase), n, n2);
        }
        
        public void onOpen(final SQLiteDatabase sqLiteDatabase) {
            if (!this.I) {
                this.H.f(this.b(sqLiteDatabase));
            }
        }
        
        public void onUpgrade(final SQLiteDatabase sqLiteDatabase, final int n, final int n2) {
            this.I = true;
            this.H.g(this.b(sqLiteDatabase), n, n2);
        }
    }
}
