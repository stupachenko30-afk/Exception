public class MainHomework {
    public static void main(String[] args) {
        int res = parseAndSum2("-2", "a");
        System.out.println(res);

    int[] ar = {9, -2, 7, 1};
        int res1 = 0;
        try {
            res1 = findSum(ar, 2, "6");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(res1);



            String[] ar2 = {"2.4", "7.8", "6.1", "-2.3", "9.4"};
            double result = findParseSum(ar2, 2, 4);
            System.out.println(result);
        }




    public static int parseAndSum2(String s1, String s2) {
        int sum = 0;
        try {

            int num1 = Integer.parseInt(s1);
            int num2 = Integer.parseInt(s2);

             sum = num1 + num2;

            return sum;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Error2");
        }
        return  sum ;
    }




    public static int findSum(int[] ar, int index, String s)throws Exception {
        try {

        int numberFromArray = ar[index];  //беру число из массива по индексу.
        int numberFromString = Integer.parseInt(s);  //парсю строку в число

        int sum = numberFromArray + numberFromString;
            return sum;
        }catch (NumberFormatException e) {
            throw new NumberFormatException("Invalid stream");
           // System.out.println(e.getMessage());
          //  System.out.println("Number Error");
       // return 0;

        }catch (Exception e)

    {

        System.out.println("Error: " + e.getClass().getSimpleName()); //е хранит информацию об ошибке, класс и имя ошибки
        System.out.println("Error1: " + e.getMessage());
    }
        return 0;

    }

    public static double findParseSum(String[] ar, int index1, int index2) {
        try {

            String s1 = ar[index1];  //беру строку из массива с индексом1
            String s2 = ar[index2];
            double num1 = Double.parseDouble(s1);
            double num2 = Double.parseDouble(s2);
            double sum = num1 + num2;
            return sum;

        }catch (Exception e){
            System.out.println("Error: " + e.getClass().getSimpleName());

            return 0;

       // }catch (NumberFormatException e){
         //   System.out.println(e.getMessage());
        }
//        return 0;
    }
    }



