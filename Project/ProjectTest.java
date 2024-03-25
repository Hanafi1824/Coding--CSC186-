package Project;
import java.util.Scanner;

public class ProjectTest {
    public static void main(String[] args) throws Exception {
        int months, categorySpend, ready;
        float income, spending, flowOfCash, averageSpending;
        String username;
        char prompt;

        String totalIncomeEachMonth[12][2] = {
            {"Jan", "0"}, {"Feb", "0"}, {"Mar", "0"}, {"Apr", "0"},
            {"May", "0"}, {"Jun", "0"}, {"Jul", "0"}, {"Aug", "0"},
            {"Sep", "0"}, {"Oct", "0"}, {"Nov", "0"}, {"Dec", "0"}};
        String totalEachMonth[12][2] = {{"Jan", "0"}, {"Feb", "0"}, {"Mar", "0"},
                                        {"Apr", "0"}, {"May", "0"}, {"Jun", "0"},
                                        {"Jul", "0"}, {"Aug", "0"}, {"Sep", "0"},
                                        {"Oct", "0"}, {"Nov", "0"}, {"Dec", "0"}};
        String categorySpendData[10][2] = {
            {"Food", "0"},           {"Housing", "0"},       {"Utilities", "0"},
            {"Transportation", "0"}, {"Clothing", "0"},      {"Health Care", "0"},
            {"Entertainment", "0"},  {"Personal Care", "0"}, {"Education", "0"},
            {"Miscellaneous", "0"}};

        System.out.println("Welcome to our program: ");
        System.out.println("Enter your name: ");
        String username = scan.next();

        for (int i = 0; i < username.length(); i++) {
            if (i == 0) {
                username[i] = toupper(username[i]);
            } else if (username[i] == ' ') {
                username[i + 1] = toupper(username[i + 1]);
            }
        }

        System.out.println("Hello " + (username));
        System.out.println("Do you want to start the program? Enter 'Y' to continue: ");
        prompt = toupper(prompt);

        while (prompt == 'Y') {
            System.out.println(" 1. January    2. February     3. March ");
            System.out.println(" 4. April       5. May          6. June ");
            System.out.println(" 7. July        8. August       9. September ");
            System.out.println("10. October     11. November    12. December ");
            System.out.println("Enter the month you want to record: ");
            int month = scan.nextInt();
            switch (month){
                case 1:
                if (totalEachMonth[0][1] == "0") {
                    System.out.println("Enter your income: RM ");
                    income = scan.nextFloat();
                }
                break;
            case 2:
                if (totalEachMonth[1][1] == "0") {
                    System.out.println("Enter your income: RM ");
                    income = scan.nextFloat();
                }
                break;
            case 3:
                if (totalEachMonth[2][1] == "0") {
                    System.out.println("Enter your income: RM ");
                    income = scan.nextFloat();
                }
                break;
            case 4:
                if (totalEachMonth[3][1] == "0") {
                    System.out.println("Enter your income: RM ");
                    income = scan.nextFloat();
                }
                break;
            case 5:
                if (totalEachMonth[4][1] == "0") {
                    System.out.println("Enter your income: RM ");
                    income = scan.nextFloat();
                }
                break;
            case 6:
                if (totalEachMonth[5][1] == "0") {
                    System.out.println("Enter your income: RM ");
                    income = scan.nextFloat();
                }
                break;
            case 7:
                if (totalEachMonth[6][1] == "0") {
                    System.out.println("Enter your income: RM ");
                    income = scan.nextFloat();
                }
                break;
            case 8:
                if (totalEachMonth[7][1] == "0") {
                    System.out.println("Enter your income: RM ");
                    income = scan.nextFloat();
                }
                break;
            case 9:
                if (totalEachMonth[8][1] == "0") {
                    System.out.println("Enter your income: RM ");
                    income = scan.nextFloat();
                }
                break;
            case 10:
                if (totalEachMonth[9][1] == "0") {
                    System.out.println("Enter your income: RM ");
                    income = scan.nextFloat();
                }
                break;
            case 11:
                if (totalEachMonth[10][1] == "0") {
                    System.out.println("Enter your income: RM ");
                    income = scan.nextFloat();
                }
                break;
            case 12:
                if (totalEachMonth[11][1] == "0") {
                    System.out.println("Enter your income: RM ");
                    income = scan.nextFloat();
                }
                break;
            default:
                System.out.println("Invalid input.");
                break;
            }
            totalIncomeEachMonth[months - 1][1] = to_string(income);

            System.out.println(" 1. Food       2. Housing          3. Utilities        4. Transportation");
            System.out.println(" 5. Clothing   6. Health Care      7. Entertainment   8. Personal Care");
            System.out.println(" 9. Education  10. Miscellaneous ");
            System.out.println("Choose category for your spending: ");
            int category = scan.nextInt();

            System.out.println("Enter your spending: RM ");
            spending = scan.nextFloat();

            switch (categorySpend) {
                case 1:
                categorySpendData[0][1] =
                    to_string(stof(categorySpendData[0][1]) + spending);
                break;
            case 2:
                categorySpendData[1][1] =
                    to_string(stof(categorySpendData[1][1]) + spending);
                break;
            case 3:
                categorySpendData[2][1] =
                    to_string(stof(categorySpendData[2][1]) + spending);
                break;
            case 4:
                categorySpendData[3][1] =
                    to_string(stof(categorySpendData[3][1]) + spending);
                break;
            case 5:
                categorySpendData[4][1] =
                    to_string(stof(categorySpendData[4][1]) + spending);
                break;
            case 6:
                categorySpendData[5][1] =
                    to_string(stof(categorySpendData[5][1]) + spending);
                break;
            case 7:
                categorySpendData[6][1] =
                    to_string(stof(categorySpendData[6][1]) + spending);
                break;
            case 8:
                categorySpendData[7][1] =
                    to_string(stof(categorySpendData[7][1]) + spending);
                break;
            case 9:
                categorySpendData[8][1] =
                    to_string(stof(categorySpendData[8][1]) + spending);
                break;
            case 10:
                categorySpendData[9][1] =
                    to_string(stof(categorySpendData[9][1]) + spending);
                break;
            default:
                System.out.println("Invalid input.");
                break;
            }

            switch (months) {
                case 1:
                    totalEachMonth[0][1] =
                        to_string(stof(totalEachMonth[0][1]) + spending);
                    break;
                case 2:
                    totalEachMonth[1][1] =
                        to_string(stof(totalEachMonth[1][1]) + spending);
                    break;
                case 3:
                    totalEachMonth[2][1] =
                        to_string(stof(totalEachMonth[2][1]) + spending);
                    break;
                case 4:
                    totalEachMonth[3][1] =
                        to_string(stof(totalEachMonth[3][1]) + spending);
                    break;
                case 5:
                    totalEachMonth[4][1] =
                        to_string(stof(totalEachMonth[4][1]) + spending);
                    break;
                case 6:
                    totalEachMonth[5][1] =
                        to_string(stof(totalEachMonth[5][1]) + spending);
                    break;
                case 7:
                    totalEachMonth[6][1] =
                        to_string(stof(totalEachMonth[6][1]) + spending);
                    break;
                case 8:
                    totalEachMonth[7][1] =
                        to_string(stof(totalEachMonth[7][1]) + spending);
                    break;
                case 9:
                    totalEachMonth[8][1] =
                        to_string(stof(totalEachMonth[8][1]) + spending);
                    break;
                case 10:
                    totalEachMonth[9][1] =
                        to_string(stof(totalEachMonth[9][1]) + spending);
                    break;
                case 11:
                    totalEachMonth[10][1] =
                        to_string(stof(totalEachMonth[10][1]) + spending);
                    break;
                case 12:
                    totalEachMonth[11][1] =
                        to_string(stof(totalEachMonth[11][1]) + spending);
                    break;
                default:
                    System.out.println("Invalid month");
                    break;
            }

            System.out.println("");
            System.out.println("Do you want to record another spending? (Y/N): ");
            prompt = scan.nextFloat();
            prompt = toupper(prompt);

            if (prompt == 'N') {
            }
        }

        char promptCheck = "Y";
        while (promptCheck == 'Y') {
            System.out.println("1. Check your spending for each category");
            System.out.println("2. Check your average daily spending for each month");
            System.out.println("3. Check your spending for each month");
            System.out.println("4. Check your cash flow");

            System.out.print("Please choose an option: ");
            int ready = scan.nextInt();

            switch (ready) {
                case 1:
                    System.out.print((fixed) + (showpoint));
                    System.out.println("Your spending for each category: " + (setprecision(2)));
                    for (int i = 0; i < 10; i++) {
                        System.out.println((categorySpendData[i][0]) + ": RM " + (fixed) + (setprecision(2)) + (stof(categorySpendData[i][1])));
                    }
                    break;
                case 2: 
                    System.out.print((fixed) + (showpoint));
                    System.out.println("Your average daily spending for each month: " + (setprecision(2)));
                    for (int i = 0; i < 12; i++) {
                        System.out.println((totalEachMonth[i][0]) + ": RM " + (fixed) + (setprecision(2)) + (stof(totalEachMonth[i][1]) / 30.0));
                    }
                    break;
                case 3: 
                    System.out.print((fixed) + (showpoint));
                    System.out.print("Your spending for each month: " + (setprecision(2)));
                    for (int i = 0; i < 12; i++) {
                        System.out.println((totalEachMonth[i][0]) + ": RM " + (fixed) + (setprecision(2)) + (stof(totalEachMonth[i][1])));
                    }
                    break;
                case 4:
                    System.out.println(" 1. January    2. February     3. March ");
                    System.out.println(" 4. April      5. May          6. June ");
                    System.out.println(" 7. July       8. August       9. September ");
                    System.out.println("10. October   11. November    12. December ");
                    System.out.print("Enter the month you want to see your cash flow: ");
                    int months = scan.nextInt;
                    
                    flowOfCash = cashFlow(stof(totalIncomeEachMonth[months - 1][1]),
                                          stof(totalEachMonth[months - 1][1]));
                    System.out.print((fixed) + (showpoint));
                    System.out.println("Your cash flow for " + (totalEachMonth[months - 1][0]) + " is: RM " + (setprecision(2)) + flowOfCash);
                    if (flowOfCash > 0) {
                        System.outprintln("You have a positive cash flow for this month.");
                    } else if (flowOfCash < 0) {
                        System.out.println("You have a negative cash flow for this month. " + "Please " + "make sure to plan your budget more carefully");
                    } else {
                        System.out.println("You have a zero cash flow for this month. " + "Please " + "make " + "sure to plan your budget more carefully");
                    }
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
            System.out.println("");
            System.out.println("Do you want to check another option? (Y/N): ");
            promptCheck = scan.nextFloat();
            promptCheck = toupper(promptCheck);
            system("cls");
        }
        System.out.println("Thank you for using this program.");
        System("pause");
        return 0;
    }
}