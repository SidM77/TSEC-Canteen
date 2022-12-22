 

import java.io.*;
import java.text.*;    
import java.util.*;
public class project_one
{
    static InputStreamReader read=new InputStreamReader(System.in);
    static BufferedReader in=new BufferedReader(read);
    boolean j_check=true;
    static int order_no=1;
    static project_one ob=new project_one();
      
    static boolean x=true,add_on_checker=false;
    String re="";
    static int opt;
    int customm=0;
    public int n[]={1,2,3,4,5,6,7,8,9,10};
    public int choice,choice_2,choice_3;
    public static String ch[]={"Espresso","Coffee Frappuccino®","Frappuccino without Coffee®","Cold Brew®","Freshly brewed coffee","Create your Perfect Drink®","Finish Order and Bill Me"};
    public String Espressos[]={"Flat White","Caramel Macchiato","Caramel Mocha","Vanilla Latte","Puro Espresso","Caffe Americano","Capuccino"};
    public String Frappuccino[]={"Mocha","Java Chip","Caramel Java Chip","Tahitian Vanilla®","Coffee","Cold Coffee","Caramel"};
    public String free_Frap[]={"Vanilla Cream","Caramel Cream","Double Chocolate chip","Green Tea Cream","Strawberries and Creme"};
    public String Cold_B[]={"Cold Brew Black","Vanilla Cream Cold Brew"};
    public String fresh[]={"Brewed Coffee","French Press","Kenya Coffee","Indian Estate Premium"};
    public String sizes[]={"Short","Tall","Grande","Venti"};
    public String temp[]={"Hot","Iced"};
    public String milks[]={"Regular","Non-Fat","Soy"};
    public String sauces[]={"Vanilla","Hazelnut","Caramel","Chocolate","Strawberry","No sauce"};
    public String add_ons[]={"Choclate Chips","Extra Whipped Cream","No Add-On"};
    public String order_specs[]=new String[20];
    
