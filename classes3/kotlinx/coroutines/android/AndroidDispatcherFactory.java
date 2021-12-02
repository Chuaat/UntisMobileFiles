// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.android;

import org.jetbrains.annotations.f;
import kotlinx.coroutines.w2;
import kotlin.jvm.internal.w;
import android.os.Looper;
import org.jetbrains.annotations.e;
import java.util.List;
import kotlin.Metadata;
import kotlinx.coroutines.internal.MainDispatcherFactory;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002H\u0016J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\u0016\u0010\u000b\u001a\u00020\b8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000e" }, d2 = { "Lkotlinx/coroutines/android/AndroidDispatcherFactory;", "Lkotlinx/coroutines/internal/MainDispatcherFactory;", "", "allFactories", "Lkotlinx/coroutines/android/a;", "createDispatcher", "", "hintOnError", "", "getLoadPriority", "()I", "loadPriority", "<init>", "()V", "kotlinx-coroutines-android" }, k = 1, mv = { 1, 4, 2 })
public final class AndroidDispatcherFactory implements MainDispatcherFactory
{
    @e
    @Override
    public kotlinx.coroutines.android.a createDispatcher(@e final List<? extends MainDispatcherFactory> list) {
        return new kotlinx.coroutines.android.a(c.c(Looper.getMainLooper(), true), null, 2, null);
    }
    
    @Override
    public int getLoadPriority() {
        return 1073741823;
    }
    
    @f
    @Override
    public String hintOnError() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }
}
