package edu.clayton.csit.antlab.person;
import java.util.Random;
/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string
 *
 * @author Qu
 * @version 1.1
 */
public class Person2 {
    /** Holds the persons real name */
    private String name;
	 	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
	 public Person2(String pname) {
	   name = pname;
	 }
	/**
	 * This method should take the string
	 * input and return its characters in
	 * random order.
	 * given "gtg123b" it should return
	 * something like "g3tb1g2".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
	  //Person 2 put your implementation here
    StringBuilder jumbler = new StringBuilder(input);
    for(int i = jumbler.length() -1; i > 0; i--){
      int n = new Random().nextInt(i + 1);

      char tmp = jumbler.charAt(i);
      jumbler.setCharAt(i, jumbler.charAt(n));
      jumbler.setCharAt(n, tmp);

    }
	  return jumbler.toString();
	}
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}
}