    public int order_num[]=new int[20];
    public int costs []=new int[20];
    public int s []=new int[20];
    String selector;
    int counter=0,total =0;
    int base=0;
    static int sh=0;
    String random=" ";
    void decoration()throws IOException
        {
            
            DateFormat dtf =new SimpleDateFormat("dd/MM/yy HH:mm");  
            Date now= new Date();
            Date now1= new Date();
            System.out.println("\t\t     ##########   ##########   #########  ######### ©       ");
            System.out.println("\t\t         ##       ###          ###        ##      ");
            System.out.println("\t\t         ##       ##########   #########  ##       ");
            System.out.println("\t\t         ##              ###   ###        ##        ");
            System.out.println("\t\t         ##       ##########   #########  #########        ");
            
            System.out.println("\t\t                Welcome to TSEC Canteen®.");
            System.out.println("\t\t\t     Est.1970 All Rights Reserved");
            System.out.println("\t\t\t\t   "+(dtf.format(now)));
            System.out.println("====================================================================================");
        if(sh==0)
        {
        
            System.out.println("\t   Here at TSEC® our number one priority is customer satisfaction.");
            System.out.println("  Your drink should be perfect every time whether it's something on the menu or not");
            
            System.out.println("====================================================================================");
        }
        sh=1; 
        }
    public static void main()throws IOException
    {
        boolean repeat_order=true;
        
        do{
            project_one ob=new project_one();
            ob.decoration();
            do{
                System.out.println("\t   Do you want to view the menu before ordering, if so press M");
                System.out.print("\t\t\t\t\t   ");
                String menu_choice=in.readLine();
                if(menu_choice.equalsIgnoreCase("M"))
                {
                    ob.clearScreen();
                    ob.menu();
                }
                ob.clearScreen();
                opt=ob.selection();
                if(opt==7)
                {
                    repeat_order=ob.bill();
                    x=false;
                }
                else
                {
                ob.loading();
                ob.clearScreen();
            
                String d2=ob.choice_distributing(opt);
                if(d2!="Custom")
                System.out.println("\t\t   OK, we will now proceed on to your drink's size and number");
            
                ob.loading();
                ob.clearScreen();
                x=ob.size_num(d2);
                }
            
            }while(x==true);
            if(opt!=7)
            {   ob.loading();
                System.out.println("\u000c");
                repeat_order=ob.bill();
                opt=7;
            }
            x=true;
            sh=0;
        }while(repeat_order==true);
    }
    boolean bill()throws IOException
    {
        for(int i=0;i<=50;i++)
        {
            System.out.println();
        }
        DateFormat dtf =new SimpleDateFormat("dd/MM/yy HH:mm");  
        Date now= new Date();
        Date now1= new Date();
        System.out.println("\t\t\t\t  TSEC CANTEEN Pvt.®");
        System.out.println("\t\t\t\tGSTIN : 23HRM98YFRGG");
        System.out.println("            ============================================================");
        System.out.println("\t\t\t\t  Bandra(West)-Bombay®");
        System.out.println("\t\t\t32nd Road, Off Linking Road-400050");
        System.out.println("\t\t\t\tPhone : 022-25891263");
        System.out.println("            ============================================================");
        System.out.println("\t\t\t\t   TAX INVOICE-"+order_no);
        System.out.println("\t\t\t     Date and time "+(dtf.format(now)));
        System.out.println("            ============================================================");
                
        order_no++;
        System.out.print("\t    ");
        
            System.out.print("Item");
            int io=32-("Item".length());
            for(int w=0;w<=io;w++)System.out.print(" ");
            System.out.print("|");
            System.out.print("   Rate");
            io=6-("Rate".length());
            for(int w=0;w<=io;w++)System.out.print(" ");
            System.out.print("|");
            System.out.print("Qty");
            io=3-("Qty".length());
            for(int w=0;w<=io;w++)System.out.print(" ");
            System.out.print("|");
            System.out.print("Item Total");
            io=5-("Iteam Total".length());
            for(int w=0;w<=io;w++)System.out.print(" ");
            System.out.print("|");
            System.out.println();
            System.out.println();
            
        for(int i=0;i<counter;i++)
        {
            System.out.print("\t    ");
            total+=(s[i]*order_num[i]);
            System.out.print(order_specs[i]);
            io=32-(order_specs[i].length());
            for(int w=0;w<=io;w++)System.out.print(" ");
            System.out.print("|");
            System.out.print("Rs."+s[i]);
            io=((s[i]<1000)?3:2);
            for(int w=0;w<=io;w++)System.out.print(" ");
            System.out.print("|");
            System.out.print(order_num[i]);
            io=((order_num[i]<10)?2:1);
            for(int w=0;w<=io;w++)System.out.print(" ");
            System.out.print("|");
            System.out.print("Rs."+s[i]*order_num[i]);
            io=6-((s[i]*order_num[i])%100);
            for(int w=0;w<=io;w++)System.out.print(" ");
            System.out.println();
        }
        double cgst=total*2.5/100;
        double sgst=total*2.5/100;
        System.out.println("\t    -------------------------------------------------------------");
        System.out.println("\t    Base Total                       |               |Rs."+total);
        System.out.println("\t    CGST                             |      2.5%     |Rs."+cgst);
        System.out.println("\t    SGST                             |      2.5%     |Rs."+sgst);
        System.out.println("\t    -------------------------------------------------------------");
        System.out.println("\t    Grand Total(rounded off)         |               |Rs."+Math.round(total+cgst+sgst));
        System.out.println("        \t\tDo you move on to the next order?(Y for Yes)");
        System.out.print("\t\t\t\t\t     ");
        random=in.readLine();
        if(random.equalsIgnoreCase("Y"))
        {    
            ob.loading();
            
            System.out.println("\u000c");
            return true;
        }
        else
        return false;
    }
    int selection()throws IOException
    {
        System.out.println("\t\t\t\tMake a choice to continue");
        while(j_check=true)
        {
            for(int i=0;i<ch.length;i++)
            {
                System.out.print("\t\t\t   |"+n[i]+"|"+ch[i]);
                int a=28-(ch[i].length());
                for(int w=0;w<=a;w++)
                System.out.print(" ");
                System.out.print("|");
                System.out.println();
            }
           
        
            String choice_type="";
            
            boolean checker=false;
            do{
                System.out.print("\t\t\t\t\t   ");
                choice_type=in.readLine();
                for(int i=0;i<=choice_type.length()-1;i++)
                {
                    char ch=choice_type.charAt(i);
                    if(ch!='0'&&Character.isDigit(ch))
                        checker=true;
                    else
                    {
                        checker=false;
                        break;
                    }
                }
                if(checker==true)
                {
                    break;
                }
            
                else 
                {   
                    ob.clearScreen();
                    System.out.println("\t\t\t\tWrong choice retry");
                    for(int i=0;i<ch.length;i++)
                    {
                        System.out.print("\t\t\t   |"+n[i]+"|"+ch[i]);
                        int a=28-(ch[i].length());
                        for(int w=0;w<=a;w++)
                        System.out.print(" ");
                        System.out.print("|");
                        System.out.println();
                    }  
                }
            }while(checker==false);
            choice=Integer.parseInt(choice_type);
            if(choice==7)
            {
                if(counter!=0)
                break;
                else
                {
                    ob.clearScreen();
                    System.out.println("\t\t\t\tNothing in cart");
                    
                }
            }
            else if(choice<=6)
            break;
            else
            {
                ob.clearScreen();
                System.out.println("\t\t\t\tWrong choice, retry");
                
            }
        }
         
            return choice;
    
    }


