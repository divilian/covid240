
class File extends DirEntry {
    String filename;
    int numBytes;
    File(String filename, int numBytes) {
        this.filename = filename;
        this.numBytes = numBytes;
    }
    public boolean matches(String s) {
        return filename.contains(s);
    }
    public int size() {
        return numBytes;
    }
}
