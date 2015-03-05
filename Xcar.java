/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.geniustree.intership.exampleone;

/**
 *
 * @author oom
 */
public class Xcar implements Car {
     private boolean checkBattary(){
         return true;
     }
    private boolean checkOli(){
         return true;
    }
    private boolean fuel(){
         return true;
    }
    private Engine engine;
    @Override
    public boolean startEngin() {
         if(checkBattary()== true){
             System.out.println("CheckBattary");
         }if(checkOli()== true){
             System.out.println("checkOli");
         }if(fuel()== true){
             System.out.println("fuel");
         }
         return false;
    }

    @Override
    public void go() {
         System.out.println("gogo");
        
       
    }

   

}