    public void loading()
    {
        System.out.print("\t\t\t        Loading");
        for(int i=0;i<=6;i++)
        {
            for(long ll=0;ll<=99459999;ll++)
            {
            }
               System.out.print(".");
        }
        System.out.println();
    }
    public String choice_distributing(int decider)throws IOException
    {
            System.out.println("\t\t\t     You have chosen-"+ch[opt-1]);
            selector="";
            j_check=true;
            
            switch(decider)
            {
                case 1:
                while(j_check=true)
                {
                    boolean checker=false;
                    String choice_type="";
                    do
                    {
                         ob.disp_selection_drink(Espressos);
                         checker=false;
                         choice_type="";
                    
                         System.out.print("\t\t\t\t\t   ");choice_type=in.readLine();
                         for(int i=0;i<=choice_type.length()-1;i++)
                          {
                           char ch=choice_type.charAt(i);
                           if(ch!='0'&&Character.isDigit(ch))
                           checker=true;
                           else
                           {
                               checker=false;
                               break;
                           }
                          }
                         if(checker==true)
                         break;
                         else
                         {
                             ob.clearScreen();
                             System.out.println("\t\t\t\tWrong choice retry");
                         }
                    }while(checker==false);
                    choice_2=Integer.parseInt(choice_type);
                    if(choice_2<=7&&choice>=1)
                    break;
                    else
                    {
                        ob.clearScreen();
                        System.out.println("\t\t\t\tWrong choice, retry");
                    }
                }
                if(choice_2<5)
                base=150;
                else
                base=130;
                selector=Espressos[choice_2-1];
                j_check=false;
                break;
                case 2:
                while(j_check=true)
                {
                    boolean checker=false;
                    String choice_type="";
                    do
                    {
                         ob.disp_selection_drink(Frappuccino);
                         checker=false;
                         choice_type="";
                    
                         System.out.print("\t\t\t\t\t   ");
                         choice_type=in.readLine();
                         for(int i=0;i<=choice_type.length()-1;i++)
                          {
                           char ch=choice_type.charAt(i);
                           if(ch!='0'&&Character.isDigit(ch))
                           checker=true;
                           else
                           {
                               checker=false;
                               break;
                           }
                          }
                         if(checker==true)
                         break;
                         else
                         {
                             ob.clearScreen();
                             System.out.println("\t\t\t\tWrong choice retry");
                         }
                    }while(checker==false);
                    choice_2=Integer.parseInt(choice_type);
                    if(choice_2<=7&&choice>=1)
                    break;
                    else
                    {
                        ob.clearScreen();
                        System.out.println("\t\t\t\tWrong choice, retry");
                    }
                }
                if(choice_2<5)
                base=195;
                else
                base=180;
                selector=Frappuccino[choice_2-1];
                j_check=false;
                break;
                case 3:
                while(j_check=true)
                {
                    boolean checker=false;
                    String choice_type="";
                    do
                    {
                         ob.disp_selection_drink(free_Frap);
                         checker=false;
                         choice_type="";
                    
                         System.out.print("\t\t\t\t\t   ");choice_type=in.readLine();
                         for(int i=0;i<=choice_type.length()-1;i++)
                          {
                           char ch=choice_type.charAt(i);
                           if(ch!='0'&&Character.isDigit(ch))
                           checker=true;
                           else
                           {
                               checker=false;
                               break;
                           }
                          }
                         if(checker==true)
                         break;
                         else
                         {
                             ob.clearScreen();
                             System.out.println("\t\t\t\tWrong choice retry");
                         }
                    }while(checker==false);
                    choice_2=Integer.parseInt(choice_type);
                    
                    if(choice_2<=5&&choice>=1)
                    break;
                    else
                    {
                        ob.clearScreen();
                        System.out.println("\t\t\t\tWrong choice, retry");
                    }
                }
                if(choice_2<4)
                base=160;
                else
                base=155;
                selector=free_Frap[choice_2-1];
                break;
                case 4:
                while(j_check=true)
                {
                    boolean checker=false;
                    String choice_type="";
                    do
                    {
                         ob.disp_selection_drink(Cold_B);
                         checker=false;
                         choice_type="";
                    
                         System.out.print("\t\t\t\t\t   ");
                         choice_type=in.readLine();
                         for(int i=0;i<=choice_type.length()-1;i++)
                          {
                           char ch=choice_type.charAt(i);
                           if(ch!='0'&&Character.isDigit(ch))
                           checker=true;
                           else
                           {
                               checker=false;
                               break;
                           }
                          }
                         if(checker==true)
                         break;
                         else
                         {
                             ob.clearScreen();
                             System.out.println("\t\t\t\tWrong choice retry");
                         }
                    }while(checker==false);
                    choice_2=Integer.parseInt(choice_type);
                    if(choice_2<=7&&choice>=1)
                    break;
                    else
                    {
                        ob.clearScreen();
                        System.out.println("\t\t\t\tWrong choice, retry");
                    }
                }
                base=240;
                selector=Cold_B[choice_2-1];
                break;
                
                case 5:
                while(j_check=true)
                {
                    boolean checker=false;
                    String choice_type="";
                    do
                    {
                         ob.disp_selection_drink(fresh);
                         checker=false;
                         choice_type="";
                    
                         System.out.print("\t\t\t\t\t   ");choice_type=in.readLine();
                         for(int i=0;i<=choice_type.length()-1;i++)
                          {
                           char ch=choice_type.charAt(i);
                           if(ch!='0'&&Character.isDigit(ch))
                           checker=true;
                           else
                           {
                               checker=false;
                               break;
                           }
                          }
                         if(checker==true)
                         break;
                         else
                         {
                             ob.clearScreen();
                             System.out.println("\t\t\t\tWrong choice retry");
                         }
                    }while(checker==false);
                    choice_2=Integer.parseInt(choice_type);
                    if(choice_2<=7&&choice>=1)
                    break;
                    else
                    {
                        ob.clearScreen();
                        System.out.println("\t\t\t\tWrong choice, retry");
                    }
                }
                if(choice_2<3)
                base=130;
                else
                base=160;
                selector=fresh[choice_2-1];
                break;
                case 6:
                selector="Custom";
                break;
            } 
            
            return selector;
        }
   
