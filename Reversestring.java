class Reversestring {
    
    public static void main(String args[]){
        String name="Name";
        String rev="";
        int length=name.length();
        for(int i=length-1; i>=0; i--)
        {
            rev=rev+name.charAt(i);
        }
            System.out.println(" "+rev);
        }
}
