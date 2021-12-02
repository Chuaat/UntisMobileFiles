// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.animation;

import androidx.annotation.p0;
import android.animation.Animator$AnimatorPauseListener;
import kotlin.jvm.internal.k0;
import android.animation.Animator$AnimatorListener;
import kotlin.j2;
import n6.l;
import org.jetbrains.annotations.e;
import android.animation.Animator;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a5\u0010\b\u001a\u00020\u0007*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b\u00f8\u0001\u0000\u001a5\u0010\t\u001a\u00020\u0007*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b\u00f8\u0001\u0000\u001a5\u0010\n\u001a\u00020\u0007*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b\u00f8\u0001\u0000\u001a5\u0010\u000b\u001a\u00020\u0007*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b\u00f8\u0001\u0000\u001a5\u0010\r\u001a\u00020\f*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0087\b\u00f8\u0001\u0000\u001a5\u0010\u000e\u001a\u00020\f*\u00020\u00002#\b\u0004\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0087\b\u00f8\u0001\u0000\u001a¤\u0001\u0010\u0013\u001a\u00020\u0007*\u00020\u00002#\b\u0006\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u00012#\b\u0006\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u00012#\b\u0006\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u00012#\b\u0006\u0010\u0012\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0086\b\u00f8\u0001\u0000\u001aZ\u0010\u0016\u001a\u00020\f*\u00020\u00002#\b\u0006\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u00012#\b\u0006\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001H\u0087\b\u00f8\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0017" }, d2 = { "Landroid/animation/Animator;", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "animator", "Lkotlin/j2;", "action", "Landroid/animation/Animator$AnimatorListener;", "f", "j", "e", "h", "Landroid/animation/Animator$AnimatorPauseListener;", "i", "g", "onEnd", "onStart", "onCancel", "onRepeat", "a", "onResume", "onPause", "c", "core-ktx_release" }, k = 2, mv = { 1, 5, 1 })
public final class a
{
    @e
    public static final Animator$AnimatorListener a(@e final Animator animator, @e final l<? super Animator, j2> l, @e final l<? super Animator, j2> i, @e final l<? super Animator, j2> j, @e final l<? super Animator, j2> k) {
        k0.p((Object)animator, "<this>");
        k0.p((Object)l, "onEnd");
        k0.p((Object)i, "onStart");
        k0.p((Object)j, "onCancel");
        k0.p((Object)k, "onRepeat");
        final Animator$AnimatorListener animator$AnimatorListener = (Animator$AnimatorListener)new Animator$AnimatorListener() {
            final /* synthetic */ l<Animator, j2> a;
            final /* synthetic */ l<Animator, j2> b;
            final /* synthetic */ l<Animator, j2> c;
            final /* synthetic */ l<Animator, j2> d;
            
            public void onAnimationCancel(@e final Animator animator) {
                k0.p((Object)animator, "animator");
                this.c.invoke((Object)animator);
            }
            
            public void onAnimationEnd(@e final Animator animator) {
                k0.p((Object)animator, "animator");
                this.b.invoke((Object)animator);
            }
            
            public void onAnimationRepeat(@e final Animator animator) {
                k0.p((Object)animator, "animator");
                this.a.invoke((Object)animator);
            }
            
            public void onAnimationStart(@e final Animator animator) {
                k0.p((Object)animator, "animator");
                this.d.invoke((Object)animator);
            }
        };
        animator.addListener((Animator$AnimatorListener)animator$AnimatorListener);
        return (Animator$AnimatorListener)animator$AnimatorListener;
    }
    
    @p0(19)
    @e
    public static final Animator$AnimatorPauseListener c(@e final Animator animator, @e final l<? super Animator, j2> l, @e final l<? super Animator, j2> i) {
        k0.p((Object)animator, "<this>");
        k0.p((Object)l, "onResume");
        k0.p((Object)i, "onPause");
        final Animator$AnimatorPauseListener animator$AnimatorPauseListener = (Animator$AnimatorPauseListener)new Animator$AnimatorPauseListener() {
            final /* synthetic */ l<Animator, j2> a;
            final /* synthetic */ l<Animator, j2> b;
            
            public void onAnimationPause(@e final Animator animator) {
                k0.p((Object)animator, "animator");
                this.a.invoke((Object)animator);
            }
            
            public void onAnimationResume(@e final Animator animator) {
                k0.p((Object)animator, "animator");
                this.b.invoke((Object)animator);
            }
        };
        animator.addPauseListener((Animator$AnimatorPauseListener)animator$AnimatorPauseListener);
        return (Animator$AnimatorPauseListener)animator$AnimatorPauseListener;
    }
    
    @e
    public static final Animator$AnimatorListener e(@e final Animator animator, @e final l<? super Animator, j2> l) {
        k0.p((Object)animator, "<this>");
        k0.p((Object)l, "action");
        final Animator$AnimatorListener animator$AnimatorListener = (Animator$AnimatorListener)new Animator$AnimatorListener() {
            public void onAnimationCancel(@e final Animator animator) {
                k0.p((Object)animator, "animator");
                l.invoke((Object)animator);
            }
            
            public void onAnimationEnd(@e final Animator animator) {
                k0.p((Object)animator, "animator");
            }
            
            public void onAnimationRepeat(@e final Animator animator) {
                k0.p((Object)animator, "animator");
            }
            
            public void onAnimationStart(@e final Animator animator) {
                k0.p((Object)animator, "animator");
            }
        };
        animator.addListener((Animator$AnimatorListener)animator$AnimatorListener);
        return (Animator$AnimatorListener)animator$AnimatorListener;
    }
    
