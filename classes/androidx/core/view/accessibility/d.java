// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.view.accessibility;

import android.text.Spannable;
import androidx.annotation.b0;
import android.graphics.Region;
import java.util.Map;
import android.util.Log;
import java.util.Iterator;
import java.util.Collections;
import android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo;
import android.view.accessibility.AccessibilityNodeInfo$TouchDelegateInfo;
import android.view.accessibility.AccessibilityNodeInfo$CollectionInfo;
import android.text.SpannableString;
import android.text.TextUtils;
import android.graphics.Rect;
import android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction;
import androidx.annotation.k0;
import android.view.accessibility.AccessibilityNodeInfo$RangeInfo;
import java.util.List;
import android.text.Spanned;
import androidx.annotation.j0;
import android.os.Bundle;
import java.util.ArrayList;
import k.a;
import android.text.style.ClickableSpan;
import java.lang.ref.WeakReference;
import android.util.SparseArray;
import android.os.Build$VERSION;
import android.view.View;
import androidx.annotation.t0;
import android.view.accessibility.AccessibilityNodeInfo;
import android.annotation.SuppressLint;

public class d
{
    public static final int A = 256;
    public static final int B = 512;
    public static final int C = 1024;
    public static final int D = 2048;
    public static final int E = 4096;
    public static final int F = 8192;
    public static final int G = 16384;
    public static final int H = 32768;
    public static final int I = 65536;
    public static final int J = 131072;
    public static final int K = 262144;
    public static final int L = 524288;
    public static final int M = 1048576;
    public static final int N = 2097152;
    public static final String O = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT";
    public static final String P = "ACTION_ARGUMENT_HTML_ELEMENT_STRING";
    public static final String Q = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN";
    public static final String R = "ACTION_ARGUMENT_SELECTION_START_INT";
    public static final String S = "ACTION_ARGUMENT_SELECTION_END_INT";
    public static final String T = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE";
    public static final String U = "android.view.accessibility.action.ARGUMENT_ROW_INT";
    public static final String V = "android.view.accessibility.action.ARGUMENT_COLUMN_INT";
    public static final String W = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE";
    public static final String X = "ACTION_ARGUMENT_MOVE_WINDOW_X";
    public static final String Y = "ACTION_ARGUMENT_MOVE_WINDOW_Y";
    @SuppressLint({ "ActionValue" })
    public static final String Z = "android.view.accessibility.action.ARGUMENT_PRESS_AND_HOLD_DURATION_MILLIS_INT";
    public static final int a0 = 1;
    public static final int b0 = 2;
    public static final int c0 = 1;
    private static final String d = "AccessibilityNodeInfo.roleDescription";
    public static final int d0 = 2;
    private static final String e = "androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY";
    public static final int e0 = 4;
    private static final String f = "androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY";
    public static final int f0 = 8;
    private static final String g = "androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY";
    public static final int g0 = 16;
    private static final String h = "androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY";
    private static int h0 = 0;
    private static final String i = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY";
    private static final String j = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY";
    private static final String k = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY";
    private static final String l = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY";
    private static final String m = "androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY";
    private static final String n = "androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY";
    private static final int o = 1;
    private static final int p = 2;
    private static final int q = 4;
    private static final int r = 8;
    public static final int s = 1;
    public static final int t = 2;
    public static final int u = 4;
    public static final int v = 8;
    public static final int w = 16;
    public static final int x = 32;
    public static final int y = 64;
    public static final int z = 128;
    private final AccessibilityNodeInfo a;
    @t0({ t0.a.I })
    public int b;
    private int c;
    
    private d(final AccessibilityNodeInfo a) {
        this.b = -1;
        this.c = -1;
        this.a = a;
    }
    
    @Deprecated
    public d(final Object o) {
        this.b = -1;
        this.c = -1;
        this.a = (AccessibilityNodeInfo)o;
    }
    
    public static d B0() {
        return V1(AccessibilityNodeInfo.obtain());
    }
    
    public static d C0(final View view) {
        return V1(AccessibilityNodeInfo.obtain(view));
    }
    
    public static d D0(final View view, final int n) {
        if (Build$VERSION.SDK_INT >= 16) {
            return W1(AccessibilityNodeInfo.obtain(view, n));
        }
        return null;
    }
    
    public static d E0(final d d) {
        return V1(AccessibilityNodeInfo.obtain(d.a));
    }
    
    private SparseArray<WeakReference<ClickableSpan>> L(final View view) {
        SparseArray r;
        if ((r = this.R(view)) == null) {
            r = new SparseArray();
            view.setTag(k.a.e.e0, (Object)r);
        }
        return (SparseArray<WeakReference<ClickableSpan>>)r;
    }
    
    private void M0(final View view) {
        final SparseArray<WeakReference<ClickableSpan>> r = this.R(view);
        if (r != null) {
            final ArrayList<Integer> list = new ArrayList<Integer>();
            final int n = 0;
            int i = 0;
            int j;
            while (true) {
                j = n;
                if (i >= r.size()) {
                    break;
                }
                if (((WeakReference)r.valueAt(i)).get() == null) {
                    list.add(i);
                }
                ++i;
            }
            while (j < list.size()) {
                r.remove((int)list.get(j));
                ++j;
            }
        }
    }
    
