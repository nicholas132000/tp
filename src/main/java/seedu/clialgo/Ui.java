package seedu.clialgo;

import java.util.Scanner;

/**
 * Text UI of the application.
 */
public class Ui {

    private static final String DIVIDER = "======================================================";

    /**
     * Scanner object to read user input.
     */
    private final Scanner in;

    public Ui() {
        in = new Scanner(System.in);
    }

    /**
     * Returns user input
     *
     * @return userInput A String input by the user
     */
    public String getUserInput() {
        return in.nextLine();
    }

    /**
     * Prints a divider
     */
    public void printDivider() {
        System.out.println(DIVIDER);
    }

    /**
     * Prints the intro message when application starts
     */
    public void printWelcomeMessage() {
        printDivider();
        System.out.println("Hello! Welcome to CLIAlgo Notes!");
        printDivider();
    }

    /**
     * Prints the outro message when the application is closed
     */
    public void printExitMessage() {
        printDivider();
        System.out.println("Thank you for using CLIAlgo! Study hard!");
        printDivider();
    }

    /**
     * Prints a list of valid (available) user commands
     * To be called when userInput.equals("help")
     */
    public void printHelpPage() {
        printDivider();
        System.out.println("The available COMMAND_TYPE(s) are:");
        System.out.println("[add]: add CS2040CFile");
        System.out.println("[remove]: remove CS2040CFile");
        System.out.println("[list]: displays all CS2040CFiles");
        System.out.println("[filter]: filters CS2040CFiles by topic");
        System.out.println("[exit]: close the application");
        System.out.println("For more help on a specific command, type `help c/COMMAND_TYPE`");
        printDivider();
    }

    /**
     * Prints a message indicating successful addition of the CS2040CFile to the tagged topic in the list
     *
     * @param name the name of the CS2040CFile defined by the user
     * @param topic the CS2040C topic
     */
    public void printAddSuccess(String name, String topic) {
        assert name != null;
        assert topic != null;
        printDivider();
        System.out.println("Successfully added " + name + " into " + topic + ".");
        printDivider();
    }

    /**
     * Prints a message indicating the failure to add CS2040CFile to a topic (which does not exist in CS2040C)
     *
     * @param topic the CS2040C topic
     */
    public void printAddFail(String topic) {
        assert topic != null;
        printDivider();
        System.out.println("Unsuccessful! " + topic + " is not a topic in CS2040C.");
        System.out.println("Type 'help c/add' for assistance.");
        printDivider();
    }

    /**
     * Prints an error message indicating that a CS2040CFile of a specific name already exists.
     */
    public void printCS2040CFileExists() {
        printDivider();
        System.out.println("Unsuccessful! A CS2040CFile with that name already exists.");
        System.out.println("Type 'list' to view the list of CS2040CFiles.");
        printDivider();
    }

    /**
     * Prints the list of CS2040CFiles saved by the user
     */
    public void printListSuccess() {
        printDivider();
        System.out.println("Here are all your CS2040CFiles:");
        printDivider();
    }

    /**
     * Prints an error message if user has no saved CS2040CFiles
     */
    public void printListFail() {
        printDivider();
        System.out.println("You have no CS2040CFiles!");
        System.out.println("Type 'help c/add' for assistance on how to add a CS2040CFile.");
        printDivider();
    }

    /**
     * Prints a message indicating successful purge of a user-defined CS2040CFile
     *
     * @param name the name of the CS2040CFile defined by the user
     */
    public void printRemoveSuccess(String name) {
        assert name != null;
        printDivider();
        System.out.println("Successfully removed " + name + ".");
        printDivider();
    }

    /**
     * Prints an error message if user has not used appropriate flags/no CS2040CFiles exist of the specific name
     */
    public void printRemoveFail() {
        printDivider();
        System.out.println("Unsuccessful!");
        System.out.println("Type 'help c/remove' for assistance on how to remove a CS2040CFile.");
        printDivider();
    }

    /**
     * Prints a filtered set of CS2040CFiles user-specified by keyword and topic name
     */
    public void printFilterSuccess() {
        printDivider();
        System.out.println("Here are the filtered CS2040CFiles:");
        printDivider();
    }

    /**
     * Prints a filtered set of CS2040CFiles user-specified by keyword and topic name
     */
    public void printFilterFail() {
        printDivider();
        System.out.println("Unsuccessful!");
        System.out.println("Type 'help c/filter' for assistance.");
        printDivider();
    }

    /**
     * Prints feedback to user that filtered list is empty.
     */
    public void printFilterEmpty() {
        printDivider();
        System.out.println("The filtered list is empty!");
        printDivider();
    }

    /**
     * Prints the requirements for using the 'add' command
     * To be called when userInput.equals("help c/add")
     */
    public void printHelpAdd() {
        printDivider();
        System.out.println("This function adds a CS2040CFile and tags it to a topic.");
        System.out.println("The syntax for the 'add' command is: add n/NAME t/TOPIC.");
        System.out.println("NAME refers to the CS2040CFiles' file name.");
        System.out.println("TOPIC refers to the topic that NAME will be tagged to.");
        System.out.println("Case sensitive. NAME and TOPIC fields must be non-empty.");
        System.out.println("Invalid NAME or TOPIC will cause an error.");
        System.out.println("Valid TOPIC's are 'SORTING', 'LINKED_LIST', 'GRAPH_STRUCTURES',");
        System.out.println("'BINARY_HEAP', 'HASH_TABLE', 'GRAPH_TRAVERSAL', 'BINARY_SEARCH_TREE',");
        System.out.println("'SS_SHORTEST_PATH', 'UNION_FIND_DS' and 'MINIMUM_SPANNING_TREE'.");
        printDivider();
    }

