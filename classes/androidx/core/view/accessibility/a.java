// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.view.accessibility;

import android.os.Bundle;
import androidx.annotation.j0;
import android.view.View;
import androidx.annotation.t0;
import android.text.style.ClickableSpan;

public final class a extends ClickableSpan
{
    @t0({ t0.a.I })
    public static final String J = "ACCESSIBILITY_CLICKABLE_SPAN_ID";
    private final int G;
    private final d H;
    private final int I;
    
    @t0({ t0.a.I })
    public a(final int g, final d h, final int i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    public void onClick(@j0 final View view) {
        final Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.G);
        this.H.G0(this.I, bundle);
    }
}
