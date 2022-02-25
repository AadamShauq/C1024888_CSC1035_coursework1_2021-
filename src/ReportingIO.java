import java.util.Scanner;

public class ReportingIO {

    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        Reporting reporting = new Reporting();

        int option;
        {
            System.out.println("================================");
            System.out.println("1. Enter Branch data");
            System.out.println("2. Enter Sale data");
            System.out.println("3. Provide reporting statistics");
            System.out.println("4. Quit");
            System.out.println("================================");
            System.out.println("Enter a number 1 to 4");
            System.out.println("================================");
            option=input.nextInt();

            switch(option)
            {
                case 1:
                    System.in.println("Enter Branch name: ");
                    String branchName = input.nextline();
                    reporting.branchNames.add(new Branch(branchname));

                case 2:
                    System.in.println("Enter House Number: ");
                    String saleHouseNumb = input.nextline();


                    System.in.println("Enter : ");
                    String saleHouseNumb = input.nextline();

                    System.in.println("Enter House Number: ");
                    String saleHouseNumb = input.nextline();

                    System.in.println("Enter House Number: ");
                    String saleHouseNumb = input.nextline();
                case 3:

                case 4:
                    System.out.println("===========Quitting!============");
                    System.exit(0);

            }
        }
    }
}
