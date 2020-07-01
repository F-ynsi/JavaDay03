public class Main {

    //////////////////////////////////////////////////////////////////////////////////////////
    ////Basic
    ///A1
    public static void checkPn (double myNumber){
        if(myNumber > 0) {
            ;
            System.out.println(myNumber + " is positive");
        }else {
            System.out.println(myNumber + " is negative");
        }

    }


    ////////////////////////////////////////////////////////////////////////////////////
    ///Basic
    ///A2
    public static void a2Check (double myNum){
        if(myNum == 0){
            System.out.println("The number is zero");
        } else {
            if(myNum<0){
                System.out.println(myNum + " is a negative number.");


            } else {
                if(myNum<1){
                    System.out.println(myNum + " is a small positive number");

                } else if (myNum > 1000000) {
                    System.out.println(myNum + " is large positive number");

                }else{
                    System.out.println(myNum +" is a positive number");
                }
            }
          }
    }
    //////////////////////////////////////////////////////////////////////////////////////
    ///Basic
    ///A3/////a)
    public static void weekDays (int v){
        if (v == 1){
            System.out.println("Today is Monday");
        } else if (v == 2){
            System.out.println("Today is Tuesday");
        } else if (v == 3){
            System.out.println("Today is Wednesday");
        } else if (v == 4){
            System.out.println("Today is Thursday");
        } else if (v == 5){
            System.out.println("Today is Friday");
        } else if (v == 6){
            System.out.println("Today is Saturday");
        } else if (v== 7){
            System.out.println("Today is Sunday");
        } else{
            System.out.println("Week has only 7 days!");
        }
        }

        ///A3///C)
        public static void wDswitch (int v){
            switch (v) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                default:
                    System.out.println("Week has only 7 days!");
            }
        }


        /////////////////////////////////////////////////////////////////////////////////////
        ///Intermediate
        ///A4
        public static void maxNum (double a, double b){
            if (a>=b) {
                System.out.println("max is : " + a);
            }else {
                System.out.println("max is : " + b);
            }
        }
        ////////A5
        public static void evenOdd (int x){
            if (x % 2==0)  {
                System.out.println("The number is even");

            }else {
                System.out.println("The number is odd");
            }
        }
        ////////A6
        public static void fB (int z){
            if ((z % 3 == 0) && (z % 5 == 0)) {
                System.out.println("FizzBuzz");
            }else if (z % 3 == 0) {
                {
                    System.out.println("Fizz");
                }else if (z % 5 == 0) {
                    {
                        System.out.println("Buzz");
                    }else {
                        System.out.println( z + " is not multiple of 3 or 5 ");
                    }
                }
            }
        }










    ////////////////////////////// MAIN //////////////////////////////////////////////////
    public static void main(String[] args) {
        checkPn(10);
        a2Check(15000000);
        weekDays(3);
        wDswitch(5);
        maxNum(500 , 20);
        evenOdd(8);
        fB (4);
    }
}


