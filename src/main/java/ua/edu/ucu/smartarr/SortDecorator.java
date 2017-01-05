package main.java.ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyComparator;

import java.util.Arrays;

public class SortDecorator extends SmartArrayDecorator {

    MyComparator myComp;

    public SortDecorator(SmartArray smartArray, MyComparator comp) {
        super(smartArray);
        this.myComp = comp;
    }

    @Override
    public Object[] toArray() {
        Object[] insideArr = smartArray.toArray();
        Arrays.sort(insideArr, myComp);
        return insideArr;
    }

    @Override
    public String operationDescription() {
        return "Comparing";
    }

    @Override
    public int size() {
        return toArray().length;
    }
}
