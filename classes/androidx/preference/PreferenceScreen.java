// 
// Decompiled by Procyon v0.5.36
// 

package androidx.preference;

import androidx.annotation.t0;
import androidx.core.content.res.i;
import android.util.AttributeSet;
import android.content.Context;

public final class PreferenceScreen extends PreferenceGroup
{
    private boolean J0;
    
    @t0({ androidx.annotation.t0.a.I })
    public PreferenceScreen(final Context context, final AttributeSet set) {
        super(context, set, i.a(context, o.b.G3, 16842891));
        this.J0 = true;
    }
    
    public void H2(final boolean j0) {
        if (!this.s2()) {
            this.J0 = j0;
            return;
        }
        throw new IllegalStateException("Cannot change the usage of generated IDs while attached to the preference hierarchy");
    }
    
    @Override
    protected void I0() {
        if (this.y() == null && this.s() == null) {
            if (this.r2() != 0) {
                final l.b j = this.V().j();
                if (j != null) {
                    j.l(this);
                }
            }
        }
    }
    
    public boolean I2() {
        return this.J0;
    }
    
    @Override
    protected boolean t2() {
        return false;
    }
}
