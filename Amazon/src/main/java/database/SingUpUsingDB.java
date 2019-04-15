package database;

import FrontPage.SearchPage;
import FrontPage.SingIn;
import org.openqa.selenium.Keys;

import java.util.ArrayList;
import java.util.List;

import static FrontPage.SingIn.email;

public class SingUpUsingDB extends SingIn {
    String email1="farhanahaque1024@gmail.com";
    //String email2="ssinf_1989@live.fr";
    String password1 ="farhanamoni92";
    ArrayList<String> myData =new ArrayList();
    public ArrayList<String> dataBaseData()
    {
        myData.add(email1);
        myData.add(password1);
        return myData;

    }

    public void  signupUsingDataFromDB() throws Exception {
        dataBaseData();
        ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
        ConnectToSqlDB.connectToSqlDatabase();
        connectToSqlDB.insertStringDataFromArrayListToSqlTable(myData,"signUpTable","DataSignUp");
        List<String> emails =connectToSqlDB.readDataBase("signUpTable","DataSignUp");
         email.sendKeys(emails.get(0), Keys.ENTER);
        password.sendKeys(emails.get(1),Keys.ENTER);

    }

}


