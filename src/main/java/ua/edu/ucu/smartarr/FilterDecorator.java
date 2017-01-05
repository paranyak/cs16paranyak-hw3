package main.java.ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyPredicate;

import java.util.Arrays;

public class FilterDecorator extends SmartArrayDecorator {
    MyPredicate myPred;

    public FilterDecorator(SmartArray arr, MyPredicate pred) {
        super(arr);
        this.myPred = pred;
    }


    @Override
    public Object[] toArray() {
        Object[] insideArr = smartArray.toArray();
        Object[] tmp = new Object[insideArr.length];
        int k = 0;
        for (int i = 0; i < insideArr.length; ++i) {
            if (myPred.test(insideArr[i])) {
                tmp[k] = insideArr[i];
                ++k;
            }
        }
        return Arrays.copyOf(tmp, k);
    }

    @Override
    public String operationDescription() {
        return "Filtering array ";
    }

    @Override
    public int size() {
        return toArray().length;
    }
}
