// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector.elements.android;

import android.graphics.Region$Op;
import android.graphics.Canvas;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.annotation.TargetApi;
import android.graphics.Rect;
import android.view.View;
import android.os.Build$VERSION;

abstract class ViewHighlightOverlays
{
    static ViewHighlightOverlays newInstance() {
        if (Build$VERSION.SDK_INT >= 18) {
            return new ViewHighlightOverlaysJellybeanMR2();
        }
        return new NoOpViewHighlightOverlays();
    }
    
    abstract void highlightView(final View p0, final Rect p1, final int p2);
    
    abstract void removeHighlight(final View p0);
    
    private static class NoOpViewHighlightOverlays extends ViewHighlightOverlays
    {
        @Override
        void highlightView(final View view, final Rect rect, final int n) {
        }
        
        @Override
        void removeHighlight(final View view) {
        }
    }
    
    @TargetApi(18)
    private static class ViewHighlightOverlaysJellybeanMR2 extends ViewHighlightOverlays
    {
        private static final int MARGIN_OVERLAY_COLOR = -1426797922;
        private static final int PADDING_OVERLAY_COLOR = -1430332746;
        private final HighlightDrawable[] mHighlightDrawables;
        private final MainHighlightDrawable mMainHighlightDrawable;
        
        ViewHighlightOverlaysJellybeanMR2() {
            final MainHighlightDrawable mMainHighlightDrawable = new MainHighlightDrawable();
            this.mMainHighlightDrawable = mMainHighlightDrawable;
            this.mHighlightDrawables = new HighlightDrawable[] { (HighlightDrawable)mMainHighlightDrawable, (HighlightDrawable)new PaddingTopHighlightDrawable(), (HighlightDrawable)new PaddingBottomHighlightDrawable(), (HighlightDrawable)new PaddingRightHighlightDrawable(), (HighlightDrawable)new PaddingLeftHighlightDrawable(), (HighlightDrawable)new MarginTopHighlightDrawable(), (HighlightDrawable)new MarginBottomHighlightDrawable(), (HighlightDrawable)new MarginRightHighlightDrawable(), (HighlightDrawable)new MarginLeftHighlightDrawable() };
        }
        
        @Override
        void highlightView(final View view, final Rect bounds, int i) {
            this.mMainHighlightDrawable.setColor(i);
            final boolean empty = bounds.isEmpty();
            i = 0;
            if (empty) {
                this.mMainHighlightDrawable.setBounds(0, 0, view.getWidth(), view.getHeight());
            }
            else {
                this.mMainHighlightDrawable.setBounds(bounds);
            }
            while (i < this.mHighlightDrawables.length) {
                final HighlightDrawable highlightDrawable = this.mHighlightDrawables[i];
                highlightDrawable.highlightView(view);
                view.getOverlay().add((Drawable)highlightDrawable);
                ++i;
            }
        }
        
        @Override
        void removeHighlight(final View view) {
            final HighlightDrawable[] mHighlightDrawables = this.mHighlightDrawables;
            for (int length = mHighlightDrawables.length, i = 0; i < length; ++i) {
                view.getOverlay().remove((Drawable)mHighlightDrawables[i]);
            }
        }
        
        abstract static class HighlightDrawable extends ColorDrawable
        {
            protected final Rect mMargins;
            protected final Rect mPaddings;
            
            public HighlightDrawable() {
                this.mMargins = new Rect();
                this.mPaddings = new Rect();
            }
            
            HighlightDrawable(final int n) {
                super(n);
                this.mMargins = new Rect();
                this.mPaddings = new Rect();
            }
            
