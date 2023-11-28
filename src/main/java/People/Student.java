/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package People;



/**
 *
 * @author Jessuse
 */
public class Student {
    private  int ID;
    private String name;
    private String addres;
    private String Major;
    private BirthDate bd;
   

  
    
    
    public Student(int ID, String name, String addres, String Major, BirthDate bd) {
        this.ID = ID;
        this.name = name;
        this.addres = addres;
        this.Major = Major;
        this.bd = bd;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getMajor() {
        return Major;
    }

    public void setMajor(String Major) {
        this.Major = Major;
    }

    public BirthDate getBd() {
        return bd;
    }

    public void setBd(BirthDate bd) {
        this.bd = bd;
    }


    
    
    
    


    public String getInfo() {
        return "Student{" + "ID=" + ID + ", name=" + name + ", addres=" + addres + ", Major=" + Major + ", bd=" + bd +   '}';
    }
    
}
