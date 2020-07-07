

class String {

    /**
     * Returns the index of the first occurence of the string passed in this
     * string.
     * Returns -1 if the string is not found.
     */
    int indexOf(String str) {

    }











class String {

    /**
     * Returns a new string which is a copy of this string, but with the
     * leading and trailing whitespace removed. Whitespace is defined as in the
     * function {@link Character.isWhitespace()}. If no leading or trailing
     * spaces are present, returns an exact copy of this String. If this String
     * consists of nothing but spaces, returns an empty String.
     */
    String trim() {

    }




































class Scanner {

    /**
     * Returns all the characters up to but not including the next newline
     * ('\n') character. However, the newline character itself is consumed and
     * read past.
     *
     *
     * If no more content exists on this Scanner, throws a
     * NoSuchElementException.
     */
    String nextLine() throws NoSuchElementException {

    }

































class Dungeon {

    /**
     * Includes an additional a room to this Dungeon, so that it can be
     * connected to, and accessed from, other rooms in the Dungeon. Adding a
     * Room to a Dungeon means that it will be persisted to disk when the
     * Dungeon itself is persisted.
     *
     * If the room passed is null, this method silently ignores it.
     *
     * If the same Room object is attempted to be added more than once to the
     * same Dungeon object, this method will silently and safely ignore the
     * duplicate attempt.
     */
    void add(Room room) {

    }





































In teams:

class Room {

    String describe(boolean full) {

    }

    Room leaveBy(String dir) {

    }

}

class GameState {

    Item getItemInVicinityNamed(String name) {

    }
}
