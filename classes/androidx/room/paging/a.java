// 
// Decompiled by Procyon v0.5.36
// 

package androidx.room.paging;

import androidx.paging.PositionalDataSource$LoadRangeCallback;
import androidx.paging.PositionalDataSource$LoadRangeParams;
import java.util.Collections;
import androidx.paging.PositionalDataSource$LoadInitialCallback;
import androidx.paging.PositionalDataSource$LoadInitialParams;
import java.util.List;
import android.database.Cursor;
import androidx.sqlite.db.f;
import java.util.Set;
import androidx.annotation.j0;
import java.util.concurrent.atomic.AtomicBoolean;
import androidx.room.h1;
import androidx.room.r2;
import androidx.room.v2;
import androidx.annotation.t0;
import androidx.paging.PositionalDataSource;

@t0({ t0.a.I })
public abstract class a<T> extends PositionalDataSource<T>
{
    private final v2 a;
    private final String b;
    private final String c;
    private final r2 d;
    private final h1.c e;
    private final boolean f;
    private final AtomicBoolean g;
    
    protected a(@j0 final r2 d, @j0 final v2 a, final boolean f, final boolean b, @j0 final String... array) {
        this.g = new AtomicBoolean(false);
        this.d = d;
        this.a = a;
        this.f = f;
        final StringBuilder sb = new StringBuilder();
        sb.append("SELECT COUNT(*) FROM ( ");
        sb.append(a.b());
        sb.append(" )");
        this.b = sb.toString();
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("SELECT * FROM ( ");
        sb2.append(a.b());
        sb2.append(" ) LIMIT ? OFFSET ?");
        this.c = sb2.toString();
        this.e = new h1.c(array) {
            @Override
            public void b(@j0 final Set<String> set) {
                a.this.invalidate();
            }
        };
        if (b) {
            this.h();
        }
    }
    
    protected a(@j0 final r2 r2, @j0 final v2 v2, final boolean b, @j0 final String... array) {
        this(r2, v2, b, true, array);
    }
    
    protected a(@j0 final r2 r2, @j0 final f f, final boolean b, final boolean b2, @j0 final String... array) {
        this(r2, v2.f(f), b, b2, array);
    }
    
    protected a(@j0 final r2 r2, @j0 final f f, final boolean b, @j0 final String... array) {
        this(r2, v2.f(f), b, array);
    }
    
    private v2 c(final int n, final int n2) {
        final v2 d = v2.d(this.c, this.a.a() + 2);
        d.e(this.a);
        d.l2(d.a() - 1, n2);
        d.l2(d.a(), n);
        return d;
    }
    
    private void h() {
        if (this.g.compareAndSet(false, true)) {
            this.d.n().b(this.e);
        }
    }
    
    @j0
    protected abstract List<T> a(@j0 final Cursor p0);
    
    public int b() {
        this.h();
        final v2 d = v2.d(this.b, this.a.a());
        d.e(this.a);
        final Cursor d2 = this.d.D(d);
        try {
            if (d2.moveToFirst()) {
                return d2.getInt(0);
            }
            return 0;
        }
        finally {
            d2.close();
            d.release();
        }
    }
    
    public boolean d() {
        this.h();
        this.d.n().l();
        return super.isInvalid();
    }
    
    public void e(@j0 PositionalDataSource$LoadInitialParams d, @j0 final PositionalDataSource$LoadInitialCallback<T> positionalDataSource$LoadInitialCallback) {
        this.h();
        final Object emptyList = Collections.emptyList();
        this.d.e();
        final Cursor cursor = null;
        Object o = null;
        final PositionalDataSource$LoadInitialParams positionalDataSource$LoadInitialParams = null;
        v2 v2 = null;
        Cursor cursor2 = null;
        Label_0160: {
            try {
                final int b = this.b();
                int computeInitialLoadPosition = 0;
                v2 c = null;
                Label_0114: {
                    if (b != 0) {
                        computeInitialLoadPosition = computeInitialLoadPosition(d, b);
                        c = this.c(computeInitialLoadPosition, computeInitialLoadSize(d, computeInitialLoadPosition, b));
                        d = positionalDataSource$LoadInitialParams;
                        try {
                            o = (d = (PositionalDataSource$LoadInitialParams)this.d.D(c));
                            final Object a = this.a((Cursor)o);
                            d = (PositionalDataSource$LoadInitialParams)o;
                            this.d.I();
                            d = (PositionalDataSource$LoadInitialParams)a;
                            break Label_0114;
                        }
                        finally {
                            break Label_0160;
                        }
                    }
                    computeInitialLoadPosition = 0;
                    c = null;
                    o = cursor;
                    d = (PositionalDataSource$LoadInitialParams)emptyList;
                }
                if (o != null) {
                    ((Cursor)o).close();
                }
                this.d.k();
                if (c != null) {
                    c.release();
                }
                positionalDataSource$LoadInitialCallback.onResult((List)d, computeInitialLoadPosition, b);
                return;
            }
            finally {
                v2 = null;
                cursor2 = (Cursor)o;
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
        this.d.k();
        if (v2 != null) {
            v2.release();
        }
    }
    
    @j0
    public List<T> f(final int n, final int n2) {
        final v2 c = this.c(n, n2);
        while (true) {
            Label_0115: {
                if (!this.f) {
                    break Label_0115;
                }
                this.d.e();
                Object d = null;
                try {
                    final Cursor cursor = (Cursor)(d = this.d.D(c));
                    final List<T> a = this.a(cursor);
                    d = cursor;
                    this.d.I();
                    if (cursor != null) {
                        cursor.close();
                    }
                    this.d.k();
                    d = a;
                    c.release();
                    return (List<T>)d;
                }
                finally {
                    if (d != null) {
                        ((Cursor)d).close();
                    }
                    this.d.k();
                    c.release();
                }
            }
            final Cursor d2 = this.d.D(c);
            try {
                this.a(d2);
                d2.close();
                continue;
            }
            finally {
                d2.close();
                c.release();
            }
            break;
        }
    }
    
    public void g(@j0 final PositionalDataSource$LoadRangeParams positionalDataSource$LoadRangeParams, @j0 final PositionalDataSource$LoadRangeCallback<T> positionalDataSource$LoadRangeCallback) {
        positionalDataSource$LoadRangeCallback.onResult((List)this.f(positionalDataSource$LoadRangeParams.startPosition, positionalDataSource$LoadRangeParams.loadSize));
    }
}
