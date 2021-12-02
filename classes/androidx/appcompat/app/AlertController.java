// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.app;

import java.lang.ref.WeakReference;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.SimpleCursorAdapter;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.ArrayAdapter;
import android.content.DialogInterface$OnKeyListener;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnCancelListener;
import android.widget.AdapterView$OnItemSelectedListener;
import android.database.Cursor;
import android.content.DialogInterface$OnMultiChoiceClickListener;
import android.content.DialogInterface$OnClickListener;
import android.view.KeyEvent;
import androidx.appcompat.widget.LinearLayoutCompat;
import android.widget.FrameLayout;
import android.view.LayoutInflater;
import android.text.TextUtils;
import android.widget.AbsListView;
import android.widget.AbsListView$OnScrollListener;
import androidx.core.view.j0;
import android.os.Build$VERSION;
import android.view.ViewParent;
import android.view.ViewStub;
import androidx.annotation.k0;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.content.res.Resources$Theme;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import c.a;
import android.content.DialogInterface;
import android.os.Message;
import android.widget.Button;
import android.widget.ListView;
import android.view.Window;
import android.content.Context;
import android.view.View$OnClickListener;
import android.os.Handler;
import android.widget.ListAdapter;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import androidx.core.widget.NestedScrollView;

class AlertController
{
    NestedScrollView A;
    private int B;
    private Drawable C;
    private ImageView D;
    private TextView E;
    private TextView F;
    private View G;
    ListAdapter H;
    int I;
    private int J;
    private int K;
    int L;
    int M;
    int N;
    int O;
    private boolean P;
    private int Q;
    Handler R;
    private final View$OnClickListener S;
    private final Context a;
    final i b;
    private final Window c;
    private final int d;
    private CharSequence e;
    private CharSequence f;
    ListView g;
    private View h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private boolean n;
    Button o;
    private CharSequence p;
    Message q;
    private Drawable r;
    Button s;
    private CharSequence t;
    Message u;
    private Drawable v;
    Button w;
    private CharSequence x;
    Message y;
    private Drawable z;
    
    public AlertController(final Context a, final i b, final Window c) {
        this.n = false;
        this.B = 0;
        this.I = -1;
        this.Q = 0;
        this.S = (View$OnClickListener)new View$OnClickListener() {
            public void onClick(final View view) {
                final AlertController g = AlertController.this;
                Message message2 = null;
                Label_0081: {
                    while (true) {
                        Label_0032: {
                            if (view != g.o) {
                                break Label_0032;
                            }
                            final Message q = g.q;
                            if (q == null) {
                                break Label_0032;
                            }
                            final Message message = q;
                            message2 = Message.obtain(message);
                            break Label_0081;
                        }
                        if (view == g.s) {
                            final Message u = g.u;
                            if (u != null) {
                                final Message message = u;
                                continue;
                            }
                        }
                        break;
                    }
                    if (view == g.w) {
                        final Message y = g.y;
                        if (y != null) {
                            message2 = Message.obtain(y);
                            break Label_0081;
                        }
                    }
                    message2 = null;
                }
                if (message2 != null) {
                    message2.sendToTarget();
                }
                final AlertController g2 = AlertController.this;
                g2.R.obtainMessage(1, (Object)g2.b).sendToTarget();
            }
        };
        this.a = a;
        this.b = b;
        this.c = c;
        this.R = new g((DialogInterface)b);
        final TypedArray obtainStyledAttributes = a.obtainStyledAttributes((AttributeSet)null, c.a.n.T, c.a.c.M, 0);
        this.J = obtainStyledAttributes.getResourceId(c.a.n.U, 0);
        this.K = obtainStyledAttributes.getResourceId(c.a.n.W, 0);
        this.L = obtainStyledAttributes.getResourceId(c.a.n.Y, 0);
        this.M = obtainStyledAttributes.getResourceId(c.a.n.Z, 0);
        this.N = obtainStyledAttributes.getResourceId(c.a.n.b0, 0);
        this.O = obtainStyledAttributes.getResourceId(c.a.n.X, 0);
        this.P = obtainStyledAttributes.getBoolean(c.a.n.a0, true);
        this.d = obtainStyledAttributes.getDimensionPixelSize(c.a.n.V, 0);
        obtainStyledAttributes.recycle();
        b.e(1);
    }
    
