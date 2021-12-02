// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.motion;

public class b
{
    private static final String g = "TransitionLayout";
    String a;
    private int b;
    private int c;
    private float d;
    private String e;
    boolean f;
    
    public b(final b b) {
        this.c = Integer.MIN_VALUE;
        this.d = Float.NaN;
        this.e = null;
        this.a = b.a;
        this.b = b.b;
        this.c = b.c;
        this.d = b.d;
        this.e = b.e;
        this.f = b.f;
    }
    
    public b(final b b, final Object o) {
        this.c = Integer.MIN_VALUE;
        this.d = Float.NaN;
        this.e = null;
        this.a = b.a;
        this.b = b.b;
        this.y(o);
    }
    
    public b(final String a, final int b) {
        this.c = Integer.MIN_VALUE;
        this.d = Float.NaN;
        this.e = null;
        this.a = a;
        this.b = b;
    }
    
    public b(final String a, final int b, final float d) {
        this.c = Integer.MIN_VALUE;
        this.d = Float.NaN;
        this.e = null;
        this.a = a;
        this.b = b;
        this.d = d;
    }
    
    public b(final String a, final int b, final int c) {
        this.c = Integer.MIN_VALUE;
        this.d = Float.NaN;
        this.e = null;
        this.a = a;
        this.b = b;
        if (b == 901) {
            this.d = (float)c;
        }
        else {
            this.c = c;
        }
    }
    
    public b(final String a, final int b, final Object o) {
        this.c = Integer.MIN_VALUE;
        this.d = Float.NaN;
        this.e = null;
        this.a = a;
        this.b = b;
        this.y(o);
    }
    
    public b(final String a, final int b, final String e) {
        this.c = Integer.MIN_VALUE;
        this.d = Float.NaN;
        this.e = null;
        this.a = a;
        this.b = b;
        this.e = e;
    }
    
    public b(final String a, final int b, final boolean f) {
        this.c = Integer.MIN_VALUE;
        this.d = Float.NaN;
        this.e = null;
        this.a = a;
        this.b = b;
        this.f = f;
    }
    
    private static int b(int n) {
        n = (n & ~(n >> 31)) - 255;
        return (n & n >> 31) + 255;
    }
    
    public static String c(final int i) {
        final StringBuilder sb = new StringBuilder();
        sb.append("00000000");
        sb.append(Integer.toHexString(i));
        final String string = sb.toString();
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("#");
        sb2.append(string.substring(string.length() - 8));
        return sb2.toString();
    }
    
    public static int p(float n, final float n2, float n3) {
        n *= 6.0f;
        final int n4 = (int)n;
        n -= n4;
        n3 *= 255.0f;
        final int n5 = (int)((1.0f - n2) * n3 + 0.5f);
        final int n6 = (int)((1.0f - n * n2) * n3 + 0.5f);
        final int n7 = (int)((1.0f - (1.0f - n) * n2) * n3 + 0.5f);
        final int n8 = (int)(n3 + 0.5f);
        if (n4 == 0) {
            return (n8 << 16) + (n7 << 8) + n5 | 0xFF000000;
        }
        if (n4 == 1) {
            return (n6 << 16) + (n8 << 8) + n5 | 0xFF000000;
        }
        if (n4 == 2) {
            return (n5 << 16) + (n8 << 8) + n7 | 0xFF000000;
        }
        if (n4 == 3) {
            return (n5 << 16) + (n6 << 8) + n8 | 0xFF000000;
        }
        if (n4 == 4) {
            return (n7 << 16) + (n5 << 8) + n8 | 0xFF000000;
        }
        if (n4 != 5) {
            return 0;
        }
        return (n8 << 16) + (n5 << 8) + n6 | 0xFF000000;
    }
    
    public static int s(final float n, final float n2, final float n3, final float n4) {
        return b((int)(n * 255.0f)) << 16 | b((int)(n4 * 255.0f)) << 24 | b((int)(n2 * 255.0f)) << 8 | b((int)(n3 * 255.0f));
    }
    
