// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.utils;

import java.util.Iterator;
import java.util.List;
import androidx.sqlite.db.b;
import java.util.UUID;
import java.util.Collection;
import androidx.work.impl.model.x;
import androidx.work.c0;
import java.util.ArrayList;
import androidx.sqlite.db.f;
import androidx.work.e0;
import androidx.annotation.j0;

public final class i
{
    private i() {
    }
    
    private static void a(@j0 final StringBuilder sb, final int n) {
        if (n <= 0) {
            return;
        }
        sb.append("?");
        for (int i = 1; i < n; ++i) {
            sb.append(",");
            sb.append("?");
        }
    }
    
    @j0
    public static f b(@j0 final e0 e0) {
        final ArrayList list = new ArrayList();
        final StringBuilder sb = new StringBuilder("SELECT * FROM workspec");
        final List<c0.a> b = e0.b();
        final boolean empty = b.isEmpty();
        final String s = " AND";
        String str = " WHERE";
        if (!empty) {
            final ArrayList list2 = new ArrayList<Integer>(b.size());
            final Iterator<c0.a> iterator = b.iterator();
            while (iterator.hasNext()) {
                list2.add(Integer.valueOf(x.h(iterator.next())));
            }
            sb.append(" WHERE");
            sb.append(" state IN (");
            a(sb, list2.size());
            sb.append(")");
            list.addAll(list2);
            str = " AND";
        }
        final List<UUID> a = e0.a();
        String str2 = str;
        if (!a.isEmpty()) {
            final ArrayList list3 = new ArrayList<String>(a.size());
            final Iterator<UUID> iterator2 = a.iterator();
            while (iterator2.hasNext()) {
                list3.add(iterator2.next().toString());
            }
            sb.append(str);
            sb.append(" id IN (");
            a(sb, a.size());
            sb.append(")");
            list.addAll(list3);
            str2 = " AND";
        }
        final List<String> c = e0.c();
        String str3;
        if (!c.isEmpty()) {
            sb.append(str2);
            sb.append(" id IN (SELECT work_spec_id FROM worktag WHERE tag IN (");
            a(sb, c.size());
            sb.append("))");
            list.addAll(c);
            str3 = s;
        }
        else {
            str3 = str2;
        }
        final List<String> d = e0.d();
        if (!d.isEmpty()) {
            sb.append(str3);
            sb.append(" id IN (SELECT work_spec_id FROM workname WHERE name IN (");
            a(sb, d.size());
            sb.append("))");
            list.addAll(d);
        }
        sb.append(";");
        return new b(sb.toString(), list.toArray());
    }
}
