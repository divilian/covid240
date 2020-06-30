
class Device extends DirEntry {
    String devCode;
    boolean blockDevice;
    Device(String devCode, boolean blockDevice) {
        this.devCode = devCode;
        this.blockDevice = blockDevice;
    }
    public boolean matches(String s) {
        return false;
    }
    public int size() {
        return 0;
    }
}
