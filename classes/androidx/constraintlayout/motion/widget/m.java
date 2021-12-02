// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.motion.widget;

import android.content.res.TypedArray;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.j;
import android.util.AttributeSet;
import android.content.Context;
import java.util.HashSet;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.Locale;
import android.util.Log;
import androidx.constraintlayout.widget.a;
import java.lang.reflect.Method;
import java.util.HashMap;
import android.graphics.RectF;
import android.view.View;

public class m extends f
{
    static final String Y = "KeyTrigger";
    private static final String Z = "KeyTrigger";
    public static final String a0 = "viewTransitionOnCross";
    public static final String b0 = "viewTransitionOnPositiveCross";
    public static final String c0 = "viewTransitionOnNegativeCross";
    public static final String d0 = "postLayout";
    public static final String e0 = "triggerSlack";
    public static final String f0 = "triggerCollisionView";
    public static final String g0 = "triggerCollisionId";
    public static final String h0 = "triggerID";
    public static final String i0 = "positiveCross";
    public static final String j0 = "negativeCross";
    public static final String k0 = "triggerReceiver";
    public static final String l0 = "CROSS";
    public static final int m0 = 5;
    private int D;
    private String E;
    private int F;
    private String G;
    private String H;
    private int I;
    private int J;
    private View K;
    float L;
    private boolean M;
    private boolean N;
    private boolean O;
    private float P;
    private float Q;
    private boolean R;
    int S;
    int T;
    int U;
    RectF V;
    RectF W;
    HashMap<String, Method> X;
    
    public m() {
        this.D = -1;
        this.E = null;
        final int f = androidx.constraintlayout.motion.widget.f.f;
        this.F = f;
        this.G = null;
        this.H = null;
        this.I = f;
        this.J = f;
        this.K = null;
        this.L = 0.1f;
        this.M = true;
        this.N = true;
        this.O = true;
        this.P = Float.NaN;
        this.R = false;
        this.S = f;
        this.T = f;
        this.U = f;
        this.V = new RectF();
        this.W = new RectF();
        this.X = new HashMap<String, Method>();
        super.d = 5;
        super.e = new HashMap<String, androidx.constraintlayout.widget.a>();
    }
    
