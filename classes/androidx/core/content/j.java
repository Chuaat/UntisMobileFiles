// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.content;

import androidx.annotation.j0;
import android.content.SharedPreferences$Editor;

@Deprecated
public final class j
{
    private j() {
    }
    
    @Deprecated
    public static final class a
    {
        private static j.a b;
        private final j.a.a a;
        
        private a() {
            this.a = new j.a.a();
        }
        
        @Deprecated
        public static j.a b() {
            if (j.a.b == null) {
                j.a.b = new j.a();
            }
            return j.a.b;
        }
        
        @Deprecated
        public void a(@j0 final SharedPreferences$Editor sharedPreferences$Editor) {
            this.a.a(sharedPreferences$Editor);
        }
        
        private static class a
        {
            a() {
            }
            
            public void a(@j0 final SharedPreferences$Editor sharedPreferences$Editor) {
                try {
                    sharedPreferences$Editor.apply();
                }
                catch (AbstractMethodError abstractMethodError) {
                    sharedPreferences$Editor.commit();
                }
            }
        }
    }
}
