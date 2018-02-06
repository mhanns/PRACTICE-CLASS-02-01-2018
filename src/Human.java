/*Maurice Hanns CSC 242 02/01/2018
    Write a JAVA Program that will create an
    object of human with the following properties
    and allow the user to input the person's first
    name, middle initial and last name.*/


public class Human {
   
    String FirstName;
    String LastName;
	char MiddleInit;
    String Career;
    int ClientAge;
       
    public Human(String FName, String LName, char MidInit, String Occup, int CAge){
       
        FirstName = FName;
        LastName = LName;
        MiddleInit = MidInit;
        Career = Occup;
        ClientAge = CAge;

    }

}