package main.java.ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyFunction;

public class MapDecorator extends SmartArrayDecorator{
    MyFunction myFunc;
    public MapDecorator(SmartArray arr, MyFunction func) {
        super(arr);
        this.myFunc = func;
    }

    @Override
    public Object[] toArray() {
        Object[] insideArr = smartArray.toArray();
        for (int i = 0; i < insideArr.length; ++ i) {
            insideArr[i] = myFunc.apply(insideArr[i]);
        }
        return insideArr;
    }

    @Override
    public String operationDescription() {
        return "Mapping items";
    }

    @Override
    public int size() {
        return 0;
    }
}
