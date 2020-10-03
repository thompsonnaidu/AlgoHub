/**
determine if all the string character are unique
link:https://www.geeksforgeeks.org/determine-string-unique-characters/
 */
import java.util.*;


class UniqueStringCharacter{

    public static boolean isUnique(String str){

        Set<String> characterSet= new HashSet<String>();
        for(int index=0;index<str.length();index++){
            String temp=Character.toString(str.charAt(index));
            if(characterSet.contains(temp)){
                return false;
            }
            characterSet.add(temp);
        }

        return true;
    }
    public static void main(String args[]){

        System.out.println("is unique: "+UniqueStringCharacter.isUnique("thompson"));
    }
}