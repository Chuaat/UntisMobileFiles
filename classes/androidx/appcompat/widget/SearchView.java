// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.os.Parcel;
import android.os.Parcelable$ClassLoaderCreator;
import android.os.Parcelable$Creator;
import android.annotation.SuppressLint;
import java.lang.reflect.Method;
import android.view.KeyEvent$DispatcherState;
import android.util.TypedValue;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.content.res.Configuration;
import androidx.annotation.t0;
import android.view.View$MeasureSpec;
import android.view.TouchDelegate;
import android.content.ActivityNotFoundException;
import android.widget.AutoCompleteTextView;
import android.widget.ListAdapter;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.text.SpannableStringBuilder;
import android.content.res.Resources;
import android.content.ComponentName;
import android.os.Parcelable;
import android.app.PendingIntent;
import android.util.Log;
import android.net.Uri;
import android.view.View$OnLayoutChangeListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.text.Editable;
import android.widget.AdapterView;
import android.widget.TextView;
import android.view.KeyEvent;
import android.database.Cursor;
import androidx.annotation.k0;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.content.Context;
import android.os.Build$VERSION;
import android.graphics.drawable.Drawable;
import android.graphics.Rect;
import android.widget.ImageView;
import android.view.View;
import android.text.TextWatcher;
import android.widget.AdapterView$OnItemSelectedListener;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.TextView$OnEditorActionListener;
import android.view.View$OnKeyListener;
import android.graphics.drawable.Drawable$ConstantState;
import java.util.WeakHashMap;
import android.os.Bundle;
import android.app.SearchableInfo;
import androidx.cursoradapter.widget.a;
import android.view.View$OnClickListener;
import android.view.View$OnFocusChangeListener;
import android.content.Intent;
import androidx.appcompat.view.c;

public class SearchView extends LinearLayoutCompat implements c
{
    static final boolean i1 = false;
    static final String j1 = "SearchView";
    private static final String k1 = "nm";
    static final n l1;
    private final int A0;
    private final int B0;
    private final Intent C0;
    private final Intent D0;
    private final CharSequence E0;
    private l F0;
    private k G0;
    View$OnFocusChangeListener H0;
    private m I0;
    private View$OnClickListener J0;
    private boolean K0;
    private boolean L0;
    androidx.cursoradapter.widget.a M0;
    private boolean N0;
    private CharSequence O0;
    private boolean P0;
    private boolean Q0;
    private int R0;
    private boolean S0;
    private CharSequence T0;
    private CharSequence U0;
    private boolean V0;
    private int W0;
    SearchableInfo X0;
    private Bundle Y0;
    private final Runnable Z0;
    private Runnable a1;
    private final WeakHashMap<String, Drawable$ConstantState> b1;
    private final View$OnClickListener c1;
    View$OnKeyListener d1;
    private final TextView$OnEditorActionListener e1;
    private final AdapterView$OnItemClickListener f1;
    private final AdapterView$OnItemSelectedListener g1;
    private TextWatcher h1;
    final SearchAutoComplete k0;
    private final View l0;
    private final View m0;
    private final View n0;
    final ImageView o0;
    final ImageView p0;
    final ImageView q0;
    final ImageView r0;
    private final View s0;
    private p t0;
    private Rect u0;
    private Rect v0;
    private int[] w0;
    private int[] x0;
    private final ImageView y0;
    private final Drawable z0;
    
    static {
        n l2;
        if (Build$VERSION.SDK_INT < 29) {
            l2 = new n();
        }
        else {
            l2 = null;
        }
        l1 = l2;
    }
    
    public SearchView(@j0 final Context context) {
        this(context, null);
    }
    
    public SearchView(@j0 final Context context, @k0 final AttributeSet set) {
        this(context, set, c.a.c.U2);
    }
    
