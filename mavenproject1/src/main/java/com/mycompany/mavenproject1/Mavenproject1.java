package com.mycompany.mavenproject1;
import java.util.Scanner;
public class Mavenproject1 {

    public static void main(String[] args) {
        System.out.println("---Enter your Username and Password---\n");
        Scanner input = new Scanner(System.in);
        do{
            String srnm = "user123", psswrd = "user123",uFullname = "Edmilao, Marjorie D.", uGrade_1 = "1", uSection_1 = "Respect";
             
            System.out.print("Username: ");
            String username = input.nextLine();
            System.out.print("Password: ");
            String password = input.nextLine();
            
            do{
                if(srnm.equalsIgnoreCase(username) && psswrd.equalsIgnoreCase(password)){
                    int uQuarter_1 = 1, uQuarter_2 = 2, uQuarter_3 = 3, uQuarter_4 = 4;
                    System.out.print("\nEnter the Quarter: ");
                    int quarterly = input.nextInt();
                
                    if(uQuarter_1 == quarterly){
                        int passing=75;
                        double aSubs=0, avrg_1=0, fAvrg_1=0;
                        double bSubs=0, avrg_2=0, fAvrg_2=0;
                        String student_a = "Springfield", student_b = "Campbell";
                
                        System.out.println("\nWelcome, "+srnm+"!"+"\n");
                        System.out.println("***User Info***");
                        System.out.println("Full Name: "+uFullname+"\n"+"Grade: "+uGrade_1+"\n"+"Section: "+uSection_1+"\n"+"Quarter: "+uQuarter_1+"\n\n");
                
                        System.out.println("***Students List***");
                        System.out.println("Name: Jonas A. Springfield        Grade: "+fAvrg_1+"\n"+"Name: Anna Maria R. Campbell      Grade: "+fAvrg_2);
                    
                        do{
                            String continueing = "no";
                        
                            Scanner input1 = new Scanner(System.in);
                            System.out.print("\nWill you log out, Yes or No? \n>>> ");
                            String continued=input1.nextLine();
                            
                            if(continueing.equalsIgnoreCase(continued)){
                                System.out.print("\nEnter a last Name in the Students List: ");
                                String lName=input1.nextLine();
                                
                                if(student_a.equalsIgnoreCase(lName) && avrg_1 == 0){
                                    int rep, noSubjects;
                        
                                    System.out.print("\nHow many Subjects this student have?\n>>> ");
                                    noSubjects=input.nextInt();
                                    aSubs+=noSubjects;
                                    
                                    for(rep=0;rep<noSubjects; rep++){
                                        double calwritten = 0.3, calperformance = 0.5, calexam = 0.2, total_1, total_2, total_3, total;
                            
                                        System.out.println("\nName: "+student_a+"\n");
                                        
                                        Scanner input2 = new Scanner(System.in);
                                        System.out.print("SUBJECT: ");
                                        String subject=input2.nextLine();
                                        System.out.print("WRITTEN WORKS: ");
                                        int written=input2.nextInt();
                                        System.out.print("PERFORMANCE TASK: ");
                                        int performance=input2.nextInt();
                                        System.out.print("QUARTERLY EXAM: ");
                                        int exam=input2.nextInt();
                            
                                        if (performance>=0 || written>=0 || exam>=0){
                                            total_1 = calwritten*written;
                                            total_2 = calperformance*performance;
                                            total_3 = calexam*exam;
                                            total = total_1+total_2+total_3;
                                            avrg_1+=total;
                                                    
                                            if (total>=passing){
                                                System.out.println("Average: "+total);
                                                System.out.println("Passed");
                                                
                                            }else{
                                                System.out.println("Average: "+total);
                                                System.out.println("Failed");
                                            } 
                                        }
                                    }
                                    
                                }else if(student_b.equalsIgnoreCase(lName) && avrg_2 == 0){
                                    int rep, noSubjects;
                        
                                    System.out.print("\nHow many Subjects this student have?\n>>> ");
                                    noSubjects=input.nextInt();
                                    bSubs+=noSubjects;
                                    
                                    
                                    for(rep=0;rep<noSubjects; rep++){
                                        double calwritten = 0.3, calperformance = 0.5, calexam = 0.2, total_1, total_2, total_3, total;
                            
                                        System.out.println("\nName: "+student_b+"\n");
                            
                                        Scanner input2 = new Scanner(System.in);
                                        System.out.print("SUBJECT: ");
                                        String subject=input2.nextLine();
                                        System.out.print("WRITTEN WORKS: ");
                                        int written=input2.nextInt();
                                        System.out.print("PERFORMANCE TASK: ");
                                        int performance=input2.nextInt();
                                        System.out.print("QUARTERLY EXAM: ");
                                        int exam=input2.nextInt();
                            
                                        if (performance>=0 || written>=0 || exam>=0){
                                            total_1 = calwritten*written;
                                            total_2 = calperformance*performance;
                                            total_3 = calexam*exam;
                                            total = total_1+total_2+total_3;
                                            avrg_2+=total;
                                                    
                                            if (total>=passing){
                                                System.out.println("Average: "+total);
                                                System.out.println("Passed");
                                                
                                            }else{
                                                System.out.println("Average: "+total);
                                                System.out.println("Failed");
                                            } 
                                        }
                                    }
                                    
                                }else{
                                    System.out.print("\nInvalid or Cannot be updated again\n");
                                }
                                
                            }else{
                                System.out.println("\nUnderstood.");
                                System.out.println("\nUpdate*\n");
                                double totally_1 = avrg_1/aSubs;
                                fAvrg_1 += totally_1;
                                double totally_2 = avrg_2/bSubs;
                                fAvrg_2 += totally_2;
                                
                                System.out.println("***Students List***");
                                System.out.println("Name: Jonas A. Springfield        Grade: "+fAvrg_1+"\n"+"Name: Anna Maria R. Campbell      Grade: "+fAvrg_2);
                                System.exit(0);
                                
                            }
                        
                        }while(true);
                    
                    }else if(uQuarter_2 == quarterly){
                        int passing=75;
                        double aSubs=0, avrg_1=0, fAvrg_1=0;
                        double bSubs=0, avrg_2=0, fAvrg_2=0;
                        String student_a = "Springfield", student_b = "Campbell";
                
                        System.out.println("\nWelcome, "+srnm+"!"+"\n");
                        System.out.println("***User Info***");
                        System.out.println("Full Name: "+uFullname+"\n"+"Grade: "+uGrade_1+"\n"+"Section: "+uSection_1+"\n"+"Quarter: "+uQuarter_2+"\n\n");
                
                        System.out.println("***Students List***");
                        System.out.println("Name: Jonas A. Springfield        Grade: "+fAvrg_1+"\n"+"Name: Anna Maria R. Campbell      Grade: "+fAvrg_2);
                    
                        do{
                            String continueing = "no";
                        
                            Scanner input1 = new Scanner(System.in);
                            System.out.print("\nWill you log out, Yes or No? \n>>> ");
                            String continued=input1.nextLine();
                            
                            if(continueing.equalsIgnoreCase(continued)){
                                System.out.print("\nEnter a last Name in the Students List: ");
                                String lName=input1.nextLine();
                                
                                if(student_a.equalsIgnoreCase(lName) && avrg_1 == 0){
                                    int rep, noSubjects;
                        
                                    System.out.print("\nHow many Subjects this student have? \n>>> ");
                                    noSubjects=input.nextInt();
                                    aSubs+=noSubjects;
                                    
                                    for(rep=0;rep<noSubjects; rep++){
                                        double calwritten = 0.3, calperformance = 0.5, calexam = 0.2, total_1, total_2, total_3, total;
                            
                                        System.out.println("\nName: "+student_a+"\n");
                                        
                                        Scanner input2 = new Scanner(System.in);
                                        System.out.print("SUBJECT: ");
                                        String subject=input2.nextLine();
                                        System.out.print("WRITTEN WORKS: ");
                                        int written=input2.nextInt();
                                        System.out.print("PERFORMANCE TASK: ");
                                        int performance=input2.nextInt();
                                        System.out.print("QUARTERLY EXAM: ");
                                        int exam=input2.nextInt();
                            
                                        if (performance>=0 || written>=0 || exam>=0){
                                            total_1 = calwritten*written;
                                            total_2 = calperformance*performance;
                                            total_3 = calexam*exam;
                                            total = total_1+total_2+total_3;
                                            avrg_1+=total;
                                                    
                                            if (total>=passing){
                                                System.out.println("Average: "+total);
                                                System.out.println("Passed");
                                                
                                            }else{
                                                System.out.println("Average: "+total);
                                                System.out.println("Failed");
                                            } 
                                        }
                                    }
                                    
                                }else if(student_b.equalsIgnoreCase(lName) && avrg_2 == 0){
                                    int rep, noSubjects;
                        
                                    System.out.print("\nHow many Subjects this student have?\n>>> ");
                                    noSubjects=input.nextInt();
                                    bSubs+=noSubjects;
                                    
                                    
                                    for(rep=0;rep<noSubjects; rep++){
                                        double calwritten = 0.3, calperformance = 0.5, calexam = 0.2, total_1, total_2, total_3, total;
                            
                                        System.out.println("\nName: "+student_b+"\n");
                            
                                        Scanner input2 = new Scanner(System.in);
                                        System.out.print("SUBJECT: ");
                                        String subject=input2.nextLine();
                                        System.out.print("WRITTEN WORKS: ");
                                        int written=input2.nextInt();
                                        System.out.print("PERFORMANCE TASK: ");
                                        int performance=input2.nextInt();
                                        System.out.print("QUARTERLY EXAM: ");
                                        int exam=input2.nextInt();
                            
                                        if (performance>=0 || written>=0 || exam>=0){
                                            total_1 = calwritten*written;
                                            total_2 = calperformance*performance;
                                            total_3 = calexam*exam;
                                            total = total_1+total_2+total_3;
                                            avrg_2+=total;
                                                    
                                            if (total>=passing){
                                                System.out.println("Average: "+total);
                                                System.out.println("Passed");
                                                
                                            }else{
                                                System.out.println("Average: "+total);
                                                System.out.println("Failed");
                                            } 
                                        }
                                    }
                                    
                                }else{
                                    System.out.print("\nInvalid or Cannot be updated again.\n");
                                }
                                
                            }else{
                                System.out.println("\nUnderstood.");
                                System.out.println("\nUpdate*\n");
                                double totally_1 = avrg_1/aSubs;
                                fAvrg_1 += totally_1;
                                double totally_2 = avrg_2/bSubs;
                                fAvrg_2 += totally_2;
                                
                                System.out.println("***Students List***");
                                System.out.println("Name: Jonas A. Springfield        Grade: "+fAvrg_1+"\n"+"Name: Anna Maria R. Campbell      Grade: "+fAvrg_2);
                                System.exit(0);
                                
                            }
                        
                        }while(true);
                    
                
                    }else if(uQuarter_3 == quarterly){
                        int passing=75;
                        double aSubs=0, avrg_1=0, fAvrg_1=0;
                        double bSubs=0, avrg_2=0, fAvrg_2=0;
                        String student_a = "Springfield", student_b = "Campbell";
                
                        System.out.println("\n"+"Welcome, "+srnm+"!"+"\n");
                        System.out.println("***User Info***");
                        System.out.println("Full Name: "+uFullname+"\n"+"Grade: "+uGrade_1+"\n"+"Section: "+uSection_1+"\n"+"Quarter: "+uQuarter_3+"\n\n");
                
                        System.out.println("***Students List***");
                        System.out.println("Name: Jonas A. Springfield        Grade: "+fAvrg_1+"\n"+"Name: Anna Maria R. Campbell      Grade: "+fAvrg_2);
                    
                        do{
                            String continueing = "no";
                        
                            Scanner input1 = new Scanner(System.in);
                            System.out.print("\nWill you log out, Yes or No? \n>>> ");
                            String continued=input1.nextLine();
                            
                            if(continueing.equalsIgnoreCase(continued)){
                                System.out.print("\nEnter a last Name in the Students List: ");
                                String lName=input1.nextLine();
                                
                                if(student_a.equalsIgnoreCase(lName) && avrg_1 == 0){
                                    int rep, noSubjects;
                        
                                    System.out.print("\nHow many Subjects this student have?\n>>> ");
                                    noSubjects=input.nextInt();
                                    aSubs+=noSubjects;
                                    
                                    for(rep=0;rep<noSubjects; rep++){
                                        double calwritten = 0.3, calperformance = 0.5, calexam = 0.2, total_1, total_2, total_3, total;
                            
                                        System.out.println("\nName: "+student_a+"\n");
                                        
                                        Scanner input2 = new Scanner(System.in);
                                        System.out.print("SUBJECT: ");
                                        String subject=input2.nextLine();
                                        System.out.print("WRITTEN WORKS: ");
                                        int written=input2.nextInt();
                                        System.out.print("PERFORMANCE TASK: ");
                                        int performance=input2.nextInt();
                                        System.out.print("QUARTERLY EXAM: ");
                                        int exam=input2.nextInt();
                            
                                        if (performance>=0 || written>=0 || exam>=0){
                                            total_1 = calwritten*written;
                                            total_2 = calperformance*performance;
                                            total_3 = calexam*exam;
                                            total = total_1+total_2+total_3;
                                            avrg_1+=total;
                                                    
                                            if (total>=passing){
                                                System.out.println("Average: "+total);
                                                System.out.println("Passed");
                                                
                                            }else{
                                                System.out.println("Average: "+total);
                                                System.out.println("Failed");
                                            } 
                                        }
                                    }
                                    
                                }else if(student_b.equalsIgnoreCase(lName) && avrg_2 == 0){
                                    int rep, noSubjects;
                        
                                    System.out.print("\nHow many Subjects this student have? \n>>> ");
                                    noSubjects=input.nextInt();
                                    bSubs+=noSubjects;
                                    
                                    
                                    for(rep=0;rep<noSubjects; rep++){
                                        double calwritten = 0.3, calperformance = 0.5, calexam = 0.2, total_1, total_2, total_3, total;
                            
                                        System.out.println("\nName: "+student_b+"\n");
                            
                                        Scanner input2 = new Scanner(System.in);
                                        System.out.print("SUBJECT: ");
                                        String subject=input2.nextLine();
                                        System.out.print("WRITTEN WORKS: ");
                                        int written=input2.nextInt();
                                        System.out.print("PERFORMANCE TASK: ");
                                        int performance=input2.nextInt();
                                        System.out.print("QUARTERLY EXAM: ");
                                        int exam=input2.nextInt();
                            
                                        if (performance>=0 || written>=0 || exam>=0){
                                            total_1 = calwritten*written;
                                            total_2 = calperformance*performance;
                                            total_3 = calexam*exam;
                                            total = total_1+total_2+total_3;
                                            avrg_2+=total;
                                                    
                                            if (total>=passing){
                                                System.out.println("Average: "+total);
                                                System.out.println("Passed");
                                                
                                            }else{
                                                System.out.println("Average: "+total);
                                                System.out.println("Failed");
                                            } 
                                        }
                                    }
                                    
                                }else{
                                    System.out.print("\nInvalid or Cannot be updated again\n");
                                }
                                
                            }else{
                                System.out.println("\nUnderstood.");
                                System.out.println("\nUpdate*\n");
                                double totally_1 = avrg_1/aSubs;
                                fAvrg_1 += totally_1;
                                double totally_2 = avrg_2/bSubs;
                                fAvrg_2 += totally_2;
                                
                                System.out.println("***Students List***");
                                System.out.println("Name: Jonas A. Springfield        Grade: "+fAvrg_1+"\n"+"Name: Anna Maria R. Campbell      Grade: "+fAvrg_2);
                                System.exit(0);
                                
                            }
                        
                        }while(true);
                    
                
                    }else if(uQuarter_4 == quarterly){
                        int passing=75;
                        double aSubs=0, avrg_1=0, fAvrg_1=0;
                        double bSubs=0, avrg_2=0, fAvrg_2=0;
                        String student_a = "Springfield", student_b = "Campbell";
                
                        System.out.println("\nWelcome, "+srnm+"!"+"\n");
                        System.out.println("***User Info***");
                        System.out.println("Full Name: "+uFullname+"\n"+"Grade: "+uGrade_1+"\n"+"Section: "+uSection_1+"\n"+"Quarter: "+uQuarter_4+"\n\n");
                
                        System.out.println("***Students List***");
                        System.out.println("Name: Jonas A. Springfield        Grade: "+fAvrg_1+"\n"+"Name: Anna Maria R. Campbell      Grade: "+fAvrg_2);
                    
                        do{
                            String continueing = "no";
                        
                            Scanner input1 = new Scanner(System.in);
                            System.out.print("\nWill you log out, Yes or No? \n>>> ");
                            String continued=input1.nextLine();
                            
                            if(continueing.equalsIgnoreCase(continued)){
                                System.out.print("\nEnter a last Name in the Students List: ");
                                String lName=input1.nextLine();
                                
                                if(student_a.equalsIgnoreCase(lName) && avrg_1 == 0){
                                    int rep, noSubjects;
                        
                                    System.out.print("\nHow many Subjects this student have?\n>>> ");
                                    noSubjects=input.nextInt();
                                    aSubs+=noSubjects;
                                    
                                    for(rep=0;rep<noSubjects; rep++){
                                        double calwritten = 0.3, calperformance = 0.5, calexam = 0.2, total_1, total_2, total_3, total;
                            
                                        System.out.println("\nName: "+student_a+"\n");
                                        
                                        Scanner input2 = new Scanner(System.in);
                                        System.out.print("SUBJECT: ");
                                        String subject=input2.nextLine();
                                        System.out.print("WRITTEN WORKS: ");
                                        int written=input2.nextInt();
                                        System.out.print("PERFORMANCE TASK: ");
                                        int performance=input2.nextInt();
                                        System.out.print("QUARTERLY EXAM: ");
                                        int exam=input2.nextInt();
                            
                                        if (performance>=0 || written>=0 || exam>=0){
                                            total_1 = calwritten*written;
                                            total_2 = calperformance*performance;
                                            total_3 = calexam*exam;
                                            total = total_1+total_2+total_3;
                                            avrg_1+=total;
                                                    
                                            if (total>=passing){
                                                System.out.println("Average: "+total);
                                                System.out.println("Passed");
                                                
                                            }else{
                                                System.out.println("Average: "+total);
                                                System.out.println("Failed");
                                            } 
                                        }
                                    }
                                    
                                }else if(student_b.equalsIgnoreCase(lName) && avrg_2 == 0){
                                    int rep, noSubjects;
                        
                                    System.out.print("\nHow many Subjects this student have?\n>>> ");
                                    noSubjects=input.nextInt();
                                    bSubs+=noSubjects;
                                    
                                    
                                    for(rep=0;rep<noSubjects; rep++){
                                        double calwritten = 0.3, calperformance = 0.5, calexam = 0.2, total_1, total_2, total_3, total;
                            
                                        System.out.println("\nName: "+student_b+"\n");
                            
                                        Scanner input2 = new Scanner(System.in);
                                        System.out.print("SUBJECT: ");
                                        String subject=input2.nextLine();
                                        System.out.print("WRITTEN WORKS: ");
                                        int written=input2.nextInt();
                                        System.out.print("PERFORMANCE TASK: ");
                                        int performance=input2.nextInt();
                                        System.out.print("QUARTERLY EXAM: ");
                                        int exam=input2.nextInt();
                            
                                        if (performance>=0 || written>=0 || exam>=0){
                                            total_1 = calwritten*written;
                                            total_2 = calperformance*performance;
                                            total_3 = calexam*exam;
                                            total = total_1+total_2+total_3;
                                            avrg_2+=total;
                                                    
                                            if (total>=passing){
                                                System.out.println("Average: "+total);
                                                System.out.println("Passed");
                                                
                                            }else{
                                                System.out.println("Average: "+total);
                                                System.out.println("Failed");
                                            } 
                                        }
                                    }
                                    
                                }else{
                                    System.out.print("\nInvalid or Cannot be updated again\n");
                                }
                                
                            }else{
                                System.out.println("\nUnderstood.");
                                System.out.println("\nUpdate*\n");
                                double totally_1 = avrg_1/aSubs;
                                fAvrg_1 += totally_1;
                                double totally_2 = avrg_2/bSubs;
                                fAvrg_2 += totally_2;
                                
                                System.out.println("***Students List***");
                                System.out.println("Name: Jonas A. Springfield        Grade: "+fAvrg_1+"\n"+"Name: Anna Maria R. Campbell      Grade: "+fAvrg_2);
                                System.exit(0);
                                
                            }
                        
                        }while(true);
                    
                
                    }else{
                    System.out.print("\nInvalid.\n");
                    }
                
                }else{
                    System.out.println("\nNo User Found.\n");
                    break;
                
                }
            }while(true);
           
        }while(true);
    }
}
