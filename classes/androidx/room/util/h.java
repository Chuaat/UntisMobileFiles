// 
// Decompiled by Procyon v0.5.36
// 

package androidx.room.util;

import androidx.annotation.j0;
import android.os.Build$VERSION;
import java.util.Locale;
import androidx.room.i0;
import java.util.Collection;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import android.database.Cursor;
import java.util.HashMap;
import androidx.sqlite.db.c;
import java.util.Collections;
import androidx.annotation.k0;
import java.util.Set;
import java.util.Map;
import androidx.annotation.t0;

@t0({ t0.a.I })
public final class h
{
    public static final int e = 0;
    public static final int f = 1;
    public static final int g = 2;
    public final String a;
    public final Map<String, a> b;
    public final Set<b> c;
    @k0
    public final Set<d> d;
    
    public h(final String s, final Map<String, a> map, final Set<b> set) {
        this(s, map, set, Collections.emptySet());
    }
    
    public h(final String a, final Map<String, a> m, final Set<b> s, final Set<d> s2) {
        this.a = a;
        this.b = Collections.unmodifiableMap((Map<? extends String, ? extends a>)m);
        this.c = Collections.unmodifiableSet((Set<? extends b>)s);
        Set<d> unmodifiableSet;
        if (s2 == null) {
            unmodifiableSet = null;
        }
        else {
            unmodifiableSet = Collections.unmodifiableSet((Set<? extends d>)s2);
        }
        this.d = unmodifiableSet;
    }
    
    public static h a(final androidx.sqlite.db.c c, final String s) {
        return new h(s, b(c, s), d(c, s), f(c, s));
    }
    
    private static Map<String, a> b(androidx.sqlite.db.c w2, String string) {
        final StringBuilder sb = new StringBuilder();
        sb.append("PRAGMA table_info(`");
        sb.append(string);
        sb.append("`)");
        w2 = (androidx.sqlite.db.c)w2.W2(sb.toString());
        final HashMap<String, a> hashMap = new HashMap<String, a>();
        try {
            if (((Cursor)w2).getColumnCount() > 0) {
                final int columnIndex = ((Cursor)w2).getColumnIndex("name");
                final int columnIndex2 = ((Cursor)w2).getColumnIndex("type");
                final int columnIndex3 = ((Cursor)w2).getColumnIndex("notnull");
                final int columnIndex4 = ((Cursor)w2).getColumnIndex("pk");
                final int columnIndex5 = ((Cursor)w2).getColumnIndex("dflt_value");
                while (((Cursor)w2).moveToNext()) {
                    final String string2 = ((Cursor)w2).getString(columnIndex);
                    final String string3 = ((Cursor)w2).getString(columnIndex2);
                    final boolean b = ((Cursor)w2).getInt(columnIndex3) != 0;
                    final int int1 = ((Cursor)w2).getInt(columnIndex4);
                    string = ((Cursor)w2).getString(columnIndex5);
                    hashMap.put(string2, new a(string2, string3, b, int1, string, 2));
                }
            }
            return hashMap;
        }
        finally {
            ((Cursor)w2).close();
        }
    }
    
