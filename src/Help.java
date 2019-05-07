import java.util.ArrayList;

public class Help {
  ArrayList<String> helpList;

  public void setHelpList() {
    helpList = new ArrayList<>();
    helpList.add("$ todo");
    helpList.add("Command Line Todo application");
    helpList.add("=============================");
    helpList.add("\nCommand line arguments:");
    helpList.add("-l   Lists all the tasks");
    helpList.add("-a   Adds a new task");
    helpList.add("-r   Removes an task");
    helpList.add("-c   Completes an task");
  }

  public void printHelpList() {
    for (int i = 0; i < helpList.size(); i++) {
      System.out.println(helpList.get(i));
    }
  }
}
