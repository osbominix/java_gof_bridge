package com.gof.designpattern;

import com.gof.designpattern.bridge.Figure;
import com.gof.designpattern.bridge.FigureBridge;
import com.gof.designpattern.bridge.basis.FlyFigure;
import com.gof.designpattern.bridge.basis.WalkFigure;

/**
 * Created by yl3 on 25.11.15.
 */
public class CommandCenter {
    public static void main(String[] args) {
        Figure flyFigure = new FigureBridge(new FlyFigure());
        Figure moveFigure = new FigureBridge(new WalkFigure());

        flyFigure.invokeBridge();
        moveFigure.invokeBridge();
    }
}
