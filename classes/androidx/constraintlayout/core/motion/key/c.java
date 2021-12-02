// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.motion.key;

import java.util.HashSet;
import androidx.constraintlayout.core.motion.utils.v;
import java.io.PrintStream;
import java.util.Iterator;
import androidx.constraintlayout.core.motion.utils.o;
import java.util.HashMap;

public class c extends b
{
    static final String P = "KeyAttribute";
    private static final String Q = "KeyAttributes";
    private static final boolean R = false;
    public static final int S = 1;
    private int A;
    private float B;
    private float C;
    private float D;
    private float E;
    private float F;
    private float G;
    private float H;
    private float I;
    private float J;
    private float K;
    private float L;
    private float M;
    private float N;
    private float O;
    private String y;
    private int z;
    
    public c() {
        this.z = -1;
        this.A = 0;
        this.B = Float.NaN;
        this.C = Float.NaN;
        this.D = Float.NaN;
        this.E = Float.NaN;
        this.F = Float.NaN;
        this.G = Float.NaN;
        this.H = Float.NaN;
        this.I = Float.NaN;
        this.J = Float.NaN;
        this.K = Float.NaN;
        this.L = Float.NaN;
        this.M = Float.NaN;
        this.N = Float.NaN;
        this.O = Float.NaN;
        super.k = 1;
        super.l = new HashMap<String, androidx.constraintlayout.core.motion.b>();
    }
    
    private float w(final int n) {
        if (n == 100) {
            return (float)super.h;
        }
        switch (n) {
            default: {
                return Float.NaN;
            }
            case 316: {
                return this.I;
            }
            case 315: {
                return this.O;
            }
            case 314: {
                return this.H;
            }
            case 313: {
                return this.G;
            }
            case 312: {
                return this.K;
            }
            case 311: {
                return this.J;
            }
            case 310: {
                return this.D;
            }
            case 309: {
                return this.F;
            }
            case 308: {
                return this.E;
            }
            case 307: {
                return this.C;
            }
            case 306: {
                return this.N;
            }
            case 305: {
                return this.M;
            }
            case 304: {
                return this.L;
            }
            case 303: {
                return this.B;
            }
        }
    }
    
