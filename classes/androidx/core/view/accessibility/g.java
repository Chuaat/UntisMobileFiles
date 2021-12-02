// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.view.accessibility;

import androidx.annotation.t0;
import android.os.Bundle;
import androidx.annotation.k0;
import androidx.annotation.j0;
import android.view.View;

public interface g
{
    boolean a(@j0 final View p0, @k0 final a p1);
    
    public abstract static class a
    {
        Bundle a;
        
        @t0({ t0.a.I })
        public void a(final Bundle a) {
            this.a = a;
        }
    }
    
    public static final class b extends a
    {
        public boolean b() {
            return super.a.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        }
        
        public int c() {
            return super.a.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        }
    }
    
    public static final class c extends a
    {
        public String b() {
            return super.a.getString("ACTION_ARGUMENT_HTML_ELEMENT_STRING");
        }
    }
    
    public static final class d extends a
    {
        public int b() {
            return super.a.getInt("ACTION_ARGUMENT_MOVE_WINDOW_X");
        }
        
        public int c() {
            return super.a.getInt("ACTION_ARGUMENT_MOVE_WINDOW_Y");
        }
    }
    
    public static final class e extends a
    {
        public int b() {
            return super.a.getInt("android.view.accessibility.action.ARGUMENT_COLUMN_INT");
        }
        
        public int c() {
            return super.a.getInt("android.view.accessibility.action.ARGUMENT_ROW_INT");
        }
    }
    
    public static final class f extends a
    {
        public float b() {
            return super.a.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE");
        }
    }
    
    public static final class g extends a
    {
        public int b() {
            return super.a.getInt("ACTION_ARGUMENT_SELECTION_END_INT");
        }
        
        public int c() {
            return super.a.getInt("ACTION_ARGUMENT_SELECTION_START_INT");
        }
    }
    
    public static final class h extends a
    {
        public CharSequence b() {
            return super.a.getCharSequence("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
        }
    }
}