    private void B(final String s, final View obj) {
        if (s == null) {
            return;
        }
        if (s.startsWith(".")) {
            this.C(s, obj);
            return;
        }
        Method method;
        if (this.X.containsKey(s)) {
            if ((method = this.X.get(s)) == null) {
                return;
            }
        }
        else {
            method = null;
        }
        Method method2;
        if ((method2 = method) == null) {
            try {
                method2 = obj.getClass().getMethod(s, (Class<?>[])new Class[0]);
                this.X.put(s, method2);
            }
            catch (NoSuchMethodException ex) {
                this.X.put(s, null);
                final StringBuilder sb = new StringBuilder();
                sb.append("Could not find method \"");
                sb.append(s);
                sb.append("\"on class ");
                sb.append(obj.getClass().getSimpleName());
                sb.append(" ");
                sb.append(androidx.constraintlayout.motion.widget.c.k(obj));
                Log.e("KeyTrigger", sb.toString());
                return;
            }
        }
        try {
            method2.invoke(obj, new Object[0]);
        }
        catch (Exception ex2) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Exception in call \"");
            sb2.append(this.E);
            sb2.append("\"on class ");
            sb2.append(obj.getClass().getSimpleName());
            sb2.append(" ");
            sb2.append(androidx.constraintlayout.motion.widget.c.k(obj));
            Log.e("KeyTrigger", sb2.toString());
        }
    }
    
    private void C(final String s, final View view) {
        final boolean b = s.length() == 1;
        String lowerCase = s;
        if (!b) {
            lowerCase = s.substring(1).toLowerCase(Locale.ROOT);
        }
        for (final String key : super.e.keySet()) {
            final String lowerCase2 = key.toLowerCase(Locale.ROOT);
            if (b || lowerCase2.matches(lowerCase)) {
                final androidx.constraintlayout.widget.a a = super.e.get(key);
                if (a == null) {
                    continue;
                }
                a.a(view);
            }
        }
    }
    
    private void E(final RectF rectF, final View view, final boolean b) {
        rectF.top = (float)view.getTop();
        rectF.bottom = (float)view.getBottom();
        rectF.left = (float)view.getLeft();
        rectF.right = (float)view.getRight();
        if (b) {
            view.getMatrix().mapRect(rectF);
        }
    }
    
    public void A(final float q, final View view) {
        boolean b = false;
        boolean b2 = false;
        boolean b3 = false;
        Label_0401: {
            if (this.J != androidx.constraintlayout.motion.widget.f.f) {
                if (this.K == null) {
                    this.K = ((ViewGroup)view.getParent()).findViewById(this.J);
                }
                this.E(this.V, this.K, this.R);
                this.E(this.W, view, this.R);
                if (this.V.intersect(this.W)) {
                    if (this.M) {
                        this.M = false;
                        b = true;
                    }
                    else {
                        b = false;
                    }
                    if (this.O) {
                        this.O = false;
                        b2 = true;
                    }
                    else {
                        b2 = false;
                    }
                    this.N = true;
                    b3 = false;
                    break Label_0401;
                }
                if (!this.M) {
                    this.M = true;
                    b = true;
                }
                else {
                    b = false;
                }
                if (this.N) {
                    this.N = false;
                    b3 = true;
                }
                else {
                    b3 = false;
                }
                this.O = true;
            }
            else {
                Label_0241: {
                    if (this.M) {
                        final float p2 = this.P;
                        if ((q - p2) * (this.Q - p2) < 0.0f) {
                            this.M = false;
                            b = true;
                            break Label_0241;
                        }
                    }
                    else if (Math.abs(q - this.P) > this.L) {
                        this.M = true;
                    }
                    b = false;
                }
                Label_0318: {
                    if (this.N) {
                        final float p3 = this.P;
                        final float n = q - p3;
                        if ((this.Q - p3) * n < 0.0f && n < 0.0f) {
                            this.N = false;
                            b3 = true;
                            break Label_0318;
                        }
                    }
                    else if (Math.abs(q - this.P) > this.L) {
                        this.N = true;
                    }
                    b3 = false;
                }
                if (this.O) {
                    final float p4 = this.P;
                    final float n2 = q - p4;
                    if ((this.Q - p4) * n2 < 0.0f && n2 > 0.0f) {
                        this.O = false;
                        b2 = true;
                    }
                    else {
                        b2 = false;
                    }
                    break Label_0401;
                }
                if (Math.abs(q - this.P) > this.L) {
                    this.O = true;
                }
            }
            b2 = false;
        }
        this.Q = q;
        if (b3 || b || b2) {
            ((s)view.getParent()).D0(this.I, b2, q);
        }
        View viewById;
        if (this.F == androidx.constraintlayout.motion.widget.f.f) {
            viewById = view;
        }
        else {
            viewById = ((s)view.getParent()).findViewById(this.F);
        }
        if (b3) {
            final String g = this.G;
            if (g != null) {
                this.B(g, viewById);
            }
            if (this.S != androidx.constraintlayout.motion.widget.f.f) {
                ((s)view.getParent()).r1(this.S, viewById);
            }
        }
        if (b2) {
            final String h = this.H;
            if (h != null) {
                this.B(h, viewById);
            }
            if (this.T != androidx.constraintlayout.motion.widget.f.f) {
                ((s)view.getParent()).r1(this.T, viewById);
            }
        }
        if (b) {
            final String e = this.E;
            if (e != null) {
                this.B(e, viewById);
            }
            if (this.U != androidx.constraintlayout.motion.widget.f.f) {
                ((s)view.getParent()).r1(this.U, viewById);
            }
        }
    }
    
    int D() {
        return this.D;
    }
    
    @Override
    public void a(final HashMap<String, androidx.constraintlayout.motion.utils.c> hashMap) {
    }
    
    @Override
    public f b() {
        return new m().c(this);
    }
    
    @Override
    public f c(final f f) {
        super.c(f);
        final m m = (m)f;
        this.D = m.D;
        this.E = m.E;
        this.F = m.F;
        this.G = m.G;
        this.H = m.H;
        this.I = m.I;
        this.J = m.J;
        this.K = m.K;
        this.L = m.L;
        this.M = m.M;
        this.N = m.N;
        this.O = m.O;
        this.P = m.P;
        this.Q = m.Q;
        this.R = m.R;
        this.V = m.V;
        this.W = m.W;
        this.X = m.X;
        return this;
    }
    
    public void d(final HashSet<String> set) {
    }
    
    public void f(final Context context, final AttributeSet set) {
        a.a(this, context.obtainStyledAttributes(set, androidx.constraintlayout.widget.j.m.dg), context);
    }
    
    @Override
    public void j(final String s, final Object o) {
        s.hashCode();
        final int hashCode = s.hashCode();
        int n = -1;
        switch (hashCode) {
            case 1535404999: {
                if (!s.equals("triggerReceiver")) {
                    break;
                }
                n = 11;
                break;
            }
            case 1401391082: {
                if (!s.equals("postLayout")) {
                    break;
                }
                n = 10;
                break;
            }
            case 1301930599: {
                if (!s.equals("viewTransitionOnCross")) {
                    break;
                }
                n = 9;
                break;
            }
            case 364489912: {
                if (!s.equals("triggerSlack")) {
                    break;
                }
                n = 8;
                break;
            }
            case 64397344: {
                if (!s.equals("CROSS")) {
                    break;
                }
                n = 7;
                break;
            }
            case -9754574: {
                if (!s.equals("viewTransitionOnNegativeCross")) {
                    break;
                }
                n = 6;
                break;
            }
            case -76025313: {
                if (!s.equals("triggerCollisionView")) {
                    break;
                }
                n = 5;
                break;
            }
            case -638126837: {
                if (!s.equals("negativeCross")) {
                    break;
                }
                n = 4;
                break;
            }
            case -648752941: {
                if (!s.equals("triggerID")) {
                    break;
                }
                n = 3;
                break;
            }
            case -786670827: {
                if (!s.equals("triggerCollisionId")) {
                    break;
                }
                n = 2;
                break;
            }
            case -966421266: {
                if (!s.equals("viewTransitionOnPositiveCross")) {
                    break;
                }
                n = 1;
                break;
            }
            case -1594793529: {
                if (!s.equals("positiveCross")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        switch (n) {
            case 11: {
                this.F = this.n(o);
                break;
            }
            case 10: {
                this.R = this.l(o);
                break;
            }
            case 9: {
                this.U = this.n(o);
                break;
            }
            case 8: {
                this.L = this.m(o);
                break;
            }
            case 7: {
                this.E = o.toString();
                break;
            }
            case 6: {
                this.S = this.n(o);
                break;
            }
            case 5: {
                this.K = (View)o;
                break;
            }
            case 4: {
                this.G = o.toString();
                break;
            }
            case 3: {
                this.I = this.n(o);
                break;
            }
            case 2: {
                this.J = this.n(o);
                break;
            }
            case 1: {
                this.T = this.n(o);
                break;
            }
            case 0: {
                this.H = o.toString();
                break;
            }
        }
    }
    
    private static class a
    {
        private static final int a = 1;
        private static final int b = 2;
        private static final int c = 4;
        private static final int d = 5;
        private static final int e = 6;
        private static final int f = 7;
        private static final int g = 8;
        private static final int h = 9;
        private static final int i = 10;
        private static final int j = 11;
        private static final int k = 12;
        private static final int l = 13;
        private static final int m = 14;
        private static SparseIntArray n;
        
        static {
            (androidx.constraintlayout.motion.widget.m.a.n = new SparseIntArray()).append(androidx.constraintlayout.widget.j.m.eg, 8);
            androidx.constraintlayout.motion.widget.m.a.n.append(androidx.constraintlayout.widget.j.m.ig, 4);
            androidx.constraintlayout.motion.widget.m.a.n.append(androidx.constraintlayout.widget.j.m.jg, 1);
            androidx.constraintlayout.motion.widget.m.a.n.append(androidx.constraintlayout.widget.j.m.kg, 2);
            androidx.constraintlayout.motion.widget.m.a.n.append(androidx.constraintlayout.widget.j.m.fg, 7);
            androidx.constraintlayout.motion.widget.m.a.n.append(androidx.constraintlayout.widget.j.m.lg, 6);
            androidx.constraintlayout.motion.widget.m.a.n.append(androidx.constraintlayout.widget.j.m.ng, 5);
            androidx.constraintlayout.motion.widget.m.a.n.append(androidx.constraintlayout.widget.j.m.hg, 9);
            androidx.constraintlayout.motion.widget.m.a.n.append(androidx.constraintlayout.widget.j.m.gg, 10);
            androidx.constraintlayout.motion.widget.m.a.n.append(androidx.constraintlayout.widget.j.m.mg, 11);
            androidx.constraintlayout.motion.widget.m.a.n.append(androidx.constraintlayout.widget.j.m.og, 12);
            androidx.constraintlayout.motion.widget.m.a.n.append(androidx.constraintlayout.widget.j.m.pg, 13);
            androidx.constraintlayout.motion.widget.m.a.n.append(androidx.constraintlayout.widget.j.m.qg, 14);
        }
        
        public static void a(final m m, final TypedArray typedArray, final Context context) {
            for (int indexCount = typedArray.getIndexCount(), i = 0; i < indexCount; ++i) {
                final int index = typedArray.getIndex(i);
                switch (androidx.constraintlayout.motion.widget.m.a.n.get(index)) {
                    default: {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("unused attribute 0x");
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(androidx.constraintlayout.motion.widget.m.a.n.get(index));
                        Log.e("KeyTrigger", sb.toString());
                        break;
                    }
                    case 14: {
                        m.T = typedArray.getResourceId(index, m.T);
                        break;
                    }
                    case 13: {
                        m.S = typedArray.getResourceId(index, m.S);
                        break;
                    }
                    case 12: {
                        m.U = typedArray.getResourceId(index, m.U);
                        break;
                    }
                    case 11: {
                        m.F = typedArray.getResourceId(index, m.F);
                        break;
                    }
                    case 10: {
                        m.R = typedArray.getBoolean(index, m.R);
                        break;
                    }
                    case 9: {
                        m.J = typedArray.getResourceId(index, m.J);
                        break;
                    }
                    case 8: {
                        final int integer = typedArray.getInteger(index, m.a);
                        m.a = integer;
                        m.P = (integer + 0.5f) / 100.0f;
                        break;
                    }
                    case 7: {
                        if (androidx.constraintlayout.motion.widget.s.c2) {
                            if ((m.b = typedArray.getResourceId(index, m.b)) != -1) {
                                break;
                            }
                        }
                        else if (typedArray.peekValue(index).type != 3) {
                            m.b = typedArray.getResourceId(index, m.b);
                            break;
                        }
                        m.c = typedArray.getString(index);
                        break;
                    }
                    case 6: {
                        m.I = typedArray.getResourceId(index, m.I);
                        break;
                    }
                    case 5: {
                        m.L = typedArray.getFloat(index, m.L);
                        break;
                    }
                    case 4: {
                        m.E = typedArray.getString(index);
                        break;
                    }
                    case 2: {
                        m.H = typedArray.getString(index);
                        break;
                    }
                    case 1: {
                        m.G = typedArray.getString(index);
                        break;
                    }
                }
            }
        }
    }
}
