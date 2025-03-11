package com.ps.serialization;

import java.io.*;

class UserData implements Serializable {
    private String username;
    private transient String password; // won't be serialized

    public UserData(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

public class TestSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        UserData user = new UserData("john_doe", "password123");

        // Serialize the object
        FileOutputStream fos = new FileOutputStream("userData.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(user);
        oos.close();

        // Deserialize the object
        FileInputStream fis = new FileInputStream("userData.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        UserData deserializedUser = (UserData) ois.readObject();
        ois.close();

        System.out.println("Username: " + deserializedUser.getUsername());
        System.out.println("Password (should be null): " + deserializedUser.getPassword());
    }
}
