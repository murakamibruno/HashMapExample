/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmapexample;

/**
 *
 * @author bruno_akira
 */
public class Profile 
{
    private String name;
    private int age;
    private String ssn;
    
    public Profile(String name, int age, String ssn)
    {
        super();
        this.name = name;
        this.age = age;
        this.ssn = ssn;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public String getSsn()
    {
        return ssn;
    }
    
    public void setName()
    {
        this.name = name;
    }
    
    public void setAge()
    {
        this.age = age;
    }
    
    public void setSsn()
    {
        this.ssn = ssn;
    }
    
    @Override
    public String toString()
    {
        return "Profile [name=" + name + ", age="  + age + ",ssn="  +  ssn  + "]";
    }
}
