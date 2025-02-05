import org.testng.Assert;
import org.testng.annotations.Test;

class test_java{

    @Test
    public void my_test(){
    
    Integer x = 1;
    Assert.assertEquals(x, 1,"test passed");
    }

    @Test
    public void string_reverse(){
        String source = "kawai gaban";
        char[] sorc_array = source.toCharArray();
        Integer endIndex =source.length()-1;

        System.out.println (source.charAt(endIndex));

        char[] newStr= new char[source.length()];
        //Integer start=0;

        for (Integer i = 0;i<source.length();i++){
            
            newStr[i]=sorc_array[endIndex];
            endIndex=endIndex-1;
        }

        System.out.println(newStr);

        String finalStr = new String(newStr);

      

        System.out.println("Original String = " + source);
        System.out.println ("Reverse String = " + finalStr);

        

    }


    public static void main(String[] args){
        System.out.println ("Hello world");

    }

}