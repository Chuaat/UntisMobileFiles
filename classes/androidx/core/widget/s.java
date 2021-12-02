// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.widget;

import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import android.text.TextWatcher;
import android.text.Editable;
import n6.l;
import kotlin.j2;
import n6.r;
import org.jetbrains.annotations.e;
import android.widget.TextView;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001av\u0010\r\u001a\u00020\f*\u00020\u00002d\b\u0004\u0010\u000b\u001a^\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0001H\u0086\b\u00f8\u0001\u0000\u001av\u0010\u000f\u001a\u00020\f*\u00020\u00002d\b\u0004\u0010\u000b\u001a^\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\n0\u0001H\u0086\b\u00f8\u0001\u0000\u001a7\u0010\u0012\u001a\u00020\f*\u00020\u00002%\b\u0004\u0010\u000b\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\n0\u0010H\u0086\b\u00f8\u0001\u0000\u001a\u0083\u0002\u0010\u0016\u001a\u00020\f*\u00020\u00002d\b\u0006\u0010\u0013\u001a^\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u00012d\b\u0006\u0010\u0014\u001a^\u0012\u0015\u0012\u0013\u0018\u00010\u0002¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0007\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\n0\u00012%\b\u0006\u0010\u0015\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u0011¢\u0006\f\b\u0003\u0012\b\b\u0004\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020\n0\u0010H\u0086\b\u00f8\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0017" }, d2 = { "Landroid/widget/TextView;", "Lkotlin/Function4;", "", "Lkotlin/t0;", "name", "text", "", "start", "count", "after", "Lkotlin/j2;", "action", "Landroid/text/TextWatcher;", "d", "before", "e", "Lkotlin/Function1;", "Landroid/text/Editable;", "c", "beforeTextChanged", "onTextChanged", "afterTextChanged", "a", "core-ktx_release" }, k = 2, mv = { 1, 5, 1 })
public final class s
{
    @e
    public static final TextWatcher a(@e final TextView textView, @e final r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, j2> r, @e final r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, j2> r2, @e final l<? super Editable, j2> l) {
        k0.p((Object)textView, "<this>");
        k0.p((Object)r, "beforeTextChanged");
        k0.p((Object)r2, "onTextChanged");
        k0.p((Object)l, "afterTextChanged");
        final TextWatcher textWatcher = (TextWatcher)new TextWatcher() {
            final /* synthetic */ l<Editable, j2> G;
            final /* synthetic */ r<CharSequence, Integer, Integer, Integer, j2> H;
            final /* synthetic */ r<CharSequence, Integer, Integer, Integer, j2> I;
            
            public void afterTextChanged(@f final Editable editable) {
                this.G.invoke((Object)editable);
            }
            
            public void beforeTextChanged(@f final CharSequence charSequence, final int i, final int j, final int k) {
                this.H.I((Object)charSequence, (Object)i, (Object)j, (Object)k);
            }
            
            public void onTextChanged(@f final CharSequence charSequence, final int i, final int j, final int k) {
                this.I.I((Object)charSequence, (Object)i, (Object)j, (Object)k);
            }
        };
        textView.addTextChangedListener((TextWatcher)textWatcher);
        return (TextWatcher)textWatcher;
    }
    
    @e
    public static final TextWatcher c(@e final TextView textView, @e final l<? super Editable, j2> l) {
        k0.p((Object)textView, "<this>");
        k0.p((Object)l, "action");
        final TextWatcher textWatcher = (TextWatcher)new TextWatcher() {
            public void afterTextChanged(@f final Editable editable) {
                l.invoke((Object)editable);
            }
            
            public void beforeTextChanged(@f final CharSequence charSequence, final int n, final int n2, final int n3) {
            }
            
            public void onTextChanged(@f final CharSequence charSequence, final int n, final int n2, final int n3) {
            }
        };
        textView.addTextChangedListener((TextWatcher)textWatcher);
        return (TextWatcher)textWatcher;
    }
    
    @e
    public static final TextWatcher d(@e final TextView textView, @e final r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, j2> r) {
        k0.p((Object)textView, "<this>");
        k0.p((Object)r, "action");
        final TextWatcher textWatcher = (TextWatcher)new TextWatcher() {
            public void afterTextChanged(@f final Editable editable) {
            }
            
            public void beforeTextChanged(@f final CharSequence charSequence, final int i, final int j, final int k) {
                r.I((Object)charSequence, (Object)i, (Object)j, (Object)k);
            }
            
            public void onTextChanged(@f final CharSequence charSequence, final int n, final int n2, final int n3) {
            }
        };
        textView.addTextChangedListener((TextWatcher)textWatcher);
        return (TextWatcher)textWatcher;
    }
    
    @e
    public static final TextWatcher e(@e final TextView textView, @e final r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, j2> r) {
        k0.p((Object)textView, "<this>");
        k0.p((Object)r, "action");
        final TextWatcher textWatcher = (TextWatcher)new TextWatcher() {
            public void afterTextChanged(@f final Editable editable) {
            }
            
            public void beforeTextChanged(@f final CharSequence charSequence, final int n, final int n2, final int n3) {
            }
            
            public void onTextChanged(@f final CharSequence charSequence, final int i, final int j, final int k) {
                r.I((Object)charSequence, (Object)i, (Object)j, (Object)k);
            }
        };
        textView.addTextChangedListener((TextWatcher)textWatcher);
        return (TextWatcher)textWatcher;
    }
}