    /**
     * Prints the requirements for using the 'remove' command
     * To be called when userInput.equals("help c/remove")
     */
    public void printHelpRemove() {
        printDivider();
        System.out.println("This function removes a CS2040CFile from the tagged topic.");
        System.out.println("The syntax for the 'remove' command is: remove n/NAME.");
        System.out.println("NAME refers to the CS2040CFiles' file name.");
        System.out.println("'n/' must be included else NAME will not be read.");
        System.out.println("Invalid NAME will cause an error.");
        printDivider();
    }

    /**
     * Prints the requirements for using the 'list' command
     * To be called when userInput.equals("help c/list")
     */
    public void printHelpList() {
        printDivider();
        System.out.println("This function lists all stored CS2040CFiles.");
        System.out.println("The syntax for the 'list' command is: list.");
        System.out.println("Command should only contain one word (i.e. no extensions).");
        printDivider();
    }

    /**
     * Prints the requirements for using the 'filter' command
     * To be called when userInput.equals("help c/filter")
     */
    public void printHelpFilter() {
        printDivider();
        System.out.println("This function filters by topic/importance and topic name.");
        System.out.println("The syntax for the 'filter' command is: filter k/KEYWORD t/TOPIC_NAME");
        System.out.println("KEYWORD has to be either 'topic' or 'importance'.");
        System.out.println("TOPIC_NAME can be any (one) of the pre-defined topics in CS2040C.");
        System.out.println("Case sensitive. KEYWORD and TOPIC_NAME fields must be non-empty.");
        System.out.println("Invalid KEYWORD and/or TOPIC_NAME will cause an error.");
        printDivider();
    }

    /**
     * Prints the requirements for using the 'exit' command
     * To be called when userInput.equals("help c/exit")
     */
    public void printHelpExit() {
        printDivider();
        System.out.println("This function exits the application.");
        System.out.println("The syntax for the 'exit' command is: exit.");
        System.out.println("Command should only contain one word (i.e. no extensions).");
        printDivider();
    }

    /**
     * Prints an error message indicating invalid user-input
     */
    public void printInvalidCommand() {
        printDivider();
        System.out.println("This is an invalid command, please ensure all your fields are correct.");
        System.out.println("Type 'help' for additional assistance.");
        printDivider();
    }

    /**
     * Close the System.in scanner
     */
    public void closeScanner() {
        this.in.close();
    }

    /**
     * Prints an error message when the user tries to remove a file whose name does not exist
     */
    public void printNameNotFoundCommand() {
        printDivider();
        System.out.println("Unsuccessful! A CS2040CFile of that name does not exist.");
        System.out.println("Only CS2040CFiles in your list can be removed.");
        System.out.println("Type 'list' to see CS2040CFiles you can remove.");
        printDivider();
    }

    /**
     * Prints an error message when saving data is unsuccessful.
     */
    public void printSaveFail() {
        printDivider();
        System.out.println("Saving data was unsuccessful. Please try again.");
        printDivider();
    }

    /**
     * Prints a message indicating the start of test mode.
     */
    public void printTestModeStart() {
        printDivider();
        System.out.println("Starting test mode.");
        printDivider();
    }

    /**
     * Prints a message indicating the end of test mode.
     */
    public void printTestModeEnd() {
        printDivider();
        System.out.println("Ending test mode.");
        printDivider();
    }

    /**
     * Prints an error message when test mode exit failed.
     */
    public void printTestModeEndFail() {
        printDivider();
        System.out.println("Unsuccessful, test mode has not been started.");
        printDivider();
    }

    /**
     * Prints an error message indicating failure to write to file.
     */
    public void printFileWriteError() {
        printDivider();
        System.out.println("File not found.");
        printDivider();
    }

    /**
     * Prints a message indicating that file is successfully recreated.
     */
    public void printFileRecreatedSuccess() {
        printDivider();
        System.out.println("File recreated.");
        System.out.println("Try again.");
        printDivider();
    }

    /**
     * Prints an error message indicating failure to create folder.
     */
    public void printFolderCreateError() {
        printDivider();
        System.out.println("Folder not created.");
        printDivider();
    }

    /**
     * Prints an error message indicating file delete success.
     */
    public void printFileDeleteSuccess() {
        printDivider();
        System.out.println("Successfully deleted file.");
        printDivider();
    }

    /**
     * Prints an error message indicating failure to delete the file.
     */
    public void printFileDeleteFail() {
        printDivider();
        System.out.println("Unsuccessful! Delete failed.");
        printDivider();
    }

    /**
     * Prints an error message indicating that CS2040CFile is invalid.
     */
    public void printInvalidCS2040CFile() {
        printDivider();
        System.out.println("Invalid CS2040CFile.");
        System.out.println("Type 'help c/add' for how to add a CS2040CFile.");
        printDivider();
    }

    /**
     * Prints an error message to inform the user that the file does not exist.
     */
    public void printFileDoesNotExist() {
        printDivider();
        System.out.println("This file does not exist.");
        System.out.println("Please add the file into the folder and try again.");
        printDivider();
    }

    /**
     * Prints the header statement when toposort is successful.
     */
    public void printTopoSortSuccess() {
        printDivider();
        System.out.println("Here are the topologically sorted CS2040CFiles:");
        printDivider();
    }

    /**
     * Prints an error message indicating that no CS2040CFiles are in CLIAlgo.
     */
    public void printNoCS2040CFilesSaved() {
        printDivider();
        System.out.println("You have no CS2040CFiles at the moment!");
        printDivider();
    }
}
