package LibraryManagementSystemLLD.user;

/*
User is an abstract class because we want its attributes to be inherited to Member and Admin. Also, in future
if we want to introduce more methods for User, then those will also apply to Member and Admin
 */
public abstract class User {

    private final int id ;
    private final String name ;

    public User(int id, String name){
        this.id = id ;
        this.name = name ;
    }
}
