/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertdigit.to.words;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class UIController implements Initializable {

    @FXML
    private Label Error;
    @FXML
    private TextField Digits;
    @FXML
    private TextArea Amountinwords;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
String AIW,NN = "NAIRA ONLY";

    @FXML
   public void Convert(KeyEvent event)throws Exception{
        ObservableList<String> Words = FXCollections.observableArrayList("ZERO","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE","TEN","ELEVEN","TWELVE","THIRTEEN","FOURTEEN","FIFTEEN","SIXTEEN","SEVENTEEN","EIGHTEEN","NINETEEN");
        ObservableList<String> Words2 = FXCollections.observableArrayList("","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE","TEN","ELEVEN","TWELVE","THIRTEEN","FOURTEEN","FIFTEEN","SIXTEEN","SEVENTEEN","EIGHTEEN","NINETEEN");
        ObservableList<String> Numerals = FXCollections.observableArrayList("","","TWENTY","THIRTY","FOURTY","FIFTY","SIXTY","SEVENTY","EIGHTY","NINTY");
        ObservableList<String> Separators = FXCollections.observableArrayList("AND","HUNDRED","THOUSAND","MILLION","BILLION");
    String digits = Digits.getText();
        char[] intarray = digits.toCharArray();
        int diglen = intarray.length;
        try{
        int diglen2 = diglen - 1;
        Double.valueOf(digits);
    switch(diglen2){
        case 0:
            AIW = Words.get(Double.valueOf(digits).intValue());
            Amountinwords.setText(AIW + " " + NN);
            break;
        case 1:
            String one;
            int test = Double.valueOf(digits).intValue();
            if (test > 0 && test <= 19) {
                one = Words.get(Double.valueOf(test).intValue());
            } else if(test > 19) {
               
                 
                 char x = (digits.charAt(0));
                
             
                 
                String A1 = Numerals.get(Double.valueOf(digits.charAt(0)).intValue() - 48);
                String B1 = Words2.get(Double.valueOf(digits.charAt(1)).intValue() - 48);
                one = A1 + " " + B1;
            }else{
                one = "";
            }
            
            AIW = one;
            if(Double.valueOf(digits.charAt(0)).intValue() == 48){
                Amountinwords.setText("Enter a Valid number");
            }else{
            Amountinwords.setText(AIW + " " + NN);
            }
            break;
        case 2:
            String A2 = Words.get(Double.valueOf(digits.charAt(0)).intValue() - 48)+" "+Separators.get(1);
        int text = Double.valueOf((Double.valueOf(digits.charAt(1)).intValue() - 48) +""+(Double.valueOf(digits.charAt(2)).intValue() - 48)).intValue();
        String two;
        if (text > 0 && text <= 19) {
                two = " AND "+Words.get(Double.valueOf(text).intValue());
             } else if (text > 19){
                String A2A = Numerals.get(Double.valueOf(digits.charAt(1)).intValue() - 48);
                String A2B = Words2.get(Double.valueOf(digits.charAt(2)).intValue() - 48);
                two = " AND "+A2A+" "+A2B;
            }else{
                 two = " ";
             }
        AIW = A2 +two;
        if(Double.valueOf(digits.charAt(0)).intValue() == 48){
                Amountinwords.setText("Enter a Valid number");
            }else{
            Amountinwords.setText(AIW + " " + NN);
            }
        break;
        
        case 3:
            String A3 = Words.get(Double.valueOf(digits.charAt(0)).intValue() - 48)+" "+Separators.get(2);
            int B3 = Double.valueOf(digits.charAt(1)).intValue() - 48;
            String C3;
            if(B3 == 0 ){C3 = "";}else{C3 = Words.get(Double.valueOf(digits.charAt(1)).intValue() - 48)+" "+Separators.get(1);}
            int text1 = Double.valueOf((Double.valueOf(digits.charAt(2)).intValue() - 48) +""+(Double.valueOf(digits.charAt(3)).intValue() - 48)).intValue();
           String three;
            if (text1 > 0 && text1 <= 19) {
               three =" AND "+Words.get(Double.valueOf(text1).intValue());
            } else if (text1 > 19) {
                String A3A = Numerals.get(Double.valueOf(digits.charAt(2)).intValue() - 48);
                String A3B = Words2.get(Double.valueOf(digits.charAt(3)).intValue() - 48);
                three = " AND "+A3A+" "+A3B;
           }
            else{
                three=" ";
            }
           AIW = A3 +" "+C3+three;
           if(Double.valueOf(digits.charAt(0)).intValue() == 48){
                Amountinwords.setText("Enter a Valid number");
            }else{
            Amountinwords.setText(AIW + " " + NN);
            }
           
            break;
            case 4:
                String A4, four;
                int B4 = Double.valueOf((Double.valueOf(digits.charAt(0)).intValue() - 48) +""+(Double.valueOf(digits.charAt(1)).intValue() - 48)).intValue();
                 if (B4 <= 19) {
                   
                    A4 = Words.get(Double.valueOf(B4).intValue())+" "+Separators.get(2); 
                
            } else {
                String A4AA = Numerals.get(Double.valueOf(digits.charAt(0)).intValue() - 48);
                String A4BA = Words2.get(Double.valueOf(digits.charAt(1)).intValue() - 48);
                A4 = A4AA+" "+A4BA+" "+Separators.get(2);
            }
             int C4 = Double.valueOf(digits.charAt(2)).intValue() - 48;
             String D4;
             if(C4 <= 0 ){D4 = "";}else{D4 = Words.get(Double.valueOf(digits.charAt(2)).intValue() - 48)+" "+Separators.get(1);}
             
             int text4 = Double.valueOf((Double.valueOf(digits.charAt(3)).intValue() - 48) +""+(Double.valueOf(digits.charAt(4)).intValue() - 48)).intValue();
             if (text4 > 0 && text4 <= 19) {
               four =" AND "+Words.get(Double.valueOf(text4).intValue());
            } else if (text4 > 19){
                String A4A = Numerals.get(Double.valueOf(digits.charAt(3)).intValue() - 48);
                String A4B = Words2.get(Double.valueOf(digits.charAt(4)).intValue() - 48);
                four = " AND "+A4A+" "+A4B;
           }else{
                four =" ";
            }
             AIW = A4+" "+D4+four;
            if(Double.valueOf(digits.charAt(0)).intValue() == 48){
                Amountinwords.setText("Enter a Valid number");
            }else{
            Amountinwords.setText(AIW + " " + NN);
            }
             break;
             
            case 5:String A5,fiveht, five;
             A5 = Words.get(Double.valueOf(digits.charAt(0)).intValue() - 48)+" "+Separators.get(1);
             int test5 = Double.valueOf((Double.valueOf(digits.charAt(1)).intValue() - 48) +""+(Double.valueOf(digits.charAt(2)).intValue() - 48)).intValue();
            if (test5 > 0 && test5 <= 19) {
               fiveht =" AND "+Words.get(Double.valueOf(test5).intValue())+" "+Separators.get(2);
            } else if (test5 > 19) {
                String A5AA = Numerals.get(Double.valueOf(digits.charAt(1)).intValue() - 48);
                String A5BA = Words2.get(Double.valueOf(digits.charAt(2)).intValue() - 48);
                fiveht = " AND "+A5AA+" "+A5BA+" "+Separators.get(2);
           }else{
                fiveht =" "+Separators.get(2);
            }
            int C5 = Double.valueOf(digits.charAt(3)).intValue() - 48;
             String D5;
             if(C5 == 0 ){D5 = "";}else{D5 = Words.get(Double.valueOf(digits.charAt(3)).intValue() - 48)+" "+Separators.get(1);}
             
             int text5 =Double.valueOf((Double.valueOf(digits.charAt(4)).intValue() - 48) +""+(Double.valueOf(digits.charAt(5)).intValue() - 48)).intValue();
            if (text5 > 0 && text5 <= 19) {
               five =" AND "+Words.get(Double.valueOf(text5).intValue());
            } else if (text5 > 19) {
                String A5AB = Numerals.get(Double.valueOf(digits.charAt(4)).intValue() - 48);
                String A5BB = Words2.get(Double.valueOf(digits.charAt(5)).intValue() - 48);
                five = " AND "+A5AB+" "+A5BB;
           } else{
                five ="";
            }
              AIW = A5+fiveht+" "+D5+" "+five;
             if(Double.valueOf(digits.charAt(0)).intValue() == 48){
                Amountinwords.setText("Enter a Valid number");
            }else{
            Amountinwords.setText(AIW + " " + NN);
            }
             break;
            case 6:String A6,B6,A6A, sixht,sixh,six;
            A6 = Words.get(Double.valueOf(digits.charAt(0)).intValue() - 48)+" "+Separators.get(3);
            String and = " AND ";
            if(Double.valueOf(digits.charAt(1)).intValue() - 48 != 0){
              B6 = Words.get(Double.valueOf(digits.charAt(1)).intValue() - 48)+" "+Separators.get(1);
              
            }else{
                 B6 = "";
                 and  = "";
                    }
          
            int test6ht = Double.valueOf((Double.valueOf(digits.charAt(2)).intValue() - 48) +""+(Double.valueOf(digits.charAt(3)).intValue() - 48)).intValue();
            
            if (test6ht > 0 && test6ht <= 19) {
               sixht =and+Words.get(Double.valueOf(test6ht).intValue())+" "+Separators.get(2);
            } else if (test6ht > 19) {
                String A5AA = Numerals.get(Double.valueOf(digits.charAt(2)).intValue() - 48);
                String A5BA = Words2.get(Double.valueOf(digits.charAt(3)).intValue() - 48);
                sixht = and+A5AA+" "+A5BA+" "+Separators.get(2);
           }else{
                sixht ="";
                if(Double.valueOf(digits.charAt(1)).intValue() - 48 != 0){
                  sixht =" "+Separators.get(2);  
                }
            }
             int C6 = Double.valueOf(digits.charAt(4)).intValue() - 48;
             
             if(C6 == 0 ){sixh = "";}else{sixh = Words.get(Double.valueOf(digits.charAt(4)).intValue() - 48)+" "+Separators.get(1);}
          
             int test6 = Double.valueOf((Double.valueOf(digits.charAt(5)).intValue() - 48) +""+(Double.valueOf(digits.charAt(6)).intValue() - 48)).intValue();
            if (test6 > 0 && test6 <= 19) {
               six =" AND "+Words.get(Double.valueOf(test6).intValue());
            } else if (test6 > 19) {
                String A5AA = Numerals.get(Double.valueOf(digits.charAt(5)).intValue() - 48);
                String A5BA = Words2.get(Double.valueOf(digits.charAt(6)).intValue() - 48);
                six = " AND "+A5AA+" "+A5BA;
           }else{
                six ="";
            }
           
            AIW = A6+" "+B6+sixht+" "+sixh+six;
           if(Double.valueOf(digits.charAt(0)).intValue() == 48){
                Amountinwords.setText("Enter a Valid number");
            }else{
            Amountinwords.setText(AIW + " " + NN);
            } 
           break;
            case 7:
                String A7,B7,A7A, sevenm, sevenht,sevenh,seven;
             int test7m = Double.valueOf((Double.valueOf(digits.charAt(0)).intValue() - 48) +""+(Double.valueOf(digits.charAt(1)).intValue() - 48)).intValue();
               if (test7m > 0 && test7m <= 19) {
               sevenm =Words.get(Double.valueOf(test7m).intValue())+" "+Separators.get(3);
            } else if (test7m > 19) {
                String A7AA = Numerals.get(Double.valueOf(digits.charAt(0)).intValue() - 48);
                String A7BA = Words2.get(Double.valueOf(digits.charAt(1)).intValue() - 48);
                sevenm = A7AA+" "+A7BA+" "+Separators.get(3);
           }else{
                sevenm ="";
            }
               String and2 = " AND ";
            if(Double.valueOf(digits.charAt(2)).intValue() - 48 != 0){
              B7 = Words.get(Double.valueOf(digits.charAt(2)).intValue() - 48)+" "+Separators.get(1);
              
            }else{
                 B7 = "";
                 and  = "";
                    }
                 
            int test7ht = Double.valueOf((Double.valueOf(digits.charAt(3)).intValue() - 48) +""+(Double.valueOf(digits.charAt(4)).intValue() - 48)).intValue();
            
            if (test7ht > 0 && test7ht <= 19) {
               sevenht =and2+Words.get(Double.valueOf(test7ht).intValue())+" "+Separators.get(2);
            } else if (test7ht > 19) {
                String A5AA = Numerals.get(Double.valueOf(digits.charAt(3)).intValue() - 48);
                String A5BA = Words2.get(Double.valueOf(digits.charAt(4)).intValue() - 48);
                sevenht = and2+A5AA+" "+A5BA+" "+Separators.get(2);
           }else{
                sevenht ="";
                if(Double.valueOf(digits.charAt(2)).intValue() - 48 != 0){
                  sevenht =" "+Separators.get(2);  
                }
            }
            int C7 = Double.valueOf(digits.charAt(5)).intValue() - 48;
             
             if(C7 == 0 ){sevenh = "";}else{sevenh = Words.get(Double.valueOf(digits.charAt(5)).intValue() - 48)+" "+Separators.get(1);}
          
             int test7 = Double.valueOf((Double.valueOf(digits.charAt(6)).intValue() - 48) +""+(Double.valueOf(digits.charAt(7)).intValue() - 48)).intValue();
            if (test7 > 0 && test7 <= 19) {
               seven =" AND "+Words.get(Double.valueOf(test7).intValue());
            } else if (test7 > 19) {
                String A5AA = Numerals.get(Double.valueOf(digits.charAt(6)).intValue() - 48);
                String A5BA = Words2.get(Double.valueOf(digits.charAt(7)).intValue() - 48);
                seven = " AND "+A5AA+" "+A5BA;
           }else{
                seven ="";
            }
           
            AIW = sevenm+" "+B7+sevenht+" "+sevenh+seven;
           if(Double.valueOf(digits.charAt(0)).intValue() == 48){
                Amountinwords.setText("Enter a Valid number");
            }else{
            Amountinwords.setText(AIW + " " + NN);
            }
           break;
            case 8:
                String A8,B8,eighthm,eightm,eightht,eightt,eighth,eight;
                A8 = Words.get(Double.valueOf(digits.charAt(0)).intValue() - 48)+" "+Separators.get(1);
                int test8 = Double.valueOf((Double.valueOf(digits.charAt(1)).intValue() - 48) +""+(Double.valueOf(digits.charAt(2)).intValue() - 48)).intValue();
                if (test8 > 0 && test8 <= 19) {
               eighthm =" AND "+Words.get(Double.valueOf(test8).intValue())+" "+Separators.get(3);
            } else if (test8 > 19) {
                String A5AA = Numerals.get(Double.valueOf(digits.charAt(1)).intValue() - 48);
                String A5BA = Words2.get(Double.valueOf(digits.charAt(2)).intValue() - 48);
                eighthm = " AND "+A5AA+" "+A5BA+" "+Separators.get(3);
           }else{
                eighthm =" "+Separators.get(3);
            }
                and = " AND ";
                if(Double.valueOf(digits.charAt(3)).intValue() - 48 != 0){
              B8 = Words.get(Double.valueOf(digits.charAt(3)).intValue() - 48)+" "+Separators.get(1);
              
            }else{
                 B8 = "";
                 and  = "";
                    }
               
                int text8 = Double.valueOf((Double.valueOf(digits.charAt(4)).intValue() - 48) +""+(Double.valueOf(digits.charAt(5)).intValue() - 48)).intValue();
                if (text8 > 0 && text8 <= 19) {
               eightht =and+Words.get(Double.valueOf(text8).intValue())+" "+Separators.get(2);
            } else if (text8 > 19) {
                String A5AA = Numerals.get(Double.valueOf(digits.charAt(4)).intValue() - 48);
                String A5BA = Words2.get(Double.valueOf(digits.charAt(5)).intValue() - 48);
                eightht = and+A5AA+" "+A5BA+" "+Separators.get(2);
           }else{
                eightht = "";
                if(Double.valueOf(digits.charAt(3)).intValue() - 48 != 0){
                    eightht =" "+Separators.get(2);
                }}
                   int C8 = Double.valueOf(digits.charAt(6)).intValue() - 48;
               if(C8 == 0 ){eighth = "";}else{eighth = Words.get(Double.valueOf(digits.charAt(6)).intValue() - 48)+" "+Separators.get(1);}
          
             int tet8 =Double.valueOf((Double.valueOf(digits.charAt(7)).intValue() - 48) +""+(Double.valueOf(digits.charAt(8)).intValue() - 48)).intValue();
            if (tet8 > 0 && tet8 <= 19) {
               eight =" AND "+Words.get(Double.valueOf(tet8).intValue());
            } else if (tet8 > 19) {
                String A5AA = Numerals.get(Double.valueOf(digits.charAt(7)).intValue() - 48);
                String A5BA = Words2.get(Double.valueOf(digits.charAt(8)).intValue() - 48);
                eight = " AND "+A5AA+" "+A5BA;
           }else{
                eight ="";
            }  
            AIW = A8+" "+eighthm+" "+B8+eightht+" "+eighth+eight;
           if(Double.valueOf(digits.charAt(0)).intValue() == 48){
                Amountinwords.setText("Enter a Valid number");
            }else{
            Amountinwords.setText(AIW + " " + NN);
            }
    break;
    
    case 9:String B9, C9,nineh,nine;
    String A9 = Words.get(Double.valueOf(digits.charAt(0)).intValue() - 48)+" "+Separators.get(4);
     if(Double.valueOf(digits.charAt(1)).intValue() - 48 != 0){
        and = " AND ";
        and2 = " AND ";
              B9 = Words.get(Double.valueOf(digits.charAt(1)).intValue() - 48)+" "+Separators.get(1);
              
            }else{
                 B9 = "";
                 and  = "";
                    }
      String ninehm;
        int text9 = Double.valueOf((Double.valueOf(digits.charAt(2)).intValue() - 48) +""+(Double.valueOf(digits.charAt(3)).intValue() - 48)).intValue();
                if (text9 > 0 && text9 <= 19) {
                ninehm =and+Words.get(Double.valueOf(text9).intValue())+" "+Separators.get(3);
            } else if (text9 > 19) {
                String A5AA = Numerals.get(Double.valueOf(digits.charAt(2)).intValue() - 48);
                String A5BA = Words2.get(Double.valueOf(digits.charAt(3)).intValue() - 48);
                ninehm = and+A5AA+" "+A5BA+" "+Separators.get(3);
           }else{
                ninehm = "";
                if(Double.valueOf(digits.charAt(1)).intValue() - 48 != 0){
                    ninehm =" "+Separators.get(3);
                }}
                
      String nineht;        
                if(Double.valueOf(digits.charAt(4)).intValue() - 48 != 0){  
                 C9 = Words.get(Double.valueOf(digits.charAt(4)).intValue() - 48)+" "+Separators.get(1);
              and2  = " AND ";
            }else{
                 C9 = "";
                 and2  = "";
                    }
      
        int test9 = Double.valueOf((Double.valueOf(digits.charAt(5)).intValue() - 48) +""+(Double.valueOf(digits.charAt(6)).intValue() - 48)).intValue();
                if (test9 > 0 && test9 <= 19) {
                nineht =and2+Words.get(Double.valueOf(test9).intValue())+" "+Separators.get(3);
            } else if (test9 > 19) {
                String A5AA = Numerals.get(Double.valueOf(digits.charAt(5)).intValue() - 48);
                String A5BA = Words2.get(Double.valueOf(digits.charAt(6)).intValue() - 48);
                nineht = and2+A5AA+" "+A5BA+" "+Separators.get(2);
           }else{
                nineht = "";
                if(Double.valueOf(digits.charAt(4)).intValue() - 48 != 0){
                    nineht =" "+Separators.get(2);
                }}
                
                int D9 = Double.valueOf(digits.charAt(7)).intValue() - 48;
               if(D9 == 0 ){nineh = "";}else{nineh = Words.get(Double.valueOf(digits.charAt(7)).intValue() - 48)+" "+Separators.get(1);}
          
             int tet9 = Double.valueOf((Double.valueOf(digits.charAt(8)).intValue() - 48) +""+(Double.valueOf(digits.charAt(9)).intValue() - 48)).intValue();
            if (tet9 > 0 && tet9 <= 19) {
               nine =" AND "+Words.get(Double.valueOf(tet9).intValue());
            } else if (tet9 > 19) {
                String A5AA = Numerals.get(Double.valueOf(digits.charAt(8)).intValue() - 48);
                String A5BA = Words2.get(Double.valueOf(digits.charAt(9)).intValue() - 48);
                nine = " AND "+A5AA+" "+A5BA;
           }else{
                nine ="";
            }  
            AIW = A9+" "+B9+" "+ninehm+" "+C9+" "+nineht+" "+nineh+" "+nine;
            
           if(Double.valueOf(digits.charAt(0)).intValue() == 48){
                Amountinwords.setText("Enter a Valid number");
            }else{
            Amountinwords.setText(AIW + " " + NN);
            }break;
        default:  Amountinwords.setText("Enter a number below 10 Billion");break;
    }
    
    
}catch(Exception e){
    Amountinwords.setText("Enter a Valid number");
}

   }
    
}
