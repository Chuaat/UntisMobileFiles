// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.view;

import androidx.annotation.t0;
import androidx.annotation.k0;
import android.view.DragAndDropPermissions;
import android.os.Build$VERSION;
import android.view.DragEvent;
import android.app.Activity;

public final class f
{
    private Object a;
    
    private f(final Object a) {
        this.a = a;
    }
    
    @k0
    @t0({ t0.a.I })
    public static f b(final Activity activity, final DragEvent dragEvent) {
        if (Build$VERSION.SDK_INT >= 24) {
            final DragAndDropPermissions requestDragAndDropPermissions = activity.requestDragAndDropPermissions(dragEvent);
            if (requestDragAndDropPermissions != null) {
                return new f(requestDragAndDropPermissions);
            }
        }
        return null;
    }
    
    public void a() {
        if (Build$VERSION.SDK_INT >= 24) {
            ((DragAndDropPermissions)this.a).release();
        }
    }
}
