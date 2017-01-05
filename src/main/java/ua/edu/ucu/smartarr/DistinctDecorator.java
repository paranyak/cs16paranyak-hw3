package main.java.ua.edu.ucu.smartarr;


import java.util.Arrays;



public class DistinctDecorator extends SmartArrayDecorator {


    public DistinctDecorator(SmartArray arr) {
        super(arr);

    }


    @Override
    public Object[] toArray() {
        Object[] insideArr = smartArray.toArray();
        Object[] tmp = new Object[insideArr.length];
        int k = 0;
        for (int i = 0; i < insideArr.length; ++i) {
            for (int j = i + 1; j < insideArr.length; ++j) {
                if (insideArr[i].equals(insideArr[j])) break;
                if (j == insideArr.length - 1) {
                    tmp[k] = insideArr[i];
                    k++;
                }

            }
        }
        tmp[k] = insideArr[insideArr.length - 1];
        k++;

        return Arrays.copyOf(tmp, k);
    }

    @Override
    public String operationDescription() {
        return "Removing duplicates";
    }

    @Override
    public int size() {
        return toArray().length;
    }
}