    private void A() {
        final View viewById = this.c.findViewById(c.a.h.O0);
        final int o1 = c.a.h.O1;
        final View viewById2 = viewById.findViewById(o1);
        final int j0 = c.a.h.j0;
        final View viewById3 = viewById.findViewById(j0);
        final int e0 = c.a.h.e0;
        final View viewById4 = viewById.findViewById(e0);
        final ViewGroup viewGroup = (ViewGroup)viewById.findViewById(c.a.h.l0);
        this.y(viewGroup);
        final View viewById5 = viewGroup.findViewById(o1);
        final View viewById6 = viewGroup.findViewById(j0);
        final View viewById7 = viewGroup.findViewById(e0);
        final ViewGroup i = this.j(viewById5, viewById2);
        final ViewGroup k = this.j(viewById6, viewById3);
        final ViewGroup l = this.j(viewById7, viewById4);
        this.x(k);
        this.w(l);
        this.z(i);
        final int visibility = viewGroup.getVisibility();
        final int n = false ? 1 : 0;
        final boolean b = visibility != 8;
        final boolean b2 = i != null && i.getVisibility() != 8;
        final boolean b3 = l != null && l.getVisibility() != 8;
        if (!b3 && k != null) {
            final View viewById8 = k.findViewById(c.a.h.I1);
            if (viewById8 != null) {
                viewById8.setVisibility(0);
            }
        }
        if (b2) {
            final NestedScrollView a = this.A;
            if (a != null) {
                a.setClipToPadding(true);
            }
            View viewById9 = null;
            if (this.f != null || this.g != null) {
                viewById9 = i.findViewById(c.a.h.M1);
            }
            if (viewById9 != null) {
                viewById9.setVisibility(0);
            }
        }
        else if (k != null) {
            final View viewById10 = k.findViewById(c.a.h.J1);
            if (viewById10 != null) {
                viewById10.setVisibility(0);
            }
        }
        final ListView g = this.g;
        if (g instanceof RecycleListView) {
            ((RecycleListView)g).a(b2, b3);
        }
        if (!b) {
            Object o2 = this.g;
            if (o2 == null) {
                o2 = this.A;
            }
            if (o2 != null) {
                int n2 = n;
                if (b3) {
                    n2 = 2;
                }
                this.r(k, (View)o2, (b2 ? 1 : 0) | n2, 3);
            }
        }
        final ListView g2 = this.g;
        if (g2 != null) {
            final ListAdapter h = this.H;
            if (h != null) {
                g2.setAdapter(h);
                final int m = this.I;
                if (m > -1) {
                    g2.setItemChecked(m, true);
                    g2.setSelection(m);
                }
            }
        }
    }
    
    private static boolean B(final Context context) {
        final TypedValue typedValue = new TypedValue();
        final Resources$Theme theme = context.getTheme();
        final int l = a.c.L;
        boolean b = true;
        theme.resolveAttribute(l, typedValue, true);
        if (typedValue.data == 0) {
            b = false;
        }
        return b;
    }
    
    static boolean a(final View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        final ViewGroup viewGroup = (ViewGroup)view;
        int i = viewGroup.getChildCount();
        while (i > 0) {
            if (a(viewGroup.getChildAt(--i))) {
                return true;
            }
        }
        return false;
    }
    
    private void b(final Button button) {
        final LinearLayout$LayoutParams layoutParams = (LinearLayout$LayoutParams)button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
    }
    
    static void g(final View view, final View view2, final View view3) {
        final int n = 0;
        if (view2 != null) {
            int visibility;
            if (view.canScrollVertically(-1)) {
                visibility = 0;
            }
            else {
                visibility = 4;
            }
            view2.setVisibility(visibility);
        }
        if (view3 != null) {
            int visibility2;
            if (view.canScrollVertically(1)) {
                visibility2 = n;
            }
            else {
                visibility2 = 4;
            }
            view3.setVisibility(visibility2);
        }
    }
    
