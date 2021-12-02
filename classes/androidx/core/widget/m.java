// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.widget;

import android.view.View;
import androidx.annotation.j0;
import android.widget.ListView;

public class m extends a
{
    private final ListView o0;
    
    public m(@j0 final ListView o0) {
        super((View)o0);
        this.o0 = o0;
    }
    
    @Override
    public boolean a(final int n) {
        return false;
    }
    
    @Override
    public boolean b(final int n) {
        final ListView o0 = this.o0;
        final int count = o0.getCount();
        if (count == 0) {
            return false;
        }
        final int childCount = o0.getChildCount();
        final int firstVisiblePosition = o0.getFirstVisiblePosition();
        if (n > 0) {
            if (firstVisiblePosition + childCount >= count && o0.getChildAt(childCount - 1).getBottom() <= o0.getHeight()) {
                return false;
            }
        }
        else {
            if (n >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && o0.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public void l(final int n, final int n2) {
        n.b(this.o0, n2);
    }
}
