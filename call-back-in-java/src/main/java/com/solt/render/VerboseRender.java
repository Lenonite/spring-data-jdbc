package com.solt.render;

public class VerboseRender implements RenderExpression{
    @Override
    public void display(int num) {
        System.out.println(String.format("num=[%s]",num));
    }
}
