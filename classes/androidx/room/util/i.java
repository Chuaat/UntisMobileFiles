// 
// Decompiled by Procyon v0.5.36
// 

package androidx.room.util;

import android.database.Cursor;
import androidx.sqlite.db.c;
import androidx.annotation.t0;

@t0({ t0.a.I })
public final class i
{
    public final String a;
    public final String b;
    
    public i(final String a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public static i a(c w2, final String str) {
        final StringBuilder sb = new StringBuilder();
        sb.append("SELECT name, sql FROM sqlite_master WHERE type = 'view' AND name = '");
        sb.append(str);
        sb.append("'");
        w2 = (c)w2.W2(sb.toString());
        try {
            if (((Cursor)w2).moveToFirst()) {
                return new i(((Cursor)w2).getString(0), ((Cursor)w2).getString(1));
            }
            return new i(str, null);
        }
        finally {
            ((Cursor)w2).close();
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof i)) {
            return false;
        }
        final i i = (i)o;
        final String a = this.a;
        if (a != null) {
            if (!a.equals(i.a)) {
                return false;
            }
        }
        else if (i.a != null) {
            return false;
        }
        final String b2 = this.b;
        final String b3 = i.b;
        if (b2 != null) {
            if (b2.equals(b3)) {
                return b;
            }
        }
        else if (b3 == null) {
            return b;
        }
        b = false;
        return b;
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
        final String b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ViewInfo{name='");
        sb.append(this.a);
        sb.append('\'');
        sb.append(", sql='");
        sb.append(this.b);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
