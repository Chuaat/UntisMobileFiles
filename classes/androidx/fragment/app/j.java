// 
// Decompiled by Procyon v0.5.36
// 

package androidx.fragment.app;

import android.content.res.TypedArray;
import android.view.View$OnAttachStateChangeListener;
import android.view.ViewGroup;
import android.util.Log;
import y.a;
import android.util.AttributeSet;
import android.content.Context;
import androidx.annotation.j0;
import androidx.annotation.k0;
import android.view.View;
import android.view.LayoutInflater$Factory2;

class j implements LayoutInflater$Factory2
{
    private static final String H = "FragmentManager";
    final FragmentManager G;
    
    j(final FragmentManager g) {
        this.G = g;
    }
    
    @k0
    public View onCreateView(@k0 View mView, @j0 final String s, @j0 final Context context, @j0 final AttributeSet set) {
        if (FragmentContainerView.class.getName().equals(s)) {
            return (View)new FragmentContainerView(context, set, this.G);
        }
        final boolean equals = "fragment".equals(s);
        Fragment p4 = null;
        if (!equals) {
            return null;
        }
        final String attributeValue = set.getAttributeValue((String)null, "class");
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, a.l.x);
        String string;
        if ((string = attributeValue) == null) {
            string = obtainStyledAttributes.getString(a.l.y);
        }
        final int resourceId = obtainStyledAttributes.getResourceId(a.l.z, -1);
        final String string2 = obtainStyledAttributes.getString(a.l.A);
        obtainStyledAttributes.recycle();
        if (string == null || !h.b(context.getClassLoader(), string)) {
            return null;
        }
        int id;
        if (mView != null) {
            id = mView.getId();
        }
        else {
            id = 0;
        }
        if (id == -1 && resourceId == -1 && string2 == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append(set.getPositionDescription());
            sb.append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
            sb.append(string);
            throw new IllegalArgumentException(sb.toString());
        }
        if (resourceId != -1) {
            p4 = this.G.p0(resourceId);
        }
        Fragment q0;
        if ((q0 = p4) == null) {
            q0 = p4;
            if (string2 != null) {
                q0 = this.G.q0(string2);
            }
        }
        Fragment p5;
        if ((p5 = q0) == null) {
            p5 = q0;
            if (id != -1) {
                p5 = this.G.p0(id);
            }
        }
        Fragment fragment = null;
        v v = null;
        Label_0596: {
            v k;
            StringBuilder sb2;
            String str;
            if (p5 == null) {
                final Fragment a = this.G.E0().a(context.getClassLoader(), string);
                a.mFromLayout = true;
                int mFragmentId;
                if (resourceId != 0) {
                    mFragmentId = resourceId;
                }
                else {
                    mFragmentId = id;
                }
                a.mFragmentId = mFragmentId;
                a.mContainerId = id;
                a.mTag = string2;
                a.mInLayout = true;
                final FragmentManager g = this.G;
                a.mFragmentManager = g;
                a.mHost = g.H0();
                a.onInflate(this.G.H0().f(), set, a.mSavedFragmentState);
                k = this.G.k(a);
                fragment = a;
                v = k;
                if (!FragmentManager.T0(2)) {
                    break Label_0596;
                }
                sb2 = new StringBuilder();
                sb2.append("Fragment ");
                sb2.append(a);
                str = " has been inflated via the <fragment> tag: id=0x";
                fragment = a;
            }
            else {
                if (p5.mInLayout) {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append(set.getPositionDescription());
                    sb3.append(": Duplicate id 0x");
                    sb3.append(Integer.toHexString(resourceId));
                    sb3.append(", tag ");
                    sb3.append(string2);
                    sb3.append(", or parent id 0x");
                    sb3.append(Integer.toHexString(id));
                    sb3.append(" with another fragment for ");
                    sb3.append(string);
                    throw new IllegalArgumentException(sb3.toString());
                }
                p5.mInLayout = true;
                final FragmentManager g2 = this.G;
                p5.mFragmentManager = g2;
                p5.mHost = g2.H0();
                p5.onInflate(this.G.H0().f(), set, p5.mSavedFragmentState);
                final v a2 = this.G.A(p5);
                fragment = p5;
                v = a2;
                if (!FragmentManager.T0(2)) {
                    break Label_0596;
                }
                sb2 = new StringBuilder();
                sb2.append("Retained Fragment ");
                sb2.append(p5);
                str = " has been re-attached via the <fragment> tag: id=0x";
                fragment = p5;
                k = a2;
            }
            sb2.append(str);
            sb2.append(Integer.toHexString(resourceId));
            Log.v("FragmentManager", sb2.toString());
            v = k;
        }
        fragment.mContainer = (ViewGroup)mView;
        v.m();
        v.j();
        mView = fragment.mView;
        if (mView != null) {
            if (resourceId != 0) {
                mView.setId(resourceId);
            }
            if (fragment.mView.getTag() == null) {
                fragment.mView.setTag((Object)string2);
            }
            fragment.mView.addOnAttachStateChangeListener((View$OnAttachStateChangeListener)new View$OnAttachStateChangeListener() {
                public void onViewAttachedToWindow(final View view) {
                    final Fragment k = v.k();
                    v.m();
                    i0.n((ViewGroup)k.mView.getParent(), j.this.G).j();
                }
                
                public void onViewDetachedFromWindow(final View view) {
                }
            });
            return fragment.mView;
        }
        final StringBuilder sb4 = new StringBuilder();
        sb4.append("Fragment ");
        sb4.append(string);
        sb4.append(" did not create a view.");
        throw new IllegalStateException(sb4.toString());
    }
    
    @k0
    public View onCreateView(@j0 final String s, @j0 final Context context, @j0 final AttributeSet set) {
        return this.onCreateView(null, s, context, set);
    }
}
