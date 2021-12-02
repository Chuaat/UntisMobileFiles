// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.app;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemSelectedListener;

class l implements AdapterView$OnItemSelectedListener
{
    private final a.e G;
    
    public l(final a.e g) {
        this.G = g;
    }
    
    public void onItemSelected(final AdapterView<?> adapterView, final View view, final int n, final long n2) {
        final a.e g = this.G;
        if (g != null) {
            g.a(n, n2);
        }
    }
    
    public void onNothingSelected(final AdapterView<?> adapterView) {
    }
}
