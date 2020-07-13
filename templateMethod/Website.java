
class User {

    protected String emailAddr;

    final public void setEmailAddress(String addr) {
        if (this.isLegalAddress(addr)) {
            this.emailAddr = addr;
        } else {
            throw new Exception("Illegal address!");
        }
        this.notify();
    }

    public boolean isLegalAddress(String addr) {
        // possibly more MCiv-style checking here
        return true;
    }
}


...


class StudentUser extends User {

    public boolean isLegalAddress(String addr) {
        if (super.isLegalAddress(addr)  &&  addr.endsWith(".edu")) {
            return true;
        } else {
            return false;
        }
    }
}
