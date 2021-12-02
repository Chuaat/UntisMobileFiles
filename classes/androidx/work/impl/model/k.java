// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.model;

import androidx.room.util.b;
import android.database.Cursor;
import java.util.ArrayList;
import android.os.CancellationSignal;
import androidx.sqlite.db.f;
import androidx.room.util.c;
import androidx.room.v2;
import java.util.List;
import androidx.sqlite.db.h;
import androidx.room.a3;
import androidx.room.u0;
import androidx.room.r2;

public final class k implements j
{
    private final r2 a;
    private final u0<i> b;
    private final a3 c;
    
    public k(final r2 a) {
        this.a = a;
        this.b = new u0<i>(a) {
            public void a(final h h, final i i) {
                final String a = i.a;
                if (a == null) {
                    h.c4(1);
                }
                else {
                    h.K0(1, a);
                }
                h.l2(2, i.b);
            }
            
            public String createQuery() {
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
            }
        };
        this.c = new a3(a) {
            public String createQuery() {
                return "DELETE FROM SystemIdInfo where work_spec_id=?";
            }
        };
    }
    
    @Override
    public List<String> a() {
        final v2 d = v2.d("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.a.d();
        final Cursor d2 = androidx.room.util.c.d(this.a, d, false, null);
        try {
            final ArrayList list = new ArrayList<String>(d2.getCount());
            while (d2.moveToNext()) {
                list.add(d2.getString(0));
            }
            return (List<String>)list;
        }
        finally {
            d2.close();
            d.release();
        }
    }
    
    @Override
    public void b(final i i) {
        this.a.d();
        this.a.e();
        try {
            this.b.insert(i);
            this.a.I();
        }
        finally {
            this.a.k();
        }
    }
    
    @Override
    public i c(final String s) {
        final v2 d = v2.d("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (s == null) {
            d.c4(1);
        }
        else {
            d.K0(1, s);
        }
        this.a.d();
        final r2 a = this.a;
        i i = null;
        final Cursor d2 = androidx.room.util.c.d(a, d, false, null);
        try {
            final int e = androidx.room.util.b.e(d2, "work_spec_id");
            final int e2 = androidx.room.util.b.e(d2, "system_id");
            if (d2.moveToFirst()) {
                i = new i(d2.getString(e), d2.getInt(e2));
            }
            return i;
        }
        finally {
            d2.close();
            d.release();
        }
    }
    
    @Override
    public void d(final String s) {
        this.a.d();
        final h acquire = this.c.acquire();
        if (s == null) {
            acquire.c4(1);
        }
        else {
            acquire.K0(1, s);
        }
        this.a.e();
        try {
            acquire.c1();
            this.a.I();
        }
        finally {
            this.a.k();
            this.c.release(acquire);
        }
    }
}
