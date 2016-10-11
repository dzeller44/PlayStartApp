package utils;

import java.util.List;

import com.avaje.ebean.Ebean;

import controllers.routes;
import models.Token;
import models.User;
import play.mvc.Call;



public class TestDB {

	public static void main(String[] args) {
		
		try
		{
			List<User> users = Ebean.find(models.User.class).findList();
			List<Token> tokens = Ebean.find(models.Token.class).findList();
			System.out.println(""  +users.size());
			System.out.println(""  +tokens.size());
			
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}
