package org.example;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        return isValidLength() && isOnlyOneSpace() && isStartsAndEndsWithoutSpaces();
    }

    public boolean isValidLength() {
        boolean validLength = false;
        int nameLength = name.length();
        if (nameLength >= 3 && nameLength <= 19) {
            validLength = true;
        }
        return validLength;
    }

    public boolean isOnlyOneSpace() {
        boolean validSpaces = false;
        int nameLength = name.length();
        if (name.contains(" ")) {
            int nameLengthWithoutSpaces = name.replace(" ", "").length();
            if (nameLengthWithoutSpaces == nameLength - 1) {
                validSpaces = true;
            }
        }
        return validSpaces;
    }

    public boolean isStartsAndEndsWithoutSpaces() {
        boolean validStartsEnds = false;
        if (name.contains(" ")) {
            validStartsEnds = !name.startsWith(" ") && !name.endsWith(" ");
        }
        return validStartsEnds;
    }
}