    @Override
    public void a(final HashMap<String, o> hashMap) {
        for (final String s : hashMap.keySet()) {
            final o o = hashMap.get(s);
            if (o == null) {
                continue;
            }
            final boolean startsWith = s.startsWith("CUSTOM");
            int n = 7;
            if (startsWith) {
                final androidx.constraintlayout.core.motion.b b = super.l.get(s.substring(7));
                if (b == null) {
                    continue;
                }
                ((o.c)o).k(super.h, b);
            }
            else {
                Label_0484: {
                    switch (s) {
                        case "pathRotate": {
                            n = 13;
                            break Label_0484;
                        }
                        case "alpha": {
                            n = 12;
                            break Label_0484;
                        }
                        case "elevation": {
                            n = 11;
                            break Label_0484;
                        }
                        case "scaleY": {
                            n = 10;
                            break Label_0484;
                        }
                        case "scaleX": {
                            n = 9;
                            break Label_0484;
                        }
                        case "pivotY": {
                            n = 8;
                            break Label_0484;
                        }
                        case "pivotX": {
                            break Label_0484;
                        }
                        case "progress": {
                            n = 6;
                            break Label_0484;
                        }
                        case "translationZ": {
                            n = 5;
                            break Label_0484;
                        }
                        case "translationY": {
                            n = 4;
                            break Label_0484;
                        }
                        case "translationX": {
                            n = 3;
                            break Label_0484;
                        }
                        case "rotationZ": {
                            n = 2;
                            break Label_0484;
                        }
                        case "rotationY": {
                            n = 1;
                            break Label_0484;
                        }
                        case "rotationX": {
                            n = 0;
                            break Label_0484;
                        }
                        default:
                            break;
                    }
                    n = -1;
                }
                int n2 = 0;
                float n3 = 0.0f;
                switch (n) {
                    default: {
                        final PrintStream err = System.err;
                        final StringBuilder sb = new StringBuilder();
                        sb.append("not supported by KeyAttributes ");
                        sb.append(s);
                        err.println(sb.toString());
                        continue;
                    }
                    case 13: {
                        if (!Float.isNaN(this.I)) {
                            n2 = super.h;
                            n3 = this.I;
                            break;
                        }
                        continue;
                    }
                    case 12: {
                        if (!Float.isNaN(this.B)) {
                            n2 = super.h;
                            n3 = this.B;
                            break;
                        }
                        continue;
                    }
                    case 11: {
                        if (!Float.isNaN(this.C)) {
                            n2 = super.h;
                            n3 = this.C;
                            break;
                        }
                        continue;
                    }
                    case 10: {
                        if (!Float.isNaN(this.K)) {
                            n2 = super.h;
                            n3 = this.K;
                            break;
                        }
                        continue;
                    }
                    case 9: {
                        if (!Float.isNaN(this.J)) {
                            n2 = super.h;
                            n3 = this.J;
                            break;
                        }
                        continue;
                    }
                    case 8: {
                        if (!Float.isNaN(this.F)) {
                            n2 = super.h;
                            n3 = this.H;
                            break;
                        }
                        continue;
                    }
                    case 7: {
                        if (!Float.isNaN(this.E)) {
                            n2 = super.h;
                            n3 = this.G;
                            break;
                        }
                        continue;
                    }
                    case 6: {
                        if (!Float.isNaN(this.O)) {
                            n2 = super.h;
                            n3 = this.O;
                            break;
                        }
                        continue;
                    }
                    case 5: {
                        if (!Float.isNaN(this.N)) {
                            n2 = super.h;
                            n3 = this.N;
                            break;
                        }
                        continue;
                    }
                    case 4: {
                        if (!Float.isNaN(this.M)) {
                            n2 = super.h;
                            n3 = this.M;
                            break;
                        }
                        continue;
                    }
                    case 3: {
                        if (!Float.isNaN(this.L)) {
                            n2 = super.h;
                            n3 = this.L;
                            break;
                        }
                        continue;
                    }
                    case 2: {
                        if (!Float.isNaN(this.D)) {
                            n2 = super.h;
                            n3 = this.D;
                            break;
                        }
                        continue;
                    }
                    case 1: {
                        if (!Float.isNaN(this.F)) {
                            n2 = super.h;
                            n3 = this.F;
                            break;
                        }
                        continue;
                    }
                    case 0: {
                        if (!Float.isNaN(this.E)) {
                            n2 = super.h;
                            n3 = this.E;
                            break;
                        }
                        continue;
                    }
                }
                o.g(n2, n3);
            }
        }
    }
    
    @Override
    public boolean b(final int n, final int h) {
        if (n != 100) {
            if (n != 301) {
                if (n != 302) {
                    if (!this.b(n, h)) {
                        return super.b(n, h);
                    }
                }
                else {
                    this.A = h;
                }
            }
            else {
                this.z = h;
            }
        }
        else {
            super.h = h;
        }
        return true;
    }
    
    @Override
    public boolean c(final int n, final float n2) {
        if (n != 100) {
            switch (n) {
                default: {
                    return super.c(n, n2);
                }
                case 315: {
                    this.O = n2;
                    return true;
                }
                case 314: {
                    this.H = n2;
                    return true;
                }
                case 313: {
                    this.G = n2;
                    return true;
                }
                case 312: {
                    this.K = n2;
                    return true;
                }
                case 311: {
                    this.J = n2;
                    return true;
                }
                case 310: {
                    this.D = n2;
                    return true;
                }
                case 309: {
                    this.F = n2;
                    return true;
                }
                case 308: {
                    this.E = n2;
                    return true;
                }
                case 307: {
                    this.C = n2;
                    return true;
                }
                case 306: {
                    this.N = n2;
                    return true;
                }
                case 305: {
                    this.M = n2;
                    return true;
                }
                case 304: {
                    this.L = n2;
                    return true;
                }
                case 303: {
                    this.B = n2;
                    return true;
                }
                case 316: {
                    break;
                }
            }
        }
        this.I = n2;
        return true;
    }
    
    @Override
    public boolean d(final int n, final String s) {
        if (n != 101) {
            if (n != 317) {
                return super.d(n, s);
            }
            this.y = s;
        }
        else {
            super.j = s;
        }
        return true;
    }
    
