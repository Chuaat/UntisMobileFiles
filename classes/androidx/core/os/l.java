// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.os;

import androidx.annotation.k0;
import androidx.annotation.j0;
import java.util.Locale;
import android.os.LocaleList;
import androidx.annotation.p0;

@p0(24)
final class l implements k
{
    private final LocaleList a;
    
    l(final LocaleList a) {
        this.a = a;
    }
    
    @Override
    public int a(final Locale locale) {
        return this.a.indexOf(locale);
    }
    
    @Override
    public String b() {
        return this.a.toLanguageTags();
    }
    
    @Override
    public Object c() {
        return this.a;
    }
    
    @k0
    @Override
    public Locale d(@j0 final String[] array) {
        return this.a.getFirstMatch(array);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this.a.equals(((k)o).c());
    }
    
    @Override
    public Locale get(final int n) {
        return this.a.get(n);
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public boolean isEmpty() {
        return this.a.isEmpty();
    }
    
    @Override
    public int size() {
        return this.a.size();
    }
    
    @Override
    public String toString() {
        return this.a.toString();
    }
}
