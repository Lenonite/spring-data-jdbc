package com.solt.evaluator;

import com.solt.ds.Pair;

public class AddEvaluator implements Evaluator{
    @Override
    public int evaluate(Pair pair) {
        return pair.getA()+pair.getB();
    }
}
