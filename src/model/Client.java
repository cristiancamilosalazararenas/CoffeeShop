package model;

public class Client {
    private String name;
    private String surname;
    private String email;

    public Client(String name, String email) { //Ctrl + espacio para crear el constructor
        this.name = name;
        this.surname = "Doe";
        this.email = email;
    }
    
    //Métodos de acceso

    @Override
    public String toString() {
        return "Client{" + "name=" + name + ", surname=" + surname + ", email=" + email + '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    
    
    

}
