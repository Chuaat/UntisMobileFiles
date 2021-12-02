// 
// Decompiled by Procyon v0.5.36
// 

package androidx.preference;

import android.util.AttributeSet;
import android.content.Context;
import androidx.annotation.t0;
import android.widget.LinearLayout;

@t0({ t0.a.I })
public class UnPressableLinearLayout extends LinearLayout
{
    public UnPressableLinearLayout(final Context context) {
        this(context, null);
    }
    
    public UnPressableLinearLayout(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    protected void dispatchSetPressed(final boolean b) {
    }
}