    void disp_selection_drink(String d2[])
    {
        
        System.out.println("\t\t\t\tMake a choice to continue");
            for(int i=0;i<d2.length;i++)
                {
                    System.out.print("\t\t\t   |"+n[i]+"|"+d2[i]);
                    int a=28-(d2[i].length());
                    for(int w=0;w<=a;w++)System.out.print(" ");
                    System.out.print("|");
                    System.out.println();
                }
                
                    
    }
    boolean size_num(String decider)throws IOException
    {
        if(decider.equals("Custom"))
        {
            customm=1;
            base=200;
            boolean selector_checker_custom=false;
            String custom_temp_milk="";
            do
            {
                    System.out.println();
                System.out.println("\t\t      Choosing the temperature of your drink is important");
                System.out.println("   Do you want that warm, fuzzy feeling when you drink that cup of hot goodness?");
                System.out.println("\t\t\t\t\tOR");
                System.out.println("\t Do you need that cold jolt to freshen you up and cool yourself down?");
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.println("\t\t\t     Do you want your drink Hot or iced?");
                for(int i=0;i<temp.length;i++)
                {
                    System.out.print("\t\t\t\t     |"+n[i]+"|"+temp[i]);
                    int io=6-(temp[i].length());
                    for(int w=0;w<=io;w++)System.out.print(" ");
                    System.out.print("|");
                    System.out.println();
                }
            
            
            
                 System.out.print("\t\t\t\t\t   ");
                custom_temp_milk=in.readLine();
                if(custom_temp_milk.equals("1")||custom_temp_milk.equals("2"))
                break;
                else
                {
                    ob.clearScreen();
                    System.out.print("\t\t\t\t   ");
                    System.out.println("Wrong choice, retry");
                    selector_checker_custom=true;
                }
            }while(selector_checker_custom=true);
            
            ob.loading();
            ob.clearScreen();
            do
            {System.out.println();
            System.out.println("\t\t\tWhat milk you want completely depends on you.");
            System.out.println(" If you're vegan and want alternate option, you can opt for Aroma Mocha Soy Milk");
            System.out.println("\t\tFor the fit ones, we present Aroma Mocha Non-Fat Milk");
            System.out.println("----------------------------------------------------------------------------------");
                System.out.println("\t\t\t\t   Which type of milk do you want?");
                for(int i=0;i<milks.length;i++)
               {
                    System.out.print("\t\t\t\t    |"+n[i]+"|"+milks[i]);
                    int io=6-(milks[i].length());
                    for(int w=0;w<=io;w++)System.out.print(" ");
                    System.out.print("|");
                    System.out.println();
               }
                 System.out.print("\t\t\t\t\t   ");
                custom_temp_milk=in.readLine();
                if(custom_temp_milk.equals("1")||custom_temp_milk.equals("2")||custom_temp_milk.equals("3"))
                break;
                else
                {
                    ob.clearScreen();
                    System.out.print("\t\t\t      ");
                    System.out.println("Wrong choice, retry");
                    selector_checker_custom=true;
                }
            }while(selector_checker_custom=true);
            int a=0;
            ob.loading();
            ob.clearScreen();
            boolean sauces_add_check=true;
            String accept_sauces_add="";
            
            do{
                
               do{
                   System.out.println("\t\t    What sauces do you want?(Extra 45 Rs. Per sauce)");
                for(int i=0;i<sauces.length;i++)
                {
                    System.out.print("\t\t\t\t    |"+n[i]+"|"+sauces[i]);
                    int io=12-(sauces[i].length());
                    for(int w=0;w<=io;w++)System.out.print(" ");
                    System.out.print("|");
                    System.out.println();
                }
                System.out.print("\t\t\t\t\t   ");
                accept_sauces_add=in.readLine();
                if(accept_sauces_add.equals("1")||accept_sauces_add.equals("2")||accept_sauces_add.equals("3")||accept_sauces_add.equals("4")||accept_sauces_add.equals("5")||accept_sauces_add.equals("6"))
                break;
                else
                {
                    ob.clearScreen();
                    System.out.print("\t\t\t\t   ");
                    System.out.println("Wrong choice, retry");
                    sauces_add_check=true;
                }
                
            }while(sauces_add_check=true);
            a=Integer.parseInt(accept_sauces_add);
            ob.loading();
            ob.clearScreen();
            if(a<=5)
            {
                base+=45;
                System.out.println("\tDo you want any more sauces?(Press Y for yes, for no any button)");
                System.out.print("\t\t\t\t\t   ");
                re=in.readLine();
                ob.loading();
                ob.clearScreen();
                if(re.equalsIgnoreCase("y"))
                {
                    add_on_checker=true;
                    
                }
                else
                {
                    add_on_checker=false;
                    break;
                }
            }
            else
            {
                add_on_checker=false;break;
            }
        }while(add_on_checker=true);
        add_on_checker=true;
        do{
            do{
                System.out.println("\t\t\tNow choose your Add-ons (Extra Rs.35 per addon)");
                for(int i=0;i<add_ons.length;i++)
                {
                    System.out.print("\t\t\t\t|"+n[i]+"|"+add_ons[i]);
                    int io=20-(add_ons[i].length());
                    for(int w=0;w<=io;w++)System.out.print(" ");
                    System.out.print("|");
                    System.out.println();
                }
                System.out.print("\t\t\t\t\t   ");
                accept_sauces_add=in.readLine();
                if(accept_sauces_add.equals("1")||accept_sauces_add.equals("2")||accept_sauces_add.equals("3"))
                break;
                else
                {
                    ob.clearScreen();
                    System.out.print("\t\t\t\t   ");
                    System.out.println("Wrong choice, retry");
                    selector_checker_custom=true;
                }
            }while(selector_checker_custom=true);
            a=Integer.parseInt(accept_sauces_add);
            ob.loading();
                ob.clearScreen();
            if(a<=2)
            {
                base+=35;
                System.out.println("\tDo you want any more addons?(Press Y for yes, for no any button)");
                System.out.print("\t\t\t\t\t   ");
                re=in.readLine();
                ob.loading();
                ob.clearScreen();
                if(re.equalsIgnoreCase("Y"))
                {
                    add_on_checker=true;
                }
                else
                {
                    add_on_checker=false;
                    break;
                }
            }
            else
            {
                add_on_checker=false;
                break;
            }
        }while(add_on_checker=true);
        
        for(int i=0;i<4;i++,base=base+35)
            costs[i]=base;
        }
        else
        {
            for(int i=0;i<4;i++,base=base+35)
            costs[i]=base;
        }
        boolean check_sizes=true;
        do{
            System.out.println("                              All costs in Indian Rupees");
        for(int i=0;i<sizes.length;i++)
            {
                System.out.print("\t\t\t\t   |"+n[i]+"|"+sizes[i]);
                int a=7-(sizes[i].length());
                for(int w=0;w<=a;w++)System.out.print(" ");
                System.out.print("|");
                System.out.print(costs[i]);
                
                System.out.print("|");
                System.out.println();
            }
        System.out.println("        Enter a choice or press some other button to cancel drink option");
        System.out.print("\t\t\t\t\t   ");
        String choice_size=in.readLine();
        if(choice_size.equals("1")||choice_size.equals("2")||choice_size.equals("3")||choice_size.equals("4"))
        {
            choice_3=Integer.parseInt(choice_size);
            break;
        }
        else
        {
            choice_3=5;
            customm=0;
            break;
        }
        
    }while(check_sizes=true);
        ob.loading();
        ob.clearScreen();
        if(choice_3<=4)
        {
            
            System.out.println();
            String no_drinks="";
            boolean no_drinks_check=true;
            do{
                System.out.print("\t\t\t");
                System.out.println("Please Enter number of drinks(Max-10)");
                System.out.print("\t\t\t\t          ");
                no_drinks=in.readLine();
            
                for(int i=0;i<=no_drinks.length()-1;i++)
                {
                    char ch=no_drinks.charAt(i);
                    if(Character.isDigit(ch))
                    no_drinks_check=true;
                    else
                    {
                        no_drinks_check=false;
                        break;
                    }
                }
                if(no_drinks_check==true)
                {
                    if(Integer.parseInt(no_drinks)<=10&&Integer.parseInt(no_drinks)>0)
                    break;
                    else
                    {
                        ob.clearScreen();
                        System.out.println("\t\t\t     Too many drinks or no drinks");
                        no_drinks_check=false;
                    }
                }
                else
                {
                    ob.clearScreen();
                    
                    System.out.println("\t\t\t\t     Invalid input");
                }
            
            
            }while(no_drinks_check==false);
            order_num[counter]=Integer.parseInt(no_drinks);
            ob.loading();
            ob.clearScreen();
            if(customm==1)
            {
                System.out.println("\t\tNow it's time to name your super special Kustom Drink® ;)");
                System.out.print("\t\t\t\t   ");
                order_specs[counter]=in.readLine()+"-Kustom";
                ob.loading();
                ob.clearScreen();
            }
            else
            order_specs[counter]=selector.concat("-"+sizes[choice_3-1]);
            s[counter]=costs[choice_3-1];
            counter++;
            
            System.out.println("\t   Do you want to order more?(Press Y for yes, for no any button)");
            System.out.print("\t\t\t\t\t   ");
            re=in.readLine();
            base=0;
            ob.loading();
            ob.clearScreen();
            customm=0;
            if(re.equalsIgnoreCase("Y"))
            {
                return true;
            }
            else
            return false;
        }
        else
        {
            return true;
        }
        
    }
    void clearScreen()throws IOException
    {
        System.out.println("\u000c");
        ob.decoration();
    }
    public void menu()throws IOException
    {
                System.out.println("\t\t\t\t      Espressos");
                menu_disp(Espressos);
                System.out.println("\t\t\t\t     Frapuccinos");
                menu_disp(Frappuccino);
                System.out.println("\t\t\t\tCoffee-Free Frapuccinos");
                menu_disp(free_Frap);
                System.out.println("\t\t\t\t      Cold Brew");
                menu_disp(Cold_B);
                System.out.println("\t\t\t\t Freshly brewed Coffee");
                menu_disp(fresh);
                System.out.println("\t\t\t\tMake your perfect drink\n");
                System.out.println("\t\t\tIn this option you can make your perfect drink");
                System.out.println("    You can choose the temperature if his drink and the type of milk to be used");
                System.out.println("\tStrawberry, Vanilla, Hazelnut, Chocolate and Caramel sauces-Rs.45 each");
                System.out.println("\t\t    Chocolate Chips and Extra Whipped Cream-Rs.35 each\n\n");
        System.out.println("\t\t\t   Enter any letter to continue");
        System.out.print("\t\t\t\t        ");
        random=in.readLine();
    }
    void menu_disp(String toPrint[])
    {
        int cost=1;
        System.out.println("\t\t  Item\t\t\t  Short|Tall |Grand|Venti");
        for(int i=0;i<toPrint.length;i++)
        {
            System.out.print("\t\t  "+toPrint[i]);
            for(int j=0;j<=23-(toPrint[i].length()-1);j++)
            System.out.print(".");
            if(toPrint==Espressos)
            {
                if(i<4)
                cost=150;
                else
                cost=130;
            }
            else if(toPrint==Frappuccino)
            {
                if(i<4)
                cost=195;
                else
                cost=180;
            }
            else if(toPrint==free_Frap)
            {
                if(i<3)
                cost=160;
                else
                cost=155;
            }
            else if(toPrint==Cold_B)
            {
                cost =240;
            }
            else if(toPrint==fresh)
            {
                if(i<3)
                cost=130;
                else
                cost=160;
            }
            System.out.print(cost+" | "+(cost+35)+" | "+(cost+70)+" | "+(cost+105));
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
}
