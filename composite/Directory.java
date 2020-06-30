
import java.util.ArrayList;

class Directory extends DirEntry {

    private String dirName;
    private ArrayList<DirEntry> contents = new ArrayList<DirEntry>();

    public Directory(String dirName) {
        init();
        this.dirName = dirName;
    }

    private void init() {
    }

    public void addEntry(DirEntry de) {
        contents.add(de);
    }

    public boolean matches(String s) {
        if (this.dirName.contains(s)) {
            return true;
        } else {
            for (DirEntry johnnyGold: contents) {
                if (johnnyGold.matches(s)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int size() {
        int total = 0;
        for (DirEntry tommyGold: contents) {
            total += tommyGold.size(); 
        } 
        return total;
    }
}