    @k0
    private ViewGroup j(@k0 View inflate, @k0 View inflate2) {
        if (inflate == null) {
            inflate = inflate2;
            if (inflate2 instanceof ViewStub) {
                inflate = ((ViewStub)inflate2).inflate();
            }
            return (ViewGroup)inflate;
        }
        if (inflate2 != null) {
            final ViewParent parent = inflate2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup)parent).removeView(inflate2);
            }
        }
        inflate2 = inflate;
        if (inflate instanceof ViewStub) {
            inflate2 = ((ViewStub)inflate).inflate();
        }
        return (ViewGroup)inflate2;
    }
    
    private int k() {
        final int k = this.K;
        if (k == 0) {
            return this.J;
        }
        if (this.Q == 1) {
            return k;
        }
        return this.J;
    }
    
    private void r(final ViewGroup viewGroup, View view, final int n, final int n2) {
        final View viewById = this.c.findViewById(c.a.h.W0);
        final View viewById2 = this.c.findViewById(c.a.h.V0);
        if (Build$VERSION.SDK_INT >= 23) {
            j0.n2(view, n, n2);
            if (viewById != null) {
                viewGroup.removeView(viewById);
            }
            if (viewById2 == null) {
                return;
            }
            view = viewById2;
        }
        else {
            View view2;
            if ((view2 = viewById) != null) {
                view2 = viewById;
                if ((n & 0x1) == 0x0) {
                    viewGroup.removeView(viewById);
                    view2 = null;
                }
            }
            if ((view = viewById2) != null) {
                view = viewById2;
                if ((n & 0x2) == 0x0) {
                    viewGroup.removeView(viewById2);
                    view = null;
                }
            }
            if (view2 == null && view == null) {
                return;
            }
            if (this.f != null) {
                this.A.setOnScrollChangeListener((NestedScrollView.b)new NestedScrollView.b() {
                    @Override
                    public void a(final NestedScrollView nestedScrollView, final int n, final int n2, final int n3, final int n4) {
                        AlertController.g((View)nestedScrollView, view2, view);
                    }
                });
                this.A.post((Runnable)new Runnable() {
                    @Override
                    public void run() {
                        AlertController.g((View)AlertController.this.A, view2, view);
                    }
                });
                return;
            }
            final ListView g = this.g;
            if (g != null) {
                g.setOnScrollListener((AbsListView$OnScrollListener)new AbsListView$OnScrollListener() {
                    public void onScroll(final AbsListView absListView, final int n, final int n2, final int n3) {
                        AlertController.g((View)absListView, view2, view);
                    }
                    
                    public void onScrollStateChanged(final AbsListView absListView, final int n) {
                    }
                });
                this.g.post((Runnable)new Runnable() {
                    @Override
                    public void run() {
                        AlertController.g((View)AlertController.this.g, view2, view);
                    }
                });
                return;
            }
            if (view2 != null) {
                viewGroup.removeView(view2);
            }
            if (view == null) {
                return;
            }
        }
        viewGroup.removeView(view);
    }
    
    private void w(final ViewGroup viewGroup) {
        (this.o = (Button)viewGroup.findViewById(16908313)).setOnClickListener(this.S);
        final boolean empty = TextUtils.isEmpty(this.p);
        final int n = 1;
        int n2;
        if (empty && this.r == null) {
            this.o.setVisibility(8);
            n2 = 0;
        }
        else {
            this.o.setText(this.p);
            final Drawable r = this.r;
            if (r != null) {
                final int d = this.d;
                r.setBounds(0, 0, d, d);
                this.o.setCompoundDrawables(this.r, (Drawable)null, (Drawable)null, (Drawable)null);
            }
            this.o.setVisibility(0);
            n2 = 1;
        }
        (this.s = (Button)viewGroup.findViewById(16908314)).setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.t) && this.v == null) {
            this.s.setVisibility(8);
        }
        else {
            this.s.setText(this.t);
            final Drawable v = this.v;
            if (v != null) {
                final int d2 = this.d;
                v.setBounds(0, 0, d2, d2);
                this.s.setCompoundDrawables(this.v, (Drawable)null, (Drawable)null, (Drawable)null);
            }
            this.s.setVisibility(0);
            n2 |= 0x2;
        }
        (this.w = (Button)viewGroup.findViewById(16908315)).setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.x) && this.z == null) {
            this.w.setVisibility(8);
        }
        else {
            this.w.setText(this.x);
            final Drawable z = this.z;
            if (z != null) {
                final int d3 = this.d;
                z.setBounds(0, 0, d3, d3);
                this.w.setCompoundDrawables(this.z, (Drawable)null, (Drawable)null, (Drawable)null);
            }
            this.w.setVisibility(0);
            n2 |= 0x4;
        }
        Label_0413: {
            if (B(this.a)) {
                Button button;
                if (n2 == 1) {
                    button = this.o;
                }
                else if (n2 == 2) {
                    button = this.s;
                }
                else {
                    if (n2 != 4) {
                        break Label_0413;
                    }
                    button = this.w;
                }
                this.b(button);
            }
        }
        int n3;
        if (n2 != 0) {
            n3 = n;
        }
        else {
            n3 = 0;
        }
        if (n3 == 0) {
            viewGroup.setVisibility(8);
        }
    }
    
    private void x(ViewGroup viewGroup) {
        (this.A = (NestedScrollView)this.c.findViewById(c.a.h.X0)).setFocusable(false);
        this.A.setNestedScrollingEnabled(false);
        final TextView f = (TextView)viewGroup.findViewById(16908299);
        this.F = f;
        if (f == null) {
            return;
        }
        final CharSequence f2 = this.f;
        if (f2 != null) {
            f.setText(f2);
        }
        else {
            f.setVisibility(8);
            this.A.removeView((View)this.F);
            if (this.g != null) {
                viewGroup = (ViewGroup)this.A.getParent();
                final int indexOfChild = viewGroup.indexOfChild((View)this.A);
                viewGroup.removeViewAt(indexOfChild);
                viewGroup.addView((View)this.g, indexOfChild, new ViewGroup$LayoutParams(-1, -1));
            }
            else {
                viewGroup.setVisibility(8);
            }
        }
    }
    
    private void y(final ViewGroup viewGroup) {
        View view = this.h;
        boolean b = false;
        if (view == null) {
            if (this.i != 0) {
                view = LayoutInflater.from(this.a).inflate(this.i, viewGroup, false);
            }
            else {
                view = null;
            }
        }
        if (view != null) {
            b = true;
        }
        if (!b || !a(view)) {
            this.c.setFlags(131072, 131072);
        }
        if (b) {
            final FrameLayout frameLayout = (FrameLayout)this.c.findViewById(c.a.h.k0);
            frameLayout.addView(view, new ViewGroup$LayoutParams(-1, -1));
            if (this.n) {
                frameLayout.setPadding(this.j, this.k, this.l, this.m);
            }
            if (this.g != null) {
                ((LinearLayoutCompat.b)viewGroup.getLayoutParams()).weight = 0.0f;
            }
        }
        else {
            viewGroup.setVisibility(8);
        }
    }
    
    private void z(final ViewGroup viewGroup) {
        if (this.G != null) {
            viewGroup.addView(this.G, 0, new ViewGroup$LayoutParams(-1, -2));
            this.c.findViewById(c.a.h.N1).setVisibility(8);
        }
        else {
            this.D = (ImageView)this.c.findViewById(16908294);
            if ((TextUtils.isEmpty(this.e) ^ true) && this.P) {
                (this.E = (TextView)this.c.findViewById(c.a.h.b0)).setText(this.e);
                final int b = this.B;
                if (b != 0) {
                    this.D.setImageResource(b);
                }
                else {
                    final Drawable c = this.C;
                    if (c != null) {
                        this.D.setImageDrawable(c);
                    }
                    else {
                        this.E.setPadding(this.D.getPaddingLeft(), this.D.getPaddingTop(), this.D.getPaddingRight(), this.D.getPaddingBottom());
                        this.D.setVisibility(8);
                    }
                }
            }
            else {
                this.c.findViewById(c.a.h.N1).setVisibility(8);
                this.D.setVisibility(8);
                viewGroup.setVisibility(8);
            }
        }
    }
    
    public Button c(final int n) {
        if (n == -3) {
            return this.w;
        }
        if (n == -2) {
            return this.s;
        }
        if (n != -1) {
            return null;
        }
        return this.o;
    }
    
    public int d(final int n) {
        final TypedValue typedValue = new TypedValue();
        this.a.getTheme().resolveAttribute(n, typedValue, true);
        return typedValue.resourceId;
    }
    
    public ListView e() {
        return this.g;
    }
    
    public void f() {
        this.b.setContentView(this.k());
        this.A();
    }
    
    public boolean h(final int n, final KeyEvent keyEvent) {
        final NestedScrollView a = this.A;
        return a != null && a.o(keyEvent);
    }
    
    public boolean i(final int n, final KeyEvent keyEvent) {
        final NestedScrollView a = this.A;
        return a != null && a.o(keyEvent);
    }
    
    public void l(final int n, final CharSequence x, final DialogInterface$OnClickListener dialogInterface$OnClickListener, final Message message, final Drawable z) {
        Message obtainMessage = message;
        if (message == null) {
            obtainMessage = message;
            if (dialogInterface$OnClickListener != null) {
                obtainMessage = this.R.obtainMessage(n, (Object)dialogInterface$OnClickListener);
            }
        }
        if (n != -3) {
            if (n != -2) {
                if (n != -1) {
                    throw new IllegalArgumentException("Button does not exist");
                }
                this.p = x;
                this.q = obtainMessage;
                this.r = z;
            }
            else {
                this.t = x;
                this.u = obtainMessage;
                this.v = z;
            }
        }
        else {
            this.x = x;
            this.y = obtainMessage;
            this.z = z;
        }
    }
    
    public void m(final int q) {
        this.Q = q;
    }
    
    public void n(final View g) {
        this.G = g;
    }
    
    public void o(final int b) {
        this.C = null;
        this.B = b;
        final ImageView d = this.D;
        if (d != null) {
            if (b != 0) {
                d.setVisibility(0);
                this.D.setImageResource(this.B);
            }
            else {
                d.setVisibility(8);
            }
        }
    }
    
    public void p(final Drawable drawable) {
        this.C = drawable;
        this.B = 0;
        final ImageView d = this.D;
        if (d != null) {
            if (drawable != null) {
                d.setVisibility(0);
                this.D.setImageDrawable(drawable);
            }
            else {
                d.setVisibility(8);
            }
        }
    }
    
    public void q(final CharSequence charSequence) {
        this.f = charSequence;
        final TextView f = this.F;
        if (f != null) {
            f.setText(charSequence);
        }
    }
    
    public void s(final CharSequence charSequence) {
        this.e = charSequence;
        final TextView e = this.E;
        if (e != null) {
            e.setText(charSequence);
        }
    }
    
    public void t(final int i) {
        this.h = null;
        this.i = i;
        this.n = false;
    }
    
    public void u(final View h) {
        this.h = h;
        this.i = 0;
        this.n = false;
    }
    
    public void v(final View h, final int j, final int k, final int l, final int m) {
        this.h = h;
        this.i = 0;
        this.n = true;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
    }
    
    public static class RecycleListView extends ListView
    {
        private final int G;
        private final int H;
        
        public RecycleListView(final Context context) {
            this(context, null);
        }
        
        public RecycleListView(final Context context, final AttributeSet set) {
            super(context, set);
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, a.n.a6);
            this.H = obtainStyledAttributes.getDimensionPixelOffset(a.n.b6, -1);
            this.G = obtainStyledAttributes.getDimensionPixelOffset(a.n.c6, -1);
        }
        
        public void a(final boolean b, final boolean b2) {
            if (!b2 || !b) {
                final int paddingLeft = this.getPaddingLeft();
                int n;
                if (b) {
                    n = this.getPaddingTop();
                }
                else {
                    n = this.G;
                }
                final int paddingRight = this.getPaddingRight();
                int n2;
                if (b2) {
                    n2 = this.getPaddingBottom();
                }
                else {
                    n2 = this.H;
                }
                this.setPadding(paddingLeft, n, paddingRight, n2);
            }
        }
    }
    
    public static class f
    {
        public int A;
        public int B;
        public int C;
        public int D;
        public boolean E;
        public boolean[] F;
        public boolean G;
        public boolean H;
        public int I;
        public DialogInterface$OnMultiChoiceClickListener J;
        public Cursor K;
        public String L;
        public String M;
        public boolean N;
        public AdapterView$OnItemSelectedListener O;
        public e P;
        public boolean Q;
        public final Context a;
        public final LayoutInflater b;
        public int c;
        public Drawable d;
        public int e;
        public CharSequence f;
        public View g;
        public CharSequence h;
        public CharSequence i;
        public Drawable j;
        public DialogInterface$OnClickListener k;
        public CharSequence l;
        public Drawable m;
        public DialogInterface$OnClickListener n;
        public CharSequence o;
        public Drawable p;
        public DialogInterface$OnClickListener q;
        public boolean r;
        public DialogInterface$OnCancelListener s;
        public DialogInterface$OnDismissListener t;
        public DialogInterface$OnKeyListener u;
        public CharSequence[] v;
        public ListAdapter w;
        public DialogInterface$OnClickListener x;
        public int y;
        public View z;
        
        public f(final Context a) {
            this.c = 0;
            this.e = 0;
            this.E = false;
            this.I = -1;
            this.Q = true;
            this.a = a;
            this.r = true;
            this.b = (LayoutInflater)a.getSystemService("layout_inflater");
        }
        
        private void b(final AlertController alertController) {
            final RecycleListView g = (RecycleListView)this.b.inflate(alertController.L, (ViewGroup)null);
            Object w;
            if (this.G) {
                if (this.K == null) {
                    w = new ArrayAdapter<CharSequence>(this.a, alertController.M, 16908308, this.v) {
                        public View getView(final int n, final View view, final ViewGroup viewGroup) {
                            final View view2 = super.getView(n, view, viewGroup);
                            final boolean[] f = AlertController.f.this.F;
                            if (f != null && f[n]) {
                                g.setItemChecked(n, true);
                            }
                            return view2;
                        }
                    };
                }
                else {
                    w = new CursorAdapter(this.a, this.K, false) {
                        private final int G;
                        private final int H;
                        
                        {
                            final Cursor cursor2 = this.getCursor();
                            this.G = cursor2.getColumnIndexOrThrow(AlertController.f.this.L);
                            this.H = cursor2.getColumnIndexOrThrow(AlertController.f.this.M);
                        }
                        
                        public void bindView(final View view, final Context context, final Cursor cursor) {
                            ((CheckedTextView)view.findViewById(16908308)).setText((CharSequence)cursor.getString(this.G));
                            final RecycleListView i = g;
                            final int position = cursor.getPosition();
                            final int int1 = cursor.getInt(this.H);
                            boolean b = true;
                            if (int1 != 1) {
                                b = false;
                            }
                            i.setItemChecked(position, b);
                        }
                        
                        public View newView(final Context context, final Cursor cursor, final ViewGroup viewGroup) {
                            return AlertController.f.this.b.inflate(alertController.M, viewGroup, false);
                        }
                    };
                }
            }
            else {
                int n;
                if (this.H) {
                    n = alertController.N;
                }
                else {
                    n = alertController.O;
                }
                if (this.K != null) {
                    w = new SimpleCursorAdapter(this.a, n, this.K, new String[] { this.L }, new int[] { 16908308 });
                }
                else {
                    w = this.w;
                    if (w == null) {
                        w = new h(this.a, n, 16908308, this.v);
                    }
                }
            }
            final e p = this.P;
            if (p != null) {
                p.a(g);
            }
            alertController.H = (ListAdapter)w;
            alertController.I = this.I;
            Label_0259: {
                Object onItemClickListener;
                if (this.x != null) {
                    onItemClickListener = new AdapterView$OnItemClickListener() {
                        public void onItemClick(final AdapterView<?> adapterView, final View view, final int n, final long n2) {
                            AlertController.f.this.x.onClick((DialogInterface)alertController.b, n);
                            if (!AlertController.f.this.H) {
                                alertController.b.dismiss();
                            }
                        }
                    };
                }
                else {
                    if (this.J == null) {
                        break Label_0259;
                    }
                    onItemClickListener = new AdapterView$OnItemClickListener() {
                        public void onItemClick(final AdapterView<?> adapterView, final View view, final int n, final long n2) {
                            final boolean[] f = AlertController.f.this.F;
                            if (f != null) {
                                f[n] = g.isItemChecked(n);
                            }
                            AlertController.f.this.J.onClick((DialogInterface)alertController.b, n, g.isItemChecked(n));
                        }
                    };
                }
                g.setOnItemClickListener((AdapterView$OnItemClickListener)onItemClickListener);
            }
            final AdapterView$OnItemSelectedListener o = this.O;
            if (o != null) {
                g.setOnItemSelectedListener(o);
            }
            if (this.H) {
                g.setChoiceMode(1);
            }
            else if (this.G) {
                g.setChoiceMode(2);
            }
            alertController.g = g;
        }
        
        public void a(final AlertController alertController) {
            final View g = this.g;
            if (g != null) {
                alertController.n(g);
            }
            else {
                final CharSequence f = this.f;
                if (f != null) {
                    alertController.s(f);
                }
                final Drawable d = this.d;
                if (d != null) {
                    alertController.p(d);
                }
                final int c = this.c;
                if (c != 0) {
                    alertController.o(c);
                }
                final int e = this.e;
                if (e != 0) {
                    alertController.o(alertController.d(e));
                }
            }
            final CharSequence h = this.h;
            if (h != null) {
                alertController.q(h);
            }
            final CharSequence i = this.i;
            if (i != null || this.j != null) {
                alertController.l(-1, i, this.k, null, this.j);
            }
            final CharSequence l = this.l;
            if (l != null || this.m != null) {
                alertController.l(-2, l, this.n, null, this.m);
            }
            final CharSequence o = this.o;
            if (o != null || this.p != null) {
                alertController.l(-3, o, this.q, null, this.p);
            }
            if (this.v != null || this.K != null || this.w != null) {
                this.b(alertController);
            }
            final View z = this.z;
            if (z != null) {
                if (this.E) {
                    alertController.v(z, this.A, this.B, this.C, this.D);
                }
                else {
                    alertController.u(z);
                }
            }
            else {
                final int y = this.y;
                if (y != 0) {
                    alertController.t(y);
                }
            }
        }
        
        public interface e
        {
            void a(final ListView p0);
        }
    }
    
    private static final class g extends Handler
    {
        private static final int b = 1;
        private WeakReference<DialogInterface> a;
        
        public g(final DialogInterface referent) {
            this.a = new WeakReference<DialogInterface>(referent);
        }
        
        public void handleMessage(final Message message) {
            final int what = message.what;
            if (what != -3 && what != -2 && what != -1) {
                if (what == 1) {
                    ((DialogInterface)message.obj).dismiss();
                }
            }
            else {
                ((DialogInterface$OnClickListener)message.obj).onClick((DialogInterface)this.a.get(), message.what);
            }
        }
    }
    
    private static class h extends ArrayAdapter<CharSequence>
    {
        public h(final Context context, final int n, final int n2, final CharSequence[] array) {
            super(context, n, n2, (Object[])array);
        }
        
        public long getItemId(final int n) {
            return n;
        }
        
        public boolean hasStableIds() {
            return true;
        }
    }
}
