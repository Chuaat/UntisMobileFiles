// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.motion.utils;

public class s implements r
{
    private static final float p = 1.0E-5f;
    private float a;
    private float b;
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;
    private float h;
    private float i;
    private int j;
    private String k;
    private boolean l;
    private float m;
    private float n;
    private boolean o;
    
    public s() {
        this.l = false;
        this.o = false;
    }
    
    private float e(float n) {
        this.o = false;
        final float d = this.d;
        if (n <= d) {
            final float a = this.a;
            return a * n + (this.b - a) * n * n / (d * 2.0f);
        }
        final int j = this.j;
        if (j == 1) {
            return this.g;
        }
        final float n2 = n - d;
        n = this.e;
        if (n2 < n) {
            final float g = this.g;
            final float b = this.b;
            return g + b * n2 + (this.c - b) * n2 * n2 / (n * 2.0f);
        }
        if (j == 2) {
            return this.h;
        }
        final float n3 = n2 - n;
        final float f = this.f;
        if (n3 <= f) {
            final float h = this.h;
            n = this.c;
            return h + n * n3 - n * n3 * n3 / (f * 2.0f);
        }
        this.o = true;
        return this.i;
    }
    
    private void g(float n, final float i, float n2, float c, float n3) {
        this.o = false;
        float n4 = n;
        if (n == 0.0f) {
            n4 = 1.0E-4f;
        }
        this.a = n4;
        n = n4 / n2;
        final float n5 = n * n4 / 2.0f;
        if (n4 < 0.0f) {
            n = (float)Math.sqrt((i - -n4 / n2 * n4 / 2.0f) * n2);
            if (n < c) {
                this.k = "backward accelerate, decelerate";
                this.j = 2;
                this.a = n4;
                this.b = n;
                this.c = 0.0f;
                c = (n - n4) / n2;
                this.d = c;
                this.e = n / n2;
                this.g = (n4 + n) * c / 2.0f;
                this.h = i;
                this.i = i;
                return;
            }
            this.k = "backward accelerate cruse decelerate";
            this.j = 3;
            this.a = n4;
            this.b = c;
            this.c = c;
            n3 = (c - n4) / n2;
            this.d = n3;
            n = c / n2;
            this.f = n;
            n2 = (n4 + c) * n3 / 2.0f;
            n = n * c / 2.0f;
            this.e = (i - n2 - n) / c;
            this.g = n2;
            this.h = i - n;
            this.i = i;
        }
        else {
            if (n5 >= i) {
                this.k = "hard stop";
                n = 2.0f * i / n4;
                this.j = 1;
                this.a = n4;
                this.b = 0.0f;
                this.g = i;
                this.d = n;
                return;
            }
            final float g = i - n5;
            final float d = g / n4;
            if (d + n < n3) {
                this.k = "cruse decelerate";
                this.j = 2;
                this.a = n4;
                this.b = n4;
                this.c = 0.0f;
                this.g = g;
                this.h = i;
                this.d = d;
                this.e = n;
                return;
            }
            n = (float)Math.sqrt(n2 * i + n4 * n4 / 2.0f);
            n3 = (n - n4) / n2;
            this.d = n3;
            final float n6 = n / n2;
            this.e = n6;
            if (n < c) {
                this.k = "accelerate decelerate";
                this.j = 2;
                this.a = n4;
                this.b = n;
                this.c = 0.0f;
                this.d = n3;
                this.e = n6;
                this.g = (n4 + n) * n3 / 2.0f;
                this.h = i;
                return;
            }
            this.k = "accelerate cruse decelerate";
            this.j = 3;
            this.a = n4;
            this.b = c;
            this.c = c;
            n3 = (c - n4) / n2;
            this.d = n3;
            n = c / n2;
            this.f = n;
            n2 = (n4 + c) * n3 / 2.0f;
            n = n * c / 2.0f;
            this.e = (i - n2 - n) / c;
            this.g = n2;
            this.h = i - n;
            this.i = i;
        }
    }
    
    @Override
    public float a() {
        float c;
        if (this.l) {
            c = -this.c(this.n);
        }
        else {
            c = this.c(this.n);
        }
        return c;
    }
    
