// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.os;

import android.os.Message;
import androidx.annotation.k0;
import androidx.annotation.p0;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import android.os.Handler$Callback;
import android.os.Build$VERSION;
import android.os.Handler;
import androidx.annotation.j0;
import android.os.Looper;

public final class g
{
    private static final String a = "HandlerCompat";
    
    private g() {
    }
    
    @j0
    public static Handler a(@j0 final Looper looper) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 28) {
            return g.a.a(looper);
        }
        if (sdk_INT >= 17) {
            Handler handler = null;
            try {
                handler = Handler.class.getDeclaredConstructor(Looper.class, Handler$Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
                return handler;
            }
            catch (InvocationTargetException ex) {
                final Throwable cause = ex.getCause();
                if (cause instanceof RuntimeException) {
                    throw (RuntimeException)cause;
                }
                if (cause instanceof Error) {
                    throw (Error)cause;
                }
                throw new RuntimeException(cause);
            }
            catch (NoSuchMethodException handler) {}
            catch (InstantiationException handler) {}
            catch (IllegalAccessException ex2) {}
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", (Throwable)handler);
        }
        return new Handler(looper);
    }
    
    @j0
    public static Handler b(@j0 final Looper looper, @j0 final Handler$Callback handler$Callback) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 28) {
            return g.a.b(looper, handler$Callback);
        }
        if (sdk_INT >= 17) {
            Handler handler = null;
            try {
                handler = Handler.class.getDeclaredConstructor(Looper.class, Handler$Callback.class, Boolean.TYPE).newInstance(looper, handler$Callback, Boolean.TRUE);
                return handler;
            }
            catch (InvocationTargetException ex) {
                final Throwable cause = ex.getCause();
                if (cause instanceof RuntimeException) {
                    throw (RuntimeException)cause;
                }
                if (cause instanceof Error) {
                    throw (Error)cause;
                }
                throw new RuntimeException(cause);
            }
            catch (NoSuchMethodException handler) {}
            catch (InstantiationException handler) {}
            catch (IllegalAccessException ex2) {}
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", (Throwable)handler);
        }
        return new Handler(looper, handler$Callback);
    }
    
    @p0(16)
    public static boolean c(@j0 final Handler obj, @j0 final Runnable runnable) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 29) {
            return b.a(obj, runnable);
        }
        if (sdk_INT >= 16) {
            try {
                return (boolean)Handler.class.getMethod("hasCallbacks", Runnable.class).invoke(obj, runnable);
            }
            catch (NullPointerException ex) {
                throw new UnsupportedOperationException("Failed to call Handler.hasCallbacks(), but there is no safe failure mode for this method. Raising exception.", ex);
            }
            catch (NoSuchMethodException ex) {
                throw new UnsupportedOperationException("Failed to call Handler.hasCallbacks(), but there is no safe failure mode for this method. Raising exception.", ex);
            }
            catch (IllegalAccessException ex) {
                throw new UnsupportedOperationException("Failed to call Handler.hasCallbacks(), but there is no safe failure mode for this method. Raising exception.", ex);
            }
            catch (InvocationTargetException ex2) {
                final Throwable cause = ex2.getCause();
                if (cause instanceof RuntimeException) {
                    throw (RuntimeException)cause;
                }
                if (cause instanceof Error) {
                    throw (Error)cause;
                }
                throw new RuntimeException(cause);
            }
        }
        final NullPointerException ex = null;
        throw new UnsupportedOperationException("Failed to call Handler.hasCallbacks(), but there is no safe failure mode for this method. Raising exception.", ex);
    }
    
    public static boolean d(@j0 final Handler handler, @j0 final Runnable runnable, @k0 final Object obj, final long n) {
        if (Build$VERSION.SDK_INT >= 28) {
            return g.a.c(handler, runnable, obj, n);
        }
        final Message obtain = Message.obtain(handler, runnable);
        obtain.obj = obj;
        return handler.sendMessageDelayed(obtain, n);
    }
    
    @p0(28)
    private static class a
    {
        public static Handler a(final Looper looper) {
            return Handler.createAsync(looper);
        }
        
        public static Handler b(final Looper looper, final Handler$Callback handler$Callback) {
            return Handler.createAsync(looper, handler$Callback);
        }
        
        public static boolean c(final Handler handler, final Runnable runnable, final Object o, final long n) {
            return handler.postDelayed(runnable, o, n);
        }
    }
    
    @p0(29)
    private static class b
    {
        public static boolean a(final Handler handler, final Runnable runnable) {
            return handler.hasCallbacks(runnable);
        }
    }
}
