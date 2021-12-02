// 
// Decompiled by Procyon v0.5.36
// 

package androidx.transition;

import java.util.ArrayList;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator$AnimatorPauseListener;
import android.os.Build$VERSION;
import android.animation.AnimatorListenerAdapter;
import androidx.annotation.j0;
import android.animation.Animator;

class a
{
    private a() {
    }
    
    static void a(@j0 final Animator animator, @j0 final AnimatorListenerAdapter animatorListenerAdapter) {
        if (Build$VERSION.SDK_INT >= 19) {
            animator.addPauseListener((Animator$AnimatorPauseListener)animatorListenerAdapter);
        }
    }
    
    static void b(@j0 final Animator animator) {
        if (Build$VERSION.SDK_INT >= 19) {
            animator.pause();
        }
        else {
            final ArrayList listeners = animator.getListeners();
            if (listeners != null) {
                for (int i = 0; i < listeners.size(); ++i) {
                    final Animator$AnimatorListener animator$AnimatorListener = listeners.get(i);
                    if (animator$AnimatorListener instanceof a) {
                        ((a)animator$AnimatorListener).onAnimationPause(animator);
                    }
                }
            }
        }
    }
    
    static void c(@j0 final Animator animator) {
        if (Build$VERSION.SDK_INT >= 19) {
            animator.resume();
        }
        else {
            final ArrayList listeners = animator.getListeners();
            if (listeners != null) {
                for (int i = 0; i < listeners.size(); ++i) {
                    final Animator$AnimatorListener animator$AnimatorListener = listeners.get(i);
                    if (animator$AnimatorListener instanceof a) {
                        ((a)animator$AnimatorListener).onAnimationResume(animator);
                    }
                }
            }
        }
    }
    
    interface a
    {
        void onAnimationPause(final Animator p0);
        
        void onAnimationResume(final Animator p0);
    }
}
