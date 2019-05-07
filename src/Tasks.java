import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Tasks {
  public void taskPrint() {
    try {
      Path filePath = Paths.get("src/Tasks.txt");
      List<String> myList = Files.readAllLines(filePath);
      if (myList.size() == 0) {
        System.out.println("\nNo todos for today! :)");
      } else {
        System.out.println();
        for (int i = 0; i < myList.size(); i++) {
          System.out.println((i + 1) + " " + myList.get(i));
        }
      }
    } catch (Exception e) {
      System.out.println("\nCannot access or read tasks.txt");
    }
  }

  public void taskAdd(String[] newTask) {
    StringBuilder inputToList = new StringBuilder();
    for (int i = 1; i < newTask.length; i++) {
      inputToList.append(newTask[i] + " ");
    }
    String resultString = inputToList.toString();

    if (!resultString.isEmpty()) {
      try {
        Path filePath = Paths.get("src/tasks.txt");
        List<String> myListOriginal = Files.readAllLines(filePath);
        myListOriginal.add(myListOriginal.size(), resultString);
        Files.write(filePath, myListOriginal);
      } catch (Exception e) {
        System.out.println("\nCannot access or read tasks.txt");
      }
    } else {
      System.out.println("\nUnable to add: no task provided");
    }
  }

}
