package main;

import java.util.HashMap;

public class userspasswords  {

    // CREATE A HASHMAP FOR THE USERNAME AND PASSWORD SYSTEM
    HashMap<String,String> LoginInfo = new HashMap<String , String >();


    /**
     * SAVE passwordds and usernames
     */
    public userspasswords(){

        LoginInfo.put("admin" , "admin");
        LoginInfo.put("BroCode" , "BRO123");
        LoginInfo.put("Cilal" , "Pizza");
        LoginInfo.put("Gym" , "Gym");

    }

    /**
     * add usernames and passwords
     * @param User
     * @param Password
     */
    public void add_user(String User , String Password){
        LoginInfo.put(User, Password);

    }

    /**
     * add anew account
     * @param NewUserName
     * @param NewPassword
     */
    public void addAccount(String NewUserName , String NewPassword){
         LoginInfo.put(NewUserName , NewPassword);
    }

    // MAKe IT PROTECTED SO THAT NOT ANYONE CAN USE THIS CLASS
     HashMap getLoginInfo(){
         return  LoginInfo;
    }
}
