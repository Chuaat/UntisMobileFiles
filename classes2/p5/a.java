// 
// Decompiled by Procyon v0.5.36
// 

package p5;

import com.untis.mobile.ui.fragments.common.SimpleLayoutFragment;
import com.untis.mobile.ui.fragments.shop.ShopFragment;
import androidx.fragment.app.Fragment;
import androidx.annotation.j0;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.r;

public class a extends r
{
    private static final int a = 0;
    private static final int b = 1;
    private static final int c = 2;
    private static final int d = 3;
    private static final int e = 4;
    private static final int f = 5;
    private static final int g = 6;
    
    public a(@j0 final FragmentManager fragmentManager) {
        super(fragmentManager);
    }
    
    public int getCount() {
        return 6;
    }
    
    public Fragment getItem(int n) {
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        if (n != 4) {
                            return ShopFragment.l0();
                        }
                        n = 2131493117;
                    }
                    else {
                        n = 2131493116;
                    }
                }
                else {
                    n = 2131493115;
                }
            }
            else {
                n = 2131493114;
            }
        }
        else {
            n = 2131493113;
        }
        return SimpleLayoutFragment.r(n);
    }
}
