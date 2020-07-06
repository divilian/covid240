
abstract class DirEntry {

    /**
     * Returns true if any part of this file's name contains the String
     * passed.
     */
    abstract boolean matches(String s);
    abstract int size();
}
