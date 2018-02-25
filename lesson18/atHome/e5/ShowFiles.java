package lesson18.atHome.e5;

import java.io.File;

public class ShowFiles {
    private static void show(String anItemName) {
        File item = new File(anItemName);
        String[] fileNameList = item.list();
        if (fileNameList != null) {
            for (String itemName : item.list()) {
                boolean isFolder = isFolder(anItemName, itemName);
                if (!isFolder) {
                    System.out.println("File: " + itemName);
                } else {
                    System.out.println("\nFolder: " + "\n" + itemName + ":");
                }
                String fullPathName=anItemName + "\\" + itemName;
                show(fullPathName);
            }
        }
    }

    private static boolean isFolder(String anItemName, String itemName) {
        return new File(anItemName + "\\" + itemName).isDirectory();
    }

    public static void main(String[] args) {
        show("D:\\programming\\java\\Java Projects\\UIS\\Git\\Lessons1\\lesson18");
    }
}
