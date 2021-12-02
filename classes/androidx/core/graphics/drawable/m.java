// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.graphics.drawable;

import android.os.Build$VERSION;
import androidx.annotation.j0;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.annotation.k0;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable$ConstantState;

final class m extends Drawable$ConstantState
{
    int a;
    Drawable$ConstantState b;
    ColorStateList c;
    PorterDuff$Mode d;
    
    m(@k0 final m m) {
        this.c = null;
        this.d = k.M;
        if (m != null) {
            this.a = m.a;
            this.b = m.b;
            this.c = m.c;
            this.d = m.d;
        }
    }
    
    boolean a() {
        return this.b != null;
    }
    
    public int getChangingConfigurations() {
        final int a = this.a;
        final Drawable$ConstantState b = this.b;
        int changingConfigurations;
        if (b != null) {
            changingConfigurations = b.getChangingConfigurations();
        }
        else {
            changingConfigurations = 0;
        }
        return a | changingConfigurations;
    }
    
    @j0
    public Drawable newDrawable() {
        return this.newDrawable(null);
    }
    
    @j0
    public Drawable newDrawable(@k0 final Resources resources) {
        if (Build$VERSION.SDK_INT >= 21) {
            return new l(this, resources);
        }
        return new k(this, resources);
    }
}
