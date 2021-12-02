// 
// Decompiled by Procyon v0.5.36
// 

package androidx.sqlite.db;

import java.util.regex.Pattern;

public final class g
{
    private static final Pattern j;
    private boolean a;
    private final String b;
    private String[] c;
    private String d;
    private Object[] e;
    private String f;
    private String g;
    private String h;
    private String i;
    
    static {
        j = Pattern.compile("\\s*\\d+\\s*(,\\s*\\d+\\s*)?");
    }
    
    private g(final String b) {
        this.a = false;
        this.c = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.b = b;
    }
    
    private static void a(final StringBuilder sb, final String str, final String str2) {
        if (!i(str2)) {
            sb.append(str);
            sb.append(str2);
        }
    }
    
    private static void b(final StringBuilder sb, final String[] array) {
        for (int length = array.length, i = 0; i < length; ++i) {
            final String str = array[i];
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(' ');
    }
    
    public static g c(final String s) {
        return new g(s);
    }
    
    private static boolean i(final String s) {
        return s == null || s.length() == 0;
    }
    
    public g d(final String[] c) {
        this.c = c;
        return this;
    }
    
    public f e() {
        if (i(this.f) && !i(this.g)) {
            throw new IllegalArgumentException("HAVING clauses are only permitted when using a groupBy clause");
        }
        final StringBuilder sb = new StringBuilder(120);
        sb.append("SELECT ");
        if (this.a) {
            sb.append("DISTINCT ");
        }
        final String[] c = this.c;
        if (c != null && c.length != 0) {
            b(sb, c);
        }
        else {
            sb.append(" * ");
        }
        sb.append(" FROM ");
        sb.append(this.b);
        a(sb, " WHERE ", this.d);
        a(sb, " GROUP BY ", this.f);
        a(sb, " HAVING ", this.g);
        a(sb, " ORDER BY ", this.h);
        a(sb, " LIMIT ", this.i);
        return new b(sb.toString(), this.e);
    }
    
    public g f() {
        this.a = true;
        return this;
    }
    
    public g g(final String f) {
        this.f = f;
        return this;
    }
    
    public g h(final String g) {
        this.g = g;
        return this;
    }
    
    public g j(final String i) {
        if (!i(i) && !androidx.sqlite.db.g.j.matcher(i).matches()) {
            final StringBuilder sb = new StringBuilder();
            sb.append("invalid LIMIT clauses:");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        this.i = i;
        return this;
    }
    
    public g k(final String h) {
        this.h = h;
        return this;
    }
    
    public g l(final String d, final Object[] e) {
        this.d = d;
        this.e = e;
        return this;
    }
}
