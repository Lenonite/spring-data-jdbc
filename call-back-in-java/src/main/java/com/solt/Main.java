package com.solt;

import com.solt.ds.Pair;
import com.solt.evaluator.AddEvaluator;
import com.solt.evaluator.MutiplyEvaluator;
import com.solt.render.FormalRender;
import com.solt.render.VerboseRender;
import com.solt.service.EvaluatorService;

public class Main {
    public static void main(String[] args) {
        EvaluatorService service=new EvaluatorService();
        service.takeAction(
                a->a.getA()*a.getB(),
                a-> System.out.println(a),
                new Pair(5,7)


        );
    }
}