    private void O0(final int n, final boolean b) {
        final Bundle c = this.C();
        if (c != null) {
            final int int1 = c.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0);
            int n2;
            if (b) {
                n2 = n;
            }
            else {
                n2 = 0;
            }
            c.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", n2 | (int1 & ~n));
        }
    }
    
    private SparseArray<WeakReference<ClickableSpan>> R(final View view) {
        return (SparseArray<WeakReference<ClickableSpan>>)view.getTag(k.a.e.e0);
    }
    
    public static d V1(@j0 final AccessibilityNodeInfo accessibilityNodeInfo) {
        return new d(accessibilityNodeInfo);
    }
    
    static d W1(final Object o) {
        if (o != null) {
            return new d(o);
        }
        return null;
    }
    
    private boolean d0() {
        return this.i("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty() ^ true;
    }
    
    private void e(final ClickableSpan clickableSpan, final Spanned spanned, final int i) {
        this.i("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(spanned.getSpanStart((Object)clickableSpan));
        this.i("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(spanned.getSpanEnd((Object)clickableSpan));
        this.i("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(spanned.getSpanFlags((Object)clickableSpan));
        this.i("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(i);
    }
    
    private int e0(final ClickableSpan clickableSpan, final SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); ++i) {
                if (clickableSpan.equals(((WeakReference)sparseArray.valueAt(i)).get())) {
                    return sparseArray.keyAt(i);
                }
            }
        }
        final int h0 = androidx.core.view.accessibility.d.h0;
        androidx.core.view.accessibility.d.h0 = h0 + 1;
        return h0;
    }
    
    private void h() {
        if (Build$VERSION.SDK_INT >= 19) {
            this.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            this.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            this.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            this.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        }
    }
    
    private List<Integer> i(final String s) {
        if (Build$VERSION.SDK_INT < 19) {
            return new ArrayList<Integer>();
        }
        ArrayList<Integer> integerArrayList;
        if ((integerArrayList = (ArrayList<Integer>)this.a.getExtras().getIntegerArrayList(s)) == null) {
            integerArrayList = new ArrayList<Integer>();
            this.a.getExtras().putIntegerArrayList(s, (ArrayList)integerArrayList);
        }
        return integerArrayList;
    }
    
    private static String o(final int n) {
        if (n == 1) {
            return "ACTION_FOCUS";
        }
        if (n == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (n) {
            default: {
                switch (n) {
                    default: {
                        switch (n) {
                            default: {
                                return "ACTION_UNKNOWN";
                            }
                            case 16908362: {
                                return "ACTION_PRESS_AND_HOLD";
                            }
                            case 16908361: {
                                return "ACTION_PAGE_RIGHT";
                            }
                            case 16908360: {
                                return "ACTION_PAGE_LEFT";
                            }
                            case 16908359: {
                                return "ACTION_PAGE_DOWN";
                            }
                            case 16908358: {
                                return "ACTION_PAGE_UP";
                            }
                            case 16908357: {
                                return "ACTION_HIDE_TOOLTIP";
                            }
                            case 16908356: {
                                return "ACTION_SHOW_TOOLTIP";
                            }
                        }
                        break;
                    }
                    case 16908349: {
                        return "ACTION_SET_PROGRESS";
                    }
                    case 16908348: {
                        return "ACTION_CONTEXT_CLICK";
                    }
                    case 16908347: {
                        return "ACTION_SCROLL_RIGHT";
                    }
                    case 16908346: {
                        return "ACTION_SCROLL_DOWN";
                    }
                    case 16908345: {
                        return "ACTION_SCROLL_LEFT";
                    }
                    case 16908344: {
                        return "ACTION_SCROLL_UP";
                    }
                    case 16908343: {
                        return "ACTION_SCROLL_TO_POSITION";
                    }
                    case 16908342: {
                        return "ACTION_SHOW_ON_SCREEN";
                    }
                }
                break;
            }
            case 16908372: {
                return "ACTION_IME_ENTER";
            }
            case 16908354: {
                return "ACTION_MOVE_WINDOW";
            }
            case 2097152: {
                return "ACTION_SET_TEXT";
            }
            case 524288: {
                return "ACTION_COLLAPSE";
            }
            case 262144: {
                return "ACTION_EXPAND";
            }
            case 131072: {
                return "ACTION_SET_SELECTION";
            }
            case 65536: {
                return "ACTION_CUT";
            }
            case 32768: {
                return "ACTION_PASTE";
            }
            case 16384: {
                return "ACTION_COPY";
            }
            case 8192: {
                return "ACTION_SCROLL_BACKWARD";
            }
            case 4096: {
                return "ACTION_SCROLL_FORWARD";
            }
            case 2048: {
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            }
            case 1024: {
                return "ACTION_NEXT_HTML_ELEMENT";
            }
            case 512: {
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            }
            case 256: {
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            }
            case 128: {
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            }
            case 64: {
                return "ACTION_ACCESSIBILITY_FOCUS";
            }
            case 32: {
                return "ACTION_LONG_CLICK";
            }
            case 16: {
                return "ACTION_CLICK";
            }
            case 8: {
                return "ACTION_CLEAR_SELECTION";
            }
            case 4: {
                return "ACTION_SELECT";
            }
        }
    }
    
    private boolean q(final int n) {
        final Bundle c = this.C();
        boolean b = false;
        if (c == null) {
            return false;
        }
        if ((c.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & n) == n) {
            b = true;
        }
        return b;
    }
    
    @t0({ t0.a.I })
    public static ClickableSpan[] w(final CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[])((Spanned)charSequence).getSpans(0, charSequence.length(), (Class)ClickableSpan.class);
        }
        return null;
    }
    
    public int A() {
        if (Build$VERSION.SDK_INT >= 24) {
            return this.a.getDrawingOrder();
        }
        return 0;
    }
    
    public boolean A0() {
        return Build$VERSION.SDK_INT >= 16 && this.a.isVisibleToUser();
    }
    
    public void A1(final d d) {
        if (Build$VERSION.SDK_INT >= 19) {
            this.a.setRangeInfo((AccessibilityNodeInfo$RangeInfo)d.a);
        }
    }
    
    public CharSequence B() {
        if (Build$VERSION.SDK_INT >= 21) {
            return this.a.getError();
        }
        return null;
    }
    
    public void B1(@k0 final CharSequence charSequence) {
        if (Build$VERSION.SDK_INT >= 19) {
            this.a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
        }
    }
    
    public Bundle C() {
        if (Build$VERSION.SDK_INT >= 19) {
            return this.a.getExtras();
        }
        return new Bundle();
    }
    
    public void C1(final boolean screenReaderFocusable) {
        if (Build$VERSION.SDK_INT >= 28) {
            this.a.setScreenReaderFocusable(screenReaderFocusable);
        }
        else {
            this.O0(1, screenReaderFocusable);
        }
    }
    
    @k0
    public CharSequence D() {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 26) {
            return this.a.getHintText();
        }
        if (sdk_INT >= 19) {
            return this.a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY");
        }
        return null;
    }
    
    public void D1(final boolean scrollable) {
        this.a.setScrollable(scrollable);
    }
    
    @Deprecated
    public Object E() {
        return this.a;
    }
    
    public void E1(final boolean selected) {
        this.a.setSelected(selected);
    }
    
    public int F() {
        if (Build$VERSION.SDK_INT >= 19) {
            return this.a.getInputType();
        }
        return 0;
    }
    
    public boolean F0(final int n) {
        return this.a.performAction(n);
    }
    
    public void F1(final boolean showingHintText) {
        if (Build$VERSION.SDK_INT >= 26) {
            this.a.setShowingHintText(showingHintText);
        }
        else {
            this.O0(4, showingHintText);
        }
    }
    
    public d G() {
        if (Build$VERSION.SDK_INT >= 17) {
            return W1(this.a.getLabelFor());
        }
        return null;
    }
    
    public boolean G0(final int n, final Bundle bundle) {
        return Build$VERSION.SDK_INT >= 16 && this.a.performAction(n, bundle);
    }
    
    public void G1(final View source) {
        this.c = -1;
        this.a.setSource(source);
    }
    
    public d H() {
        if (Build$VERSION.SDK_INT >= 17) {
            return W1(this.a.getLabeledBy());
        }
        return null;
    }
    
    public void H0() {
        this.a.recycle();
    }
    
    public void H1(final View view, final int c) {
        this.c = c;
        if (Build$VERSION.SDK_INT >= 16) {
            this.a.setSource(view, c);
        }
    }
    
    public int I() {
        if (Build$VERSION.SDK_INT >= 19) {
            return this.a.getLiveRegion();
        }
        return 0;
    }
    
    public boolean I0() {
        return Build$VERSION.SDK_INT >= 18 && this.a.refresh();
    }
    
    public void I1(@k0 final CharSequence stateDescription) {
        if (androidx.core.os.a.h()) {
            this.a.setStateDescription(stateDescription);
        }
        else if (Build$VERSION.SDK_INT >= 19) {
            this.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", stateDescription);
        }
    }
    
    public int J() {
        if (Build$VERSION.SDK_INT >= 21) {
            return this.a.getMaxTextLength();
        }
        return -1;
    }
    
    public boolean J0(final a a) {
        return Build$VERSION.SDK_INT >= 21 && this.a.removeAction((AccessibilityNodeInfo$AccessibilityAction)a.a);
    }
    
    public void J1(final CharSequence text) {
        this.a.setText(text);
    }
    
    public int K() {
        if (Build$VERSION.SDK_INT >= 16) {
            return this.a.getMovementGranularities();
        }
        return 0;
    }
    
    public boolean K0(final View view) {
        return Build$VERSION.SDK_INT >= 21 && this.a.removeChild(view);
    }
    
    public void K1(final boolean textEntryKey) {
        if (Build$VERSION.SDK_INT >= 29) {
            this.a.setTextEntryKey(textEntryKey);
        }
        else {
            this.O0(8, textEntryKey);
        }
    }
    
    public boolean L0(final View view, final int n) {
        return Build$VERSION.SDK_INT >= 21 && this.a.removeChild(view, n);
    }
    
    public void L1(final int n, final int n2) {
        if (Build$VERSION.SDK_INT >= 18) {
            this.a.setTextSelection(n, n2);
        }
    }
    
    public CharSequence M() {
        return this.a.getPackageName();
    }
    
    public void M1(@k0 final CharSequence tooltipText) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 28) {
            this.a.setTooltipText(tooltipText);
        }
        else if (sdk_INT >= 19) {
            this.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY", tooltipText);
        }
    }
    
    @k0
    public CharSequence N() {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 28) {
            return this.a.getPaneTitle();
        }
        if (sdk_INT >= 19) {
            return this.a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY");
        }
        return null;
    }
    
    public void N0(final boolean accessibilityFocused) {
        if (Build$VERSION.SDK_INT >= 16) {
            this.a.setAccessibilityFocused(accessibilityFocused);
        }
    }
    
    public void N1(@j0 final e e) {
        if (Build$VERSION.SDK_INT >= 29) {
            this.a.setTouchDelegateInfo(e.a);
        }
    }
    
    public d O() {
        return W1(this.a.getParent());
    }
    
    public void O1(final View traversalAfter) {
        if (Build$VERSION.SDK_INT >= 22) {
            this.a.setTraversalAfter(traversalAfter);
        }
    }
    
    public d P() {
        if (Build$VERSION.SDK_INT >= 19) {
            final AccessibilityNodeInfo$RangeInfo rangeInfo = this.a.getRangeInfo();
            if (rangeInfo != null) {
                return new d(rangeInfo);
            }
        }
        return null;
    }
    
    @Deprecated
    public void P0(final Rect boundsInParent) {
        this.a.setBoundsInParent(boundsInParent);
    }
    
    public void P1(final View view, final int n) {
        if (Build$VERSION.SDK_INT >= 22) {
            this.a.setTraversalAfter(view, n);
        }
    }
    
    @k0
    public CharSequence Q() {
        if (Build$VERSION.SDK_INT >= 19) {
            return this.a.getExtras().getCharSequence("AccessibilityNodeInfo.roleDescription");
        }
        return null;
    }
    
    public void Q0(final Rect boundsInScreen) {
        this.a.setBoundsInScreen(boundsInScreen);
    }
    
    public void Q1(final View traversalBefore) {
        if (Build$VERSION.SDK_INT >= 22) {
            this.a.setTraversalBefore(traversalBefore);
        }
    }
    
    public void R0(final boolean canOpenPopup) {
        if (Build$VERSION.SDK_INT >= 19) {
            this.a.setCanOpenPopup(canOpenPopup);
        }
    }
    
    public void R1(final View view, final int n) {
        if (Build$VERSION.SDK_INT >= 22) {
            this.a.setTraversalBefore(view, n);
        }
    }
    
    @k0
    public CharSequence S() {
        if (androidx.core.os.a.h()) {
            return this.a.getStateDescription();
        }
        if (Build$VERSION.SDK_INT >= 19) {
            return this.a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
        }
        return null;
    }
    
    public void S0(final boolean checkable) {
        this.a.setCheckable(checkable);
    }
    
    public void S1(final String viewIdResourceName) {
        if (Build$VERSION.SDK_INT >= 18) {
            this.a.setViewIdResourceName(viewIdResourceName);
        }
    }
    
    public CharSequence T() {
        if (this.d0()) {
            final List<Integer> i = this.i("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            final List<Integer> j = this.i("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            final List<Integer> k = this.i("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            final List<Integer> l = this.i("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            final CharSequence text = this.a.getText();
            final int length = this.a.getText().length();
            int n = 0;
            final SpannableString spannableString = new SpannableString((CharSequence)TextUtils.substring(text, 0, length));
            while (n < i.size()) {
                ((Spannable)spannableString).setSpan((Object)new androidx.core.view.accessibility.a(l.get(n), this, this.C().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), (int)i.get(n), (int)j.get(n), (int)k.get(n));
                ++n;
            }
            return (CharSequence)spannableString;
        }
        return this.a.getText();
    }
    
    public void T0(final boolean checked) {
        this.a.setChecked(checked);
    }
    
    public void T1(final boolean visibleToUser) {
        if (Build$VERSION.SDK_INT >= 16) {
            this.a.setVisibleToUser(visibleToUser);
        }
    }
    
    public int U() {
        if (Build$VERSION.SDK_INT >= 18) {
            return this.a.getTextSelectionEnd();
        }
        return -1;
    }
    
    public void U0(final CharSequence className) {
        this.a.setClassName(className);
    }
    
    public AccessibilityNodeInfo U1() {
        return this.a;
    }
    
    public int V() {
        if (Build$VERSION.SDK_INT >= 18) {
            return this.a.getTextSelectionStart();
        }
        return -1;
    }
    
    public void V0(final boolean clickable) {
        this.a.setClickable(clickable);
    }
    
    @k0
    public CharSequence W() {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 28) {
            return this.a.getTooltipText();
        }
        if (sdk_INT >= 19) {
            return this.a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
        }
        return null;
    }
    
    public void W0(final Object o) {
        if (Build$VERSION.SDK_INT >= 19) {
            final AccessibilityNodeInfo a = this.a;
            AccessibilityNodeInfo$CollectionInfo collectionInfo;
            if (o == null) {
                collectionInfo = null;
            }
            else {
                collectionInfo = (AccessibilityNodeInfo$CollectionInfo)((b)o).a;
            }
            a.setCollectionInfo(collectionInfo);
        }
    }
    
    @k0
    public e X() {
        if (Build$VERSION.SDK_INT >= 29) {
            final AccessibilityNodeInfo$TouchDelegateInfo touchDelegateInfo = this.a.getTouchDelegateInfo();
            if (touchDelegateInfo != null) {
                return new e(touchDelegateInfo);
            }
        }
        return null;
    }
    
    public void X0(final Object o) {
        if (Build$VERSION.SDK_INT >= 19) {
            final AccessibilityNodeInfo a = this.a;
            AccessibilityNodeInfo$CollectionItemInfo collectionItemInfo;
            if (o == null) {
                collectionItemInfo = null;
            }
            else {
                collectionItemInfo = (AccessibilityNodeInfo$CollectionItemInfo)((c)o).a;
            }
            a.setCollectionItemInfo(collectionItemInfo);
        }
    }
    
    public d Y() {
        if (Build$VERSION.SDK_INT >= 22) {
            return W1(this.a.getTraversalAfter());
        }
        return null;
    }
    
    public void Y0(final CharSequence contentDescription) {
        this.a.setContentDescription(contentDescription);
    }
    
    public d Z() {
        if (Build$VERSION.SDK_INT >= 22) {
            return W1(this.a.getTraversalBefore());
        }
        return null;
    }
    
    public void Z0(final boolean contentInvalid) {
        if (Build$VERSION.SDK_INT >= 19) {
            this.a.setContentInvalid(contentInvalid);
        }
    }
    
    public void a(final int n) {
        this.a.addAction(n);
    }
    
    public String a0() {
        if (Build$VERSION.SDK_INT >= 18) {
            return this.a.getViewIdResourceName();
        }
        return null;
    }
    
    public void a1(final boolean contextClickable) {
        if (Build$VERSION.SDK_INT >= 23) {
            this.a.setContextClickable(contextClickable);
        }
    }
    
    public void b(final a a) {
        if (Build$VERSION.SDK_INT >= 21) {
            this.a.addAction((AccessibilityNodeInfo$AccessibilityAction)a.a);
        }
    }
    
    public h b0() {
        if (Build$VERSION.SDK_INT >= 21) {
            return androidx.core.view.accessibility.h.r(this.a.getWindow());
        }
        return null;
    }
    
    public void b1(final boolean dismissable) {
        if (Build$VERSION.SDK_INT >= 19) {
            this.a.setDismissable(dismissable);
        }
    }
    
    public void c(final View view) {
        this.a.addChild(view);
    }
    
    public int c0() {
        return this.a.getWindowId();
    }
    
    public void c1(final int drawingOrder) {
        if (Build$VERSION.SDK_INT >= 24) {
            this.a.setDrawingOrder(drawingOrder);
        }
    }
    
    public void d(final View view, final int n) {
        if (Build$VERSION.SDK_INT >= 16) {
            this.a.addChild(view, n);
        }
    }
    
    public void d1(final boolean editable) {
        if (Build$VERSION.SDK_INT >= 18) {
            this.a.setEditable(editable);
        }
    }
    
    public void e1(final boolean enabled) {
        this.a.setEnabled(enabled);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!(o instanceof d)) {
            return false;
        }
        final d d = (d)o;
        final AccessibilityNodeInfo a = this.a;
        if (a == null) {
            if (d.a != null) {
                return false;
            }
        }
        else if (!a.equals((Object)d.a)) {
            return false;
        }
        return this.c == d.c && this.b == d.b;
    }
    
    @t0({ t0.a.I })
    public void f(final CharSequence charSequence, final View view) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 19 && sdk_INT < 26) {
            this.h();
            this.M0(view);
            final ClickableSpan[] w = w(charSequence);
            if (w != null && w.length > 0) {
                this.C().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", k.a.e.a);
                final SparseArray<WeakReference<ClickableSpan>> l = this.L(view);
                for (int i = 0; i < w.length; ++i) {
                    final int e0 = this.e0(w[i], l);
                    l.put(e0, (Object)new WeakReference(w[i]));
                    this.e(w[i], (Spanned)charSequence, e0);
                }
            }
        }
    }
    
    public boolean f0() {
        return Build$VERSION.SDK_INT >= 16 && this.a.isAccessibilityFocused();
    }
    
    public void f1(final CharSequence error) {
        if (Build$VERSION.SDK_INT >= 21) {
            this.a.setError(error);
        }
    }
    
    public boolean g() {
        return Build$VERSION.SDK_INT >= 19 && this.a.canOpenPopup();
    }
    
    public boolean g0() {
        return this.a.isCheckable();
    }
    
    public void g1(final boolean focusable) {
        this.a.setFocusable(focusable);
    }
    
    public boolean h0() {
        return this.a.isChecked();
    }
    
    public void h1(final boolean focused) {
        this.a.setFocused(focused);
    }
    
    @Override
    public int hashCode() {
        final AccessibilityNodeInfo a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        return hashCode;
    }
    
    public boolean i0() {
        return this.a.isClickable();
    }
    
    public void i1(final boolean heading) {
        if (Build$VERSION.SDK_INT >= 28) {
            this.a.setHeading(heading);
        }
        else {
            this.O0(2, heading);
        }
    }
    
    public List<d> j(final String s) {
        final ArrayList<d> list = new ArrayList<d>();
        final List accessibilityNodeInfosByText = this.a.findAccessibilityNodeInfosByText(s);
        for (int size = accessibilityNodeInfosByText.size(), i = 0; i < size; ++i) {
            list.add(V1(accessibilityNodeInfosByText.get(i)));
        }
        return list;
    }
    
    public boolean j0() {
        return Build$VERSION.SDK_INT >= 19 && this.a.isContentInvalid();
    }
    
    public void j1(@k0 final CharSequence hintText) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 26) {
            this.a.setHintText(hintText);
        }
        else if (sdk_INT >= 19) {
            this.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", hintText);
        }
    }
    
    public List<d> k(final String s) {
        if (Build$VERSION.SDK_INT >= 18) {
            final List accessibilityNodeInfosByViewId = this.a.findAccessibilityNodeInfosByViewId(s);
            final ArrayList<d> list = new ArrayList<d>();
            final Iterator<AccessibilityNodeInfo> iterator = accessibilityNodeInfosByViewId.iterator();
            while (iterator.hasNext()) {
                list.add(V1(iterator.next()));
            }
            return list;
        }
        return Collections.emptyList();
    }
    
    public boolean k0() {
        return Build$VERSION.SDK_INT >= 23 && this.a.isContextClickable();
    }
    
    public void k1(final boolean importantForAccessibility) {
        if (Build$VERSION.SDK_INT >= 24) {
            this.a.setImportantForAccessibility(importantForAccessibility);
        }
    }
    
    public d l(final int n) {
        if (Build$VERSION.SDK_INT >= 16) {
            return W1(this.a.findFocus(n));
        }
        return null;
    }
    
    public boolean l0() {
        return Build$VERSION.SDK_INT >= 19 && this.a.isDismissable();
    }
    
    public void l1(final int inputType) {
        if (Build$VERSION.SDK_INT >= 19) {
            this.a.setInputType(inputType);
        }
    }
    
    public d m(final int n) {
        if (Build$VERSION.SDK_INT >= 16) {
            return W1(this.a.focusSearch(n));
        }
        return null;
    }
    
    public boolean m0() {
        return Build$VERSION.SDK_INT >= 18 && this.a.isEditable();
    }
    
    public void m1(final View labelFor) {
        if (Build$VERSION.SDK_INT >= 17) {
            this.a.setLabelFor(labelFor);
        }
    }
    
    public List<a> n() {
        List<Object> actionList;
        if (Build$VERSION.SDK_INT >= 21) {
            actionList = (List<Object>)this.a.getActionList();
        }
        else {
            actionList = null;
        }
        if (actionList != null) {
            final ArrayList<a> list = new ArrayList<a>();
            for (int size = actionList.size(), i = 0; i < size; ++i) {
                list.add(new a(actionList.get(i)));
            }
            return list;
        }
        return Collections.emptyList();
    }
    
    public boolean n0() {
        return this.a.isEnabled();
    }
    
    public void n1(final View view, final int n) {
        if (Build$VERSION.SDK_INT >= 17) {
            this.a.setLabelFor(view, n);
        }
    }
    
    public boolean o0() {
        return this.a.isFocusable();
    }
    
    public void o1(final View labeledBy) {
        if (Build$VERSION.SDK_INT >= 17) {
            this.a.setLabeledBy(labeledBy);
        }
    }
    
    public int p() {
        return this.a.getActions();
    }
    
    public boolean p0() {
        return this.a.isFocused();
    }
    
    public void p1(final View view, final int n) {
        if (Build$VERSION.SDK_INT >= 17) {
            this.a.setLabeledBy(view, n);
        }
    }
    
    public boolean q0() {
        if (Build$VERSION.SDK_INT >= 28) {
            return this.a.isHeading();
        }
        final boolean q = this.q(2);
        boolean b = true;
        if (q) {
            return true;
        }
        final c y = this.y();
        if (y == null || !y.e()) {
            b = false;
        }
        return b;
    }
    
    public void q1(final int liveRegion) {
        if (Build$VERSION.SDK_INT >= 19) {
            this.a.setLiveRegion(liveRegion);
        }
    }
    
    @Deprecated
    public void r(final Rect rect) {
        this.a.getBoundsInParent(rect);
    }
    
    public boolean r0() {
        return Build$VERSION.SDK_INT < 24 || this.a.isImportantForAccessibility();
    }
    
    public void r1(final boolean longClickable) {
        this.a.setLongClickable(longClickable);
    }
    
    public void s(final Rect rect) {
        this.a.getBoundsInScreen(rect);
    }
    
    public boolean s0() {
        return this.a.isLongClickable();
    }
    
    public void s1(final int maxTextLength) {
        if (Build$VERSION.SDK_INT >= 21) {
            this.a.setMaxTextLength(maxTextLength);
        }
    }
    
    public d t(final int n) {
        return W1(this.a.getChild(n));
    }
    
    public boolean t0() {
        return Build$VERSION.SDK_INT >= 19 && this.a.isMultiLine();
    }
    
    public void t1(final int movementGranularities) {
        if (Build$VERSION.SDK_INT >= 16) {
            this.a.setMovementGranularities(movementGranularities);
        }
    }
    
    @j0
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        final Rect rect = new Rect();
        this.r(rect);
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("; boundsInParent: ");
        sb2.append(rect);
        sb.append(sb2.toString());
        this.s(rect);
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("; boundsInScreen: ");
        sb3.append(rect);
        sb.append(sb3.toString());
        sb.append("; packageName: ");
        sb.append(this.M());
        sb.append("; className: ");
        sb.append(this.v());
        sb.append("; text: ");
        sb.append(this.T());
        sb.append("; contentDescription: ");
        sb.append(this.z());
        sb.append("; viewId: ");
        sb.append(this.a0());
        sb.append("; checkable: ");
        sb.append(this.g0());
        sb.append("; checked: ");
        sb.append(this.h0());
        sb.append("; focusable: ");
        sb.append(this.o0());
        sb.append("; focused: ");
        sb.append(this.p0());
        sb.append("; selected: ");
        sb.append(this.x0());
        sb.append("; clickable: ");
        sb.append(this.i0());
        sb.append("; longClickable: ");
        sb.append(this.s0());
        sb.append("; enabled: ");
        sb.append(this.n0());
        sb.append("; password: ");
        sb.append(this.u0());
        final StringBuilder sb4 = new StringBuilder();
        sb4.append("; scrollable: ");
        sb4.append(this.w0());
        sb.append(sb4.toString());
        sb.append("; [");
        if (Build$VERSION.SDK_INT >= 21) {
            final List<a> n = this.n();
            for (int i = 0; i < n.size(); ++i) {
                final a a = n.get(i);
                String str;
                final String s = str = o(a.b());
                if (s.equals("ACTION_UNKNOWN")) {
                    str = s;
                    if (a.c() != null) {
                        str = a.c().toString();
                    }
                }
                sb.append(str);
                if (i != n.size() - 1) {
                    sb.append(", ");
                }
            }
        }
        else {
            int n3;
            for (int j = this.p(); j != 0; j = n3) {
                final int n2 = 1 << Integer.numberOfTrailingZeros(j);
                n3 = (j & ~n2);
                sb.append(o(n2));
                if ((j = n3) != 0) {
                    sb.append(", ");
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }
    
    public int u() {
        return this.a.getChildCount();
    }
    
    public boolean u0() {
        return this.a.isPassword();
    }
    
    public void u1(final boolean multiLine) {
        if (Build$VERSION.SDK_INT >= 19) {
            this.a.setMultiLine(multiLine);
        }
    }
    
    public CharSequence v() {
        return this.a.getClassName();
    }
    
    public boolean v0() {
        if (Build$VERSION.SDK_INT >= 28) {
            return this.a.isScreenReaderFocusable();
        }
        return this.q(1);
    }
    
    public void v1(final CharSequence packageName) {
        this.a.setPackageName(packageName);
    }
    
    public boolean w0() {
        return this.a.isScrollable();
    }
    
    public void w1(@k0 final CharSequence paneTitle) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 28) {
            this.a.setPaneTitle(paneTitle);
        }
        else if (sdk_INT >= 19) {
            this.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", paneTitle);
        }
    }
    
    public b x() {
        if (Build$VERSION.SDK_INT >= 19) {
            final AccessibilityNodeInfo$CollectionInfo collectionInfo = this.a.getCollectionInfo();
            if (collectionInfo != null) {
                return new b(collectionInfo);
            }
        }
        return null;
    }
    
    public boolean x0() {
        return this.a.isSelected();
    }
    
    public void x1(final View parent) {
        this.b = -1;
        this.a.setParent(parent);
    }
    
    public c y() {
        if (Build$VERSION.SDK_INT >= 19) {
            final AccessibilityNodeInfo$CollectionItemInfo collectionItemInfo = this.a.getCollectionItemInfo();
            if (collectionItemInfo != null) {
                return new c(collectionItemInfo);
            }
        }
        return null;
    }
    
    public boolean y0() {
        if (Build$VERSION.SDK_INT >= 26) {
            return this.a.isShowingHintText();
        }
        return this.q(4);
    }
    
    public void y1(final View view, final int b) {
        this.b = b;
        if (Build$VERSION.SDK_INT >= 16) {
            this.a.setParent(view, b);
        }
    }
    
    public CharSequence z() {
        return this.a.getContentDescription();
    }
    
    public boolean z0() {
        if (Build$VERSION.SDK_INT >= 29) {
            return this.a.isTextEntryKey();
        }
        return this.q(8);
    }
    
    public void z1(final boolean password) {
        this.a.setPassword(password);
    }
    
    public static class a
    {
        public static final a A;
        public static final a B;
        public static final a C;
        public static final a D;
        public static final a E;
        public static final a F;
        public static final a G;
        @j0
        public static final a H;
        @j0
        public static final a I;
        @j0
        public static final a J;
        @j0
        public static final a K;
        public static final a L;
        public static final a M;
        public static final a N;
        public static final a O;
        public static final a P;
        @j0
        public static final a Q;
        @j0
        public static final a R;
        private static final String e = "A11yActionCompat";
        public static final a f;
        public static final a g;
        public static final a h;
        public static final a i;
        public static final a j;
        public static final a k;
        public static final a l;
        public static final a m;
        public static final a n;
        public static final a o;
        public static final a p;
        public static final a q;
        public static final a r;
        public static final a s;
        public static final a t;
        public static final a u;
        public static final a v;
        public static final a w;
        public static final a x;
        public static final a y;
        public static final a z;
        final Object a;
        private final int b;
        private final Class<? extends g.a> c;
        @t0({ t0.a.I })
        protected final g d;
        
        static {
            final Object o2 = null;
            f = new a(1, null);
            g = new a(2, null);
            h = new a(4, null);
            i = new a(8, null);
            j = new a(16, null);
            k = new a(32, null);
            l = new a(64, null);
            m = new a(128, null);
            n = new a(256, null, g.b.class);
            o = new a(512, null, g.b.class);
            p = new a(1024, null, g.c.class);
            q = new a(2048, null, g.c.class);
            r = new a(4096, null);
            s = new a(8192, null);
            t = new a(16384, null);
            u = new a(32768, null);
            v = new a(65536, null);
            w = new a(131072, null, g.g.class);
            x = new a(262144, null);
            y = new a(524288, null);
            z = new a(1048576, null);
            A = new a(2097152, null, g.h.class);
            final int sdk_INT = Build$VERSION.SDK_INT;
            AccessibilityNodeInfo$AccessibilityAction action_SHOW_ON_SCREEN;
            if (sdk_INT >= 23) {
                action_SHOW_ON_SCREEN = AccessibilityNodeInfo$AccessibilityAction.ACTION_SHOW_ON_SCREEN;
            }
            else {
                action_SHOW_ON_SCREEN = null;
            }
            B = new a(action_SHOW_ON_SCREEN, 16908342, null, null, null);
            AccessibilityNodeInfo$AccessibilityAction action_SCROLL_TO_POSITION;
            if (sdk_INT >= 23) {
                action_SCROLL_TO_POSITION = AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_TO_POSITION;
            }
            else {
                action_SCROLL_TO_POSITION = null;
            }
            C = new a(action_SCROLL_TO_POSITION, 16908343, null, null, g.e.class);
            AccessibilityNodeInfo$AccessibilityAction action_SCROLL_UP;
            if (sdk_INT >= 23) {
                action_SCROLL_UP = AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_UP;
            }
            else {
                action_SCROLL_UP = null;
            }
            D = new a(action_SCROLL_UP, 16908344, null, null, null);
            AccessibilityNodeInfo$AccessibilityAction action_SCROLL_LEFT;
            if (sdk_INT >= 23) {
                action_SCROLL_LEFT = AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_LEFT;
            }
            else {
                action_SCROLL_LEFT = null;
            }
            E = new a(action_SCROLL_LEFT, 16908345, null, null, null);
            AccessibilityNodeInfo$AccessibilityAction action_SCROLL_DOWN;
            if (sdk_INT >= 23) {
                action_SCROLL_DOWN = AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_DOWN;
            }
            else {
                action_SCROLL_DOWN = null;
            }
            F = new a(action_SCROLL_DOWN, 16908346, null, null, null);
            AccessibilityNodeInfo$AccessibilityAction action_SCROLL_RIGHT;
            if (sdk_INT >= 23) {
                action_SCROLL_RIGHT = AccessibilityNodeInfo$AccessibilityAction.ACTION_SCROLL_RIGHT;
            }
            else {
                action_SCROLL_RIGHT = null;
            }
            G = new a(action_SCROLL_RIGHT, 16908347, null, null, null);
            AccessibilityNodeInfo$AccessibilityAction action_PAGE_UP;
            if (sdk_INT >= 29) {
                action_PAGE_UP = AccessibilityNodeInfo$AccessibilityAction.ACTION_PAGE_UP;
            }
            else {
                action_PAGE_UP = null;
            }
            H = new a(action_PAGE_UP, 16908358, null, null, null);
            AccessibilityNodeInfo$AccessibilityAction action_PAGE_DOWN;
            if (sdk_INT >= 29) {
                action_PAGE_DOWN = AccessibilityNodeInfo$AccessibilityAction.ACTION_PAGE_DOWN;
            }
            else {
                action_PAGE_DOWN = null;
            }
            I = new a(action_PAGE_DOWN, 16908359, null, null, null);
            AccessibilityNodeInfo$AccessibilityAction action_PAGE_LEFT;
            if (sdk_INT >= 29) {
                action_PAGE_LEFT = AccessibilityNodeInfo$AccessibilityAction.ACTION_PAGE_LEFT;
            }
            else {
                action_PAGE_LEFT = null;
            }
            J = new a(action_PAGE_LEFT, 16908360, null, null, null);
            AccessibilityNodeInfo$AccessibilityAction action_PAGE_RIGHT;
            if (sdk_INT >= 29) {
                action_PAGE_RIGHT = AccessibilityNodeInfo$AccessibilityAction.ACTION_PAGE_RIGHT;
            }
            else {
                action_PAGE_RIGHT = null;
            }
            K = new a(action_PAGE_RIGHT, 16908361, null, null, null);
            AccessibilityNodeInfo$AccessibilityAction action_CONTEXT_CLICK;
            if (sdk_INT >= 23) {
                action_CONTEXT_CLICK = AccessibilityNodeInfo$AccessibilityAction.ACTION_CONTEXT_CLICK;
            }
            else {
                action_CONTEXT_CLICK = null;
            }
            L = new a(action_CONTEXT_CLICK, 16908348, null, null, null);
            AccessibilityNodeInfo$AccessibilityAction action_SET_PROGRESS;
            if (sdk_INT >= 24) {
                action_SET_PROGRESS = AccessibilityNodeInfo$AccessibilityAction.ACTION_SET_PROGRESS;
            }
            else {
                action_SET_PROGRESS = null;
            }
            M = new a(action_SET_PROGRESS, 16908349, null, null, g.f.class);
            AccessibilityNodeInfo$AccessibilityAction action_MOVE_WINDOW;
            if (sdk_INT >= 26) {
                action_MOVE_WINDOW = AccessibilityNodeInfo$AccessibilityAction.ACTION_MOVE_WINDOW;
            }
            else {
                action_MOVE_WINDOW = null;
            }
            N = new a(action_MOVE_WINDOW, 16908354, null, null, g.d.class);
            AccessibilityNodeInfo$AccessibilityAction action_SHOW_TOOLTIP;
            if (sdk_INT >= 28) {
                action_SHOW_TOOLTIP = AccessibilityNodeInfo$AccessibilityAction.ACTION_SHOW_TOOLTIP;
            }
            else {
                action_SHOW_TOOLTIP = null;
            }
            O = new a(action_SHOW_TOOLTIP, 16908356, null, null, null);
            AccessibilityNodeInfo$AccessibilityAction action_HIDE_TOOLTIP;
            if (sdk_INT >= 28) {
                action_HIDE_TOOLTIP = AccessibilityNodeInfo$AccessibilityAction.ACTION_HIDE_TOOLTIP;
            }
            else {
                action_HIDE_TOOLTIP = null;
            }
            P = new a(action_HIDE_TOOLTIP, 16908357, null, null, null);
            AccessibilityNodeInfo$AccessibilityAction action_PRESS_AND_HOLD;
            if (sdk_INT >= 30) {
                action_PRESS_AND_HOLD = AccessibilityNodeInfo$AccessibilityAction.ACTION_PRESS_AND_HOLD;
            }
            else {
                action_PRESS_AND_HOLD = null;
            }
            Q = new a(action_PRESS_AND_HOLD, 16908362, null, null, null);
            Object action_IME_ENTER = o2;
            if (sdk_INT >= 30) {
                action_IME_ENTER = AccessibilityNodeInfo$AccessibilityAction.ACTION_IME_ENTER;
            }
            R = new a(action_IME_ENTER, 16908372, null, null, null);
        }
        
        public a(final int n, final CharSequence charSequence) {
            this(null, n, charSequence, null, null);
        }
        
        @t0({ t0.a.I })
        public a(final int n, final CharSequence charSequence, final g g) {
            this(null, n, charSequence, g, null);
        }
        
        private a(final int n, final CharSequence charSequence, final Class<? extends g.a> clazz) {
            this(null, n, charSequence, null, clazz);
        }
        
        a(final Object o) {
            this(o, 0, null, null, null);
        }
        
        a(final Object o, final int b, final CharSequence charSequence, final g d, final Class<? extends g.a> c) {
            this.b = b;
            this.d = d;
            Object a = o;
            if (Build$VERSION.SDK_INT >= 21 && (a = o) == null) {
                a = new AccessibilityNodeInfo$AccessibilityAction(b, charSequence);
            }
            this.a = a;
            this.c = c;
        }
        
        @t0({ t0.a.I })
        public a a(final CharSequence charSequence, final g g) {
            return new a(null, this.b, charSequence, g, this.c);
        }
        
        public int b() {
            if (Build$VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo$AccessibilityAction)this.a).getId();
            }
            return 0;
        }
        
        public CharSequence c() {
            if (Build$VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo$AccessibilityAction)this.a).getLabel();
            }
            return null;
        }
        
        @t0({ t0.a.I })
        public boolean d(final View view, final Bundle bundle) {
            if (this.d != null) {
                Object o = null;
                final Exception ex = null;
                final Class<? extends g.a> c = this.c;
                if (c != null) {
                    Object o2;
                    Exception ex2 = null;
                    try {
                        o = (g.a)c.getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]);
                        try {
                            ((g.a)o).a(bundle);
                        }
                        catch (Exception ex) {
                            o2 = o;
                            ex2 = ex;
                        }
                    }
                    catch (Exception ex2) {
                        o2 = ex;
                    }
                    final Class<? extends g.a> c2 = this.c;
                    String name;
                    if (c2 == null) {
                        name = "null";
                    }
                    else {
                        name = c2.getName();
                    }
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Failed to execute command with argument class ViewCommandArgument: ");
                    sb.append(name);
                    Log.e("A11yActionCompat", sb.toString(), (Throwable)ex2);
                    o = o2;
                }
                return this.d.a(view, (g.a)o);
            }
            return false;
        }
        
        @Override
        public boolean equals(@k0 Object a) {
            if (a == null) {
                return false;
            }
            if (!(a instanceof a)) {
                return false;
            }
            final a a2 = (a)a;
            a = this.a;
            final Object a3 = a2.a;
            if (a == null) {
                if (a3 != null) {
                    return false;
                }
            }
            else if (!a.equals(a3)) {
                return false;
            }
            return true;
        }
        
        @Override
        public int hashCode() {
            final Object a = this.a;
            int hashCode;
            if (a != null) {
                hashCode = a.hashCode();
            }
            else {
                hashCode = 0;
            }
            return hashCode;
        }
    }
    
    public static class b
    {
        public static final int b = 0;
        public static final int c = 1;
        public static final int d = 2;
        final Object a;
        
        b(final Object a) {
            this.a = a;
        }
        
        public static b e(final int n, final int n2, final boolean b) {
            if (Build$VERSION.SDK_INT >= 19) {
                return new b(AccessibilityNodeInfo$CollectionInfo.obtain(n, n2, b));
            }
            return new b(null);
        }
        
        public static b f(final int n, final int n2, final boolean b, final int n3) {
            final int sdk_INT = Build$VERSION.SDK_INT;
            if (sdk_INT >= 21) {
                return new b(AccessibilityNodeInfo$CollectionInfo.obtain(n, n2, b, n3));
            }
            if (sdk_INT >= 19) {
                return new b(AccessibilityNodeInfo$CollectionInfo.obtain(n, n2, b));
            }
            return new b(null);
        }
        
        public int a() {
            if (Build$VERSION.SDK_INT >= 19) {
                return ((AccessibilityNodeInfo$CollectionInfo)this.a).getColumnCount();
            }
            return -1;
        }
        
        public int b() {
            if (Build$VERSION.SDK_INT >= 19) {
                return ((AccessibilityNodeInfo$CollectionInfo)this.a).getRowCount();
            }
            return -1;
        }
        
        public int c() {
            if (Build$VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo$CollectionInfo)this.a).getSelectionMode();
            }
            return 0;
        }
        
        public boolean d() {
            return Build$VERSION.SDK_INT >= 19 && ((AccessibilityNodeInfo$CollectionInfo)this.a).isHierarchical();
        }
    }
    
    public static class c
    {
        final Object a;
        
        c(final Object a) {
            this.a = a;
        }
        
        public static c g(final int n, final int n2, final int n3, final int n4, final boolean b) {
            if (Build$VERSION.SDK_INT >= 19) {
                return new c(AccessibilityNodeInfo$CollectionItemInfo.obtain(n, n2, n3, n4, b));
            }
            return new c(null);
        }
        
        public static c h(final int n, final int n2, final int n3, final int n4, final boolean b, final boolean b2) {
            final int sdk_INT = Build$VERSION.SDK_INT;
            if (sdk_INT >= 21) {
                return new c(AccessibilityNodeInfo$CollectionItemInfo.obtain(n, n2, n3, n4, b, b2));
            }
            if (sdk_INT >= 19) {
                return new c(AccessibilityNodeInfo$CollectionItemInfo.obtain(n, n2, n3, n4, b));
            }
            return new c(null);
        }
        
        public int a() {
            if (Build$VERSION.SDK_INT >= 19) {
                return ((AccessibilityNodeInfo$CollectionItemInfo)this.a).getColumnIndex();
            }
            return 0;
        }
        
        public int b() {
            if (Build$VERSION.SDK_INT >= 19) {
                return ((AccessibilityNodeInfo$CollectionItemInfo)this.a).getColumnSpan();
            }
            return 0;
        }
        
        public int c() {
            if (Build$VERSION.SDK_INT >= 19) {
                return ((AccessibilityNodeInfo$CollectionItemInfo)this.a).getRowIndex();
            }
            return 0;
        }
        
        public int d() {
            if (Build$VERSION.SDK_INT >= 19) {
                return ((AccessibilityNodeInfo$CollectionItemInfo)this.a).getRowSpan();
            }
            return 0;
        }
        
        @Deprecated
        public boolean e() {
            return Build$VERSION.SDK_INT >= 19 && ((AccessibilityNodeInfo$CollectionItemInfo)this.a).isHeading();
        }
        
        public boolean f() {
            return Build$VERSION.SDK_INT >= 21 && ((AccessibilityNodeInfo$CollectionItemInfo)this.a).isSelected();
        }
    }
    
    public static class d
    {
        public static final int b = 0;
        public static final int c = 1;
        public static final int d = 2;
        final Object a;
        
        d(final Object a) {
            this.a = a;
        }
        
        public static d e(final int n, final float n2, final float n3, final float n4) {
            if (Build$VERSION.SDK_INT >= 19) {
                return new d(AccessibilityNodeInfo$RangeInfo.obtain(n, n2, n3, n4));
            }
            return new d(null);
        }
        
        public float a() {
            if (Build$VERSION.SDK_INT >= 19) {
                return ((AccessibilityNodeInfo$RangeInfo)this.a).getCurrent();
            }
            return 0.0f;
        }
        
        public float b() {
            if (Build$VERSION.SDK_INT >= 19) {
                return ((AccessibilityNodeInfo$RangeInfo)this.a).getMax();
            }
            return 0.0f;
        }
        
        public float c() {
            if (Build$VERSION.SDK_INT >= 19) {
                return ((AccessibilityNodeInfo$RangeInfo)this.a).getMin();
            }
            return 0.0f;
        }
        
        public int d() {
            if (Build$VERSION.SDK_INT >= 19) {
                return ((AccessibilityNodeInfo$RangeInfo)this.a).getType();
            }
            return 0;
        }
    }
    
    public static final class e
    {
        final AccessibilityNodeInfo$TouchDelegateInfo a;
        
        e(@j0 final AccessibilityNodeInfo$TouchDelegateInfo a) {
            this.a = a;
        }
        
        public e(@j0 final Map<Region, View> map) {
            if (Build$VERSION.SDK_INT >= 29) {
                this.a = new AccessibilityNodeInfo$TouchDelegateInfo((Map)map);
            }
            else {
                this.a = null;
            }
        }
        
        @k0
        public Region a(@b0(from = 0L) final int n) {
            if (Build$VERSION.SDK_INT >= 29) {
                return this.a.getRegionAt(n);
            }
            return null;
        }
        
        @b0(from = 0L)
        public int b() {
            if (Build$VERSION.SDK_INT >= 29) {
                return this.a.getRegionCount();
            }
            return 0;
        }
        
        @k0
        public d c(@j0 final Region region) {
            if (Build$VERSION.SDK_INT >= 29) {
                final AccessibilityNodeInfo targetForRegion = this.a.getTargetForRegion(region);
                if (targetForRegion != null) {
                    return androidx.core.view.accessibility.d.V1(targetForRegion);
                }
            }
            return null;
        }
    }
}
