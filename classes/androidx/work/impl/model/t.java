// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.model;

import java.util.concurrent.Callable;
import androidx.lifecycle.LiveData;
import androidx.work.c0;
import java.util.List;
import android.database.Cursor;
import java.util.Iterator;
import java.util.Set;
import androidx.room.util.b;
import android.os.CancellationSignal;
import androidx.room.v2;
import androidx.room.util.g;
import java.util.ArrayList;
import androidx.collection.a;
import androidx.work.c;
import androidx.work.f;
import androidx.sqlite.db.h;
import androidx.room.a3;
import androidx.room.u0;
import androidx.room.r2;

public final class t implements s
{
    private final r2 a;
    private final u0<r> b;
    private final a3 c;
    private final a3 d;
    private final a3 e;
    private final a3 f;
    private final a3 g;
    private final a3 h;
    private final a3 i;
    private final a3 j;
    
    public t(final r2 a) {
        this.a = a;
        this.b = new u0<r>(a) {
            public void a(final h h, final r r) {
                final String a = r.a;
                if (a == null) {
                    h.c4(1);
                }
                else {
                    h.K0(1, a);
                }
                h.l2(2, x.h(r.b));
                final String c = r.c;
                if (c == null) {
                    h.c4(3);
                }
                else {
                    h.K0(3, c);
                }
                final String d = r.d;
                if (d == null) {
                    h.c4(4);
                }
                else {
                    h.K0(4, d);
                }
                final byte[] z = androidx.work.f.z(r.e);
                if (z == null) {
                    h.c4(5);
                }
                else {
                    h.H2(5, z);
                }
                final byte[] z2 = androidx.work.f.z(r.f);
                if (z2 == null) {
                    h.c4(6);
                }
                else {
                    h.H2(6, z2);
                }
                h.l2(7, r.g);
                h.l2(8, r.h);
                h.l2(9, r.i);
                h.l2(10, r.k);
                h.l2(11, x.a(r.l));
                h.l2(12, r.m);
                h.l2(13, r.n);
                h.l2(14, r.o);
                h.l2(15, r.p);
                h.l2(16, r.q ? 1 : 0);
                final c j = r.j;
                if (j != null) {
                    h.l2(17, x.g(j.b()));
                    h.l2(18, j.g() ? 1 : 0);
                    h.l2(19, j.h() ? 1 : 0);
                    h.l2(20, j.f() ? 1 : 0);
                    h.l2(21, j.i() ? 1 : 0);
                    h.l2(22, j.c());
                    h.l2(23, j.d());
                    final byte[] c2 = x.c(j.a());
                    if (c2 != null) {
                        h.H2(24, c2);
                        return;
                    }
                }
                else {
                    h.c4(17);
                    h.c4(18);
                    h.c4(19);
                    h.c4(20);
                    h.c4(21);
                    h.c4(22);
                    h.c4(23);
                }
                h.c4(24);
            }
            
            public String createQuery() {
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }
        };
        this.c = new a3(a) {
            public String createQuery() {
                return "DELETE FROM workspec WHERE id=?";
            }
        };
        this.d = new a3(a) {
            public String createQuery() {
                return "UPDATE workspec SET output=? WHERE id=?";
            }
        };
        this.e = new a3(a) {
            public String createQuery() {
                return "UPDATE workspec SET period_start_time=? WHERE id=?";
            }
        };
        this.f = new a3(a) {
            public String createQuery() {
                return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
            }
        };
        this.g = new a3(a) {
            public String createQuery() {
                return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
            }
        };
        this.h = new a3(a) {
            public String createQuery() {
                return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
            }
        };
        this.i = new a3(a) {
            public String createQuery() {
                return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
            }
        };
        this.j = new a3(a) {
            public String createQuery() {
                return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
            }
        };
    }
    
