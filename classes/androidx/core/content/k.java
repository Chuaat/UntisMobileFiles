// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.content;

import android.annotation.SuppressLint;
import kotlin.jvm.internal.k0;
import kotlin.j2;
import android.content.SharedPreferences$Editor;
import n6.l;
import org.jetbrains.annotations.e;
import android.content.SharedPreferences;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\b\u001a\u00020\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\b\u00f8\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t" }, d2 = { "Landroid/content/SharedPreferences;", "", "commit", "Lkotlin/Function1;", "Landroid/content/SharedPreferences$Editor;", "Lkotlin/j2;", "Lkotlin/s;", "action", "a", "core-ktx_release" }, k = 2, mv = { 1, 5, 1 })
public final class k
{
    @SuppressLint({ "ApplySharedPref" })
    public static final void a(@e final SharedPreferences sharedPreferences, final boolean b, @e final l<? super SharedPreferences$Editor, j2> l) {
        k0.p((Object)sharedPreferences, "<this>");
        k0.p((Object)l, "action");
        final SharedPreferences$Editor edit = sharedPreferences.edit();
        k0.o((Object)edit, "editor");
        l.invoke((Object)edit);
        if (b) {
            edit.commit();
        }
        else {
            edit.apply();
        }
    }
}
