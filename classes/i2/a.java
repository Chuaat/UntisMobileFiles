// 
// Decompiled by Procyon v0.5.36
// 

package i2;

import androidx.annotation.k0;
import android.database.CursorWindow;
import androidx.annotation.RecentlyNonNull;
import android.database.Cursor;
import android.database.AbstractWindowedCursor;
import android.database.CrossProcessCursor;
import android.database.CursorWrapper;

@f2.a
public class a extends CursorWrapper implements CrossProcessCursor
{
    private AbstractWindowedCursor G;
    
    @f2.a
    public a(@RecentlyNonNull Cursor wrappedCursor) {
        super(wrappedCursor);
        for (int n = 0; n < 10 && wrappedCursor instanceof CursorWrapper; wrappedCursor = ((CursorWrapper)wrappedCursor).getWrappedCursor(), ++n) {}
        if (!(wrappedCursor instanceof AbstractWindowedCursor)) {
            final String name = wrappedCursor.getClass().getName();
            String concat;
            if (name.length() != 0) {
                concat = "Unknown type: ".concat(name);
            }
            else {
                concat = new String("Unknown type: ");
            }
            throw new IllegalArgumentException(concat);
        }
        this.G = (AbstractWindowedCursor)wrappedCursor;
    }
    
    @f2.a
    public void a(@k0 final CursorWindow window) {
        this.G.setWindow(window);
    }
    
    @f2.a
    public void fillWindow(@RecentlyNonNull final int n, @RecentlyNonNull final CursorWindow cursorWindow) {
        this.G.fillWindow(n, cursorWindow);
    }
    
    @RecentlyNonNull
    @f2.a
    public CursorWindow getWindow() {
        return this.G.getWindow();
    }
    
    @RecentlyNonNull
    public boolean onMove(@RecentlyNonNull final int n, @RecentlyNonNull final int n2) {
        return this.G.onMove(n, n2);
    }
}
