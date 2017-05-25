public class Magpie2
{

	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/** getResponse() method
	 * ===========================================
	 * 	Gives a response to a user statement
	 *  @param statement (the user statement)
	 * 	@return a response based on the rules given */
	public String getResponse(String statement)
	{
		String response = "";
		/** To be completed in Exercise_02:
		 * 	Modify the following code to use the findKeyword
		 * 	Method (details in "Exercise_02" below. */
		if(statement.length()==0)
		{
			response = "Say something, please.";
		}
		
		else if(statement.trim().equals("no"));
		{
			response = "Why so negative?";
		}

		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}

		/** Exercise_03(Final)
		 * ==================================================
		 * Create additional code (another else if) that
		 * responds "Tell me more about your pet" if the
		 * user mentions the word cat, dog, fish, or turtle
		 * in their statement.
		 *
		 * Create addtional code (another else if) that
		 * responds "He sounds like a pretty dank teacher"
		 * if you mention "Robinette" in your statement */

		else if (statement.indexOf("cat") >= 0
				|| statement.indexOf("dog") >= 0
				|| statement.indexOf("fish") >= 0
				|| statement.indexOf("turtle") >= 0)
		{
			response = "Tell me more about your pet.";
		}
		
		else if (findKeyword(statement, "Robinette") >= 0)
		{
			response = "He sounds like a pretty dank teacher";
		}
		
		else if (findKeyword(statement, "I want to", 0) >= 0)
		{
		  response = transformIWantToStatement(statement);
		}


		else
		{
		  // Look for a two word (you <something> me)
		  // pattern
		  int psn = findKeyword(statement, "you", 0);


		  if (psn >= 0
				&& findKeyword(statement, "me", psn) >= 0)
		  {
			 response = transformYouMeStatement(statement);
		  }
		else
		{
			response = getRandomResponse();
		}
		return response;
	}
	
	private String transformIWantToStatement(String statement)
	{
		statement = statement.trim();
		
		String lastChar = statement.substring(statement.length() -1);
		
		if (lastChar.equals("."))
		{
			statement = statement.substring(0, statement.length()- 1);
		}
		int psn = findKeyword (statement, "I want to", 0);
		
		String restOfStatement = statement.substring(psn + 9).trim();
		
		return "What would it mean to " + restOfStatement + "?";
	}
	
	private String transformYouMeStatement(String statement)
	{
		statement = statement.trim();
		
		String lastChar = statement.substring(statement.length()-1);
		
		if (lastChar.equals("."))
		{
			statement = statement.substring(0, statement.length() -1);
		}
		
		int psnOfYou = findKeyword (statement, "you", 0);
		int psnOfMe = findKeyword (statement, "me", psnOfYou + 3);
		
		String restOfStatement = statement.substring(psnOfYou + 3, psnOfMe).trim();
		return "What makes you think that I " + restOfStatement + " you?";
	}

	/** Ex_02: The findKeyword() Method...
	 * ========================================================= */
	private int findKeyword(String statement, String goal, int startPos)
	{
		String phrase = statement.trim().toLowerCase();
		String goal = goal.trim().toLowerCase();
		
		int psn = phrase.indexOf(goal, startPos);
		
		while(psn >= 0)
		{
			String phrase = statement.trim().toLowerCase();
		goal = goal.toLowerCase();

		int psn = phrase.indexOf(goal, startPos);

		while (psn >= 0)
		{
			String before = " ";
			String after = " ";
			
			if (psn > 0)
			{
				before = phrase.substring(psn - 1, psn);
			}
			if (psn + goal.length() < phrase.length())
			{
				after = phrase.substring(psn + goal.length(), psn + goal.length() + 1);
			}

			if ((before.compareTo("a") < 0) && (before.compareTo("z") > 0))
			{
				return psn;
			}
			
			else
			{
				psn = phrase.indexOf(goal, psn + 1);
			}
			
		}
		

		return -1;

	}

	/** Override - this method is used if there are only 2 parameters...*/
	private int findKeyword(String statement, String goal)
	{
		//set startPos to 0 if not specified
		return findKeyword(statement, goal, 0);
	}

	/** getRandomResponse() method
	 * =============================================================*/
	/** Pick a default response to use if nothing else fits.
	 * 	@return a non-committal string*/
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
			response = "Interesting, tell me more.";
		else if (whichResponse == 1)
			response = "Hmmm.";
		else if (whichResponse == 2)
			response = "Do you really think so?";
		else if (whichResponse == 3)
			response = "You don't say.";

		return response;
	}
}
