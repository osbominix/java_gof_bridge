package com.gof.designpattern.bridge;

import com.gof.designpattern.bridge.basis.Move;

/**
 * Created by yl3 on 25.11.15.
 */
public abstract class Figure {

    protected Move move;

    public Figure(Move move) {
        this.move = move;
    }

    public abstract void invokeBridge();

}
