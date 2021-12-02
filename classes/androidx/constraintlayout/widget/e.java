// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.widget;

import java.io.Serializable;
import android.annotation.SuppressLint;
import android.graphics.Color;
import java.util.Locale;
import android.content.res.XmlResourceParser;
import org.xmlpull.v1.XmlPullParserException;
import android.view.ViewGroup$LayoutParams;
import android.util.SparseArray;
import java.util.Map;
import java.io.PrintStream;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import androidx.constraintlayout.motion.widget.u;
import java.util.Iterator;
import java.io.IOException;
import java.io.Writer;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.util.Xml;
import androidx.constraintlayout.motion.widget.c;
import org.xmlpull.v1.XmlPullParser;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import android.util.AttributeSet;
import java.util.Arrays;
import android.view.View;
import androidx.constraintlayout.motion.widget.s;
import java.util.ArrayList;
import android.os.Build$VERSION;
import androidx.constraintlayout.core.motion.utils.d;
import android.util.Log;
import android.content.Context;
import android.content.res.TypedArray;
import java.util.HashMap;
import android.util.SparseIntArray;

public class e
{
    public static final int A = 1;
    private static final int A0 = 29;
    private static final int A1 = 81;
    public static final int B = 0;
    private static final int B0 = 30;
    private static final int B1 = 82;
    public static final int C = 1;
    private static final int C0 = 31;
    private static final int C1 = 83;
    public static final int D = 0;
    private static final int D0 = 32;
    private static final int D1 = 84;
    public static final int E = 4;
    private static final int E0 = 33;
    private static final int E1 = 85;
    public static final int F = 8;
    private static final int F0 = 34;
    private static final int F1 = 86;
    public static final int G = 1;
    private static final int G0 = 35;
    private static final int G1 = 87;
    public static final int H = 2;
    private static final int H0 = 36;
    private static final int H1 = 88;
    public static final int I = 3;
    private static final int I0 = 37;
    private static final int I1 = 89;
    public static final int J = 4;
    private static final int J0 = 38;
    private static final int J1 = 90;
    public static final int K = 5;
    private static final int K0 = 39;
    private static final int K1 = 91;
    public static final int L = 6;
    private static final int L0 = 40;
    private static final int L1 = 92;
    public static final int M = 7;
    private static final int M0 = 41;
    private static final int M1 = 93;
    public static final int N = 8;
    private static final int N0 = 42;
    private static final int N1 = 94;
    public static final int O = 0;
    private static final int O0 = 43;
    private static final int O1 = 95;
    public static final int P = 1;
    private static final int P0 = 44;
    private static final int P1 = 96;
    public static final int Q = 0;
    private static final int Q0 = 45;
    private static final int Q1 = 97;
    public static final int R = 1;
    private static final int R0 = 46;
    private static final int R1 = 98;
    public static final int S = 2;
    private static final int S0 = 47;
    private static final String S1 = "weight";
    private static final boolean T = false;
    private static final int T0 = 48;
    private static final String T1 = "ratio";
    private static final int[] U;
    private static final int U0 = 49;
    private static final String U1 = "parent";
    private static final int V = 1;
    private static final int V0 = 50;
    private static SparseIntArray W;
    private static final int W0 = 51;
    private static SparseIntArray X;
    private static final int X0 = 52;
    private static final int Y = 1;
    private static final int Y0 = 53;
    private static final int Z = 2;
    private static final int Z0 = 54;
    private static final int a0 = 3;
    private static final int a1 = 55;
    private static final int b0 = 4;
    private static final int b1 = 56;
    private static final int c0 = 5;
    private static final int c1 = 57;
    private static final int d0 = 6;
    private static final int d1 = 58;
    private static final int e0 = 7;
    private static final int e1 = 59;
    private static final int f0 = 8;
    private static final int f1 = 60;
    private static final int g0 = 9;
    private static final int g1 = 61;
    private static final String h = "ConstraintSet";
    private static final int h0 = 10;
    private static final int h1 = 62;
    private static final String i = "XML parser error must be within a Constraint ";
    private static final int i0 = 11;
    private static final int i1 = 63;
    private static final int j = -1;
    private static final int j0 = 12;
    private static final int j1 = 64;
    private static final int k = -2;
    private static final int k0 = 13;
    private static final int k1 = 65;
    private static final int l = -3;
    private static final int l0 = 14;
    private static final int l1 = 66;
    private static final int m = -4;
    private static final int m0 = 15;
    private static final int m1 = 67;
    public static final int n = 0;
    private static final int n0 = 16;
    private static final int n1 = 68;
    public static final int o = 1;
    private static final int o0 = 17;
    private static final int o1 = 69;
    public static final int p = 2;
    private static final int p0 = 18;
    private static final int p1 = 70;
    public static final int q = 3;
    private static final int q0 = 19;
    private static final int q1 = 71;
    public static final int r = 4;
    private static final int r0 = 20;
    private static final int r1 = 72;
    public static final int s = -1;
    private static final int s0 = 21;
    private static final int s1 = 73;
    public static final int t = 0;
    private static final int t0 = 22;
    private static final int t1 = 74;
    public static final int u = -2;
    private static final int u0 = 23;
    private static final int u1 = 75;
    public static final int v = 1;
    private static final int v0 = 24;
    private static final int v1 = 76;
    public static final int w = 0;
    private static final int w0 = 25;
    private static final int w1 = 77;
    public static final int x = 2;
    private static final int x0 = 26;
    private static final int x1 = 78;
    public static final int y = 0;
    private static final int y0 = 27;
    private static final int y1 = 79;
    public static final int z = 0;
    private static final int z0 = 28;
    private static final int z1 = 80;
    private boolean a;
    public String b;
    public String c;
    public int d;
    private HashMap<String, androidx.constraintlayout.widget.a> e;
    private boolean f;
    private HashMap<Integer, a> g;
    
    static {
        U = new int[] { 0, 4, 8 };
        e.W = new SparseIntArray();
        e.X = new SparseIntArray();
        e.W.append(androidx.constraintlayout.widget.j.m.D5, 25);
        e.W.append(androidx.constraintlayout.widget.j.m.E5, 26);
        e.W.append(androidx.constraintlayout.widget.j.m.G5, 29);
        e.W.append(androidx.constraintlayout.widget.j.m.H5, 30);
        e.W.append(androidx.constraintlayout.widget.j.m.N5, 36);
        e.W.append(androidx.constraintlayout.widget.j.m.M5, 35);
        e.W.append(androidx.constraintlayout.widget.j.m.k5, 4);
        e.W.append(androidx.constraintlayout.widget.j.m.j5, 3);
        e.W.append(androidx.constraintlayout.widget.j.m.f5, 1);
        e.W.append(androidx.constraintlayout.widget.j.m.h5, 91);
        e.W.append(androidx.constraintlayout.widget.j.m.g5, 92);
        e.W.append(androidx.constraintlayout.widget.j.m.W5, 6);
        e.W.append(androidx.constraintlayout.widget.j.m.X5, 7);
        e.W.append(androidx.constraintlayout.widget.j.m.r5, 17);
        e.W.append(androidx.constraintlayout.widget.j.m.s5, 18);
        e.W.append(androidx.constraintlayout.widget.j.m.t5, 19);
        e.W.append(androidx.constraintlayout.widget.j.m.a4, 27);
        e.W.append(androidx.constraintlayout.widget.j.m.I5, 32);
        e.W.append(androidx.constraintlayout.widget.j.m.J5, 33);
        e.W.append(androidx.constraintlayout.widget.j.m.q5, 10);
        e.W.append(androidx.constraintlayout.widget.j.m.p5, 9);
        e.W.append(androidx.constraintlayout.widget.j.m.b6, 13);
        e.W.append(androidx.constraintlayout.widget.j.m.e6, 16);
        e.W.append(androidx.constraintlayout.widget.j.m.c6, 14);
        e.W.append(androidx.constraintlayout.widget.j.m.Z5, 11);
        e.W.append(androidx.constraintlayout.widget.j.m.d6, 15);
        e.W.append(androidx.constraintlayout.widget.j.m.a6, 12);
        e.W.append(androidx.constraintlayout.widget.j.m.Q5, 40);
        e.W.append(androidx.constraintlayout.widget.j.m.B5, 39);
        e.W.append(androidx.constraintlayout.widget.j.m.A5, 41);
        e.W.append(androidx.constraintlayout.widget.j.m.P5, 42);
        e.W.append(androidx.constraintlayout.widget.j.m.z5, 20);
        e.W.append(androidx.constraintlayout.widget.j.m.O5, 37);
        e.W.append(androidx.constraintlayout.widget.j.m.o5, 5);
        e.W.append(androidx.constraintlayout.widget.j.m.C5, 87);
        e.W.append(androidx.constraintlayout.widget.j.m.L5, 87);
        e.W.append(androidx.constraintlayout.widget.j.m.F5, 87);
        e.W.append(androidx.constraintlayout.widget.j.m.i5, 87);
        e.W.append(androidx.constraintlayout.widget.j.m.e5, 87);
        e.W.append(androidx.constraintlayout.widget.j.m.f4, 24);
        e.W.append(androidx.constraintlayout.widget.j.m.h4, 28);
        e.W.append(androidx.constraintlayout.widget.j.m.x4, 31);
        e.W.append(androidx.constraintlayout.widget.j.m.y4, 8);
        e.W.append(androidx.constraintlayout.widget.j.m.g4, 34);
        e.W.append(androidx.constraintlayout.widget.j.m.i4, 2);
        e.W.append(androidx.constraintlayout.widget.j.m.d4, 23);
        e.W.append(androidx.constraintlayout.widget.j.m.e4, 21);
        e.W.append(androidx.constraintlayout.widget.j.m.R5, 95);
        e.W.append(androidx.constraintlayout.widget.j.m.u5, 96);
        e.W.append(androidx.constraintlayout.widget.j.m.c4, 22);
        e.W.append(androidx.constraintlayout.widget.j.m.n4, 43);
        e.W.append(androidx.constraintlayout.widget.j.m.A4, 44);
        e.W.append(androidx.constraintlayout.widget.j.m.v4, 45);
        e.W.append(androidx.constraintlayout.widget.j.m.w4, 46);
        e.W.append(androidx.constraintlayout.widget.j.m.u4, 60);
        e.W.append(androidx.constraintlayout.widget.j.m.s4, 47);
        e.W.append(androidx.constraintlayout.widget.j.m.t4, 48);
        e.W.append(androidx.constraintlayout.widget.j.m.o4, 49);
        e.W.append(androidx.constraintlayout.widget.j.m.p4, 50);
        e.W.append(androidx.constraintlayout.widget.j.m.q4, 51);
        e.W.append(androidx.constraintlayout.widget.j.m.r4, 52);
        e.W.append(androidx.constraintlayout.widget.j.m.z4, 53);
        e.W.append(androidx.constraintlayout.widget.j.m.S5, 54);
        e.W.append(androidx.constraintlayout.widget.j.m.v5, 55);
        e.W.append(androidx.constraintlayout.widget.j.m.T5, 56);
        e.W.append(androidx.constraintlayout.widget.j.m.w5, 57);
        e.W.append(androidx.constraintlayout.widget.j.m.U5, 58);
        e.W.append(androidx.constraintlayout.widget.j.m.x5, 59);
        e.W.append(androidx.constraintlayout.widget.j.m.l5, 61);
        e.W.append(androidx.constraintlayout.widget.j.m.n5, 62);
        e.W.append(androidx.constraintlayout.widget.j.m.m5, 63);
        e.W.append(androidx.constraintlayout.widget.j.m.C4, 64);
        e.W.append(androidx.constraintlayout.widget.j.m.q6, 65);
        e.W.append(androidx.constraintlayout.widget.j.m.J4, 66);
        e.W.append(androidx.constraintlayout.widget.j.m.r6, 67);
        e.W.append(androidx.constraintlayout.widget.j.m.i6, 79);
        e.W.append(androidx.constraintlayout.widget.j.m.b4, 38);
        e.W.append(androidx.constraintlayout.widget.j.m.h6, 68);
        e.W.append(androidx.constraintlayout.widget.j.m.V5, 69);
        e.W.append(androidx.constraintlayout.widget.j.m.y5, 70);
        e.W.append(androidx.constraintlayout.widget.j.m.g6, 97);
        e.W.append(androidx.constraintlayout.widget.j.m.G4, 71);
        e.W.append(androidx.constraintlayout.widget.j.m.E4, 72);
        e.W.append(androidx.constraintlayout.widget.j.m.F4, 73);
        e.W.append(androidx.constraintlayout.widget.j.m.H4, 74);
        e.W.append(androidx.constraintlayout.widget.j.m.D4, 75);
        e.W.append(androidx.constraintlayout.widget.j.m.j6, 76);
        e.W.append(androidx.constraintlayout.widget.j.m.K5, 77);
        e.W.append(androidx.constraintlayout.widget.j.m.s6, 78);
        e.W.append(androidx.constraintlayout.widget.j.m.d5, 80);
        e.W.append(androidx.constraintlayout.widget.j.m.c5, 81);
        e.W.append(androidx.constraintlayout.widget.j.m.l6, 82);
        e.W.append(androidx.constraintlayout.widget.j.m.p6, 83);
        e.W.append(androidx.constraintlayout.widget.j.m.o6, 84);
        e.W.append(androidx.constraintlayout.widget.j.m.n6, 85);
        e.W.append(androidx.constraintlayout.widget.j.m.m6, 86);
        final SparseIntArray x = e.X;
        final int ta = androidx.constraintlayout.widget.j.m.ta;
        x.append(ta, 6);
        e.X.append(ta, 7);
        e.X.append(androidx.constraintlayout.widget.j.m.N8, 27);
        e.X.append(androidx.constraintlayout.widget.j.m.xa, 13);
        e.X.append(androidx.constraintlayout.widget.j.m.Aa, 16);
        e.X.append(androidx.constraintlayout.widget.j.m.ya, 14);
        e.X.append(androidx.constraintlayout.widget.j.m.va, 11);
        e.X.append(androidx.constraintlayout.widget.j.m.za, 15);
        e.X.append(androidx.constraintlayout.widget.j.m.wa, 12);
        e.X.append(androidx.constraintlayout.widget.j.m.ma, 40);
        e.X.append(androidx.constraintlayout.widget.j.m.fa, 39);
        e.X.append(androidx.constraintlayout.widget.j.m.ea, 41);
        e.X.append(androidx.constraintlayout.widget.j.m.la, 42);
        e.X.append(androidx.constraintlayout.widget.j.m.da, 20);
        e.X.append(androidx.constraintlayout.widget.j.m.ka, 37);
        e.X.append(androidx.constraintlayout.widget.j.m.U9, 5);
        e.X.append(androidx.constraintlayout.widget.j.m.ga, 87);
        e.X.append(androidx.constraintlayout.widget.j.m.ja, 87);
        e.X.append(androidx.constraintlayout.widget.j.m.ha, 87);
        e.X.append(androidx.constraintlayout.widget.j.m.R9, 87);
        e.X.append(androidx.constraintlayout.widget.j.m.Q9, 87);
        e.X.append(androidx.constraintlayout.widget.j.m.S8, 24);
        e.X.append(androidx.constraintlayout.widget.j.m.U8, 28);
        e.X.append(androidx.constraintlayout.widget.j.m.k9, 31);
        e.X.append(androidx.constraintlayout.widget.j.m.l9, 8);
        e.X.append(androidx.constraintlayout.widget.j.m.T8, 34);
        e.X.append(androidx.constraintlayout.widget.j.m.V8, 2);
        e.X.append(androidx.constraintlayout.widget.j.m.Q8, 23);
        e.X.append(androidx.constraintlayout.widget.j.m.R8, 21);
        e.X.append(androidx.constraintlayout.widget.j.m.na, 95);
        e.X.append(androidx.constraintlayout.widget.j.m.Y9, 96);
        e.X.append(androidx.constraintlayout.widget.j.m.P8, 22);
        e.X.append(androidx.constraintlayout.widget.j.m.a9, 43);
        e.X.append(androidx.constraintlayout.widget.j.m.n9, 44);
        e.X.append(androidx.constraintlayout.widget.j.m.i9, 45);
        e.X.append(androidx.constraintlayout.widget.j.m.j9, 46);
        e.X.append(androidx.constraintlayout.widget.j.m.h9, 60);
        e.X.append(androidx.constraintlayout.widget.j.m.f9, 47);
        e.X.append(androidx.constraintlayout.widget.j.m.g9, 48);
        e.X.append(androidx.constraintlayout.widget.j.m.b9, 49);
        e.X.append(androidx.constraintlayout.widget.j.m.c9, 50);
        e.X.append(androidx.constraintlayout.widget.j.m.d9, 51);
        e.X.append(androidx.constraintlayout.widget.j.m.e9, 52);
        e.X.append(androidx.constraintlayout.widget.j.m.m9, 53);
        e.X.append(androidx.constraintlayout.widget.j.m.oa, 54);
        e.X.append(androidx.constraintlayout.widget.j.m.Z9, 55);
        e.X.append(androidx.constraintlayout.widget.j.m.pa, 56);
        e.X.append(androidx.constraintlayout.widget.j.m.aa, 57);
        e.X.append(androidx.constraintlayout.widget.j.m.qa, 58);
        e.X.append(androidx.constraintlayout.widget.j.m.ba, 59);
        e.X.append(androidx.constraintlayout.widget.j.m.T9, 62);
        e.X.append(androidx.constraintlayout.widget.j.m.S9, 63);
        e.X.append(androidx.constraintlayout.widget.j.m.p9, 64);
        e.X.append(androidx.constraintlayout.widget.j.m.Na, 65);
        e.X.append(androidx.constraintlayout.widget.j.m.v9, 66);
        e.X.append(androidx.constraintlayout.widget.j.m.Oa, 67);
        e.X.append(androidx.constraintlayout.widget.j.m.Ea, 79);
        e.X.append(androidx.constraintlayout.widget.j.m.O8, 38);
        e.X.append(androidx.constraintlayout.widget.j.m.Fa, 98);
        e.X.append(androidx.constraintlayout.widget.j.m.Da, 68);
        e.X.append(androidx.constraintlayout.widget.j.m.ra, 69);
        e.X.append(androidx.constraintlayout.widget.j.m.ca, 70);
        e.X.append(androidx.constraintlayout.widget.j.m.t9, 71);
        e.X.append(androidx.constraintlayout.widget.j.m.r9, 72);
        e.X.append(androidx.constraintlayout.widget.j.m.s9, 73);
        e.X.append(androidx.constraintlayout.widget.j.m.u9, 74);
        e.X.append(androidx.constraintlayout.widget.j.m.q9, 75);
        e.X.append(androidx.constraintlayout.widget.j.m.Ga, 76);
        e.X.append(androidx.constraintlayout.widget.j.m.ia, 77);
        e.X.append(androidx.constraintlayout.widget.j.m.Pa, 78);
        e.X.append(androidx.constraintlayout.widget.j.m.P9, 80);
        e.X.append(androidx.constraintlayout.widget.j.m.O9, 81);
        e.X.append(androidx.constraintlayout.widget.j.m.Ia, 82);
        e.X.append(androidx.constraintlayout.widget.j.m.Ma, 83);
        e.X.append(androidx.constraintlayout.widget.j.m.La, 84);
        e.X.append(androidx.constraintlayout.widget.j.m.Ka, 85);
        e.X.append(androidx.constraintlayout.widget.j.m.Ja, 86);
        e.X.append(androidx.constraintlayout.widget.j.m.Ca, 97);
    }
    
    public e() {
        this.c = "";
        this.d = 0;
        this.e = new HashMap<String, androidx.constraintlayout.widget.a>();
        this.f = true;
        this.g = new HashMap<Integer, a>();
    }
    
    static void A0(final Object o, final TypedArray typedArray, int n, final int n2) {
        if (o == null) {
            return;
        }
        final int type = typedArray.peekValue(n).type;
        if (type != 3) {
            final int n3 = -2;
            boolean b = false;
            if (type != 5) {
                n = typedArray.getInt(n, 0);
                if (n != -4) {
                    if (n == -3 || (n != -2 && n != -1)) {
                        n = 0;
                    }
                }
                else {
                    b = true;
                    n = n3;
                }
            }
            else {
                n = typedArray.getDimensionPixelSize(n, 0);
            }
            if (o instanceof ConstraintLayout.b) {
                final ConstraintLayout.b b2 = (ConstraintLayout.b)o;
                if (n2 == 0) {
                    b2.width = n;
                    b2.Z = b;
                }
                else {
                    b2.height = n;
                    b2.a0 = b;
                }
            }
            else if (o instanceof b) {
                final b b3 = (b)o;
                if (n2 == 0) {
                    b3.d = n;
                    b3.m0 = b;
                }
                else {
                    b3.e = n;
                    b3.n0 = b;
                }
            }
            else if (o instanceof a.a) {
                final a.a a = (a.a)o;
                if (n2 == 0) {
                    a.b(23, n);
                    n = 80;
                }
                else {
                    a.b(21, n);
                    n = 81;
                }
                a.d(n, b);
            }
            return;
        }
        B0(o, typedArray.getString(n), n2);
    }
    