            void highlightView(final View view) {
                final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
                    final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)layoutParams;
                    final Rect mMargins = this.mMargins;
                    mMargins.left = viewGroup$MarginLayoutParams.leftMargin;
                    mMargins.top = viewGroup$MarginLayoutParams.topMargin;
                    mMargins.right = viewGroup$MarginLayoutParams.rightMargin;
                    mMargins.bottom = viewGroup$MarginLayoutParams.bottomMargin;
                }
                else {
                    final Rect mMargins2 = this.mMargins;
                    mMargins2.left = 0;
                    mMargins2.top = 0;
                    mMargins2.right = 0;
                    mMargins2.bottom = 0;
                }
                this.mPaddings.left = view.getPaddingLeft();
                this.mPaddings.top = view.getPaddingTop();
                this.mPaddings.right = view.getPaddingRight();
                this.mPaddings.bottom = view.getPaddingBottom();
            }
        }
        
        static class MainHighlightDrawable extends HighlightDrawable
        {
            public void draw(final Canvas canvas) {
                final Rect clipBounds = canvas.getClipBounds();
                final Rect mMargins = super.mMargins;
                clipBounds.inset(-(mMargins.right + mMargins.left), -(mMargins.top + mMargins.bottom));
                if (Build$VERSION.SDK_INT < 26) {
                    canvas.clipRect(clipBounds, Region$Op.REPLACE);
                }
                else {
                    canvas.clipOutRect(clipBounds);
                }
                super.draw(canvas);
            }
            
            @Override
            void highlightView(final View view) {
                super.highlightView(view);
            }
        }
        
        static class MarginBottomHighlightDrawable extends HighlightDrawable
        {
            MarginBottomHighlightDrawable() {
                super(-1426797922);
            }
            
            public void draw(final Canvas canvas) {
                final Rect mMargins = super.mMargins;
                canvas.translate(0.0f, (float)(mMargins.bottom + mMargins.top));
                super.draw(canvas);
            }
            
            @Override
            void highlightView(final View view) {
                super.highlightView(view);
                this.setBounds(0, view.getHeight() - super.mMargins.bottom, view.getWidth(), view.getHeight());
            }
        }
        
        static class MarginLeftHighlightDrawable extends HighlightDrawable
        {
            MarginLeftHighlightDrawable() {
                super(-1426797922);
            }
            
            public void draw(final Canvas canvas) {
                final Rect mMargins = super.mMargins;
                canvas.translate((float)(-(mMargins.left + mMargins.right)), 0.0f);
                super.draw(canvas);
            }
            
            @Override
            void highlightView(final View view) {
                super.highlightView(view);
                final int left = super.mMargins.left;
                final int height = view.getHeight();
                final Rect mMargins = super.mMargins;
                this.setBounds(0, 0, left, height + mMargins.top + mMargins.bottom);
            }
        }
        
        static class MarginRightHighlightDrawable extends HighlightDrawable
        {
            MarginRightHighlightDrawable() {
                super(-1426797922);
            }
            
            public void draw(final Canvas canvas) {
                final Rect mMargins = super.mMargins;
                canvas.translate((float)mMargins.right, (float)(-(mMargins.top + mMargins.bottom)));
                super.draw(canvas);
            }
            
            @Override
            void highlightView(final View view) {
                super.highlightView(view);
                final int width = view.getWidth();
                final int right = super.mMargins.right;
                final int width2 = view.getWidth();
                final int height = view.getHeight();
                final Rect mMargins = super.mMargins;
                this.setBounds(width - right, 0, width2, height + mMargins.top + mMargins.bottom);
            }
        }
        
        static class MarginTopHighlightDrawable extends HighlightDrawable
        {
            MarginTopHighlightDrawable() {
                super(-1426797922);
            }
            
            public void draw(final Canvas canvas) {
                canvas.translate(0.0f, (float)(-super.mMargins.top));
                super.draw(canvas);
            }
            
            @Override
            void highlightView(final View view) {
                super.highlightView(view);
                this.setBounds(0, 0, view.getWidth(), super.mMargins.top);
            }
        }
        
        static class PaddingBottomHighlightDrawable extends HighlightDrawable
        {
            PaddingBottomHighlightDrawable() {
                super(-1430332746);
            }
            
            @Override
            void highlightView(final View view) {
                super.highlightView(view);
                this.setBounds(super.mPaddings.left, view.getHeight() - super.mPaddings.bottom, view.getWidth() - super.mPaddings.right, view.getHeight());
            }
        }
        
        static class PaddingLeftHighlightDrawable extends HighlightDrawable
        {
            PaddingLeftHighlightDrawable() {
                super(-1430332746);
            }
            
            @Override
            void highlightView(final View view) {
                super.highlightView(view);
                this.setBounds(0, 0, super.mPaddings.left, view.getHeight());
            }
        }
        
        static class PaddingRightHighlightDrawable extends HighlightDrawable
        {
            PaddingRightHighlightDrawable() {
                super(-1430332746);
            }
            
            @Override
            void highlightView(final View view) {
                super.highlightView(view);
                this.setBounds(view.getWidth() - super.mPaddings.right, 0, view.getWidth(), view.getHeight());
            }
        }
        
        static class PaddingTopHighlightDrawable extends HighlightDrawable
        {
            PaddingTopHighlightDrawable() {
                super(-1430332746);
            }
            
            @Override
            void highlightView(final View view) {
                super.highlightView(view);
                final int left = super.mPaddings.left;
                final int width = view.getWidth();
                final Rect mPaddings = super.mPaddings;
                this.setBounds(left, 0, width - mPaddings.right, mPaddings.top);
            }
        }
    }
}
