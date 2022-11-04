package main;

import java.util.HashMap;

public class users_passwords  {
    String NewUserName;
    String NewPassword;
    // CREATE A HASHMAP FOR THE USERNAME AND PASSWORD SYSTEM
    HashMap<String,String> LoginInfo = new HashMap<String , String >();

    users_passwords(String NewUserName , String NewPassword){
        this.NewUserName = NewUserName;
        this.NewPassword = NewPassword;
    }
    public  users_passwords(){

        LoginInfo.put("admin" , "admin");
        LoginInfo.put("BroCode" , "BRO123");
        LoginInfo.put("Cilal" , "Pizza");
        LoginInfo.put("Gym" , "Gym");

    }
    public void addAccount(String NewUserName , String NewPassword){
         LoginInfo.put(NewUserName , NewPassword);
    }

    // MAKe IT PROTECTED SO THAT NOT ANYONE CAN USE THIS CLASS
    protected HashMap getLoginInfo(){
         return  LoginInfo;
    }
}
