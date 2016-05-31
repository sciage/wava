/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 daimajia
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.github.hujiaweibujidao.wava.animator;

import android.view.View;

import com.github.hujiaweibujidao.wava.BaseViewAnimator;
import android.animation.ObjectAnimator;


public class StandUpAnimator extends BaseViewAnimator {
    @Override
    public void prepare() {
        float x = (mTarget.getWidth() - mTarget.getPaddingLeft() - mTarget.getPaddingRight()) / 2
                + mTarget.getPaddingLeft();
        float y = mTarget.getHeight() - mTarget.getPaddingBottom();
        mAnimatorSet.playTogether(
                ObjectAnimator.ofFloat(mTarget, "pivotX", x, x, x, x, x),
                ObjectAnimator.ofFloat(mTarget, "pivotY", y, y, y, y, y),
                ObjectAnimator.ofFloat(mTarget, "rotationX", 55, -30, 15, -15, 0)
        );
    }
}
