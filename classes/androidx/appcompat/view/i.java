// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.view;

import android.view.ActionMode$Callback;
import android.view.WindowManager$LayoutParams;
import android.view.SearchEvent;
import android.view.KeyboardShortcutGroup;
import java.util.List;
import androidx.annotation.p0;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.annotation.t0;
import android.view.Window$Callback;

@t0({ t0.a.I })
public class i implements Window$Callback
{
    final Window$Callback G;
    
    public i(final Window$Callback g) {
        if (g != null) {
            this.G = g;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }
    
    public final Window$Callback a() {
        return this.G;
    }
    
    public boolean dispatchGenericMotionEvent(final MotionEvent motionEvent) {
        return this.G.dispatchGenericMotionEvent(motionEvent);
    }
    
    public boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        return this.G.dispatchKeyEvent(keyEvent);
    }
    
    public boolean dispatchKeyShortcutEvent(final KeyEvent keyEvent) {
        return this.G.dispatchKeyShortcutEvent(keyEvent);
    }
    
    public boolean dispatchPopulateAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        return this.G.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }
    
    public boolean dispatchTouchEvent(final MotionEvent motionEvent) {
        return this.G.dispatchTouchEvent(motionEvent);
    }
    
    public boolean dispatchTrackballEvent(final MotionEvent motionEvent) {
        return this.G.dispatchTrackballEvent(motionEvent);
    }
    
    public void onActionModeFinished(final ActionMode actionMode) {
        this.G.onActionModeFinished(actionMode);
    }
    
    public void onActionModeStarted(final ActionMode actionMode) {
        this.G.onActionModeStarted(actionMode);
    }
    
    public void onAttachedToWindow() {
        this.G.onAttachedToWindow();
    }
    
    public void onContentChanged() {
        this.G.onContentChanged();
    }
    
    public boolean onCreatePanelMenu(final int n, final Menu menu) {
        return this.G.onCreatePanelMenu(n, menu);
    }
    
    public View onCreatePanelView(final int n) {
        return this.G.onCreatePanelView(n);
    }
    
    public void onDetachedFromWindow() {
        this.G.onDetachedFromWindow();
    }
    
    public boolean onMenuItemSelected(final int n, final MenuItem menuItem) {
        return this.G.onMenuItemSelected(n, menuItem);
    }
    
    public boolean onMenuOpened(final int n, final Menu menu) {
        return this.G.onMenuOpened(n, menu);
    }
    
    public void onPanelClosed(final int n, final Menu menu) {
        this.G.onPanelClosed(n, menu);
    }
    
    @p0(26)
    public void onPointerCaptureChanged(final boolean b) {
        this.G.onPointerCaptureChanged(b);
    }
    
    public boolean onPreparePanel(final int n, final View view, final Menu menu) {
        return this.G.onPreparePanel(n, view, menu);
    }
    
    @p0(24)
    public void onProvideKeyboardShortcuts(final List<KeyboardShortcutGroup> list, final Menu menu, final int n) {
        this.G.onProvideKeyboardShortcuts((List)list, menu, n);
    }
    
    public boolean onSearchRequested() {
        return this.G.onSearchRequested();
    }
    
    @p0(23)
    public boolean onSearchRequested(final SearchEvent searchEvent) {
        return this.G.onSearchRequested(searchEvent);
    }
    
    public void onWindowAttributesChanged(final WindowManager$LayoutParams windowManager$LayoutParams) {
        this.G.onWindowAttributesChanged(windowManager$LayoutParams);
    }
    
    public void onWindowFocusChanged(final boolean b) {
        this.G.onWindowFocusChanged(b);
    }
    
    public ActionMode onWindowStartingActionMode(final ActionMode$Callback actionMode$Callback) {
        return this.G.onWindowStartingActionMode(actionMode$Callback);
    }
    
    @p0(23)
    public ActionMode onWindowStartingActionMode(final ActionMode$Callback actionMode$Callback, final int n) {
        return this.G.onWindowStartingActionMode(actionMode$Callback, n);
    }
}
