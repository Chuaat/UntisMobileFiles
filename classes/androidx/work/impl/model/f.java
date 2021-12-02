// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.model;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.util.c;
import java.util.concurrent.Callable;
import androidx.room.v2;
import androidx.lifecycle.LiveData;
import androidx.sqlite.db.h;
import androidx.room.u0;
import androidx.room.r2;

public final class f implements e
{
    private final r2 a;
    private final u0<d> b;
    
    public f(final r2 a) {
        this.a = a;
        this.b = new u0<d>(a) {
            public void a(final h h, final d d) {
                final String a = d.a;
                if (a == null) {
                    h.c4(1);
                }
                else {
                    h.K0(1, a);
                }
                final Long b = d.b;
                if (b == null) {
                    h.c4(2);
                }
                else {
                    h.l2(2, b);
                }
            }
            
            public String createQuery() {
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            }
        };
    }
    
    @Override
    public LiveData<Long> a(final String s) {
        final v2 d = v2.d("SELECT long_value FROM Preference where `key`=?", 1);
        if (s == null) {
            d.c4(1);
        }
        else {
            d.K0(1, s);
        }
        return this.a.n().f(new String[] { "Preference" }, false, (Callable<Long>)new Callable<Long>() {
            public Long a() throws Exception {
                final r2 d = f.this.a;
                final v2 g = d;
                final Long n = null;
                final Cursor d2 = c.d(d, g, false, null);
                Long value = n;
                try {
                    if (d2.moveToFirst()) {
                        if (d2.isNull(0)) {
                            value = n;
                        }
                        else {
                            value = d2.getLong(0);
                        }
                    }
                    return value;
                }
                finally {
                    d2.close();
                }
            }
            
            @Override
            protected void finalize() {
                d.release();
            }
        });
    }
    
    @Override
    public Long b(final String s) {
        final v2 d = v2.d("SELECT long_value FROM Preference where `key`=?", 1);
        if (s == null) {
            d.c4(1);
        }
        else {
            d.K0(1, s);
        }
        this.a.d();
        final r2 a = this.a;
        final Long n = null;
        final Cursor d2 = c.d(a, d, false, null);
        Long value = n;
        try {
            if (d2.moveToFirst()) {
                if (d2.isNull(0)) {
                    value = n;
                }
                else {
                    value = d2.getLong(0);
                }
            }
            return value;
        }
        finally {
            d2.close();
            d.release();
        }
    }
    
    @Override
    public void c(final d d) {
        this.a.d();
        this.a.e();
        try {
            this.b.insert(d);
            this.a.I();
        }
        finally {
            this.a.k();
        }
    }
}
