package HashMapLLD;

public class Main {
    public static void main(String[] args){
        HashMap <Integer, String> mp = new HashMap<>(7) ;
        mp.put(1, "Hi") ;
        mp.put(2, "My") ;
        mp.put(3, "Name") ;
        mp.put(4, "is") ;
        mp.put(5, "Aditya") ;
        mp.put(6, "How") ;
        mp.put(7, "are") ;
        mp.put(8, "you") ;
        mp.put(9, "friends") ;
        mp.put(10, "?") ;
        String value = mp.get(9) ;
        System.out.println("Value for key 9 is " + value + ".") ;

        for(int i = 1; i <= 15; i++){
            System.out.println(mp.tableSizeFor(i)) ;
        }
    }
}
