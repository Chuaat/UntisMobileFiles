// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.model;

import java.util.concurrent.Callable;
import androidx.lifecycle.LiveData;
import java.util.List;
import android.database.Cursor;
import java.util.Iterator;
import java.util.Set;
import androidx.room.util.b;
import android.os.CancellationSignal;
import androidx.room.util.c;
import androidx.room.v2;
import androidx.work.f;
import java.util.ArrayList;
import androidx.collection.a;
import androidx.room.r2;

public final class h implements g
{
    private final r2 a;
    
    public h(final r2 a) {
        this.a = a;
    }
    
    private void c(final a<String, ArrayList<f>> a) {
        final Set<String> keySet = a.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (a.size() > 999) {
            a<String, ArrayList<f>> a2 = new a<String, ArrayList<f>>(999);
            final int size = a.size();
            int i = 0;
            int n = 0;
        Label_0045:
            while (true) {
                n = 0;
                while (i < size) {
                    a2.put(a.i(i), (ArrayList<f>)a.o(i));
                    final int n2 = i + 1;
                    final int n3 = n + 1;
                    i = n2;
                    if ((n = n3) == 999) {
                        this.c(a2);
                        a2 = new a<String, ArrayList<f>>(999);
                        i = n2;
                        continue Label_0045;
                    }
                }
                break;
            }
            if (n > 0) {
                this.c(a2);
            }
            return;
        }
        final StringBuilder c = androidx.room.util.g.c();
        c.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        final int size2 = keySet.size();
        androidx.room.util.g.a(c, size2);
        c.append(")");
        final v2 d = v2.d(c.toString(), size2 + 0);
        final Iterator<String> iterator = keySet.iterator();
        int n4 = 1;
        while (iterator.hasNext()) {
            final String s = iterator.next();
            if (s == null) {
                d.c4(n4);
            }
            else {
                d.K0(n4, s);
            }
            ++n4;
        }
        final Cursor d2 = androidx.room.util.c.d(this.a, d, false, null);
        try {
            final int d3 = b.d(d2, "work_spec_id");
            if (d3 == -1) {
                return;
            }
            while (d2.moveToNext()) {
                if (!d2.isNull(d3)) {
                    final ArrayList<?> list = (ArrayList<?>)a.get(d2.getString(d3));
                    if (list == null) {
                        continue;
                    }
                    list.add(f.g(d2.getBlob(0)));
                }
            }
        }
        finally {
            d2.close();
        }
    }
    
    private void d(final a<String, ArrayList<String>> a) {
        final Set<String> keySet = a.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (a.size() > 999) {
            a<String, ArrayList<String>> a2 = new a<String, ArrayList<String>>(999);
            final int size = a.size();
            int n = 0;
            int n2 = 0;
        Label_0045:
            while (true) {
                n2 = 0;
                int i = n;
                while (i < size) {
                    a2.put(a.i(i), (ArrayList<String>)a.o(i));
                    n = i + 1;
                    final int n3 = n2 + 1;
                    i = n;
                    if ((n2 = n3) == 999) {
                        this.d(a2);
                        a2 = new a<String, ArrayList<String>>(999);
                        continue Label_0045;
                    }
                }
                break;
            }
            if (n2 > 0) {
                this.d(a2);
            }
            return;
        }
        final StringBuilder c = androidx.room.util.g.c();
        c.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        final int size2 = keySet.size();
        androidx.room.util.g.a(c, size2);
        c.append(")");
        final v2 d = v2.d(c.toString(), size2 + 0);
        final Iterator<String> iterator = keySet.iterator();
        int n4 = 1;
        while (iterator.hasNext()) {
            final String s = iterator.next();
            if (s == null) {
                d.c4(n4);
            }
            else {
                d.K0(n4, s);
            }
            ++n4;
        }
        final Cursor d2 = androidx.room.util.c.d(this.a, d, false, null);
        try {
            final int d3 = b.d(d2, "work_spec_id");
            if (d3 == -1) {
                return;
            }
            while (d2.moveToNext()) {
                if (!d2.isNull(d3)) {
                    final ArrayList<?> list = (ArrayList<?>)a.get(d2.getString(d3));
                    if (list == null) {
                        continue;
                    }
                    list.add(d2.getString(0));
                }
            }
        }
        finally {
            d2.close();
        }
    }
    