    @e
    public static final Animator$AnimatorListener f(@e final Animator animator, @e final l<? super Animator, j2> l) {
        k0.p((Object)animator, "<this>");
        k0.p((Object)l, "action");
        final Animator$AnimatorListener animator$AnimatorListener = (Animator$AnimatorListener)new Animator$AnimatorListener() {
            public void onAnimationCancel(@e final Animator animator) {
                k0.p((Object)animator, "animator");
            }
            
            public void onAnimationEnd(@e final Animator animator) {
                k0.p((Object)animator, "animator");
                l.invoke((Object)animator);
            }
            
            public void onAnimationRepeat(@e final Animator animator) {
                k0.p((Object)animator, "animator");
            }
            
            public void onAnimationStart(@e final Animator animator) {
                k0.p((Object)animator, "animator");
            }
        };
        animator.addListener((Animator$AnimatorListener)animator$AnimatorListener);
        return (Animator$AnimatorListener)animator$AnimatorListener;
    }
    
    @p0(19)
    @e
    public static final Animator$AnimatorPauseListener g(@e final Animator animator, @e final l<? super Animator, j2> l) {
        k0.p((Object)animator, "<this>");
        k0.p((Object)l, "action");
        final Animator$AnimatorPauseListener animator$AnimatorPauseListener = (Animator$AnimatorPauseListener)new Animator$AnimatorPauseListener() {
            public void onAnimationPause(@e final Animator animator) {
                k0.p((Object)animator, "animator");
                l.invoke((Object)animator);
            }
            
            public void onAnimationResume(@e final Animator animator) {
                k0.p((Object)animator, "animator");
            }
        };
        animator.addPauseListener((Animator$AnimatorPauseListener)animator$AnimatorPauseListener);
        return (Animator$AnimatorPauseListener)animator$AnimatorPauseListener;
    }
    
    @e
    public static final Animator$AnimatorListener h(@e final Animator animator, @e final l<? super Animator, j2> l) {
        k0.p((Object)animator, "<this>");
        k0.p((Object)l, "action");
        final Animator$AnimatorListener animator$AnimatorListener = (Animator$AnimatorListener)new Animator$AnimatorListener() {
            public void onAnimationCancel(@e final Animator animator) {
                k0.p((Object)animator, "animator");
            }
            
            public void onAnimationEnd(@e final Animator animator) {
                k0.p((Object)animator, "animator");
            }
            
            public void onAnimationRepeat(@e final Animator animator) {
                k0.p((Object)animator, "animator");
                l.invoke((Object)animator);
            }
            
            public void onAnimationStart(@e final Animator animator) {
                k0.p((Object)animator, "animator");
            }
        };
        animator.addListener((Animator$AnimatorListener)animator$AnimatorListener);
        return (Animator$AnimatorListener)animator$AnimatorListener;
    }
    
    @p0(19)
    @e
    public static final Animator$AnimatorPauseListener i(@e final Animator animator, @e final l<? super Animator, j2> l) {
        k0.p((Object)animator, "<this>");
        k0.p((Object)l, "action");
        final Animator$AnimatorPauseListener animator$AnimatorPauseListener = (Animator$AnimatorPauseListener)new Animator$AnimatorPauseListener() {
            public void onAnimationPause(@e final Animator animator) {
                k0.p((Object)animator, "animator");
            }
            
            public void onAnimationResume(@e final Animator animator) {
                k0.p((Object)animator, "animator");
                l.invoke((Object)animator);
            }
        };
        animator.addPauseListener((Animator$AnimatorPauseListener)animator$AnimatorPauseListener);
        return (Animator$AnimatorPauseListener)animator$AnimatorPauseListener;
    }
    
    @e
    public static final Animator$AnimatorListener j(@e final Animator animator, @e final l<? super Animator, j2> l) {
        k0.p((Object)animator, "<this>");
        k0.p((Object)l, "action");
        final Animator$AnimatorListener animator$AnimatorListener = (Animator$AnimatorListener)new Animator$AnimatorListener() {
            public void onAnimationCancel(@e final Animator animator) {
                k0.p((Object)animator, "animator");
            }
            
            public void onAnimationEnd(@e final Animator animator) {
                k0.p((Object)animator, "animator");
            }
            
            public void onAnimationRepeat(@e final Animator animator) {
                k0.p((Object)animator, "animator");
            }
            
            public void onAnimationStart(@e final Animator animator) {
                k0.p((Object)animator, "animator");
                l.invoke((Object)animator);
            }
        };
        animator.addListener((Animator$AnimatorListener)animator$AnimatorListener);
        return (Animator$AnimatorListener)animator$AnimatorListener;
    }
}