    @Override
    public int f(final String s) {
        return androidx.constraintlayout.core.motion.utils.v.a(s);
    }
    
    @Override
    public b g() {
        return null;
    }
    
    @Override
    public void i(final HashSet<String> set) {
        if (!Float.isNaN(this.B)) {
            set.add("alpha");
        }
        if (!Float.isNaN(this.C)) {
            set.add("elevation");
        }
        if (!Float.isNaN(this.D)) {
            set.add("rotationZ");
        }
        if (!Float.isNaN(this.E)) {
            set.add("rotationX");
        }
        if (!Float.isNaN(this.F)) {
            set.add("rotationY");
        }
        if (!Float.isNaN(this.G)) {
            set.add("pivotX");
        }
        if (!Float.isNaN(this.H)) {
            set.add("pivotY");
        }
        if (!Float.isNaN(this.L)) {
            set.add("translationX");
        }
        if (!Float.isNaN(this.M)) {
            set.add("translationY");
        }
        if (!Float.isNaN(this.N)) {
            set.add("translationZ");
        }
        if (!Float.isNaN(this.I)) {
            set.add("pathRotate");
        }
        if (!Float.isNaN(this.J)) {
            set.add("scaleX");
        }
        if (!Float.isNaN(this.K)) {
            set.add("scaleY");
        }
        if (!Float.isNaN(this.O)) {
            set.add("progress");
        }
        if (super.l.size() > 0) {
            for (final String str : super.l.keySet()) {
                final StringBuilder sb = new StringBuilder();
                sb.append("CUSTOM,");
                sb.append(str);
                set.add(sb.toString());
            }
        }
    }
    
    @Override
    public void q(final HashMap<String, Integer> hashMap) {
        if (!Float.isNaN(this.B)) {
            hashMap.put("alpha", this.z);
        }
        if (!Float.isNaN(this.C)) {
            hashMap.put("elevation", this.z);
        }
        if (!Float.isNaN(this.D)) {
            hashMap.put("rotationZ", this.z);
        }
        if (!Float.isNaN(this.E)) {
            hashMap.put("rotationX", this.z);
        }
        if (!Float.isNaN(this.F)) {
            hashMap.put("rotationY", this.z);
        }
        if (!Float.isNaN(this.G)) {
            hashMap.put("pivotX", this.z);
        }
        if (!Float.isNaN(this.H)) {
            hashMap.put("pivotY", this.z);
        }
        if (!Float.isNaN(this.L)) {
            hashMap.put("translationX", this.z);
        }
        if (!Float.isNaN(this.M)) {
            hashMap.put("translationY", this.z);
        }
        if (!Float.isNaN(this.N)) {
            hashMap.put("translationZ", this.z);
        }
        if (!Float.isNaN(this.I)) {
            hashMap.put("pathRotate", this.z);
        }
        if (!Float.isNaN(this.J)) {
            hashMap.put("scaleX", this.z);
        }
        if (!Float.isNaN(this.K)) {
            hashMap.put("scaleY", this.z);
        }
        if (!Float.isNaN(this.O)) {
            hashMap.put("progress", this.z);
        }
        if (super.l.size() > 0) {
            for (final String str : super.l.keySet()) {
                final StringBuilder sb = new StringBuilder();
                sb.append("CUSTOM,");
                sb.append(str);
                hashMap.put(sb.toString(), this.z);
            }
        }
    }
    
    public int v() {
        return this.z;
    }
    
    public void x() {
        final HashSet<String> set = new HashSet<String>();
        this.i(set);
        final PrintStream out = System.out;
        final StringBuilder sb = new StringBuilder();
        sb.append(" ------------- ");
        sb.append(super.h);
        sb.append(" -------------");
        out.println(sb.toString());
        int i = 0;
        for (String[] array = set.toArray(new String[0]); i < array.length; ++i) {
            final int a = androidx.constraintlayout.core.motion.utils.v.a(array[i]);
            final PrintStream out2 = System.out;
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(array[i]);
            sb2.append(":");
            sb2.append(this.w(a));
            out2.println(sb2.toString());
        }
    }
}
