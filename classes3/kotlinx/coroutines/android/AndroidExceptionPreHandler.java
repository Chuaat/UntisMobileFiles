// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.android;

import android.os.Build$VERSION;
import org.jetbrains.annotations.e;
import kotlin.coroutines.g;
import java.lang.reflect.Modifier;
import java.lang.reflect.Method;
import kotlin.coroutines.g$c;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlin.coroutines.a;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010" }, d2 = { "Lkotlinx/coroutines/android/AndroidExceptionPreHandler;", "Lkotlin/coroutines/a;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Ljava/lang/reflect/Method;", "preHandler", "Lkotlin/coroutines/g;", "context", "", "exception", "Lkotlin/j2;", "handleException", "", "_preHandler", "Ljava/lang/Object;", "<init>", "()V", "kotlinx-coroutines-android" }, k = 1, mv = { 1, 4, 2 })
@Keep
public final class AndroidExceptionPreHandler extends kotlin.coroutines.a implements CoroutineExceptionHandler
{
    private volatile Object _preHandler;
    
    public AndroidExceptionPreHandler() {
        super((g$c)CoroutineExceptionHandler.s);
        this._preHandler = this;
    }
    
    private final Method preHandler() {
        final Object preHandler = this._preHandler;
        if (preHandler != this) {
            return (Method)preHandler;
        }
        Object o = null;
        final boolean b = false;
        try {
            final Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", (Class<?>[])new Class[0]);
            int n = b ? 1 : 0;
            if (Modifier.isPublic(declaredMethod.getModifiers())) {
                final boolean static1 = Modifier.isStatic(declaredMethod.getModifiers());
                n = (b ? 1 : 0);
                if (static1) {
                    n = 1;
                }
            }
            if (n != 0) {
                o = declaredMethod;
            }
            return (Method)(this._preHandler = o);
        }
        finally {
            return (Method)(this._preHandler = o);
        }
    }
    
    public void handleException(@e final g g, @e final Throwable t) {
        final Thread currentThread = Thread.currentThread();
        if (Build$VERSION.SDK_INT >= 28) {
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, t);
        }
        else {
            final Method preHandler = this.preHandler();
            final Thread.UncaughtExceptionHandler uncaughtExceptionHandler = null;
            Object invoke;
            if (preHandler != null) {
                invoke = preHandler.invoke(null, new Object[0]);
            }
            else {
                invoke = null;
            }
            if (!(invoke instanceof Thread.UncaughtExceptionHandler)) {
                invoke = uncaughtExceptionHandler;
            }
            final Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = (Thread.UncaughtExceptionHandler)invoke;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(currentThread, t);
            }
        }
    }
}
