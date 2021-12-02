// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.b;
import java.io.PrintStream;
import java.util.Arrays;
import androidx.constraintlayout.core.motion.a;

public class i
{
    public static class a
    {
        private static final int d = 999;
        int[] a;
        androidx.constraintlayout.core.motion.a[] b;
        int c;
        
        public a() {
            this.a = new int[101];
            this.b = new androidx.constraintlayout.core.motion.a[101];
            this.b();
        }
        
        public void a(final int n, final androidx.constraintlayout.core.motion.a a) {
            if (this.b[n] != null) {
                this.e(n);
            }
            this.b[n] = a;
            final int[] a2 = this.a;
            a2[this.c++] = n;
            Arrays.sort(a2);
        }
        
        public void b() {
            Arrays.fill(this.a, 999);
            Arrays.fill(this.b, null);
            this.c = 0;
        }
        
        public void c() {
            final PrintStream out = System.out;
            final StringBuilder sb = new StringBuilder();
            sb.append("V: ");
            sb.append(Arrays.toString(Arrays.copyOf(this.a, this.c)));
            out.println(sb.toString());
            System.out.print("K: [");
            for (int i = 0; i < this.c; ++i) {
                final PrintStream out2 = System.out;
                final StringBuilder sb2 = new StringBuilder();
                String str;
                if (i == 0) {
                    str = "";
                }
                else {
                    str = ", ";
                }
                sb2.append(str);
                sb2.append(this.g(i));
                out2.print(sb2.toString());
            }
            System.out.println("]");
        }
        
        public int d(final int n) {
            return this.a[n];
        }
        
        public void e(final int n) {
            this.b[n] = null;
            int n2 = 0;
            int n3 = 0;
            int c;
            while (true) {
                c = this.c;
                if (n2 >= c) {
                    break;
                }
                final int[] a = this.a;
                int n4 = n3;
                if (n == a[n2]) {
                    a[n2] = 999;
                    n4 = n3 + 1;
                }
                if (n2 != n4) {
                    a[n2] = a[n4];
                }
                n3 = n4 + 1;
                ++n2;
            }
            this.c = c - 1;
        }
        
        public int f() {
            return this.c;
        }
        
        public androidx.constraintlayout.core.motion.a g(final int n) {
            return this.b[this.a[n]];
        }
    }
    
    public static class b
    {
        private static final int d = 999;
        int[] a;
        androidx.constraintlayout.core.motion.b[] b;
        int c;
        
        public b() {
            this.a = new int[101];
            this.b = new androidx.constraintlayout.core.motion.b[101];
            this.b();
        }
        
        public void a(final int n, final androidx.constraintlayout.core.motion.b b) {
            if (this.b[n] != null) {
                this.e(n);
            }
            this.b[n] = b;
            final int[] a = this.a;
            a[this.c++] = n;
            Arrays.sort(a);
        }
        
        public void b() {
            Arrays.fill(this.a, 999);
            Arrays.fill(this.b, null);
            this.c = 0;
        }
        
        public void c() {
            final PrintStream out = System.out;
            final StringBuilder sb = new StringBuilder();
            sb.append("V: ");
            sb.append(Arrays.toString(Arrays.copyOf(this.a, this.c)));
            out.println(sb.toString());
            System.out.print("K: [");
            for (int i = 0; i < this.c; ++i) {
                final PrintStream out2 = System.out;
                final StringBuilder sb2 = new StringBuilder();
                String str;
                if (i == 0) {
                    str = "";
                }
                else {
                    str = ", ";
                }
                sb2.append(str);
                sb2.append(this.g(i));
                out2.print(sb2.toString());
            }
            System.out.println("]");
        }
        
        public int d(final int n) {
            return this.a[n];
        }
        
        public void e(final int n) {
            this.b[n] = null;
            int n2 = 0;
            int n3 = 0;
            int c;
            while (true) {
                c = this.c;
                if (n2 >= c) {
                    break;
                }
                final int[] a = this.a;
                int n4 = n3;
                if (n == a[n2]) {
                    a[n2] = 999;
                    n4 = n3 + 1;
                }
                if (n2 != n4) {
                    a[n2] = a[n4];
                }
                n3 = n4 + 1;
                ++n2;
            }
            this.c = c - 1;
        }
        
        public int f() {
            return this.c;
        }
        
        public androidx.constraintlayout.core.motion.b g(final int n) {
            return this.b[this.a[n]];
        }
    }
    
    static class c
    {
        private static final int d = 999;
        int[] a;
        float[][] b;
        int c;
        
        public c() {
            this.a = new int[101];
            this.b = new float[101][];
            this.b();
        }
        
        public void a(final int n, final float[] array) {
            if (this.b[n] != null) {
                this.e(n);
            }
            this.b[n] = array;
            final int[] a = this.a;
            a[this.c++] = n;
            Arrays.sort(a);
        }
        
        public void b() {
            Arrays.fill(this.a, 999);
            Arrays.fill(this.b, null);
            this.c = 0;
        }
        
        public void c() {
            final PrintStream out = System.out;
            final StringBuilder sb = new StringBuilder();
            sb.append("V: ");
            sb.append(Arrays.toString(Arrays.copyOf(this.a, this.c)));
            out.println(sb.toString());
            System.out.print("K: [");
            for (int i = 0; i < this.c; ++i) {
                final PrintStream out2 = System.out;
                final StringBuilder sb2 = new StringBuilder();
                String str;
                if (i == 0) {
                    str = "";
                }
                else {
                    str = ", ";
                }
                sb2.append(str);
                sb2.append(Arrays.toString(this.g(i)));
                out2.print(sb2.toString());
            }
            System.out.println("]");
        }
        
        public int d(final int n) {
            return this.a[n];
        }
        
        public void e(final int n) {
            this.b[n] = null;
            int n2 = 0;
            int n3 = 0;
            int c;
            while (true) {
                c = this.c;
                if (n2 >= c) {
                    break;
                }
                final int[] a = this.a;
                int n4 = n3;
                if (n == a[n2]) {
                    a[n2] = 999;
                    n4 = n3 + 1;
                }
                if (n2 != n4) {
                    a[n2] = a[n4];
                }
                n3 = n4 + 1;
                ++n2;
            }
            this.c = c - 1;
        }
        
        public int f() {
            return this.c;
        }
        
        public float[] g(final int n) {
            return this.b[this.a[n]];
        }
    }
}
