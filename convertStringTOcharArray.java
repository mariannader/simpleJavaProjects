public class convertStringTOcharArray {
    public static void main(String []args){
        String s1 = "hello";
        char[] ch = s1.toCharArray();
        for (int i =0 ; i<ch.length ; i++){
            System.out.println(ch[i]);
        }//end for



        /**convert char string to string*/
        char sh []={'s','t','r','i','n','g'};
        String s2 = new String(sh);
        System.out.println(sh);

    }//end main


    //function in java
    /**
     *  public char[] toCharArray(){
     *         char [] result =new char[value.length];
     *         System.arraycopy(value , 0 , result , value.length);
     *         return result;
     *     }
     * */



}//end class
