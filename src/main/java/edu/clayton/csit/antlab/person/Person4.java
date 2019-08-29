package edu.clayton.csit.antlab.person;

/**
 *  A simple class for person 4
 *  returns their name and a
 *  modified string 
 *  
 *  @author Qu
 *  @version 1.1
 */
public class Person4 {
  /** Holds the persons real name */
  private String name;
    /**
     * The constructor, takes in the persons
     * name
     * @param pname the person's real name
     */
  public Person4(String pname) {
    name = pname;
  }
    /**
     * This method should return a string
     * where each character is 1 greater 
     * than its previous value.  So
     * given "abc123" it should return
     * "bcd234".
     *
     * @param input the string to be modified
     * @return the modified string
     */
    private String calc(String input) {
      //Person 4 put your implementation here
      /**
      * This method will take the name and find each
      * letter's correpsonding index number.
      * Once the indexing with the matching letter
      * is found, it will add 1 to the index and return
      * that value.
      */
      char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
      char[] name = input.toCharArray();
      char[] newName = new char[name.length];
      
      for(int i = 0; i < name.length; i++)
      {
        for(int j = 0; j < alphabet.length; j++)
        {
          if(name[i] == alphabet[j])
          {
            newName[i] = alphabet[j + 1];
          }
        }
      }
      
      String finalName = new String(newName);
      
      return finalName;
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

