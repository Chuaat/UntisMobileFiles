// 
// Decompiled by Procyon v0.5.36
// 

package androidx.preference;

import o6.d;
import java.util.Iterator;
import kotlin.sequences.m;
import org.jetbrains.annotations.f;
import n6.p;
import kotlin.j2;
import n6.l;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a(\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\n¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0015\u0010\t\u001a\u00020\u0000*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0086\u0002\u001a\u0015\u0010\f\u001a\u00020\u000b*\u00020\u00022\u0006\u0010\n\u001a\u00020\u0000H\u0086\u0002\u001a\u0015\u0010\u000e\u001a\u00020\r*\u00020\u00022\u0006\u0010\n\u001a\u00020\u0000H\u0086\n\u001a\u0015\u0010\u000f\u001a\u00020\r*\u00020\u00022\u0006\u0010\n\u001a\u00020\u0000H\u0086\n\u001a\r\u0010\u0010\u001a\u00020\u000b*\u00020\u0002H\u0086\b\u001a\r\u0010\u0011\u001a\u00020\u000b*\u00020\u0002H\u0086\b\u001a0\u0010\u0016\u001a\u00020\r*\u00020\u00022!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\r0\u0012H\u0086\b\u001aE\u0010\u0018\u001a\u00020\r*\u00020\u000226\u0010\u0015\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\r0\u0017H\u0086\b\u001a\u0013\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00000\u0019*\u00020\u0002H\u0086\u0002\"\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00000\u001b*\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\"\u0018\u0010!\u001a\u00020\u0007*\u00020\u00028\u00c6\u0002@\u0006¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\"" }, d2 = { "Landroidx/preference/Preference;", "T", "Landroidx/preference/PreferenceGroup;", "", "key", "e", "(Landroidx/preference/PreferenceGroup;Ljava/lang/CharSequence;)Landroidx/preference/Preference;", "", "index", "d", "preference", "", "a", "Lkotlin/j2;", "l", "k", "h", "i", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "action", "b", "Lkotlin/Function2;", "c", "", "j", "Lkotlin/sequences/m;", "f", "(Landroidx/preference/PreferenceGroup;)Lkotlin/sequences/m;", "children", "g", "(Landroidx/preference/PreferenceGroup;)I", "size", "preference-ktx_release" }, k = 2, mv = { 1, 4, 0 })
public final class j
{
    public static final boolean a(@e final PreferenceGroup preferenceGroup, @e final Preference preference) {
        k0.q((Object)preferenceGroup, "$this$contains");
        k0.q((Object)preference, "preference");
        for (int r2 = preferenceGroup.r2(), i = 0; i < r2; ++i) {
            if (k0.g((Object)preferenceGroup.o2(i), (Object)preference)) {
                return true;
            }
        }
        return false;
    }
    
    public static final void b(@e final PreferenceGroup preferenceGroup, @e final l<? super Preference, j2> l) {
        k0.q((Object)preferenceGroup, "$this$forEach");
        k0.q((Object)l, "action");
        for (int r2 = preferenceGroup.r2(), i = 0; i < r2; ++i) {
            l.invoke((Object)d(preferenceGroup, i));
        }
    }
    
    public static final void c(@e final PreferenceGroup preferenceGroup, @e final p<? super Integer, ? super Preference, j2> p2) {
        k0.q((Object)preferenceGroup, "$this$forEachIndexed");
        k0.q((Object)p2, "action");
        for (int r2 = preferenceGroup.r2(), i = 0; i < r2; ++i) {
            p2.invoke((Object)i, (Object)d(preferenceGroup, i));
        }
    }
    
    @e
    public static final Preference d(@e final PreferenceGroup preferenceGroup, final int i) {
        k0.q((Object)preferenceGroup, "$this$get");
        final Preference o2 = preferenceGroup.o2(i);
        if (o2 != null) {
            return o2;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Index: ");
        sb.append(i);
        sb.append(", Size: ");
        sb.append(preferenceGroup.r2());
        throw new IndexOutOfBoundsException(sb.toString());
    }
    
    @f
    public static final <T extends Preference> T e(@e final PreferenceGroup preferenceGroup, @e final CharSequence charSequence) {
        k0.q((Object)preferenceGroup, "$this$get");
        k0.q((Object)charSequence, "key");
        return preferenceGroup.l2(charSequence);
    }
    
    @e
    public static final m<Preference> f(@e final PreferenceGroup preferenceGroup) {
        k0.q((Object)preferenceGroup, "$this$children");
        return (m<Preference>)new m<Preference>() {
            @e
            public Iterator<Preference> iterator() {
                return j.j(preferenceGroup);
            }
        };
    }
    
    public static final int g(@e final PreferenceGroup preferenceGroup) {
        k0.q((Object)preferenceGroup, "$this$size");
        return preferenceGroup.r2();
    }
    
    public static final boolean h(@e final PreferenceGroup preferenceGroup) {
        k0.q((Object)preferenceGroup, "$this$isEmpty");
        return preferenceGroup.r2() == 0;
    }
    
    public static final boolean i(@e final PreferenceGroup preferenceGroup) {
        k0.q((Object)preferenceGroup, "$this$isNotEmpty");
        return preferenceGroup.r2() != 0;
    }
    
    @e
    public static final Iterator<Preference> j(@e final PreferenceGroup preferenceGroup) {
        k0.q((Object)preferenceGroup, "$this$iterator");
        return new Iterator<Preference>() {
            private int G;
            
            @e
            public Preference a() {
                final Preference o2 = preferenceGroup.o2(this.G++);
                if (o2 != null) {
                    return o2;
                }
                throw new IndexOutOfBoundsException();
            }
            
            @Override
            public boolean hasNext() {
                return this.G < preferenceGroup.r2();
            }
            
            @Override
            public void remove() {
                final PreferenceGroup h = preferenceGroup;
                final int g = this.G - 1;
                this.G = g;
                h.y2(h.o2(g));
            }
        };
    }
    
    public static final void k(@e final PreferenceGroup preferenceGroup, @e final Preference preference) {
        k0.q((Object)preferenceGroup, "$this$minusAssign");
        k0.q((Object)preference, "preference");
        preferenceGroup.y2(preference);
    }
    
    public static final void l(@e final PreferenceGroup preferenceGroup, @e final Preference preference) {
        k0.q((Object)preferenceGroup, "$this$plusAssign");
        k0.q((Object)preference, "preference");
        preferenceGroup.j2(preference);
    }
}
