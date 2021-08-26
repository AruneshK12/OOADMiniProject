/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BPO_system;

/**
 *
 * @author LENOVO
 */
public class company {
    private String username,password,companyName,emailId;
    public company(String username,String password,String companyName,String emailId)
    {
        this.username=username;
        this.password=password;
        this.companyName=companyName;
        this.emailId=emailId;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
}
