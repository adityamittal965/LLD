package LibraryManagementSystemLLD.auth;

public class UserAuthenticator {

    // Made the constructor private to prevent initialization of this class as the methods of this class are static
    private UserAuthenticator(){

    }

    // Made the method static as we want to be a class method
    public static boolean isAdmin(String token){
        return true ;
    }

    // Made the method static as we want to be a class method
    public static boolean isMember(String token){
        return true ;
    }
}
