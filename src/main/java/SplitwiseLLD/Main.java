package SplitwiseLLD;

import SplitwiseLLD.Model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/*
private int groupId ;
private String name ;
private List <User> users ;
private List<User> takers ;
private User giver ;
private double amount ;
private SplitMechanism splitMechanism ;
private HashMap <User, Double> exactSplitAmount ;
 */

public class Main {
    public static void main(String[] args) {
        /*
        int id1 = 1 ;
        String name1 = "Group1" ;
        Group group1 = new Group(id1, name1) ;
        group1.setAmount(1000) ;
        List<User> users = new ArrayList<>() ;
        String userId1 = "User1" ;
        User user1 = new User(userId1) ;;
        String userId2 = "User2" ;
        User user2 = new User(userId2) ;;
        users.add(user1) ;
        users.add(user2) ;
        group1.setUsers(users);
        SplitMechanism equalSplitMechanism = new EqualSplitMechanism(group1) ;
        group1.setSplitMechanism(equalSplitMechanism);
        System.out.println(equalSplitMechanism.getPart(user1)) ;
        */
        /*
        int id1 = 1 ;
        String name1 = "Group1" ;
        Group group1 = new Group(id1, name1) ;
        group1.setAmount(1000) ;
        List<User> users = new ArrayList<>() ;
        String userId1 = "User1" ;
        User user1 = new User(userId1) ;;
        String userId2 = "User2" ;
        User user2 = new User(userId2) ;;
        String userId3 = "User3" ;
        User user3 = new User(userId3) ;;
        users.add(user1) ;
        users.add(user2) ;
        users.add(user3) ;
        group1.setUsers(users);
        List<User> takers = new ArrayList<>() ;
        takers.add(user1) ;
        takers.add(user2) ;
        group1.setUsers(users);
        group1.setTakers(takers);
        SplitMechanism selectiveEqualSplitMechanism = new SelectiveEqualSplitMechanism(group1) ;
        group1.setSplitMechanism(selectiveEqualSplitMechanism);
        System.out.println(selectiveEqualSplitMechanism.getPart(user1)) ;

         */
        int id1 = 1 ;
        String name1 = "Group1" ;
        Group group1 = new Group(id1, name1) ;
        group1.setAmount(1000) ;
        List<User> users = new ArrayList<>() ;
        String userId1 = "User1" ;
        User user1 = new User(userId1) ;;
        String userId2 = "User2" ;
        User user2 = new User(userId2) ;;
        String userId3 = "User3" ;
        User user3 = new User(userId3) ;;
        users.add(user1) ;
        users.add(user2) ;
        users.add(user3) ;
        group1.setUsers(users);
        HashMap<User, Double> exactSplitAmount = new HashMap<>() ;
        double amount1 = 200 ;
        double amount2 = 300 ;
        double amount3 = 1000 - amount1 - amount2 ;
        exactSplitAmount.put(user1, amount1) ;
        exactSplitAmount.put(user2, amount2) ;
        exactSplitAmount.put(user3, amount3);
        group1.setExactSplitAmount(exactSplitAmount);
        SplitMechanism exactSplitMechanism = new ExactSplitMechanism(group1) ;
        group1.setSplitMechanism(exactSplitMechanism);
        System.out.println(exactSplitMechanism.getPart(user1)) ;

    }
}
