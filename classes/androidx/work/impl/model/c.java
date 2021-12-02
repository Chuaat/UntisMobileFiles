// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.model;

import android.database.Cursor;
import java.util.ArrayList;
import android.os.CancellationSignal;
import androidx.sqlite.db.f;
import androidx.room.v2;
import java.util.List;
import androidx.sqlite.db.h;
import androidx.room.u0;
import androidx.room.r2;

public final class c implements b
{
    private final r2 a;
    private final u0<a> b;
    
    public c(final r2 a) {
        this.a = a;
        this.b = new u0<a>(a) {
            public void a(final h h, final a a) {
                final String a2 = a.a;
                if (a2 == null) {
                    h.c4(1);
                }
                else {
                    h.K0(1, a2);
                }
                final String b = a.b;
                if (b == null) {
                    h.c4(2);
                }
                else {
                    h.K0(2, b);
                }
            }
            
            public String createQuery() {
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            }
        };
    }
    
    @Override
    public void a(final a a) {
        this.a.d();
        this.a.e();
        try {
            this.b.insert(a);
            this.a.I();
        }
        finally {
            this.a.k();
        }
    }
    
    @Override
    public List<String> b(String d) {
        final v2 d2 = v2.d("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (d == null) {
            d2.c4(1);
        }
        else {
            d2.K0(1, d);
        }
        this.a.d();
        d = (String)androidx.room.util.c.d(this.a, d2, false, null);
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
    public boolean c(String d) {
        final boolean b = true;
        final v2 d2 = v2.d("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (d == null) {
            d2.c4(1);
        }
        else {
            d2.K0(1, d);
        }
        this.a.d();
        final r2 a = this.a;
        boolean b2 = false;
        d = (String)androidx.room.util.c.d(a, d2, false, null);
        try {
            if (((Cursor)d).moveToFirst()) {
                b2 = (((Cursor)d).getInt(0) != 0 && b);
            }
            return b2;
        }
        finally {
            ((Cursor)d).close();
            d2.release();
        }
    }
    
    @Override
    public boolean d(final String s) {
        final boolean b = true;
        final v2 d = v2.d("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (s == null) {
            d.c4(1);
        }
        else {
            d.K0(1, s);
        }
        this.a.d();
        final r2 a = this.a;
        boolean b2 = false;
        final Cursor d2 = androidx.room.util.c.d(a, d, false, null);
        try {
            if (d2.moveToFirst()) {
                b2 = (d2.getInt(0) != 0 && b);
            }
            return b2;
        }
        finally {
            d2.close();
            d.release();
        }
    }
    
    @Override
    public List<String> e(String d) {
        final v2 d2 = v2.d("SELECT prerequisite_id FROM dependency WHERE work_spec_id=?", 1);
        if (d == null) {
            d2.c4(1);
        }
        else {
            d2.K0(1, d);
        }
        this.a.d();
        d = (String)androidx.room.util.c.d(this.a, d2, false, null);
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
