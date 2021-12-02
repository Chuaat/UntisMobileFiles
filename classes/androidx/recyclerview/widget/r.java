// 
// Decompiled by Procyon v0.5.36
// 

package androidx.recyclerview.widget;

import android.view.View;

class r
{
    static final int j = -1;
    static final int k = 1;
    static final int l = Integer.MIN_VALUE;
    static final int m = -1;
    static final int n = 1;
    boolean a;
    int b;
    int c;
    int d;
    int e;
    int f;
    int g;
    boolean h;
    boolean i;
    
    r() {
        this.a = true;
        this.f = 0;
        this.g = 0;
    }
    
    boolean a(final RecyclerView.d0 d0) {
        final int c = this.c;
        return c >= 0 && c < d0.d();
    }
    
    View b(final RecyclerView.x x) {
        final View p = x.p(this.c);
        this.c += this.d;
        return p;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("LayoutState{mAvailable=");
        sb.append(this.b);
        sb.append(", mCurrentPosition=");
        sb.append(this.c);
        sb.append(", mItemDirection=");
        sb.append(this.d);
        sb.append(", mLayoutDirection=");
        sb.append(this.e);
        sb.append(", mStartLine=");
        sb.append(this.f);
        sb.append(", mEndLine=");
        sb.append(this.g);
        sb.append('}');
        return sb.toString();
    }
}