    public void a(final f f) {
        final int b = this.b;
        switch (b) {
            case 904: {
                f.L(this.a, b, this.f);
                break;
            }
            case 903: {
                f.K(this.a, b, this.e);
                break;
            }
            case 901:
            case 905: {
                f.I(this.a, b, this.d);
                break;
            }
            case 900:
            case 902:
            case 906: {
                f.J(this.a, b, this.c);
                break;
            }
        }
    }
    
    public b d() {
        return new b(this);
    }
    
    public boolean e(final b b) {
        final boolean b2 = false;
        final boolean b3 = false;
        final boolean b4 = false;
        final boolean b5 = false;
        final boolean b6 = false;
        final boolean b7 = false;
        boolean b8 = b6;
        if (b != null) {
            final int b9 = this.b;
            if (b9 != b.b) {
                b8 = b6;
            }
            else {
                switch (b9) {
                    default: {
                        return false;
                    }
                    case 905: {
                        boolean b10 = b7;
                        if (this.d == b.d) {
                            b10 = true;
                        }
                        return b10;
                    }
                    case 904: {
                        boolean b11 = b2;
                        if (this.f == b.f) {
                            b11 = true;
                        }
                        return b11;
                    }
                    case 903: {
                        boolean b12 = b3;
                        if (this.c == b.c) {
                            b12 = true;
                        }
                        return b12;
                    }
                    case 902: {
                        boolean b13 = b4;
                        if (this.c == b.c) {
                            b13 = true;
                        }
                        return b13;
                    }
                    case 901: {
                        boolean b14 = b5;
                        if (this.d == b.d) {
                            b14 = true;
                        }
                        return b14;
                    }
                    case 900:
                    case 906: {
                        b8 = b6;
                        if (this.c == b.c) {
                            b8 = true;
                            break;
                        }
                        break;
                    }
                }
            }
        }
        return b8;
    }
    
    public boolean f() {
        return this.f;
    }
    
    public int g() {
        return this.c;
    }
    
    public float h() {
        return this.d;
    }
    
    public int i() {
        return this.c;
    }
    
    public int j(final float[] array) {
        return b((int)(array[3] * 255.0f)) << 24 | b((int)((float)Math.pow(array[0], 0.45454545454545453) * 255.0f)) << 16 | b((int)((float)Math.pow(array[1], 0.45454545454545453) * 255.0f)) << 8 | b((int)((float)Math.pow(array[2], 0.45454545454545453) * 255.0f));
    }
    
    public String k() {
        return this.a;
    }
    
    public String l() {
        return this.e;
    }
    
    public int m() {
        return this.b;
    }
    
    public float n() {
        switch (this.b) {
            default: {
                return Float.NaN;
            }
            case 905: {
                return this.d;
            }
            case 904: {
                float n;
                if (this.f) {
                    n = 1.0f;
                }
                else {
                    n = 0.0f;
                }
                return n;
            }
            case 903: {
                throw new RuntimeException("Cannot interpolate String");
            }
            case 902: {
                throw new RuntimeException("Color does not have a single color to interpolate");
            }
            case 901: {
                return this.d;
            }
            case 900: {
                return (float)this.c;
            }
        }
    }
    
    public void o(final float[] array) {
        switch (this.b) {
            case 905: {
                array[0] = this.d;
                break;
            }
            case 904: {
                float n;
                if (this.f) {
                    n = 1.0f;
                }
                else {
                    n = 0.0f;
                }
                array[0] = n;
                break;
            }
            case 903: {
                throw new RuntimeException("Color does not have a single color to interpolate");
            }
            case 902: {
                final int c = this.c;
                final float n2 = (float)Math.pow((c >> 16 & 0xFF) / 255.0f, 2.2);
                final float n3 = (float)Math.pow((c >> 8 & 0xFF) / 255.0f, 2.2);
                final float n4 = (float)Math.pow((c & 0xFF) / 255.0f, 2.2);
                array[0] = n2;
                array[1] = n3;
                array[2] = n4;
                array[3] = (c >> 24 & 0xFF) / 255.0f;
                break;
            }
            case 901: {
                array[0] = this.d;
                break;
            }
            case 900: {
                array[0] = (float)this.c;
                break;
            }
        }
    }
    
