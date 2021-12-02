// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils;

import org.jetbrains.annotations.f;
import android.text.Editable;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.j2;
import n6.l;
import kotlin.Metadata;
import android.text.TextWatcher;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B,\u0012#\b\u0002\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u00040\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J*\u0010\u000b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016J*\u0010\f\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\u0014" }, d2 = { "Lcom/untis/mobile/utils/n0;", "Landroid/text/TextWatcher;", "Landroid/text/Editable;", "p0", "Lkotlin/j2;", "afterTextChanged", "", "", "p1", "p2", "p3", "beforeTextChanged", "onTextChanged", "Lkotlin/Function1;", "", "Lkotlin/t0;", "name", "text", "<init>", "(Ln6/l;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class n0 implements TextWatcher
{
    @e
    private final l<String, j2> G;
    
    public n0() {
        this(null, 1, null);
    }
    
    public n0(@e final l<? super String, j2> g) {
        k0.p(g, "onTextChanged");
        this.G = (l<String, j2>)g;
    }
    
    public void afterTextChanged(@f final Editable editable) {
    }
    
    public void beforeTextChanged(@f final CharSequence charSequence, final int n, final int n2, final int n3) {
    }
    
    public void onTextChanged(@f final CharSequence charSequence, final int n, final int n2, final int n3) {
        final l<String, j2> g = this.G;
        final String s = "";
        String string;
        if (charSequence == null) {
            string = s;
        }
        else {
            string = charSequence.toString();
            if (string == null) {
                string = s;
            }
        }
        g.invoke(string);
    }
}