    private void H(final a<String, ArrayList<f>> a) {
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
                        this.H(a2);
                        a2 = new a<String, ArrayList<f>>(999);
                        i = n2;
                        continue Label_0045;
                    }
                }
                break;
            }
            if (n > 0) {
                this.H(a2);
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
            final int d3 = androidx.room.util.b.d(d2, "work_spec_id");
            if (d3 == -1) {
                return;
            }
            while (d2.moveToNext()) {
                if (!d2.isNull(d3)) {
                    final ArrayList<?> list = (ArrayList<?>)a.get(d2.getString(d3));
                    if (list == null) {
                        continue;
                    }
                    list.add(androidx.work.f.g(d2.getBlob(0)));
                }
            }
        }
        finally {
            d2.close();
        }
    }
    
    private void I(final a<String, ArrayList<String>> a) {
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
                        this.I(a2);
                        a2 = new a<String, ArrayList<String>>(999);
                        continue Label_0045;
                    }
                }
                break;
            }
            if (n2 > 0) {
                this.I(a2);
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
            final int d3 = androidx.room.util.b.d(d2, "work_spec_id");
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
    public int A(final String s) {
        this.a.d();
        final h acquire = this.f.acquire();
        if (s == null) {
            acquire.c4(1);
        }
        else {
            acquire.K0(1, s);
        }
        this.a.e();
        try {
            final int c1 = acquire.c1();
            this.a.I();
            return c1;
        }
        finally {
            this.a.k();
            this.f.release(acquire);
        }
    }
    
    @Override
    public void B(final String s, final long n) {
        this.a.d();
        final h acquire = this.e.acquire();
        acquire.l2(1, n);
        if (s == null) {
            acquire.c4(2);
        }
        else {
            acquire.K0(2, s);
        }
        this.a.e();
        try {
            acquire.c1();
            this.a.I();
        }
        finally {
            this.a.k();
            this.e.release(acquire);
        }
    }
    
    @Override
    public List<r.c> C(String string) {
        final v2 d = v2.d("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (string == null) {
            d.c4(1);
        }
        else {
            d.K0(1, string);
        }
        this.a.d();
        this.a.e();
        try {
            final Cursor d2 = androidx.room.util.c.d(this.a, d, true, null);
            try {
                final int e = androidx.room.util.b.e(d2, "id");
                final int e2 = androidx.room.util.b.e(d2, "state");
                final int e3 = androidx.room.util.b.e(d2, "output");
                final int e4 = androidx.room.util.b.e(d2, "run_attempt_count");
                final a<Object, ArrayList<String>> a = new a<Object, ArrayList<String>>();
                final a<Object, ArrayList<f>> a2 = new a<Object, ArrayList<f>>();
                while (d2.moveToNext()) {
                    if (!d2.isNull(e)) {
                        string = d2.getString(e);
                        if (a.get(string) == null) {
                            a.put(string, new ArrayList<String>());
                        }
                    }
                    if (!d2.isNull(e)) {
                        final String string2 = d2.getString(e);
                        if (a2.get(string2) != null) {
                            continue;
                        }
                        a2.put(string2, new ArrayList<f>());
                    }
                }
                d2.moveToPosition(-1);
                this.I((a<String, ArrayList<String>>)a);
                this.H((a<String, ArrayList<f>>)a2);
                final ArrayList list = new ArrayList<r.c>(d2.getCount());
                while (d2.moveToNext()) {
                    ArrayList<String> list2;
                    if (!d2.isNull(e)) {
                        list2 = a.get(d2.getString(e));
                    }
                    else {
                        list2 = null;
                    }
                    ArrayList<String> e5 = list2;
                    if (list2 == null) {
                        e5 = new ArrayList<String>();
                    }
                    ArrayList<f> list3;
                    if (!d2.isNull(e)) {
                        list3 = a2.get(d2.getString(e));
                    }
                    else {
                        list3 = null;
                    }
                    ArrayList<f> f = list3;
                    if (list3 == null) {
                        f = new ArrayList<f>();
                    }
                    final r.c c = new r.c();
                    c.a = d2.getString(e);
                    c.b = x.f(d2.getInt(e2));
                    c.c = androidx.work.f.g(d2.getBlob(e3));
                    c.d = d2.getInt(e4);
                    c.e = e5;
                    c.f = f;
                    list.add(c);
                }
                this.a.I();
                return (List<r.c>)list;
            }
            finally {
                d2.close();
                d.release();
            }
        }
        finally {
            this.a.k();
        }
    }
    
    @Override
    public List<r.c> D(final List<String> list) {
        final StringBuilder c = androidx.room.util.g.c();
        c.append("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (");
        final int size = list.size();
        androidx.room.util.g.a(c, size);
        c.append(")");
        final v2 d = v2.d(c.toString(), size + 0);
        final Iterator<String> iterator = list.iterator();
        int n = 1;
        while (iterator.hasNext()) {
            final String s = iterator.next();
            if (s == null) {
                d.c4(n);
            }
            else {
                d.K0(n, s);
            }
            ++n;
        }
        this.a.d();
        this.a.e();
        try {
            final Cursor d2 = androidx.room.util.c.d(this.a, d, true, null);
            try {
                final int e = androidx.room.util.b.e(d2, "id");
                final int e2 = androidx.room.util.b.e(d2, "state");
                final int e3 = androidx.room.util.b.e(d2, "output");
                final int e4 = androidx.room.util.b.e(d2, "run_attempt_count");
                final a<Object, ArrayList<String>> a = new a<Object, ArrayList<String>>();
                final a<Object, ArrayList<f>> a2 = new a<Object, ArrayList<f>>();
                while (d2.moveToNext()) {
                    if (!d2.isNull(e)) {
                        final String string = d2.getString(e);
                        if (a.get(string) == null) {
                            a.put(string, new ArrayList<String>());
                        }
                    }
                    if (!d2.isNull(e)) {
                        final String string2 = d2.getString(e);
                        if (a2.get(string2) != null) {
                            continue;
                        }
                        a2.put(string2, new ArrayList<f>());
                    }
                }
                d2.moveToPosition(-1);
                this.I((a<String, ArrayList<String>>)a);
                this.H((a<String, ArrayList<f>>)a2);
                final ArrayList list2 = new ArrayList<r.c>(d2.getCount());
                while (d2.moveToNext()) {
                    ArrayList<String> list3;
                    if (!d2.isNull(e)) {
                        list3 = a.get(d2.getString(e));
                    }
                    else {
                        list3 = null;
                    }
                    ArrayList<String> e5 = list3;
                    if (list3 == null) {
                        e5 = new ArrayList<String>();
                    }
                    ArrayList<f> list4;
                    if (!d2.isNull(e)) {
                        list4 = a2.get(d2.getString(e));
                    }
                    else {
                        list4 = null;
                    }
                    ArrayList<f> f = list4;
                    if (list4 == null) {
                        f = new ArrayList<f>();
                    }
                    final r.c c2 = new r.c();
                    c2.a = d2.getString(e);
                    c2.b = x.f(d2.getInt(e2));
                    c2.c = androidx.work.f.g(d2.getBlob(e3));
                    c2.d = d2.getInt(e4);
                    c2.e = e5;
                    c2.f = f;
                    list2.add(c2);
                }
                this.a.I();
                return (List<r.c>)list2;
            }
            finally {
                d2.close();
                d.release();
            }
        }
        finally {
            this.a.k();
        }
    }
    
    @Override
    public List<r> E(int e) {
        final v2 d = v2.d("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        d.l2(1, e);
        this.a.d();
        final Cursor d2 = androidx.room.util.c.d(this.a, d, false, null);
        try {
            final int e2 = androidx.room.util.b.e(d2, "required_network_type");
            final int e3 = androidx.room.util.b.e(d2, "requires_charging");
            final int e4 = androidx.room.util.b.e(d2, "requires_device_idle");
            final int e5 = androidx.room.util.b.e(d2, "requires_battery_not_low");
            final int e6 = androidx.room.util.b.e(d2, "requires_storage_not_low");
            final int e7 = androidx.room.util.b.e(d2, "trigger_content_update_delay");
            final int e8 = androidx.room.util.b.e(d2, "trigger_max_content_delay");
            final int e9 = androidx.room.util.b.e(d2, "content_uri_triggers");
            final int e10 = androidx.room.util.b.e(d2, "id");
            final int e11 = androidx.room.util.b.e(d2, "state");
            final int e12 = androidx.room.util.b.e(d2, "worker_class_name");
            final int e13 = androidx.room.util.b.e(d2, "input_merger_class_name");
            final int e14 = androidx.room.util.b.e(d2, "input");
            final int e15 = androidx.room.util.b.e(d2, "output");
            try {
                final int e16 = androidx.room.util.b.e(d2, "initial_delay");
                final int e17 = androidx.room.util.b.e(d2, "interval_duration");
                final int e18 = androidx.room.util.b.e(d2, "flex_duration");
                final int e19 = androidx.room.util.b.e(d2, "run_attempt_count");
                e = androidx.room.util.b.e(d2, "backoff_policy");
                final int e20 = androidx.room.util.b.e(d2, "backoff_delay_duration");
                final int e21 = androidx.room.util.b.e(d2, "period_start_time");
                final int e22 = androidx.room.util.b.e(d2, "minimum_retention_duration");
                final int e23 = androidx.room.util.b.e(d2, "schedule_requested_at");
                final int e24 = androidx.room.util.b.e(d2, "run_in_foreground");
                final ArrayList list = new ArrayList<r>(d2.getCount());
                while (d2.moveToNext()) {
                    final String string = d2.getString(e10);
                    final String string2 = d2.getString(e12);
                    final c j = new c();
                    j.k(x.e(d2.getInt(e2)));
                    j.m(d2.getInt(e3) != 0);
                    j.n(d2.getInt(e4) != 0);
                    j.l(d2.getInt(e5) != 0);
                    j.o(d2.getInt(e6) != 0);
                    j.p(d2.getLong(e7));
                    j.q(d2.getLong(e8));
                    j.j(x.b(d2.getBlob(e9)));
                    final r r = new r(string, string2);
                    r.b = x.f(d2.getInt(e11));
                    r.d = d2.getString(e13);
                    r.e = androidx.work.f.g(d2.getBlob(e14));
                    r.f = androidx.work.f.g(d2.getBlob(e15));
                    r.g = d2.getLong(e16);
                    r.h = d2.getLong(e17);
                    r.i = d2.getLong(e18);
                    r.k = d2.getInt(e19);
                    r.l = x.d(d2.getInt(e));
                    r.m = d2.getLong(e20);
                    r.n = d2.getLong(e21);
                    r.o = d2.getLong(e22);
                    r.p = d2.getLong(e23);
                    r.q = (d2.getInt(e24) != 0);
                    r.j = j;
                    list.add(r);
                }
                d2.close();
                d.release();
                return (List<r>)list;
            }
            finally {}
        }
        finally {}
        d2.close();
        d.release();
    }
    
    @Override
    public List<String> F() {
        final v2 d = v2.d("SELECT id FROM workspec", 0);
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
    public int G() {
        this.a.d();
        final h acquire = this.i.acquire();
        this.a.e();
        try {
            final int c1 = acquire.c1();
            this.a.I();
            return c1;
        }
        finally {
            this.a.k();
            this.i.release(acquire);
        }
    }
    
    @Override
    public int a(final c0.a a, final String... array) {
        this.a.d();
        final StringBuilder c = androidx.room.util.g.c();
        c.append("UPDATE workspec SET state=");
        c.append("?");
        c.append(" WHERE id IN (");
        androidx.room.util.g.a(c, array.length);
        c.append(")");
        final h h = this.a.h(c.toString());
        h.l2(1, x.h(a));
        final int length = array.length;
        int n = 2;
        for (final String s : array) {
            if (s == null) {
                h.c4(n);
            }
            else {
                h.K0(n, s);
            }
            ++n;
        }
        this.a.e();
        try {
            final int c2 = h.c1();
            this.a.I();
            return c2;
        }
        finally {
            this.a.k();
        }
    }
    
    @Override
    public void b() {
        this.a.d();
        final h acquire = this.j.acquire();
        this.a.e();
        try {
            acquire.c1();
            this.a.I();
        }
        finally {
            this.a.k();
            this.j.release(acquire);
        }
    }
    
    @Override
    public int c(final String s, final long n) {
        this.a.d();
        final h acquire = this.h.acquire();
        acquire.l2(1, n);
        if (s == null) {
            acquire.c4(2);
        }
        else {
            acquire.K0(2, s);
        }
        this.a.e();
        try {
            final int c1 = acquire.c1();
            this.a.I();
            return c1;
        }
        finally {
            this.a.k();
            this.h.release(acquire);
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
    
    @Override
    public List<r.b> e(String d) {
        final v2 d2 = v2.d("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (d == null) {
            d2.c4(1);
        }
        else {
            d2.K0(1, d);
        }
        this.a.d();
        d = (String)androidx.room.util.c.d(this.a, d2, false, null);
        try {
            final int e = androidx.room.util.b.e((Cursor)d, "id");
            final int e2 = androidx.room.util.b.e((Cursor)d, "state");
            final ArrayList<r.b> list = new ArrayList<r.b>(((Cursor)d).getCount());
            while (((Cursor)d).moveToNext()) {
                final r.b b = new r.b();
                b.a = ((Cursor)d).getString(e);
                b.b = x.f(((Cursor)d).getInt(e2));
                list.add(b);
            }
            return list;
        }
        finally {
            ((Cursor)d).close();
            d2.release();
        }
    }
    
    @Override
    public List<r> f(final long n) {
        final v2 d = v2.d("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        d.l2(1, n);
        this.a.d();
        final Cursor d2 = androidx.room.util.c.d(this.a, d, false, null);
        try {
            final int e = androidx.room.util.b.e(d2, "required_network_type");
            final int e2 = androidx.room.util.b.e(d2, "requires_charging");
            final int e3 = androidx.room.util.b.e(d2, "requires_device_idle");
            final int e4 = androidx.room.util.b.e(d2, "requires_battery_not_low");
            final int e5 = androidx.room.util.b.e(d2, "requires_storage_not_low");
            final int e6 = androidx.room.util.b.e(d2, "trigger_content_update_delay");
            final int e7 = androidx.room.util.b.e(d2, "trigger_max_content_delay");
            final int e8 = androidx.room.util.b.e(d2, "content_uri_triggers");
            final int e9 = androidx.room.util.b.e(d2, "id");
            final int e10 = androidx.room.util.b.e(d2, "state");
            final int e11 = androidx.room.util.b.e(d2, "worker_class_name");
            final int e12 = androidx.room.util.b.e(d2, "input_merger_class_name");
            final int e13 = androidx.room.util.b.e(d2, "input");
            final int e14 = androidx.room.util.b.e(d2, "output");
            try {
                final int e15 = androidx.room.util.b.e(d2, "initial_delay");
                final int e16 = androidx.room.util.b.e(d2, "interval_duration");
                final int e17 = androidx.room.util.b.e(d2, "flex_duration");
                final int e18 = androidx.room.util.b.e(d2, "run_attempt_count");
                final int e19 = androidx.room.util.b.e(d2, "backoff_policy");
                final int e20 = androidx.room.util.b.e(d2, "backoff_delay_duration");
                final int e21 = androidx.room.util.b.e(d2, "period_start_time");
                final int e22 = androidx.room.util.b.e(d2, "minimum_retention_duration");
                final int e23 = androidx.room.util.b.e(d2, "schedule_requested_at");
                final int e24 = androidx.room.util.b.e(d2, "run_in_foreground");
                final ArrayList list = new ArrayList<r>(d2.getCount());
                while (d2.moveToNext()) {
                    final String string = d2.getString(e9);
                    final String string2 = d2.getString(e11);
                    final c j = new c();
                    j.k(x.e(d2.getInt(e)));
                    j.m(d2.getInt(e2) != 0);
                    j.n(d2.getInt(e3) != 0);
                    j.l(d2.getInt(e4) != 0);
                    j.o(d2.getInt(e5) != 0);
                    j.p(d2.getLong(e6));
                    j.q(d2.getLong(e7));
                    j.j(x.b(d2.getBlob(e8)));
                    final r r = new r(string, string2);
                    r.b = x.f(d2.getInt(e10));
                    r.d = d2.getString(e12);
                    r.e = androidx.work.f.g(d2.getBlob(e13));
                    r.f = androidx.work.f.g(d2.getBlob(e14));
                    r.g = d2.getLong(e15);
                    r.h = d2.getLong(e16);
                    r.i = d2.getLong(e17);
                    r.k = d2.getInt(e18);
                    r.l = x.d(d2.getInt(e19));
                    r.m = d2.getLong(e20);
                    r.n = d2.getLong(e21);
                    r.o = d2.getLong(e22);
                    r.p = d2.getLong(e23);
                    r.q = (d2.getInt(e24) != 0);
                    r.j = j;
                    list.add(r);
                }
                d2.close();
                d.release();
                return (List<r>)list;
            }
            finally {}
        }
        finally {}
        d2.close();
        d.release();
    }
    
    @Override
    public List<r> g(int e) {
        final v2 d = v2.d("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        d.l2(1, e);
        this.a.d();
        final Cursor d2 = androidx.room.util.c.d(this.a, d, false, null);
        try {
            final int e2 = androidx.room.util.b.e(d2, "required_network_type");
            final int e3 = androidx.room.util.b.e(d2, "requires_charging");
            final int e4 = androidx.room.util.b.e(d2, "requires_device_idle");
            final int e5 = androidx.room.util.b.e(d2, "requires_battery_not_low");
            final int e6 = androidx.room.util.b.e(d2, "requires_storage_not_low");
            final int e7 = androidx.room.util.b.e(d2, "trigger_content_update_delay");
            final int e8 = androidx.room.util.b.e(d2, "trigger_max_content_delay");
            final int e9 = androidx.room.util.b.e(d2, "content_uri_triggers");
            final int e10 = androidx.room.util.b.e(d2, "id");
            final int e11 = androidx.room.util.b.e(d2, "state");
            final int e12 = androidx.room.util.b.e(d2, "worker_class_name");
            final int e13 = androidx.room.util.b.e(d2, "input_merger_class_name");
            final int e14 = androidx.room.util.b.e(d2, "input");
            final int e15 = androidx.room.util.b.e(d2, "output");
            try {
                final int e16 = androidx.room.util.b.e(d2, "initial_delay");
                final int e17 = androidx.room.util.b.e(d2, "interval_duration");
                final int e18 = androidx.room.util.b.e(d2, "flex_duration");
                final int e19 = androidx.room.util.b.e(d2, "run_attempt_count");
                e = androidx.room.util.b.e(d2, "backoff_policy");
                final int e20 = androidx.room.util.b.e(d2, "backoff_delay_duration");
                final int e21 = androidx.room.util.b.e(d2, "period_start_time");
                final int e22 = androidx.room.util.b.e(d2, "minimum_retention_duration");
                final int e23 = androidx.room.util.b.e(d2, "schedule_requested_at");
                final int e24 = androidx.room.util.b.e(d2, "run_in_foreground");
                final ArrayList list = new ArrayList<r>(d2.getCount());
                while (d2.moveToNext()) {
                    final String string = d2.getString(e10);
                    final String string2 = d2.getString(e12);
                    final c j = new c();
                    j.k(x.e(d2.getInt(e2)));
                    j.m(d2.getInt(e3) != 0);
                    j.n(d2.getInt(e4) != 0);
                    j.l(d2.getInt(e5) != 0);
                    j.o(d2.getInt(e6) != 0);
                    j.p(d2.getLong(e7));
                    j.q(d2.getLong(e8));
                    j.j(x.b(d2.getBlob(e9)));
                    final r r = new r(string, string2);
                    r.b = x.f(d2.getInt(e11));
                    r.d = d2.getString(e13);
                    r.e = androidx.work.f.g(d2.getBlob(e14));
                    r.f = androidx.work.f.g(d2.getBlob(e15));
                    r.g = d2.getLong(e16);
                    r.h = d2.getLong(e17);
                    r.i = d2.getLong(e18);
                    r.k = d2.getInt(e19);
                    r.l = x.d(d2.getInt(e));
                    r.m = d2.getLong(e20);
                    r.n = d2.getLong(e21);
                    r.o = d2.getLong(e22);
                    r.p = d2.getLong(e23);
                    r.q = (d2.getInt(e24) != 0);
                    r.j = j;
                    list.add(r);
                }
                d2.close();
                d.release();
                return (List<r>)list;
            }
            finally {}
        }
        finally {}
        d2.close();
        d.release();
    }
    
    @Override
    public void h(final r r) {
        this.a.d();
        this.a.e();
        try {
            this.b.insert(r);
            this.a.I();
        }
        finally {
            this.a.k();
        }
    }
    
    @Override
    public List<r> i() {
        final v2 d = v2.d("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.a.d();
        final Cursor d2 = androidx.room.util.c.d(this.a, d, false, null);
        try {
            final int e = androidx.room.util.b.e(d2, "required_network_type");
            final int e2 = androidx.room.util.b.e(d2, "requires_charging");
            final int e3 = androidx.room.util.b.e(d2, "requires_device_idle");
            final int e4 = androidx.room.util.b.e(d2, "requires_battery_not_low");
            final int e5 = androidx.room.util.b.e(d2, "requires_storage_not_low");
            final int e6 = androidx.room.util.b.e(d2, "trigger_content_update_delay");
            final int e7 = androidx.room.util.b.e(d2, "trigger_max_content_delay");
            final int e8 = androidx.room.util.b.e(d2, "content_uri_triggers");
            final int e9 = androidx.room.util.b.e(d2, "id");
            final int e10 = androidx.room.util.b.e(d2, "state");
            final int e11 = androidx.room.util.b.e(d2, "worker_class_name");
            final int e12 = androidx.room.util.b.e(d2, "input_merger_class_name");
            final int e13 = androidx.room.util.b.e(d2, "input");
            final int e14 = androidx.room.util.b.e(d2, "output");
            try {
                final int e15 = androidx.room.util.b.e(d2, "initial_delay");
                final int e16 = androidx.room.util.b.e(d2, "interval_duration");
                final int e17 = androidx.room.util.b.e(d2, "flex_duration");
                final int e18 = androidx.room.util.b.e(d2, "run_attempt_count");
                final int e19 = androidx.room.util.b.e(d2, "backoff_policy");
                final int e20 = androidx.room.util.b.e(d2, "backoff_delay_duration");
                final int e21 = androidx.room.util.b.e(d2, "period_start_time");
                final int e22 = androidx.room.util.b.e(d2, "minimum_retention_duration");
                final int e23 = androidx.room.util.b.e(d2, "schedule_requested_at");
                final int e24 = androidx.room.util.b.e(d2, "run_in_foreground");
                final ArrayList list = new ArrayList<r>(d2.getCount());
                while (d2.moveToNext()) {
                    final String string = d2.getString(e9);
                    final String string2 = d2.getString(e11);
                    final c j = new c();
                    j.k(x.e(d2.getInt(e)));
                    j.m(d2.getInt(e2) != 0);
                    j.n(d2.getInt(e3) != 0);
                    j.l(d2.getInt(e4) != 0);
                    j.o(d2.getInt(e5) != 0);
                    j.p(d2.getLong(e6));
                    j.q(d2.getLong(e7));
                    j.j(x.b(d2.getBlob(e8)));
                    final r r = new r(string, string2);
                    r.b = x.f(d2.getInt(e10));
                    r.d = d2.getString(e12);
                    r.e = androidx.work.f.g(d2.getBlob(e13));
                    r.f = androidx.work.f.g(d2.getBlob(e14));
                    r.g = d2.getLong(e15);
                    r.h = d2.getLong(e16);
                    r.i = d2.getLong(e17);
                    r.k = d2.getInt(e18);
                    r.l = x.d(d2.getInt(e19));
                    r.m = d2.getLong(e20);
                    r.n = d2.getLong(e21);
                    r.o = d2.getLong(e22);
                    r.p = d2.getLong(e23);
                    r.q = (d2.getInt(e24) != 0);
                    r.j = j;
                    list.add(r);
                }
                d2.close();
                d.release();
                return (List<r>)list;
            }
            finally {}
        }
        finally {}
        d2.close();
        d.release();
    }
    
    @Override
    public r[] j(final List<String> list) {
        final StringBuilder c = androidx.room.util.g.c();
        c.append("SELECT ");
        c.append("*");
        c.append(" FROM workspec WHERE id IN (");
        final int size = list.size();
        androidx.room.util.g.a(c, size);
        c.append(")");
        final v2 d = v2.d(c.toString(), size + 0);
        final Iterator<String> iterator = list.iterator();
        int n = 1;
        while (iterator.hasNext()) {
            final String s = iterator.next();
            if (s == null) {
                d.c4(n);
            }
            else {
                d.K0(n, s);
            }
            ++n;
        }
        this.a.d();
        final Cursor d2 = androidx.room.util.c.d(this.a, d, false, null);
        try {
            final int e = androidx.room.util.b.e(d2, "required_network_type");
            final int e2 = androidx.room.util.b.e(d2, "requires_charging");
            final int e3 = androidx.room.util.b.e(d2, "requires_device_idle");
            final int e4 = androidx.room.util.b.e(d2, "requires_battery_not_low");
            final int e5 = androidx.room.util.b.e(d2, "requires_storage_not_low");
            final int e6 = androidx.room.util.b.e(d2, "trigger_content_update_delay");
            final int e7 = androidx.room.util.b.e(d2, "trigger_max_content_delay");
            final int e8 = androidx.room.util.b.e(d2, "content_uri_triggers");
            final int e9 = androidx.room.util.b.e(d2, "id");
            final int e10 = androidx.room.util.b.e(d2, "state");
            final int e11 = androidx.room.util.b.e(d2, "worker_class_name");
            final int e12 = androidx.room.util.b.e(d2, "input_merger_class_name");
            final int e13 = androidx.room.util.b.e(d2, "input");
            final int e14 = androidx.room.util.b.e(d2, "output");
            try {
                final int e15 = androidx.room.util.b.e(d2, "initial_delay");
                final int e16 = androidx.room.util.b.e(d2, "interval_duration");
                final int e17 = androidx.room.util.b.e(d2, "flex_duration");
                final int e18 = androidx.room.util.b.e(d2, "run_attempt_count");
                final int e19 = androidx.room.util.b.e(d2, "backoff_policy");
                final int e20 = androidx.room.util.b.e(d2, "backoff_delay_duration");
                final int e21 = androidx.room.util.b.e(d2, "period_start_time");
                final int e22 = androidx.room.util.b.e(d2, "minimum_retention_duration");
                final int e23 = androidx.room.util.b.e(d2, "schedule_requested_at");
                final int e24 = androidx.room.util.b.e(d2, "run_in_foreground");
                final r[] array = new r[d2.getCount()];
                int n2 = 0;
                while (d2.moveToNext()) {
                    final String string = d2.getString(e9);
                    final String string2 = d2.getString(e11);
                    final c j = new c();
                    j.k(x.e(d2.getInt(e)));
                    j.m(d2.getInt(e2) != 0);
                    j.n(d2.getInt(e3) != 0);
                    j.l(d2.getInt(e4) != 0);
                    j.o(d2.getInt(e5) != 0);
                    j.p(d2.getLong(e6));
                    j.q(d2.getLong(e7));
                    j.j(x.b(d2.getBlob(e8)));
                    final r r = new r(string, string2);
                    r.b = x.f(d2.getInt(e10));
                    r.d = d2.getString(e12);
                    r.e = androidx.work.f.g(d2.getBlob(e13));
                    r.f = androidx.work.f.g(d2.getBlob(e14));
                    r.g = d2.getLong(e15);
                    r.h = d2.getLong(e16);
                    r.i = d2.getLong(e17);
                    r.k = d2.getInt(e18);
                    r.l = x.d(d2.getInt(e19));
                    r.m = d2.getLong(e20);
                    r.n = d2.getLong(e21);
                    r.o = d2.getLong(e22);
                    r.p = d2.getLong(e23);
                    r.q = (d2.getInt(e24) != 0);
                    r.j = j;
                    array[n2] = r;
                    ++n2;
                }
                d2.close();
                d.release();
                return array;
            }
            finally {}
        }
        finally {}
        d2.close();
        d.release();
    }
    
    @Override
    public void k(final String s, final f f) {
        this.a.d();
        final h acquire = this.d.acquire();
        final byte[] z = f.z(f);
        if (z == null) {
            acquire.c4(1);
        }
        else {
            acquire.H2(1, z);
        }
        if (s == null) {
            acquire.c4(2);
        }
        else {
            acquire.K0(2, s);
        }
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
    public LiveData<List<String>> l() {
        return this.a.n().f(new String[] { "workspec" }, true, (Callable<List<String>>)new Callable<List<String>>() {
            final /* synthetic */ v2 G = v2.d("SELECT id FROM workspec", 0);
            
            public List<String> a() throws Exception {
                t.this.a.e();
                try {
                    final Cursor d = androidx.room.util.c.d(t.this.a, this.G, false, null);
                    try {
                        final ArrayList list = new ArrayList<String>(d.getCount());
                        while (d.moveToNext()) {
                            list.add(d.getString(0));
                        }
                        t.this.a.I();
                        return (List<String>)list;
                    }
                    finally {
                        d.close();
                    }
                }
                finally {
                    t.this.a.k();
                }
            }
            
            @Override
            protected void finalize() {
                this.G.release();
            }
        });
    }
    
    @Override
    public LiveData<List<r.c>> m(final String s) {
        final v2 d = v2.d("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (s == null) {
            d.c4(1);
        }
        else {
            d.K0(1, s);
        }
        return this.a.n().f(new String[] { "WorkTag", "WorkProgress", "workspec", "workname" }, true, (Callable<List<r.c>>)new Callable<List<r.c>>() {
            public List<r.c> a() throws Exception {
                t.this.a.e();
                try {
                    final Cursor d = androidx.room.util.c.d(t.this.a, d, true, null);
                    try {
                        final int e = androidx.room.util.b.e(d, "id");
                        final int e2 = androidx.room.util.b.e(d, "state");
                        final int e3 = androidx.room.util.b.e(d, "output");
                        final int e4 = androidx.room.util.b.e(d, "run_attempt_count");
                        final a<Object, ArrayList<String>> a = new a<Object, ArrayList<String>>();
                        final a<Object, ArrayList<f>> a2 = new a<Object, ArrayList<f>>();
                        while (d.moveToNext()) {
                            if (!d.isNull(e)) {
                                final String string = d.getString(e);
                                if (a.get(string) == null) {
                                    a.put(string, new ArrayList<String>());
                                }
                            }
                            if (!d.isNull(e)) {
                                final String string2 = d.getString(e);
                                if (a2.get(string2) != null) {
                                    continue;
                                }
                                a2.put(string2, new ArrayList<f>());
                            }
                        }
                        d.moveToPosition(-1);
                        t.this.I(a);
                        t.this.H(a2);
                        final ArrayList list = new ArrayList<r.c>(d.getCount());
                        while (d.moveToNext()) {
                            ArrayList<String> list2;
                            if (!d.isNull(e)) {
                                list2 = a.get(d.getString(e));
                            }
                            else {
                                list2 = null;
                            }
                            ArrayList<String> e5 = list2;
                            if (list2 == null) {
                                e5 = new ArrayList<String>();
                            }
                            ArrayList<f> list3;
                            if (!d.isNull(e)) {
                                list3 = a2.get(d.getString(e));
                            }
                            else {
                                list3 = null;
                            }
                            ArrayList<f> f = list3;
                            if (list3 == null) {
                                f = new ArrayList<f>();
                            }
                            final r.c c = new r.c();
                            c.a = d.getString(e);
                            c.b = x.f(d.getInt(e2));
                            c.c = androidx.work.f.g(d.getBlob(e3));
                            c.d = d.getInt(e4);
                            c.e = e5;
                            c.f = f;
                            list.add(c);
                        }
                        t.this.a.I();
                        return (List<r.c>)list;
                    }
                    finally {
                        d.close();
                    }
                }
                finally {
                    t.this.a.k();
                }
            }
            
            @Override
            protected void finalize() {
                d.release();
            }
        });
    }
    
    @Override
    public List<r> n() {
        final v2 d = v2.d("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE state=1", 0);
        this.a.d();
        final Cursor d2 = androidx.room.util.c.d(this.a, d, false, null);
        try {
            final int e = androidx.room.util.b.e(d2, "required_network_type");
            final int e2 = androidx.room.util.b.e(d2, "requires_charging");
            final int e3 = androidx.room.util.b.e(d2, "requires_device_idle");
            final int e4 = androidx.room.util.b.e(d2, "requires_battery_not_low");
            final int e5 = androidx.room.util.b.e(d2, "requires_storage_not_low");
            final int e6 = androidx.room.util.b.e(d2, "trigger_content_update_delay");
            final int e7 = androidx.room.util.b.e(d2, "trigger_max_content_delay");
            final int e8 = androidx.room.util.b.e(d2, "content_uri_triggers");
            final int e9 = androidx.room.util.b.e(d2, "id");
            final int e10 = androidx.room.util.b.e(d2, "state");
            final int e11 = androidx.room.util.b.e(d2, "worker_class_name");
            final int e12 = androidx.room.util.b.e(d2, "input_merger_class_name");
            final int e13 = androidx.room.util.b.e(d2, "input");
            final int e14 = androidx.room.util.b.e(d2, "output");
            try {
                final int e15 = androidx.room.util.b.e(d2, "initial_delay");
                final int e16 = androidx.room.util.b.e(d2, "interval_duration");
                final int e17 = androidx.room.util.b.e(d2, "flex_duration");
                final int e18 = androidx.room.util.b.e(d2, "run_attempt_count");
                final int e19 = androidx.room.util.b.e(d2, "backoff_policy");
                final int e20 = androidx.room.util.b.e(d2, "backoff_delay_duration");
                final int e21 = androidx.room.util.b.e(d2, "period_start_time");
                final int e22 = androidx.room.util.b.e(d2, "minimum_retention_duration");
                final int e23 = androidx.room.util.b.e(d2, "schedule_requested_at");
                final int e24 = androidx.room.util.b.e(d2, "run_in_foreground");
                final ArrayList list = new ArrayList<r>(d2.getCount());
                while (d2.moveToNext()) {
                    final String string = d2.getString(e9);
                    final String string2 = d2.getString(e11);
                    final c j = new c();
                    j.k(x.e(d2.getInt(e)));
                    j.m(d2.getInt(e2) != 0);
                    j.n(d2.getInt(e3) != 0);
                    j.l(d2.getInt(e4) != 0);
                    j.o(d2.getInt(e5) != 0);
                    j.p(d2.getLong(e6));
                    j.q(d2.getLong(e7));
                    j.j(x.b(d2.getBlob(e8)));
                    final r r = new r(string, string2);
                    r.b = x.f(d2.getInt(e10));
                    r.d = d2.getString(e12);
                    r.e = androidx.work.f.g(d2.getBlob(e13));
                    r.f = androidx.work.f.g(d2.getBlob(e14));
                    r.g = d2.getLong(e15);
                    r.h = d2.getLong(e16);
                    r.i = d2.getLong(e17);
                    r.k = d2.getInt(e18);
                    r.l = x.d(d2.getInt(e19));
                    r.m = d2.getLong(e20);
                    r.n = d2.getLong(e21);
                    r.o = d2.getLong(e22);
                    r.p = d2.getLong(e23);
                    r.q = (d2.getInt(e24) != 0);
                    r.j = j;
                    list.add(r);
                }
                d2.close();
                d.release();
                return (List<r>)list;
            }
            finally {}
        }
        finally {}
        d2.close();
        d.release();
    }
    
    @Override
    public LiveData<List<r.c>> o(final String s) {
        final v2 d = v2.d("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (s == null) {
            d.c4(1);
        }
        else {
            d.K0(1, s);
        }
        return this.a.n().f(new String[] { "WorkTag", "WorkProgress", "workspec", "worktag" }, true, (Callable<List<r.c>>)new Callable<List<r.c>>() {
            public List<r.c> a() throws Exception {
                t.this.a.e();
                try {
                    final Cursor d = androidx.room.util.c.d(t.this.a, d, true, null);
                    try {
                        final int e = androidx.room.util.b.e(d, "id");
                        final int e2 = androidx.room.util.b.e(d, "state");
                        final int e3 = androidx.room.util.b.e(d, "output");
                        final int e4 = androidx.room.util.b.e(d, "run_attempt_count");
                        final a<Object, ArrayList<String>> a = new a<Object, ArrayList<String>>();
                        final a<Object, ArrayList<f>> a2 = new a<Object, ArrayList<f>>();
                        while (d.moveToNext()) {
                            if (!d.isNull(e)) {
                                final String string = d.getString(e);
                                if (a.get(string) == null) {
                                    a.put(string, new ArrayList<String>());
                                }
                            }
                            if (!d.isNull(e)) {
                                final String string2 = d.getString(e);
                                if (a2.get(string2) != null) {
                                    continue;
                                }
                                a2.put(string2, new ArrayList<f>());
                            }
                        }
                        d.moveToPosition(-1);
                        t.this.I(a);
                        t.this.H(a2);
                        final ArrayList list = new ArrayList<r.c>(d.getCount());
                        while (d.moveToNext()) {
                            ArrayList<String> list2;
                            if (!d.isNull(e)) {
                                list2 = a.get(d.getString(e));
                            }
                            else {
                                list2 = null;
                            }
                            ArrayList<String> e5 = list2;
                            if (list2 == null) {
                                e5 = new ArrayList<String>();
                            }
                            ArrayList<f> list3;
                            if (!d.isNull(e)) {
                                list3 = a2.get(d.getString(e));
                            }
                            else {
                                list3 = null;
                            }
                            ArrayList<f> f = list3;
                            if (list3 == null) {
                                f = new ArrayList<f>();
                            }
                            final r.c c = new r.c();
                            c.a = d.getString(e);
                            c.b = x.f(d.getInt(e2));
                            c.c = androidx.work.f.g(d.getBlob(e3));
                            c.d = d.getInt(e4);
                            c.e = e5;
                            c.f = f;
                            list.add(c);
                        }
                        t.this.a.I();
                        return (List<r.c>)list;
                    }
                    finally {
                        d.close();
                    }
                }
                finally {
                    t.this.a.k();
                }
            }
            
            @Override
            protected void finalize() {
                d.release();
            }
        });
    }
    
    @Override
    public List<String> p() {
        final v2 d = v2.d("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
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
    public List<String> q(String d) {
        final v2 d2 = v2.d("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
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
    public r.c r(final String s) {
        final v2 d = v2.d("SELECT id, state, output, run_attempt_count FROM workspec WHERE id=?", 1);
        if (s == null) {
            d.c4(1);
        }
        else {
            d.K0(1, s);
        }
        this.a.d();
        this.a.e();
        try {
            final r2 a = this.a;
            r.c c = null;
            final ArrayList<f> list = null;
            final Cursor d2 = androidx.room.util.c.d(a, d, true, null);
            try {
                final int e = androidx.room.util.b.e(d2, "id");
                final int e2 = androidx.room.util.b.e(d2, "state");
                final int e3 = androidx.room.util.b.e(d2, "output");
                final int e4 = androidx.room.util.b.e(d2, "run_attempt_count");
                final a<Object, ArrayList<String>> a2 = new a<Object, ArrayList<String>>();
                final a<String, ArrayList<f>> a3 = new a<String, ArrayList<f>>();
                while (d2.moveToNext()) {
                    if (!d2.isNull(e)) {
                        final String string = d2.getString(e);
                        if (a2.get(string) == null) {
                            a2.put(string, new ArrayList<String>());
                        }
                    }
                    if (!d2.isNull(e)) {
                        final String string2 = d2.getString(e);
                        if (a3.get(string2) != null) {
                            continue;
                        }
                        a3.put(string2, new ArrayList<f>());
                    }
                }
                d2.moveToPosition(-1);
                this.I((a<String, ArrayList<String>>)a2);
                this.H(a3);
                if (d2.moveToFirst()) {
                    ArrayList<String> list2;
                    if (!d2.isNull(e)) {
                        list2 = a2.get(d2.getString(e));
                    }
                    else {
                        list2 = null;
                    }
                    ArrayList<String> e5 = list2;
                    if (list2 == null) {
                        e5 = new ArrayList<String>();
                    }
                    ArrayList<f> list3 = list;
                    if (!d2.isNull(e)) {
                        list3 = a3.get(d2.getString(e));
                    }
                    ArrayList<f> f;
                    if ((f = list3) == null) {
                        f = new ArrayList<f>();
                    }
                    c = new r.c();
                    c.a = d2.getString(e);
                    c.b = x.f(d2.getInt(e2));
                    c.c = androidx.work.f.g(d2.getBlob(e3));
                    c.d = d2.getInt(e4);
                    c.e = e5;
                    c.f = f;
                }
                this.a.I();
                return c;
            }
            finally {
                d2.close();
                d.release();
            }
        }
        finally {
            this.a.k();
        }
    }
    
    @Override
    public c0.a s(final String s) {
        final v2 d = v2.d("SELECT state FROM workspec WHERE id=?", 1);
        if (s == null) {
            d.c4(1);
        }
        else {
            d.K0(1, s);
        }
        this.a.d();
        final r2 a = this.a;
        c0.a f = null;
        final Cursor d2 = androidx.room.util.c.d(a, d, false, null);
        try {
            if (d2.moveToFirst()) {
                f = x.f(d2.getInt(0));
            }
            return f;
        }
        finally {
            d2.close();
            d.release();
        }
    }
    
    @Override
    public r t(final String s) {
        final v2 d = v2.d("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground` FROM workspec WHERE id=?", 1);
        if (s == null) {
            d.c4(1);
        }
        else {
            d.K0(1, s);
        }
        this.a.d();
        final Cursor d2 = androidx.room.util.c.d(this.a, d, false, null);
        try {
            final int e = androidx.room.util.b.e(d2, "required_network_type");
            final int e2 = androidx.room.util.b.e(d2, "requires_charging");
            final int e3 = androidx.room.util.b.e(d2, "requires_device_idle");
            final int e4 = androidx.room.util.b.e(d2, "requires_battery_not_low");
            final int e5 = androidx.room.util.b.e(d2, "requires_storage_not_low");
            final int e6 = androidx.room.util.b.e(d2, "trigger_content_update_delay");
            final int e7 = androidx.room.util.b.e(d2, "trigger_max_content_delay");
            final int e8 = androidx.room.util.b.e(d2, "content_uri_triggers");
            final int e9 = androidx.room.util.b.e(d2, "id");
            final int e10 = androidx.room.util.b.e(d2, "state");
            final int e11 = androidx.room.util.b.e(d2, "worker_class_name");
            final int e12 = androidx.room.util.b.e(d2, "input_merger_class_name");
            final int e13 = androidx.room.util.b.e(d2, "input");
            final int e14 = androidx.room.util.b.e(d2, "output");
            try {
                final int e15 = androidx.room.util.b.e(d2, "initial_delay");
                final int e16 = androidx.room.util.b.e(d2, "interval_duration");
                final int e17 = androidx.room.util.b.e(d2, "flex_duration");
                final int e18 = androidx.room.util.b.e(d2, "run_attempt_count");
                final int e19 = androidx.room.util.b.e(d2, "backoff_policy");
                final int e20 = androidx.room.util.b.e(d2, "backoff_delay_duration");
                final int e21 = androidx.room.util.b.e(d2, "period_start_time");
                final int e22 = androidx.room.util.b.e(d2, "minimum_retention_duration");
                final int e23 = androidx.room.util.b.e(d2, "schedule_requested_at");
                final int e24 = androidx.room.util.b.e(d2, "run_in_foreground");
                r r;
                if (d2.moveToFirst()) {
                    final String string = d2.getString(e9);
                    final String string2 = d2.getString(e11);
                    final c j = new c();
                    j.k(x.e(d2.getInt(e)));
                    j.m(d2.getInt(e2) != 0);
                    j.n(d2.getInt(e3) != 0);
                    j.l(d2.getInt(e4) != 0);
                    j.o(d2.getInt(e5) != 0);
                    j.p(d2.getLong(e6));
                    j.q(d2.getLong(e7));
                    j.j(x.b(d2.getBlob(e8)));
                    r = new r(string, string2);
                    r.b = x.f(d2.getInt(e10));
                    r.d = d2.getString(e12);
                    r.e = androidx.work.f.g(d2.getBlob(e13));
                    r.f = androidx.work.f.g(d2.getBlob(e14));
                    r.g = d2.getLong(e15);
                    r.h = d2.getLong(e16);
                    r.i = d2.getLong(e17);
                    r.k = d2.getInt(e18);
                    r.l = x.d(d2.getInt(e19));
                    r.m = d2.getLong(e20);
                    r.n = d2.getLong(e21);
                    r.o = d2.getLong(e22);
                    r.p = d2.getLong(e23);
                    r.q = (d2.getInt(e24) != 0);
                    r.j = j;
                }
                else {
                    r = null;
                }
                d2.close();
                d.release();
                return r;
            }
            finally {}
        }
        finally {}
        d2.close();
        d.release();
    }
    
    @Override
    public int u(final String s) {
        this.a.d();
        final h acquire = this.g.acquire();
        if (s == null) {
            acquire.c4(1);
        }
        else {
            acquire.K0(1, s);
        }
        this.a.e();
        try {
            final int c1 = acquire.c1();
            this.a.I();
            return c1;
        }
        finally {
            this.a.k();
            this.g.release(acquire);
        }
    }
    
    @Override
    public List<r.c> v(String string) {
        final v2 d = v2.d("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (string == null) {
            d.c4(1);
        }
        else {
            d.K0(1, string);
        }
        this.a.d();
        this.a.e();
        try {
            final Cursor d2 = androidx.room.util.c.d(this.a, d, true, null);
            try {
                final int e = androidx.room.util.b.e(d2, "id");
                final int e2 = androidx.room.util.b.e(d2, "state");
                final int e3 = androidx.room.util.b.e(d2, "output");
                final int e4 = androidx.room.util.b.e(d2, "run_attempt_count");
                final a<Object, ArrayList<String>> a = new a<Object, ArrayList<String>>();
                final a<Object, ArrayList<f>> a2 = new a<Object, ArrayList<f>>();
                while (d2.moveToNext()) {
                    if (!d2.isNull(e)) {
                        final String string2 = d2.getString(e);
                        if (a.get(string2) == null) {
                            a.put(string2, new ArrayList<String>());
                        }
                    }
                    if (!d2.isNull(e)) {
                        string = d2.getString(e);
                        if (a2.get(string) != null) {
                            continue;
                        }
                        a2.put(string, new ArrayList<f>());
                    }
                }
                d2.moveToPosition(-1);
                this.I((a<String, ArrayList<String>>)a);
                this.H((a<String, ArrayList<f>>)a2);
                final ArrayList list = new ArrayList<r.c>(d2.getCount());
                while (d2.moveToNext()) {
                    ArrayList<String> list2;
                    if (!d2.isNull(e)) {
                        list2 = a.get(d2.getString(e));
                    }
                    else {
                        list2 = null;
                    }
                    ArrayList<String> e5 = list2;
                    if (list2 == null) {
                        e5 = new ArrayList<String>();
                    }
                    ArrayList<f> list3;
                    if (!d2.isNull(e)) {
                        list3 = a2.get(d2.getString(e));
                    }
                    else {
                        list3 = null;
                    }
                    ArrayList<f> f = list3;
                    if (list3 == null) {
                        f = new ArrayList<f>();
                    }
                    final r.c c = new r.c();
                    c.a = d2.getString(e);
                    c.b = x.f(d2.getInt(e2));
                    c.c = androidx.work.f.g(d2.getBlob(e3));
                    c.d = d2.getInt(e4);
                    c.e = e5;
                    c.f = f;
                    list.add(c);
                }
                this.a.I();
                return (List<r.c>)list;
            }
            finally {
                d2.close();
                d.release();
            }
        }
        finally {
            this.a.k();
        }
    }
    
    @Override
    public LiveData<Long> w(final String s) {
        final v2 d = v2.d("SELECT schedule_requested_at FROM workspec WHERE id=?", 1);
        if (s == null) {
            d.c4(1);
        }
        else {
            d.K0(1, s);
        }
        return this.a.n().f(new String[] { "workspec" }, false, (Callable<Long>)new Callable<Long>() {
            public Long a() throws Exception {
                final r2 j = t.this.a;
                final v2 g = d;
                final Long n = null;
                final Cursor d = androidx.room.util.c.d(j, g, false, null);
                Long value = n;
                try {
                    if (d.moveToFirst()) {
                        if (d.isNull(0)) {
                            value = n;
                        }
                        else {
                            value = d.getLong(0);
                        }
                    }
                    return value;
                }
                finally {
                    d.close();
                }
            }
            
            @Override
            protected void finalize() {
                d.release();
            }
        });
    }
    
    @Override
    public LiveData<List<r.c>> x(final List<String> list) {
        final StringBuilder c = androidx.room.util.g.c();
        c.append("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (");
        final int size = list.size();
        androidx.room.util.g.a(c, size);
        c.append(")");
        final v2 d = v2.d(c.toString(), size + 0);
        final Iterator<String> iterator = list.iterator();
        int n = 1;
        while (iterator.hasNext()) {
            final String s = iterator.next();
            if (s == null) {
                d.c4(n);
            }
            else {
                d.K0(n, s);
            }
            ++n;
        }
        return this.a.n().f(new String[] { "WorkTag", "WorkProgress", "workspec" }, true, (Callable<List<r.c>>)new Callable<List<r.c>>() {
            public List<r.c> a() throws Exception {
                t.this.a.e();
                try {
                    final Cursor d = androidx.room.util.c.d(t.this.a, d, true, null);
                    try {
                        final int e = androidx.room.util.b.e(d, "id");
                        final int e2 = androidx.room.util.b.e(d, "state");
                        final int e3 = androidx.room.util.b.e(d, "output");
                        final int e4 = androidx.room.util.b.e(d, "run_attempt_count");
                        final a<Object, ArrayList<String>> a = new a<Object, ArrayList<String>>();
                        final a<Object, ArrayList<f>> a2 = new a<Object, ArrayList<f>>();
                        while (d.moveToNext()) {
                            if (!d.isNull(e)) {
                                final String string = d.getString(e);
                                if (a.get(string) == null) {
                                    a.put(string, new ArrayList<String>());
                                }
                            }
                            if (!d.isNull(e)) {
                                final String string2 = d.getString(e);
                                if (a2.get(string2) != null) {
                                    continue;
                                }
                                a2.put(string2, new ArrayList<f>());
                            }
                        }
                        d.moveToPosition(-1);
                        t.this.I(a);
                        t.this.H(a2);
                        final ArrayList list = new ArrayList<r.c>(d.getCount());
                        while (d.moveToNext()) {
                            ArrayList<String> list2;
                            if (!d.isNull(e)) {
                                list2 = a.get(d.getString(e));
                            }
                            else {
                                list2 = null;
                            }
                            ArrayList<String> e5 = list2;
                            if (list2 == null) {
                                e5 = new ArrayList<String>();
                            }
                            ArrayList<f> list3;
                            if (!d.isNull(e)) {
                                list3 = a2.get(d.getString(e));
                            }
                            else {
                                list3 = null;
                            }
                            ArrayList<f> f = list3;
                            if (list3 == null) {
                                f = new ArrayList<f>();
                            }
                            final r.c c = new r.c();
                            c.a = d.getString(e);
                            c.b = x.f(d.getInt(e2));
                            c.c = androidx.work.f.g(d.getBlob(e3));
                            c.d = d.getInt(e4);
                            c.e = e5;
                            c.f = f;
                            list.add(c);
                        }
                        t.this.a.I();
                        return (List<r.c>)list;
                    }
                    finally {
                        d.close();
                    }
                }
                finally {
                    t.this.a.k();
                }
            }
            
            @Override
            protected void finalize() {
                d.release();
            }
        });
    }
    
    @Override
    public List<String> y(String d) {
        final v2 d2 = v2.d("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
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
    public List<f> z(String d) {
        final v2 d2 = v2.d("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (d == null) {
            d2.c4(1);
        }
        else {
            d2.K0(1, d);
        }
        this.a.d();
        d = (String)androidx.room.util.c.d(this.a, d2, false, null);
        try {
            final ArrayList<f> list = new ArrayList<f>(((Cursor)d).getCount());
            while (((Cursor)d).moveToNext()) {
                list.add(androidx.work.f.g(((Cursor)d).getBlob(0)));
            }
            return list;
        }
        finally {
            ((Cursor)d).close();
            d2.release();
        }
    }
}
