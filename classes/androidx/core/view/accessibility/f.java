// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.view.accessibility;

import java.util.List;
import android.os.Parcelable;
import android.view.View;
import androidx.annotation.j0;
import android.os.Build$VERSION;
import android.view.accessibility.AccessibilityRecord;

public class f
{
    private final AccessibilityRecord a;
    
    @Deprecated
    public f(final Object o) {
        this.a = (AccessibilityRecord)o;
    }
    
    @Deprecated
    public static f A(final f f) {
        return new f(AccessibilityRecord.obtain(f.a));
    }
    
    public static void N(final AccessibilityRecord accessibilityRecord, final int maxScrollX) {
        if (Build$VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollX(maxScrollX);
        }
    }
    
    public static void P(final AccessibilityRecord accessibilityRecord, final int maxScrollY) {
        if (Build$VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollY(maxScrollY);
        }
    }
    
    public static void Y(@j0 final AccessibilityRecord accessibilityRecord, final View view, final int n) {
        if (Build$VERSION.SDK_INT >= 16) {
            accessibilityRecord.setSource(view, n);
        }
    }
    
    public static int j(final AccessibilityRecord accessibilityRecord) {
        if (Build$VERSION.SDK_INT >= 15) {
            return accessibilityRecord.getMaxScrollX();
        }
        return 0;
    }
    
    public static int l(final AccessibilityRecord accessibilityRecord) {
        if (Build$VERSION.SDK_INT >= 15) {
            return accessibilityRecord.getMaxScrollY();
        }
        return 0;
    }
    
    @Deprecated
    public static f z() {
        return new f(AccessibilityRecord.obtain());
    }
    
    @Deprecated
    public void B() {
        this.a.recycle();
    }
    
    @Deprecated
    public void C(final int addedCount) {
        this.a.setAddedCount(addedCount);
    }
    
    @Deprecated
    public void D(final CharSequence beforeText) {
        this.a.setBeforeText(beforeText);
    }
    
    @Deprecated
    public void E(final boolean checked) {
        this.a.setChecked(checked);
    }
    
    @Deprecated
    public void F(final CharSequence className) {
        this.a.setClassName(className);
    }
    
    @Deprecated
    public void G(final CharSequence contentDescription) {
        this.a.setContentDescription(contentDescription);
    }
    
    @Deprecated
    public void H(final int currentItemIndex) {
        this.a.setCurrentItemIndex(currentItemIndex);
    }
    
    @Deprecated
    public void I(final boolean enabled) {
        this.a.setEnabled(enabled);
    }
    
    @Deprecated
    public void J(final int fromIndex) {
        this.a.setFromIndex(fromIndex);
    }
    
    @Deprecated
    public void K(final boolean fullScreen) {
        this.a.setFullScreen(fullScreen);
    }
    
    @Deprecated
    public void L(final int itemCount) {
        this.a.setItemCount(itemCount);
    }
    
    @Deprecated
    public void M(final int n) {
        N(this.a, n);
    }
    
    @Deprecated
    public void O(final int n) {
        P(this.a, n);
    }
    
    @Deprecated
    public void Q(final Parcelable parcelableData) {
        this.a.setParcelableData(parcelableData);
    }
    
    @Deprecated
    public void R(final boolean password) {
        this.a.setPassword(password);
    }
    
    @Deprecated
    public void S(final int removedCount) {
        this.a.setRemovedCount(removedCount);
    }
    
    @Deprecated
    public void T(final int scrollX) {
        this.a.setScrollX(scrollX);
    }
    
    @Deprecated
    public void U(final int scrollY) {
        this.a.setScrollY(scrollY);
    }
    
    @Deprecated
    public void V(final boolean scrollable) {
        this.a.setScrollable(scrollable);
    }
    
    @Deprecated
    public void W(final View source) {
        this.a.setSource(source);
    }
    
    @Deprecated
    public void X(final View view, final int n) {
        Y(this.a, view, n);
    }
    
    @Deprecated
    public void Z(final int toIndex) {
        this.a.setToIndex(toIndex);
    }
    
    @Deprecated
    public int a() {
        return this.a.getAddedCount();
    }
    
    @Deprecated
    public CharSequence b() {
        return this.a.getBeforeText();
    }
    
    @Deprecated
    public CharSequence c() {
        return this.a.getClassName();
    }
    
    @Deprecated
    public CharSequence d() {
        return this.a.getContentDescription();
    }
    
    @Deprecated
    public int e() {
        return this.a.getCurrentItemIndex();
    }
    
    @Deprecated
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof f)) {
            return false;
        }
        final f f = (f)o;
        final AccessibilityRecord a = this.a;
        final AccessibilityRecord a2 = f.a;
        if (a == null) {
            if (a2 != null) {
                return false;
            }
        }
        else if (!a.equals(a2)) {
            return false;
        }
        return true;
    }
    
    @Deprecated
    public int f() {
        return this.a.getFromIndex();
    }
    
    @Deprecated
    public Object g() {
        return this.a;
    }
    
    @Deprecated
    public int h() {
        return this.a.getItemCount();
    }
    
    @Deprecated
    @Override
    public int hashCode() {
        final AccessibilityRecord a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        return hashCode;
    }
    
    @Deprecated
    public int i() {
        return j(this.a);
    }
    
    @Deprecated
    public int k() {
        return l(this.a);
    }
    
    @Deprecated
    public Parcelable m() {
        return this.a.getParcelableData();
    }
    
    @Deprecated
    public int n() {
        return this.a.getRemovedCount();
    }
    
    @Deprecated
    public int o() {
        return this.a.getScrollX();
    }
    
    @Deprecated
    public int p() {
        return this.a.getScrollY();
    }
    
    @Deprecated
    public d q() {
        return d.W1(this.a.getSource());
    }
    
    @Deprecated
    public List<CharSequence> r() {
        return (List<CharSequence>)this.a.getText();
    }
    
    @Deprecated
    public int s() {
        return this.a.getToIndex();
    }
    
    @Deprecated
    public int t() {
        return this.a.getWindowId();
    }
    
    @Deprecated
    public boolean u() {
        return this.a.isChecked();
    }
    
    @Deprecated
    public boolean v() {
        return this.a.isEnabled();
    }
    
    @Deprecated
    public boolean w() {
        return this.a.isFullScreen();
    }
    
    @Deprecated
    public boolean x() {
        return this.a.isPassword();
    }
    
    @Deprecated
    public boolean y() {
        return this.a.isScrollable();
    }
}
