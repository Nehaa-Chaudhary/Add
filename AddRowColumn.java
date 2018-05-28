/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BEAUTIFUL NEHA
 */
public class AddRowColumn 
{
    int numberOfRows;
    int column;
    void addRC()
    {
        numberOfRows=10;
        column=10;
        System.out.println("output is: " +(numberOfRows+column));
    }
   public static void main(String args[])
   {
           AddRowColumn a=new AddRowColumn();
           a.addRC();
}
}