    @Override
    public String b(String s, float f) {
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append(" ===== ");
        sb.append(this.k);
        sb.append("\n");
        final String string = sb.toString();
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(string);
        sb2.append(s);
        String str;
        if (this.l) {
            str = "backwards";
        }
        else {
            str = "forward ";
        }
        sb2.append(str);
        sb2.append(" time = ");
        sb2.append(f);
        sb2.append("  stages ");
        sb2.append(this.j);
        sb2.append("\n");
        final String string2 = sb2.toString();
        final StringBuilder sb3 = new StringBuilder();
        sb3.append(string2);
        sb3.append(s);
        sb3.append(" dur ");
        sb3.append(this.d);
        sb3.append(" vel ");
        sb3.append(this.a);
        sb3.append(" pos ");
        sb3.append(this.g);
        sb3.append("\n");
        String str3;
        final String str2 = str3 = sb3.toString();
        if (this.j > 1) {
            final StringBuilder sb4 = new StringBuilder();
            sb4.append(str2);
            sb4.append(s);
            sb4.append(" dur ");
            sb4.append(this.e);
            sb4.append(" vel ");
            sb4.append(this.b);
            sb4.append(" pos ");
            sb4.append(this.h);
            sb4.append("\n");
            str3 = sb4.toString();
        }
        String string3 = str3;
        if (this.j > 2) {
            final StringBuilder sb5 = new StringBuilder();
            sb5.append(str3);
            sb5.append(s);
            sb5.append(" dur ");
            sb5.append(this.f);
            sb5.append(" vel ");
            sb5.append(this.c);
            sb5.append(" pos ");
            sb5.append(this.i);
            sb5.append("\n");
            string3 = sb5.toString();
        }
        final float d = this.d;
        StringBuilder sb6;
        if (f <= d) {
            sb6 = new StringBuilder();
            sb6.append(string3);
            sb6.append(s);
            s = "stage 0\n";
        }
        else {
            final int j = this.j;
            if (j == 1) {
                sb6 = new StringBuilder();
                sb6.append(string3);
                sb6.append(s);
                s = "end stage 0\n";
            }
            else {
                f -= d;
                final float e = this.e;
                if (f < e) {
                    sb6 = new StringBuilder();
                    sb6.append(string3);
                    sb6.append(s);
                    s = " stage 1\n";
                }
                else if (j == 2) {
                    sb6 = new StringBuilder();
                    sb6.append(string3);
                    sb6.append(s);
                    s = "end stage 1\n";
                }
                else if (f - e < this.f) {
                    sb6 = new StringBuilder();
                    sb6.append(string3);
                    sb6.append(s);
                    s = " stage 2\n";
                }
                else {
                    sb6 = new StringBuilder();
                    sb6.append(string3);
                    sb6.append(s);
                    s = " end stage 2\n";
                }
            }
        }
        sb6.append(s);
        return sb6.toString();
    }
    
    @Override
    public float c(float n) {
        final float d = this.d;
        if (n <= d) {
            final float a = this.a;
            return a + (this.b - a) * n / d;
        }
        final int j = this.j;
        if (j == 1) {
            return 0.0f;
        }
        final float n2 = n - d;
        final float e = this.e;
        if (n2 < e) {
            n = this.b;
            return n + (this.c - n) * n2 / e;
        }
        if (j == 2) {
            return this.h;
        }
        final float n3 = n2 - e;
        final float f = this.f;
        if (n3 < f) {
            n = this.c;
            return n - n3 * n / f;
        }
        return this.i;
    }
    
    @Override
    public boolean d() {
        return this.a() < 1.0E-5f && Math.abs(this.i - this.n) < 1.0E-5f;
    }
    
    public void f(float m, final float n, float n2, final float n3, final float n4, final float n5) {
        boolean l = false;
        this.o = false;
        this.m = m;
        if (m > n) {
            l = true;
        }
        this.l = l;
        if (l) {
            n2 = -n2;
            m -= n;
        }
        else {
            m = n - m;
        }
        this.g(n2, m, n4, n5, n3);
    }
    
    @Override
    public float getInterpolation(float n) {
        final float e = this.e(n);
        this.n = n;
        if (this.l) {
            n = this.m - e;
        }
        else {
            n = this.m + e;
        }
        return n;
    }
}
