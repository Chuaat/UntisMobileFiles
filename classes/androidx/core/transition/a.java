// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.transition;

import androidx.annotation.p0;
import kotlin.jvm.internal.k0;
import android.transition.Transition$TransitionListener;
import kotlin.j2;
import n6.l;
import org.jetbrains.annotations.e;
import android.transition.Transition;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a5\u0010\b\u001a\u00020\u0007*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0087\b\u00f8\u0001\u0000\u001a5\u0010\t\u001a\u00020\u0007*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0087\b\u00f8\u0001\u0000\u001a5\u0010\n\u001a\u00020\u0007*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0087\b\u00f8\u0001\u0000\u001a5\u0010\u000b\u001a\u00020\u0007*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0087\b\u00f8\u0001\u0000\u001a5\u0010\f\u001a\u00020\u0007*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0087\b\u00f8\u0001\u0000\u001a\u00c9\u0001\u0010\u0012\u001a\u00020\u0007*\u00020\u00002#\b\u0006\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u00012#\b\u0006\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u00012#\b\u0006\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u00012#\b\u0006\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u00012#\b\u0006\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0087\b\u00f8\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013" }, d2 = { "Landroid/transition/Transition;", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "transition", "Lkotlin/j2;", "action", "Landroid/transition/Transition$TransitionListener;", "d", "g", "c", "f", "e", "onEnd", "onStart", "onCancel", "onResume", "onPause", "a", "core-ktx_release" }, k = 2, mv = { 1, 5, 1 })
public final class a
{
    @p0(19)
    @e
    public static final Transition$TransitionListener a(@e final Transition transition, @e final l<? super Transition, j2> l, @e final l<? super Transition, j2> i, @e final l<? super Transition, j2> j, @e final l<? super Transition, j2> k, @e final l<? super Transition, j2> m) {
        k0.p((Object)transition, "<this>");
        k0.p((Object)l, "onEnd");
        k0.p((Object)i, "onStart");
        k0.p((Object)j, "onCancel");
        k0.p((Object)k, "onResume");
        k0.p((Object)m, "onPause");
        final Transition$TransitionListener transition$TransitionListener = (Transition$TransitionListener)new Transition$TransitionListener() {
            final /* synthetic */ l<Transition, j2> a;
            final /* synthetic */ l<Transition, j2> b;
            final /* synthetic */ l<Transition, j2> c;
            final /* synthetic */ l<Transition, j2> d;
            final /* synthetic */ l<Transition, j2> e;
            
            public void onTransitionCancel(@e final Transition transition) {
                k0.p((Object)transition, "transition");
                this.d.invoke((Object)transition);
            }
            
            public void onTransitionEnd(@e final Transition transition) {
                k0.p((Object)transition, "transition");
                this.a.invoke((Object)transition);
            }
            
            public void onTransitionPause(@e final Transition transition) {
                k0.p((Object)transition, "transition");
                this.c.invoke((Object)transition);
            }
            
            public void onTransitionResume(@e final Transition transition) {
                k0.p((Object)transition, "transition");
                this.b.invoke((Object)transition);
            }
            
            public void onTransitionStart(@e final Transition transition) {
                k0.p((Object)transition, "transition");
                this.e.invoke((Object)transition);
            }
        };
        transition.addListener((Transition$TransitionListener)transition$TransitionListener);
        return (Transition$TransitionListener)transition$TransitionListener;
    }
    
    @p0(19)
    @e
    public static final Transition$TransitionListener c(@e final Transition transition, @e final l<? super Transition, j2> l) {
        k0.p((Object)transition, "<this>");
        k0.p((Object)l, "action");
        final Transition$TransitionListener transition$TransitionListener = (Transition$TransitionListener)new Transition$TransitionListener() {
            public void onTransitionCancel(@e final Transition transition) {
                k0.p((Object)transition, "transition");
                l.invoke((Object)transition);
            }
            
            public void onTransitionEnd(@e final Transition transition) {
                k0.p((Object)transition, "transition");
            }
            
            public void onTransitionPause(@e final Transition transition) {
                k0.p((Object)transition, "transition");
            }
            
            public void onTransitionResume(@e final Transition transition) {
                k0.p((Object)transition, "transition");
            }
            
            public void onTransitionStart(@e final Transition transition) {
                k0.p((Object)transition, "transition");
            }
        };
        transition.addListener((Transition$TransitionListener)transition$TransitionListener);
        return (Transition$TransitionListener)transition$TransitionListener;
    }
    
