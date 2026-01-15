import java.util.Scanner;

public class budget_tracker {
        private double balance;
        public budget_tracker() {
            balance = 0.0;
        }
        public void addIncome(double amount) {
                balance += amount;
        }
        public void addExpense(double amount) {
            balance -= amount;
        }
        public double getBalance(){
            return balance;
        }

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            budget_tracker  tracker = new budget_tracker();
            //create a menu like system for the tracker
            while(true){
                System.out.println("1.Add Income");
                System.out.println("2.Add Expense");
                System.out.println("3.View balance");
                System.out.println("4.exit");
                System.out.println("Enter your choice:");
                int choice = sc.nextInt();
                switch(choice){
                    case 1:
                        System.out.println("Enter Income Amount:");
                        double income = sc.nextDouble();
                        tracker.addIncome(income);
                        break;
                    case 2:
                        System.out.println("Enter Expense Amount:");
                        double expense = sc.nextDouble();
                        tracker.addExpense(expense);
                        break;
                    case 3:
                        System.out.println("Current Rs" + tracker.getBalance());
                        break;
                    case 4:
                        System.out.println("Exiting ... Thank you");
                        return;

                    default:
                        System.out.println("Invalid choices. Please Try again");
                }

            }

        }



}
