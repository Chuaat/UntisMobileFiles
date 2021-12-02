// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide;

import com.bumptech.glide.request.transition.j;
import com.bumptech.glide.request.transition.g;
import androidx.annotation.j0;

public final class a<TranscodeType> extends m<a<TranscodeType>, TranscodeType>
{
    @j0
    public static <TranscodeType> a<TranscodeType> j(final int n) {
        return (a<TranscodeType>)new a().f(n);
    }
    
    @j0
    public static <TranscodeType> a<TranscodeType> l(@j0 final g<? super TranscodeType> g) {
        return (a<TranscodeType>)new a().g((g<? super Object>)g);
    }
    
    @j0
    public static <TranscodeType> a<TranscodeType> m(@j0 final j.a a) {
        return (a<TranscodeType>)new a().i(a);
    }
    
    @j0
    public static <TranscodeType> a<TranscodeType> n() {
        return (a<TranscodeType>)new a().b();
    }
}
