import java.util.Scanner;

/**
 * This is a special class representing the ReportingIO class. It has a method
 * relating to a menu which allows you to select your retrospective choice( Enter branch data, Sale date, then reporting stats) and
 * methods are called accordingly. In the reporting stats case there is another switch case to that will pluck different stats and
 * accordingly run the correct method in the Reporting Class.
 */
public class ReportingIO {

    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        Reporting reporting = new Reporting();

        int option;
        while (true){
            try
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
                        System.out.println("Enter Branch name: ");
                        String branchName = input.nextLine();
                        reporting.branchNames.add(new Branch(branchName));
                        break;

                    case 2:
                        System.out.println("Enter Branch name: ");
                        String name = input.nextLine();

                        System.out.println("Enter House Number: ");
                        int saleHouseNumb = Integer.parseInt(input.nextLine());

                        System.out.println("Enter Postcode: ");
                        String salePostcode = input.nextLine();

                        System.out.println("Enter Month: ");
                        int saleMonth = Integer.parseInt(input.nextLine());

                        System.out.println("Enter Year: ");
                        int saleYear = Integer.parseInt(input.nextLine());

                        System.out.println("Enter Value: ");
                        double saleValue = Double.parseDouble(input.nextLine());

                        for (Branch branch : reporting.branchNames)
                        {
                            if (branch.name.equals(name))
                            {
                                branch.branchSales.add(new Sale(saleHouseNumb,salePostcode,saleMonth,saleYear,saleValue));
                            }

                        }
                        break;

                    case 3:
                        System.out.println("================================");
                        System.out.println("1. Branch with largest value from given year");
                        System.out.println("2. Highest Sale ever recorded");
                        System.out.println("3. All Sales with greater value than given amount");
                        System.out.println("================================");
                        option=Integer.parseInt(input.nextLine());
                        try {
                            switch (option) {
                                case 1:
                                    System.out.println("Enter year: ");
                                    int year = Integer.parseInt(input.nextLine());
                                    System.out.println(reporting.BranchHighVal(year).name);
                                    break;
                                case 2:
                                    System.out.println(reporting.HighSale());

                                case 3:
                                    System.out.println("Enter price you want to see above: ");
                                    double price = Double.parseDouble(input.nextLine());
                                    System.out.println(reporting.AllBranchHigh(price));
                                    break;
                            }
                        }catch(Exception ignored){
                        break;
                        }


                    case 4:
                        System.out.println("===========Quitting!============");
                        System.exit(0);

                }
            }catch(Exception ignored) {

            }
        }
    }
}
