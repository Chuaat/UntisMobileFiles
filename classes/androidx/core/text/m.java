// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.text;

import java.util.Locale;
import java.nio.CharBuffer;

public final class m
{
    public static final l a;
    public static final l b;
    public static final l c;
    public static final l d;
    public static final l e;
    public static final l f;
    private static final int g = 0;
    private static final int h = 1;
    private static final int i = 2;
    
    static {
        a = new e(null, false);
        b = new e(null, true);
        final b a2 = m.b.a;
        c = new e(a2, false);
        d = new e(a2, true);
        e = new e(m.a.b, false);
        f = m.f.b;
    }
    
    private m() {
    }
    
    static int a(final int n) {
        if (n == 0) {
            return 1;
        }
        if (n != 1 && n != 2) {
            return 2;
        }
        return 0;
    }
    
    static int b(final int n) {
        if (n != 0) {
            if (n != 1 && n != 2) {
                switch (n) {
                    default: {
                        return 2;
                    }
                    case 16:
                    case 17: {
                        break;
                    }
                    case 14:
                    case 15: {
                        return 1;
                    }
                }
            }
            return 0;
        }
        return 1;
    }
    
    private static class a implements c
    {
        static final a b;
        private final boolean a;
        
        static {
            b = new a(true);
        }
        
        private a(final boolean a) {
            this.a = a;
        }
        
        @Override
        public int a(final CharSequence charSequence, final int n, final int n2) {
            boolean b = false;
            for (int i = n; i < n2 + n; ++i) {
                final int a = m.a(Character.getDirectionality(charSequence.charAt(i)));
                if (a != 0) {
                    if (a != 1) {
                        continue;
                    }
                    if (!this.a) {
                        return 1;
                    }
                }
                else if (this.a) {
                    return 0;
                }
                b = true;
            }
            if (b) {
                return this.a ? 1 : 0;
            }
            return 2;
        }
    }
    
    private static class b implements c
    {
        static final b a;
        
        static {
            a = new b();
        }
        
        @Override
        public int a(final CharSequence charSequence, final int n, final int n2) {
            int b = 2;
            for (int n3 = n; n3 < n2 + n && b == 2; b = m.b(Character.getDirectionality(charSequence.charAt(n3))), ++n3) {}
            return b;
        }
    }
    
    private interface c
    {
        int a(final CharSequence p0, final int p1, final int p2);
    }
    
    private abstract static class d implements l
    {
        private final c a;
        
        d(final c a) {
            this.a = a;
        }
        
        private boolean d(final CharSequence charSequence, int a, final int n) {
            a = this.a.a(charSequence, a, n);
            return a == 0 || (a != 1 && this.c());
        }
        
        @Override
        public boolean a(final char[] array, final int n, final int n2) {
            return this.b(CharBuffer.wrap(array), n, n2);
        }
        
        @Override
        public boolean b(final CharSequence charSequence, final int n, final int n2) {
            if (charSequence == null || n < 0 || n2 < 0 || charSequence.length() - n2 < n) {
                throw new IllegalArgumentException();
            }
            if (this.a == null) {
                return this.c();
            }
            return this.d(charSequence, n, n2);
        }
        
        protected abstract boolean c();
    }
    
    private static class e extends d
    {
        private final boolean b;
        
        e(final c c, final boolean b) {
            super(c);
            this.b = b;
        }
        
        @Override
        protected boolean c() {
            return this.b;
        }
    }
    
    private static class f extends d
    {
        static final f b;
        
        static {
            b = new f();
        }
        
        f() {
            super(null);
        }
        
        @Override
        protected boolean c() {
            final int b = n.b(Locale.getDefault());
            boolean b2 = true;
            if (b != 1) {
                b2 = false;
            }
            return b2;
        }
    }
}
