import javax.swing.JOptionPane;
public class Assignment3 {
 public static void main(String[] args) {
  String tempuser = "";
  String temppass = "";
  String Admin = "Admin";
  String Adminp = "Admin123";
  String Student = "Student";
  String Studentp = "Student123";
  String Staff = "Staff";
  String Staffp = "Staff123";
  
  String[] choices = {"Admin", "Student", "Staff"};
  String input = (String) JOptionPane.showInputDialog(null, "Choose account type...","Account Type",
		                                             JOptionPane.QUESTION_MESSAGE, null,choices,choices[1]); 
  switch (input){
  case "Admin":
	  tempuser = JOptionPane.showInputDialog("Please Enter your username"); //Allows user to enter username
	  for(int x=1; x<=3;x++){ //Allows limited trials in entry
		  if(!tempuser.equalsIgnoreCase(Admin)) { //If entry does not = Admin, then -
			  tempuser = JOptionPane.showInputDialog("Your Username is Incorrect" + "\n" +
	                                      "Please Enter your username again:"); //Allows re-entry of username
     }}
	  for (int x=1; x<=1; x++) {
		  if(!tempuser.equalsIgnoreCase(Admin)){
			  JOptionPane.showMessageDialog(null,"Your account is now locked" + "\n" +  
                                  "Please contact your adminstrator to unlock your account!");
			  return;
     }}
	  temppass = JOptionPane.showInputDialog("Please Enter your password"); //Allows user to enter password
	  for(int x=1; x<=3;x++){ //Allows limited trials in entry
		  if(!temppass.equalsIgnoreCase(Adminp)) { //If entry does not = Adminp, then -
			  tempuser =  JOptionPane.showInputDialog("Your Password is Incorrect" + "\n" +
                                              "Please Enter your password again"); //Allows re-entry of password
    }}
	  for (int x=1; x<=1; x++) {
		  if(!temppass.equalsIgnoreCase(Adminp)){
			  JOptionPane.showMessageDialog(null,"Your account is now locked" + "\n" +  
                                  "Please contact your adminstrator to unlock your account!");
			  return;
   }} 
	  JOptionPane.showMessageDialog(null,"Welcome Admin!");
	  break;
   case "Student":
	   tempuser = JOptionPane.showInputDialog("Please Enter your username"); //Allows user to enter username
	   for(int x=1; x<=3;x++){ //Allows limited trials in entry
		   if(!tempuser.equalsIgnoreCase(Student)) { //If entry does not = Student, then -
			   tempuser =  JOptionPane.showInputDialog("Your Username is Incorrect" + "\n" +
                                               "Please Enter your username again:"); //- Allows re-entry of username
     }}
	   for (int x=1; x<=1; x++) { 
		   if(!tempuser.equalsIgnoreCase(Student)){
			   JOptionPane.showMessageDialog(null,"Your account is now locked" + "\n" +  
                                  "Please contact your adminstrator to unlock your account!");
			   return;
     }}
	   temppass = JOptionPane.showInputDialog("Please Enter your password"); //Allows user to enter password
	   for(int x=1; x<=3;x++){ //Allows limited trials in entry
		   if(!temppass.equalsIgnoreCase(Studentp)) { //If entry does not = Studentp, then - 
			   tempuser = JOptionPane.showInputDialog("Your Password is Incorrect" + "\n" +
                                             "Please Enter your password again"); //- Allows re-entry of password
    }}
	   for (int x=1; x<=1; x++) { 
		   if(!temppass.equalsIgnoreCase(Studentp)){
			   JOptionPane.showMessageDialog(null,"Your account is now locked" + "\n" +  
                                  "Please contact your adminstrator to unlock your account!");
			   return;
    }} 
	   JOptionPane.showMessageDialog(null,"Welcome Student!");
	   break;
   case "Staff":
	   tempuser = JOptionPane.showInputDialog("Please Enter your username"); //Allows user to enter username
	   for(int x=1; x<=3;x++){ //Allows limited trials in entry
		   if(!tempuser.equalsIgnoreCase(Staff)) { //If entry does not = Staff, then -
			   tempuser =  JOptionPane.showInputDialog("Your Username is Incorrect" + "\n" +
                                               "Please Enter your username again:"); //- Allows re-entry of username
     }}
	   for (int x=1; x<=1; x++) { 
		   if(!tempuser.equalsIgnoreCase(Staff)){
			   JOptionPane.showMessageDialog(null,"Your account is now locked" + "\n" +  
                                  "Please contact your adminstrator to unlock your account!");
			   return;
     }}
	   temppass = JOptionPane.showInputDialog("Please Enter your password"); //Allows user to enter password
	   for(int x=1; x<=3;x++){ //Allows limited trials in entry
		   if(!temppass.equalsIgnoreCase(Staffp)) { //If entry does not = Staff, then -
			   tempuser =   JOptionPane.showInputDialog("Your Password is Incorrect" + "\n" +
                                               "Please Enter your password again"); //- Allows re-entry of password
    }}
	   for (int x=1; x<=1; x++) { 
		   if(!temppass.equalsIgnoreCase(Staffp)){
			   JOptionPane.showMessageDialog(null,"Your account is now locked" + "\n" +  
                                  "Please contact your adminstrator to unlock your account!");
			   return;
    }} 
	   JOptionPane.showMessageDialog(null,"Welcome Staff!");
  }
 }
}
