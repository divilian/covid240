
/**
 * A <tt>Device</tt> is an entry in a directory which does <b><i>not</i></b>
 * actually represent a file. Instead it is a mount point for an external
 * device to provide I/O to the operating system.
 *
 * @author SD
 */
class Device extends DirEntry {
    String devCode;
    boolean blockDevice;

    Device(String devCode, boolean blockDevice) {
        this.devCode = devCode;
        this.blockDevice = blockDevice;
    }

    /**
     * Always returns false for a device. This is because devices inherently
     * have no filename. They have no filename because:
     * <ul>
     * <li>Filenames suck.</li>
     * <li>Nobody likes filenames.</li>
     * </ul>
     */
    public boolean matches(String s) {
        return false;
    }

    /**
     * This method does the following three things. First, it .... Second,
     * it.....
     * ^^^ that's bad style, because the first sentence doesn't stand well on
     * its own.
     */
    public int size() {
        return 0;
    }
}
