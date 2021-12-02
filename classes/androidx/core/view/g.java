// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.view;

import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View$OnTouchListener;
import android.view.View$OnLongClickListener;
import android.view.View;

public class g
{
    private final View a;
    private final c b;
    private int c;
    private int d;
    private boolean e;
    private final View$OnLongClickListener f;
    private final View$OnTouchListener g;
    
    public g(final View a, final c b) {
        this.f = (View$OnLongClickListener)new View$OnLongClickListener() {
            public boolean onLongClick(final View view) {
                return androidx.core.view.g.this.d(view);
            }
        };
        this.g = (View$OnTouchListener)new View$OnTouchListener() {
            public boolean onTouch(final View view, final MotionEvent motionEvent) {
                return androidx.core.view.g.this.e(view, motionEvent);
            }
        };
        this.a = a;
        this.b = b;
    }
    
    public void a() {
        this.a.setOnLongClickListener(this.f);
        this.a.setOnTouchListener(this.g);
    }
    
    public void b() {
        this.a.setOnLongClickListener((View$OnLongClickListener)null);
        this.a.setOnTouchListener((View$OnTouchListener)null);
    }
    
    public void c(final Point point) {
        point.set(this.c, this.d);
    }
    
    public boolean d(final View view) {
        return this.b.a(view, this);
    }
    
    public boolean e(final View view, final MotionEvent motionEvent) {
        final int n = (int)motionEvent.getX();
        final int n2 = (int)motionEvent.getY();
        final int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                }
                else {
                    if (!r.l(motionEvent, 8194)) {
                        return false;
                    }
                    if ((motionEvent.getButtonState() & 0x1) == 0x0) {
                        return false;
                    }
                    if (this.e) {
                        return false;
                    }
                    if (this.c == n && this.d == n2) {
                        return false;
                    }
                    this.c = n;
                    this.d = n2;
                    return this.e = this.b.a(view, this);
                }
            }
            this.e = false;
        }
        else {
            this.c = n;
            this.d = n2;
        }
        return false;
    }
    
    public interface c
    {
        boolean a(final View p0, final g p1);
    }
}