    public boolean q() {
        final int b = this.b;
        return b != 903 && b != 904 && b != 906;
    }
    
    public int r() {
        if (this.b != 902) {
            return 1;
        }
        return 4;
    }
    
    public void t(final boolean f) {
        this.f = f;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(':');
        final String string = sb.toString();
        StringBuilder sb2 = null;
        Label_0108: {
            String str = null;
            switch (this.b) {
                default: {
                    sb2 = new StringBuilder();
                    sb2.append(string);
                    str = "????";
                    break;
                }
                case 905: {
                    sb2 = new StringBuilder();
                    break Label_0108;
                }
                case 904: {
                    sb2 = new StringBuilder();
                    sb2.append(string);
                    sb2.append((Object)this.f);
                    return sb2.toString();
                }
                case 903: {
                    sb2 = new StringBuilder();
                    sb2.append(string);
                    str = this.e;
                    break;
                }
                case 902: {
                    sb2 = new StringBuilder();
                    sb2.append(string);
                    str = c(this.c);
                    break;
                }
                case 901: {
                    sb2 = new StringBuilder();
                    break Label_0108;
                }
                case 900: {
                    sb2 = new StringBuilder();
                    sb2.append(string);
                    sb2.append(this.c);
                    return sb2.toString();
                }
            }
            sb2.append(str);
            return sb2.toString();
        }
        sb2.append(string);
        sb2.append(this.d);
        return sb2.toString();
    }
    
    public void u(final float d) {
        this.d = d;
    }
    
    public void v(final int c) {
        this.c = c;
    }
    
    public void w(final f f, final float[] array) {
        final int b = this.b;
        boolean b2 = true;
        switch (b) {
            case 904: {
                final String a = this.a;
                if (array[0] <= 0.5f) {
                    b2 = false;
                }
                f.L(a, b, b2);
                break;
            }
            case 903:
            case 906: {
                final StringBuilder sb = new StringBuilder();
                sb.append("unable to interpolate ");
                sb.append(this.a);
                throw new RuntimeException(sb.toString());
            }
            case 902: {
                f.J(this.a, this.b, b((int)(array[3] * 255.0f)) << 24 | b((int)((float)Math.pow(array[0], 0.45454545454545453) * 255.0f)) << 16 | b((int)((float)Math.pow(array[1], 0.45454545454545453) * 255.0f)) << 8 | b((int)((float)Math.pow(array[2], 0.45454545454545453) * 255.0f)));
                break;
            }
            case 901:
            case 905: {
                f.I(this.a, b, array[0]);
                break;
            }
            case 900: {
                f.J(this.a, b, (int)array[0]);
                break;
            }
        }
    }
    
    public void x(final String e) {
        this.e = e;
    }
    
    public void y(final Object o) {
        switch (this.b) {
            case 904: {
                this.f = (boolean)o;
                break;
            }
            case 903: {
                this.e = (String)o;
                break;
            }
            case 901:
            case 905: {
                this.d = (float)o;
                break;
            }
            case 900:
            case 902:
            case 906: {
                this.c = (int)o;
                break;
            }
        }
    }
    
    public void z(final float[] array) {
        final int b = this.b;
        boolean f = true;
        int c = 0;
        switch (b) {
            default: {
                return;
            }
            case 904: {
                if (array[0] <= 0.5) {
                    f = false;
                }
                this.f = f;
                return;
            }
            case 903: {
                throw new RuntimeException("Color does not have a single color to interpolate");
            }
            case 902: {
                final int p = p(array[0], array[1], array[2]);
                this.c = p;
                c = (b((int)(array[3] * 255.0f)) << 24 | (p & 0xFFFFFF));
                break;
            }
            case 901:
            case 905: {
                this.d = array[0];
                return;
            }
            case 900:
            case 906: {
                c = (int)array[0];
                break;
            }
        }
        this.c = c;
    }
}
