// 
// Decompiled by Procyon v0.5.36
// 

package androidx.preference;

import androidx.core.content.d;
import android.widget.TextView;
import android.util.TypedValue;
import android.os.Build$VERSION;
import androidx.core.content.res.i;
import android.util.AttributeSet;
import android.content.Context;

public class PreferenceCategory extends PreferenceGroup
{
    public PreferenceCategory(final Context context) {
        this(context, null);
    }
    
    public PreferenceCategory(final Context context, final AttributeSet set) {
        this(context, set, i.a(context, o.b.A3, 16842892));
    }
    
    public PreferenceCategory(final Context context, final AttributeSet set, final int n) {
        this(context, set, n, 0);
    }
    
    public PreferenceCategory(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
    }
    
    @Override
    public void G0(final n n) {
        super.G0(n);
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 28) {
            n.itemView.setAccessibilityHeading(true);
        }
        else if (sdk_INT < 21) {
            final TypedValue typedValue = new TypedValue();
            if (!this.l().getTheme().resolveAttribute(o.b.D0, typedValue, true)) {
                return;
            }
            final TextView textView = (TextView)n.b(16908310);
            if (textView == null) {
                return;
            }
            if (textView.getCurrentTextColor() != androidx.core.content.d.f(this.l(), o.d.j0)) {
                return;
            }
            textView.setTextColor(typedValue.data);
        }
    }
    
    @Deprecated
    @Override
    public void O0(final androidx.core.view.accessibility.d d) {
        super.O0(d);
        if (Build$VERSION.SDK_INT < 28) {
            final androidx.core.view.accessibility.d.c y = d.y();
            if (y == null) {
                return;
            }
            d.X0(androidx.core.view.accessibility.d.c.h(y.c(), y.d(), y.a(), y.b(), true, y.f()));
        }
    }
    
    @Override
    public boolean a2() {
        return super.q0() ^ true;
    }
    
    @Override
    public boolean q0() {
        return false;
    }
}
