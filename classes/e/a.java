// 
// Decompiled by Procyon v0.5.36
// 

package e;

import android.graphics.Rect;
import android.view.View;
import android.content.Context;
import java.util.Locale;
import androidx.annotation.t0;
import android.text.method.TransformationMethod;

@t0({ t0.a.I })
public class a implements TransformationMethod
{
    private Locale G;
    
    public a(final Context context) {
        this.G = context.getResources().getConfiguration().locale;
    }
    
    public CharSequence getTransformation(final CharSequence charSequence, final View view) {
        String upperCase;
        if (charSequence != null) {
            upperCase = charSequence.toString().toUpperCase(this.G);
        }
        else {
            upperCase = null;
        }
        return upperCase;
    }
    
    public void onFocusChanged(final View view, final CharSequence charSequence, final boolean b, final int n, final Rect rect) {
    }
}
