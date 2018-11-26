/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ocachapter06;
import java.lang.ArrayIndexOutOfBoundsException;
import ocachapter06.NoMoreCarrotsException;

/**
 *
 * @author triosStudent
 */
public class OCAChapter06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {
            //int x = 5/0;
            //System.out.println(x);
            //System.out.println(args[0]);
            //System.out.println(args[1]);   
            //String type = "moose";
            //Object obj = type;
            //int number = (int) obj;
            eatCarrot();
            eatCarrot();
            //throw new NoMoreCarrotsException();
               
        }
        catch (NoMoreCarrotsException e)
        {
            System.out.println("Sad rabbit");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array element does not exist");
        }
        catch (ArithmeticException e)
        {
            System.out.println("An arithmetic exception occurred");
        }
        catch (ClassCastException e)
        {
            System.out.println("A class cast exception occurred");
        }
        catch (Exception e)
        {
            System.out.println("Some error occurred");
        }
        finally 
        {
            System.out.println("Message from the finally block");
        }
    }

    private static void eatCarrot() throws NoMoreCarrotsException 
    {
        throw new NoMoreCarrotsException();
    }
} 
