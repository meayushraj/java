package com.random;

import static com.random.Hashing.countFrequency;

public class RandomMain {

    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 3, 4, 1};
//        Pattern pattern = new Pattern();
//        pattern.nTriangle(5);
//        pattern.nNumberTriangle(5);
//        pattern.halfSymmetry(10);
//        pattern.symmetry(10);

        countFrequency(6, 4, arr);


    }
}
