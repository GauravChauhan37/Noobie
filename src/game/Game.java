/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.Scanner;

/**
 *
 * @author Gaurav Chauhan
 */
public class Game {

   public static boolean playerturn = true;
      public static boolean playerwon = false;
      public static boolean computerwon =false;
      public static boolean playing = true;
      public static boolean playagain = false;
      public static Scanner scan = new Scanner(System.in);
   public static tictactoe board = new tictactoe();
   
    public static void main(String[] args) {
        // TODO code application logic here
        
        if (board.isVisible() == false){
            board.setVisible(true);
            
        }
    }
    public static void checkforwin(){
  if(board.button1.getText().equals("X")){
      if(board.button4.getText().equals("X")){
          if(board.button7.getText().equals("X")){
              playerwon = true;
              computerwon=false;
              System.out.println("player won");
              
          }
  
      }
  
  }
   if(board.button1.getText().equals("X")){
      if(board.button5.getText().equals("X")){
          if(board.button9.getText().equals("X")){
              playerwon = true;
              computerwon=false;
              System.out.println("player won");
          }
  
      }
  
  }
   if(board.button1.getText().equals("X")){
      if(board.button2.getText().equals("X")){
          if(board.button3.getText().equals("X")){
              playerwon = true;
              computerwon=false;
              System.out.println("player won");
          }
  
      }
  
  }
  
   if(board.button3.getText().equals("X")){
      if(board.button5.getText().equals("X")){
          if(board.button7.getText().equals("X")){
              playerwon = true;
              computerwon=false;
              System.out.println("player won");
          }
  
      }
  
  }
     if(board.button3.getText().equals("X")){
      if(board.button6.getText().equals("X")){
          if(board.button9.getText().equals("X")){
              playerwon = true;
              computerwon=false;
              System.out.println("player won");
          }
  
      }
  
  }
      if(board.button7.getText().equals("X")){
      if(board.button8.getText().equals("X")){
          if(board.button9.getText().equals("X")){
              playerwon = true;
              computerwon=false;
              System.out.println("player won");
          }
  
      }
  
  }
       if(board.button4.getText().equals("X")){
      if(board.button5.getText().equals("X")){
          if(board.button6.getText().equals("X")){
              playerwon = true;
              computerwon=false;
              System.out.println("player won");
          }
  
      }
  
  }
        if(board.button2.getText().equals("X")){
      if(board.button5.getText().equals("X")){
          if(board.button8.getText().equals("X")){
              playerwon = true;
              computerwon=false;
              System.out.println("player won");
          }
  
      }
  
  }
         if(board.button1.getText().equals("O")){
      if(board.button4.getText().equals("O")){
          if(board.button7.getText().equals("O")){
              playerwon = false;
              computerwon=true;
              System.out.println("computer won");
          }
  
      }
  
  }
   if(board.button1.getText().equals("O")){
      if(board.button5.getText().equals("O")){
          if(board.button9.getText().equals("O")){
              playerwon = false;
              computerwon=true;
              System.out.println("computer won");
          }
  
      }
  
  }
   if(board.button1.getText().equals("O")){
      if(board.button2.getText().equals("O")){
          if(board.button3.getText().equals("O")){
              playerwon = false;
              computerwon=true;
              System.out.println("computer won");
          }
  
      }
  
  }
  
   if(board.button3.getText().equals("O")){
      if(board.button5.getText().equals("O")){
          if(board.button7.getText().equals("O")){
              playerwon = false;
              computerwon=true;
              System.out.println("computer won");
          }
  
      }
  
  }
     if(board.button3.getText().equals("O")){
      if(board.button6.getText().equals("O")){
          if(board.button9.getText().equals("O")){
              playerwon = false;
              computerwon=true;
              System.out.println("computer won");
          }
  
      }
  
  }
      if(board.button7.getText().equals("O")){
      if(board.button8.getText().equals("O")){
          if(board.button9.getText().equals("O")){
              playerwon = false;
              computerwon=true;
              System.out.println("computer won");
          }
  
      }
  
  }
       if(board.button4.getText().equals("O")){
      if(board.button5.getText().equals("O")){
          if(board.button6.getText().equals("O")){
              playerwon = false;
              computerwon=true;
              System.out.println("computer won");
          }
  
      }
  
  }
        if(board.button2.getText().equals("O")){
      if(board.button5.getText().equals("O")){
          if(board.button8.getText().equals("O")){
              playerwon = false;
              computerwon=true;
              System.out.println("computer won");
          }
  
      }
  
  }
        if(playerwon == true || computerwon == true){
            board.setVisible(false);
            System.out.println("would you like to play again"+"true"+"false");
           playagain = scan.nextBoolean();
           if(playagain == true){
               board.button1.setText("");
               board.button2.setText("");
               board.button3.setText("");
               board.button4.setText("");
               board.button5.setText("");
               board.button6.setText("");
               board.button7.setText("");
               board.button8.setText("");
               board.button9.setText("");
               playerturn = true;
       playerwon = false;
       computerwon =false;
       board.setVisible(true);
               
           } else { 
               System.out.println("thanks for playing!");
           }
        }
}}
