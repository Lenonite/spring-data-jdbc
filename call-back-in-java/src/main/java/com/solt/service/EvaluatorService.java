package com.solt.service;

import com.solt.ds.Pair;
import com.solt.evaluator.Evaluator;
import com.solt.render.RenderExpression;

public class EvaluatorService {


    public void takeAction(Evaluator evaluator, RenderExpression render, Pair pair){
        render.display(evaluator.evaluate(pair));
    }
}
