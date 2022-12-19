public class MatchingString
{

    private static String[] arr = {"Hello", "Karel", "CodeHS!", "Karel"};
    
    public static int findString(String myString)
    {
        // your code goes here!
        //iterate through entire array with for loop
        for(int i=0; i < arr.length; i++){
            //if .equals, change stringIndex to call to action. 
            if(arr[i].equals(myString)){
                return i;
            }
        }
        return -1;

    }
}