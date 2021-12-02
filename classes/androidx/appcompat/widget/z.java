// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

import android.view.Window$Callback;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.appcompat.view.menu.n;
import android.view.Menu;
import androidx.annotation.t0;

@t0({ t0.a.I })
public interface z
{
    void c(final Menu p0, final n.a p1);
    
    boolean d();
    
    void e();
    
    boolean f();
    
    boolean g();
    
    CharSequence getTitle();
    
    boolean h();
    
    boolean i();
    
    boolean j();
    
    boolean k();
    
    void l(final SparseArray<Parcelable> p0);
    
    void m(final int p0);
    
    void n();
    
    void o(final SparseArray<Parcelable> p0);
    
    void setIcon(final int p0);
    
    void setIcon(final Drawable p0);
    
    void setLogo(final int p0);
    
    void setUiOptions(final int p0);
    
    void setWindowCallback(final Window$Callback p0);
    
    void setWindowTitle(final CharSequence p0);
}
