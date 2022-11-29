package objects;

public abstract class Operation implements IOperation {
    protected Operation needToBeEvaluated1, needToBeEvaluated2;
    protected Variable var;
    protected float R, T1 = 0, T2 = 0;
    protected float getResult(){
        return R;
    }
}
