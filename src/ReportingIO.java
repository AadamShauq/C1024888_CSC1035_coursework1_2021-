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
            option=Integer.parseInt(input.nextLine());

            switch(option)
            {
                case 1:
                    System.in.println("Enter Branch name: ");
                    String branchName = input.nextLine();
                    reporting.branchNames.add(new Branch(branchname));

                case 2:
                    System.in.println("Enter Branch name: ");
                    String name = input.nextLine();

                    System.in.println("Enter House Number: ");
                    int saleHouseNumb = Integer.parseInt(input.nextLine());

                    System.in.println("Enter Postcode: ");
                    String salePostcode = input.nextLine();

                    System.in.println("Enter Month: ");
                    int saleMonth = Integer.parseInt(input.nextLine());

                    System.in.println("Enter Year: ");
                    int saleYear = Integer.parseInt(input.nextLine());

                    System.in.println("Enter Value: ");
                    double saleValue = Double.parseDouble(input.nextLine());

                    for (Branch branch : reporting.branchNames)
                    {
                        if (branch.name.equals(name))
                        {
                            branch.branchSales.add(new Sale(saleHouseNumb,salePostcode,saleMonth,saleYear,saleValue));
                        }

                    }

                case 3:
                    System.out.println("================================");
                    System.out.println("1. Branch with largest value from given year");
                    System.out.println("2. Highest Sale ever recorded");
                    System.out.println("3. All Sales with greater value than given amount");
                    System.out.println("================================");
                    choice=Integer.parseInt(input.nextLine());

                    switch(choice)
                    {
                        case 1:
                            System.in.println("Enter year: ");
                            int year = Integer.parseInt(input.nextLine());
                            reporting.BranchHighVal(year);
                        case 2:
                            reporting.HighSale();

                        case 3:
                            System.in.println("Enter price you want to see above: ");
                            double price = double.parsedouble(input.nextLine());
                            reporting.AllBranchHigh(price);
                    }



                case 4:
                    System.out.println("===========Quitting!============");
                    System.exit(0);

            }
        }
    }
}