    @p0(19)
    @e
    public static final Transition$TransitionListener d(@e final Transition transition, @e final l<? super Transition, j2> l) {
        k0.p((Object)transition, "<this>");
        k0.p((Object)l, "action");
        final Transition$TransitionListener transition$TransitionListener = (Transition$TransitionListener)new Transition$TransitionListener() {
            public void onTransitionCancel(@e final Transition transition) {
                k0.p((Object)transition, "transition");
            }
            
            public void onTransitionEnd(@e final Transition transition) {
                k0.p((Object)transition, "transition");
                l.invoke((Object)transition);
            }
            
            public void onTransitionPause(@e final Transition transition) {
                k0.p((Object)transition, "transition");
            }
            
            public void onTransitionResume(@e final Transition transition) {
                k0.p((Object)transition, "transition");
            }
            
            public void onTransitionStart(@e final Transition transition) {
                k0.p((Object)transition, "transition");
            }
        };
        transition.addListener((Transition$TransitionListener)transition$TransitionListener);
        return (Transition$TransitionListener)transition$TransitionListener;
    }
    
    @p0(19)
    @e
    public static final Transition$TransitionListener e(@e final Transition transition, @e final l<? super Transition, j2> l) {
        k0.p((Object)transition, "<this>");
        k0.p((Object)l, "action");
        final Transition$TransitionListener transition$TransitionListener = (Transition$TransitionListener)new Transition$TransitionListener() {
            public void onTransitionCancel(@e final Transition transition) {
                k0.p((Object)transition, "transition");
            }
            
            public void onTransitionEnd(@e final Transition transition) {
                k0.p((Object)transition, "transition");
            }
            
            public void onTransitionPause(@e final Transition transition) {
                k0.p((Object)transition, "transition");
                l.invoke((Object)transition);
            }
            
            public void onTransitionResume(@e final Transition transition) {
                k0.p((Object)transition, "transition");
            }
            
            public void onTransitionStart(@e final Transition transition) {
                k0.p((Object)transition, "transition");
            }
        };
        transition.addListener((Transition$TransitionListener)transition$TransitionListener);
        return (Transition$TransitionListener)transition$TransitionListener;
    }
    
    @p0(19)
    @e
    public static final Transition$TransitionListener f(@e final Transition transition, @e final l<? super Transition, j2> l) {
        k0.p((Object)transition, "<this>");
        k0.p((Object)l, "action");
        final Transition$TransitionListener transition$TransitionListener = (Transition$TransitionListener)new Transition$TransitionListener() {
            public void onTransitionCancel(@e final Transition transition) {
                k0.p((Object)transition, "transition");
            }
            
            public void onTransitionEnd(@e final Transition transition) {
                k0.p((Object)transition, "transition");
            }
            
            public void onTransitionPause(@e final Transition transition) {
                k0.p((Object)transition, "transition");
            }
            
            public void onTransitionResume(@e final Transition transition) {
                k0.p((Object)transition, "transition");
                l.invoke((Object)transition);
            }
            
            public void onTransitionStart(@e final Transition transition) {
                k0.p((Object)transition, "transition");
            }
        };
        transition.addListener((Transition$TransitionListener)transition$TransitionListener);
        return (Transition$TransitionListener)transition$TransitionListener;
    }
    
    @p0(19)
    @e
    public static final Transition$TransitionListener g(@e final Transition transition, @e final l<? super Transition, j2> l) {
        k0.p((Object)transition, "<this>");
        k0.p((Object)l, "action");
        final Transition$TransitionListener transition$TransitionListener = (Transition$TransitionListener)new Transition$TransitionListener() {
            public void onTransitionCancel(@e final Transition transition) {
                k0.p((Object)transition, "transition");
            }
            
            public void onTransitionEnd(@e final Transition transition) {
                k0.p((Object)transition, "transition");
            }
            
            public void onTransitionPause(@e final Transition transition) {
                k0.p((Object)transition, "transition");
            }
            
            public void onTransitionResume(@e final Transition transition) {
                k0.p((Object)transition, "transition");
            }
            
            public void onTransitionStart(@e final Transition transition) {
                k0.p((Object)transition, "transition");
                l.invoke((Object)transition);
            }
        };
        transition.addListener((Transition$TransitionListener)transition$TransitionListener);
        return (Transition$TransitionListener)transition$TransitionListener;
    }
}
