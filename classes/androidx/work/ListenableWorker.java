// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work;

import android.net.Uri;
import java.util.List;
import androidx.work.impl.utils.taskexecutor.a;
import java.util.Set;
import androidx.annotation.b0;
import androidx.annotation.p0;
import androidx.annotation.k0;
import android.net.Network;
import java.util.UUID;
import androidx.annotation.t0;
import java.util.concurrent.Executor;
import androidx.annotation.Keep;
import android.annotation.SuppressLint;
import androidx.annotation.j0;
import android.content.Context;

public abstract class ListenableWorker
{
    @j0
    private Context mAppContext;
    private boolean mRunInForeground;
    private volatile boolean mStopped;
    private boolean mUsed;
    @j0
    private WorkerParameters mWorkerParams;
    
    @SuppressLint({ "BanKeepAnnotation" })
    @Keep
    public ListenableWorker(@j0 final Context mAppContext, @j0 final WorkerParameters mWorkerParams) {
        if (mAppContext == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (mWorkerParams != null) {
            this.mAppContext = mAppContext;
            this.mWorkerParams = mWorkerParams;
            return;
        }
        throw new IllegalArgumentException("WorkerParameters is null");
    }
    
    @j0
    public final Context getApplicationContext() {
        return this.mAppContext;
    }
    
    @j0
    @t0({ t0.a.H })
    public Executor getBackgroundExecutor() {
        return this.mWorkerParams.a();
    }
    
    @j0
    public final UUID getId() {
        return this.mWorkerParams.c();
    }
    
    @j0
    public final f getInputData() {
        return this.mWorkerParams.d();
    }
    
    @k0
    @p0(28)
    public final Network getNetwork() {
        return this.mWorkerParams.e();
    }
    
    @b0(from = 0L)
    public final int getRunAttemptCount() {
        return this.mWorkerParams.g();
    }
    
    @j0
    public final Set<String> getTags() {
        return this.mWorkerParams.h();
    }
    
    @j0
    @t0({ t0.a.H })
    public androidx.work.impl.utils.taskexecutor.a getTaskExecutor() {
        return this.mWorkerParams.i();
    }
    
    @j0
    @p0(24)
    public final List<String> getTriggeredContentAuthorities() {
        return this.mWorkerParams.j();
    }
    
    @j0
    @p0(24)
    public final List<Uri> getTriggeredContentUris() {
        return this.mWorkerParams.k();
    }
    
    @j0
    @t0({ t0.a.H })
    public g0 getWorkerFactory() {
        return this.mWorkerParams.l();
    }
    
    @t0({ t0.a.H })
    public boolean isRunInForeground() {
        return this.mRunInForeground;
    }
    
    public final boolean isStopped() {
        return this.mStopped;
    }
    
    @t0({ t0.a.H })
    public final boolean isUsed() {
        return this.mUsed;
    }
    
    public void onStopped() {
    }
    
    @j0
    public final x2.a<Void> setForegroundAsync(@j0 final l l) {
        this.mRunInForeground = true;
        return this.mWorkerParams.b().a(this.getApplicationContext(), this.getId(), l);
    }
    
    @j0
    public final x2.a<Void> setProgressAsync(@j0 final f f) {
        return this.mWorkerParams.f().a(this.getApplicationContext(), this.getId(), f);
    }
    
    @t0({ t0.a.H })
    public final void setUsed() {
        this.mUsed = true;
    }
    
    @androidx.annotation.g0
    @j0
    public abstract x2.a<a> startWork();
    
    @t0({ t0.a.H })
    public final void stop() {
        this.mStopped = true;
        this.onStopped();
    }
    
    public abstract static class a
    {
        @t0({ t0.a.H })
        a() {
        }
        
        @j0
        public static ListenableWorker.a a() {
            return new ListenableWorker.a.a();
        }
        
        @j0
        public static ListenableWorker.a b(@j0 final f f) {
            return new ListenableWorker.a.a(f);
        }
        
        @j0
        public static ListenableWorker.a c() {
            return new b();
        }
        
        @j0
        public static ListenableWorker.a d() {
            return new c();
        }
        
        @j0
        public static ListenableWorker.a e(@j0 final f f) {
            return new c(f);
        }
        
        @t0({ t0.a.H })
        public static final class a extends ListenableWorker.a
        {
            private final f a;
            
            public a() {
                this(f.c);
            }
            
            public a(@j0 final f a) {
                this.a = a;
            }
            
            @Override
            public boolean equals(final Object o) {
                return this == o || (o != null && a.class == o.getClass() && this.a.equals(((a)o).a));
            }
            
            @j0
            @t0({ t0.a.H })
            public f f() {
                return this.a;
            }
            
            @Override
            public int hashCode() {
                return a.class.getName().hashCode() * 31 + this.a.hashCode();
            }
            
            @Override
            public String toString() {
                final StringBuilder sb = new StringBuilder();
                sb.append("Failure {mOutputData=");
                sb.append(this.a);
                sb.append('}');
                return sb.toString();
            }
        }
        
        @t0({ t0.a.H })
        public static final class b extends ListenableWorker.a
        {
            @Override
            public boolean equals(final Object o) {
                boolean b = true;
                if (this == o) {
                    return true;
                }
                if (o == null || b.class != o.getClass()) {
                    b = false;
                }
                return b;
            }
            
            @Override
            public int hashCode() {
                return b.class.getName().hashCode();
            }
            
            @Override
            public String toString() {
                return "Retry";
            }
        }
        
        @t0({ t0.a.H })
        public static final class c extends ListenableWorker.a
        {
            private final f a;
            
            public c() {
                this(f.c);
            }
            
            public c(@j0 final f a) {
                this.a = a;
            }
            
            @Override
            public boolean equals(final Object o) {
                return this == o || (o != null && c.class == o.getClass() && this.a.equals(((c)o).a));
            }
            
            @j0
            @t0({ t0.a.H })
            public f f() {
                return this.a;
            }
            
            @Override
            public int hashCode() {
                return c.class.getName().hashCode() * 31 + this.a.hashCode();
            }
            
            @Override
            public String toString() {
                final StringBuilder sb = new StringBuilder();
                sb.append("Success {mOutputData=");
                sb.append(this.a);
                sb.append('}');
                return sb.toString();
            }
        }
    }
}