    @Override
    public List<r.c> a(final androidx.sqlite.db.f f) {
        this.a.d();
        final Cursor d = c.d(this.a, f, true, null);
        try {
            final int d2 = b.d(d, "id");
            final int d3 = b.d(d, "state");
            final int d4 = b.d(d, "output");
            final int d5 = b.d(d, "run_attempt_count");
            final a<Object, ArrayList<String>> a = new a<Object, ArrayList<String>>();
            final a<Object, ArrayList<f>> a2 = new a<Object, ArrayList<f>>();
            while (d.moveToNext()) {
                if (!d.isNull(d2)) {
                    final String string = d.getString(d2);
                    if (a.get(string) == null) {
                        a.put(string, new ArrayList<String>());
                    }
                }
                if (!d.isNull(d2)) {
                    final String string2 = d.getString(d2);
                    if (a2.get(string2) != null) {
                        continue;
                    }
                    a2.put(string2, new ArrayList<f>());
                }
            }
            d.moveToPosition(-1);
            this.d((a<String, ArrayList<String>>)a);
            this.c((a<String, ArrayList<f>>)a2);
            final ArrayList list = new ArrayList<r.c>(d.getCount());
            while (d.moveToNext()) {
                ArrayList<String> list2;
                if (!d.isNull(d2)) {
                    list2 = a.get(d.getString(d2));
                }
                else {
                    list2 = null;
                }
                ArrayList<String> e = list2;
                if (list2 == null) {
                    e = new ArrayList<String>();
                }
                ArrayList<f> list3;
                if (!d.isNull(d2)) {
                    list3 = a2.get(d.getString(d2));
                }
                else {
                    list3 = null;
                }
                ArrayList<f> f2 = list3;
                if (list3 == null) {
                    f2 = new ArrayList<f>();
                }
                final r.c c = new r.c();
                if (d2 != -1) {
                    c.a = d.getString(d2);
                }
                if (d3 != -1) {
                    c.b = x.f(d.getInt(d3));
                }
                if (d4 != -1) {
                    c.c = f.g(d.getBlob(d4));
                }
                if (d5 != -1) {
                    c.d = d.getInt(d5);
                }
                c.e = e;
                c.f = f2;
                list.add(c);
            }
            return (List<r.c>)list;
        }
        finally {
            d.close();
        }
    }
    
    @Override
    public LiveData<List<r.c>> b(final androidx.sqlite.db.f f) {
        return this.a.n().f(new String[] { "WorkTag", "WorkProgress", "WorkSpec" }, false, (Callable<List<r.c>>)new Callable<List<r.c>>() {
            public List<r.c> a() throws Exception {
                final Cursor d = c.d(h.this.a, f, true, null);
                try {
                    final int d2 = b.d(d, "id");
                    final int d3 = b.d(d, "state");
                    final int d4 = b.d(d, "output");
                    final int d5 = b.d(d, "run_attempt_count");
                    final a<Object, ArrayList<String>> a = new a<Object, ArrayList<String>>();
                    final a<Object, ArrayList<f>> a2 = new a<Object, ArrayList<f>>();
                    while (d.moveToNext()) {
                        if (!d.isNull(d2)) {
                            final String string = d.getString(d2);
                            if (a.get(string) == null) {
                                a.put(string, new ArrayList<String>());
                            }
                        }
                        if (!d.isNull(d2)) {
                            final String string2 = d.getString(d2);
                            if (a2.get(string2) != null) {
                                continue;
                            }
                            a2.put(string2, new ArrayList<f>());
                        }
                    }
                    d.moveToPosition(-1);
                    h.this.d(a);
                    h.this.c(a2);
                    final ArrayList list = new ArrayList<r.c>(d.getCount());
                    while (d.moveToNext()) {
                        ArrayList<String> list2;
                        if (!d.isNull(d2)) {
                            list2 = a.get(d.getString(d2));
                        }
                        else {
                            list2 = null;
                        }
                        ArrayList<String> e = list2;
                        if (list2 == null) {
                            e = new ArrayList<String>();
                        }
                        ArrayList<f> list3;
                        if (!d.isNull(d2)) {
                            list3 = a2.get(d.getString(d2));
                        }
                        else {
                            list3 = null;
                        }
                        ArrayList<f> f = list3;
                        if (list3 == null) {
                            f = new ArrayList<f>();
                        }
                        final r.c c = new r.c();
                        if (d2 != -1) {
                            c.a = d.getString(d2);
                        }
                        if (d3 != -1) {
                            c.b = x.f(d.getInt(d3));
                        }
                        if (d4 != -1) {
                            c.c = androidx.work.f.g(d.getBlob(d4));
                        }
                        if (d5 != -1) {
                            c.d = d.getInt(d5);
                        }
                        c.e = e;
                        c.f = f;
                        list.add(c);
                    }
                    return (List<r.c>)list;
                }
                finally {
                    d.close();
                }
            }
        });
    }
}
