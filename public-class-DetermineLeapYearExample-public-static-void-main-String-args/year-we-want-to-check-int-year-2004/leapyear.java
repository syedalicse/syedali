public class DetermineLeapYearExample {
        public static void main(String[] args) {

               
                int y = 2004;
                if((y % 400 == 0) || ((y % 4 == 0) && (y % 100 != 0)))
             System.out.println("Y " + y + " is a leap year");            
             else           
             System.out.println("Y " + y + " is not a leap year")};    }  }
