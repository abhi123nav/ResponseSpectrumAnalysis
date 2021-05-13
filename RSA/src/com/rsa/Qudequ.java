package com.rsa;

public class Qudequ {

	public float[] findRoots(float a, float b, float c)
    {
        // If a is 0, then equation is not
        // quadratic, but linear
		float arr[]=new float[2];
		arr[0]=Integer.MAX_VALUE;
		arr[1]=Integer.MAX_VALUE;
        if (a == 0) {
            System.out.println("Invalid");
            return arr;
        }
 
        float d = b * b - 4 * a * c;
        float sqrt_val =(float) Math.sqrt(Math.abs(d));
        System.out.println(a+" "+b+" "+c+" "+ sqrt_val);
 
        // Real Roots
        if (d > 0) {
            arr[0]=(float)(-1*b + sqrt_val)/ (2 * a);
            arr[1]=(float)(-1*b - sqrt_val)/ (2 * a);
            System.out.println(arr[0]+" "+arr[1]);
            return arr;
        }
 
        // Imaginary Roots
        else {
           return arr;
        }
    }
}
