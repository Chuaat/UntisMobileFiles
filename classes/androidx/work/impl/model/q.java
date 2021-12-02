// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.model;

import java.util.Iterator;
import java.util.ArrayList;
import androidx.room.util.g;
import java.util.List;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.util.c;
import androidx.room.v2;
import androidx.work.f;
import androidx.sqlite.db.h;
import androidx.room.a3;
import androidx.room.u0;
import androidx.room.r2;

public final class q implements p
{
    private final r2 a;
    private final u0<o> b;
    private final a3 c;
    private final a3 d;
    
    public q(final r2 a) {
        this.a = a;
        this.b = new u0<o>(a) {
            public void a(final h h, final o o) {
                final String a = o.a;
                if (a == null) {
                    h.c4(1);
                }
                else {
                    h.K0(1, a);
                }
                final byte[] z = f.z(o.b);
                if (z == null) {
                    h.c4(2);
                }
                else {
                    h.H2(2, z);
                }
            }
            
            public String createQuery() {
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            }
        };
        this.c = new a3(a) {
            public String createQuery() {
                return "DELETE from WorkProgress where work_spec_id=?";
            }
        };
        this.d = new a3(a) {
            public String createQuery() {
                return "DELETE FROM WorkProgress";
            }
        };
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
    
    @Override
    public void e() {
        this.a.d();
        final h acquire = this.d.acquire();
        this.a.e();
        try {
            acquire.c1();
            this.a.I();
        }
        finally {
            this.a.k();
            this.d.release(acquire);
        }
    }
    
    @Override
    public f f(final String s) {
        final v2 d = v2.d("SELECT progress FROM WorkProgress WHERE work_spec_id=?", 1);
        if (s == null) {
            d.c4(1);
        }
        else {
            d.K0(1, s);
        }
        this.a.d();
        final r2 a = this.a;
        f g = null;
        final Cursor d2 = androidx.room.util.c.d(a, d, false, null);
        try {
            if (d2.moveToFirst()) {
                g = f.g(d2.getBlob(0));
            }
            return g;
        }
        finally {
            d2.close();
            d.release();
        }
    }
    
    @Override
    public List<f> g(List<String> d) {
        final StringBuilder c = g.c();
        c.append("SELECT progress FROM WorkProgress WHERE work_spec_id IN (");
        final int size = ((List)d).size();
        g.a(c, size);
        c.append(")");
        final v2 d2 = v2.d(c.toString(), size + 0);
        final Iterator<String> iterator = ((List<String>)d).iterator();
        int n = 1;
        while (iterator.hasNext()) {
            final String s = iterator.next();
            if (s == null) {
                d2.c4(n);
            }
            else {
                d2.K0(n, s);
            }
            ++n;
        }
        this.a.d();
        d = androidx.room.util.c.d(this.a, d2, false, null);
        try {
            final ArrayList list = new ArrayList<f>(d.getCount());
            while (d.moveToNext()) {
                list.add(f.g(d.getBlob(0)));
            }
            return (List<f>)list;
        }
        finally {
            d.close();
            d2.release();
        }
    }
    
    @Override
    public void h(final o o) {
        this.a.d();
        this.a.e();
        try {
            this.b.insert(o);
            this.a.I();
        }
        finally {
            this.a.k();
        }
    }
}
