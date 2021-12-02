// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.content;

import android.os.Build$VERSION;
import android.content.Intent;
import androidx.annotation.j0;
import android.annotation.SuppressLint;

public final class f
{
    @SuppressLint({ "ActionValue" })
    public static final String a = "android.intent.action.CREATE_REMINDER";
    public static final String b = "android.intent.extra.HTML_TEXT";
    public static final String c = "android.intent.extra.START_PLAYBACK";
    @SuppressLint({ "ActionValue" })
    public static final String d = "android.intent.extra.TIME";
    public static final String e = "android.intent.category.LEANBACK_LAUNCHER";
    
    private f() {
    }
    
    @j0
    public static Intent a(@j0 final String s, @j0 final String s2) {
        if (Build$VERSION.SDK_INT >= 15) {
            return Intent.makeMainSelectorActivity(s, s2);
        }
        final Intent intent = new Intent(s);
        intent.addCategory(s2);
        return intent;
    }
}
