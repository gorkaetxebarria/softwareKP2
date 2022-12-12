

//Create a PUBLIC repository in GitLab
//Test the exam function using parameters
//Upload your solution to the master or main branch
//Create the branch "Mock"
//Test the exam function using partial mocks and imagine that "squareCalc" and "getDigit" are under development
//Upload this solution to the "Mock" branch
//Create a TestSuite to run both tests in the "Mock" branch
//Share with me your PUBLIC repository (only the link)
//Upload your complete solution to Mudle


//public static Collection<Object[]> numbers() {return Arrays.asList(new Object[][] {});

public class exam2 {

    public  boolean exam(int n){
        int sum = 0;
        int square = squareCalc(n);
        while(square != 0)
        {
            int digit = getDigit(square);
            sum = sum + digit;
            square = square / 10;
        }
        if(n == sum)
            return true;
        else
            return false;
    }

    public  int squareCalc(int n) {
        return n*n;
    }

    public int getDigit (int s) {
        return s % 10;
    }

}