    private static List<c> c(final Cursor cursor) {
        final int columnIndex = cursor.getColumnIndex("id");
        final int columnIndex2 = cursor.getColumnIndex("seq");
        final int columnIndex3 = cursor.getColumnIndex("from");
        final int columnIndex4 = cursor.getColumnIndex("to");
        final int count = cursor.getCount();
        final ArrayList<Comparable> list = new ArrayList<Comparable>();
        for (int i = 0; i < count; ++i) {
            cursor.moveToPosition(i);
            list.add(new c(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(list);
        return (List<c>)list;
    }
    
    private static Set<b> d(androidx.sqlite.db.c w2, final String str) {
        final HashSet<b> set = new HashSet<b>();
        final StringBuilder sb = new StringBuilder();
        sb.append("PRAGMA foreign_key_list(`");
        sb.append(str);
        sb.append("`)");
        w2 = (androidx.sqlite.db.c)w2.W2(sb.toString());
        try {
            final int columnIndex = ((Cursor)w2).getColumnIndex("id");
            final int columnIndex2 = ((Cursor)w2).getColumnIndex("seq");
            final int columnIndex3 = ((Cursor)w2).getColumnIndex("table");
            final int columnIndex4 = ((Cursor)w2).getColumnIndex("on_delete");
            final int columnIndex5 = ((Cursor)w2).getColumnIndex("on_update");
            final List<c> c = c((Cursor)w2);
            for (int count = ((Cursor)w2).getCount(), i = 0; i < count; ++i) {
                ((Cursor)w2).moveToPosition(i);
                if (((Cursor)w2).getInt(columnIndex2) == 0) {
                    final int int1 = ((Cursor)w2).getInt(columnIndex);
                    final ArrayList<String> list = new ArrayList<String>();
                    final ArrayList<String> list2 = new ArrayList<String>();
                    for (final c c2 : c) {
                        if (c2.G == int1) {
                            list.add(c2.I);
                            list2.add(c2.J);
                        }
                    }
                    set.add(new b(((Cursor)w2).getString(columnIndex3), ((Cursor)w2).getString(columnIndex4), ((Cursor)w2).getString(columnIndex5), list, list2));
                }
            }
            return set;
        }
        finally {
            ((Cursor)w2).close();
        }
    }
    
    @k0
    private static d e(androidx.sqlite.db.c w2, final String str, final boolean b) {
        final StringBuilder sb = new StringBuilder();
        sb.append("PRAGMA index_xinfo(`");
        sb.append(str);
        sb.append("`)");
        w2 = (androidx.sqlite.db.c)w2.W2(sb.toString());
        try {
            final int columnIndex = ((Cursor)w2).getColumnIndex("seqno");
            final int columnIndex2 = ((Cursor)w2).getColumnIndex("cid");
            final int columnIndex3 = ((Cursor)w2).getColumnIndex("name");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                final TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
                while (((Cursor)w2).moveToNext()) {
                    if (((Cursor)w2).getInt(columnIndex2) < 0) {
                        continue;
                    }
                    treeMap.put(((Cursor)w2).getInt(columnIndex), ((Cursor)w2).getString(columnIndex3));
                }
                final ArrayList list = new ArrayList<String>(treeMap.size());
                list.addAll((Collection<?>)treeMap.values());
                return new d(str, b, (List<String>)list);
            }
            return null;
        }
        finally {
            ((Cursor)w2).close();
        }
    }
    
    @k0
    private static Set<d> f(final androidx.sqlite.db.c c, String w2) {
        final StringBuilder sb = new StringBuilder();
        sb.append("PRAGMA index_list(`");
        sb.append(w2);
        sb.append("`)");
        w2 = (String)c.W2(sb.toString());
        try {
            final int columnIndex = ((Cursor)w2).getColumnIndex("name");
            final int columnIndex2 = ((Cursor)w2).getColumnIndex("origin");
            final int columnIndex3 = ((Cursor)w2).getColumnIndex("unique");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                final HashSet<d> set = new HashSet<d>();
                while (((Cursor)w2).moveToNext()) {
                    if (!"c".equals(((Cursor)w2).getString(columnIndex2))) {
                        continue;
                    }
                    final String string = ((Cursor)w2).getString(columnIndex);
                    final int int1 = ((Cursor)w2).getInt(columnIndex3);
                    boolean b = true;
                    if (int1 != 1) {
                        b = false;
                    }
                    final d e = e(c, string, b);
                    if (e == null) {
                        return null;
                    }
                    set.add(e);
                }
                return set;
            }
            return null;
        }
        finally {
            ((Cursor)w2).close();
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof h)) {
            return false;
        }
        final h h = (h)o;
        final String a = this.a;
        Label_0053: {
            if (a != null) {
                if (a.equals(h.a)) {
                    break Label_0053;
                }
            }
            else if (h.a == null) {
                break Label_0053;
            }
            return false;
        }
        final Map<String, a> b = this.b;
        Label_0087: {
            if (b != null) {
                if (b.equals(h.b)) {
                    break Label_0087;
                }
            }
            else if (h.b == null) {
                break Label_0087;
            }
            return false;
        }
        final Set<b> c = this.c;
        Label_0121: {
            if (c != null) {
                if (c.equals(h.c)) {
                    break Label_0121;
                }
            }
            else if (h.c == null) {
                break Label_0121;
            }
            return false;
        }
        final Set<d> d = this.d;
        if (d != null) {
            final Set<d> d2 = h.d;
            if (d2 != null) {
                return d.equals(d2);
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        final String a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a != null) {
            hashCode2 = a.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final Map<String, a> b = this.b;
        int hashCode3;
        if (b != null) {
            hashCode3 = b.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final Set<b> c = this.c;
        if (c != null) {
            hashCode = c.hashCode();
        }
        return (hashCode2 * 31 + hashCode3) * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("TableInfo{name='");
        sb.append(this.a);
        sb.append('\'');
        sb.append(", columns=");
        sb.append(this.b);
        sb.append(", foreignKeys=");
        sb.append(this.c);
        sb.append(", indices=");
        sb.append(this.d);
        sb.append('}');
        return sb.toString();
    }
    
    public static final class a
    {
        public final String a;
        public final String b;
        @i0.b
        public final int c;
        public final boolean d;
        public final int e;
        public final String f;
        private final int g;
        
        @Deprecated
        public a(final String s, final String s2, final boolean b, final int n) {
            this(s, s2, b, n, null, 0);
        }
        
        public a(final String a, final String b, final boolean d, final int e, final String f, final int g) {
            this.a = a;
            this.b = b;
            this.d = d;
            this.e = e;
            this.c = a(b);
            this.f = f;
            this.g = g;
        }
        
        @i0.b
        private static int a(@k0 String upperCase) {
            if (upperCase == null) {
                return 5;
            }
            upperCase = upperCase.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                return 3;
            }
            if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                return 2;
            }
            if (upperCase.contains("BLOB")) {
                return 5;
            }
            if (!upperCase.contains("REAL") && !upperCase.contains("FLOA") && !upperCase.contains("DOUB")) {
                return 1;
            }
            return 4;
        }
        
        public boolean b() {
            return this.e > 0;
        }
        
        @Override
        public boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (!(o instanceof a)) {
                return false;
            }
            final a a = (a)o;
            if (Build$VERSION.SDK_INT >= 20) {
                if (this.e != a.e) {
                    return false;
                }
            }
            else if (this.b() != a.b()) {
                return false;
            }
            if (!this.a.equals(a.a)) {
                return false;
            }
            if (this.d != a.d) {
                return false;
            }
            if (this.g == 1 && a.g == 2) {
                final String f = this.f;
                if (f != null && !f.equals(a.f)) {
                    return false;
                }
            }
            if (this.g == 2 && a.g == 1) {
                final String f2 = a.f;
                if (f2 != null && !f2.equals(this.f)) {
                    return false;
                }
            }
            final int g = this.g;
            Label_0214: {
                if (g != 0 && g == a.g) {
                    final String f3 = this.f;
                    if (f3 != null) {
                        if (f3.equals(a.f)) {
                            break Label_0214;
                        }
                    }
                    else if (a.f == null) {
                        break Label_0214;
                    }
                    return false;
                }
            }
            if (this.c != a.c) {
                b = false;
            }
            return b;
        }
        
        @Override
        public int hashCode() {
            final int hashCode = this.a.hashCode();
            final int c = this.c;
            int n;
            if (this.d) {
                n = 1231;
            }
            else {
                n = 1237;
            }
            return ((hashCode * 31 + c) * 31 + n) * 31 + this.e;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("Column{name='");
            sb.append(this.a);
            sb.append('\'');
            sb.append(", type='");
            sb.append(this.b);
            sb.append('\'');
            sb.append(", affinity='");
            sb.append(this.c);
            sb.append('\'');
            sb.append(", notNull=");
            sb.append(this.d);
            sb.append(", primaryKeyPosition=");
            sb.append(this.e);
            sb.append(", defaultValue='");
            sb.append(this.f);
            sb.append('\'');
            sb.append('}');
            return sb.toString();
        }
    }
    
