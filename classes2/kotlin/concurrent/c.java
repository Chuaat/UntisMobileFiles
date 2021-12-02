// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.concurrent;

import org.jetbrains.annotations.e;
import kotlin.y0;
import java.util.Date;
import kotlin.internal.f;
import java.util.Timer;
import kotlin.j2;
import java.util.TimerTask;
import n6.l;
import m6.g;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u001a3\u0010\b\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0019\b\u0004\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\b\u00f8\u0001\u0000\u001a3\u0010\u000b\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0019\b\u0004\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\b\u00f8\u0001\u0000\u001a;\u0010\r\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0019\b\u0004\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\b\u00f8\u0001\u0000\u001a;\u0010\u000e\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00012\u0019\b\u0004\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\b\u00f8\u0001\u0000\u001a;\u0010\u000f\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0019\b\u0004\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\b\u00f8\u0001\u0000\u001a;\u0010\u0010\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00012\u0019\b\u0004\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\b\u00f8\u0001\u0000\u001a\u001a\u0010\u0015\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001\u001aO\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0019\b\u0004\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\b\u00f8\u0001\u0000\u001aM\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00012\u0019\b\u0004\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\b\u00f8\u0001\u0000\u001aO\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0019\b\u0004\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\b\u00f8\u0001\u0000\u001aM\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00012\u0019\b\u0004\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\b\u00f8\u0001\u0000\u001a'\u0010\u001c\u001a\u00020\u00042\u0019\b\u0004\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0087\b\u00f8\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001d" }, d2 = { "Ljava/util/Timer;", "", "delay", "Lkotlin/Function1;", "Ljava/util/TimerTask;", "Lkotlin/j2;", "Lkotlin/s;", "action", "f", "Ljava/util/Date;", "time", "h", "period", "e", "g", "i", "j", "", "name", "", "daemon", "k", "initialDelay", "l", "startAt", "m", "a", "b", "p", "kotlin-stdlib" }, k = 2, mv = { 1, 5, 1 })
@g(name = "TimersKt")
public final class c
{
    @f
    private static final Timer a(final String s, final boolean b, final long delay, final long period, final l<? super TimerTask, j2> l) {
        final Timer k = k(s, b);
        k.scheduleAtFixedRate(new TimerTask() {
            final /* synthetic */ l G;
            
            @Override
            public void run() {
                this.G.invoke(this);
            }
        }, delay, period);
        return k;
    }
    
    @f
    private static final Timer b(final String s, final boolean b, final Date firstTime, final long period, final l<? super TimerTask, j2> l) {
        final Timer k = k(s, b);
        k.scheduleAtFixedRate(new TimerTask() {
            final /* synthetic */ l G;
            
            @Override
            public void run() {
                this.G.invoke(this);
            }
        }, firstTime, period);
        return k;
    }
    
    @f
    private static final TimerTask e(final Timer timer, final long delay, final long period, final l<? super TimerTask, j2> l) {
        final TimerTask task = new TimerTask() {
            final /* synthetic */ l G;
            
            @Override
            public void run() {
                this.G.invoke(this);
            }
        };
        timer.schedule(task, delay, period);
        return task;
    }
    
    @f
    private static final TimerTask f(final Timer timer, final long delay, final l<? super TimerTask, j2> l) {
        final TimerTask task = new TimerTask() {
            final /* synthetic */ l G;
            
            @Override
            public void run() {
                this.G.invoke(this);
            }
        };
        timer.schedule(task, delay);
        return task;
    }
    
    @f
    private static final TimerTask g(final Timer timer, final Date firstTime, final long period, final l<? super TimerTask, j2> l) {
        final TimerTask task = new TimerTask() {
            final /* synthetic */ l G;
            
            @Override
            public void run() {
                this.G.invoke(this);
            }
        };
        timer.schedule(task, firstTime, period);
        return task;
    }
    
    @f
    private static final TimerTask h(final Timer timer, final Date time, final l<? super TimerTask, j2> l) {
        final TimerTask task = new TimerTask() {
            final /* synthetic */ l G;
            
            @Override
            public void run() {
                this.G.invoke(this);
            }
        };
        timer.schedule(task, time);
        return task;
    }
    
    @f
    private static final TimerTask i(final Timer timer, final long delay, final long period, final l<? super TimerTask, j2> l) {
        final TimerTask task = new TimerTask() {
            final /* synthetic */ l G;
            
            @Override
            public void run() {
                this.G.invoke(this);
            }
        };
        timer.scheduleAtFixedRate(task, delay, period);
        return task;
    }
    
    @f
    private static final TimerTask j(final Timer timer, final Date firstTime, final long period, final l<? super TimerTask, j2> l) {
        final TimerTask task = new TimerTask() {
            final /* synthetic */ l G;
            
            @Override
            public void run() {
                this.G.invoke(this);
            }
        };
        timer.scheduleAtFixedRate(task, firstTime, period);
        return task;
    }
    
    @y0
    @e
    public static final Timer k(@org.jetbrains.annotations.f final String name, final boolean b) {
        Timer timer;
        if (name == null) {
            timer = new Timer(b);
        }
        else {
            timer = new Timer(name, b);
        }
        return timer;
    }
    
    @f
    private static final Timer l(final String s, final boolean b, final long delay, final long period, final l<? super TimerTask, j2> l) {
        final Timer k = k(s, b);
        k.schedule(new TimerTask() {
            final /* synthetic */ l G;
            
            @Override
            public void run() {
                this.G.invoke(this);
            }
        }, delay, period);
        return k;
    }
    
    @f
    private static final Timer m(final String s, final boolean b, final Date firstTime, final long period, final l<? super TimerTask, j2> l) {
        final Timer k = k(s, b);
        k.schedule(new TimerTask() {
            final /* synthetic */ l G;
            
            @Override
            public void run() {
                this.G.invoke(this);
            }
        }, firstTime, period);
        return k;
    }
    
    @f
    private static final TimerTask p(final l<? super TimerTask, j2> l) {
        return new TimerTask() {
            final /* synthetic */ l G;
            
            @Override
            public void run() {
                l.invoke(this);
            }
        };
    }
}