    static void B0(final Object o, String s, int n) {
        if (s == null) {
            return;
        }
        final int index = s.indexOf(61);
        final int length = s.length();
        if (index <= 0 || index >= length - 1) {
            return;
        }
        final String substring = s.substring(0, index);
        s = s.substring(index + 1);
        if (s.length() <= 0) {
            return;
        }
        final String trim = substring.trim();
        s = s.trim();
        Label_0302: {
            if ("ratio".equalsIgnoreCase(trim)) {
                if (o instanceof ConstraintLayout.b) {
                    final ConstraintLayout.b b = (ConstraintLayout.b)o;
                    if (n == 0) {
                        b.width = 0;
                    }
                    else {
                        b.height = 0;
                    }
                    C0(b, s);
                    return;
                }
                if (o instanceof b) {
                    ((b)o).z = s;
                    return;
                }
                if (o instanceof a.a) {
                    ((a.a)o).c(5, s);
                }
                return;
            }
            else if (!"weight".equalsIgnoreCase(trim)) {
                break Label_0302;
            }
            try {
                final float float1 = Float.parseFloat(s);
                if (o instanceof ConstraintLayout.b) {
                    final ConstraintLayout.b b2 = (ConstraintLayout.b)o;
                    if (n == 0) {
                        b2.width = 0;
                        b2.K = float1;
                    }
                    else {
                        b2.height = 0;
                        b2.L = float1;
                    }
                }
                else if (o instanceof b) {
                    final b b3 = (b)o;
                    if (n == 0) {
                        b3.d = 0;
                        b3.V = float1;
                    }
                    else {
                        b3.e = 0;
                        b3.U = float1;
                    }
                }
                else if (o instanceof a.a) {
                    final a.a a = (a.a)o;
                    if (n == 0) {
                        a.b(23, 0);
                        n = 39;
                    }
                    else {
                        a.b(21, 0);
                        n = 40;
                    }
                    a.a(n, float1);
                }
                Label_0482: {
                    return;
                }
                // iftrue(Label_0482:, !"parent".equalsIgnoreCase(trim))
                // iftrue(Label_0361:, n != 0)
                // iftrue(Label_0434:, !o instanceof b)
                // iftrue(Label_0482:, !o instanceof a)
                // iftrue(Label_0415:, n != 0)
                // iftrue(Label_0380:, !o instanceof ConstraintLayout.b)
                while (true) {
                    Block_23: {
                        b b5 = null;
                        float max = 0.0f;
                    Block_22_Outer:
                        while (true) {
                            Block_18: {
                                break Block_18;
                                final ConstraintLayout.b b4 = (ConstraintLayout.b)o;
                                Block_20: {
                                    break Block_20;
                                    Label_0380:
                                    while (true) {
                                        Block_21: {
                                            break Block_21;
                                            while (true) {
                                                final a.a a2;
                                                a2.b(n, 2);
                                                return;
                                                Label_0434:
                                                break Block_23;
                                                a2.b(23, 0);
                                                n = 54;
                                                continue Block_22_Outer;
                                                b5.d = 0;
                                                b5.e0 = max;
                                                b5.Y = 2;
                                                return;
                                                Label_0361:
                                                b4.height = 0;
                                                b4.V = max;
                                                b4.P = 2;
                                                return;
                                                Label_0469:
                                                a2.b(21, 0);
                                                n = 55;
                                                continue Block_22_Outer;
                                            }
                                        }
                                        b5 = (b)o;
                                        continue;
                                    }
                                }
                                b4.width = 0;
                                b4.U = max;
                                b4.O = 2;
                                return;
                            }
                            max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(s)));
                            continue;
                        }
                        Label_0415:
                        b5.e = 0;
                        b5.f0 = max;
                        b5.Z = 2;
                        return;
                    }
                    final a.a a2 = (a.a)o;
                    continue;
                }
            }
            // iftrue(Label_0469:, n != 0)
            catch (NumberFormatException ex) {}
        }
    }
    
    static void C0(final ConstraintLayout.b b, final String h) {
        final float n = Float.NaN;
        final int n2 = -1;
        float i = n;
        int j = n2;
    Block_14_Outer:
        while (true) {
            if (h == null) {
                break Label_0293;
            }
            final int length = h.length();
            final int index = h.indexOf(44);
            final int n3 = 0;
            int n4 = n2;
            int n5 = n3;
            if (index > 0) {
                n4 = n2;
                n5 = n3;
                if (index < length - 1) {
                    final String substring = h.substring(0, index);
                    if (substring.equalsIgnoreCase("W")) {
                        n4 = 0;
                    }
                    else {
                        n4 = n2;
                        if (substring.equalsIgnoreCase("H")) {
                            n4 = 1;
                        }
                    }
                    n5 = index + 1;
                }
            }
            final int index2 = h.indexOf(58);
            Label_0259: {
                if (index2 < 0 || index2 >= length - 1) {
                    break Label_0259;
                }
                final String substring2 = h.substring(n5, index2);
                final String substring3 = h.substring(index2 + 1);
                i = n;
                j = n4;
                if (substring2.length() <= 0) {
                    break Label_0293;
                }
                i = n;
                j = n4;
                if (substring3.length() <= 0) {
                    break Label_0293;
                }
                try {
                    final float float1 = Float.parseFloat(substring2);
                    final float float2 = Float.parseFloat(substring3);
                    i = n;
                    j = n4;
                    if (float1 > 0.0f) {
                        i = n;
                        j = n4;
                        if (float2 > 0.0f) {
                            if (n4 == 1) {
                                i = Math.abs(float2 / float1);
                                j = n4;
                            }
                            else {
                                i = Math.abs(float1 / float2);
                                j = n4;
                            }
                        }
                    }
                    b.H = h;
                    b.I = i;
                    b.J = j;
                    return;
                    while (true) {
                        final String substring4;
                        i = Float.parseFloat(substring4);
                        j = n4;
                        continue Block_14_Outer;
                        substring4 = h.substring(n5);
                        i = n;
                        j = n4;
                        continue;
                    }
                }
                // iftrue(Label_0293:, substring4.length() <= 0)
                catch (NumberFormatException ex) {
                    i = n;
                    j = n4;
                    continue;
                }
            }
            break;
        }
    }
    
    private String F1(final int n) {
        switch (n) {
            default: {
                return "undefined";
            }
            case 7: {
                return "end";
            }
            case 6: {
                return "start";
            }
            case 5: {
                return "baseline";
            }
            case 4: {
                return "bottom";
            }
            case 3: {
                return "top";
            }
            case 2: {
                return "right";
            }
            case 1: {
                return "left";
            }
        }
    }
    
    private void G0(final Context context, final a a, final TypedArray typedArray, final boolean b) {
        if (b) {
            H0(context, a, typedArray);
            return;
        }
        for (int indexCount = typedArray.getIndexCount(), i = 0; i < indexCount; ++i) {
            final int index = typedArray.getIndex(i);
            if (index != androidx.constraintlayout.widget.j.m.b4 && androidx.constraintlayout.widget.j.m.x4 != index && androidx.constraintlayout.widget.j.m.y4 != index) {
                a.d.a = true;
                a.e.b = true;
                a.c.a = true;
                a.f.a = true;
            }
            StringBuilder sb = null;
            String str = null;
            switch (androidx.constraintlayout.widget.e.W.get(index)) {
                default: {
                    sb = new StringBuilder();
                    str = "Unknown attribute 0x";
                    break;
                }
                case 97: {
                    final b e = a.e;
                    e.p0 = typedArray.getInt(index, e.p0);
                    continue;
                }
                case 96: {
                    A0(a.e, typedArray, index, 1);
                    continue;
                }
                case 95: {
                    A0(a.e, typedArray, index, 0);
                    continue;
                }
                case 94: {
                    final b e2 = a.e;
                    e2.T = typedArray.getDimensionPixelSize(index, e2.T);
                    continue;
                }
                case 93: {
                    final b e3 = a.e;
                    e3.M = typedArray.getDimensionPixelSize(index, e3.M);
                    continue;
                }
                case 92: {
                    final b e4 = a.e;
                    e4.s = y0(typedArray, index, e4.s);
                    continue;
                }
                case 91: {
                    final b e5 = a.e;
                    e5.r = y0(typedArray, index, e5.r);
                    continue;
                }
                case 87: {
                    sb = new StringBuilder();
                    str = "unused attribute 0x";
                    break;
                }
                case 86: {
                    final int type = typedArray.peekValue(index).type;
                    c c;
                    if (type == 1) {
                        a.d.n = typedArray.getResourceId(index, -1);
                        c = a.d;
                        if (c.n == -1) {
                            continue;
                        }
                    }
                    else {
                        if (type != 3) {
                            final c d = a.d;
                            d.m = typedArray.getInteger(index, d.n);
                            continue;
                        }
                        a.d.l = typedArray.getString(index);
                        if (a.d.l.indexOf("/") <= 0) {
                            a.d.m = -1;
                            continue;
                        }
                        a.d.n = typedArray.getResourceId(index, -1);
                        c = a.d;
                    }
                    c.m = -2;
                    continue;
                }
                case 85: {
                    final c d2 = a.d;
                    d2.j = typedArray.getFloat(index, d2.j);
                    continue;
                }
                case 84: {
                    final c d3 = a.d;
                    d3.k = typedArray.getInteger(index, d3.k);
                    continue;
                }
                case 83: {
                    final e f = a.f;
                    f.i = y0(typedArray, index, f.i);
                    continue;
                }
                case 82: {
                    final c d4 = a.d;
                    d4.c = typedArray.getInteger(index, d4.c);
                    continue;
                }
                case 81: {
                    final b e6 = a.e;
                    e6.n0 = typedArray.getBoolean(index, e6.n0);
                    continue;
                }
                case 80: {
                    final b e7 = a.e;
                    e7.m0 = typedArray.getBoolean(index, e7.m0);
                    continue;
                }
                case 79: {
                    final c d5 = a.d;
                    d5.g = typedArray.getFloat(index, d5.g);
                    continue;
                }
                case 78: {
                    final d c2 = a.c;
                    c2.c = typedArray.getInt(index, c2.c);
                    continue;
                }
                case 77: {
                    a.e.l0 = typedArray.getString(index);
                    continue;
                }
                case 76: {
                    final c d6 = a.d;
                    d6.e = typedArray.getInt(index, d6.e);
                    continue;
                }
                case 75: {
                    final b e8 = a.e;
                    e8.o0 = typedArray.getBoolean(index, e8.o0);
                    continue;
                }
                case 74: {
                    a.e.k0 = typedArray.getString(index);
                    continue;
                }
                case 73: {
                    final b e9 = a.e;
                    e9.h0 = typedArray.getDimensionPixelSize(index, e9.h0);
                    continue;
                }
                case 72: {
                    final b e10 = a.e;
                    e10.g0 = typedArray.getInt(index, e10.g0);
                    continue;
                }
                case 71: {
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    continue;
                }
                case 70: {
                    a.e.f0 = typedArray.getFloat(index, 1.0f);
                    continue;
                }
                case 69: {
                    a.e.e0 = typedArray.getFloat(index, 1.0f);
                    continue;
                }
                case 68: {
                    final d c3 = a.c;
                    c3.e = typedArray.getFloat(index, c3.e);
                    continue;
                }
                case 67: {
                    final c d7 = a.d;
                    d7.i = typedArray.getFloat(index, d7.i);
                    continue;
                }
                case 66: {
                    a.d.f = typedArray.getInt(index, 0);
                    continue;
                }
                case 65: {
                    c c4;
                    String string;
                    if (typedArray.peekValue(index).type == 3) {
                        c4 = a.d;
                        string = typedArray.getString(index);
                    }
                    else {
                        c4 = a.d;
                        string = androidx.constraintlayout.core.motion.utils.d.k[typedArray.getInteger(index, 0)];
                    }
                    c4.d = string;
                    continue;
                }
                case 64: {
                    final c d8 = a.d;
                    d8.b = y0(typedArray, index, d8.b);
                    continue;
                }
                case 63: {
                    final b e11 = a.e;
                    e11.C = typedArray.getFloat(index, e11.C);
                    continue;
                }
                case 62: {
                    final b e12 = a.e;
                    e12.B = typedArray.getDimensionPixelSize(index, e12.B);
                    continue;
                }
                case 61: {
                    final b e13 = a.e;
                    e13.A = y0(typedArray, index, e13.A);
                    continue;
                }
                case 60: {
                    final e f2 = a.f;
                    f2.b = typedArray.getFloat(index, f2.b);
                    continue;
                }
                case 59: {
                    final b e14 = a.e;
                    e14.d0 = typedArray.getDimensionPixelSize(index, e14.d0);
                    continue;
                }
                case 58: {
                    final b e15 = a.e;
                    e15.c0 = typedArray.getDimensionPixelSize(index, e15.c0);
                    continue;
                }
                case 57: {
                    final b e16 = a.e;
                    e16.b0 = typedArray.getDimensionPixelSize(index, e16.b0);
                    continue;
                }
                case 56: {
                    final b e17 = a.e;
                    e17.a0 = typedArray.getDimensionPixelSize(index, e17.a0);
                    continue;
                }
                case 55: {
                    final b e18 = a.e;
                    e18.Z = typedArray.getInt(index, e18.Z);
                    continue;
                }
                case 54: {
                    final b e19 = a.e;
                    e19.Y = typedArray.getInt(index, e19.Y);
                    continue;
                }
                case 53: {
                    if (Build$VERSION.SDK_INT >= 21) {
                        final e f3 = a.f;
                        f3.l = typedArray.getDimension(index, f3.l);
                    }
                    continue;
                }
                case 52: {
                    final e f4 = a.f;
                    f4.k = typedArray.getDimension(index, f4.k);
                    continue;
                }
                case 51: {
                    final e f5 = a.f;
                    f5.j = typedArray.getDimension(index, f5.j);
                    continue;
                }
                case 50: {
                    final e f6 = a.f;
                    f6.h = typedArray.getDimension(index, f6.h);
                    continue;
                }
                case 49: {
                    final e f7 = a.f;
                    f7.g = typedArray.getDimension(index, f7.g);
                    continue;
                }
                case 48: {
                    final e f8 = a.f;
                    f8.f = typedArray.getFloat(index, f8.f);
                    continue;
                }
                case 47: {
                    final e f9 = a.f;
                    f9.e = typedArray.getFloat(index, f9.e);
                    continue;
                }
                case 46: {
                    final e f10 = a.f;
                    f10.d = typedArray.getFloat(index, f10.d);
                    continue;
                }
                case 45: {
                    final e f11 = a.f;
                    f11.c = typedArray.getFloat(index, f11.c);
                    continue;
                }
                case 44: {
                    if (Build$VERSION.SDK_INT >= 21) {
                        final e f12 = a.f;
                        f12.m = true;
                        f12.n = typedArray.getDimension(index, f12.n);
                    }
                    continue;
                }
                case 43: {
                    final d c5 = a.c;
                    c5.d = typedArray.getFloat(index, c5.d);
                    continue;
                }
                case 42: {
                    final b e20 = a.e;
                    e20.X = typedArray.getInt(index, e20.X);
                    continue;
                }
                case 41: {
                    final b e21 = a.e;
                    e21.W = typedArray.getInt(index, e21.W);
                    continue;
                }
                case 40: {
                    final b e22 = a.e;
                    e22.U = typedArray.getFloat(index, e22.U);
                    continue;
                }
                case 39: {
                    final b e23 = a.e;
                    e23.V = typedArray.getFloat(index, e23.V);
                    continue;
                }
                case 38: {
                    a.a = typedArray.getResourceId(index, a.a);
                    continue;
                }
                case 37: {
                    final b e24 = a.e;
                    e24.y = typedArray.getFloat(index, e24.y);
                    continue;
                }
                case 36: {
                    final b e25 = a.e;
                    e25.m = y0(typedArray, index, e25.m);
                    continue;
                }
                case 35: {
                    final b e26 = a.e;
                    e26.n = y0(typedArray, index, e26.n);
                    continue;
                }
                case 34: {
                    final b e27 = a.e;
                    e27.I = typedArray.getDimensionPixelSize(index, e27.I);
                    continue;
                }
                case 33: {
                    final b e28 = a.e;
                    e28.u = y0(typedArray, index, e28.u);
                    continue;
                }
                case 32: {
                    final b e29 = a.e;
                    e29.t = y0(typedArray, index, e29.t);
                    continue;
                }
                case 31: {
                    if (Build$VERSION.SDK_INT >= 17) {
                        final b e30 = a.e;
                        e30.L = typedArray.getDimensionPixelSize(index, e30.L);
                    }
                    continue;
                }
                case 30: {
                    final b e31 = a.e;
                    e31.l = y0(typedArray, index, e31.l);
                    continue;
                }
                case 29: {
                    final b e32 = a.e;
                    e32.k = y0(typedArray, index, e32.k);
                    continue;
                }
                case 28: {
                    final b e33 = a.e;
                    e33.H = typedArray.getDimensionPixelSize(index, e33.H);
                    continue;
                }
                case 27: {
                    final b e34 = a.e;
                    e34.F = typedArray.getInt(index, e34.F);
                    continue;
                }
                case 26: {
                    final b e35 = a.e;
                    e35.j = y0(typedArray, index, e35.j);
                    continue;
                }
                case 25: {
                    final b e36 = a.e;
                    e36.i = y0(typedArray, index, e36.i);
                    continue;
                }
                case 24: {
                    final b e37 = a.e;
                    e37.G = typedArray.getDimensionPixelSize(index, e37.G);
                    continue;
                }
                case 23: {
                    final b e38 = a.e;
                    e38.d = typedArray.getLayoutDimension(index, e38.d);
                    continue;
                }
                case 22: {
                    final d c6 = a.c;
                    c6.b = typedArray.getInt(index, c6.b);
                    final d c7 = a.c;
                    c7.b = androidx.constraintlayout.widget.e.U[c7.b];
                    continue;
                }
                case 21: {
                    final b e39 = a.e;
                    e39.e = typedArray.getLayoutDimension(index, e39.e);
                    continue;
                }
                case 20: {
                    final b e40 = a.e;
                    e40.x = typedArray.getFloat(index, e40.x);
                    continue;
                }
                case 19: {
                    final b e41 = a.e;
                    e41.h = typedArray.getFloat(index, e41.h);
                    continue;
                }
                case 18: {
                    final b e42 = a.e;
                    e42.g = typedArray.getDimensionPixelOffset(index, e42.g);
                    continue;
                }
                case 17: {
                    final b e43 = a.e;
                    e43.f = typedArray.getDimensionPixelOffset(index, e43.f);
                    continue;
                }
                case 16: {
                    final b e44 = a.e;
                    e44.O = typedArray.getDimensionPixelSize(index, e44.O);
                    continue;
                }
                case 15: {
                    final b e45 = a.e;
                    e45.S = typedArray.getDimensionPixelSize(index, e45.S);
                    continue;
                }
                case 14: {
                    final b e46 = a.e;
                    e46.P = typedArray.getDimensionPixelSize(index, e46.P);
                    continue;
                }
                case 13: {
                    final b e47 = a.e;
                    e47.N = typedArray.getDimensionPixelSize(index, e47.N);
                    continue;
                }
                case 12: {
                    final b e48 = a.e;
                    e48.R = typedArray.getDimensionPixelSize(index, e48.R);
                    continue;
                }
                case 11: {
                    final b e49 = a.e;
                    e49.Q = typedArray.getDimensionPixelSize(index, e49.Q);
                    continue;
                }
                case 10: {
                    final b e50 = a.e;
                    e50.v = y0(typedArray, index, e50.v);
                    continue;
                }
                case 9: {
                    final b e51 = a.e;
                    e51.w = y0(typedArray, index, e51.w);
                    continue;
                }
                case 8: {
                    if (Build$VERSION.SDK_INT >= 17) {
                        final b e52 = a.e;
                        e52.K = typedArray.getDimensionPixelSize(index, e52.K);
                    }
                    continue;
                }
                case 7: {
                    final b e53 = a.e;
                    e53.E = typedArray.getDimensionPixelOffset(index, e53.E);
                    continue;
                }
                case 6: {
                    final b e54 = a.e;
                    e54.D = typedArray.getDimensionPixelOffset(index, e54.D);
                    continue;
                }
                case 5: {
                    a.e.z = typedArray.getString(index);
                    continue;
                }
                case 4: {
                    final b e55 = a.e;
                    e55.o = y0(typedArray, index, e55.o);
                    continue;
                }
                case 3: {
                    final b e56 = a.e;
                    e56.p = y0(typedArray, index, e56.p);
                    continue;
                }
                case 2: {
                    final b e57 = a.e;
                    e57.J = typedArray.getDimensionPixelSize(index, e57.J);
                    continue;
                }
                case 1: {
                    final b e58 = a.e;
                    e58.q = y0(typedArray, index, e58.q);
                    continue;
                }
            }
            sb.append(str);
            sb.append(Integer.toHexString(index));
            sb.append("   ");
            sb.append(androidx.constraintlayout.widget.e.W.get(index));
            Log.w("ConstraintSet", sb.toString());
        }
    }
    
    private static String[] G1(final String s) {
        final char[] charArray = s.toCharArray();
        final ArrayList<String> list = new ArrayList<String>();
        int i = 0;
        int n = 0;
        int n2 = 0;
        while (i < charArray.length) {
            int n3;
            int n4;
            if (charArray[i] == ',' && n2 == 0) {
                list.add(new String(charArray, n, i - n));
                n3 = i + 1;
                n4 = n2;
            }
            else {
                n3 = n;
                n4 = n2;
                if (charArray[i] == '\"') {
                    n4 = (n2 ^ 0x1);
                    n3 = n;
                }
            }
            ++i;
            n = n3;
            n2 = n4;
        }
        list.add(new String(charArray, n, charArray.length - n));
        return list.toArray(new String[list.size()]);
    }
    
    private static void H0(final Context context, final a a, final TypedArray typedArray) {
        final int indexCount = typedArray.getIndexCount();
        final a.a h = new a.a();
        a.h = h;
        a.d.a = false;
        a.e.b = false;
        a.c.a = false;
        a.f.a = false;
        for (int i = 0; i < indexCount; ++i) {
            final int index = typedArray.getIndex(i);
            final int value = e.X.get(index);
            float n = 1.0f;
            int n2 = 21;
            int n3 = 0;
            int a2 = 0;
            Label_2237: {
                int n5 = 0;
                Label_2227: {
                    int n11 = 0;
                    Label_2199: {
                        int n13 = 0;
                        Label_2183: {
                            int n7 = 0;
                            float n14 = 0.0f;
                            Label_1983: {
                                Label_1973: {
                                    int n6 = 0;
                                    Label_1932: {
                                        int n4 = 0;
                                        Label_1840: {
                                            float n12 = 0.0f;
                                            Label_1541: {
                                                int n9 = 0;
                                                Label_1299: {
                                                    int n10 = 0;
                                                    boolean b = false;
                                                    Label_1109: {
                                                        int n8 = 0;
                                                        Label_0996: {
                                                            StringBuilder sb = null;
                                                            String str = null;
                                                            switch (value) {
                                                                default: {
                                                                    sb = new StringBuilder();
                                                                    str = "Unknown attribute 0x";
                                                                    break;
                                                                }
                                                                case 98: {
                                                                    if (androidx.constraintlayout.motion.widget.s.c2) {
                                                                        if ((a.a = typedArray.getResourceId(index, a.a)) != -1) {
                                                                            continue;
                                                                        }
                                                                    }
                                                                    else if (typedArray.peekValue(index).type != 3) {
                                                                        a.a = typedArray.getResourceId(index, a.a);
                                                                        continue;
                                                                    }
                                                                    a.b = typedArray.getString(index);
                                                                    continue;
                                                                }
                                                                case 97: {
                                                                    n3 = 97;
                                                                    n4 = a.e.p0;
                                                                    break Label_1840;
                                                                }
                                                                case 96: {
                                                                    A0(h, typedArray, index, 1);
                                                                    continue;
                                                                }
                                                                case 95: {
                                                                    A0(h, typedArray, index, 0);
                                                                    continue;
                                                                }
                                                                case 94: {
                                                                    n3 = 94;
                                                                    n5 = a.e.T;
                                                                    break Label_2227;
                                                                }
                                                                case 93: {
                                                                    n3 = 93;
                                                                    n5 = a.e.M;
                                                                    break Label_2227;
                                                                }
                                                                case 87: {
                                                                    sb = new StringBuilder();
                                                                    str = "unused attribute 0x";
                                                                    break;
                                                                }
                                                                case 86: {
                                                                    final int type = typedArray.peekValue(index).type;
                                                                    n2 = 88;
                                                                    c c;
                                                                    if (type == 1) {
                                                                        h.b(89, a.d.n = typedArray.getResourceId(index, -1));
                                                                        c = a.d;
                                                                        if (c.n == -1) {
                                                                            continue;
                                                                        }
                                                                    }
                                                                    else {
                                                                        if (type != 3) {
                                                                            final c d = a.d;
                                                                            d.m = typedArray.getInteger(index, d.n);
                                                                            n6 = a.d.m;
                                                                            break Label_1932;
                                                                        }
                                                                        h.c(90, a.d.l = typedArray.getString(index));
                                                                        if (a.d.l.indexOf("/") <= 0) {
                                                                            h.b(88, a.d.m = -1);
                                                                            continue;
                                                                        }
                                                                        h.b(89, a.d.n = typedArray.getResourceId(index, -1));
                                                                        c = a.d;
                                                                    }
                                                                    h.b(88, c.m = -2);
                                                                    continue;
                                                                }
                                                                case 85: {
                                                                    n7 = 85;
                                                                    n = a.d.j;
                                                                    break Label_1973;
                                                                }
                                                                case 84: {
                                                                    n3 = 84;
                                                                    n8 = a.d.k;
                                                                    break Label_0996;
                                                                }
                                                                case 83: {
                                                                    n3 = 83;
                                                                    n9 = a.f.i;
                                                                    break Label_1299;
                                                                }
                                                                case 82: {
                                                                    n3 = 82;
                                                                    n8 = a.d.c;
                                                                    break Label_0996;
                                                                }
                                                                case 81: {
                                                                    n10 = 81;
                                                                    b = a.e.n0;
                                                                    break Label_1109;
                                                                }
                                                                case 80: {
                                                                    n10 = 80;
                                                                    b = a.e.m0;
                                                                    break Label_1109;
                                                                }
                                                                case 79: {
                                                                    n7 = 79;
                                                                    n = a.d.g;
                                                                    break Label_1973;
                                                                }
                                                                case 78: {
                                                                    n3 = 78;
                                                                    n4 = a.c.c;
                                                                    break Label_1840;
                                                                }
                                                                case 77: {
                                                                    n11 = 77;
                                                                    break Label_2199;
                                                                }
                                                                case 76: {
                                                                    n3 = 76;
                                                                    n4 = a.d.e;
                                                                    break Label_1840;
                                                                }
                                                                case 75: {
                                                                    n10 = 75;
                                                                    b = a.e.o0;
                                                                    break Label_1109;
                                                                }
                                                                case 74: {
                                                                    n11 = 74;
                                                                    break Label_2199;
                                                                }
                                                                case 73: {
                                                                    n3 = 73;
                                                                    n5 = a.e.h0;
                                                                    break Label_2227;
                                                                }
                                                                case 72: {
                                                                    n3 = 72;
                                                                    n4 = a.e.g0;
                                                                    break Label_1840;
                                                                }
                                                                case 71: {
                                                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                                    continue;
                                                                }
                                                                case 70: {
                                                                    n7 = 70;
                                                                    break Label_1973;
                                                                }
                                                                case 69: {
                                                                    n7 = 69;
                                                                    break Label_1973;
                                                                }
                                                                case 68: {
                                                                    n7 = 68;
                                                                    n = a.c.e;
                                                                    break Label_1973;
                                                                }
                                                                case 67: {
                                                                    n7 = 67;
                                                                    n = a.d.i;
                                                                    break Label_1973;
                                                                }
                                                                case 66: {
                                                                    n3 = 66;
                                                                    a2 = typedArray.getInt(index, 0);
                                                                    break Label_2237;
                                                                }
                                                                case 65: {
                                                                    String string;
                                                                    if (typedArray.peekValue(index).type == 3) {
                                                                        string = typedArray.getString(index);
                                                                    }
                                                                    else {
                                                                        string = androidx.constraintlayout.core.motion.utils.d.k[typedArray.getInteger(index, 0)];
                                                                    }
                                                                    h.c(65, string);
                                                                    continue;
                                                                }
                                                                case 64: {
                                                                    n3 = 64;
                                                                    n9 = a.d.b;
                                                                    break Label_1299;
                                                                }
                                                                case 63: {
                                                                    n7 = 63;
                                                                    n = a.e.C;
                                                                    break Label_1973;
                                                                }
                                                                case 62: {
                                                                    n3 = 62;
                                                                    n5 = a.e.B;
                                                                    break Label_2227;
                                                                }
                                                                case 60: {
                                                                    n7 = 60;
                                                                    n = a.f.b;
                                                                    break Label_1973;
                                                                }
                                                                case 59: {
                                                                    n3 = 59;
                                                                    n5 = a.e.d0;
                                                                    break Label_2227;
                                                                }
                                                                case 58: {
                                                                    n3 = 58;
                                                                    n5 = a.e.c0;
                                                                    break Label_2227;
                                                                }
                                                                case 57: {
                                                                    n3 = 57;
                                                                    n5 = a.e.b0;
                                                                    break Label_2227;
                                                                }
                                                                case 56: {
                                                                    n3 = 56;
                                                                    n5 = a.e.a0;
                                                                    break Label_2227;
                                                                }
                                                                case 55: {
                                                                    n3 = 55;
                                                                    n4 = a.e.Z;
                                                                    break Label_1840;
                                                                }
                                                                case 54: {
                                                                    n3 = 54;
                                                                    n4 = a.e.Y;
                                                                    break Label_1840;
                                                                }
                                                                case 53: {
                                                                    if (Build$VERSION.SDK_INT >= 21) {
                                                                        n7 = 53;
                                                                        n12 = a.f.l;
                                                                        break Label_1541;
                                                                    }
                                                                    continue;
                                                                }
                                                                case 52: {
                                                                    n7 = 52;
                                                                    n12 = a.f.k;
                                                                    break Label_1541;
                                                                }
                                                                case 51: {
                                                                    n7 = 51;
                                                                    n12 = a.f.j;
                                                                    break Label_1541;
                                                                }
                                                                case 50: {
                                                                    n7 = 50;
                                                                    n12 = a.f.h;
                                                                    break Label_1541;
                                                                }
                                                                case 49: {
                                                                    n7 = 49;
                                                                    n12 = a.f.g;
                                                                    break Label_1541;
                                                                }
                                                                case 48: {
                                                                    n7 = 48;
                                                                    n = a.f.f;
                                                                    break Label_1973;
                                                                }
                                                                case 47: {
                                                                    n7 = 47;
                                                                    n = a.f.e;
                                                                    break Label_1973;
                                                                }
                                                                case 46: {
                                                                    n7 = 46;
                                                                    n = a.f.d;
                                                                    break Label_1973;
                                                                }
                                                                case 45: {
                                                                    n7 = 45;
                                                                    n = a.f.c;
                                                                    break Label_1973;
                                                                }
                                                                case 44: {
                                                                    if (Build$VERSION.SDK_INT >= 21) {
                                                                        n7 = 44;
                                                                        h.d(44, true);
                                                                        n12 = a.f.n;
                                                                        break Label_1541;
                                                                    }
                                                                    continue;
                                                                }
                                                                case 43: {
                                                                    n7 = 43;
                                                                    n = a.c.d;
                                                                    break Label_1973;
                                                                }
                                                                case 42: {
                                                                    n3 = 42;
                                                                    n4 = a.e.X;
                                                                    break Label_1840;
                                                                }
                                                                case 41: {
                                                                    n3 = 41;
                                                                    n4 = a.e.W;
                                                                    break Label_1840;
                                                                }
                                                                case 40: {
                                                                    n7 = 40;
                                                                    n = a.e.U;
                                                                    break Label_1973;
                                                                }
                                                                case 39: {
                                                                    n7 = 39;
                                                                    n = a.e.V;
                                                                    break Label_1973;
                                                                }
                                                                case 38: {
                                                                    a2 = typedArray.getResourceId(index, a.a);
                                                                    a.a = a2;
                                                                    n3 = 38;
                                                                    break Label_2237;
                                                                }
                                                                case 37: {
                                                                    n7 = 37;
                                                                    n = a.e.y;
                                                                    break Label_1973;
                                                                }
                                                                case 34: {
                                                                    n3 = 34;
                                                                    n5 = a.e.I;
                                                                    break Label_2227;
                                                                }
                                                                case 31: {
                                                                    if (Build$VERSION.SDK_INT >= 17) {
                                                                        n3 = 31;
                                                                        n5 = a.e.L;
                                                                        break Label_2227;
                                                                    }
                                                                    continue;
                                                                }
                                                                case 28: {
                                                                    n3 = 28;
                                                                    n5 = a.e.H;
                                                                    break Label_2227;
                                                                }
                                                                case 27: {
                                                                    n3 = 27;
                                                                    n4 = a.e.F;
                                                                    break Label_1840;
                                                                }
                                                                case 24: {
                                                                    n3 = 24;
                                                                    n5 = a.e.G;
                                                                    break Label_2227;
                                                                }
                                                                case 23: {
                                                                    n3 = 23;
                                                                    a2 = typedArray.getLayoutDimension(index, a.e.d);
                                                                    break Label_2237;
                                                                }
                                                                case 22: {
                                                                    n3 = 22;
                                                                    a2 = e.U[typedArray.getInt(index, a.c.b)];
                                                                    break Label_2237;
                                                                }
                                                                case 21: {
                                                                    n6 = typedArray.getLayoutDimension(index, a.e.e);
                                                                    break Label_1932;
                                                                }
                                                                case 20: {
                                                                    n7 = 20;
                                                                    n = a.e.x;
                                                                    break Label_1973;
                                                                }
                                                                case 19: {
                                                                    n7 = 19;
                                                                    n = a.e.h;
                                                                    break Label_1973;
                                                                }
                                                                case 18: {
                                                                    n3 = 18;
                                                                    n13 = a.e.g;
                                                                    break Label_2183;
                                                                }
                                                                case 17: {
                                                                    h.b(17, typedArray.getDimensionPixelOffset(index, a.e.f));
                                                                    continue;
                                                                }
                                                                case 16: {
                                                                    n3 = 16;
                                                                    n5 = a.e.O;
                                                                    break Label_2227;
                                                                }
                                                                case 15: {
                                                                    n3 = 15;
                                                                    n5 = a.e.S;
                                                                    break Label_2227;
                                                                }
                                                                case 14: {
                                                                    n3 = 14;
                                                                    n5 = a.e.P;
                                                                    break Label_2227;
                                                                }
                                                                case 13: {
                                                                    n3 = 13;
                                                                    n5 = a.e.N;
                                                                    break Label_2227;
                                                                }
                                                                case 12: {
                                                                    n3 = 12;
                                                                    n5 = a.e.R;
                                                                    break Label_2227;
                                                                }
                                                                case 11: {
                                                                    n3 = 11;
                                                                    n5 = a.e.Q;
                                                                    break Label_2227;
                                                                }
                                                                case 8: {
                                                                    if (Build$VERSION.SDK_INT >= 17) {
                                                                        n3 = 8;
                                                                        n5 = a.e.K;
                                                                        break Label_2227;
                                                                    }
                                                                    continue;
                                                                }
                                                                case 7: {
                                                                    n3 = 7;
                                                                    n13 = a.e.E;
                                                                    break Label_2183;
                                                                }
                                                                case 6: {
                                                                    n3 = 6;
                                                                    n13 = a.e.D;
                                                                    break Label_2183;
                                                                }
                                                                case 5: {
                                                                    n11 = 5;
                                                                    break Label_2199;
                                                                }
                                                                case 2: {
                                                                    n3 = 2;
                                                                    n5 = a.e.J;
                                                                    break Label_2227;
                                                                }
                                                            }
                                                            sb.append(str);
                                                            sb.append(Integer.toHexString(index));
                                                            sb.append("   ");
                                                            sb.append(e.W.get(index));
                                                            Log.w("ConstraintSet", sb.toString());
                                                            continue;
                                                        }
                                                        a2 = typedArray.getInteger(index, n8);
                                                        break Label_2237;
                                                    }
                                                    h.d(n10, typedArray.getBoolean(index, b));
                                                    continue;
                                                }
                                                a2 = y0(typedArray, index, n9);
                                                break Label_2237;
                                            }
                                            n14 = typedArray.getDimension(index, n12);
                                            break Label_1983;
                                        }
                                        a2 = typedArray.getInt(index, n4);
                                        break Label_2237;
                                    }
                                    h.b(n2, n6);
                                    continue;
                                }
                                n14 = typedArray.getFloat(index, n);
                            }
                            h.a(n7, n14);
                            continue;
                        }
                        a2 = typedArray.getDimensionPixelOffset(index, n13);
                        break Label_2237;
                    }
                    h.c(n11, typedArray.getString(index));
                    continue;
                }
                a2 = typedArray.getDimensionPixelSize(index, n5);
            }
            h.b(n3, a2);
        }
    }
    
    private static void R0(final a a, final int n, final float n2) {
        Label_0432: {
            if (n != 19) {
                if (n != 20) {
                    if (n != 37) {
                        if (n != 60) {
                            if (n != 63) {
                                if (n != 79) {
                                    if (n != 85) {
                                        if (n != 87) {
                                            if (n != 39) {
                                                if (n != 40) {
                                                    switch (n) {
                                                        default: {
                                                            switch (n) {
                                                                default: {
                                                                    Log.w("ConstraintSet", "Unknown attribute 0x");
                                                                    break Label_0432;
                                                                }
                                                                case 70: {
                                                                    a.e.f0 = n2;
                                                                    break Label_0432;
                                                                }
                                                                case 69: {
                                                                    a.e.e0 = n2;
                                                                    break Label_0432;
                                                                }
                                                                case 68: {
                                                                    a.c.e = n2;
                                                                    break Label_0432;
                                                                }
                                                                case 67: {
                                                                    a.d.i = n2;
                                                                    break Label_0432;
                                                                }
                                                            }
                                                            break;
                                                        }
                                                        case 53: {
                                                            a.f.l = n2;
                                                            break;
                                                        }
                                                        case 52: {
                                                            a.f.k = n2;
                                                            break;
                                                        }
                                                        case 51: {
                                                            a.f.j = n2;
                                                            break;
                                                        }
                                                        case 50: {
                                                            a.f.h = n2;
                                                            break;
                                                        }
                                                        case 49: {
                                                            a.f.g = n2;
                                                            break;
                                                        }
                                                        case 48: {
                                                            a.f.f = n2;
                                                            break;
                                                        }
                                                        case 47: {
                                                            a.f.e = n2;
                                                            break;
                                                        }
                                                        case 46: {
                                                            a.f.d = n2;
                                                            break;
                                                        }
                                                        case 45: {
                                                            a.f.c = n2;
                                                            break;
                                                        }
                                                        case 44: {
                                                            final e f = a.f;
                                                            f.n = n2;
                                                            f.m = true;
                                                            break;
                                                        }
                                                        case 43: {
                                                            a.c.d = n2;
                                                            break;
                                                        }
                                                    }
                                                }
                                                else {
                                                    a.e.U = n2;
                                                }
                                            }
                                            else {
                                                a.e.V = n2;
                                            }
                                        }
                                    }
                                    else {
                                        a.d.j = n2;
                                    }
                                }
                                else {
                                    a.d.g = n2;
                                }
                            }
                            else {
                                a.e.C = n2;
                            }
                        }
                        else {
                            a.f.b = n2;
                        }
                    }
                    else {
                        a.e.y = n2;
                    }
                }
                else {
                    a.e.x = n2;
                }
            }
            else {
                a.e.h = n2;
            }
        }
    }
    
    private static void S0(final a a, final int n, final int d) {
        Label_0857: {
            if (n != 6) {
                if (n != 7) {
                    if (n != 8) {
                        if (n != 27) {
                            if (n != 28) {
                                if (n != 41) {
                                    if (n != 42) {
                                        if (n != 61) {
                                            if (n != 62) {
                                                if (n != 72) {
                                                    if (n != 73) {
                                                        switch (n) {
                                                            default: {
                                                                switch (n) {
                                                                    default: {
                                                                        switch (n) {
                                                                            default: {
                                                                                switch (n) {
                                                                                    default: {
                                                                                        switch (n) {
                                                                                            default: {
                                                                                                Log.w("ConstraintSet", "Unknown attribute 0x");
                                                                                                break Label_0857;
                                                                                            }
                                                                                            case 87: {
                                                                                                break Label_0857;
                                                                                            }
                                                                                            case 89: {
                                                                                                a.d.n = d;
                                                                                                break Label_0857;
                                                                                            }
                                                                                            case 88: {
                                                                                                a.d.m = d;
                                                                                                break Label_0857;
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                    case 84: {
                                                                                        a.d.k = d;
                                                                                        break Label_0857;
                                                                                    }
                                                                                    case 83: {
                                                                                        a.f.i = d;
                                                                                        break Label_0857;
                                                                                    }
                                                                                    case 82: {
                                                                                        a.d.c = d;
                                                                                        break Label_0857;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            }
                                                                            case 59: {
                                                                                a.e.d0 = d;
                                                                                break Label_0857;
                                                                            }
                                                                            case 58: {
                                                                                a.e.c0 = d;
                                                                                break Label_0857;
                                                                            }
                                                                            case 57: {
                                                                                a.e.b0 = d;
                                                                                break Label_0857;
                                                                            }
                                                                            case 56: {
                                                                                a.e.a0 = d;
                                                                                break Label_0857;
                                                                            }
                                                                            case 55: {
                                                                                a.e.Z = d;
                                                                                break Label_0857;
                                                                            }
                                                                            case 54: {
                                                                                a.e.Y = d;
                                                                                break Label_0857;
                                                                            }
                                                                        }
                                                                        break;
                                                                    }
                                                                    case 24: {
                                                                        a.e.G = d;
                                                                        break Label_0857;
                                                                    }
                                                                    case 23: {
                                                                        a.e.d = d;
                                                                        break Label_0857;
                                                                    }
                                                                    case 22: {
                                                                        a.c.b = d;
                                                                        break Label_0857;
                                                                    }
                                                                    case 21: {
                                                                        a.e.e = d;
                                                                        break Label_0857;
                                                                    }
                                                                }
                                                                break;
                                                            }
                                                            case 97: {
                                                                a.e.p0 = d;
                                                                break;
                                                            }
                                                            case 94: {
                                                                a.e.T = d;
                                                                break;
                                                            }
                                                            case 93: {
                                                                a.e.M = d;
                                                                break;
                                                            }
                                                            case 78: {
                                                                a.c.c = d;
                                                                break;
                                                            }
                                                            case 76: {
                                                                a.d.e = d;
                                                                break;
                                                            }
                                                            case 66: {
                                                                a.d.f = d;
                                                                break;
                                                            }
                                                            case 64: {
                                                                a.d.b = d;
                                                                break;
                                                            }
                                                            case 38: {
                                                                a.a = d;
                                                                break;
                                                            }
                                                            case 34: {
                                                                a.e.I = d;
                                                                break;
                                                            }
                                                            case 31: {
                                                                a.e.L = d;
                                                                break;
                                                            }
                                                            case 18: {
                                                                a.e.g = d;
                                                                break;
                                                            }
                                                            case 17: {
                                                                a.e.f = d;
                                                                break;
                                                            }
                                                            case 16: {
                                                                a.e.O = d;
                                                                break;
                                                            }
                                                            case 15: {
                                                                a.e.S = d;
                                                                break;
                                                            }
                                                            case 14: {
                                                                a.e.P = d;
                                                                break;
                                                            }
                                                            case 13: {
                                                                a.e.N = d;
                                                                break;
                                                            }
                                                            case 12: {
                                                                a.e.R = d;
                                                                break;
                                                            }
                                                            case 11: {
                                                                a.e.Q = d;
                                                                break;
                                                            }
                                                            case 2: {
                                                                a.e.J = d;
                                                                break;
                                                            }
                                                        }
                                                    }
                                                    else {
                                                        a.e.h0 = d;
                                                    }
                                                }
                                                else {
                                                    a.e.g0 = d;
                                                }
                                            }
                                            else {
                                                a.e.B = d;
                                            }
                                        }
                                        else {
                                            a.e.A = d;
                                        }
                                    }
                                    else {
                                        a.e.X = d;
                                    }
                                }
                                else {
                                    a.e.W = d;
                                }
                            }
                            else {
                                a.e.H = d;
                            }
                        }
                        else {
                            a.e.F = d;
                        }
                    }
                    else {
                        a.e.K = d;
                    }
                }
                else {
                    a.e.E = d;
                }
            }
            else {
                a.e.D = d;
            }
        }
    }
    
    private static void T0(final a a, final int n, final String z) {
        if (n != 5) {
            if (n != 65) {
                if (n != 74) {
                    if (n != 77) {
                        if (n != 87) {
                            if (n != 90) {
                                Log.w("ConstraintSet", "Unknown attribute 0x");
                            }
                            else {
                                a.d.l = z;
                            }
                        }
                    }
                    else {
                        a.e.l0 = z;
                    }
                }
                else {
                    a.e.k0 = z;
                }
            }
            else {
                a.d.d = z;
            }
        }
        else {
            a.e.z = z;
        }
    }
    
    private static void U0(final a a, final int n, final boolean b) {
        if (n != 44) {
            if (n != 75) {
                if (n != 87) {
                    if (n != 80) {
                        if (n != 81) {
                            Log.w("ConstraintSet", "Unknown attribute 0x");
                        }
                        else {
                            a.e.n0 = b;
                        }
                    }
                    else {
                        a.e.m0 = b;
                    }
                }
            }
            else {
                a.e.o0 = b;
            }
        }
        else {
            a.f.m = b;
        }
    }
    
    private int[] Z(final View view, String original) {
        final String[] split = original.split(",");
        final Context context = view.getContext();
        original = (String)(Object)new int[split.length];
        int i;
        int newLength;
        for (i = 0, newLength = 0; i < split.length; ++i, ++newLength) {
            final String trim = split[i].trim();
            int int1;
            try {
                int1 = j.g.class.getField(trim).getInt(null);
            }
            catch (Exception ex) {
                int1 = 0;
            }
            int identifier = int1;
            if (int1 == 0) {
                identifier = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            int intValue;
            if ((intValue = identifier) == 0) {
                intValue = identifier;
                if (view.isInEditMode()) {
                    intValue = identifier;
                    if (view.getParent() instanceof ConstraintLayout) {
                        final Object l = ((ConstraintLayout)view.getParent()).l(0, trim);
                        intValue = identifier;
                        if (l != null) {
                            intValue = identifier;
                            if (l instanceof Integer) {
                                intValue = (int)l;
                            }
                        }
                    }
                }
            }
            original[newLength] = intValue;
        }
        Object copy = original;
        if (newLength != split.length) {
            copy = Arrays.copyOf((int[])(Object)original, newLength);
        }
        return (int[])copy;
    }
    
    private void d0(int i, int n, final int n2, final int n3, final int[] array, final float[] array2, int w, final int n4, final int n5) {
        if (array.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (array2 != null && array2.length != array.length) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (array2 != null) {
            this.i0(array[0]).e.V = array2[0];
        }
        this.i0(array[0]).e.W = w;
        this.L(array[0], n4, i, n, -1);
        for (i = 1; i < array.length; ++i) {
            n = array[i];
            w = array[i];
            n = i - 1;
            this.L(w, n4, array[n], n5, -1);
            this.L(array[n], n5, array[i], n4, -1);
            if (array2 != null) {
                this.i0(array[i]).e.V = array2[i];
            }
        }
        this.L(array[array.length - 1], n5, n2, n3, -1);
    }
    
    private void h(final androidx.constraintlayout.widget.a.b b, final String... array) {
        for (int i = 0; i < array.length; ++i) {
            if (this.e.containsKey(array[i])) {
                final androidx.constraintlayout.widget.a a = this.e.get(array[i]);
                if (a != null) {
                    if (a.e() != b) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("ConstraintAttribute is already a ");
                        sb.append(a.e().name());
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
            }
            else {
                this.e.put(array[i], new androidx.constraintlayout.widget.a(array[i], b));
            }
        }
    }
    
    private a h0(final Context context, final AttributeSet set, final boolean b) {
        final a a = new a();
        int[] array;
        if (b) {
            array = androidx.constraintlayout.widget.j.m.M8;
        }
        else {
            array = androidx.constraintlayout.widget.j.m.Z3;
        }
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, array);
        this.G0(context, a, obtainStyledAttributes, b);
        obtainStyledAttributes.recycle();
        return a;
    }
    
    private a i0(final int i) {
        if (!this.g.containsKey(i)) {
            this.g.put(i, new a());
        }
        return this.g.get(i);
    }
    
    static String m0(final int n) {
        for (final Field field : e.class.getDeclaredFields()) {
            if (field.getName().contains("_") && field.getType() == Integer.TYPE && Modifier.isStatic(field.getModifiers()) && Modifier.isFinal(field.getModifiers())) {
                try {
                    if (field.getInt(null) == n) {
                        return field.getName();
                    }
                }
                catch (IllegalAccessException ex) {
                    ex.printStackTrace();
                }
            }
        }
        return "UNKNOWN";
    }
    
    static String p0(final Context context, final int n, final XmlPullParser xmlPullParser) {
        final StringBuilder sb = new StringBuilder();
        sb.append(".(");
        sb.append(androidx.constraintlayout.motion.widget.c.i(context, n));
        sb.append(".xml:");
        sb.append(xmlPullParser.getLineNumber());
        sb.append(") \"");
        sb.append(xmlPullParser.getName());
        sb.append("\"");
        return sb.toString();
    }
    
    public static a w(final Context context, final XmlPullParser xmlPullParser) {
        final AttributeSet attributeSet = Xml.asAttributeSet(xmlPullParser);
        final a a = new a();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.j.m.M8);
        H0(context, a, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return a;
    }
    
    private static int y0(final TypedArray typedArray, final int n, int n2) {
        if ((n2 = typedArray.getResourceId(n, n2)) == -1) {
            n2 = typedArray.getInt(n, -1);
        }
        return n2;
    }
    
    public void A(final int n, int n2) {
        int n3;
        int n4;
        int n5;
        if (n2 == 0) {
            n3 = 0;
            n4 = 6;
            n5 = 0;
            n2 = 7;
        }
        else {
            n4 = 7;
            final int n6 = 6;
            n3 = n2;
            n5 = n2;
            n2 = n6;
        }
        this.x(n, n3, n4, 0, n5, n2, 0, 0.5f);
    }
    
    public void A1(final int n, final float y) {
        this.i0(n).e.y = y;
    }
    
    public void B(final int i, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final float x) {
        this.L(i, 6, n, n2, n3);
        this.L(i, 7, n4, n5, n6);
        final a a = this.g.get(i);
        if (a != null) {
            a.e.x = x;
        }
    }
    
    public void B1(final int n, final int x) {
        this.i0(n).e.X = x;
    }
    
    public void C(final int n, int n2) {
        int n3;
        int n4;
        int n5;
        if (n2 == 0) {
            n3 = 0;
            n4 = 3;
            n5 = 0;
            n2 = 4;
        }
        else {
            n4 = 4;
            final int n6 = 3;
            n3 = n2;
            n5 = n2;
            n2 = n6;
        }
        this.x(n, n3, n4, 0, n5, n2, 0, 0.5f);
    }
    
    public void C1(final int n, final float u) {
        this.i0(n).e.U = u;
    }
    
    public void D(final int i, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final float y) {
        this.L(i, 3, n, n2, n3);
        this.L(i, 4, n4, n5, n6);
        final a a = this.g.get(i);
        if (a != null) {
            a.e.y = y;
        }
    }
    
    public void D0(final a a, final String s) {
        final String[] split = s.split(",");
        for (int i = 0; i < split.length; ++i) {
            final String[] split2 = split[i].split("=");
            if (split2.length != 2) {
                final StringBuilder sb = new StringBuilder();
                sb.append(" Unable to parse ");
                sb.append(split[i]);
                Log.w("ConstraintSet", sb.toString());
            }
            else {
                a.q(split2[0], Float.parseFloat(split2[1]));
            }
        }
    }
    
    public void D1(final int n, final int b) {
        this.i0(n).c.b = b;
    }
    
    public void E(final int i) {
        this.g.remove(i);
    }
    
    public void E0(final a a, final String s) {
        final String[] split = s.split(",");
        for (int i = 0; i < split.length; ++i) {
            final String[] split2 = split[i].split("=");
            if (split2.length != 2) {
                final StringBuilder sb = new StringBuilder();
                sb.append(" Unable to parse ");
                sb.append(split[i]);
                Log.w("ConstraintSet", sb.toString());
            }
            else {
                a.q(split2[0], Integer.decode(split2[1]));
            }
        }
    }
    
    public void E1(final int n, final int c) {
        this.i0(n).c.c = c;
    }
    
    public void F(final int n, final int n2) {
        if (this.g.containsKey(n)) {
            final a a = this.g.get(n);
            if (a == null) {
                return;
            }
            switch (n2) {
                default: {
                    throw new IllegalArgumentException("unknown constraint");
                }
                case 8: {
                    final b e = a.e;
                    e.C = -1.0f;
                    e.B = -1;
                    e.A = -1;
                    break;
                }
                case 7: {
                    final b e2 = a.e;
                    e2.v = -1;
                    e2.w = -1;
                    e2.K = 0;
                    e2.R = Integer.MIN_VALUE;
                    break;
                }
                case 6: {
                    final b e3 = a.e;
                    e3.t = -1;
                    e3.u = -1;
                    e3.L = 0;
                    e3.S = Integer.MIN_VALUE;
                    break;
                }
                case 5: {
                    final b e4 = a.e;
                    e4.q = -1;
                    e4.r = -1;
                    e4.s = -1;
                    e4.M = 0;
                    e4.T = Integer.MIN_VALUE;
                    break;
                }
                case 4: {
                    final b e5 = a.e;
                    e5.o = -1;
                    e5.p = -1;
                    e5.J = 0;
                    e5.Q = Integer.MIN_VALUE;
                    break;
                }
                case 3: {
                    final b e6 = a.e;
                    e6.n = -1;
                    e6.m = -1;
                    e6.I = 0;
                    e6.O = Integer.MIN_VALUE;
                    break;
                }
                case 2: {
                    final b e7 = a.e;
                    e7.l = -1;
                    e7.k = -1;
                    e7.H = -1;
                    e7.P = Integer.MIN_VALUE;
                    break;
                }
                case 1: {
                    final b e8 = a.e;
                    e8.j = -1;
                    e8.i = -1;
                    e8.G = -1;
                    e8.N = Integer.MIN_VALUE;
                    break;
                }
            }
        }
    }
    
    public void F0(final a a, final String s) {
        final String[] g1 = G1(s);
        for (int i = 0; i < g1.length; ++i) {
            final String[] split = g1[i].split("=");
            final StringBuilder sb = new StringBuilder();
            sb.append(" Unable to parse ");
            sb.append(g1[i]);
            Log.w("ConstraintSet", sb.toString());
            a.s(split[0], split[1]);
        }
    }
    
    public void G(final Context context, final int n) {
        this.H((ConstraintLayout)LayoutInflater.from(context).inflate(n, (ViewGroup)null));
    }
    
    public void H(final ConstraintLayout constraintLayout) {
        final int childCount = constraintLayout.getChildCount();
        this.g.clear();
        for (int i = 0; i < childCount; ++i) {
            final View child = constraintLayout.getChildAt(i);
            final ConstraintLayout.b b = (ConstraintLayout.b)child.getLayoutParams();
            final int id = child.getId();
            if (this.f && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.g.containsKey(id)) {
                this.g.put(id, new a());
            }
            final a a = this.g.get(id);
            if (a != null) {
                a.g = androidx.constraintlayout.widget.a.d(this.e, child);
                a.k(id, b);
                a.c.b = child.getVisibility();
                final int sdk_INT = Build$VERSION.SDK_INT;
                if (sdk_INT >= 17) {
                    a.c.d = child.getAlpha();
                    a.f.b = child.getRotation();
                    a.f.c = child.getRotationX();
                    a.f.d = child.getRotationY();
                    a.f.e = child.getScaleX();
                    a.f.f = child.getScaleY();
                    final float pivotX = child.getPivotX();
                    final float pivotY = child.getPivotY();
                    if (pivotX != 0.0 || pivotY != 0.0) {
                        final e f = a.f;
                        f.g = pivotX;
                        f.h = pivotY;
                    }
                    a.f.j = child.getTranslationX();
                    a.f.k = child.getTranslationY();
                    if (sdk_INT >= 21) {
                        a.f.l = child.getTranslationZ();
                        final e f2 = a.f;
                        if (f2.m) {
                            f2.n = child.getElevation();
                        }
                    }
                }
                if (child instanceof Barrier) {
                    final Barrier barrier = (Barrier)child;
                    a.e.o0 = barrier.getAllowsGoneWidget();
                    a.e.j0 = barrier.getReferencedIds();
                    a.e.g0 = barrier.getType();
                    a.e.h0 = barrier.getMargin();
                }
            }
        }
    }
    
    public void H1(final Writer writer, final ConstraintLayout constraintLayout, final int n) throws IOException {
        writer.write("\n---------------------------------------------\n");
        if ((n & 0x1) == 0x1) {
            new g(writer, constraintLayout, n).i();
        }
        else {
            new f(writer, constraintLayout, n).g();
        }
        writer.write("\n---------------------------------------------\n");
    }
    
    public void I(final e e) {
        this.g.clear();
        for (final Integer n : e.g.keySet()) {
            final a a = e.g.get(n);
            if (a == null) {
                continue;
            }
            this.g.put(n, a.j());
        }
    }
    
    public void I0(final ConstraintLayout constraintLayout) {
        for (int childCount = constraintLayout.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = constraintLayout.getChildAt(i);
            final ConstraintLayout.b b = (ConstraintLayout.b)child.getLayoutParams();
            final int id = child.getId();
            if (this.f && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.g.containsKey(id)) {
                this.g.put(id, new a());
            }
            final a a = this.g.get(id);
            if (a != null) {
                if (!a.e.b) {
                    a.k(id, b);
                    if (child instanceof androidx.constraintlayout.widget.b) {
                        a.e.j0 = ((Barrier)child).getReferencedIds();
                        if (child instanceof Barrier) {
                            final Barrier barrier = (Barrier)child;
                            a.e.o0 = barrier.getAllowsGoneWidget();
                            a.e.g0 = barrier.getType();
                            a.e.h0 = barrier.getMargin();
                        }
                    }
                    a.e.b = true;
                }
                final d c = a.c;
                if (!c.a) {
                    c.b = child.getVisibility();
                    a.c.d = child.getAlpha();
                    a.c.a = true;
                }
                final int sdk_INT = Build$VERSION.SDK_INT;
                if (sdk_INT >= 17) {
                    final e f = a.f;
                    if (!f.a) {
                        f.a = true;
                        f.b = child.getRotation();
                        a.f.c = child.getRotationX();
                        a.f.d = child.getRotationY();
                        a.f.e = child.getScaleX();
                        a.f.f = child.getScaleY();
                        final float pivotX = child.getPivotX();
                        final float pivotY = child.getPivotY();
                        if (pivotX != 0.0 || pivotY != 0.0) {
                            final e f2 = a.f;
                            f2.g = pivotX;
                            f2.h = pivotY;
                        }
                        a.f.j = child.getTranslationX();
                        a.f.k = child.getTranslationY();
                        if (sdk_INT >= 21) {
                            a.f.l = child.getTranslationZ();
                            final e f3 = a.f;
                            if (f3.m) {
                                f3.n = child.getElevation();
                            }
                        }
                    }
                }
            }
        }
    }
    
    public void J(final androidx.constraintlayout.widget.f f) {
        final int childCount = f.getChildCount();
        this.g.clear();
        for (int i = 0; i < childCount; ++i) {
            final View child = f.getChildAt(i);
            final androidx.constraintlayout.widget.f.a a = (androidx.constraintlayout.widget.f.a)child.getLayoutParams();
            final int id = child.getId();
            if (this.f && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.g.containsKey(id)) {
                this.g.put(id, new a());
            }
            final a a2 = this.g.get(id);
            if (a2 != null) {
                if (child instanceof androidx.constraintlayout.widget.b) {
                    a2.m((androidx.constraintlayout.widget.b)child, id, a);
                }
                a2.l(id, a);
            }
        }
    }
    
    public void J0(final e e) {
        for (final Integer key : e.g.keySet()) {
            final int intValue = key;
            final a a = e.g.get(key);
            if (!this.g.containsKey(intValue)) {
                this.g.put(intValue, new a());
            }
            final a a2 = this.g.get(intValue);
            if (a2 == null) {
                continue;
            }
            final b e2 = a2.e;
            if (!e2.b) {
                e2.a(a.e);
            }
            final d c = a2.c;
            if (!c.a) {
                c.a(a.c);
            }
            final e f = a2.f;
            if (!f.a) {
                f.a(a.f);
            }
            final c d = a2.d;
            if (!d.a) {
                d.a(a.d);
            }
            for (final String key2 : a.g.keySet()) {
                if (!a2.g.containsKey(key2)) {
                    a2.g.put(key2, a.g.get(key2));
                }
            }
        }
    }
    
    public void K(final int i, final int n, final int j, final int n2) {
        if (!this.g.containsKey(i)) {
            this.g.put(i, new a());
        }
        final a a = this.g.get(i);
        if (a == null) {
            return;
        }
        b b2 = null;
        switch (n) {
            default: {
                final StringBuilder sb = new StringBuilder();
                sb.append(this.F1(n));
                sb.append(" to ");
                sb.append(this.F1(n2));
                sb.append(" unknown");
                throw new IllegalArgumentException(sb.toString());
            }
            case 7: {
                if (n2 == 7) {
                    final b e = a.e;
                    e.w = j;
                    e.v = -1;
                    return;
                }
                if (n2 == 6) {
                    final b e2 = a.e;
                    e2.v = j;
                    e2.w = -1;
                    return;
                }
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("right to ");
                sb2.append(this.F1(n2));
                sb2.append(" undefined");
                throw new IllegalArgumentException(sb2.toString());
            }
            case 6: {
                if (n2 == 6) {
                    final b e3 = a.e;
                    e3.u = j;
                    e3.t = -1;
                    return;
                }
                if (n2 == 7) {
                    final b e4 = a.e;
                    e4.t = j;
                    e4.u = -1;
                    return;
                }
                final StringBuilder sb3 = new StringBuilder();
                sb3.append("right to ");
                sb3.append(this.F1(n2));
                sb3.append(" undefined");
                throw new IllegalArgumentException(sb3.toString());
            }
            case 5: {
                b b;
                if (n2 == 5) {
                    b = a.e;
                    b.q = j;
                }
                else if (n2 == 3) {
                    b = a.e;
                    b.r = j;
                }
                else {
                    if (n2 != 4) {
                        final StringBuilder sb4 = new StringBuilder();
                        sb4.append("right to ");
                        sb4.append(this.F1(n2));
                        sb4.append(" undefined");
                        throw new IllegalArgumentException(sb4.toString());
                    }
                    b = a.e;
                    b.s = j;
                }
                b.p = -1;
                b.o = -1;
                b.m = -1;
                b.n = -1;
                return;
            }
            case 4: {
                if (n2 == 4) {
                    b2 = a.e;
                    b2.p = j;
                    b2.o = -1;
                    break;
                }
                if (n2 == 3) {
                    b2 = a.e;
                    b2.o = j;
                    b2.p = -1;
                    break;
                }
                final StringBuilder sb5 = new StringBuilder();
                sb5.append("right to ");
                sb5.append(this.F1(n2));
                sb5.append(" undefined");
                throw new IllegalArgumentException(sb5.toString());
            }
            case 3: {
                if (n2 == 3) {
                    b2 = a.e;
                    b2.m = j;
                    b2.n = -1;
                    break;
                }
                if (n2 == 4) {
                    b2 = a.e;
                    b2.n = j;
                    b2.m = -1;
                    break;
                }
                final StringBuilder sb6 = new StringBuilder();
                sb6.append("right to ");
                sb6.append(this.F1(n2));
                sb6.append(" undefined");
                throw new IllegalArgumentException(sb6.toString());
            }
            case 2: {
                if (n2 == 1) {
                    final b e5 = a.e;
                    e5.k = j;
                    e5.l = -1;
                    return;
                }
                if (n2 == 2) {
                    final b e6 = a.e;
                    e6.l = j;
                    e6.k = -1;
                    return;
                }
                final StringBuilder sb7 = new StringBuilder();
                sb7.append("right to ");
                sb7.append(this.F1(n2));
                sb7.append(" undefined");
                throw new IllegalArgumentException(sb7.toString());
            }
            case 1: {
                if (n2 == 1) {
                    final b e7 = a.e;
                    e7.i = j;
                    e7.j = -1;
                    return;
                }
                if (n2 == 2) {
                    final b e8 = a.e;
                    e8.j = j;
                    e8.i = -1;
                    return;
                }
                final StringBuilder sb8 = new StringBuilder();
                sb8.append("left to ");
                sb8.append(this.F1(n2));
                sb8.append(" undefined");
                throw new IllegalArgumentException(sb8.toString());
            }
        }
        b2.q = -1;
        b2.r = -1;
        b2.s = -1;
    }
    
    public void K0(final String key) {
        this.e.remove(key);
    }
    
    public void L(final int i, final int n, final int j, final int n2, final int n3) {
        if (!this.g.containsKey(i)) {
            this.g.put(i, new a());
        }
        final a a = this.g.get(i);
        if (a == null) {
            return;
        }
        switch (n) {
            default: {
                final StringBuilder sb = new StringBuilder();
                sb.append(this.F1(n));
                sb.append(" to ");
                sb.append(this.F1(n2));
                sb.append(" unknown");
                throw new IllegalArgumentException(sb.toString());
            }
            case 7: {
                if (n2 == 7) {
                    final b e = a.e;
                    e.w = j;
                    e.v = -1;
                }
                else {
                    if (n2 != 6) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("right to ");
                        sb2.append(this.F1(n2));
                        sb2.append(" undefined");
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    final b e2 = a.e;
                    e2.v = j;
                    e2.w = -1;
                }
                a.e.K = n3;
                break;
            }
            case 6: {
                if (n2 == 6) {
                    final b e3 = a.e;
                    e3.u = j;
                    e3.t = -1;
                }
                else {
                    if (n2 != 7) {
                        final StringBuilder sb3 = new StringBuilder();
                        sb3.append("right to ");
                        sb3.append(this.F1(n2));
                        sb3.append(" undefined");
                        throw new IllegalArgumentException(sb3.toString());
                    }
                    final b e4 = a.e;
                    e4.t = j;
                    e4.u = -1;
                }
                a.e.L = n3;
                break;
            }
            case 5: {
                b b;
                if (n2 == 5) {
                    b = a.e;
                    b.q = j;
                }
                else if (n2 == 3) {
                    b = a.e;
                    b.r = j;
                }
                else {
                    if (n2 != 4) {
                        final StringBuilder sb4 = new StringBuilder();
                        sb4.append("right to ");
                        sb4.append(this.F1(n2));
                        sb4.append(" undefined");
                        throw new IllegalArgumentException(sb4.toString());
                    }
                    b = a.e;
                    b.s = j;
                }
                b.p = -1;
                b.o = -1;
                b.m = -1;
                b.n = -1;
                break;
            }
            case 4: {
                b b2;
                if (n2 == 4) {
                    b2 = a.e;
                    b2.p = j;
                    b2.o = -1;
                }
                else {
                    if (n2 != 3) {
                        final StringBuilder sb5 = new StringBuilder();
                        sb5.append("right to ");
                        sb5.append(this.F1(n2));
                        sb5.append(" undefined");
                        throw new IllegalArgumentException(sb5.toString());
                    }
                    b2 = a.e;
                    b2.o = j;
                    b2.p = -1;
                }
                b2.q = -1;
                b2.r = -1;
                b2.s = -1;
                a.e.J = n3;
                break;
            }
            case 3: {
                b b3;
                if (n2 == 3) {
                    b3 = a.e;
                    b3.m = j;
                    b3.n = -1;
                }
                else {
                    if (n2 != 4) {
                        final StringBuilder sb6 = new StringBuilder();
                        sb6.append("right to ");
                        sb6.append(this.F1(n2));
                        sb6.append(" undefined");
                        throw new IllegalArgumentException(sb6.toString());
                    }
                    b3 = a.e;
                    b3.n = j;
                    b3.m = -1;
                }
                b3.q = -1;
                b3.r = -1;
                b3.s = -1;
                a.e.I = n3;
                break;
            }
            case 2: {
                if (n2 == 1) {
                    final b e5 = a.e;
                    e5.k = j;
                    e5.l = -1;
                }
                else {
                    if (n2 != 2) {
                        final StringBuilder sb7 = new StringBuilder();
                        sb7.append("right to ");
                        sb7.append(this.F1(n2));
                        sb7.append(" undefined");
                        throw new IllegalArgumentException(sb7.toString());
                    }
                    final b e6 = a.e;
                    e6.l = j;
                    e6.k = -1;
                }
                a.e.H = n3;
                break;
            }
            case 1: {
                if (n2 == 1) {
                    final b e7 = a.e;
                    e7.i = j;
                    e7.j = -1;
                }
                else {
                    if (n2 != 2) {
                        final StringBuilder sb8 = new StringBuilder();
                        sb8.append("Left to ");
                        sb8.append(this.F1(n2));
                        sb8.append(" undefined");
                        throw new IllegalArgumentException(sb8.toString());
                    }
                    final b e8 = a.e;
                    e8.j = j;
                    e8.i = -1;
                }
                a.e.G = n3;
                break;
            }
        }
    }
    
    public void L0(final int n) {
        if (this.g.containsKey(n)) {
            final a a = this.g.get(n);
            if (a == null) {
                return;
            }
            final b e = a.e;
            int j = e.j;
            final int k = e.k;
            int n8;
            if (j == -1 && k == -1) {
                final int t = e.t;
                final int v = e.v;
                Label_0209: {
                    if (t != -1 || v != -1) {
                        int n3;
                        int n5;
                        int n6;
                        if (t != -1 && v != -1) {
                            this.L(t, 7, v, 6, 0);
                            final int n2 = 6;
                            n3 = 7;
                            final int n4 = v;
                            n5 = j;
                            n6 = n2;
                            j = n4;
                        }
                        else {
                            if (v == -1) {
                                break Label_0209;
                            }
                            n5 = e.l;
                            if (n5 != -1) {
                                n6 = 7;
                                n3 = 7;
                            }
                            else {
                                n5 = e.i;
                                if (n5 == -1) {
                                    break Label_0209;
                                }
                                final int n7 = 6;
                                n3 = 6;
                                j = v;
                                n6 = n7;
                            }
                        }
                        this.L(j, n6, n5, n3, 0);
                    }
                }
                this.F(n, 6);
                n8 = 7;
            }
            else {
                Label_0323: {
                    int n10;
                    int n11;
                    int n12;
                    if (j != -1 && k != -1) {
                        this.L(j, 2, k, 1, 0);
                        final int n9 = 1;
                        n10 = 2;
                        n11 = j;
                        j = k;
                        n12 = n9;
                    }
                    else {
                        n11 = e.l;
                        if (n11 != -1) {
                            n12 = 2;
                            n10 = 2;
                        }
                        else {
                            n11 = e.i;
                            if (n11 == -1) {
                                break Label_0323;
                            }
                            final int n13 = 1;
                            n10 = 1;
                            j = k;
                            n12 = n13;
                        }
                    }
                    this.L(j, n12, n11, n10, 0);
                }
                this.F(n, 1);
                n8 = 2;
            }
            this.F(n, n8);
        }
    }
    
    public void M(final int n, final int a, final int b, final float c) {
        final b e = this.i0(n).e;
        e.A = a;
        e.B = b;
        e.C = c;
    }
    
    public void M0(final int n) {
        Label_0162: {
            if (this.g.containsKey(n)) {
                final a a = this.g.get(n);
                if (a == null) {
                    return;
                }
                final b e = a.e;
                int n2 = e.n;
                final int o = e.o;
                if (n2 != -1 || o != -1) {
                    int n4;
                    int n5;
                    int n6;
                    if (n2 != -1 && o != -1) {
                        this.L(n2, 4, o, 3, 0);
                        final int n3 = 3;
                        n4 = 4;
                        n5 = n2;
                        n2 = o;
                        n6 = n3;
                    }
                    else {
                        n5 = e.p;
                        if (n5 != -1) {
                            n6 = 4;
                            n4 = 4;
                        }
                        else {
                            n5 = e.m;
                            if (n5 == -1) {
                                break Label_0162;
                            }
                            final int n7 = 3;
                            n4 = 3;
                            n2 = o;
                            n6 = n7;
                        }
                    }
                    this.L(n2, n6, n5, n4, 0);
                }
            }
        }
        this.F(n, 3);
        this.F(n, 4);
    }
    
    public void N(final int n, final int z) {
        this.i0(n).e.Z = z;
    }
    
    public void N0(final int n, final float d) {
        this.i0(n).c.d = d;
    }
    
    public void O(final int n, final int y) {
        this.i0(n).e.Y = y;
    }
    
    public void O0(final int n, final boolean m) {
        if (Build$VERSION.SDK_INT >= 21) {
            this.i0(n).f.m = m;
        }
    }
    
    public void P(final int n, final int e) {
        this.i0(n).e.e = e;
    }
    
    public void P0(final int n, final int i0) {
        this.i0(n).e.i0 = i0;
    }
    
    public void Q(final int n, final int b0) {
        this.i0(n).e.b0 = b0;
    }
    
    public void Q0(final int n, final String s, final int n2) {
        this.i0(n).p(s, n2);
    }
    
    public void R(final int n, final int a0) {
        this.i0(n).e.a0 = a0;
    }
    
    public void S(final int n, final int d0) {
        this.i0(n).e.d0 = d0;
    }
    
    public void T(final int n, final int c0) {
        this.i0(n).e.c0 = c0;
    }
    
    public void U(final int n, final float f0) {
        this.i0(n).e.f0 = f0;
    }
    
    public void V(final int n, final float e0) {
        this.i0(n).e.e0 = e0;
    }
    
    public void V0(final int n, final String z) {
        this.i0(n).e.z = z;
    }
    
    public void W(final int n, final int d) {
        this.i0(n).e.d = d;
    }
    
    public void W0(final int n, final int d) {
        this.i0(n).e.D = d;
    }
    
    public void X(final int n, final boolean n2) {
        this.i0(n).e.n0 = n2;
    }
    
    public void X0(final int n, final int e) {
        this.i0(n).e.E = e;
    }
    
    public void Y(final int n, final boolean m0) {
        this.i0(n).e.m0 = m0;
    }
    
    public void Y0(final int n, final float n2) {
        if (Build$VERSION.SDK_INT >= 21) {
            this.i0(n).f.n = n2;
            this.i0(n).f.m = true;
        }
    }
    
    public void Z0(final int n, final String s, final float n2) {
        this.i0(n).q(s, n2);
    }
    
    public void a0(final int n, final int f) {
        final b e = this.i0(n).e;
        e.a = true;
        e.F = f;
    }
    
    public void a1(final boolean f) {
        this.f = f;
    }
    
    public void b0(final int n, final int g0, final int h0, final int... j0) {
        final b e = this.i0(n).e;
        e.i0 = 1;
        e.g0 = g0;
        e.h0 = h0;
        e.a = false;
        e.j0 = j0;
    }
    
    public void b1(final int n, final int n2, final int n3) {
        final a i0 = this.i0(n);
        switch (n2) {
            default: {
                throw new IllegalArgumentException("unknown constraint");
            }
            case 7: {
                i0.e.R = n3;
                break;
            }
            case 6: {
                i0.e.S = n3;
                break;
            }
            case 5: {
                i0.e.T = n3;
                break;
            }
            case 4: {
                i0.e.Q = n3;
                break;
            }
            case 3: {
                i0.e.O = n3;
                break;
            }
            case 2: {
                i0.e.P = n3;
                break;
            }
            case 1: {
                i0.e.N = n3;
                break;
            }
        }
    }
    
    public void c0(final int n, final int n2, final int n3, final int n4, final int[] array, final float[] array2, final int n5) {
        this.d0(n, n2, n3, n4, array, array2, n5, 1, 2);
    }
    
    public void c1(final int n, final int f) {
        this.i0(n).e.f = f;
        this.i0(n).e.g = -1;
        this.i0(n).e.h = -1.0f;
    }
    
    public void d1(final int n, final int g) {
        this.i0(n).e.g = g;
        this.i0(n).e.f = -1;
        this.i0(n).e.h = -1.0f;
    }
    
    public void e0(final int n, final int n2, final int n3, final int n4, final int[] array, final float[] array2, final int n5) {
        this.d0(n, n2, n3, n4, array, array2, n5, 6, 7);
    }
    
    public void e1(final int n, final float h) {
        this.i0(n).e.h = h;
        this.i0(n).e.g = -1;
        this.i0(n).e.f = -1;
    }
    
    public void f0(int i, int n, final int n2, final int n3, final int[] array, final float[] array2, int x) {
        if (array.length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (array2 != null && array2.length != array.length) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (array2 != null) {
            this.i0(array[0]).e.U = array2[0];
        }
        this.i0(array[0]).e.X = x;
        this.L(array[0], 3, i, n, 0);
        for (i = 1; i < array.length; ++i) {
            n = array[i];
            x = array[i];
            n = i - 1;
            this.L(x, 3, array[n], 4, 0);
            this.L(array[n], 4, array[i], 3, 0);
            if (array2 != null) {
                this.i0(array[i]).e.U = array2[i];
            }
        }
        this.L(array[array.length - 1], 4, n2, n3, 0);
    }
    
    public void f1(final int n, final float x) {
        this.i0(n).e.x = x;
    }
    
    public void g0(final u u, final int... array) {
        final Set<Integer> keySet = this.g.keySet();
        final int length = array.length;
        final int n = 0;
        HashSet<Integer> set2;
        if (length != 0) {
            final HashSet<Integer> set = new HashSet<Integer>();
            final int length2 = array.length;
            int n2 = 0;
            while (true) {
                set2 = set;
                if (n2 >= length2) {
                    break;
                }
                set.add(array[n2]);
                ++n2;
            }
        }
        else {
            set2 = new HashSet<Integer>(keySet);
        }
        final PrintStream out = System.out;
        final StringBuilder sb = new StringBuilder();
        sb.append(set2.size());
        sb.append(" constraints");
        out.println(sb.toString());
        final StringBuilder sb2 = new StringBuilder();
        final Integer[] array2 = set2.toArray(new Integer[0]);
        for (int length3 = array2.length, i = n; i < length3; ++i) {
            final Integer n3 = array2[i];
            final a a = this.g.get(n3);
            if (a != null) {
                sb2.append("<Constraint id=");
                sb2.append(n3);
                sb2.append(" \n");
                a.e.b(u, sb2);
                sb2.append("/>\n");
            }
        }
        System.out.println(sb2.toString());
    }
    
    public void g1(final int n, final int w) {
        this.i0(n).e.W = w;
    }
    
    public void h1(final int n, final float v) {
        this.i0(n).e.V = v;
    }
    
    public void i(final String... array) {
        this.h(androidx.constraintlayout.widget.a.b.I, array);
    }
    
    public void i1(final int n, final String s, final int n2) {
        this.i0(n).r(s, n2);
    }
    
    public void j(final String... array) {
        this.h(androidx.constraintlayout.widget.a.b.H, array);
    }
    
    public boolean j0(final int n) {
        return this.i0(n).f.m;
    }
    
    public void j1(final int n, final int p2) {
        if (p2 >= 0 && p2 <= 3) {
            this.i0(n).e.p0 = p2;
        }
    }
    
    public void k(final String... array) {
        this.h(androidx.constraintlayout.widget.a.b.G, array);
    }
    
    public a k0(final int n) {
        if (this.g.containsKey(n)) {
            return this.g.get(n);
        }
        return null;
    }
    
    public void k1(final int n, final int n2, final int g) {
        final a i0 = this.i0(n);
        switch (n2) {
            default: {
                throw new IllegalArgumentException("unknown constraint");
            }
            case 7: {
                i0.e.K = g;
                break;
            }
            case 6: {
                i0.e.L = g;
                break;
            }
            case 5: {
                i0.e.M = g;
                break;
            }
            case 4: {
                i0.e.J = g;
                break;
            }
            case 3: {
                i0.e.I = g;
                break;
            }
            case 2: {
                i0.e.H = g;
                break;
            }
            case 1: {
                i0.e.G = g;
                break;
            }
        }
    }
    
    public void l(final String... array) {
        this.h(androidx.constraintlayout.widget.a.b.K, array);
    }
    
    public HashMap<String, androidx.constraintlayout.widget.a> l0() {
        return this.e;
    }
    
    public void l1(final int n, final int... j0) {
        this.i0(n).e.j0 = j0;
    }
    
    public void m(final int n, final int n2, final int n3) {
        int n4;
        if (n2 == 0) {
            n4 = 1;
        }
        else {
            n4 = 2;
        }
        this.L(n, 1, n2, n4, 0);
        int n5;
        if (n3 == 0) {
            n5 = 2;
        }
        else {
            n5 = 1;
        }
        this.L(n, 2, n3, n5, 0);
        if (n2 != 0) {
            this.L(n2, 2, n, 1, 0);
        }
        if (n3 != 0) {
            this.L(n3, 1, n, 2, 0);
        }
    }
    
    public void m1(final int n, final float b) {
        this.i0(n).f.b = b;
    }
    
    public void n(final int n, final int n2, final int n3) {
        int n4;
        if (n2 == 0) {
            n4 = 6;
        }
        else {
            n4 = 7;
        }
        this.L(n, 6, n2, n4, 0);
        int n5;
        if (n3 == 0) {
            n5 = 7;
        }
        else {
            n5 = 6;
        }
        this.L(n, 7, n3, n5, 0);
        if (n2 != 0) {
            this.L(n2, 7, n, 6, 0);
        }
        if (n3 != 0) {
            this.L(n3, 6, n, 7, 0);
        }
    }
    
    public int n0(final int n) {
        return this.i0(n).e.e;
    }
    
    public void n1(final int n, final float c) {
        this.i0(n).f.c = c;
    }
    
    public void o(final int n, final int n2, final int n3) {
        int n4;
        if (n2 == 0) {
            n4 = 3;
        }
        else {
            n4 = 4;
        }
        this.L(n, 3, n2, n4, 0);
        int n5;
        if (n3 == 0) {
            n5 = 4;
        }
        else {
            n5 = 3;
        }
        this.L(n, 4, n3, n5, 0);
        if (n2 != 0) {
            this.L(n2, 4, n, 3, 0);
        }
        if (n3 != 0) {
            this.L(n3, 3, n, 4, 0);
        }
    }
    
    public int[] o0() {
        final Set<Integer> keySet = this.g.keySet();
        int i = 0;
        final Integer[] array = keySet.toArray(new Integer[0]);
        final int length = array.length;
        final int[] array2 = new int[length];
        while (i < length) {
            array2[i] = array[i];
            ++i;
        }
        return array2;
    }
    
    public void o1(final int n, final float d) {
        this.i0(n).f.d = d;
    }
    
    public void p(final ConstraintLayout constraintLayout) {
        for (int childCount = constraintLayout.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = constraintLayout.getChildAt(i);
            final int id = child.getId();
            if (!this.g.containsKey(id)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("id unknown ");
                sb.append(androidx.constraintlayout.motion.widget.c.k(child));
                Log.w("ConstraintSet", sb.toString());
            }
            else {
                if (this.f && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (this.g.containsKey(id)) {
                    final a a = this.g.get(id);
                    if (a != null) {
                        androidx.constraintlayout.widget.a.k(child, a.g);
                    }
                }
            }
        }
    }
    
    public void p1(final int n, final float e) {
        this.i0(n).f.e = e;
    }
    
    public void q(final e e) {
        for (final a a : e.g.values()) {
            if (a.h != null) {
                if (a.b != null) {
                    final Iterator<Integer> iterator2 = this.g.keySet().iterator();
                    while (iterator2.hasNext()) {
                        final a k0 = this.k0(iterator2.next());
                        final String l0 = k0.e.l0;
                        if (l0 != null && a.b.matches(l0)) {
                            a.h.e(k0);
                            k0.g.putAll((Map<? extends String, ? extends androidx.constraintlayout.widget.a>)a.g.clone());
                        }
                    }
                }
                else {
                    a.h.e(this.k0(a.a));
                }
            }
        }
    }
    
    public a q0(final int n) {
        return this.i0(n);
    }
    
    public void q1(final int n, final float f) {
        this.i0(n).f.f = f;
    }
    
    public void r(final ConstraintLayout constraintLayout) {
        this.t(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }
    
    public int[] r0(final int n) {
        final int[] j0 = this.i0(n).e.j0;
        if (j0 == null) {
            return new int[0];
        }
        return Arrays.copyOf(j0, j0.length);
    }
    
    public void r1(final int n, final String s, final String s2) {
        this.i0(n).s(s, s2);
    }
    
    public void s(final androidx.constraintlayout.widget.b b, final e e, final ConstraintLayout.b b2, final SparseArray<e> sparseArray) {
        final int id = b.getId();
        if (this.g.containsKey(id)) {
            final a a = this.g.get(id);
            if (a != null && e instanceof androidx.constraintlayout.core.widgets.j) {
                b.z(a, (androidx.constraintlayout.core.widgets.j)e, b2, sparseArray);
            }
        }
    }
    
    public int s0(final int n) {
        return this.i0(n).c.b;
    }
    
    public void s1(final int n, final float g, final float h) {
        final e f = this.i0(n).f;
        f.h = h;
        f.g = g;
    }
    
    void t(final ConstraintLayout constraintLayout, final boolean b) {
        final int childCount = constraintLayout.getChildCount();
        final HashSet<Integer> set = new HashSet<Integer>(this.g.keySet());
        final int n = 0;
        for (int i = 0; i < childCount; ++i) {
            final View child = constraintLayout.getChildAt(i);
            final int id = child.getId();
            if (!this.g.containsKey(id)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("id unknown ");
                sb.append(androidx.constraintlayout.motion.widget.c.k(child));
                Log.w("ConstraintSet", sb.toString());
            }
            else {
                if (this.f && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (this.g.containsKey(id)) {
                        set.remove(id);
                        final a a = this.g.get(id);
                        if (a != null) {
                            if (child instanceof Barrier) {
                                a.e.i0 = 1;
                                final Barrier barrier = (Barrier)child;
                                barrier.setId(id);
                                barrier.setType(a.e.g0);
                                barrier.setMargin(a.e.h0);
                                barrier.setAllowsGoneWidget(a.e.o0);
                                final b e = a.e;
                                final int[] j0 = e.j0;
                                if (j0 != null) {
                                    barrier.setReferencedIds(j0);
                                }
                                else {
                                    final String k0 = e.k0;
                                    if (k0 != null) {
                                        e.j0 = this.Z(barrier, k0);
                                        barrier.setReferencedIds(a.e.j0);
                                    }
                                }
                            }
                            final ConstraintLayout.b layoutParams = (ConstraintLayout.b)child.getLayoutParams();
                            layoutParams.e();
                            a.i(layoutParams);
                            if (b) {
                                androidx.constraintlayout.widget.a.k(child, a.g);
                            }
                            child.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
                            final d c = a.c;
                            if (c.c == 0) {
                                child.setVisibility(c.b);
                            }
                            final int sdk_INT = Build$VERSION.SDK_INT;
                            if (sdk_INT >= 17) {
                                child.setAlpha(a.c.d);
                                child.setRotation(a.f.b);
                                child.setRotationX(a.f.c);
                                child.setRotationY(a.f.d);
                                child.setScaleX(a.f.e);
                                child.setScaleY(a.f.f);
                                final e f = a.f;
                                if (f.i != -1) {
                                    final View viewById = ((View)child.getParent()).findViewById(a.f.i);
                                    if (viewById != null) {
                                        final float n2 = (viewById.getTop() + viewById.getBottom()) / 2.0f;
                                        final float n3 = (viewById.getLeft() + viewById.getRight()) / 2.0f;
                                        if (child.getRight() - child.getLeft() > 0 && child.getBottom() - child.getTop() > 0) {
                                            final float n4 = (float)child.getLeft();
                                            final float n5 = (float)child.getTop();
                                            child.setPivotX(n3 - n4);
                                            child.setPivotY(n2 - n5);
                                        }
                                    }
                                }
                                else {
                                    if (!Float.isNaN(f.g)) {
                                        child.setPivotX(a.f.g);
                                    }
                                    if (!Float.isNaN(a.f.h)) {
                                        child.setPivotY(a.f.h);
                                    }
                                }
                                child.setTranslationX(a.f.j);
                                child.setTranslationY(a.f.k);
                                if (sdk_INT >= 21) {
                                    child.setTranslationZ(a.f.l);
                                    final e f2 = a.f;
                                    if (f2.m) {
                                        child.setElevation(f2.n);
                                    }
                                }
                            }
                        }
                    }
                    else {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("WARNING NO CONSTRAINTS for view ");
                        sb2.append(id);
                        Log.v("ConstraintSet", sb2.toString());
                    }
                }
            }
        }
        final Iterator<Integer> iterator = set.iterator();
        int l;
        while (true) {
            l = n;
            if (!iterator.hasNext()) {
                break;
            }
            final Integer key = iterator.next();
            final a a2 = this.g.get(key);
            if (a2 == null) {
                continue;
            }
            if (a2.e.i0 == 1) {
                final Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId((int)key);
                final b e2 = a2.e;
                final int[] j2 = e2.j0;
                if (j2 != null) {
                    barrier2.setReferencedIds(j2);
                }
                else {
                    final String k2 = e2.k0;
                    if (k2 != null) {
                        e2.j0 = this.Z(barrier2, k2);
                        barrier2.setReferencedIds(a2.e.j0);
                    }
                }
                barrier2.setType(a2.e.g0);
                barrier2.setMargin(a2.e.h0);
                final ConstraintLayout.b m = constraintLayout.j();
                barrier2.I();
                a2.i(m);
                constraintLayout.addView((View)barrier2, (ViewGroup$LayoutParams)m);
            }
            if (!a2.e.a) {
                continue;
            }
            final Guideline guideline = new Guideline(constraintLayout.getContext());
            guideline.setId((int)key);
            final ConstraintLayout.b j3 = constraintLayout.j();
            a2.i(j3);
            constraintLayout.addView((View)guideline, (ViewGroup$LayoutParams)j3);
        }
        while (l < childCount) {
            final View child2 = constraintLayout.getChildAt(l);
            if (child2 instanceof androidx.constraintlayout.widget.b) {
                ((androidx.constraintlayout.widget.b)child2).r(constraintLayout);
            }
            ++l;
        }
    }
    
    public int t0(final int n) {
        return this.i0(n).c.c;
    }
    
    public void t1(final int n, final float g) {
        this.i0(n).f.g = g;
    }
    
    public void u(final int n, final ConstraintLayout.b b) {
        if (this.g.containsKey(n)) {
            final a a = this.g.get(n);
            if (a != null) {
                a.i(b);
            }
        }
    }
    
    public int u0(final int n) {
        return this.i0(n).e.d;
    }
    
    public void u1(final int n, final float h) {
        this.i0(n).f.h = h;
    }
    
    public void v(final ConstraintLayout constraintLayout) {
        this.t(constraintLayout, false);
        constraintLayout.setConstraintSet(null);
    }
    
    public boolean v0() {
        return this.f;
    }
    
    public void v1(final int n, final float j, final float k) {
        final e f = this.i0(n).f;
        f.j = j;
        f.k = k;
    }
    
    public void w0(final Context context, int i) {
        final XmlResourceParser xml = context.getResources().getXml(i);
        try {
            String name;
            a h0;
            for (i = ((XmlPullParser)xml).getEventType(); i != 1; i = ((XmlPullParser)xml).next()) {
                if (i != 0) {
                    if (i == 2) {
                        name = ((XmlPullParser)xml).getName();
                        h0 = this.h0(context, Xml.asAttributeSet((XmlPullParser)xml), false);
                        if (name.equalsIgnoreCase("Guideline")) {
                            h0.e.a = true;
                        }
                        this.g.put(h0.a, h0);
                    }
                }
                else {
                    ((XmlPullParser)xml).getName();
                }
            }
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        catch (XmlPullParserException ex2) {
            ex2.printStackTrace();
        }
    }
    
    public void w1(final int n, final float j) {
        this.i0(n).f.j = j;
    }
    
    public void x(final int i, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final float n7) {
        if (n3 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (n6 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (n7 > 0.0f && n7 <= 1.0f) {
            a a2;
            if (n2 != 1 && n2 != 2) {
                if (n2 != 6 && n2 != 7) {
                    this.L(i, 3, n, n2, n3);
                    this.L(i, 4, n4, n5, n6);
                    final a a = this.g.get(i);
                    if (a != null) {
                        a.e.y = n7;
                    }
                    return;
                }
                else {
                    this.L(i, 6, n, n2, n3);
                    this.L(i, 7, n4, n5, n6);
                    a2 = this.g.get(i);
                    if (a2 == null) {
                        return;
                    }
                }
            }
            else {
                this.L(i, 1, n, n2, n3);
                this.L(i, 2, n4, n5, n6);
                a2 = this.g.get(i);
                if (a2 == null) {
                    return;
                }
            }
            a2.e.x = n7;
            return;
        }
        throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
    }
    
    public void x0(final Context context, final XmlPullParser xmlPullParser) {
        try {
            int i = xmlPullParser.getEventType();
            a value = null;
            Label_0859: {
                Label_0795: {
                    Label_0729: {
                        Label_0665: {
                            Label_0601: {
                                while (i != 1) {
                                    if (i != 0) {
                                        final int n = -1;
                                        if (i != 2) {
                                            if (i == 3) {
                                                final String lowerCase = xmlPullParser.getName().toLowerCase(Locale.ROOT);
                                                int n2 = 0;
                                                switch (lowerCase.hashCode()) {
                                                    default: {
                                                        n2 = n;
                                                        break;
                                                    }
                                                    case 2146106725: {
                                                        n2 = n;
                                                        if (lowerCase.equals("constraintset")) {
                                                            n2 = 0;
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                    case 426575017: {
                                                        n2 = n;
                                                        if (lowerCase.equals("constraintoverride")) {
                                                            n2 = 2;
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                    case -190376483: {
                                                        n2 = n;
                                                        if (lowerCase.equals("constraint")) {
                                                            n2 = 1;
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                    case -2075718416: {
                                                        n2 = n;
                                                        if (lowerCase.equals("guideline")) {
                                                            n2 = 3;
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                }
                                                if (n2 == 0) {
                                                    return;
                                                }
                                                if (n2 == 1 || n2 == 2 || n2 == 3) {
                                                    this.g.put(value.a, value);
                                                    value = null;
                                                }
                                            }
                                        }
                                        else {
                                            final String name = xmlPullParser.getName();
                                            int n3 = 0;
                                            switch (name.hashCode()) {
                                                default: {
                                                    n3 = n;
                                                    break;
                                                }
                                                case 1803088381: {
                                                    n3 = n;
                                                    if (name.equals("Constraint")) {
                                                        n3 = 0;
                                                        break;
                                                    }
                                                    break;
                                                }
                                                case 1791837707: {
                                                    n3 = n;
                                                    if (name.equals("CustomAttribute")) {
                                                        n3 = 8;
                                                        break;
                                                    }
                                                    break;
                                                }
                                                case 1331510167: {
                                                    n3 = n;
                                                    if (name.equals("Barrier")) {
                                                        n3 = 3;
                                                        break;
                                                    }
                                                    break;
                                                }
                                                case 366511058: {
                                                    n3 = n;
                                                    if (name.equals("CustomMethod")) {
                                                        n3 = 9;
                                                        break;
                                                    }
                                                    break;
                                                }
                                                case -71750448: {
                                                    n3 = n;
                                                    if (name.equals("Guideline")) {
                                                        n3 = 2;
                                                        break;
                                                    }
                                                    break;
                                                }
                                                case -1238332596: {
                                                    n3 = n;
                                                    if (name.equals("Transform")) {
                                                        n3 = 5;
                                                        break;
                                                    }
                                                    break;
                                                }
                                                case -1269513683: {
                                                    n3 = n;
                                                    if (name.equals("PropertySet")) {
                                                        n3 = 4;
                                                        break;
                                                    }
                                                    break;
                                                }
                                                case -1962203927: {
                                                    n3 = n;
                                                    if (name.equals("ConstraintOverride")) {
                                                        n3 = 1;
                                                        break;
                                                    }
                                                    break;
                                                }
                                                case -1984451626: {
                                                    n3 = n;
                                                    if (name.equals("Motion")) {
                                                        n3 = 7;
                                                        break;
                                                    }
                                                    break;
                                                }
                                                case -2025855158: {
                                                    final boolean equals = name.equals("Layout");
                                                    n3 = n;
                                                    if (equals) {
                                                        n3 = 6;
                                                        break;
                                                    }
                                                    break;
                                                }
                                            }
                                            switch (n3) {
                                                case 8:
                                                case 9: {
                                                    if (value != null) {
                                                        androidx.constraintlayout.widget.a.j(context, xmlPullParser, value.g);
                                                        break;
                                                    }
                                                    break Label_0601;
                                                }
                                                case 7: {
                                                    if (value != null) {
                                                        value.d.b(context, Xml.asAttributeSet(xmlPullParser));
                                                        break;
                                                    }
                                                    break Label_0665;
                                                }
                                                case 6: {
                                                    if (value != null) {
                                                        value.e.c(context, Xml.asAttributeSet(xmlPullParser));
                                                        break;
                                                    }
                                                    break Label_0729;
                                                }
                                                case 5: {
                                                    if (value != null) {
                                                        value.f.b(context, Xml.asAttributeSet(xmlPullParser));
                                                        break;
                                                    }
                                                    break Label_0795;
                                                }
                                                case 4: {
                                                    if (value != null) {
                                                        value.c.b(context, Xml.asAttributeSet(xmlPullParser));
                                                        break;
                                                    }
                                                    break Label_0859;
                                                }
                                                case 3: {
                                                    value = this.h0(context, Xml.asAttributeSet(xmlPullParser), false);
                                                    value.e.i0 = 1;
                                                    break;
                                                }
                                                case 2: {
                                                    value = this.h0(context, Xml.asAttributeSet(xmlPullParser), false);
                                                    final b e = value.e;
                                                    e.a = true;
                                                    e.b = true;
                                                    break;
                                                }
                                                case 1: {
                                                    value = this.h0(context, Xml.asAttributeSet(xmlPullParser), true);
                                                    break;
                                                }
                                                case 0: {
                                                    value = this.h0(context, Xml.asAttributeSet(xmlPullParser), false);
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    else {
                                        xmlPullParser.getName();
                                    }
                                    i = xmlPullParser.next();
                                }
                                return;
                            }
                            final StringBuilder sb = new StringBuilder();
                            sb.append("XML parser error must be within a Constraint ");
                            sb.append(xmlPullParser.getLineNumber());
                            throw new RuntimeException(sb.toString());
                        }
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("XML parser error must be within a Constraint ");
                        sb2.append(xmlPullParser.getLineNumber());
                        throw new RuntimeException(sb2.toString());
                    }
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("XML parser error must be within a Constraint ");
                    sb3.append(xmlPullParser.getLineNumber());
                    throw new RuntimeException(sb3.toString());
                }
                final StringBuilder sb4 = new StringBuilder();
                sb4.append("XML parser error must be within a Constraint ");
                sb4.append(xmlPullParser.getLineNumber());
                throw new RuntimeException(sb4.toString());
            }
            final StringBuilder sb5 = new StringBuilder();
            sb5.append("XML parser error must be within a Constraint ");
            sb5.append(xmlPullParser.getLineNumber());
            throw new RuntimeException(sb5.toString());
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
        catch (XmlPullParserException ex2) {
            ex2.printStackTrace();
        }
    }
    
    public void x1(final int n, final float k) {
        this.i0(n).f.k = k;
    }
    
    public void y(final int n, int n2) {
        int n3;
        int n4;
        int n5;
        if (n2 == 0) {
            n3 = 0;
            n4 = 1;
            n5 = 0;
            n2 = 2;
        }
        else {
            n4 = 2;
            final int n6 = 1;
            n3 = n2;
            n5 = n2;
            n2 = n6;
        }
        this.x(n, n3, n4, 0, n5, n2, 0, 0.5f);
    }
    
    public void y1(final int n, final float l) {
        if (Build$VERSION.SDK_INT >= 21) {
            this.i0(n).f.l = l;
        }
    }
    
    public void z(final int i, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final float x) {
        this.L(i, 1, n, n2, n3);
        this.L(i, 2, n4, n5, n6);
        final a a = this.g.get(i);
        if (a != null) {
            a.e.x = x;
        }
    }
    
    public void z0(final a a, final String s) {
        final String[] split = s.split(",");
        for (int i = 0; i < split.length; ++i) {
            final String[] split2 = split[i].split("=");
            if (split2.length != 2) {
                final StringBuilder sb = new StringBuilder();
                sb.append(" Unable to parse ");
                sb.append(split[i]);
                Log.w("ConstraintSet", sb.toString());
            }
            else {
                a.p(split2[0], Color.parseColor(split2[1]));
            }
        }
    }
    
    public void z1(final boolean a) {
        this.a = a;
    }
    
    public static class a
    {
        int a;
        String b;
        public final d c;
        public final c d;
        public final b e;
        public final e f;
        public HashMap<String, a> g;
        a h;
        
        public a() {
            this.c = new d();
            this.d = new c();
            this.e = new b();
            this.f = new e();
            this.g = new HashMap<String, a>();
        }
        
        private void k(final int a, final ConstraintLayout.b b) {
            this.a = a;
            final b e = this.e;
            e.i = b.d;
            e.j = b.e;
            e.k = b.f;
            e.l = b.g;
            e.m = b.h;
            e.n = b.i;
            e.o = b.j;
            e.p = b.k;
            e.q = b.l;
            e.r = b.m;
            e.s = b.n;
            e.t = b.r;
            e.u = b.s;
            e.v = b.t;
            e.w = b.u;
            e.x = b.F;
            e.y = b.G;
            e.z = b.H;
            e.A = b.o;
            e.B = b.p;
            e.C = b.q;
            e.D = b.W;
            e.E = b.X;
            e.F = b.Y;
            e.h = b.c;
            e.f = b.a;
            e.g = b.b;
            e.d = b.width;
            e.e = b.height;
            e.G = b.leftMargin;
            e.H = b.rightMargin;
            e.I = b.topMargin;
            e.J = b.bottomMargin;
            e.M = b.C;
            e.U = b.L;
            e.V = b.K;
            e.X = b.N;
            e.W = b.M;
            e.m0 = b.Z;
            e.n0 = b.a0;
            e.Y = b.O;
            e.Z = b.P;
            e.a0 = b.S;
            e.b0 = b.T;
            e.c0 = b.Q;
            e.d0 = b.R;
            e.e0 = b.U;
            e.f0 = b.V;
            e.l0 = b.b0;
            e.O = b.w;
            e.Q = b.y;
            e.N = b.v;
            e.P = b.x;
            e.S = b.z;
            e.R = b.A;
            e.T = b.B;
            e.p0 = b.c0;
            if (Build$VERSION.SDK_INT >= 17) {
                e.K = b.getMarginEnd();
                this.e.L = b.getMarginStart();
            }
        }
        
        private void l(final int n, final androidx.constraintlayout.widget.f.a a) {
            this.k(n, a);
            this.c.d = a.U0;
            final e f = this.f;
            f.b = a.X0;
            f.c = a.Y0;
            f.d = a.Z0;
            f.e = a.a1;
            f.f = a.b1;
            f.g = a.c1;
            f.h = a.d1;
            f.j = a.e1;
            f.k = a.f1;
            f.l = a.g1;
            f.n = a.W0;
            f.m = a.V0;
        }
        
        private void m(final androidx.constraintlayout.widget.b b, final int n, final androidx.constraintlayout.widget.f.a a) {
            this.l(n, a);
            if (b instanceof Barrier) {
                final b e = this.e;
                e.i0 = 1;
                final Barrier barrier = (Barrier)b;
                e.g0 = barrier.getType();
                this.e.j0 = barrier.getReferencedIds();
                this.e.h0 = barrier.getMargin();
            }
        }
        
        private a n(final String key, final androidx.constraintlayout.widget.a.b b) {
            a a;
            if (this.g.containsKey(key)) {
                a = this.g.get(key);
                if (a.e() != b) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("ConstraintAttribute is already a ");
                    sb.append(a.e().name());
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            else {
                final a value = new a(key, b);
                this.g.put(key, value);
                a = value;
            }
            return a;
        }
        
        private void p(final String s, final int n) {
            this.n(s, androidx.constraintlayout.widget.a.b.I).l(n);
        }
        
        private void q(final String s, final float n) {
            this.n(s, androidx.constraintlayout.widget.a.b.H).m(n);
        }
        
        private void r(final String s, final int n) {
            this.n(s, androidx.constraintlayout.widget.a.b.G).n(n);
        }
        
        private void s(final String s, final String s2) {
            this.n(s, androidx.constraintlayout.widget.a.b.K).p(s2);
        }
        
        public void h(final a a) {
            final a h = this.h;
            if (h != null) {
                h.e(a);
            }
        }
        
        public void i(final ConstraintLayout.b b) {
            final b e = this.e;
            b.d = e.i;
            b.e = e.j;
            b.f = e.k;
            b.g = e.l;
            b.h = e.m;
            b.i = e.n;
            b.j = e.o;
            b.k = e.p;
            b.l = e.q;
            b.m = e.r;
            b.n = e.s;
            b.r = e.t;
            b.s = e.u;
            b.t = e.v;
            b.u = e.w;
            b.leftMargin = e.G;
            b.rightMargin = e.H;
            b.topMargin = e.I;
            b.bottomMargin = e.J;
            b.z = e.S;
            b.A = e.R;
            b.w = e.O;
            b.y = e.Q;
            b.F = e.x;
            b.G = e.y;
            b.o = e.A;
            b.p = e.B;
            b.q = e.C;
            b.H = e.z;
            b.W = e.D;
            b.X = e.E;
            b.L = e.U;
            b.K = e.V;
            b.N = e.X;
            b.M = e.W;
            b.Z = e.m0;
            b.a0 = e.n0;
            b.O = e.Y;
            b.P = e.Z;
            b.S = e.a0;
            b.T = e.b0;
            b.Q = e.c0;
            b.R = e.d0;
            b.U = e.e0;
            b.V = e.f0;
            b.Y = e.F;
            b.c = e.h;
            b.a = e.f;
            b.b = e.g;
            b.width = e.d;
            b.height = e.e;
            final String l0 = e.l0;
            if (l0 != null) {
                b.b0 = l0;
            }
            b.c0 = e.p0;
            if (Build$VERSION.SDK_INT >= 17) {
                b.setMarginStart(e.L);
                b.setMarginEnd(this.e.K);
            }
            b.e();
        }
        
        public a j() {
            final a a = new a();
            a.e.a(this.e);
            a.d.a(this.d);
            a.c.a(this.c);
            a.f.a(this.f);
            a.a = this.a;
            a.h = this.h;
            return a;
        }
        
        public void o(final String s) {
            final a h = this.h;
            if (h != null) {
                h.f(s);
            }
            else {
                Log.v(s, "DELTA IS NULL");
            }
        }
        
        static class a
        {
            private static final int m = 4;
            private static final int n = 10;
            private static final int o = 10;
            private static final int p = 5;
            int[] a;
            int[] b;
            int c;
            int[] d;
            float[] e;
            int f;
            int[] g;
            String[] h;
            int i;
            int[] j;
            boolean[] k;
            int l;
            
            a() {
                this.a = new int[10];
                this.b = new int[10];
                this.c = 0;
                this.d = new int[10];
                this.e = new float[10];
                this.f = 0;
                this.g = new int[5];
                this.h = new String[5];
                this.i = 0;
                this.j = new int[4];
                this.k = new boolean[4];
                this.l = 0;
            }
            
            void a(final int n, final float n2) {
                final int f = this.f;
                final int[] d = this.d;
                if (f >= d.length) {
                    this.d = Arrays.copyOf(d, d.length * 2);
                    final float[] e = this.e;
                    this.e = Arrays.copyOf(e, e.length * 2);
                }
                final int[] d2 = this.d;
                final int f2 = this.f;
                d2[f2] = n;
                final float[] e2 = this.e;
                this.f = f2 + 1;
                e2[f2] = n2;
            }
            
            void b(final int n, final int n2) {
                final int c = this.c;
                final int[] a = this.a;
                if (c >= a.length) {
                    this.a = Arrays.copyOf(a, a.length * 2);
                    final int[] b = this.b;
                    this.b = Arrays.copyOf(b, b.length * 2);
                }
                final int[] a2 = this.a;
                final int c2 = this.c;
                a2[c2] = n;
                final int[] b2 = this.b;
                this.c = c2 + 1;
                b2[c2] = n2;
            }
            
            void c(final int n, final String s) {
                final int i = this.i;
                final int[] g = this.g;
                if (i >= g.length) {
                    this.g = Arrays.copyOf(g, g.length * 2);
                    final String[] h = this.h;
                    this.h = Arrays.copyOf(h, h.length * 2);
                }
                final int[] g2 = this.g;
                final int j = this.i;
                g2[j] = n;
                final String[] h2 = this.h;
                this.i = j + 1;
                h2[j] = s;
            }
            
            void d(final int n, final boolean b) {
                final int l = this.l;
                final int[] j = this.j;
                if (l >= j.length) {
                    this.j = Arrays.copyOf(j, j.length * 2);
                    final boolean[] k = this.k;
                    this.k = Arrays.copyOf(k, k.length * 2);
                }
                final int[] i = this.j;
                final int m = this.l;
                i[m] = n;
                final boolean[] k2 = this.k;
                this.l = m + 1;
                k2[m] = b;
            }
            
            void e(final androidx.constraintlayout.widget.e.a a) {
                final int n = 0;
                for (int i = 0; i < this.c; ++i) {
                    S0(a, this.a[i], this.b[i]);
                }
                for (int j = 0; j < this.f; ++j) {
                    R0(a, this.d[j], this.e[j]);
                }
                int n2 = 0;
                int k;
                while (true) {
                    k = n;
                    if (n2 >= this.i) {
                        break;
                    }
                    T0(a, this.g[n2], this.h[n2]);
                    ++n2;
                }
                while (k < this.l) {
                    U0(a, this.j[k], this.k[k]);
                    ++k;
                }
            }
            
            @SuppressLint({ "LogConditional" })
            void f(final String s) {
                Log.v(s, "int");
                final int n = 0;
                for (int i = 0; i < this.c; ++i) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(this.a[i]);
                    sb.append(" = ");
                    sb.append(this.b[i]);
                    Log.v(s, sb.toString());
                }
                Log.v(s, "float");
                for (int j = 0; j < this.f; ++j) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.d[j]);
                    sb2.append(" = ");
                    sb2.append(this.e[j]);
                    Log.v(s, sb2.toString());
                }
                Log.v(s, "strings");
                for (int k = 0; k < this.i; ++k) {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append(this.g[k]);
                    sb3.append(" = ");
                    sb3.append(this.h[k]);
                    Log.v(s, sb3.toString());
                }
                Log.v(s, "boolean");
                for (int l = n; l < this.l; ++l) {
                    final StringBuilder sb4 = new StringBuilder();
                    sb4.append(this.j[l]);
                    sb4.append(" = ");
                    sb4.append(this.k[l]);
                    Log.v(s, sb4.toString());
                }
            }
        }
    }
    
    public static class b
    {
        private static final int A0 = 8;
        private static final int B0 = 9;
        private static final int C0 = 10;
        private static final int D0 = 11;
        private static final int E0 = 12;
        private static final int F0 = 13;
        private static final int G0 = 14;
        private static final int H0 = 15;
        private static final int I0 = 16;
        private static final int J0 = 17;
        private static final int K0 = 18;
        private static final int L0 = 19;
        private static final int M0 = 20;
        private static final int N0 = 21;
        private static final int O0 = 22;
        private static final int P0 = 23;
        private static final int Q0 = 24;
        private static final int R0 = 25;
        private static final int S0 = 26;
        private static final int T0 = 27;
        private static final int U0 = 28;
        private static final int V0 = 29;
        private static final int W0 = 30;
        private static final int X0 = 31;
        private static final int Y0 = 32;
        private static final int Z0 = 33;
        private static final int a1 = 34;
        private static final int b1 = 35;
        private static final int c1 = 36;
        private static final int d1 = 37;
        private static final int e1 = 38;
        private static final int f1 = 39;
        private static final int g1 = 40;
        private static final int h1 = 41;
        private static final int i1 = 42;
        private static final int j1 = 61;
        private static final int k1 = 62;
        private static final int l1 = 63;
        private static final int m1 = 69;
        private static final int n1 = 70;
        private static final int o1 = 71;
        private static final int p1 = 72;
        public static final int q0 = -1;
        private static final int q1 = 73;
        public static final int r0 = Integer.MIN_VALUE;
        private static final int r1 = 74;
        private static SparseIntArray s0;
        private static final int s1 = 75;
        private static final int t0 = 1;
        private static final int t1 = 76;
        private static final int u0 = 2;
        private static final int v0 = 3;
        private static final int w0 = 4;
        private static final int x0 = 5;
        private static final int y0 = 6;
        private static final int z0 = 7;
        public int A;
        public int B;
        public float C;
        public int D;
        public int E;
        public int F;
        public int G;
        public int H;
        public int I;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public int O;
        public int P;
        public int Q;
        public int R;
        public int S;
        public int T;
        public float U;
        public float V;
        public int W;
        public int X;
        public int Y;
        public int Z;
        public boolean a;
        public int a0;
        public boolean b;
        public int b0;
        public boolean c;
        public int c0;
        public int d;
        public int d0;
        public int e;
        public float e0;
        public int f;
        public float f0;
        public int g;
        public int g0;
        public float h;
        public int h0;
        public int i;
        public int i0;
        public int j;
        public int[] j0;
        public int k;
        public String k0;
        public int l;
        public String l0;
        public int m;
        public boolean m0;
        public int n;
        public boolean n0;
        public int o;
        public boolean o0;
        public int p;
        public int p0;
        public int q;
        public int r;
        public int s;
        public int t;
        public int u;
        public int v;
        public int w;
        public float x;
        public float y;
        public String z;
        
        static {
            (b.s0 = new SparseIntArray()).append(androidx.constraintlayout.widget.j.m.ih, 24);
            b.s0.append(androidx.constraintlayout.widget.j.m.jh, 25);
            b.s0.append(androidx.constraintlayout.widget.j.m.lh, 28);
            b.s0.append(androidx.constraintlayout.widget.j.m.mh, 29);
            b.s0.append(androidx.constraintlayout.widget.j.m.rh, 35);
            b.s0.append(androidx.constraintlayout.widget.j.m.qh, 34);
            b.s0.append(androidx.constraintlayout.widget.j.m.Pg, 4);
            b.s0.append(androidx.constraintlayout.widget.j.m.Og, 3);
            b.s0.append(androidx.constraintlayout.widget.j.m.Kg, 1);
            b.s0.append(androidx.constraintlayout.widget.j.m.Ah, 6);
            b.s0.append(androidx.constraintlayout.widget.j.m.Bh, 7);
            b.s0.append(androidx.constraintlayout.widget.j.m.Wg, 17);
            b.s0.append(androidx.constraintlayout.widget.j.m.Xg, 18);
            b.s0.append(androidx.constraintlayout.widget.j.m.Yg, 19);
            b.s0.append(androidx.constraintlayout.widget.j.m.sg, 26);
            b.s0.append(androidx.constraintlayout.widget.j.m.nh, 31);
            b.s0.append(androidx.constraintlayout.widget.j.m.oh, 32);
            b.s0.append(androidx.constraintlayout.widget.j.m.Vg, 10);
            b.s0.append(androidx.constraintlayout.widget.j.m.Ug, 9);
            b.s0.append(androidx.constraintlayout.widget.j.m.Fh, 13);
            b.s0.append(androidx.constraintlayout.widget.j.m.Ih, 16);
            b.s0.append(androidx.constraintlayout.widget.j.m.Gh, 14);
            b.s0.append(androidx.constraintlayout.widget.j.m.Dh, 11);
            b.s0.append(androidx.constraintlayout.widget.j.m.Hh, 15);
            b.s0.append(androidx.constraintlayout.widget.j.m.Eh, 12);
            b.s0.append(androidx.constraintlayout.widget.j.m.uh, 38);
            b.s0.append(androidx.constraintlayout.widget.j.m.gh, 37);
            b.s0.append(androidx.constraintlayout.widget.j.m.fh, 39);
            b.s0.append(androidx.constraintlayout.widget.j.m.th, 40);
            b.s0.append(androidx.constraintlayout.widget.j.m.eh, 20);
            b.s0.append(androidx.constraintlayout.widget.j.m.sh, 36);
            b.s0.append(androidx.constraintlayout.widget.j.m.Tg, 5);
            b.s0.append(androidx.constraintlayout.widget.j.m.hh, 76);
            b.s0.append(androidx.constraintlayout.widget.j.m.ph, 76);
            b.s0.append(androidx.constraintlayout.widget.j.m.kh, 76);
            b.s0.append(androidx.constraintlayout.widget.j.m.Ng, 76);
            b.s0.append(androidx.constraintlayout.widget.j.m.Jg, 76);
            b.s0.append(androidx.constraintlayout.widget.j.m.vg, 23);
            b.s0.append(androidx.constraintlayout.widget.j.m.xg, 27);
            b.s0.append(androidx.constraintlayout.widget.j.m.zg, 30);
            b.s0.append(androidx.constraintlayout.widget.j.m.Ag, 8);
            b.s0.append(androidx.constraintlayout.widget.j.m.wg, 33);
            b.s0.append(androidx.constraintlayout.widget.j.m.yg, 2);
            b.s0.append(androidx.constraintlayout.widget.j.m.tg, 22);
            b.s0.append(androidx.constraintlayout.widget.j.m.ug, 21);
            b.s0.append(androidx.constraintlayout.widget.j.m.vh, 41);
            b.s0.append(androidx.constraintlayout.widget.j.m.Zg, 42);
            b.s0.append(androidx.constraintlayout.widget.j.m.Ig, 41);
            b.s0.append(androidx.constraintlayout.widget.j.m.Hg, 42);
            b.s0.append(androidx.constraintlayout.widget.j.m.Kh, 97);
            b.s0.append(androidx.constraintlayout.widget.j.m.Qg, 61);
            b.s0.append(androidx.constraintlayout.widget.j.m.Sg, 62);
            b.s0.append(androidx.constraintlayout.widget.j.m.Rg, 63);
            b.s0.append(androidx.constraintlayout.widget.j.m.zh, 69);
            b.s0.append(androidx.constraintlayout.widget.j.m.dh, 70);
            b.s0.append(androidx.constraintlayout.widget.j.m.Eg, 71);
            b.s0.append(androidx.constraintlayout.widget.j.m.Cg, 72);
            b.s0.append(androidx.constraintlayout.widget.j.m.Dg, 73);
            b.s0.append(androidx.constraintlayout.widget.j.m.Fg, 74);
            b.s0.append(androidx.constraintlayout.widget.j.m.Bg, 75);
        }
        
        public b() {
            this.a = false;
            this.b = false;
            this.c = false;
            this.f = -1;
            this.g = -1;
            this.h = -1.0f;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = -1;
            this.w = -1;
            this.x = 0.5f;
            this.y = 0.5f;
            this.z = null;
            this.A = -1;
            this.B = 0;
            this.C = 0.0f;
            this.D = -1;
            this.E = -1;
            this.F = -1;
            this.G = 0;
            this.H = 0;
            this.I = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            this.M = 0;
            this.N = Integer.MIN_VALUE;
            this.O = Integer.MIN_VALUE;
            this.P = Integer.MIN_VALUE;
            this.Q = Integer.MIN_VALUE;
            this.R = Integer.MIN_VALUE;
            this.S = Integer.MIN_VALUE;
            this.T = Integer.MIN_VALUE;
            this.U = -1.0f;
            this.V = -1.0f;
            this.W = 0;
            this.X = 0;
            this.Y = 0;
            this.Z = 0;
            this.a0 = -1;
            this.b0 = -1;
            this.c0 = -1;
            this.d0 = -1;
            this.e0 = 1.0f;
            this.f0 = 1.0f;
            this.g0 = -1;
            this.h0 = 0;
            this.i0 = -1;
            this.m0 = false;
            this.n0 = false;
            this.o0 = true;
            this.p0 = 0;
        }
        
        public void a(final b b) {
            this.a = b.a;
            this.d = b.d;
            this.b = b.b;
            this.e = b.e;
            this.f = b.f;
            this.g = b.g;
            this.h = b.h;
            this.i = b.i;
            this.j = b.j;
            this.k = b.k;
            this.l = b.l;
            this.m = b.m;
            this.n = b.n;
            this.o = b.o;
            this.p = b.p;
            this.q = b.q;
            this.r = b.r;
            this.s = b.s;
            this.t = b.t;
            this.u = b.u;
            this.v = b.v;
            this.w = b.w;
            this.x = b.x;
            this.y = b.y;
            this.z = b.z;
            this.A = b.A;
            this.B = b.B;
            this.C = b.C;
            this.D = b.D;
            this.E = b.E;
            this.F = b.F;
            this.G = b.G;
            this.H = b.H;
            this.I = b.I;
            this.J = b.J;
            this.K = b.K;
            this.L = b.L;
            this.M = b.M;
            this.N = b.N;
            this.O = b.O;
            this.P = b.P;
            this.Q = b.Q;
            this.R = b.R;
            this.S = b.S;
            this.T = b.T;
            this.U = b.U;
            this.V = b.V;
            this.W = b.W;
            this.X = b.X;
            this.Y = b.Y;
            this.Z = b.Z;
            this.a0 = b.a0;
            this.b0 = b.b0;
            this.c0 = b.c0;
            this.d0 = b.d0;
            this.e0 = b.e0;
            this.f0 = b.f0;
            this.g0 = b.g0;
            this.h0 = b.h0;
            this.i0 = b.i0;
            this.l0 = b.l0;
            final int[] j0 = b.j0;
            if (j0 != null) {
                this.j0 = Arrays.copyOf(j0, j0.length);
            }
            else {
                this.j0 = null;
            }
            this.k0 = b.k0;
            this.m0 = b.m0;
            this.n0 = b.n0;
            this.o0 = b.o0;
            this.p0 = b.p0;
        }
        
        public void b(final u u, final StringBuilder sb) {
            final Field[] declaredFields = this.getClass().getDeclaredFields();
            sb.append("\n");
            for (int i = 0; i < declaredFields.length; ++i) {
                final Field field = declaredFields[i];
                final String name = field.getName();
                if (!Modifier.isStatic(field.getModifiers())) {
                    try {
                        final Object value = field.get(this);
                        final Class<?> type = field.getType();
                        if (type == Integer.TYPE) {
                            final Integer n = (Integer)value;
                            if (n == -1) {
                                continue;
                            }
                            Serializable x = u.X(n);
                            sb.append("    ");
                            sb.append(name);
                            sb.append(" = \"");
                            if (x == null) {
                                x = n;
                            }
                            sb.append(x);
                        }
                        else {
                            if (type != Float.TYPE) {
                                continue;
                            }
                            final Float obj = (Float)value;
                            if (obj == -1.0f) {
                                continue;
                            }
                            sb.append("    ");
                            sb.append(name);
                            sb.append(" = \"");
                            sb.append(obj);
                        }
                        sb.append("\"\n");
                    }
                    catch (IllegalAccessException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
        
        void c(final Context context, final AttributeSet set) {
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, androidx.constraintlayout.widget.j.m.rg);
            this.b = true;
            for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
                final int index = obtainStyledAttributes.getIndex(i);
                final int value = androidx.constraintlayout.widget.e.b.s0.get(index);
                if (value != 80) {
                    if (value != 81) {
                        if (value != 97) {
                            switch (value) {
                                default: {
                                    switch (value) {
                                        default: {
                                            switch (value) {
                                                default: {
                                                    StringBuilder sb = null;
                                                    String str = null;
                                                    Label_0416: {
                                                        switch (value) {
                                                            default: {
                                                                switch (value) {
                                                                    default: {
                                                                        sb = new StringBuilder();
                                                                        str = "Unknown attribute 0x";
                                                                        break Label_0416;
                                                                    }
                                                                    case 94: {
                                                                        this.T = obtainStyledAttributes.getDimensionPixelSize(index, this.T);
                                                                        continue;
                                                                    }
                                                                    case 93: {
                                                                        this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                                                                        continue;
                                                                    }
                                                                    case 92: {
                                                                        this.s = y0(obtainStyledAttributes, index, this.s);
                                                                        continue;
                                                                    }
                                                                    case 91: {
                                                                        this.r = y0(obtainStyledAttributes, index, this.r);
                                                                        continue;
                                                                    }
                                                                }
                                                                break;
                                                            }
                                                            case 77: {
                                                                this.l0 = obtainStyledAttributes.getString(index);
                                                                continue;
                                                            }
                                                            case 76: {
                                                                sb = new StringBuilder();
                                                                str = "unused attribute 0x";
                                                                break;
                                                            }
                                                            case 75: {
                                                                this.o0 = obtainStyledAttributes.getBoolean(index, this.o0);
                                                                continue;
                                                            }
                                                            case 74: {
                                                                this.k0 = obtainStyledAttributes.getString(index);
                                                                continue;
                                                            }
                                                            case 73: {
                                                                this.h0 = obtainStyledAttributes.getDimensionPixelSize(index, this.h0);
                                                                continue;
                                                            }
                                                            case 72: {
                                                                this.g0 = obtainStyledAttributes.getInt(index, this.g0);
                                                                continue;
                                                            }
                                                            case 71: {
                                                                Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                                continue;
                                                            }
                                                            case 70: {
                                                                this.f0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                                continue;
                                                            }
                                                            case 69: {
                                                                this.e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                                continue;
                                                            }
                                                        }
                                                    }
                                                    sb.append(str);
                                                    sb.append(Integer.toHexString(index));
                                                    sb.append("   ");
                                                    sb.append(androidx.constraintlayout.widget.e.b.s0.get(index));
                                                    Log.w("ConstraintSet", sb.toString());
                                                    continue;
                                                }
                                                case 63: {
                                                    this.C = obtainStyledAttributes.getFloat(index, this.C);
                                                    continue;
                                                }
                                                case 62: {
                                                    this.B = obtainStyledAttributes.getDimensionPixelSize(index, this.B);
                                                    continue;
                                                }
                                                case 61: {
                                                    this.A = y0(obtainStyledAttributes, index, this.A);
                                                    continue;
                                                }
                                            }
                                            break;
                                        }
                                        case 59: {
                                            this.d0 = obtainStyledAttributes.getDimensionPixelSize(index, this.d0);
                                            continue;
                                        }
                                        case 58: {
                                            this.c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.c0);
                                            continue;
                                        }
                                        case 57: {
                                            this.b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.b0);
                                            continue;
                                        }
                                        case 56: {
                                            this.a0 = obtainStyledAttributes.getDimensionPixelSize(index, this.a0);
                                            continue;
                                        }
                                        case 55: {
                                            this.Z = obtainStyledAttributes.getInt(index, this.Z);
                                            continue;
                                        }
                                        case 54: {
                                            this.Y = obtainStyledAttributes.getInt(index, this.Y);
                                            continue;
                                        }
                                    }
                                    break;
                                }
                                case 42: {
                                    androidx.constraintlayout.widget.e.A0(this, obtainStyledAttributes, index, 1);
                                    break;
                                }
                                case 41: {
                                    androidx.constraintlayout.widget.e.A0(this, obtainStyledAttributes, index, 0);
                                    break;
                                }
                                case 40: {
                                    this.X = obtainStyledAttributes.getInt(index, this.X);
                                    break;
                                }
                                case 39: {
                                    this.W = obtainStyledAttributes.getInt(index, this.W);
                                    break;
                                }
                                case 38: {
                                    this.U = obtainStyledAttributes.getFloat(index, this.U);
                                    break;
                                }
                                case 37: {
                                    this.V = obtainStyledAttributes.getFloat(index, this.V);
                                    break;
                                }
                                case 36: {
                                    this.y = obtainStyledAttributes.getFloat(index, this.y);
                                    break;
                                }
                                case 35: {
                                    this.m = y0(obtainStyledAttributes, index, this.m);
                                    break;
                                }
                                case 34: {
                                    this.n = y0(obtainStyledAttributes, index, this.n);
                                    break;
                                }
                                case 33: {
                                    this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                                    break;
                                }
                                case 32: {
                                    this.u = y0(obtainStyledAttributes, index, this.u);
                                    break;
                                }
                                case 31: {
                                    this.t = y0(obtainStyledAttributes, index, this.t);
                                    break;
                                }
                                case 30: {
                                    if (Build$VERSION.SDK_INT >= 17) {
                                        this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                                        break;
                                    }
                                    break;
                                }
                                case 29: {
                                    this.l = y0(obtainStyledAttributes, index, this.l);
                                    break;
                                }
                                case 28: {
                                    this.k = y0(obtainStyledAttributes, index, this.k);
                                    break;
                                }
                                case 27: {
                                    this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                                    break;
                                }
                                case 26: {
                                    this.F = obtainStyledAttributes.getInt(index, this.F);
                                    break;
                                }
                                case 25: {
                                    this.j = y0(obtainStyledAttributes, index, this.j);
                                    break;
                                }
                                case 24: {
                                    this.i = y0(obtainStyledAttributes, index, this.i);
                                    break;
                                }
                                case 23: {
                                    this.G = obtainStyledAttributes.getDimensionPixelSize(index, this.G);
                                    break;
                                }
                                case 22: {
                                    this.d = obtainStyledAttributes.getLayoutDimension(index, this.d);
                                    break;
                                }
                                case 21: {
                                    this.e = obtainStyledAttributes.getLayoutDimension(index, this.e);
                                    break;
                                }
                                case 20: {
                                    this.x = obtainStyledAttributes.getFloat(index, this.x);
                                    break;
                                }
                                case 19: {
                                    this.h = obtainStyledAttributes.getFloat(index, this.h);
                                    break;
                                }
                                case 18: {
                                    this.g = obtainStyledAttributes.getDimensionPixelOffset(index, this.g);
                                    break;
                                }
                                case 17: {
                                    this.f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f);
                                    break;
                                }
                                case 16: {
                                    this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                                    break;
                                }
                                case 15: {
                                    this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                                    break;
                                }
                                case 14: {
                                    this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                                    break;
                                }
                                case 13: {
                                    this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                                    break;
                                }
                                case 12: {
                                    this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                                    break;
                                }
                                case 11: {
                                    this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                                    break;
                                }
                                case 10: {
                                    this.v = y0(obtainStyledAttributes, index, this.v);
                                    break;
                                }
                                case 9: {
                                    this.w = y0(obtainStyledAttributes, index, this.w);
                                    break;
                                }
                                case 8: {
                                    if (Build$VERSION.SDK_INT >= 17) {
                                        this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                                        break;
                                    }
                                    break;
                                }
                                case 7: {
                                    this.E = obtainStyledAttributes.getDimensionPixelOffset(index, this.E);
                                    break;
                                }
                                case 6: {
                                    this.D = obtainStyledAttributes.getDimensionPixelOffset(index, this.D);
                                    break;
                                }
                                case 5: {
                                    this.z = obtainStyledAttributes.getString(index);
                                    break;
                                }
                                case 4: {
                                    this.o = y0(obtainStyledAttributes, index, this.o);
                                    break;
                                }
                                case 3: {
                                    this.p = y0(obtainStyledAttributes, index, this.p);
                                    break;
                                }
                                case 2: {
                                    this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                                    break;
                                }
                                case 1: {
                                    this.q = y0(obtainStyledAttributes, index, this.q);
                                    break;
                                }
                            }
                        }
                        else {
                            this.p0 = obtainStyledAttributes.getInt(index, this.p0);
                        }
                    }
                    else {
                        this.n0 = obtainStyledAttributes.getBoolean(index, this.n0);
                    }
                }
                else {
                    this.m0 = obtainStyledAttributes.getBoolean(index, this.m0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
    
    public static class c
    {
        private static final int A = 9;
        private static final int B = 10;
        private static final int o = -2;
        private static final int p = -1;
        private static final int q = -3;
        private static SparseIntArray r;
        private static final int s = 1;
        private static final int t = 2;
        private static final int u = 3;
        private static final int v = 4;
        private static final int w = 5;
        private static final int x = 6;
        private static final int y = 7;
        private static final int z = 8;
        public boolean a;
        public int b;
        public int c;
        public String d;
        public int e;
        public int f;
        public float g;
        public int h;
        public float i;
        public float j;
        public int k;
        public String l;
        public int m;
        public int n;
        
        static {
            (c.r = new SparseIntArray()).append(androidx.constraintlayout.widget.j.m.hj, 1);
            c.r.append(androidx.constraintlayout.widget.j.m.jj, 2);
            c.r.append(androidx.constraintlayout.widget.j.m.nj, 3);
            c.r.append(androidx.constraintlayout.widget.j.m.gj, 4);
            c.r.append(androidx.constraintlayout.widget.j.m.fj, 5);
            c.r.append(androidx.constraintlayout.widget.j.m.ej, 6);
            c.r.append(androidx.constraintlayout.widget.j.m.ij, 7);
            c.r.append(androidx.constraintlayout.widget.j.m.mj, 8);
            c.r.append(androidx.constraintlayout.widget.j.m.lj, 9);
            c.r.append(androidx.constraintlayout.widget.j.m.kj, 10);
        }
        
        public c() {
            this.a = false;
            this.b = -1;
            this.c = 0;
            this.d = null;
            this.e = -1;
            this.f = 0;
            this.g = Float.NaN;
            this.h = -1;
            this.i = Float.NaN;
            this.j = Float.NaN;
            this.k = -1;
            this.l = null;
            this.m = -3;
            this.n = -1;
        }
        
        public void a(final c c) {
            this.a = c.a;
            this.b = c.b;
            this.d = c.d;
            this.e = c.e;
            this.f = c.f;
            this.i = c.i;
            this.g = c.g;
            this.h = c.h;
        }
        
        void b(final Context context, final AttributeSet set) {
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, androidx.constraintlayout.widget.j.m.dj);
            this.a = true;
            for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
                final int index = obtainStyledAttributes.getIndex(i);
                switch (androidx.constraintlayout.widget.e.c.r.get(index)) {
                    case 10: {
                        final int type = obtainStyledAttributes.peekValue(index).type;
                        if (type == 1) {
                            if ((this.n = obtainStyledAttributes.getResourceId(index, -1)) == -1) {
                                break;
                            }
                        }
                        else {
                            if (type != 3) {
                                this.m = obtainStyledAttributes.getInteger(index, this.n);
                                break;
                            }
                            final String string = obtainStyledAttributes.getString(index);
                            this.l = string;
                            if (string.indexOf("/") <= 0) {
                                this.m = -1;
                                break;
                            }
                            this.n = obtainStyledAttributes.getResourceId(index, -1);
                        }
                        this.m = -2;
                        break;
                    }
                    case 9: {
                        this.j = obtainStyledAttributes.getFloat(index, this.j);
                        break;
                    }
                    case 8: {
                        this.k = obtainStyledAttributes.getInteger(index, this.k);
                        break;
                    }
                    case 7: {
                        this.g = obtainStyledAttributes.getFloat(index, this.g);
                        break;
                    }
                    case 6: {
                        this.c = obtainStyledAttributes.getInteger(index, this.c);
                        break;
                    }
                    case 5: {
                        this.b = y0(obtainStyledAttributes, index, this.b);
                        break;
                    }
                    case 4: {
                        this.f = obtainStyledAttributes.getInt(index, 0);
                        break;
                    }
                    case 3: {
                        String string2;
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            string2 = obtainStyledAttributes.getString(index);
                        }
                        else {
                            string2 = androidx.constraintlayout.core.motion.utils.d.k[obtainStyledAttributes.getInteger(index, 0)];
                        }
                        this.d = string2;
                        break;
                    }
                    case 2: {
                        this.e = obtainStyledAttributes.getInt(index, this.e);
                        break;
                    }
                    case 1: {
                        this.i = obtainStyledAttributes.getFloat(index, this.i);
                        break;
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
    
    public static class d
    {
        public boolean a;
        public int b;
        public int c;
        public float d;
        public float e;
        
        public d() {
            this.a = false;
            this.b = 0;
            this.c = 0;
            this.d = 1.0f;
            this.e = Float.NaN;
        }
        
        public void a(final d d) {
            this.a = d.a;
            this.b = d.b;
            this.d = d.d;
            this.e = d.e;
            this.c = d.c;
        }
        
        void b(final Context context, final AttributeSet set) {
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, androidx.constraintlayout.widget.j.m.Rk);
            this.a = true;
            for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
                final int index = obtainStyledAttributes.getIndex(i);
                if (index == androidx.constraintlayout.widget.j.m.Tk) {
                    this.d = obtainStyledAttributes.getFloat(index, this.d);
                }
                else if (index == androidx.constraintlayout.widget.j.m.Sk) {
                    this.b = obtainStyledAttributes.getInt(index, this.b);
                    this.b = androidx.constraintlayout.widget.e.U[this.b];
                }
                else if (index == androidx.constraintlayout.widget.j.m.Wk) {
                    this.c = obtainStyledAttributes.getInt(index, this.c);
                }
                else if (index == androidx.constraintlayout.widget.j.m.Vk) {
                    this.e = obtainStyledAttributes.getFloat(index, this.e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
    
    public static class e
    {
        private static final int A = 12;
        private static SparseIntArray o;
        private static final int p = 1;
        private static final int q = 2;
        private static final int r = 3;
        private static final int s = 4;
        private static final int t = 5;
        private static final int u = 6;
        private static final int v = 7;
        private static final int w = 8;
        private static final int x = 9;
        private static final int y = 10;
        private static final int z = 11;
        public boolean a;
        public float b;
        public float c;
        public float d;
        public float e;
        public float f;
        public float g;
        public float h;
        public int i;
        public float j;
        public float k;
        public float l;
        public boolean m;
        public float n;
        
        static {
            (e.o = new SparseIntArray()).append(androidx.constraintlayout.widget.j.m.tn, 1);
            e.o.append(androidx.constraintlayout.widget.j.m.un, 2);
            e.o.append(androidx.constraintlayout.widget.j.m.vn, 3);
            e.o.append(androidx.constraintlayout.widget.j.m.rn, 4);
            e.o.append(androidx.constraintlayout.widget.j.m.sn, 5);
            e.o.append(androidx.constraintlayout.widget.j.m.nn, 6);
            e.o.append(androidx.constraintlayout.widget.j.m.on, 7);
            e.o.append(androidx.constraintlayout.widget.j.m.pn, 8);
            e.o.append(androidx.constraintlayout.widget.j.m.qn, 9);
            e.o.append(androidx.constraintlayout.widget.j.m.wn, 10);
            e.o.append(androidx.constraintlayout.widget.j.m.xn, 11);
            e.o.append(androidx.constraintlayout.widget.j.m.yn, 12);
        }
        
        public e() {
            this.a = false;
            this.b = 0.0f;
            this.c = 0.0f;
            this.d = 0.0f;
            this.e = 1.0f;
            this.f = 1.0f;
            this.g = Float.NaN;
            this.h = Float.NaN;
            this.i = -1;
            this.j = 0.0f;
            this.k = 0.0f;
            this.l = 0.0f;
            this.m = false;
            this.n = 0.0f;
        }
        
        public void a(final e e) {
            this.a = e.a;
            this.b = e.b;
            this.c = e.c;
            this.d = e.d;
            this.e = e.e;
            this.f = e.f;
            this.g = e.g;
            this.h = e.h;
            this.i = e.i;
            this.j = e.j;
            this.k = e.k;
            this.l = e.l;
            this.m = e.m;
            this.n = e.n;
        }
        
        void b(final Context context, final AttributeSet set) {
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, androidx.constraintlayout.widget.j.m.mn);
            this.a = true;
            for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
                final int index = obtainStyledAttributes.getIndex(i);
                switch (androidx.constraintlayout.widget.e.e.o.get(index)) {
                    case 12: {
                        this.i = y0(obtainStyledAttributes, index, this.i);
                        break;
                    }
                    case 11: {
                        if (Build$VERSION.SDK_INT >= 21) {
                            this.m = true;
                            this.n = obtainStyledAttributes.getDimension(index, this.n);
                            break;
                        }
                        break;
                    }
                    case 10: {
                        if (Build$VERSION.SDK_INT >= 21) {
                            this.l = obtainStyledAttributes.getDimension(index, this.l);
                            break;
                        }
                        break;
                    }
                    case 9: {
                        this.k = obtainStyledAttributes.getDimension(index, this.k);
                        break;
                    }
                    case 8: {
                        this.j = obtainStyledAttributes.getDimension(index, this.j);
                        break;
                    }
                    case 7: {
                        this.h = obtainStyledAttributes.getDimension(index, this.h);
                        break;
                    }
                    case 6: {
                        this.g = obtainStyledAttributes.getDimension(index, this.g);
                        break;
                    }
                    case 5: {
                        this.f = obtainStyledAttributes.getFloat(index, this.f);
                        break;
                    }
                    case 4: {
                        this.e = obtainStyledAttributes.getFloat(index, this.e);
                        break;
                    }
                    case 3: {
                        this.d = obtainStyledAttributes.getFloat(index, this.d);
                        break;
                    }
                    case 2: {
                        this.c = obtainStyledAttributes.getFloat(index, this.c);
                        break;
                    }
                    case 1: {
                        this.b = obtainStyledAttributes.getFloat(index, this.b);
                        break;
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
    
    class f
    {
        private static final String o = "       ";
        Writer a;
        ConstraintLayout b;
        Context c;
        int d;
        int e;
        final String f;
        final String g;
        final String h;
        final String i;
        final String j;
        final String k;
        final String l;
        HashMap<Integer, String> m;
        
        f(final Writer a, final ConstraintLayout b, final int d) throws IOException {
            this.e = 0;
            this.f = "'left'";
            this.g = "'right'";
            this.h = "'baseline'";
            this.i = "'bottom'";
            this.j = "'top'";
            this.k = "'start'";
            this.l = "'end'";
            this.m = new HashMap<Integer, String>();
            this.a = a;
            this.b = b;
            this.c = b.getContext();
            this.d = d;
        }
        
        private void e(final String s, final int i, final int n, final float n2, final int n3, final int n4, final boolean b) throws IOException {
            if (i == 0) {
                Writer writer = null;
                StringBuilder sb4 = null;
                Label_0104: {
                    if (n4 != -1 || n3 != -1) {
                        if (n != 0) {
                            String str;
                            StringBuilder sb2;
                            if (n != 1) {
                                if (n != 2) {
                                    return;
                                }
                                writer = this.a;
                                final StringBuilder sb = new StringBuilder();
                                sb.append("       ");
                                sb.append(s);
                                sb.append(": {'");
                                sb.append(n2);
                                str = "'% ,";
                                sb2 = sb;
                            }
                            else {
                                writer = this.a;
                                final StringBuilder sb3 = new StringBuilder();
                                sb3.append("       ");
                                sb3.append(s);
                                str = ": {'wrap' ,";
                                sb2 = sb3;
                            }
                            sb2.append(str);
                            sb2.append(n3);
                            sb2.append(", ");
                            sb2.append(n4);
                            sb2.append("}\n");
                            sb4 = sb2;
                            break Label_0104;
                        }
                        final Writer a = this.a;
                        final StringBuilder sb5 = new StringBuilder();
                        sb5.append("       ");
                        sb5.append(s);
                        sb5.append(": {'spread' ,");
                        sb5.append(n3);
                        sb5.append(", ");
                        sb5.append(n4);
                        sb5.append("}\n");
                        a.write(sb5.toString());
                        return;
                    }
                    StringBuilder sb6;
                    Writer writer2;
                    String str2;
                    if (n != 1) {
                        if (n != 2) {
                            return;
                        }
                        final Writer a2 = this.a;
                        sb6 = new StringBuilder();
                        sb6.append("       ");
                        sb6.append(s);
                        sb6.append(": '");
                        sb6.append(n2);
                        final String s2 = "%',\n";
                        writer2 = a2;
                        str2 = s2;
                    }
                    else {
                        final Writer a3 = this.a;
                        sb6 = new StringBuilder();
                        sb6.append("       ");
                        sb6.append(s);
                        str2 = ": '???????????',\n";
                        writer2 = a3;
                    }
                    sb6.append(str2);
                    sb4 = sb6;
                    writer = writer2;
                }
                writer.write(sb4.toString());
                return;
            }
            StringBuilder sb7;
            Writer writer3;
            String str3;
            if (i == -2) {
                final Writer a4 = this.a;
                sb7 = new StringBuilder();
                sb7.append("       ");
                sb7.append(s);
                final String s3 = ": 'wrap'\n";
                writer3 = a4;
                str3 = s3;
            }
            else {
                if (i != -1) {
                    final Writer a5 = this.a;
                    final StringBuilder sb8 = new StringBuilder();
                    sb8.append("       ");
                    sb8.append(s);
                    sb8.append(": ");
                    sb8.append(i);
                    sb8.append(",\n");
                    a5.write(sb8.toString());
                    return;
                }
                final Writer a6 = this.a;
                sb7 = new StringBuilder();
                sb7.append("       ");
                sb7.append(s);
                str3 = ": 'parent'\n";
                writer3 = a6;
            }
            sb7.append(str3);
            writer3.write(sb7.toString());
        }
        
        private void f(final int n, final int n2, final int n3, final float n4) {
        }
        
        String a(final int i) {
            if (this.m.containsKey(i)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("'");
                sb.append(this.m.get(i));
                sb.append("'");
                return sb.toString();
            }
            if (i == 0) {
                return "'parent'";
            }
            final String b = this.b(i);
            this.m.put(i, b);
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("'");
            sb2.append(b);
            sb2.append("'");
            return sb2.toString();
        }
        
        String b(int n) {
            Label_0017: {
                if (n == -1) {
                    break Label_0017;
                }
                try {
                    return this.c.getResources().getResourceEntryName(n);
                    final StringBuilder sb = new StringBuilder();
                    sb.append("unknown");
                    n = this.e + 1;
                    sb.append(this.e = n);
                    return sb.toString();
                }
                catch (Exception ex) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("unknown");
                    n = this.e + 1;
                    sb2.append(this.e = n);
                    return sb2.toString();
                }
            }
        }
        
        void c(final int n, final float f, final int i) throws IOException {
            if (n == -1) {
                return;
            }
            this.a.write("       circle");
            this.a.write(":[");
            this.a.write(this.a(n));
            final Writer a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append(", ");
            sb.append(f);
            a.write(sb.toString());
            final Writer a2 = this.a;
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(i);
            sb2.append("]");
            a2.write(sb2.toString());
        }
        
        void d(final String str, final int n, final String str2, final int i, final int n2) throws IOException {
            if (n == -1) {
                return;
            }
            final Writer a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("       ");
            sb.append(str);
            a.write(sb.toString());
            this.a.write(":[");
            this.a.write(this.a(n));
            this.a.write(" , ");
            this.a.write(str2);
            if (i != 0) {
                final Writer a2 = this.a;
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(" , ");
                sb2.append(i);
                a2.write(sb2.toString());
            }
            this.a.write("],\n");
        }
        
        void g() throws IOException {
            this.a.write("\n'ConstraintSet':{\n");
            for (final Integer key : androidx.constraintlayout.widget.e.this.g.keySet()) {
                final a a = androidx.constraintlayout.widget.e.this.g.get(key);
                final String a2 = this.a(key);
                final Writer a3 = this.a;
                final StringBuilder sb = new StringBuilder();
                sb.append(a2);
                sb.append(":{\n");
                a3.write(sb.toString());
                final b e = a.e;
                this.e("height", e.e, e.Z, e.f0, e.d0, e.b0, e.n0);
                this.e("width", e.d, e.Y, e.e0, e.c0, e.a0, e.m0);
                this.d("'left'", e.i, "'left'", e.G, e.N);
                this.d("'left'", e.j, "'right'", e.G, e.N);
                this.d("'right'", e.k, "'left'", e.H, e.P);
                this.d("'right'", e.l, "'right'", e.H, e.P);
                this.d("'baseline'", e.q, "'baseline'", -1, e.T);
                this.d("'baseline'", e.r, "'top'", -1, e.T);
                this.d("'baseline'", e.s, "'bottom'", -1, e.T);
                this.d("'top'", e.n, "'bottom'", e.I, e.O);
                this.d("'top'", e.m, "'top'", e.I, e.O);
                this.d("'bottom'", e.p, "'bottom'", e.J, e.Q);
                this.d("'bottom'", e.o, "'top'", e.J, e.Q);
                this.d("'start'", e.u, "'start'", e.L, e.S);
                this.d("'start'", e.t, "'end'", e.L, e.S);
                this.d("'end'", e.v, "'start'", e.K, e.R);
                this.d("'end'", e.w, "'end'", e.K, e.R);
                this.i("'horizontalBias'", e.x, 0.5f);
                this.i("'verticalBias'", e.y, 0.5f);
                this.c(e.A, e.C, e.B);
                this.f(e.F, e.f, e.g, e.h);
                this.k("'dimensionRatio'", e.z);
                this.j("'barrierMargin'", e.h0);
                this.j("'type'", e.i0);
                this.k("'ReferenceId'", e.k0);
                this.m("'mBarrierAllowsGoneWidgets'", e.o0, true);
                this.j("'WrapBehavior'", e.p0);
                this.h("'verticalWeight'", e.U);
                this.h("'horizontalWeight'", e.V);
                this.j("'horizontalChainStyle'", e.W);
                this.j("'verticalChainStyle'", e.X);
                this.j("'barrierDirection'", e.g0);
                final int[] j0 = e.j0;
                if (j0 != null) {
                    this.n("'ReferenceIds'", j0);
                }
                this.a.write("}\n");
            }
            this.a.write("}\n");
        }
        
        void h(final String str, final float f) throws IOException {
            if (f == -1.0f) {
                return;
            }
            final Writer a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("       ");
            sb.append(str);
            a.write(sb.toString());
            final Writer a2 = this.a;
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(": ");
            sb2.append(f);
            a2.write(sb2.toString());
            this.a.write(",\n");
        }
        
        void i(final String str, final float f, final float n) throws IOException {
            if (f == n) {
                return;
            }
            final Writer a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("       ");
            sb.append(str);
            a.write(sb.toString());
            final Writer a2 = this.a;
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(": ");
            sb2.append(f);
            a2.write(sb2.toString());
            this.a.write(",\n");
        }
        
        void j(final String str, final int i) throws IOException {
            if (i != 0) {
                if (i != -1) {
                    final Writer a = this.a;
                    final StringBuilder sb = new StringBuilder();
                    sb.append("       ");
                    sb.append(str);
                    a.write(sb.toString());
                    this.a.write(":");
                    final Writer a2 = this.a;
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append(", ");
                    sb2.append(i);
                    a2.write(sb2.toString());
                    this.a.write("\n");
                }
            }
        }
        
        void k(final String str, final String str2) throws IOException {
            if (str2 == null) {
                return;
            }
            final Writer a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("       ");
            sb.append(str);
            a.write(sb.toString());
            this.a.write(":");
            final Writer a2 = this.a;
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(", ");
            sb2.append(str2);
            a2.write(sb2.toString());
            this.a.write("\n");
        }
        
        void l(final String str, final boolean b) throws IOException {
            if (!b) {
                return;
            }
            final Writer a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("       ");
            sb.append(str);
            a.write(sb.toString());
            final Writer a2 = this.a;
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(": ");
            sb2.append(b);
            a2.write(sb2.toString());
            this.a.write(",\n");
        }
        
        void m(final String str, final boolean b, final boolean b2) throws IOException {
            if (b == b2) {
                return;
            }
            final Writer a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("       ");
            sb.append(str);
            a.write(sb.toString());
            final Writer a2 = this.a;
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(": ");
            sb2.append(b);
            a2.write(sb2.toString());
            this.a.write(",\n");
        }
        
        void n(String s, final int[] array) throws IOException {
            if (array == null) {
                return;
            }
            final Writer a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("       ");
            sb.append(s);
            a.write(sb.toString());
            this.a.write(": ");
            for (int i = 0; i < array.length; ++i) {
                final Writer a2 = this.a;
                final StringBuilder sb2 = new StringBuilder();
                if (i == 0) {
                    s = "[";
                }
                else {
                    s = ", ";
                }
                sb2.append(s);
                sb2.append(this.a(array[i]));
                a2.write(sb2.toString());
            }
            this.a.write("],\n");
        }
    }
    
    class g
    {
        private static final String o = "\n       ";
        Writer a;
        ConstraintLayout b;
        Context c;
        int d;
        int e;
        final String f;
        final String g;
        final String h;
        final String i;
        final String j;
        final String k;
        final String l;
        HashMap<Integer, String> m;
        
        g(final Writer a, final ConstraintLayout b, final int d) throws IOException {
            this.e = 0;
            this.f = "'left'";
            this.g = "'right'";
            this.h = "'baseline'";
            this.i = "'bottom'";
            this.j = "'top'";
            this.k = "'start'";
            this.l = "'end'";
            this.m = new HashMap<Integer, String>();
            this.a = a;
            this.b = b;
            this.c = b.getContext();
            this.d = d;
        }
        
        private void c(final String str, final int i, final int n) throws IOException {
            if (i != n) {
                StringBuilder sb;
                String str2;
                Writer writer;
                if (i == -2) {
                    final Writer a = this.a;
                    sb = new StringBuilder();
                    sb.append("\n       ");
                    sb.append(str);
                    str2 = "=\"wrap_content\"";
                    writer = a;
                }
                else {
                    if (i != -1) {
                        final Writer a2 = this.a;
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("\n       ");
                        sb2.append(str);
                        sb2.append("=\"");
                        sb2.append(i);
                        sb2.append("dp\"");
                        a2.write(sb2.toString());
                        return;
                    }
                    final Writer a3 = this.a;
                    sb = new StringBuilder();
                    sb.append("\n       ");
                    sb.append(str);
                    str2 = "=\"match_parent\"";
                    writer = a3;
                }
                sb.append(str2);
                writer.write(sb.toString());
            }
        }
        
        private void d(final String str, final boolean b, final boolean b2) throws IOException {
            if (b != b2) {
                final Writer a = this.a;
                final StringBuilder sb = new StringBuilder();
                sb.append("\n       ");
                sb.append(str);
                sb.append("=\"");
                sb.append(b);
                sb.append("dp\"");
                a.write(sb.toString());
            }
        }
        
        private void g(final String str, final int i, final int n) throws IOException {
            if (i != n) {
                final Writer a = this.a;
                final StringBuilder sb = new StringBuilder();
                sb.append("\n       ");
                sb.append(str);
                sb.append("=\"");
                sb.append(i);
                sb.append("dp\"");
                a.write(sb.toString());
            }
        }
        
        private void h(final String str, final int n, final String[] array, final int n2) throws IOException {
            if (n != n2) {
                final Writer a = this.a;
                final StringBuilder sb = new StringBuilder();
                sb.append("\n       ");
                sb.append(str);
                sb.append("=\"");
                sb.append(array[n]);
                sb.append("\"");
                a.write(sb.toString());
            }
        }
        
        String a(final int i) {
            if (this.m.containsKey(i)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("@+id/");
                sb.append(this.m.get(i));
                sb.append("");
                return sb.toString();
            }
            if (i == 0) {
                return "parent";
            }
            final String b = this.b(i);
            this.m.put(i, b);
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("@+id/");
            sb2.append(b);
            sb2.append("");
            return sb2.toString();
        }
        
        String b(int n) {
            Label_0017: {
                if (n == -1) {
                    break Label_0017;
                }
                try {
                    return this.c.getResources().getResourceEntryName(n);
                    final StringBuilder sb = new StringBuilder();
                    sb.append("unknown");
                    n = this.e + 1;
                    sb.append(this.e = n);
                    return sb.toString();
                }
                catch (Exception ex) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("unknown");
                    n = this.e + 1;
                    sb2.append(this.e = n);
                    return sb2.toString();
                }
            }
        }
        
        void e(final int n, final float f, final int i) throws IOException {
            if (n == -1) {
                return;
            }
            this.a.write("circle");
            this.a.write(":[");
            this.a.write(this.a(n));
            final Writer a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append(", ");
            sb.append(f);
            a.write(sb.toString());
            final Writer a2 = this.a;
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(i);
            sb2.append("]");
            a2.write(sb2.toString());
        }
        
        void f(final String str, final int n, final String str2, final int i, final int n2) throws IOException {
            if (n == -1) {
                return;
            }
            final Writer a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("\n       ");
            sb.append(str);
            a.write(sb.toString());
            this.a.write(":[");
            this.a.write(this.a(n));
            this.a.write(" , ");
            this.a.write(str2);
            if (i != 0) {
                final Writer a2 = this.a;
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(" , ");
                sb2.append(i);
                a2.write(sb2.toString());
            }
            this.a.write("],\n");
        }
        
        void i() throws IOException {
            this.a.write("\n<ConstraintSet>\n");
            for (final Integer key : androidx.constraintlayout.widget.e.this.g.keySet()) {
                final a a = androidx.constraintlayout.widget.e.this.g.get(key);
                final String a2 = this.a(key);
                this.a.write("  <Constraint");
                final Writer a3 = this.a;
                final StringBuilder sb = new StringBuilder();
                sb.append("\n       android:id=\"");
                sb.append(a2);
                sb.append("\"");
                a3.write(sb.toString());
                final b e = a.e;
                this.c("android:layout_width", e.d, -5);
                this.c("android:layout_height", e.e, -5);
                this.j("app:layout_constraintGuide_begin", (float)e.f, -1.0f);
                this.j("app:layout_constraintGuide_end", (float)e.g, -1.0f);
                this.j("app:layout_constraintGuide_percent", e.h, -1.0f);
                this.j("app:layout_constraintHorizontal_bias", e.x, 0.5f);
                this.j("app:layout_constraintVertical_bias", e.y, 0.5f);
                this.m("app:layout_constraintDimensionRatio", e.z, null);
                this.o("app:layout_constraintCircle", e.A);
                this.j("app:layout_constraintCircleRadius", (float)e.B, 0.0f);
                this.j("app:layout_constraintCircleAngle", e.C, 0.0f);
                this.j("android:orientation", (float)e.F, -1.0f);
                this.j("app:layout_constraintVertical_weight", e.U, -1.0f);
                this.j("app:layout_constraintHorizontal_weight", e.V, -1.0f);
                this.j("app:layout_constraintHorizontal_chainStyle", (float)e.W, 0.0f);
                this.j("app:layout_constraintVertical_chainStyle", (float)e.X, 0.0f);
                this.j("app:barrierDirection", (float)e.g0, -1.0f);
                this.j("app:barrierMargin", (float)e.h0, 0.0f);
                this.g("app:layout_marginLeft", e.G, 0);
                this.g("app:layout_goneMarginLeft", e.N, Integer.MIN_VALUE);
                this.g("app:layout_marginRight", e.H, 0);
                this.g("app:layout_goneMarginRight", e.P, Integer.MIN_VALUE);
                this.g("app:layout_marginStart", e.L, 0);
                this.g("app:layout_goneMarginStart", e.S, Integer.MIN_VALUE);
                this.g("app:layout_marginEnd", e.K, 0);
                this.g("app:layout_goneMarginEnd", e.R, Integer.MIN_VALUE);
                this.g("app:layout_marginTop", e.I, 0);
                this.g("app:layout_goneMarginTop", e.O, Integer.MIN_VALUE);
                this.g("app:layout_marginBottom", e.J, 0);
                this.g("app:layout_goneMarginBottom", e.Q, Integer.MIN_VALUE);
                this.g("app:goneBaselineMargin", e.T, Integer.MIN_VALUE);
                this.g("app:baselineMargin", e.M, 0);
                this.d("app:layout_constrainedWidth", e.m0, false);
                this.d("app:layout_constrainedHeight", e.n0, false);
                this.d("app:barrierAllowsGoneWidgets", e.o0, true);
                this.j("app:layout_wrapBehaviorInParent", (float)e.p0, 0.0f);
                this.o("app:baselineToBaseline", e.q);
                this.o("app:baselineToBottom", e.s);
                this.o("app:baselineToTop", e.r);
                this.o("app:layout_constraintBottom_toBottomOf", e.p);
                this.o("app:layout_constraintBottom_toTopOf", e.o);
                this.o("app:layout_constraintEnd_toEndOf", e.w);
                this.o("app:layout_constraintEnd_toStartOf", e.v);
                this.o("app:layout_constraintLeft_toLeftOf", e.i);
                this.o("app:layout_constraintLeft_toRightOf", e.j);
                this.o("app:layout_constraintRight_toLeftOf", e.k);
                this.o("app:layout_constraintRight_toRightOf", e.l);
                this.o("app:layout_constraintStart_toEndOf", e.t);
                this.o("app:layout_constraintStart_toStartOf", e.u);
                this.o("app:layout_constraintTop_toBottomOf", e.n);
                this.o("app:layout_constraintTop_toTopOf", e.m);
                final String[] array = { "spread", "wrap", "percent" };
                this.h("app:layout_constraintHeight_default", e.Z, array, 0);
                this.j("app:layout_constraintHeight_percent", e.f0, 1.0f);
                this.g("app:layout_constraintHeight_min", e.d0, 0);
                this.g("app:layout_constraintHeight_max", e.b0, 0);
                this.d("android:layout_constrainedHeight", e.n0, false);
                this.h("app:layout_constraintWidth_default", e.Y, array, 0);
                this.j("app:layout_constraintWidth_percent", e.e0, 1.0f);
                this.g("app:layout_constraintWidth_min", e.c0, 0);
                this.g("app:layout_constraintWidth_max", e.a0, 0);
                this.d("android:layout_constrainedWidth", e.m0, false);
                this.j("app:layout_constraintVertical_weight", e.U, -1.0f);
                this.j("app:layout_constraintHorizontal_weight", e.V, -1.0f);
                this.k("app:layout_constraintHorizontal_chainStyle", e.W);
                this.k("app:layout_constraintVertical_chainStyle", e.X);
                this.h("app:barrierDirection", e.g0, new String[] { "left", "right", "top", "bottom", "start", "end" }, -1);
                this.m("app:layout_constraintTag", e.l0, null);
                final int[] j0 = e.j0;
                if (j0 != null) {
                    this.n("'ReferenceIds'", j0);
                }
                this.a.write(" />\n");
            }
            this.a.write("</ConstraintSet>\n");
        }
        
        void j(final String str, final float f, final float n) throws IOException {
            if (f == n) {
                return;
            }
            final Writer a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("\n       ");
            sb.append(str);
            a.write(sb.toString());
            final Writer a2 = this.a;
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("=\"");
            sb2.append(f);
            sb2.append("\"");
            a2.write(sb2.toString());
        }
        
        void k(final String str, final int i) throws IOException {
            if (i != 0) {
                if (i != -1) {
                    final Writer a = this.a;
                    final StringBuilder sb = new StringBuilder();
                    sb.append("\n       ");
                    sb.append(str);
                    sb.append("=\"");
                    sb.append(i);
                    sb.append("\"\n");
                    a.write(sb.toString());
                }
            }
        }
        
        void l(final String str, final String str2) throws IOException {
            if (str2 == null) {
                return;
            }
            this.a.write(str);
            this.a.write(":");
            final Writer a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append(", ");
            sb.append(str2);
            a.write(sb.toString());
            this.a.write("\n");
        }
        
        void m(final String str, final String str2, final String anObject) throws IOException {
            if (str2 != null) {
                if (!str2.equals(anObject)) {
                    final Writer a = this.a;
                    final StringBuilder sb = new StringBuilder();
                    sb.append("\n       ");
                    sb.append(str);
                    a.write(sb.toString());
                    final Writer a2 = this.a;
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("=\"");
                    sb2.append(str2);
                    sb2.append("\"");
                    a2.write(sb2.toString());
                }
            }
        }
        
        void n(String s, final int[] array) throws IOException {
            if (array == null) {
                return;
            }
            final Writer a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("\n       ");
            sb.append(s);
            a.write(sb.toString());
            this.a.write(":");
            for (int i = 0; i < array.length; ++i) {
                final Writer a2 = this.a;
                final StringBuilder sb2 = new StringBuilder();
                if (i == 0) {
                    s = "[";
                }
                else {
                    s = ", ";
                }
                sb2.append(s);
                sb2.append(this.a(array[i]));
                a2.write(sb2.toString());
            }
            this.a.write("],\n");
        }
        
        void o(final String str, final int n) throws IOException {
            if (n == -1) {
                return;
            }
            final Writer a = this.a;
            final StringBuilder sb = new StringBuilder();
            sb.append("\n       ");
            sb.append(str);
            a.write(sb.toString());
            final Writer a2 = this.a;
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("=\"");
            sb2.append(this.a(n));
            sb2.append("\"");
            a2.write(sb2.toString());
        }
    }
}