    public SearchView(@j0 final Context context, @k0 final AttributeSet set, int inputType) {
        super(context, set, inputType);
        this.u0 = new Rect();
        this.v0 = new Rect();
        this.w0 = new int[2];
        this.x0 = new int[2];
        this.Z0 = new Runnable() {
            @Override
            public void run() {
                SearchView.this.m0();
            }
        };
        this.a1 = new Runnable() {
            @Override
            public void run() {
                final androidx.cursoradapter.widget.a m0 = SearchView.this.M0;
                if (m0 instanceof o0) {
                    m0.b(null);
                }
            }
        };
        this.b1 = new WeakHashMap<String, Drawable$ConstantState>();
        final View$OnClickListener view$OnClickListener = (View$OnClickListener)new View$OnClickListener() {
            public void onClick(final View view) {
                final SearchView g = SearchView.this;
                if (view == g.o0) {
                    g.c0();
                }
                else if (view == g.q0) {
                    g.Y();
                }
                else if (view == g.p0) {
                    g.d0();
                }
                else if (view == g.r0) {
                    g.h0();
                }
                else if (view == g.k0) {
                    g.L();
                }
            }
        };
        this.c1 = (View$OnClickListener)view$OnClickListener;
        this.d1 = (View$OnKeyListener)new View$OnKeyListener() {
            public boolean onKey(final View view, final int n, final KeyEvent keyEvent) {
                final SearchView g = SearchView.this;
                if (g.X0 == null) {
                    return false;
                }
                if (g.k0.isPopupShowing() && SearchView.this.k0.getListSelection() != -1) {
                    return SearchView.this.e0(view, n, keyEvent);
                }
                if (!SearchView.this.k0.b() && keyEvent.hasNoModifiers() && keyEvent.getAction() == 1 && n == 66) {
                    view.cancelLongPress();
                    final SearchView g2 = SearchView.this;
                    g2.W(0, null, g2.k0.getText().toString());
                    return true;
                }
                return false;
            }
        };
        final TextView$OnEditorActionListener textView$OnEditorActionListener = (TextView$OnEditorActionListener)new TextView$OnEditorActionListener() {
            public boolean onEditorAction(final TextView textView, final int n, final KeyEvent keyEvent) {
                SearchView.this.d0();
                return true;
            }
        };
        this.e1 = (TextView$OnEditorActionListener)textView$OnEditorActionListener;
        final AdapterView$OnItemClickListener adapterView$OnItemClickListener = (AdapterView$OnItemClickListener)new AdapterView$OnItemClickListener() {
            public void onItemClick(final AdapterView<?> adapterView, final View view, final int n, final long n2) {
                SearchView.this.Z(n, 0, null);
            }
        };
        this.f1 = (AdapterView$OnItemClickListener)adapterView$OnItemClickListener;
        final AdapterView$OnItemSelectedListener adapterView$OnItemSelectedListener = (AdapterView$OnItemSelectedListener)new AdapterView$OnItemSelectedListener() {
            public void onItemSelected(final AdapterView<?> adapterView, final View view, final int n, final long n2) {
                SearchView.this.a0(n);
            }
            
            public void onNothingSelected(final AdapterView<?> adapterView) {
            }
        };
        this.g1 = (AdapterView$OnItemSelectedListener)adapterView$OnItemSelectedListener;
        this.h1 = (TextWatcher)new TextWatcher() {
            public void afterTextChanged(final Editable editable) {
            }
            
            public void beforeTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
            }
            
            public void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
                SearchView.this.f0(charSequence);
            }
        };
        final u0 g = androidx.appcompat.widget.u0.G(context, set, c.a.n.d6, inputType, 0);
        LayoutInflater.from(context).inflate(g.u(c.a.n.n6, c.a.k.z), (ViewGroup)this, true);
        final SearchAutoComplete k0 = (SearchAutoComplete)this.findViewById(c.a.h.g1);
        (this.k0 = k0).setSearchView(this);
        this.l0 = this.findViewById(c.a.h.c1);
        final View viewById = this.findViewById(c.a.h.f1);
        this.m0 = viewById;
        final View viewById2 = this.findViewById(c.a.h.r1);
        this.n0 = viewById2;
        final ImageView o0 = (ImageView)this.findViewById(c.a.h.a1);
        this.o0 = o0;
        final ImageView p3 = (ImageView)this.findViewById(c.a.h.d1);
        this.p0 = p3;
        final ImageView q0 = (ImageView)this.findViewById(c.a.h.b1);
        this.q0 = q0;
        final ImageView r0 = (ImageView)this.findViewById(c.a.h.h1);
        this.r0 = r0;
        final ImageView y0 = (ImageView)this.findViewById(c.a.h.e1);
        this.y0 = y0;
        androidx.core.view.j0.G1(viewById, g.h(c.a.n.o6));
        androidx.core.view.j0.G1(viewById2, g.h(c.a.n.s6));
        inputType = c.a.n.r6;
        o0.setImageDrawable(g.h(inputType));
        p3.setImageDrawable(g.h(c.a.n.l6));
        q0.setImageDrawable(g.h(c.a.n.i6));
        r0.setImageDrawable(g.h(c.a.n.u6));
        y0.setImageDrawable(g.h(inputType));
        this.z0 = g.h(c.a.n.q6);
        androidx.appcompat.widget.w0.a((View)o0, this.getResources().getString(c.a.l.v));
        this.A0 = g.u(c.a.n.t6, c.a.k.y);
        this.B0 = g.u(c.a.n.j6, 0);
        o0.setOnClickListener((View$OnClickListener)view$OnClickListener);
        q0.setOnClickListener((View$OnClickListener)view$OnClickListener);
        p3.setOnClickListener((View$OnClickListener)view$OnClickListener);
        r0.setOnClickListener((View$OnClickListener)view$OnClickListener);
        k0.setOnClickListener((View$OnClickListener)view$OnClickListener);
        k0.addTextChangedListener(this.h1);
        k0.setOnEditorActionListener((TextView$OnEditorActionListener)textView$OnEditorActionListener);
        k0.setOnItemClickListener((AdapterView$OnItemClickListener)adapterView$OnItemClickListener);
        k0.setOnItemSelectedListener((AdapterView$OnItemSelectedListener)adapterView$OnItemSelectedListener);
        k0.setOnKeyListener(this.d1);
        k0.setOnFocusChangeListener((View$OnFocusChangeListener)new View$OnFocusChangeListener() {
            public void onFocusChange(final View view, final boolean b) {
                final SearchView g = SearchView.this;
                final View$OnFocusChangeListener h0 = g.H0;
                if (h0 != null) {
                    h0.onFocusChange((View)g, b);
                }
            }
        });
        this.setIconifiedByDefault(g.a(c.a.n.m6, true));
        inputType = g.g(c.a.n.f6, -1);
        if (inputType != -1) {
            this.setMaxWidth(inputType);
        }
        this.E0 = g.x(c.a.n.k6);
        this.O0 = g.x(c.a.n.p6);
        inputType = g.o(c.a.n.h6, -1);
        if (inputType != -1) {
            this.setImeOptions(inputType);
        }
        inputType = g.o(c.a.n.g6, -1);
        if (inputType != -1) {
            this.setInputType(inputType);
        }
        this.setFocusable(g.a(c.a.n.e6, true));
        g.I();
        final Intent c0 = new Intent("android.speech.action.WEB_SEARCH");
        (this.C0 = c0).addFlags(268435456);
        c0.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        (this.D0 = new Intent("android.speech.action.RECOGNIZE_SPEECH")).addFlags(268435456);
        final View viewById3 = this.findViewById(k0.getDropDownAnchor());
        if ((this.s0 = viewById3) != null) {
            viewById3.addOnLayoutChangeListener((View$OnLayoutChangeListener)new View$OnLayoutChangeListener() {
                public void onLayoutChange(final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
                    SearchView.this.F();
                }
            });
        }
        this.r0(this.K0);
        this.n0();
    }
    
    private Intent G(final String s, final Uri data, final String s2, final String s3, final int n, final String s4) {
        final Intent intent = new Intent(s);
        intent.addFlags(268435456);
        if (data != null) {
            intent.setData(data);
        }
        intent.putExtra("user_query", this.U0);
        if (s3 != null) {
            intent.putExtra("query", s3);
        }
        if (s2 != null) {
            intent.putExtra("intent_extra_data_key", s2);
        }
        final Bundle y0 = this.Y0;
        if (y0 != null) {
            intent.putExtra("app_data", y0);
        }
        if (n != 0) {
            intent.putExtra("action_key", n);
            intent.putExtra("action_msg", s4);
        }
        intent.setComponent(this.X0.getSearchActivity());
        return intent;
    }
    
    private Intent H(final Cursor cursor, int position, final String ex) {
        try {
            String s;
            if ((s = androidx.appcompat.widget.o0.u(cursor, "suggest_intent_action")) == null) {
                s = this.X0.getSuggestIntentAction();
            }
            String s2;
            if ((s2 = s) == null) {
                s2 = "android.intent.action.SEARCH";
            }
            String str;
            if ((str = androidx.appcompat.widget.o0.u(cursor, "suggest_intent_data")) == null) {
                str = this.X0.getSuggestIntentData();
            }
            String string;
            if ((string = str) != null) {
                final String u = androidx.appcompat.widget.o0.u(cursor, "suggest_intent_data_id");
                string = str;
                if (u != null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append("/");
                    sb.append(Uri.encode(u));
                    string = sb.toString();
                }
            }
            Uri parse;
            if (string == null) {
                parse = null;
            }
            else {
                parse = Uri.parse(string);
            }
            return this.G(s2, parse, androidx.appcompat.widget.o0.u(cursor, "suggest_intent_extra_data"), androidx.appcompat.widget.o0.u(cursor, "suggest_intent_query"), position, (String)ex);
        }
        catch (RuntimeException ex) {
            try {
                position = cursor.getPosition();
            }
            catch (RuntimeException ex2) {
                position = -1;
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Search suggestions cursor at row ");
            sb2.append(position);
            sb2.append(" returned exception.");
            Log.w("SearchView", sb2.toString(), (Throwable)ex);
            return null;
        }
    }
    
    private Intent I(final Intent intent, final SearchableInfo searchableInfo) {
        final ComponentName searchActivity = searchableInfo.getSearchActivity();
        final Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        final PendingIntent activity = PendingIntent.getActivity(this.getContext(), 0, intent2, 1073741824);
        final Bundle bundle = new Bundle();
        final Bundle y0 = this.Y0;
        if (y0 != null) {
            bundle.putParcelable("app_data", (Parcelable)y0);
        }
        final Intent intent3 = new Intent(intent);
        int voiceMaxResults = 1;
        final Resources resources = this.getResources();
        String string;
        if (searchableInfo.getVoiceLanguageModeId() != 0) {
            string = resources.getString(searchableInfo.getVoiceLanguageModeId());
        }
        else {
            string = "free_form";
        }
        final int voicePromptTextId = searchableInfo.getVoicePromptTextId();
        final String s = null;
        String string2;
        if (voicePromptTextId != 0) {
            string2 = resources.getString(searchableInfo.getVoicePromptTextId());
        }
        else {
            string2 = null;
        }
        String string3;
        if (searchableInfo.getVoiceLanguageId() != 0) {
            string3 = resources.getString(searchableInfo.getVoiceLanguageId());
        }
        else {
            string3 = null;
        }
        if (searchableInfo.getVoiceMaxResults() != 0) {
            voiceMaxResults = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        String flattenToShortString;
        if (searchActivity == null) {
            flattenToShortString = s;
        }
        else {
            flattenToShortString = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", flattenToShortString);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", (Parcelable)activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }
    
    private Intent J(final Intent intent, final SearchableInfo searchableInfo) {
        final Intent intent2 = new Intent(intent);
        final ComponentName searchActivity = searchableInfo.getSearchActivity();
        String flattenToShortString;
        if (searchActivity == null) {
            flattenToShortString = null;
        }
        else {
            flattenToShortString = searchActivity.flattenToShortString();
        }
        intent2.putExtra("calling_package", flattenToShortString);
        return intent2;
    }
    
    private void K() {
        this.k0.dismissDropDown();
    }
    
    private void M(final View view, final Rect rect) {
        view.getLocationInWindow(this.w0);
        this.getLocationInWindow(this.x0);
        final int[] w0 = this.w0;
        final int n = w0[1];
        final int[] x0 = this.x0;
        final int n2 = n - x0[1];
        final int n3 = w0[0] - x0[0];
        rect.set(n3, n2, view.getWidth() + n3, view.getHeight() + n2);
    }
    
    private CharSequence N(final CharSequence charSequence) {
        if (this.K0 && this.z0 != null) {
            final int n = (int)(this.k0.getTextSize() * 1.25);
            this.z0.setBounds(0, 0, n, n);
            final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)"   ");
            spannableStringBuilder.setSpan((Object)new ImageSpan(this.z0), 1, 2, 33);
            spannableStringBuilder.append(charSequence);
            return (CharSequence)spannableStringBuilder;
        }
        return charSequence;
    }
    
    private boolean O() {
        final SearchableInfo x0 = this.X0;
        boolean b2;
        final boolean b = b2 = false;
        if (x0 != null) {
            b2 = b;
            if (x0.getVoiceSearchEnabled()) {
                Intent intent = null;
                if (this.X0.getVoiceSearchLaunchWebSearch()) {
                    intent = this.C0;
                }
                else if (this.X0.getVoiceSearchLaunchRecognizer()) {
                    intent = this.D0;
                }
                b2 = b;
                if (intent != null) {
                    b2 = b;
                    if (this.getContext().getPackageManager().resolveActivity(intent, 65536) != null) {
                        b2 = true;
                    }
                }
            }
        }
        return b2;
    }
    
    static boolean R(final Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }
    
    private boolean T() {
        return (this.N0 || this.S0) && !this.Q();
    }
    
    private void V(final Intent obj) {
        if (obj == null) {
            return;
        }
        try {
            this.getContext().startActivity(obj);
        }
        catch (RuntimeException ex) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Failed launch activity: ");
            sb.append(obj);
            Log.e("SearchView", sb.toString(), (Throwable)ex);
        }
    }
    
    private boolean X(final int n, final int n2, final String s) {
        final Cursor c = this.M0.c();
        if (c != null && c.moveToPosition(n)) {
            this.V(this.H(c, n2, s));
            return true;
        }
        return false;
    }
    
    private int getPreferredHeight() {
        return this.getContext().getResources().getDimensionPixelSize(c.a.f.c0);
    }
    
    private int getPreferredWidth() {
        return this.getContext().getResources().getDimensionPixelSize(c.a.f.d0);
    }
    
    private void i0() {
        this.post(this.Z0);
    }
    
    private void j0(final int n) {
        final Editable text = this.k0.getText();
        final Cursor c = this.M0.c();
        if (c == null) {
            return;
        }
        if (c.moveToPosition(n)) {
            final CharSequence a = this.M0.a(c);
            if (a != null) {
                this.setQuery(a);
                return;
            }
        }
        this.setQuery((CharSequence)text);
    }
    
    private void l0() {
        final boolean empty = TextUtils.isEmpty((CharSequence)this.k0.getText());
        final boolean b = true;
        final boolean b2 = empty ^ true;
        final int n = 0;
        int n2 = b ? 1 : 0;
        if (!b2) {
            if (this.K0 && !this.V0) {
                n2 = (b ? 1 : 0);
            }
            else {
                n2 = 0;
            }
        }
        final ImageView q0 = this.q0;
        int visibility;
        if (n2 != 0) {
            visibility = n;
        }
        else {
            visibility = 8;
        }
        q0.setVisibility(visibility);
        final Drawable drawable = this.q0.getDrawable();
        if (drawable != null) {
            int[] state;
            if (b2) {
                state = ViewGroup.ENABLED_STATE_SET;
            }
            else {
                state = ViewGroup.EMPTY_STATE_SET;
            }
            drawable.setState(state);
        }
    }
    
    private void n0() {
        final CharSequence queryHint = this.getQueryHint();
        final SearchAutoComplete k0 = this.k0;
        CharSequence charSequence = queryHint;
        if (queryHint == null) {
            charSequence = "";
        }
        k0.setHint(this.N(charSequence));
    }
    
    private void o0() {
        this.k0.setThreshold(this.X0.getSuggestThreshold());
        this.k0.setImeOptions(this.X0.getImeOptions());
        final int inputType = this.X0.getInputType();
        final int n = 1;
        int inputType2 = inputType;
        if ((inputType & 0xF) == 0x1) {
            inputType2 = (inputType & 0xFFFEFFFF);
            if (this.X0.getSuggestAuthority() != null) {
                inputType2 = (inputType2 | 0x10000 | 0x80000);
            }
        }
        this.k0.setInputType(inputType2);
        final androidx.cursoradapter.widget.a m0 = this.M0;
        if (m0 != null) {
            m0.b(null);
        }
        if (this.X0.getSuggestAuthority() != null) {
            final o0 o0 = new o0(this.getContext(), this, this.X0, this.b1);
            this.M0 = o0;
            this.k0.setAdapter((ListAdapter)o0);
            final o0 o2 = (o0)this.M0;
            int n2 = n;
            if (this.P0) {
                n2 = 2;
            }
            o2.E(n2);
        }
    }
    
    private void p0() {
        int visibility;
        if (this.T() && (this.p0.getVisibility() == 0 || this.r0.getVisibility() == 0)) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        this.n0.setVisibility(visibility);
    }
    
    private void q0(final boolean b) {
        int visibility;
        if (this.N0 && this.T() && this.hasFocus() && (b || !this.S0)) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        this.p0.setVisibility(visibility);
    }
    
    private void r0(final boolean l0) {
        this.L0 = l0;
        final int n = 0;
        int visibility;
        if (l0) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        final boolean b = TextUtils.isEmpty((CharSequence)this.k0.getText()) ^ true;
        this.o0.setVisibility(visibility);
        this.q0(b);
        final View l2 = this.l0;
        int visibility2;
        if (l0) {
            visibility2 = 8;
        }
        else {
            visibility2 = 0;
        }
        l2.setVisibility(visibility2);
        int visibility3 = 0;
        Label_0093: {
            if (this.y0.getDrawable() != null) {
                visibility3 = n;
                if (!this.K0) {
                    break Label_0093;
                }
            }
            visibility3 = 8;
        }
        this.y0.setVisibility(visibility3);
        this.l0();
        this.s0(b ^ true);
        this.p0();
    }
    
    private void s0(final boolean b) {
        final boolean s0 = this.S0;
        int visibility;
        final int n = visibility = 8;
        if (s0) {
            visibility = n;
            if (!this.Q()) {
                visibility = n;
                if (b) {
                    this.p0.setVisibility(8);
                    visibility = 0;
                }
            }
        }
        this.r0.setVisibility(visibility);
    }
    
    private void setQuery(final CharSequence text) {
        this.k0.setText(text);
        final SearchAutoComplete k0 = this.k0;
        int length;
        if (TextUtils.isEmpty(text)) {
            length = 0;
        }
        else {
            length = text.length();
        }
        k0.setSelection(length);
    }
    
    void F() {
        if (this.s0.getWidth() > 1) {
            final Resources resources = this.getContext().getResources();
            final int paddingLeft = this.m0.getPaddingLeft();
            final Rect rect = new Rect();
            final boolean b = androidx.appcompat.widget.a1.b((View)this);
            int n;
            if (this.K0) {
                n = resources.getDimensionPixelSize(c.a.f.P) + resources.getDimensionPixelSize(c.a.f.Q);
            }
            else {
                n = 0;
            }
            this.k0.getDropDownBackground().getPadding(rect);
            final int left = rect.left;
            int dropDownHorizontalOffset;
            if (b) {
                dropDownHorizontalOffset = -left;
            }
            else {
                dropDownHorizontalOffset = paddingLeft - (left + n);
            }
            this.k0.setDropDownHorizontalOffset(dropDownHorizontalOffset);
            this.k0.setDropDownWidth(this.s0.getWidth() + rect.left + rect.right + n - paddingLeft);
        }
    }
    
    void L() {
        if (Build$VERSION.SDK_INT >= 29) {
            this.k0.refreshAutoCompleteResults();
        }
        else {
            final n l1 = SearchView.l1;
            l1.b(this.k0);
            l1.a(this.k0);
        }
    }
    
    public boolean P() {
        return this.K0;
    }
    
    public boolean Q() {
        return this.L0;
    }
    
    public boolean S() {
        return this.P0;
    }
    
    public boolean U() {
        return this.N0;
    }
    
    void W(final int n, final String s, final String s2) {
        this.getContext().startActivity(this.G("android.intent.action.SEARCH", null, null, s2, n, s));
    }
    
    void Y() {
        if (TextUtils.isEmpty((CharSequence)this.k0.getText())) {
            if (this.K0) {
                final k g0 = this.G0;
                if (g0 == null || !g0.a()) {
                    this.clearFocus();
                    this.r0(true);
                }
            }
        }
        else {
            this.k0.setText((CharSequence)"");
            this.k0.requestFocus();
            this.k0.setImeVisibility(true);
        }
    }
    
    boolean Z(final int n, final int n2, final String s) {
        final m i0 = this.I0;
        if (i0 != null && i0.b(n)) {
            return false;
        }
        this.X(n, 0, null);
        this.k0.setImeVisibility(false);
        this.K();
        return true;
    }
    
    boolean a0(final int n) {
        final m i0 = this.I0;
        if (i0 != null && i0.a(n)) {
            return false;
        }
        this.j0(n);
        return true;
    }
    
    void b0(final CharSequence query) {
        this.setQuery(query);
    }
    
    @Override
    public void c() {
        if (this.V0) {
            return;
        }
        this.V0 = true;
        final int imeOptions = this.k0.getImeOptions();
        this.W0 = imeOptions;
        this.k0.setImeOptions(imeOptions | 0x2000000);
        this.k0.setText((CharSequence)"");
        this.setIconified(false);
    }
    
    void c0() {
        this.r0(false);
        this.k0.requestFocus();
        this.k0.setImeVisibility(true);
        final View$OnClickListener j0 = this.J0;
        if (j0 != null) {
            j0.onClick((View)this);
        }
    }
    
    public void clearFocus() {
        this.Q0 = true;
        super.clearFocus();
        this.k0.clearFocus();
        this.k0.setImeVisibility(false);
        this.Q0 = false;
    }
    
    void d0() {
        final Editable text = this.k0.getText();
        if (text != null && TextUtils.getTrimmedLength((CharSequence)text) > 0) {
            final l f0 = this.F0;
            if (f0 == null || !f0.onQueryTextSubmit(((CharSequence)text).toString())) {
                if (this.X0 != null) {
                    this.W(0, null, ((CharSequence)text).toString());
                }
                this.k0.setImeVisibility(false);
                this.K();
            }
        }
    }
    
    boolean e0(final View view, int length, final KeyEvent keyEvent) {
        if (this.X0 == null) {
            return false;
        }
        if (this.M0 == null) {
            return false;
        }
        if (keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (length == 66 || length == 84 || length == 61) {
                return this.Z(this.k0.getListSelection(), 0, null);
            }
            if (length == 21 || length == 22) {
                if (length == 21) {
                    length = 0;
                }
                else {
                    length = this.k0.length();
                }
                this.k0.setSelection(length);
                this.k0.setListSelection(0);
                this.k0.clearListSelection();
                this.k0.a();
                return true;
            }
            if (length == 19) {
                this.k0.getListSelection();
                return false;
            }
        }
        return false;
    }
    
    void f0(final CharSequence charSequence) {
        final Editable text = this.k0.getText();
        this.U0 = (CharSequence)text;
        final boolean b = TextUtils.isEmpty((CharSequence)text) ^ true;
        this.q0(b);
        this.s0(b ^ true);
        this.l0();
        this.p0();
        if (this.F0 != null && !TextUtils.equals(charSequence, this.T0)) {
            this.F0.onQueryTextChange(charSequence.toString());
        }
        this.T0 = charSequence.toString();
    }
    
    void g0() {
        this.r0(this.Q());
        this.i0();
        if (this.k0.hasFocus()) {
            this.L();
        }
    }
    
    public int getImeOptions() {
        return this.k0.getImeOptions();
    }
    
    public int getInputType() {
        return this.k0.getInputType();
    }
    
    public int getMaxWidth() {
        return this.R0;
    }
    
    public CharSequence getQuery() {
        return (CharSequence)this.k0.getText();
    }
    
    @k0
    public CharSequence getQueryHint() {
        CharSequence charSequence = this.O0;
        if (charSequence == null) {
            final SearchableInfo x0 = this.X0;
            if (x0 != null && x0.getHintId() != 0) {
                charSequence = this.getContext().getText(this.X0.getHintId());
            }
            else {
                charSequence = this.E0;
            }
        }
        return charSequence;
    }
    
    int getSuggestionCommitIconResId() {
        return this.B0;
    }
    
    int getSuggestionRowLayout() {
        return this.A0;
    }
    
    public androidx.cursoradapter.widget.a getSuggestionsAdapter() {
        return this.M0;
    }
    
    @Override
    public void h() {
        this.k0("", false);
        this.clearFocus();
        this.r0(true);
        this.k0.setImeOptions(this.W0);
        this.V0 = false;
    }
    
    void h0() {
        final SearchableInfo x0 = this.X0;
        if (x0 == null) {
            return;
        }
        try {
            Intent intent;
            if (x0.getVoiceSearchLaunchWebSearch()) {
                intent = this.J(this.C0, x0);
            }
            else {
                if (!x0.getVoiceSearchLaunchRecognizer()) {
                    return;
                }
                intent = this.I(this.D0, x0);
            }
            this.getContext().startActivity(intent);
        }
        catch (ActivityNotFoundException ex) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }
    
    public void k0(final CharSequence charSequence, final boolean b) {
        this.k0.setText(charSequence);
        if (charSequence != null) {
            final SearchAutoComplete k0 = this.k0;
            k0.setSelection(k0.length());
            this.U0 = charSequence;
        }
        if (b && !TextUtils.isEmpty(charSequence)) {
            this.d0();
        }
    }
    
    void m0() {
        int[] array;
        if (this.k0.hasFocus()) {
            array = ViewGroup.FOCUSED_STATE_SET;
        }
        else {
            array = ViewGroup.EMPTY_STATE_SET;
        }
        final Drawable background = this.m0.getBackground();
        if (background != null) {
            background.setState(array);
        }
        final Drawable background2 = this.n0.getBackground();
        if (background2 != null) {
            background2.setState(array);
        }
        this.invalidate();
    }
    
    protected void onDetachedFromWindow() {
        this.removeCallbacks(this.Z0);
        this.post(this.a1);
        super.onDetachedFromWindow();
    }
    
    @Override
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        if (b) {
            this.M((View)this.k0, this.u0);
            final Rect v0 = this.v0;
            final Rect u0 = this.u0;
            v0.set(u0.left, 0, u0.right, n4 - n2);
            final p t0 = this.t0;
            if (t0 == null) {
                this.setTouchDelegate((TouchDelegate)(this.t0 = new p(this.v0, this.u0, (View)this.k0)));
            }
            else {
                t0.a(this.v0, this.u0);
            }
        }
    }
    
    @Override
    protected void onMeasure(int a, int b) {
        if (this.Q()) {
            super.onMeasure(a, b);
            return;
        }
        final int mode = View$MeasureSpec.getMode(a);
        final int size = View$MeasureSpec.getSize(a);
        Label_0110: {
            if (mode != Integer.MIN_VALUE) {
                if (mode != 0) {
                    if (mode != 1073741824) {
                        a = size;
                        break Label_0110;
                    }
                    final int r0 = this.R0;
                    a = size;
                    if (r0 <= 0) {
                        break Label_0110;
                    }
                    a = r0;
                }
                else {
                    a = this.R0;
                    if (a > 0) {
                        break Label_0110;
                    }
                    a = this.getPreferredWidth();
                    break Label_0110;
                }
            }
            else {
                a = this.R0;
                if (a <= 0) {
                    a = this.getPreferredWidth();
                }
            }
            a = Math.min(a, size);
        }
        final int mode2 = View$MeasureSpec.getMode(b);
        b = View$MeasureSpec.getSize(b);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                b = this.getPreferredHeight();
            }
        }
        else {
            b = Math.min(this.getPreferredHeight(), b);
        }
        super.onMeasure(View$MeasureSpec.makeMeasureSpec(a, 1073741824), View$MeasureSpec.makeMeasureSpec(b, 1073741824));
    }
    
    protected void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final o o = (o)parcelable;
        super.onRestoreInstanceState(o.a());
        this.r0(o.I);
        this.requestLayout();
    }
    
    protected Parcelable onSaveInstanceState() {
        final o o = new o(super.onSaveInstanceState());
        o.I = this.Q();
        return (Parcelable)o;
    }
    
    public void onWindowFocusChanged(final boolean b) {
        super.onWindowFocusChanged(b);
        this.i0();
    }
    
    public boolean requestFocus(final int n, final Rect rect) {
        if (this.Q0) {
            return false;
        }
        if (!this.isFocusable()) {
            return false;
        }
        if (!this.Q()) {
            final boolean requestFocus = this.k0.requestFocus(n, rect);
            if (requestFocus) {
                this.r0(false);
            }
            return requestFocus;
        }
        return super.requestFocus(n, rect);
    }
    
    @t0({ androidx.annotation.t0.a.I })
    public void setAppSearchData(final Bundle y0) {
        this.Y0 = y0;
    }
    
    public void setIconified(final boolean b) {
        if (b) {
            this.Y();
        }
        else {
            this.c0();
        }
    }
    
    public void setIconifiedByDefault(final boolean k0) {
        if (this.K0 == k0) {
            return;
        }
        this.r0(this.K0 = k0);
        this.n0();
    }
    
    public void setImeOptions(final int imeOptions) {
        this.k0.setImeOptions(imeOptions);
    }
    
    public void setInputType(final int inputType) {
        this.k0.setInputType(inputType);
    }
    
    public void setMaxWidth(final int r0) {
        this.R0 = r0;
        this.requestLayout();
    }
    
    public void setOnCloseListener(final k g0) {
        this.G0 = g0;
    }
    
    public void setOnQueryTextFocusChangeListener(final View$OnFocusChangeListener h0) {
        this.H0 = h0;
    }
    
    public void setOnQueryTextListener(final l f0) {
        this.F0 = f0;
    }
    
    public void setOnSearchClickListener(final View$OnClickListener j0) {
        this.J0 = j0;
    }
    
    public void setOnSuggestionListener(final m i0) {
        this.I0 = i0;
    }
    
    public void setQueryHint(@k0 final CharSequence o0) {
        this.O0 = o0;
        this.n0();
    }
    
    public void setQueryRefinementEnabled(final boolean p) {
        this.P0 = p;
        final androidx.cursoradapter.widget.a m0 = this.M0;
        if (m0 instanceof o0) {
            final o0 o0 = (o0)m0;
            int n;
            if (p) {
                n = 2;
            }
            else {
                n = 1;
            }
            o0.E(n);
        }
    }
    
    public void setSearchableInfo(final SearchableInfo x0) {
        this.X0 = x0;
        if (x0 != null) {
            this.o0();
            this.n0();
        }
        final boolean o = this.O();
        this.S0 = o;
        if (o) {
            this.k0.setPrivateImeOptions("nm");
        }
        this.r0(this.Q());
    }
    
    public void setSubmitButtonEnabled(final boolean n0) {
        this.N0 = n0;
        this.r0(this.Q());
    }
    
    public void setSuggestionsAdapter(final androidx.cursoradapter.widget.a a) {
        this.M0 = a;
        this.k0.setAdapter((ListAdapter)a);
    }
    
    @t0({ t0.a.I })
    public static class SearchAutoComplete extends e
    {
        private int J;
        private SearchView K;
        private boolean L;
        final Runnable M;
        
        public SearchAutoComplete(final Context context) {
            this(context, null);
        }
        
        public SearchAutoComplete(final Context context, final AttributeSet set) {
            this(context, set, c.a.c.T);
        }
        
        public SearchAutoComplete(final Context context, final AttributeSet set, final int n) {
            super(context, set, n);
            this.M = new Runnable() {
                @Override
                public void run() {
                    SearchAutoComplete.this.c();
                }
            };
            this.J = this.getThreshold();
        }
        
        private int getSearchViewTextMinWidthDp() {
            final Configuration configuration = this.getResources().getConfiguration();
            final int screenWidthDp = configuration.screenWidthDp;
            final int screenHeightDp = configuration.screenHeightDp;
            if (screenWidthDp >= 960 && screenHeightDp >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (screenWidthDp < 600 && (screenWidthDp < 640 || screenHeightDp < 480)) {
                return 160;
            }
            return 192;
        }
        
        void a() {
            if (Build$VERSION.SDK_INT >= 29) {
                this.setInputMethodMode(1);
                if (this.enoughToFilter()) {
                    this.showDropDown();
                }
            }
            else {
                SearchView.l1.c(this);
            }
        }
        
        boolean b() {
            return TextUtils.getTrimmedLength((CharSequence)this.getText()) == 0;
        }
        
        void c() {
            if (this.L) {
                ((InputMethodManager)this.getContext().getSystemService("input_method")).showSoftInput((View)this, 0);
                this.L = false;
            }
        }
        
        public boolean enoughToFilter() {
            return this.J <= 0 || super.enoughToFilter();
        }
        
        @Override
        public InputConnection onCreateInputConnection(final EditorInfo editorInfo) {
            final InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.L) {
                this.removeCallbacks(this.M);
                this.post(this.M);
            }
            return onCreateInputConnection;
        }
        
        protected void onFinishInflate() {
            super.onFinishInflate();
            this.setMinWidth((int)TypedValue.applyDimension(1, (float)this.getSearchViewTextMinWidthDp(), this.getResources().getDisplayMetrics()));
        }
        
        protected void onFocusChanged(final boolean b, final int n, final Rect rect) {
            super.onFocusChanged(b, n, rect);
            this.K.g0();
        }
        
        public boolean onKeyPreIme(final int n, final KeyEvent keyEvent) {
            if (n == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    final KeyEvent$DispatcherState keyDispatcherState = this.getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, (Object)this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    final KeyEvent$DispatcherState keyDispatcherState2 = this.getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.K.clearFocus();
                        this.setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(n, keyEvent);
        }
        
        public void onWindowFocusChanged(final boolean b) {
            super.onWindowFocusChanged(b);
            if (b && this.K.hasFocus() && this.getVisibility() == 0) {
                this.L = true;
                if (SearchView.R(this.getContext())) {
                    this.a();
                }
            }
        }
        
        public void performCompletion() {
        }
        
        protected void replaceText(final CharSequence charSequence) {
        }
        
        void setImeVisibility(final boolean b) {
            final InputMethodManager inputMethodManager = (InputMethodManager)this.getContext().getSystemService("input_method");
            if (!b) {
                this.L = false;
                this.removeCallbacks(this.M);
                inputMethodManager.hideSoftInputFromWindow(this.getWindowToken(), 0);
                return;
            }
            if (inputMethodManager.isActive((View)this)) {
                this.L = false;
                this.removeCallbacks(this.M);
                inputMethodManager.showSoftInput((View)this, 0);
                return;
            }
            this.L = true;
        }
        
        void setSearchView(final SearchView k) {
            this.K = k;
        }
        
        public void setThreshold(final int n) {
            super.setThreshold(n);
            this.J = n;
        }
    }
    
    public interface k
    {
        boolean a();
    }
    
    public interface l
    {
        boolean onQueryTextChange(final String p0);
        
        boolean onQueryTextSubmit(final String p0);
    }
    
    public interface m
    {
        boolean a(final int p0);
        
        boolean b(final int p0);
    }
    
    private static class n
    {
        private Method a;
        private Method b;
        private Method c;
        
        @SuppressLint({ "DiscouragedPrivateApi", "SoonBlockedPrivateApi" })
        n() {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     4: aload_0        
            //     5: aconst_null    
            //     6: putfield        androidx/appcompat/widget/SearchView$n.a:Ljava/lang/reflect/Method;
            //     9: aload_0        
            //    10: aconst_null    
            //    11: putfield        androidx/appcompat/widget/SearchView$n.b:Ljava/lang/reflect/Method;
            //    14: aload_0        
            //    15: aconst_null    
            //    16: putfield        androidx/appcompat/widget/SearchView$n.c:Ljava/lang/reflect/Method;
            //    19: invokestatic    androidx/appcompat/widget/SearchView$n.d:()V
            //    22: ldc             Landroid/widget/AutoCompleteTextView;.class
            //    24: ldc             "doBeforeTextChanged"
            //    26: iconst_0       
            //    27: anewarray       Ljava/lang/Class;
            //    30: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
            //    33: astore_1       
            //    34: aload_0        
            //    35: aload_1        
            //    36: putfield        androidx/appcompat/widget/SearchView$n.a:Ljava/lang/reflect/Method;
            //    39: aload_1        
            //    40: iconst_1       
            //    41: invokevirtual   java/lang/reflect/Method.setAccessible:(Z)V
            //    44: ldc             Landroid/widget/AutoCompleteTextView;.class
            //    46: ldc             "doAfterTextChanged"
            //    48: iconst_0       
            //    49: anewarray       Ljava/lang/Class;
            //    52: invokevirtual   java/lang/Class.getDeclaredMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
            //    55: astore_1       
            //    56: aload_0        
            //    57: aload_1        
            //    58: putfield        androidx/appcompat/widget/SearchView$n.b:Ljava/lang/reflect/Method;
            //    61: aload_1        
            //    62: iconst_1       
            //    63: invokevirtual   java/lang/reflect/Method.setAccessible:(Z)V
            //    66: ldc             Landroid/widget/AutoCompleteTextView;.class
            //    68: ldc             "ensureImeVisible"
            //    70: iconst_1       
            //    71: anewarray       Ljava/lang/Class;
            //    74: dup            
            //    75: iconst_0       
            //    76: getstatic       java/lang/Boolean.TYPE:Ljava/lang/Class;
            //    79: aastore        
            //    80: invokevirtual   java/lang/Class.getMethod:(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
            //    83: astore_1       
            //    84: aload_0        
            //    85: aload_1        
            //    86: putfield        androidx/appcompat/widget/SearchView$n.c:Ljava/lang/reflect/Method;
            //    89: aload_1        
            //    90: iconst_1       
            //    91: invokevirtual   java/lang/reflect/Method.setAccessible:(Z)V
            //    94: return         
            //    95: astore_1       
            //    96: goto            44
            //    99: astore_1       
            //   100: goto            66
            //   103: astore_1       
            //   104: goto            94
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                             
            //  -----  -----  -----  -----  ---------------------------------
            //  22     44     95     99     Ljava/lang/NoSuchMethodException;
            //  44     66     99     103    Ljava/lang/NoSuchMethodException;
            //  66     94     103    107    Ljava/lang/NoSuchMethodException;
            // 
            // The error that occurred was:
            // 
            // java.lang.IndexOutOfBoundsException: Index 59 out of bounds for length 59
            //     at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            //     at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            //     at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
            //     at java.base/java.util.Objects.checkIndex(Objects.java:372)
            //     at java.base/java.util.ArrayList.get(ArrayList.java:458)
            //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3321)
            //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:113)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:713)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:549)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:576)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
            //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
            //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
            //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
        
        private static void d() {
            if (Build$VERSION.SDK_INT < 29) {
                return;
            }
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
        
        void a(final AutoCompleteTextView obj) {
            d();
            final Method b = this.b;
            if (b == null) {
                return;
            }
            try {
                b.invoke(obj, new Object[0]);
            }
            catch (Exception ex) {}
        }
        
        void b(final AutoCompleteTextView obj) {
            d();
            final Method a = this.a;
            if (a == null) {
                return;
            }
            try {
                a.invoke(obj, new Object[0]);
            }
            catch (Exception ex) {}
        }
        
        void c(final AutoCompleteTextView obj) {
            d();
            final Method c = this.c;
            if (c == null) {
                return;
            }
            try {
                c.invoke(obj, Boolean.TRUE);
            }
            catch (Exception ex) {}
        }
    }
    
    static class o extends androidx.customview.view.a
    {
        public static final Parcelable$Creator<o> CREATOR;
        boolean I;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$ClassLoaderCreator<o>() {
                public o a(final Parcel parcel) {
                    return new o(parcel, null);
                }
                
                public o b(final Parcel parcel, final ClassLoader classLoader) {
                    return new o(parcel, classLoader);
                }
                
                public o[] c(final int n) {
                    return new o[n];
                }
            };
        }
        
        public o(final Parcel parcel, final ClassLoader classLoader) {
            super(parcel, classLoader);
            this.I = (boolean)parcel.readValue((ClassLoader)null);
        }
        
        o(final Parcelable parcelable) {
            super(parcelable);
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("SearchView.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" isIconified=");
            sb.append(this.I);
            sb.append("}");
            return sb.toString();
        }
        
        @Override
        public void writeToParcel(final Parcel parcel, final int n) {
            super.writeToParcel(parcel, n);
            parcel.writeValue((Object)this.I);
        }
    }
    
    private static class p extends TouchDelegate
    {
        private final View a;
        private final Rect b;
        private final Rect c;
        private final Rect d;
        private final int e;
        private boolean f;
        
        public p(final Rect rect, final Rect rect2, final View a) {
            super(rect, a);
            this.e = ViewConfiguration.get(a.getContext()).getScaledTouchSlop();
            this.b = new Rect();
            this.d = new Rect();
            this.c = new Rect();
            this.a(rect, rect2);
            this.a = a;
        }
        
        public void a(Rect d, final Rect rect) {
            this.b.set(d);
            this.d.set(d);
            d = this.d;
            final int e = this.e;
            d.inset(-e, -e);
            this.c.set(rect);
        }
        
        public boolean onTouchEvent(final MotionEvent motionEvent) {
            final int n = (int)motionEvent.getX();
            final int n2 = (int)motionEvent.getY();
            final int action = motionEvent.getAction();
            int f = 1;
            final boolean b = false;
            boolean b2 = false;
            Label_0137: {
                Label_0131: {
                    if (action != 0) {
                        if (action != 1 && action != 2) {
                            if (action != 3) {
                                break Label_0131;
                            }
                            f = (this.f ? 1 : 0);
                            this.f = false;
                        }
                        else {
                            final boolean f2 = this.f;
                            if ((f = (f2 ? 1 : 0)) != 0) {
                                f = (f2 ? 1 : 0);
                                if (!this.d.contains(n, n2)) {
                                    f = (f2 ? 1 : 0);
                                    b2 = false;
                                    break Label_0137;
                                }
                            }
                        }
                    }
                    else {
                        if (!this.b.contains(n, n2)) {
                            break Label_0131;
                        }
                        this.f = true;
                    }
                    b2 = true;
                    break Label_0137;
                }
                b2 = true;
                f = 0;
            }
            boolean dispatchTouchEvent = b;
            if (f != 0) {
                float n3;
                int n4;
                if (b2 && !this.c.contains(n, n2)) {
                    n3 = (float)(this.a.getWidth() / 2);
                    n4 = this.a.getHeight() / 2;
                }
                else {
                    final Rect c = this.c;
                    n3 = (float)(n - c.left);
                    n4 = n2 - c.top;
                }
                motionEvent.setLocation(n3, (float)n4);
                dispatchTouchEvent = this.a.dispatchTouchEvent(motionEvent);
            }
            return dispatchTouchEvent;
        }
    }
}
