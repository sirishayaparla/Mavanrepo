package jira;

public class palyload {
	
	public static  String createissues() {
		return "{\r\n"
				+ "    \"fields\": {\r\n"
				+ "        \"project\": {\r\n"
				+ "            \"key\": \"RPA\"\r\n"
				+ "        },\r\n"
				+ "        \"summary\": \"devasree issues1\",\r\n"
				+ "        \"description\": \"issue   is  created with key and value pair\",\r\n"
				+ "        \"issuetype\": {\r\n"
				+ "            \"name\": \"Bug\"\r\n"
				+ "        }\r\n"
				+ "    }\r\n"
				+ "}";
	}
	public static String login() {
		return"{ \"username\": \"Devasree\", \"password\": \"Devasree@123\" }";
	
	}
	public  static String addcomment() {
		return"{\r\n"
				+ "    \"body\": \"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque eget venenatis elit. Duis eu justo eget augue iaculis fermentum. Sed semper quam laoreet nisi egestas at posuere augue semper.\",\r\n"
				+ "    \"visibility\": {\r\n"
				+ "        \"type\": \"role\",\r\n"
				+ "        \"value\": \"Administrators\"\r\n"
				+ "    }\r\n"
				+ "}";
	}
	public static String  updatecomments() {
		return"{\r\n"
				+ "    \"body\": \"Lore nisi egestas at posuere augue semper.\",\r\n"
				+ "    \"visibility\": {\r\n"
				+ "        \"type\": \"role\",\r\n"
				+ "        \"value\": \"Administrators\"\r\n"
				+ "    }\r\n"
				+ "}";
	}

}
