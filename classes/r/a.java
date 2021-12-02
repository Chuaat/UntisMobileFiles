// 
// Decompiled by Procyon v0.5.36
// 

package r;

import androidx.annotation.k0;
import android.annotation.TargetApi;
import android.annotation.SuppressLint;
import java.util.Iterator;
import android.os.LocaleList;
import java.util.Locale;
import android.os.Build$VERSION;
import android.telephony.mbms.ServiceInfo;
import androidx.annotation.j0;
import android.content.Context;

public final class a
{
    private a() {
    }
    
    @SuppressLint({ "BanTargetApiAnnotation" })
    @TargetApi(28)
    @k0
    public static CharSequence a(@j0 final Context context, @j0 final ServiceInfo serviceInfo) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        final CharSequence charSequence = null;
        if (sdk_INT < 28) {
            return null;
        }
        final LocaleList locales = context.getResources().getConfiguration().getLocales();
        final int size = serviceInfo.getNamedContentLocales().size();
        if (size == 0) {
            return null;
        }
        final String[] array = new String[size];
        int n = 0;
        final Iterator<Locale> iterator = (Iterator<Locale>)serviceInfo.getNamedContentLocales().iterator();
        while (iterator.hasNext()) {
            array[n] = iterator.next().toLanguageTag();
            ++n;
        }
        final Locale firstMatch = locales.getFirstMatch(array);
        CharSequence nameForLocale;
        if (firstMatch == null) {
            nameForLocale = charSequence;
        }
        else {
            nameForLocale = serviceInfo.getNameForLocale(firstMatch);
        }
        return nameForLocale;
    }
}
