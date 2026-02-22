//this is me
public class First
{
	public static void main(String[] args)
	{
		System.out.print("Sakshi");
	}
}

//firstcode
public class Morning
{
	public static void main(String[] args)
	{
		System.out.print("Good Morning");
	}
}

//variable
public class Var {
    public static void main(String[] args)
    {
    int myNumber = 90;
    System.out.println(myNumber);
    }
}

//userinput
import java.util.*;
public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = input.nextLine();
        System.out.println("Good Morning " + name);
    }
}

//swap
import java.util.*;
public class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter 1 num: ");
        int a = input.nextInt();
        System.out.println("enter 2 num: ");
        int b = input.nextInt();

        int c = a;
        a = b;
        b = c;
        System.out.println("enter a: " + a);
        System.out.println("enter b: " + b);
    }
}

//sum
import java.util.*;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter 1 num: ");
        int a = input.nextInt();
        System.out.println("enter 2 num: ");
        int b = input.nextInt();
        int Sum = a+b;
        System.out.println("sum is: " + Sum);
    }
}

//shorthand operator
import java.util.*;
public class Shorthand {
    public static void main(String[] args) {
        int a = 5;
        Scanner input = new Scanner(System.in);
        int x1 = input.nextInt();
        a+=x1;
        System.out.println(a);
        int x2 = input.nextInt();
        a-=x2;
        System.out.println(a);
        int x3 = input.nextInt();
        a*=x3;
        System.out.println(a);
        int x4 = input.nextInt();
        a/=x4;
        System.out.println(a);
        
        

        

    }
}

//product floating numbers
import java.util.*;
public class ProdFloat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first floating number:");
        double a = input.nextDouble();
        System.out.println("enter scond floating number:");
        double b = input.nextDouble();

        double c = a * b;
        System.out.println(c);
    }
}

//perimeter
import java.util.*;
public class Perimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter 1 side:");
        double a = input.nextDouble();
        System.out.println("enter 2 side:");
        double b = input.nextDouble();
        System.out.println("enter 3 side:");
        double c = input.nextDouble();
        System.out.println("enter 4 side:");
        double d = input.nextDouble();

        double P = a+b+c+d;
        System.out.println("per is:" + P); 
    }
}


//area
import java.util.*;
public class Area{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter 1 side:");
        double b = input.nextDouble();
        System.out.println("enter 2 side:");
        double h = input.nextDouble();

        double a = 0.5*b*h;
        System.out.println("area is:" + a);
    }

}

//basic arithmetic
public class Arithmetic {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
    }
}

//if else
import java.util.*;
public class Arithmetics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your age:");
        int age = input.nextInt();

        if(age>=18)
            System.out.println("eligible");
        else
            System.out.println("not eligible");

    }
}

//bitwise And
import java.util.*;
public class BitwiseAnd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first num:");
        int num1 = input.nextInt();
        System.out.println("enter second num:");
        int num2 = input.nextInt();

        int res = num1 & num2;
        System.out.println(res);
    }
}

//bitwise Or
import java.util.*;
public class BitwiseOr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first num:");
        int num1 = input.nextInt();
        System.out.println("enter second num:");
        int num2 = input.nextInt();

        int res = num1 | num2;
        System.out.println(res);
    }
}

//bitwise xor
import java.util.*;
public class BitwiseXor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first num:");
        int num1 = input.nextInt();
        System.out.println("enter second num:");
        int num2 = input.nextInt();

        int res = num1 ^ num2;
        System.out.println(res);
    }
}

//bitwise not
import java.util.*;
public class BitwiseNot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter num:");
        int num = input.nextInt();

        int res = ~num;
        System.out.println(res);
    }
}

//odd even
import java.util.*;
public class BitwiseOddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter num:");
        int num = input.nextInt();

        if((num & 1)==1)
            System.out.println("even");
        else
            System.out.println("odd");
    }
    
}

//compound interest
import java.util.*;
public class Compound {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter principal amount:");
        int p = input.nextInt();
        System.out.println("enter rate:");
        double r = input.nextDouble();
        System.out.println("enter years:");
        int y = input.nextInt();

        double c = p * Math.pow((1+r/100),y);
        System.out.println(c);
    }
}

//escape sequences
public class Escape {
    public static void main(String[] args) {
        System.out.println("hello \"sakshi\"...");
        System.out.println("hello \\sakshi\\...");
        System.out.println("hello\nsakshi...");
        System.out.println("hello\tsakshi...");
        System.out.println("hello\bsakshi...");
    }
}

//greatest of all
import java.util.*;
public class Greatest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number 1:");
        int num1 = input.nextInt();
        System.out.println("enter number 2:");
        int num2 = input.nextInt();
        System.out.println("enter number 3:");
        int num3 = input.nextInt();

        if(num1>=num2 && num1>=num3)
            System.out.println("num1 greater");
        else if(num2>=num3)
            System.out.println("num2 greater");
        else
            System.out.println("num3 greater");

    }
}

//left shift
import java.util.*;
public class  LeftShift{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter num:");
        int num = input.nextInt();

        int res = num<<1;
        System.out.println(res);
    }
}

//number
import java.util.*;
public class Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number:");
        int number = input.nextInt();

        if(number>0)
            System.out.println("positive");
        else if(number<0)
            System.out.println("negative");
        else
            System.out.println("zero");
    }

}

//loop
public class Loop {
    public static void main(String[] args) {
        int i = 500;
        while(i>200)
        {
            System.out.println(i);
            i = i-1;
        }
    }
}

//printing pattern using function
public class Function {
   public static void main(String[] args) {
    printFirstPattern();
   } 
   public static void printFirstPattern()
{
    int rows = 0;
    while(rows<5)
    {
        System.out.print("*");
        int i = 0;
        while(i<rows)
        {
            System.out.print(" *");
            i++;
        }
        System.out.println();
        rows++;
    }
}
}


