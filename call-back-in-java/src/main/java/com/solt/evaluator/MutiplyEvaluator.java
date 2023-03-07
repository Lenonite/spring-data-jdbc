package com.solt.evaluator;

import com.solt.ds.Pair;

public class MutiplyEvaluator implements Evaluator{

    @Override
    public int evaluate(Pair pair) {
        return pair.getA()*pair.getB();
    }
}
