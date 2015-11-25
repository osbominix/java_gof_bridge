package com.gof.designpattern.bridge;

import com.gof.designpattern.bridge.basis.Move;

/**
 * Created by yl3 on 25.11.15.
 */
public class FigureBridge extends Figure  {

    public FigureBridge(Move move) {
        super(move);
    }

    @Override
    public void invokeBridge() {
        move.duang();
        System.out.println("USING BRIDGE...");
        System.out.println();
    }
}
