import java.util.Scanner;

public class CliBankingApp {

private static final Scanner Scanner=new Scanner(System.in);
public static void main(String[] args) throws Exception{
    
    final String CLEAR = "\033[H\033[2J";
    final String COLOR_BLUE_BOLD = "\033[34;1m";
    final String COLOR_RED_BOLD = "\033[31;1m";
    final String COLOR_GREEN_BOLD = "\033[33;1m";
    final String RESET = "\033[0m";
    final String ERROR_MSG = String.format("\t%s%s%s\n", COLOR_RED_BOLD, "%s", RESET);
    final String SUCCESS_MSG = String.format("\t%s%s%s\n", COLOR_GREEN_BOLD, "%s", RESET);

    final String DASHBOARD = "💵 Welcome to Smart Banking";
    final String CREATE_NEWACCOUNT = "➕ Create New Account";
    final String DEPOSITS = "DEPOSITS";
    final String WITHDRAWS = "🖨 WITHDRAWS";
    final String TRANSFERS = "🖨 TRANSFERS";
    final String CHECK_ACCOUNT_BALANCE = "🖨 CHECK ACCOUNT BALANCE";
    final String DELETE_ACCOUNT = "🖨 DELETE ACCOUNT";

    String screen=DASHBOARD;
    do{
        final String APP_TITLE = String.format("%s%s%s",COLOR_BLUE_BOLD, screen, RESET);
        System.out.println(CLEAR);
       
        System.out.println("\t" + APP_TITLE + "\n");
         switch(screen){
    
    
            case DASHBOARD:
            
            System.out.println("\t[1]. Create New Account");
            System.out.println("\t[2]. Deposits");
            System.out.println("\t[3]. Withdrawals");
            System.out.println("\t[4]. Transfer");
            System.out.println("\t[5]. Print Statement");
            System.out.println("\t[6]. Delete Account");
            System.out.println("\t[7]. Exit");
    
    
            String Str1="\tEnter an option to continue:";
            for (int i = 0; i < Str1.length(); i++) {
                System.out.print(Str1.charAt(i));
                Thread.sleep(50);
                
            }
          
            // System.out.print("\tEnter an option to continue: ");
    
            int option=Scanner.nextInt();
            Scanner.nextLine();
            System.out.println(option);
    
            switch (option) {
                
                    case 1: screen = CREATE_NEWACCOUNT; break;
                    case 2: screen = DEPOSITS; break;
                    case 3: screen = WITHDRAWS; break;
                    case 4: screen = TRANSFERS; break;
                    case 5: screen = CHECK_ACCOUNT_BALANCE; break;
                    case 6: screen = DELETE_ACCOUNT; break;
                    case 7: System.out.println(CLEAR); System.exit(0);
                    default: continue;
                }
                break;

                case CREATE_NEWACCOUNT:
                //-------
                
                String [][] customers=new String[0][];
                 String id;
                 String Name;
                 double Deposits;
                 do{

                    //////id validation
                    do{

                System.out.println("\n\tID format=SDB-####");
                System.out.print("\tID: ");
                id = Scanner.nextLine().strip();

                textValidation(id);

                    }while(true);

                }while(true);
                
                
               
            }
                
            }while(true);    
    
    
}
public static void textValidation(String text){
    
    if (text.isEmpty()) {
        System.out.printf(ERROR_MSG,"%s Can't be empty",text);
        continue;
    }


}


}