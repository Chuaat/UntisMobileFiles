// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.model;

import android.database.Cursor;
import java.util.ArrayList;
import android.os.CancellationSignal;
import androidx.sqlite.db.f;
import androidx.room.util.c;
import androidx.room.v2;
import java.util.List;
import androidx.sqlite.db.h;
import androidx.room.u0;
import androidx.room.r2;

public final class n implements m
{
    private final r2 a;
    private final u0<l> b;
    
    public n(final r2 a) {
        this.a = a;
        this.b = new u0<l>(a) {
            public void a(final h h, final l l) {
                final String a = l.a;
                if (a == null) {
                    h.c4(1);
                }
                else {
                    h.K0(1, a);
                }
                final String b = l.b;
                if (b == null) {
                    h.c4(2);
                }
                else {
                    h.K0(2, b);
                }
            }
            
            public String createQuery() {
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            }
        };
    }
    
    @Override
    public void a(final l l) {
        this.a.d();
        this.a.e();
        try {
            this.b.insert(l);
            this.a.I();
        }
        finally {
            this.a.k();
        }
    }
    
    @Override
    public List<String> b(String d) {
        final v2 d2 = v2.d("SELECT work_spec_id FROM workname WHERE name=?", 1);
        if (d == null) {
            d2.c4(1);
        }
        else {
            d2.K0(1, d);
        }
        this.a.d();
        d = (String)c.d(this.a, d2, false, null);
        try {
            final ArrayList<String> list = new ArrayList<String>(((Cursor)d).getCount());
            while (((Cursor)d).moveToNext()) {
                list.add(((Cursor)d).getString(0));
            }
            return list;
        }
        finally {
            ((Cursor)d).close();
            d2.release();
        }
    }
    
    @Override
    public List<String> c(String d) {
        final v2 d2 = v2.d("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (d == null) {
            d2.c4(1);
        }
        else {
            d2.K0(1, d);
        }
        this.a.d();
        d = (String)c.d(this.a, d2, false, null);
        try {
            final ArrayList<String> list = new ArrayList<String>(((Cursor)d).getCount());
            while (((Cursor)d).moveToNext()) {
                list.add(((Cursor)d).getString(0));
            }
            return list;
        }
        finally {
            ((Cursor)d).close();
            d2.release();
        }
    }
}
