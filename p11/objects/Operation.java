package objects;

public abstract class Operation implements IOperation {
    protected Operation needToBeEvaluated1, needToBeEvaluated2;
    protected Variable var1, var2;
    protected float R, T1 = 0, T2 = 0;
    protected float getResult(){
        return R;
    }
    public float evaluate(float p){
        if (needToBeEvaluated1 != null){
            T1 = needToBeEvaluated1.evaluate(p);
        }
        if (needToBeEvaluated2 != null){
            T2 = needToBeEvaluated2.evaluate(p);
        }
        T1 = var1 == null ? T1 : p;
        T2 = var2 == null ? T2 : p;
        operate();
        return getResult();
    }
    public Operation(Operation p1, Operation p2){
        needToBeEvaluated1 = p1;
        needToBeEvaluated2 = p2;
    }
    public Operation(Const p1, Operation p2){
        T1 = p1.getNum();
        needToBeEvaluated2 = p2;
    }
    public Operation(Operation p1, Const p2){
        needToBeEvaluated1 = p1;
        T2 = p2.getNum();
    }
    public Operation(Const p1, Const p2){
        T1 = p1.getNum();
        T2 = p2.getNum();
        operate();
    }
    public Operation(Const p1, Variable p2){
        T1 = p1.getNum();
        var2 = p2;
    }
    public Operation(Variable p1, Const p2){
        var1 = p1;
        T2 = p2.getNum();
    }
    public Operation(Variable p1, Operation p2){
        var1 = p1;
        needToBeEvaluated2 = p2;
    }
    public Operation(Operation p1, Variable p2){
        needToBeEvaluated1 = p1;
        var2 = p2;
    }
    public Operation(Variable p1, Variable p2){
        var1 = var2 = p2;
    }
}