    @t0({ t0.a.I })
    public static final class b
    {
        @j0
        public final String a;
        @j0
        public final String b;
        @j0
        public final String c;
        @j0
        public final List<String> d;
        @j0
        public final List<String> e;
        
        public b(@j0 final String a, @j0 final String b, @j0 final String c, @j0 final List<String> list, @j0 final List<String> list2) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = Collections.unmodifiableList((List<? extends String>)list);
            this.e = Collections.unmodifiableList((List<? extends String>)list2);
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof b)) {
                return false;
            }
            final b b = (b)o;
            return this.a.equals(b.a) && this.b.equals(b.b) && this.c.equals(b.c) && this.d.equals(b.d) && this.e.equals(b.e);
        }
        
        @Override
        public int hashCode() {
            return (((this.a.hashCode() * 31 + this.b.hashCode()) * 31 + this.c.hashCode()) * 31 + this.d.hashCode()) * 31 + this.e.hashCode();
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("ForeignKey{referenceTable='");
            sb.append(this.a);
            sb.append('\'');
            sb.append(", onDelete='");
            sb.append(this.b);
            sb.append('\'');
            sb.append(", onUpdate='");
            sb.append(this.c);
            sb.append('\'');
            sb.append(", columnNames=");
            sb.append(this.d);
            sb.append(", referenceColumnNames=");
            sb.append(this.e);
            sb.append('}');
            return sb.toString();
        }
    }
    
    @t0({ t0.a.I })
    static class c implements Comparable<c>
    {
        final int G;
        final int H;
        final String I;
        final String J;
        
        c(final int g, final int h, final String i, final String j) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
        }
        
        public int b(@j0 final c c) {
            int n;
            if ((n = this.G - c.G) == 0) {
                n = this.H - c.H;
            }
            return n;
        }
    }
    
    @t0({ t0.a.I })
    public static final class d
    {
        public static final String d = "index_";
        public final String a;
        public final boolean b;
        public final List<String> c;
        
        public d(final String a, final boolean b, final List<String> c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        @Override
        public boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof d)) {
                return false;
            }
            final d d = (d)o;
            if (this.b != d.b) {
                return false;
            }
            if (!this.c.equals(d.c)) {
                return false;
            }
            if (this.a.startsWith("index_")) {
                return d.a.startsWith("index_");
            }
            return this.a.equals(d.a);
        }
        
        @Override
        public int hashCode() {
            int hashCode;
            if (this.a.startsWith("index_")) {
                hashCode = -1184239155;
            }
            else {
                hashCode = this.a.hashCode();
            }
            return (hashCode * 31 + (this.b ? 1 : 0)) * 31 + this.c.hashCode();
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("Index{name='");
            sb.append(this.a);
            sb.append('\'');
            sb.append(", unique=");
            sb.append(this.b);
            sb.append(", columns=");
            sb.append(this.c);
            sb.append('}');
            return sb.toString();
        }
    }
}
