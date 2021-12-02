// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.name;

public final class e implements Comparable<e>
{
    @org.jetbrains.annotations.e
    private final String G;
    private final boolean H;
    
    private e(@org.jetbrains.annotations.e final String g, final boolean h) {
        if (g == null) {
            b(0);
        }
        this.G = g;
        this.H = h;
    }
    
    private static /* synthetic */ void b(final int n) {
        String format;
        if (n != 1 && n != 2) {
            format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        else {
            format = "@NotNull method %s.%s must not return null";
        }
        int n2;
        if (n != 1 && n != 2) {
            n2 = 3;
        }
        else {
            n2 = 2;
        }
        final Object[] args = new Object[n2];
        if (n != 1 && n != 2) {
            args[0] = "name";
        }
        else {
            args[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        if (n != 1) {
            if (n != 2) {
                args[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
            }
            else {
                args[1] = "getIdentifier";
            }
        }
        else {
            args[1] = "asString";
        }
        while (true) {
            switch (n) {
                default: {
                    args[2] = "<init>";
                }
                case 1:
                case 2: {
                    final String format2 = String.format(format, args);
                    RuntimeException ex;
                    if (n != 1 && n != 2) {
                        ex = new IllegalArgumentException(format2);
                    }
                    else {
                        ex = new IllegalStateException(format2);
                    }
                    throw ex;
                }
                case 6: {
                    args[2] = "guessByFirstCharacter";
                    continue;
                }
                case 5: {
                    args[2] = "special";
                    continue;
                }
                case 4: {
                    args[2] = "isValidIdentifier";
                    continue;
                }
                case 3: {
                    args[2] = "identifier";
                    continue;
                }
            }
            break;
        }
    }
    
    @org.jetbrains.annotations.e
    public static e h(@org.jetbrains.annotations.e final String s) {
        if (s == null) {
            b(6);
        }
        if (s.startsWith("<")) {
            return l(s);
        }
        return i(s);
    }
    
    @org.jetbrains.annotations.e
    public static e i(@org.jetbrains.annotations.e final String s) {
        if (s == null) {
            b(3);
        }
        return new e(s, false);
    }
    
    public static boolean k(@org.jetbrains.annotations.e final String s) {
        if (s == null) {
            b(4);
        }
        if (!s.isEmpty() && !s.startsWith("<")) {
            for (int i = 0; i < s.length(); ++i) {
                final char char1 = s.charAt(i);
                if (char1 == '.' || char1 == '/' || char1 == '\\') {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    @org.jetbrains.annotations.e
    public static e l(@org.jetbrains.annotations.e final String str) {
        if (str == null) {
            b(5);
        }
        if (str.startsWith("<")) {
            return new e(str, true);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("special name must start with '<': ");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }
    
    @org.jetbrains.annotations.e
    public String d() {
        final String g = this.G;
        if (g == null) {
            b(1);
        }
        return g;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof e)) {
            return false;
        }
        final e e = (e)o;
        return this.H == e.H && this.G.equals(e.G);
    }
    
    public int f(final e e) {
        return this.G.compareTo(e.G);
    }
    
    @org.jetbrains.annotations.e
    public String g() {
        if (!this.H) {
            final String d = this.d();
            if (d == null) {
                b(2);
            }
            return d;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("not identifier: ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }
    
    @Override
    public int hashCode() {
        return this.G.hashCode() * 31 + (this.H ? 1 : 0);
    }
    
    public boolean j() {
        return this.H;
    }
    
    @Override
    public String toString() {
        return this.G;
    }
}
