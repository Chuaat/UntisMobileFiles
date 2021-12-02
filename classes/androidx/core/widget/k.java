// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.widget;

import android.graphics.drawable.Drawable;
import android.graphics.PorterDuff$Mode;
import androidx.annotation.k0;
import android.os.Build$VERSION;
import android.content.res.ColorStateList;
import androidx.annotation.j0;
import android.widget.ImageView;

public class k
{
    private k() {
    }
    
    @k0
    public static ColorStateList a(@j0 final ImageView imageView) {
        if (Build$VERSION.SDK_INT >= 21) {
            return imageView.getImageTintList();
        }
        ColorStateList supportImageTintList;
        if (imageView instanceof x) {
            supportImageTintList = ((x)imageView).getSupportImageTintList();
        }
        else {
            supportImageTintList = null;
        }
        return supportImageTintList;
    }
    
    @k0
    public static PorterDuff$Mode b(@j0 final ImageView imageView) {
        if (Build$VERSION.SDK_INT >= 21) {
            return imageView.getImageTintMode();
        }
        PorterDuff$Mode supportImageTintMode;
        if (imageView instanceof x) {
            supportImageTintMode = ((x)imageView).getSupportImageTintMode();
        }
        else {
            supportImageTintMode = null;
        }
        return supportImageTintMode;
    }
    
    public static void c(@j0 final ImageView imageView, @k0 final ColorStateList list) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 21) {
            imageView.setImageTintList(list);
            if (sdk_INT == 21) {
                final Drawable drawable = imageView.getDrawable();
                if (drawable != null && imageView.getImageTintList() != null) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
        }
        else if (imageView instanceof x) {
            ((x)imageView).setSupportImageTintList(list);
        }
    }
    
    public static void d(@j0 final ImageView imageView, @k0 final PorterDuff$Mode porterDuff$Mode) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 21) {
            imageView.setImageTintMode(porterDuff$Mode);
            if (sdk_INT == 21) {
                final Drawable drawable = imageView.getDrawable();
                if (drawable != null && imageView.getImageTintList() != null) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
        }
        else if (imageView instanceof x) {
            ((x)imageView).setSupportImageTintMode(porterDuff$Mode);
        }
    }
}
