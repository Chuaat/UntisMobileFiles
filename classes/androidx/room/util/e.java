// 
// Decompiled by Procyon v0.5.36
// 

package androidx.room.util;

import android.database.Cursor;
import androidx.sqlite.db.c;
import androidx.annotation.b1;
import java.util.Iterator;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import androidx.annotation.t0;

@t0({ t0.a.I })
public final class e
{
    private static final String[] d;
    public final String a;
    public final Set<String> b;
    public final Set<String> c;
    
    static {
        d = new String[] { "tokenize=", "compress=", "content=", "languageid=", "matchinfo=", "notindexed=", "order=", "prefix=", "uncompress=" };
    }
    
    public e(final String a, final Set<String> b, final String s) {
        this.a = a;
        this.b = b;
        this.c = a(s);
    }
    
    public e(final String a, final Set<String> b, final Set<String> c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @b1
    static Set<String> a(final String s) {
        if (s.isEmpty()) {
            return new HashSet<String>();
        }
        final String substring = s.substring(s.indexOf(40) + 1, s.lastIndexOf(41));
        final ArrayList<String> list = new ArrayList<String>();
        final ArrayDeque<Character> arrayDeque = new ArrayDeque<Character>();
        int n = -1;
        int n2;
        for (int i = 0; i < substring.length(); ++i, n = n2) {
            final char char1 = substring.charAt(i);
            Label_0240: {
                Label_0207: {
                    if (char1 != '\"' && char1 != '\'') {
                        if (char1 != ',') {
                            if (char1 != '[') {
                                if (char1 != ']') {
                                    if (char1 != '`') {
                                        n2 = n;
                                        continue;
                                    }
                                }
                                else {
                                    n2 = n;
                                    if (arrayDeque.isEmpty()) {
                                        continue;
                                    }
                                    n2 = n;
                                    if (arrayDeque.peek() == '[') {
                                        break Label_0240;
                                    }
                                    continue;
                                }
                            }
                            else {
                                n2 = n;
                                if (arrayDeque.isEmpty()) {
                                    break Label_0207;
                                }
                                continue;
                            }
                        }
                        else {
                            n2 = n;
                            if (arrayDeque.isEmpty()) {
                                list.add(substring.substring(n + 1, i).trim());
                                n2 = i;
                            }
                            continue;
                        }
                    }
                    if (!arrayDeque.isEmpty()) {
                        n2 = n;
                        if (arrayDeque.peek() == char1) {
                            break Label_0240;
                        }
                        continue;
                    }
                }
                arrayDeque.push(char1);
                n2 = n;
                continue;
            }
            arrayDeque.pop();
            n2 = n;
        }
        list.add(substring.substring(n + 1).trim());
        final HashSet<String> set = new HashSet<String>();
        for (final String e : list) {
            final String[] d = e.d;
            for (int length = d.length, j = 0; j < length; ++j) {
                if (e.startsWith(d[j])) {
                    set.add(e);
                }
            }
        }
        return set;
    }
    
    public static e b(final c c, final String s) {
        return new e(s, c(c, s), d(c, s));
    }
    
    private static Set<String> c(c w2, final String str) {
        final StringBuilder sb = new StringBuilder();
        sb.append("PRAGMA table_info(`");
        sb.append(str);
        sb.append("`)");
        w2 = (c)w2.W2(sb.toString());
        final HashSet<String> set = new HashSet<String>();
        try {
            if (((Cursor)w2).getColumnCount() > 0) {
                final int columnIndex = ((Cursor)w2).getColumnIndex("name");
                while (((Cursor)w2).moveToNext()) {
                    set.add(((Cursor)w2).getString(columnIndex));
                }
            }
            return set;
        }
        finally {
            ((Cursor)w2).close();
        }
    }
    
    private static Set<String> d(final c c, String w2) {
        final StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM sqlite_master WHERE `name` = '");
        sb.append(w2);
        sb.append("'");
        w2 = (String)c.W2(sb.toString());
        try {
            String string;
            if (((Cursor)w2).moveToFirst()) {
                string = ((Cursor)w2).getString(((Cursor)w2).getColumnIndexOrThrow("sql"));
            }
            else {
                string = "";
            }
            ((Cursor)w2).close();
            return a(string);
        }
        finally {
            ((Cursor)w2).close();
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean equals = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof e)) {
            return false;
        }
        final e e = (e)o;
        final String a = this.a;
        Label_0055: {
            if (a != null) {
                if (a.equals(e.a)) {
                    break Label_0055;
                }
            }
            else if (e.a == null) {
                break Label_0055;
            }
            return false;
        }
        final Set<String> b = this.b;
        Label_0089: {
            if (b != null) {
                if (b.equals(e.b)) {
                    break Label_0089;
                }
            }
            else if (e.b == null) {
                break Label_0089;
            }
            return false;
        }
        final Set<String> c = this.c;
        final Set<String> c2 = e.c;
        if (c != null) {
            equals = c.equals(c2);
        }
        else if (c2 != null) {
            equals = false;
        }
        return equals;
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
        final Set<String> b = this.b;
        int hashCode3;
        if (b != null) {
            hashCode3 = b.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final Set<String> c = this.c;
        if (c != null) {
            hashCode = c.hashCode();
        }
        return (hashCode2 * 31 + hashCode3) * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("FtsTableInfo{name='");
        sb.append(this.a);
        sb.append('\'');
        sb.append(", columns=");
        sb.append(this.b);
        sb.append(", options=");
        sb.append(this.c);
        sb.append('}');
        return sb.toString();
    }
}
