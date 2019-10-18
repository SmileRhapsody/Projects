/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.User.UserDirectory;



/**
 *
 * @author raoyuhuizi
 */
public class UserDataStore {
    private UserDirectory userDirectory;
    //private static UserDataStore datastore;
    public UserDataStore(){
        
        userDirectory = new UserDirectory();
        
    }
//    public static UserDataStore getInstance(){
//        if(datastore==null){
//            datastore=new UserDataStore();
//        }
//        return datastore;
//    }

    public UserDirectory getUserDirectory() {
        return userDirectory;
    }

    

    
   

   

//     public User createUser(String username,String password,Employee employee,Role role){
//        User user=new User();
//        user.setUsername(username);
//        user.setPassword(password);
//        user.setEmployee(employee);
//        user.setRole(role);
//        userDirectory.getUserList().add(user);
//        return user;
//    }
//    
//    public User createUser(String username,String password,Role role, Customer customer){
//        User user=new User();
//        user.setUsername(username);
//        user.setPassword(password);
//        user.setRole(role);
//        user.setCustomer(customer);
//        userDirectory.getUserList().add(user);
//        return user;
//    }
//
////    public UserDataStore getDatastore() {
////        return datastore;
////    }
////
////    public void setDatastore(UserDataStore datastore) {
////        this.datastore = datastore;
////    }
//    public boolean IsUniqUsername(String username){
//        for(User u:userDirectory.getUserList()){
//            if(u.getUsername().equals(username))
//                return false;
//        }
//        return true;
//    }
//     public void deleteUser(User user){       
//        userDirectory.getUserList().remove(user);
//        
//    }
}
