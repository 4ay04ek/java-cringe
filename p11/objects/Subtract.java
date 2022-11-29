package objects;

public class Subtract extends Operation {
    public void operate(){
        R = T1 - T2;
    }
    public float evaluate(float p){
        if (needToBeEvaluated1 != null){
            T1 = needToBeEvaluated1.evaluate(p);
        }
        if (needToBeEvaluated2 != null){
            T2 = needToBeEvaluated2.evaluate(p);
        }
        if (var != null) {
            if (T1 == 0) T1 = p;
            else T2 = p;
        }
        operate();
        return getResult();
    }
    public Subtract(Operation p1, Operation p2){
        needToBeEvaluated1 = p1;
        needToBeEvaluated2 = p2;
    }
    public Subtract(Const p1, Operation p2){
        T1 = p1.getNum();
        needToBeEvaluated2 = p2;
    }
    public Subtract(Operation p1, Const p2){
        needToBeEvaluated1 = p1;
        T2 = p2.getNum();
    }
    public Subtract(Const p1, Const p2){
        T1 = p1.getNum();
        T2 = p2.getNum();
        operate();
    }
    public Subtract(Const p1, Variable p2){
        T1 = p1.getNum();
        var = p2;
    }
    public Subtract(Variable p1, Const p2){
        var = p1;
        T2 = p2.getNum();
    }
    public Subtract(Variable p1, Operation p2){
        var = p1;
        needToBeEvaluated2 = p2;
    }
    public Subtract(Operation p1, Variable p2){
        needToBeEvaluated1 = p1;
        var = p2;
    }
}
